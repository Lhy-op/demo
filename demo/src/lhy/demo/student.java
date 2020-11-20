package lhy.demo;

public class student {
    private String brand;
    private String color;
    private int price;

    public void show() {
        System.out.println("价格" + price + "品牌是" + brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 100 && price >= 0) {
            this.price = price;
        }
    }

    public void callphone(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendmessgae() {
        System.out.println("群发短信");
    }

}
