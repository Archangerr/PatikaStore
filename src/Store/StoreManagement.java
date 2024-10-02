package Store;

import Brand.Brand;
import Enums.Color;
import Product.Products.Notebook;
import Product.Products.CepTelefonu;

public class StoreManagement {


    public void Start(){

        Store myStore = new Store();

        // Create and add brands to the store
        myStore.addBrand(new Brand(1, "Samsung"));
        myStore.addBrand(new Brand(2, "Lenovo"));
        myStore.addBrand(new Brand(3, "Apple"));
        myStore.addBrand(new Brand(4, "Huawei"));
        myStore.addBrand(new Brand(5, "Casper"));
        myStore.addBrand(new Brand(6, "Asus"));
        myStore.addBrand(new Brand(7, "HP"));
        myStore.addBrand(new Brand(8, "Xiaomi"));
        myStore.addBrand(new Brand(9, "Monster"));

        myStore.addNotebook(new Notebook(1,7000,1,"Huwai Matebook 14",myStore.getBrandList().get(3),512,14.0,16,1.2));
        myStore.addNotebook(new Notebook(2, 6000, 5, "Lenovo ThinkPad X1", myStore.getBrandList().get(1), 256, 14.0, 8, 1.4));
        myStore.addNotebook(new Notebook(3, 12000, 15, "Apple MacBook Pro", myStore.getBrandList().get(2), 1024, 13.3, 16, 1.3));
        myStore.addNotebook(new Notebook(4, 5000, 8, "Asus ZenBook 13", myStore.getBrandList().get(5), 512, 13.0, 8, 1.1));


        // Create and add phones to the store
        myStore.addCepTelefonu(new CepTelefonu(1, 1500, 50, "Samsung Galaxy S21", myStore.getBrandList().get(0), 128, 6.2, 8, 4000, Color.KIRMIZI));
        myStore.addCepTelefonu(new CepTelefonu(2, 2000, 30, "Apple iPhone 12", myStore.getBrandList().get(2), 64, 6.1, 6, 2800, Color.KIRMIZI));
        myStore.addCepTelefonu(new CepTelefonu(3, 1200, 20, "Huawei P40 Lite", myStore.getBrandList().get(3), 128, 6.4, 6, 4200, Color.MAVI));
        myStore.addCepTelefonu(new CepTelefonu(4, 1000, 10, "Xiaomi Redmi Note 10", myStore.getBrandList().get(7), 64, 6.5, 4, 5000, Color.SIYAH));

        // Print all the brands
        //myStore.printBrands();
        //myStore.printNoteBook();
        myStore.printPhones();
    }
}
