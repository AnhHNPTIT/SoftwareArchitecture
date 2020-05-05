/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarearchitecture;

/**
 *
 * @author hoang
 */
public class Ex1_Assign3 {
    
    public interface SalaryCalculator{
        public double getSalary();
    }
    
    public class CategoryA implements SalaryCalculator{
        double baseSalary;
        double oT;
        
        @Override
        public double getSalary() {
            return (baseSalary + oT);
        }       
    }
    
    public class CategoryB implements SalaryCalculator{
        double saleAmt;
        double baseSalary;
        final static double commission = 0.02;

        public CategoryB(double saleAmt, double baseSalary) {
            this.saleAmt = saleAmt;
            this.baseSalary = baseSalary;
        }

        @Override
        public double getSalary() {
            return (baseSalary + (saleAmt * commission));
        }
    }
    
    public class Employee {
        SalaryCalculator empType;
        String name;

        public Employee(SalaryCalculator empType, String name) {
            this.empType = empType;
            this.name = name;
        }
        
        public void display(){
            System.out.println("Name = " + name);
            System.out.println("Salary = " + empType.getSalary());
        }
    }
    
    public class MainApp{
    public static void main(String[] args) {
        SalaryCalculator c = new CategoryA(10000, 200);
        Employee e = new Employee("Jennifer", c);
        e.display();
        c = new CategoryB(20000, 800);
        e = new Employee("Sania", c);
        e.display();
    }
}
}

