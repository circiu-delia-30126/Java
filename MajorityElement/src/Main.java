import java.util.Scanner;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++; //
                }
            }

            if (count > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numărul de elemente din array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Introduceți elementele array-ului:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.majorityElement(nums);

        if (result != -1) {
            System.out.println("Elementul majoritar este: " + result);
        } else {
            System.out.println("Nu există un element majoritar.");
        }
    }
}
