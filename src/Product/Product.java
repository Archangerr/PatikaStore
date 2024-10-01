package Product;
import Brand.Brand;

public abstract class Product {
    private int id;
    private int price;
    private int stock;
    private String name;
    private Brand brand;
    private int mem;
    private double size;
    private int ram ;

    public Product(int id, int price, int stock, String name, Brand brand, int mem, double size, int ram) {
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.mem = mem;
        this.size = size;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
