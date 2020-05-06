/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoPattern_MySystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang
 */
public class ProductDaoImp implements ProductDao{
    // List is working as a database
    List<Product> products;
    
    public ProductDaoImp(){
        products = new ArrayList<Product>();
        Product product1 = new Product(1, "Sach giao khoa", 30000);
        products.add(product1);
        Product product2 = new Product(2, "Tivi Samsung", 120000000);
        products.add(product2);
        
    }
    
    //retrive list of students from the database
    @Override
    public List<Product> getAllProducts(){
        return products;
    }
    
    @Override
    public Product getProduct(int id) {
        return products.get(id-1);
    }
    
    @Override
    public void addProduct(Product product){
        products.add(product);
    }
    
    @Override
    public void updateProduct(Product product){
        products.get(product.getId()-1).setName(product.getName());
        products.get(product.getId()-1).setPrice(product.getPrice());
    }
    
    @Override
    public void deleteProduct(Product product){
        products.remove(product.getId()-1);
    }   
}
