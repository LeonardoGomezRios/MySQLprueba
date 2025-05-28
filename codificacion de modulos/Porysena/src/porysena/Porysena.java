
/**
 *
 * @author Leo G
 */

package porysena;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Porysena {

    public static void main(String[] args) {
         
    // Delcaracion de las variables para la base de datos 
    
    String usuario="root";
    String password="Atento12+++";
    String url="jdbc:mysql://localhost:3306/prueba";
    
    // Declaracion de los objetos para la base de datos
    
    Connection conexion;
    Statement st;
    ResultSet rs;
    
    // Establecemos el Class.forName con el try-catch
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Porysena.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       // Establecemos conexion con getConnetion
        
        try {
            conexion=DriverManager.getConnection(url,usuario,password);
            
            st=conexion.createStatement();
            
            // Sentencia de Consulta 
            
            rs=st.executeQuery("SELECT * FROM usuario");
            rs.next();
             
            do {
                System.out.println(rs.getInt("usuarioID")+ " : "+ rs.getString("nombreUsuario")+ " : "+ rs.getString("correoUsuario") );            
                
            } while (rs.next());  
             
            //Sentencia INSERT para ingresar datos 
           
            st.executeUpdate("INSERT INTO USUARIO VALUES(4, "
                    + "'Maicol','asdf123','maicol@gmail.com',"
                    + "'84728712','calle 654')");
            rs=st.executeQuery("SELECT * FROM usuario");
            rs.next();
            
            
            do {
                System.out.println(rs.getInt("usuarioID")+ 
                        " : "+ rs.getString("nombreUsuario")+ 
                        " : "+ rs.getString("correoUsuario") );            
                
            } while (rs.next()); */
           
           
            //Sentencia UPDATE para actualizar datos 
           
            
            st.executeUpdate("UPDATE usuario SET nombreUsuario= 'jorge' WHERE usuarioID=4");
            rs=st.executeQuery("SELECT * FROM usuario");
            rs.next();
            
            
            do {
                System.out.println(rs.getInt("usuarioID")+ 
                        " : "+ rs.getString("nombreUsuario")+ 
                        " : "+ rs.getString("correoUsuario") );            
                
            } while (rs.next());*/
            
            // Sentencia DELETE para eliminar datos
            
            st.executeUpdate("DELETE FROM USUARIO WHERE USUARIOID=4");
            rs=st.executeQuery("SELECT * FROM usuario");
            rs.next();
            
            
            do {
                System.out.println(rs.getInt("usuarioID")+ 
                        " : "+ rs.getString("nombreUsuario")+ 
                        " : "+ rs.getString("correoUsuario") );            
                
            } while (rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Porysena.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        
        
    }
    
}
