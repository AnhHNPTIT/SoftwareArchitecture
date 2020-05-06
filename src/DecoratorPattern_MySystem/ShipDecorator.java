/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern_MySystem;

/**
 *
 * @author hoang
 */
public class ShipDecorator extends EmployeeDecorator{

    public ShipDecorator(IEmployee employee) {
        super(employee);
    }

    @Override
    public void doTask() {
        // code
    }
    
    private void ship(){
        // code
    }
    
}
