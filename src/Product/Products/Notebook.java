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
}
