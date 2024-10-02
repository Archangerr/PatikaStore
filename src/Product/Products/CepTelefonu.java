package Product.Products;

import Brand.Brand;
import Enums.Color;
import Product.Product;

public class CepTelefonu extends Product {
    private int power;
    private Color color;
    public CepTelefonu(int id, int price, int stock, String name, Brand brand,
                       int mem, double size, int ram,int power,Color color) {
        super(id, price, stock, name, brand, mem, size, ram);
        this.power=power;
        this.color=color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void printDetails() {
        System.out.println("Phone ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Brand: " + getBrand().getName());
        System.out.println("Price: " + getPrice() + " (Stock: " + getStock() + ")");
        System.out.println("Memory: " + getMem() + " GB");
        System.out.println("Screen Size: " + getSize() + " inches");
        System.out.println("RAM: " + getRam() + " GB");
        System.out.println("Battery Power: " + power + " mAh");
        System.out.println("Color: " + color);
        System.out.println("---------------------------------");
    }
}
