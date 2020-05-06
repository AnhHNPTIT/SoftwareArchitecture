/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoPattern_MySystem;

import java.util.List;

/**
 *
 * @author hoang
 */
public interface ProductDao {
    public List<Product> getAllProducts();
    public Product getProduct(int id);
    public void addProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(Product product);    
}
