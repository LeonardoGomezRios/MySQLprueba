/**
 *
 * @author Leo G
 */

package proysena;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proysena {


    public static void main(String[] args) {
        
        //conexion a la base de datos
        String usuario="root";
        String password="Atento12+++";
        String url="jdbc:mysql://localhost:3306/prueba"; 
        
        // creacion de los objetos
        
        Connection conexion;
        Statement st;
        ResultSet rs;
        
        
        
        try {
            // Inicializar
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Proysena.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            // Consult
        
        try {
            conexion=DriverManager.getConnection(url, usuario, password);
            
            st=conexion.createStatement();
            rs=st.executeQuery("SELECT * FROM usuarios");
            rs.next();
            do{
            System.out.println(rs.getInt("id")+ " : "+ rs.getString("nomusu"));
                    }while(rs.next());
           
        } catch (SQLException ex) {
            Logger.getLogger(Proysena.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         // INSERT
        
        
        
    }
    
}
