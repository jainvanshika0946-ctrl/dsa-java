public class operators {
    static void main(String[] args) {
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println('a'+'b');
        System.out.println((char)('a'+3));
        System.out.println("a"+1);

        StringBuilder builder= new StringBuilder();

        for (int i=0;i<26; i++) {
            char ch= (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
