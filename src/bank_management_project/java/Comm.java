package bank_management_project.java;

import java.sql.*;

public class Comm {
    
    Connection c;
    Statement s;
    public Comm(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Hanumanth");
            s = c.createStatement();
            
        }
        catch(Exception e){
                    System.out.println(e);
                    }
        }
    }
    

