package myproject;


import java.io.Serializable;
import java.util.Date;
import java.*;
public class Ticket implements Serializable {

    private  Date today;
    private int ID;

      private Vehicle car;
   private  Customer customer;
    
    public Ticket(Date today, int ID, Vehicle car, Customer customer) {
        this.today = today;
        this.ID = ID;
        this.car = car;
        this.customer = customer;
    }
    
    
    
    
 

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
   
   
   
   
   
                                                                                                                                                                //issue Ticket
    public double TotalPrice(Vehicle car ,Customer c,Driver d) {
        if(!"Taxi".equals(car.getUseAs()))
            return car.getRentValue()*c.getNumbersOfRentingDays();
        else
            return car.getRentValue()*c.getNumbersOfRentingDays()+d.getSalary();
        
    }
    
      
    
    
    
    
    
    
}
