class Filter {
    static List<String> filterLongerThan(List<String> xs, int maxLen) {
        List<String> results = []
        results = xs.findAll { s -> s.length() <= maxLen }
        return results;
    }
    public static void main(String[] args) {
        List<String> names = ["Giulio", "Laura", "Mario", "Anna"]
        println(names)
        List<String> shortNames = filterLongerThan(names, 5)
        println("After filtering: " + shortNames.size())
        shortNames.each { println(it) }
    }
}