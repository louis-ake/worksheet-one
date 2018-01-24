object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        var pfactors = mutableListOf<Int>()
        var r = int
        var x = 2
        while (x < r) {
            if (r.rem(x) == 0) {
                pfactors.add(x)
                r /= x
            }
            x++
        }
        if (r > 1) {pfactors.add(r)}
        return pfactors
    }

    fun primeFactors(long: Long): List<Long> {
        // TODO
        return listOf<Long>()
    }
}
