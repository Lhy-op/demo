package leetcode;

public class climbstairs {
    public static void main(String[] args) {
        System.out.println(climbstairs(4));
    }

    public static int climbstairs(int num) {
        int temp = 0;
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 2;
        } else {
            int a = 1;
            int b = 2;
            for (int i = 2; i < num; i++) {
                temp = a + b;
                a = b;
                b = temp;
                System.out.println("1");
            }
            return temp;
        }
    }
}
