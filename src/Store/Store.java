package Store;

import Brand.Brand;
import Product.Products.CepTelefonu;
import Product.Products.Notebook;

import java.util.ArrayList;

public class Store {
    private ArrayList<Brand> brandList;
    private ArrayList<Notebook> notebookList;
    private ArrayList<CepTelefonu> cepTelefonuList;

    public Store(ArrayList<Brand> brandList, ArrayList<Notebook> notebookList, ArrayList<CepTelefonu> cepTelefonuList) {
        this.brandList = brandList;
        this.notebookList = notebookList;
        this.cepTelefonuList = cepTelefonuList;
    }
    public Store(){
        brandList = new ArrayList<>();
        notebookList= new ArrayList<>();
        cepTelefonuList= new ArrayList<>();

    }

    public ArrayList<Brand> getBrandList() {
        return brandList;
    }

    public ArrayList<Notebook> getNotebookList() {
        return notebookList;
    }

    public ArrayList<CepTelefonu> getCepTelefonuList() {
        return cepTelefonuList;
    }

    public void addBrand(Brand brand){
        this.brandList.add(brand);
    }

    public void addNotebook(Notebook notebook){
        this.notebookList.add(notebook);
    }

    public void addCepTelefonu(CepTelefonu ceptelefonu){
        this.cepTelefonuList.add(ceptelefonu);
    }

    public void printBrands() {
        for (Brand brand : brandList) {
            System.out.println(brand.getName());
        }
    }
    public void printNoteBook() {
        for (Notebook notebook : notebookList) {
            notebook.printDetails();
        }
    }

    public void printPhones() {
        for (CepTelefonu phone : cepTelefonuList) {
            phone.printDetails();
        }
    }
}
