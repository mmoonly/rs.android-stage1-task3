package subtask2

class Combinator {

    fun factorial(number: Int): Long {
        return if (number >= 1)
            number * factorial(number - 1)
        else
            1
    }

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val a = array[0]
        val b = array[1]

        for(x in 0..b){
            if(factorial(x)*factorial(b-x) == factorial(b)/a)
                return x
        }
        return null
    }

}
