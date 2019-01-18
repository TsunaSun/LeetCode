//用map的更优解
class Solution {
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] result = {-1, -1};
    for (int i = 0; i < nums.length; ++i) {
        if (map.containsKey(target - nums[i])) {
            result[0] = map.get(target - nums[i]);
            result[1] = i;
            break;
        }
        map.put(nums[i], i);
    }
    return result;
}
}