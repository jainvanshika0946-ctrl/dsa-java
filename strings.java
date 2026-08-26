public class strings {
    static void main(String[] args) {
//        String s = "Hello World";
//        System.out.println(s.length());
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(10));
//        System.out.println(s.toUpperCase());
//        System.out.println(s.substring(6));
//
//        String m = "placement preparation";
//        System.out.println(betterCountVowels(m));
//        System.out.println(reverse("hello"));
//        countVowelConsonant("Placement preparation");
//        System.out.println(anagram("listen", "silent"));
//        System.out.println(anagram("hello","world"));
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    static String sortSentence(String s) {
        String[] arr = s.split(" ");
        int i=0;
        while(i<arr.length){    // Cycle sort
            int x = arr[i].charAt(arr[i].length()-1) - '0';
            int correct = x-1;
            if(i != correct){ // swap
                String temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
                i++;
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<arr.length;j++){
            sb.append(arr[j].substring(0,arr[j].length()-1));
            if(j!=arr.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
    static void countVowelConsonant (String p) {
        int c=0;
        int v=0;
        int s=0;
        p=p.toLowerCase();
        for ( int i=0;i<p.length();i++) {
            char ch= p.charAt(i);
            if ("aeiou".indexOf(ch)!=-1) {
                v++;
            }
            else if (ch==' ') {
                s++;
            }
            else {
                c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Spaces: " + s);
         //return new int[]{v, c, s};   // pack all three into array!


    // In main — unpack the array



    }

    static boolean anagram( String p, String q) {
        char[] arr1 = p.toCharArray();
        char[] arr2 = q.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        String sorted = new String(arr1);
        String sortedq = new String (arr2);
        return sorted.equals(sortedq);
    }

    static int betterCountVowels(String p) {
        int countt = 0;
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                countt++;
            }

        }
        return countt;
    }
    static String reverse( String m) {
        StringBuilder builder= new StringBuilder();
        for ( int i=m.length()-1;i>=0;i--) {
            char ch= m.charAt(i);
            builder.append(ch);
        }
        return builder.toString();
    }
}
//    static int countVowels(String m) {
//        int count=0;
//        for ( int i=0;i<m.length();i++) {
//
//            if (m.charAt(i)=='a' || m.charAt(i)=='e' || m.charAt(i)=='i' || m.charAt(i)=='o' || m.charAt(i)=='u' ) {
//                count++;
//            }
//
//        }
//        return count;
//    }
//}
