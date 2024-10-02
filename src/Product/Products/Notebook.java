package Product.Products;

import Brand.Brand;
import Product.Product;

public class Notebook extends Product {
    private double discount;
    public Notebook(int id, int price, int stock, String name,
                    Brand brand, int mem, double size, int ram,double discount) {
        super(id, price, stock, name, brand, mem, size, ram);
        this.discount=discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public void printDetails() {
        System.out.println("Notebook ID: " + this.getId());
        System.out.println("Name: " + this.getName());
        System.out.println("Brand: " + this.getBrand().getName());
        System.out.println("Price: " + this.getPrice() + " (Discount: " + discount + "%)");
        System.out.println("Storage: " + this.getMem() + " GB");
        System.out.println("Screen Size: " + this.getSize() + " inches");
        System.out.println("RAM: " + this.getRam() + " GB");
        System.out.println("---------------------------------");
    }
}
