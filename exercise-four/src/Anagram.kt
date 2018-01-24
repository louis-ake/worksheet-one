class Anagram(private val word: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        var result: MutableSet<String> = mutableSetOf()
        var wrd = word.toLowerCase().toCharArray().sortedArray()
        for (item in anagrams) {
            var itm = item.toLowerCase().toCharArray().sortedArray()
            if (word.toLowerCase() == (item.toLowerCase())) { break }
            if (wrd.contentEquals(itm)) { result.add(item) }
        }
    return result
    }
}