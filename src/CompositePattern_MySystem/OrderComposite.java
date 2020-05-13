/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern_MySystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang
 */
public class OrderComposite implements ProductComponent{

    private List<ProductComponent> products = new ArrayList<>();

    public OrderComposite(List<ProductComponent> products) {
        this.products = products;
    }
    
    @Override
    public void showInformation() {
        for(ProductComponent product : products){
            product.showInformation();
        }
    }

    @Override
    public double totalPrice() {
        long total = 0;
        for(ProductComponent product : products){
            total += product.totalPrice();
        }
        return total;
    }
}
