public class LeetCode115 {
    public static void main(String[] args) {
        System.out.println(numDistinct("rabbbit", "rabbit"));


    }

    public static int numDistinct(String s, String t) {
        if (t.isEmpty()) {
            return 1;
        }
            if(s.isEmpty()) {
                return 0;
            }
        if (s.charAt(0) == t.charAt(0)) {
            return numDistinct(s.substring(1), t.substring(1))
                    + numDistinct(s.substring(1), t);
        } else {
            return numDistinct(s.substring(1), t);
        }

    }
}
