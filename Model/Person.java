/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author divya
 */
public class Person {
    String fname;
    String lname;
    long NUID;
    String collegename;
    Address address;
    Contact contact;
     
    public Person()
    {
        this.fname="";
        this.lname="";
        this.NUID= 0;
        this.collegename="";
        this.address=new Address();
        this.contact=new Contact();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public long getNUID() {
        return NUID;
    }

    public void setNUID(long NUID) {
        this.NUID = NUID;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

   
    
    
    
}
