package lhy.demo;

public class demo1 {
    public static void main(String[] args) {
        int a;
        int[] num1 = new int[] {30, 40, 50, 20, 60};
        for (int i = 0; i < num1.length / 2; i++) {
            a = num1[i];
            num1[i] = num1[num1.length - 1- i];
            num1[num1.length - 1 - i] = a;
        }

        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }


    }
}


