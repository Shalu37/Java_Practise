public class TwoSum {
    // Brute Force: O(n^2) time, O(1) space
    public static int[] twoSumBrute(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int arr [] = {2,4,22,7,18};
        int target = 9; 


        int[] result = twoSumBrute(arr, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);
        } else {
            System.out.println("No pair found");
        }
        
    }
    
}
