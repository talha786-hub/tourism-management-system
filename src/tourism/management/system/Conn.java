
package tourism.management.system;

import java.sql.*;
public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///tourismmanagementsystem","root","Tshfd@786");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
            
  
        }
        }
        
         
            
        
        
        
   
    }
    

