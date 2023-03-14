

public class Leetcode {
    public static void main(String[] args) {
        int[] testarray = new int[]{1, 3, 6, 8, 9, 11, 23, 13, 12, 15};
        twoSum(testarray, 16);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int matched = target - nums[i];
                if (nums[j] == matched) {
                    int[] done = new int[]{i, j};
                    for (int k = 0; k < done.length; k++) {
                        System.out.print(done[k] + " ");
                    }
                }
            }
        }
        return null;
    }
}

  /*  public boolean palindromeCheck(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }

    }
}*/
