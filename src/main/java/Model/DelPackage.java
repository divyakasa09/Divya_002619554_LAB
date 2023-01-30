/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class DelPackage {
    int packageID;
    double packageWeight;
    Customer customer;
    
    
    ArrayList<Product> productList;
    
    public DelPackage()
            
    {
        this.packageID = 0;
        this.packageWeight =0;
        this.customer=new Customer();
        //this.product=new Product();
        this.productList = new ArrayList<Product>();        
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
    public Product createProduct (int productid, String prodName, double prodPrice)
    {
        Product product = new Product();
        product.setProdId(productid);
        product.setProdName(prodName);
        product.setProdPrice(prodPrice);
        
        this.productList.add(product);
                
                return product;
    }
    
    public Product findProduct(int pid)
    {
        for(Product prod:this.productList)
        {
            if(prod.getProdId()== pid)
            {
                return prod;
            }
        }
        return null;
    }
            
    
}
