import java.util.List;
import java.util.ArrayList;

class Filter {
    static List<String> filterLongerThan(List<String> xs, int maxLen) {
        List<String> results = []
        for (int i=0; i < xs.size(); i++){
            String s = xs[i]
            if (s.length() <= maxLen){
                results << s
            }
        }
        return results;
    }
    public static void main(String[] args) {
        List<String> names = ["Giulio", "Laura", "Mario", "Anna"]
        System.out.println(names);
        List<String> shortNames = filterLongerThan(names, 5);
        System.out.println("After filtering: " + shortNames.size());
        for (int i=0; i < shortNames.size(); i++) {
            String s = shortNames[i];
            System.out.println(s);
        }
    }
}