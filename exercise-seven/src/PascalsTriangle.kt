import java.lang.IllegalArgumentException

object PascalsTriangle {

    fun computeTriangle(rows: Int): List<List<Int>> {
        if (rows < 0) {throw IllegalArgumentException("Rows can't be negative!")}
        var triangle: MutableList<List<Int>> = mutableListOf()
        var coef = 1
        for (i in 0..rows - 1) {
            var tempList: MutableList<Int> = mutableListOf()
            for (j in 0..i) {
                if (j == 0 || i == 0)
                    coef = 1
                else
                    coef = coef * (i - j + 1) / j
                tempList.add(coef)
                }
            triangle.add(tempList)
            }
        return triangle
        }
    }
