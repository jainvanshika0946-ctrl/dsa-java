import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class subSeqRecursion {
    static void main(String[] args) {
        String s = "abc";
        String p = "";
//        ArrayList<String> res = new ArrayList<>();
//        subSeq(p,s);
//        System.out.println(subSeqRet(p,s));
//        System.out.println(subSeqL(p,s,res));
        subseqAscii("", "abc");
    }

    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeqL(String p, String up, ArrayList<String> res) {
        if (up.isEmpty()) {
            res.add(p);
            return res;
        }
        char ch = up.charAt(0);
        subSeqL(p+ch, up.substring(1), res);
        subSeqL(p, up.substring(1), res);
        return res;
    }

    static ArrayList<String> subSeqRet(String p, String up) {
        if ( up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqRet(p+ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
    static ArrayList<String> subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list =  new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAscii(p+ch, up.substring(1));
        ArrayList<String> second = subseqAscii(p, up.substring(1));
        ArrayList<String> third = subseqAscii(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
    static ArrayList< Integer> subsetDup( int [] arr ) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        Arrays.sort( arr);
        int start = 0;
        int end = 0;
        for ( int i=0; i < arr.length; i++) {
            int start = 0;

            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;

            int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;
    }

}
