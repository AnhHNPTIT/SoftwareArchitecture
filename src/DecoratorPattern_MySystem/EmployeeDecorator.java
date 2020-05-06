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
public abstract class EmployeeDecorator implements IEmployee{
    protected IEmployee employee;

    public EmployeeDecorator(IEmployee employee) {
        this.employee = employee;
    }

    public IEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(IEmployee employee) {
        this.employee = employee;
    }
}
