import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }

    /**
     * 461. 汉明距离
     */
    public static int hammingDistance(int x, int y) {
        int result = (x ^ y);
        int nums = 0;
        while (result != 0) {
            nums += result & 1;
            result = result >> 1;
        }
        return nums;
    }

    /**
     * 1. 两数之和
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
