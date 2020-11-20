package demo02;

public class person {
    private String name;
    public void show(){
        System.out.println(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public person() {
        System.out.println("无参构造函数");
    }

    public person(String name) {
        this.name = name;
        System.out.println("有参构造函数");
        System.out.println(name);
    }
    /*public void sayhello(String name) {
        System.out.println("你好" + name + "我是" + this.name);
    }*/


}
