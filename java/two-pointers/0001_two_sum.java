public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

public class Main {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sol.twoSum(nums, target)));
    }
}