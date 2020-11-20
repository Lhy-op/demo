package lhy.demo;

public class studentdemo {
    public static void main(String[] args) {
        student st = new student();
        st.setBrand("苹果");
        st.setPrice(-10);
        method(st);
    }

    public static void method(student one) {
        one.show();
    }
}