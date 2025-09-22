
package com.libreria.model.entidades.dao;

import com.libreria.connectionDB.Conexion;
import com.libreria.model.entidades.Book;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class BookDao implements BookInterface {
    
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean insertar(Book obj) {
       boolean resp = false;
       try{
           String sql = "INSERT INTO book (title, author, price) VALUES (?, ?, ?)";
           
           ps = Conexion.getConexion().prepareStatement(sql);
           ps.setString(1, obj.getTitle());
           ps.setString(2, obj.getAuthor());
           ps.setDouble(3, obj.getPrice());
           if(ps.executeUpdate()> 0){
               resp = true;
           }
           ps.close();
           Conexion.cerrarConexion();
           
       }catch(Exception e){
           System.out.println(e.getMessage());        
       }
       return resp;
    }

    @Override
    public List<Book> listar() {
        List<Book>registros = new ArrayList<>();
        try{
            String consulta = "select * from book";
            ps = Conexion.getConexion().prepareStatement(consulta);
            rs = ps.executeQuery();
            
            while (rs.next()){
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                double price = rs.getDouble(4);
                
                registros.add(new Book(id, title, author, price));                
            }
            
            rs.close();
            ps.close();
            Conexion.cerrarConexion();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       return registros; 
    }
    @Override
    public boolean actualizar(Book obj) {
        boolean resp = false;
        try{
            String update = "update book set title =?, author = ?, price = ? where id = ?";
            ps = Conexion.getConexion().prepareStatement(update);
            ps.setString(1, obj.getTitle());
            ps.setString(2, obj.getAuthor());
            ps.setDouble(3, obj.getPrice());
            ps.setInt(4, obj.getId());
            
            if(ps.executeUpdate()> 0){
               resp = true;
            }
           
        }catch(Exception e){
           System.out.println(e.getMessage()); 
        }
        return resp;
    }

    @Override
    public boolean eliminar(int id) {
        boolean resp = false;
        
        try{
            String delete = "delete from book where id =?";
            ps = Conexion.getConexion().prepareStatement(delete);
            ps.setInt(1, id);
            if(ps.executeUpdate()> 0){
               resp = true;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resp;
    }
    
    
}
