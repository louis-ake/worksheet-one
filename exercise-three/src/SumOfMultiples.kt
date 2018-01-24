object SumOfMultiples {
    fun sum(factors: Set<Int>, limit: Int): Int {
        var sum = 0
        for (i in 1..(limit - 1)) {
            for (x in factors) {
                if (i.rem(x) == 0) {
                    sum += i
                }
            }
        }
        return sum
    }
}