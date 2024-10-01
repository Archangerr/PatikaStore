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
}
