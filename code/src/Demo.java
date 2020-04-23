import java.util.HashMap;
import java.util.Map;

/**
 * @author Mrlsm
 * 例子展示
 */
public class Demo {

    private static class InstanceHolder {
        private static final Demo INSTANCE = new Demo();
    }

    public static Demo getInstance() {
        return InstanceHolder.INSTANCE;
    }

    /**
     * 461. 汉明距离
     */
    public int hammingDistance(int x, int y) {
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

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 104. 二叉树的最大深度
     */
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}