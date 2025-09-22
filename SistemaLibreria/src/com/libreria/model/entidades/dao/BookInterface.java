/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.libreria.model.entidades.dao;

import com.libreria.model.entidades.Book;
import java.util.List;

/**
 *
 * @author pc
 */
public interface BookInterface {
    public boolean insertar(Book obj);
    public List<Book>listar();
    public boolean actualizar (Book obj);
    public boolean eliminar (int id); 
}
