package myproject;
import java.*;
import java.util.*;
import java.io.Serializable;
import java.util.ArrayList;
import static myproject.Employee.Employees;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdelaziz
 */
public class Driver extends Person implements Serializable{
    
    
    private int  ID ;
    FileManger fm = new FileManger(); 
   private String Photo; 
   private String Exprience;
   private Date DateOfBirth;
   private  double Salary;
   
   
   
   
   String DriversFile="Drivers.bin";
   Vehicle DriverCar;
  public static ArrayList<Driver> Drivers=new ArrayList<Driver>();
  
   public Driver (){}

    public Driver(int ID, String Photo, String Exprience, Date DateOfBirth, double Salary, Vehicle DriverCar, String Name, String Gender, String Address, String PhoneNumber) {
        super(Name, Gender, Address, PhoneNumber);
        this.ID = ID;
        this.Photo = Photo;
        this.Exprience = Exprience;
        this.DateOfBirth = DateOfBirth;
        this.Salary = Salary;
        this.DriverCar = DriverCar;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDriversFile() {
        return DriversFile;
    }

    public void setDriversFile(String DriversFile) {
        this.DriversFile = DriversFile;
    }

    public Vehicle getDriverCar() {
        return DriverCar;
    }

    public void setDriverCar(Vehicle DriverCar) {
        this.DriverCar = DriverCar;
    }

    public static ArrayList<Driver> getDrivers() {
        return Drivers;
    }

    public static void setDrivers(ArrayList<Driver> Drivers) {
        Driver.Drivers = Drivers;
    }


    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
   
   
   
   
   
   public void setPhoto(String Photo) {
        this.Photo = Photo;
    }
   public void SetDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
    public void setExprience(String Exprience) {
        this.Exprience = Exprience;
    }
    public Date getDateOfBirth() {
        return this.DateOfBirth;
    }
    public String getExprience() {
        return this.Exprience;
    }
    public String getPhoto() {
        return this.Photo;
    }
    
           public boolean commitToFile() {
          return fm.write(DriversFile, Drivers);
    }

    public void loadFromFile() {
         Drivers = (ArrayList<Driver>)(Object)fm.read(DriversFile);
    }
    
    
    
public boolean AddDriver()
{   loadFromFile();
    Drivers.add(this);
   
    return commitToFile();
   
}   

   private int getDriverIndex(int id) {
        for (int i = 0; i < Drivers.size(); i++) {
            if (Drivers.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }
   
   public Driver SearchDriver(int id) {
        Driver temp = new Driver();
        loadFromFile();
        int index = getDriverIndex(id);
        if (index != -1) {
            return Drivers.get(index);
        } else {
            return temp;
        }
    }
   

    public boolean UpdateDriver() {
        loadFromFile();
        int index = getDriverIndex(this.getID());

        if (index != -1) {
            Drivers.set(index, this);

            return commitToFile();
        }

        return false;
    }

 public boolean DeleteDriver(int id) {
        loadFromFile();
        int index = getDriverIndex(id);

        if (index != -1) {
            Drivers.remove(index);

            return commitToFile();
        }

        return false;
    }

    public ArrayList<Driver> listDrivers() {
        loadFromFile();
        return Drivers;
    }
 
    @Override
   public String toString() {
        return "I'm Driver : " +this.getName() + " " + "gender : " + this.getGender()  + " " + "addres : " + this.getAddress()+ " " + "phone num : " + this.getPhoneNumber() + " " + "experience : " + this.getExprience() + " " + "DateOfBirth : " + this.getDateOfBirth() + "" +"Salary"+this.getSalary();
    }
}
