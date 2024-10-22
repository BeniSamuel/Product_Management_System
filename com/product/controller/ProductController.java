package controller;
import model.ProductModel;

public class ProductController {

    // handler for adding product
    public void addProduct (String name, String description, int price){
        ProductModel newProduct = new ProductModel(name, description, price);

        System.out.println("Created Product Successfully!");
    }
    // handler for view product
    public void viewProduct (){
        for (ProductModel product : ProductModel.products){
            System.out.println("Name: " + product.name+" "+ "Description: " + product.description+ " " + "price: " + product.price);
        }
    }
    // Update a product
    public void updateProduct (String oldName, String newName, String newDescription, int newPrice){
        for ( ProductModel product : ProductModel.products){
            if (product.getName() == oldName){
                product.name = newName;
                product.description = newDescription;
                product.price = newPrice;
            }
        }
    }

}
