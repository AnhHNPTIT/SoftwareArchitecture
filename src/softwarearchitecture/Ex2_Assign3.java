/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarearchitecture;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hoang
 */
public class Ex2_Assign3 {
    public abstract class Employee{
        String name;
        String id;

        public Employee(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Employee{" + "name=" + name + ", id=" + id + '}';
        }
        
        public void save() throws IOException{
            FileWriter file = new FileWriter("emp.txt");
            file.write(toString());
        }
        
        public abstract String computeCompenstation();
    }
    
    public class Consultant extends Employee{

        public Consultant(String name, String id) {
            super(name, id);
        }
        
        public String computeCompenstation(){
            return ("consultant salary is base +" + " allowance + OT - tax deductions");
        }
    }
    
    public class SalesRep extends Employee{

        public SalesRep(String name, String id) {
            super(name, id);
        }
        
        public String computeCompenstation(){
            return ("salesrep salary is base +" + " allowance + commission - tax deductions");
        }
    }
}
