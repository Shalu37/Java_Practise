public class MoveZero {

    public static void moveZeros(int[] nums) {

        int size = nums.length;

        if (size == 0 || size == 1) {
            return;
        }

        int nz = 0;
        int z = 0;

        while (nz < size) {

            if (nums[nz] != 0) {

                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;

                nz++;
                z++;

            } else {
                nz++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 4, 15, 0, 18, 0};

        moveZeros(nums);

        System.out.print("Array with all zeros at the end: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}