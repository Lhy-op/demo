package leetcode;

public class String_to_Integer {
    public static void main(String[] args) {
        String s = "  -      123asd123";
        System.out.println(string_to_integer(s));
    }

    public static int string_to_integer(String s) {
        char[] chararray = s.toCharArray();
        int j = 0;

        //第一个数字的下标
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(chararray[i])) {
                j = i;
                break;
            }
        }
        //判断有没有负号
        String a = "";
        for (int i = 0; i < j; i++) {
            if (chararray[i] == '-') {
                a = a + '-';
            }
        }

        //判断第一个字符是不是数字
        for (int i = 0; i < j; i++) {
            if (chararray[i] == ' ') {
                continue;
            }
            if (chararray[i] == '-') {
                continue;
            } else {
                return 0;
            }
        }

        //判断后续字符中有没有非数字
        for (int i = j + 1; i < s.length(); i++) {
            if (Character.isDigit(chararray[i])) {
                continue;
            } else {
                a = a + s.substring(j, i);
                return Integer.valueOf(a);
            }
        }

        a = a + s.substring(j, s.length());
        return Integer.valueOf(a);
    }

}


