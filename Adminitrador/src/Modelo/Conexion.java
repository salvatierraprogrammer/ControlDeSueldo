
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    private String base="administracion";
    private String user="root";
    private String password="";
    private String url="jdbc:mysql://localhost:3306/" + base;
    private Connection con = null; //esta variable va a obtener la conexión
    public com.mysql.jdbc.Connection getConexion;
    
    public Connection getConnection(){
       try{
           Class.forName("com.mysql.jdbc.Driver"); //para cargar el driver
           con = DriverManager.getConnection(this.url, this.user, this.password);
                    //le asignamos a con el resultado de la conexión
                    
       }catch(SQLException e){
           System.err.println(e);
           
           
       
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
       }
       return con;
    }
 public com.mysql.jdbc.Connection getConexion()
    
 {
   try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return (com.mysql.jdbc.Connection) con;  
    }
    
}  
 

 
   
    

