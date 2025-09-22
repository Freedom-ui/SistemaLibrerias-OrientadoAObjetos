
package com.libreria.controllers;


import com.libreria.model.entidades.Book;
import com.libreria.model.entidades.dao.BookDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class BookController {
    
    BookDao datos;
    Book book;
    DefaultTableModel modelo;
    
    
    public BookController(){
        datos = new BookDao();
        book = new Book();
    }
    
    public String insertar(String title, String author, double price ){
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);
        
        if(datos.insertar(book)){
           return "OK";
        }else{
            return "Error en el registro";
        }
   
    }
    public DefaultTableModel mostrar(){
        List<Book>lista = new ArrayList<>();
        
        lista.addAll(datos.listar());
        
        String[] title = {"Id","Title","Author","Price"};
        modelo = new DefaultTableModel(null, title);
        
        String[]registro = new String[4];
        for(Book i : lista){
            registro[0]=Integer.toString(i.getId());
            registro[1] = i.getTitle();
            registro[2] = i.getAuthor();
            registro[3] = Double.toString(i.getPrice());
            
            modelo.addRow(registro);
        }
        return modelo;
    }
    public String eliminar(int id){
        if (datos.eliminar(id)) {
            return "OK";
        }else{
            return "Ocurrio un error al eliminar";
        }
    }
    public List<Book> listar(){
        return datos.listar();
    }
    public String actualizar(Book libro){
        if(datos.actualizar(libro)){
            return "OK";
        }else{
            return "Error al actualzar";
        }
    }
    
    
    
      
      
      
    
    
    
    
}
