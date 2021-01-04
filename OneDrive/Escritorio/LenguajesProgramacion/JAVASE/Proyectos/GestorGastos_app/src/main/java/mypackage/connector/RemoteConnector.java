
package mypackage.connector;

import java.sql.Connection;
import java.sql.DriverManager;


public class RemoteConnector {

      private static String driver="com.mysql.cj.jdbc.Driver";
     
      private static String vendor="mysql";
      
     private static String server="10.0.2.30";
      
      private static String port="3306";
      
      private static String db="db_gastos";
      
      private static String params="?serverTimezone=UTC";
      
      private static String user="admin";
      
      private static String pass="admin";

      private static String url="jdbc:"+vendor+"://"+server+":"+port+"/"+db+params;

      private static Connection conexionDB=null;
      
     private RemoteConnector(){}
     

     public synchronized static Connection getRemoteConnection(){
          try {
              if(conexionDB==null || conexionDB.isClosed()){
                  //Devuelve la conexion existente
                  //Registramos el driver, creamos la clase en memoria
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
