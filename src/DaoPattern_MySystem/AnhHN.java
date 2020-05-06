/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoPattern_MySystem;

/**
 *
 * @author hoang
 */
public class AnhHN {
    public static void main (String[] args) {
        ProductDao productDao = new ProductDaoImp();
        
        //print all students
        System.out.println("ID Name Price");
        for(Product product: productDao.getAllProducts()){
            System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
        }
        
        //add student
        Product st = new Product(3, "May tinh Dell", 15000000);
        productDao.addProduct(st);
        
        //update student
        st = new Product(1, "Sach giao khoa", 300000);
        productDao.updateProduct(st);
        
        //delete student
        st = productDao.getProduct(2);
        productDao.deleteProduct(st);
        
        //print all students after update list
        System.out.println("ID Name Price");
        for(Product product: productDao.getAllProducts()){
            System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
        }
    }    
}
