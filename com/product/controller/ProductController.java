package controller;
import model.ProductModel;

public class ProductController {
    public void addProduct (String name, String description, int price){
        ProductModel newProduct = new ProductModel(name, description, price);

    }
}
