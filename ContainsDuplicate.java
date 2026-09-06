import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] arr) {
        //Hashset is the collection that holds unique items only 
        HashSet<Integer> seen = new HashSet<>();
        //enhanced loop 
        for (int num : arr) {

            //it will check, current num already seen or not
            if (seen.contains(num)) {
                //if yes
                return true;
            }
            seen.add(num);
        }
        //if not 
        return false;
    }
}