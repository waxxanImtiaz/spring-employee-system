/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


public class Address {
    private String address;
    private String city;
    
    public Address(String address,String city){
        this.address = address;
        this.city = city;
    }
    public void printAddress(){
        System.out.println("Address="+address);
        System.out.println("City="+city);
    }
}
