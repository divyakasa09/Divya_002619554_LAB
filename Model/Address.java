/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author divya
 */
public class Address {
     String cstreet;
     long cAptno;
     String cCity;
     String cState;
     long cZipCode;
     
     String pstreet;
     long pAptno;
     String pCity;
     String pState;
     long pZipCode;
     
     public Address()
     {
         this.cstreet= "";
         this.cAptno = 0 ;
         this.cCity="";
         this.cState="";
         this.cZipCode= 0;
         
         
         this.pstreet= "";
         this.pAptno = 0 ;
         this.pCity="";
         this.pState="";
         this.pZipCode= 0;
         
     }

    public String getCstreet() {
        return cstreet;
    }

    public void setCstreet(String cstreet) {
        this.cstreet = cstreet;
    }

    public long getcAptno() {
        return cAptno;
    }

    public void setcAptno(long cAptno) {
        this.cAptno = cAptno;
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity;
    }

    public String getcState() {
        return cState;
    }

    public void setcState(String cState) {
        this.cState = cState;
    }

    public long getcZipCode() {
        return cZipCode;
    }

    public void setcZipCode(long cZipCode) {
        this.cZipCode = cZipCode;
    }

    public String getPstreet() {
        return pstreet;
    }

    public void setPstreet(String pstreet) {
        this.pstreet = pstreet;
    }

    public long getpAptno() {
        return pAptno;
    }

    public void setpAptno(long pAptno) {
        this.pAptno = pAptno;
    }

    public String getpCity() {
        return pCity;
    }

    public void setpCity(String pCity) {
        this.pCity = pCity;
    }

    public String getpState() {
        return pState;
    }

    public void setpState(String pState) {
        this.pState = pState;
    }

    public long getpZipCode() {
        return pZipCode;
    }

    public void setpZipCode(long pZipCode) {
        this.pZipCode = pZipCode;
    }

    
}
