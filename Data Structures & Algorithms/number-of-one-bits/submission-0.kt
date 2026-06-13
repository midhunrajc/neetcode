class Solution {
    fun hammingWeight(n: Int): Int {
        var count: Int = 0
        var c = n
        while (c > 0) {
            c = c and (c-1)
            count++
        }

        return count
    }
}
