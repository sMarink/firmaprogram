
package javaapplication12;

import java.sql.Connection;
import java.sql.DriverManager;

public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String adress;
    private int pid;
    
    
    
    public Employee (int ID, String FirstName, String LastName, int Age, String Adress, int Pid)
    {
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
        this.adress = Adress;
        this.pid = Pid;
 
    }

    Employee() {}
    
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public String getAdress()
    {
        return adress;
    }   
    public int getPid()
    {
        return pid;
    }

public Connection getConnection()
   {
       Connection con;

       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost/firma","root","marinko013");
           return con;
       } 
      catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
}