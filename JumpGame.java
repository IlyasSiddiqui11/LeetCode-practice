

public class JumpGame {
    public static int jump(int[] nums) {
        int boundary = 0, max_reach = 0, min_steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max_reach = Math.max(max_reach, nums[i] + i);
            if (i == boundary) {
                min_steps++;
                boundary = max_reach;
            }
        }
        return min_steps;
    }

    public static boolean canJump(int[] nums) {
        int power = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > power) {
                return false;
            }
            power = Math.max(power, i + nums[i]);
        }
        return true;
    }
}
