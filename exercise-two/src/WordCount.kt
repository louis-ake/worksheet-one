object WordCount {
    fun phrase(phrase: String): Map<String, Int> {
        return toList(phrase).
                groupBy { it }.
                mapValues({ it.value.size })
    }
    fun toList(phrase: String): List<String> {
        return phrase.
                toLowerCase().replace(Regex("[^\\w']"), " ").trim().
                //split(Regex("\\s+"))
    }
}

