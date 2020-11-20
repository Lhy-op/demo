package leetcode;

public class Reverse_Integer {
    public static void main(String[] args) {
        int x = -50921;
        reverseinteger(x);
    }

    public static void reverseinteger(int x) {
        String st = x + "";
        StringBuffer buffer = new StringBuffer();
        if (st.charAt(0) == '-') {
            buffer.append("-");
            for (int i = st.length() - 1; i > 0; i--) {
                buffer.append(st.charAt(i));
            }
        } else {
            for (int i = st.length() - 1; i >= 0; i--) {
                buffer.append(st.charAt(i));
            }
        }
        System.out.println(buffer.toString());
    }
}
