object Hexadecimal {

    fun toDecimal(s: String): Int {
        val result = s.toInt(radix = 16)
        return result
    }
}