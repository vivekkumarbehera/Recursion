/*public class LetCode583 {
    public static void main(String[] args) {
        System.out.println(minDistance("abc","mbc"));

    }
    public static int minDistance(String word1, String word2) {
         if(word1.isEmpty()){
             return 1;
         }
         if(word2.isEmpty()){
             return 0;
         }
         if(word1.charAt(0)==word2.charAt(0)){
            return  minDistance(word1.substring(1),word2.substring(1));
            minDistance(word1.substring(1),word2.substring(2));
         }


    }
}

 */
