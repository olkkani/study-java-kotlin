class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var list: MutableList<Int> = mutableListOf()

        for (item in arr){
            if (item % divisor == 0){
                list.add(item)
            }
        }
        
        if (list.size == 0) {
            return intArrayOf(-1)
        }else {
            list.sortWith(Comparator.naturalOrder())
            return list.toIntArray()
        }
        

    }
}