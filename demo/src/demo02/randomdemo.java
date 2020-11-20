package demo02;

import java.util.Random;

public class randomdemo {
    public static void main(String[] args) {
        Random ra = new Random();
        int r = ra.nextInt(10);
        System.out.println(r);
    }
}