package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juans
 */
public class Conexion {
    
    public Connection getConexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb?serverTimezone=UTC", "root", "Mama1papa1_");
            System.out.println("Conexion exitosa");
            return conexion;
        }
        
        catch(SQLException e){
            System.out.println(e.toString());
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
