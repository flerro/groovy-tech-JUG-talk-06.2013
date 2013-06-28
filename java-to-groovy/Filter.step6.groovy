class Filter {
    public static void main(String[] args) {
        List<String> names = ["Giulio", "Laura", "Mario", "Anna"]
        int maxLen = 5
        println(names)
        List<String> shortNames = names.findAll { s -> s.length() <= maxLen }
        println("After filtering: ${shortNames.size()}")
        shortNames.each { println(it) }
    }
}