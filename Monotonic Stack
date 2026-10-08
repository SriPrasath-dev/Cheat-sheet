import java.util.Scanner;

class Solution {
    public int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = stack.peek();
            }

            stack.push(nums[i]);
        }

        return answer;
    }
}
