/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author divya
 */
public class Customer {
    String custName;
    int custID;
    
    
    public Customer()
    {
      this. custName="";
      this.custID=0;
   
    
    
 }

    public String getcustName() {
        return custName;
    }

    public void setcustName(String custName) {
        this.custName = custName;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }
    
    
}
