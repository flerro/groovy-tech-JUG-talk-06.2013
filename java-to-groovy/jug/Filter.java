import java.util.List;
import java.util.ArrayList;

class Filter {
	static List<String> filterLongerThan(List<String> xs, int maxLen) {
		List<String> results = new ArrayList<String>();
		for (int i=0; i < xs.size(); i++){
			String s = xs.get(i);
			if (s.length() <= maxLen){
				results.add(s);
			}
		}
		return results;
	}
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Giulio"); names.add("Laura");
		names.add("Mario"); names.add("Anna");
		System.out.println(names);
		List<String> shortNames = filterLongerThan(names, 5);
		System.out.println("After filtering: " + shortNames.size());
		for (int i=0; i < shortNames.size(); i++) {
			String s = shortNames.get(i);
			System.out.println(s);
		}
	}
}