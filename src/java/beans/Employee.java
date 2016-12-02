
package beans;

import org.springframework.beans.factory.DisposableBean;

public class Employee  {
    private String name;
    private int id;
    private Address address;
    
    public Employee(){
        System.out.println("Employee");
    }
//    public Employee(String name,int id,Address add)
//    {
//        this.name = name;
//        this.id = id;
//        this.address = address;
//        System.out.println("Arg constructor..");
//    }
//    
//    public void printEmployeeData(){
//        System.out.println("Name:"+name);
//        System.out.println("Id:"+id);
//        address.printAddress();   
//    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    
   public void init(){
      System.out.println("Bean is going through init.");
   }
   public void destroy(){
      System.out.println("Bean will destroy now.");
   }
}
