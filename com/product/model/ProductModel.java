package model;
import java.util.ArrayList;

public class ProductModel {
    public String name;
    public String description;
    public int price;
    public static ArrayList<ProductModel> products = new ArrayList<ProductModel>();

    public ProductModel (String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
        products.add(this);
    }

    public String getName(){
        return this.name;
    }

    public String getDescription (){
        return this.description;
    }

    public int getPrice (){
        return this.price;
    }
}
