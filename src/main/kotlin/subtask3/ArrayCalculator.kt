package subtask3

import kotlin.math.absoluteValue

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        val filteredAndSortedList = itemsFromArray.filterIsInstance<Int>().sortedBy { it.absoluteValue }.reversed()

        if(filteredAndSortedList.count()>0){
            var result = 1

            if(filteredAndSortedList.count() <= numberOfItems) {
                for (x in filteredAndSortedList)
                    result *= x
                return result
            }

            for (i in 0 until numberOfItems){
                result *= filteredAndSortedList[i]
            }

            val positiveArray = filteredAndSortedList.filter { i -> i>= 0 }
            var resultOnlyPositive = 1

            for (i in 0 until numberOfItems){
                resultOnlyPositive *= positiveArray[i]
            }

            return if (resultOnlyPositive >= result){
                resultOnlyPositive
            }
            else result
        }
        return 0

    }
}
