/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement2;
import java.sql.*;
/**
 *
 * @author User
 */
public class Assignement2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{

         // Class.forName("com.mysql.jdbc.Driver");
           //Get connection to database
           Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment2","root","");
           Statement stmt = myCon.createStatement();
    
           // First Select statement of all the departements with their infos
           String sql = "SELECT DID,DNAME,DLOC FROM dept";
           ResultSet res = stmt.executeQuery(sql);
           while(res.next()){
               int DID = res.getInt("DID");
               String DNAME = res.getString("DNAME");
               String DLOC = res.getString("DLOC");
               System.out.print("DID : "+DID);
               System.out.print(", DLOC : "+DLOC);
               System.out.println(",DNAME : "+DNAME);
           }
           res.close();

           stmt.close();
           myCon.close();
       }catch(Exception e){
 e.printStackTrace(); 

       }
    }
    
}
