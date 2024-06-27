package fpoly.duyltph38444.lab1.model;

public class Food {
    private int id;
    private String name;
    private int price;
    private String address;
    private int img;

    public Food() {
    }

    public Food(String name, int price, String address, int img) {
        this.name = name;
        this.price = price;
        this.address = address;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
