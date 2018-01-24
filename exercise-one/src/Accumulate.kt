object Accumulate {
    fun <T, R> accumulate(collection: List<T>, function: (T) -> R): List<R> {
        val outlist: MutableList<R> = mutableListOf()
        for (x in collection) {outlist.add(x.let(function))}
        return outlist
    }
}