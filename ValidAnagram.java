public class ValidAnagram {


    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26]; // one slot per letter a-z
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // increase count for letter in s
            count[t.charAt(i) - 'a']--; // decrease count for letter in t
        }

        for (int c : count) {
            if (c != 0) {
                return false; // some letter didn't match up
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    
}
