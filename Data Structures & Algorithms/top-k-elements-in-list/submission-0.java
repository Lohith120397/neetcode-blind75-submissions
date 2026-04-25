/*
*
* Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.

Example 1:

Input: nums = [1,2,2,3,3,3], k = 2

Output: [2,3]
Example 2:

Input: nums = [7,7], k = 1

Output: [7]
Constraints:

1 <= nums.length <= 10^4.
-1000 <= nums[i] <= 1000
1 <= k <= number of distinct elements in nums.
*
* */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //Step 1: Count Frequency
        for (int n : nums)
        {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        //Step 2: Min heap based on frequency
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> map.get(o1) - map.get(o2));

        for (int num : map.keySet())
        {
            heap.add(num);
            if (heap.size() > k)
                heap.poll();
        }

        //Step 3: Build the result
        int[] result = new int[k];
        for (int i = 0; i < k ; i++) {
            result[i] = heap.poll();
        }

        return result;
    }
}
