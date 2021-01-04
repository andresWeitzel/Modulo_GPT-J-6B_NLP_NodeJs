 
package mypackage.connector;

import java.sql.Connection;
import java.sql.DriverManager;


public class LocalConnector {
        
   
      private static String driver="com.mysql.cj.jdbc.Driver";
      
      private static String vendor="mysql";
      
      private static String server="localhost";
           
      private static String port="3306";
      
      private static String db="db_gastos";
      
      private static String params="?serverTimezone=UTC";
      
      private static String user="root";
      
      private static String pass="";
     
      private static String url="jdbc:"+vendor+"://"+server+":"+port+"/"+db+params;
    
      private static Connection conexionDB=null;
      
     private LocalConnector(){}

     public synchronized static Connection getLocalConnection(){
          try {
              if(conexionDB==null || conexionDB.isClosed()){
           
                  Class.forName(driver);
                 
                  //factorizamos la conexion
                  conexionDB=DriverManager.getConnection(url, user, pass);
                  
              }
          } catch (Exception ex) {
              ex.printStackTrace();
              
          }
      return conexionDB;
     }
      
      
      

}
