class Filter {
    public static void main(String[] args) {
        List<String> names = ["Giulio", "Laura", "Mario", "Anna"]
        println(names)
        List<String> shortNames = names.findAll { s -> s.length() <= 5 }
        println("After filtering: ${shortNames.size()}")
        shortNames.each { println(it) }
    }
}