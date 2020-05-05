/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarearchitecture;

import java.io.FileWriter;

/**
 *
 * @author hoang
 */
public class Ex2_Assign3_1 {
    public interface Employee{
        String getName();
        String getId();
        void save();
        String toString();
        String computeCompenstation();
    }
    
    public class Consultant implements Employee{
        String name;
        String id;

        public Consultant(String name, String id) {
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
            return "Consultant{" + "name=" + name + ", id=" + id + '}';
        }
        
        public void save(){
            FileWriter file = new FileWriter("emp.txt");
            file.write(toString());
        }
        
        public String computeCompenstation(){
            return ("consultant salary is base +" + " allowance + OT - tax deductions");
        }        
    }
    
    public class SalesRep implements Employee{
        String name;
        String id;

        public SalesRep(String name, String id) {
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
            return "SalesRep{" + "name=" + name + ", id=" + id + '}';
        }
        
        public void save(){
            FileWriter file = new FileWriter("emp.txt");
            file.write(toString());
        }
        
        public String computeCompenstation(){
            return ("salesrep salary is base +" + " allowance + commission - tax deductions");
        }       
    }
}
