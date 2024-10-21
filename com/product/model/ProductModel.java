package model;
import java.util.ArrayList;

public class ProductModel {
    private String name;
    private String description;
    private int price;
    static ArrayList<ProductModel> products = new ArrayList<ProductModel>();

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
