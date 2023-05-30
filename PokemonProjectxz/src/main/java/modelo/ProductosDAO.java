/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juans
 */
public class ProductosDAO {
    
    Connection conexion;
    
    public ProductosDAO(){
    
        Conexion con=new Conexion();
        conexion=con.getConexion();
    }
    
    public List<Productos> listarProductos(){
        
        PreparedStatement ps;
        ResultSet rs;
        List<Productos>lista=new ArrayList<>();
        
        
        try{
            ps=conexion.prepareStatement("SELECT id, pokemon, tipo1, tipo2, mov1, mov2, mov3, mov4, vgc, smogon FROM pokemontable");
            rs=ps.executeQuery();
            
            while(rs.next()){
                    
                int id=rs.getInt("id");
                String pokemon=rs.getString("pokemon");
                String tipo1=rs.getString("tipo1");
                String tipo2=rs.getString("tipo2");
                String mov1=rs.getString("mov1");
                String mov2=rs.getString("mov2");
                String mov3=rs.getString("mov3");
                String mov4=rs.getString("mov4");
                Double vgc=rs.getDouble("vgc");
                Double smogon=rs.getDouble("smogon");
    
                Productos producto=new Productos(id, pokemon, tipo1, tipo2, mov1, mov2, mov3, mov4, vgc, smogon);
                lista.add(producto);
            
            }
            
            return lista;
        
        
        }
        catch(SQLException e){
        
            System.out.println(e.toString());
            return null;
        }
    
    }
    
    public Productos mostrarProducto(int _id){
        
        PreparedStatement ps;
        ResultSet rs;
        Productos producto=null;
        
        
        try{
            ps=conexion.prepareStatement("SELECT id, pokemon, tipo1, tipo2, mov1, mov2, mov3, mov4, vgc, smogon FROM pokemontable WHERE id=?");
            ps.setInt(1,_id);
            rs=ps.executeQuery();
            
            while(rs.next()){
                    
                int id=rs.getInt("id");
                String pokemon=rs.getString("pokemon");
                String tipo1=rs.getString("tipo1");
                String tipo2=rs.getString("tipo2");
                String mov1=rs.getString("mov1");
                String mov2=rs.getString("mov2");
                String mov3=rs.getString("mov3");
                String mov4=rs.getString("mov4");
                Double vgc=rs.getDouble("vgc");
                Double smogon=rs.getDouble("smogon");
                
                producto=new Productos(id, pokemon, tipo1, tipo2, mov1, mov2, mov3, mov4, vgc, smogon);
                
            
            }
            
            return producto;
        
        
        }
        catch(SQLException e){
        
            System.out.println(e.toString());
            return null;
        }
    
    }
    
    public boolean insertar(Productos producto){
        
        PreparedStatement ps;       
        
        try{
            ps=conexion.prepareStatement("INSERT INTO pokemontable(id,pokemon,tipo1,tipo2,mov1,mov2,mov3,mov4,vgc,smogon) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, producto.getId());
            ps.setString(2,producto.getPokemon());
            ps.setString(3,producto.getTipo1());
            ps.setString(4,producto.getTipo2());
            ps.setString(5,producto.getMov1());
            ps.setString(6,producto.getMov2());
            ps.setString(7,producto.getMov3());
            ps.setString(8,producto.getMov4());
            ps.setDouble(9, producto.getVgc());
            ps.setDouble(10, producto.getSmogon());
            
            ps.execute();
                      
            return true;
        
        
        }
        catch(SQLException e){
        
            System.out.println(e.toString());
            return false;
        }
    
    }
    
    public boolean actualizar(Productos producto){
        
        PreparedStatement ps;       
        
        try{
            ps=conexion.prepareStatement("UPDATE pokemontable SET pokemon=?, tipo1=?, tipo2=?, mov1=?, mov2=?, mov3=?, mov4=?, vgc=?, smogon=? WHERE id=?");
            ps.setString(1,producto.getPokemon());
            ps.setString(2,producto.getTipo1());
            ps.setString(3,producto.getTipo2());
            ps.setString(4,producto.getMov1());
            ps.setString(5,producto.getMov2());
            ps.setString(6,producto.getMov3());
            ps.setString(7,producto.getMov4());
            ps.setDouble(8, producto.getVgc());
            ps.setDouble(9, producto.getSmogon());
            ps.execute();
                      
            return true;
        
        
        }
        catch(SQLException e){
        
            System.out.println(e.toString());
            return false;
        }
    
    }
    
    public boolean eliminar(int _id){
        
        PreparedStatement ps;       
        
        try{
            ps=conexion.prepareStatement("DELETE FROM pokemontable WHERE id=?");
            ps.setInt(1,_id);
            ps.execute();                   
            return true;
        
        
        }
        catch(SQLException e){
        
            System.out.println(e.toString());
            return false;
        }
    
    }
    
}
