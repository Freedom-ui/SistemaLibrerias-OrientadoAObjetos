/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreria.model.entidades;

/**
 *
 * @author pc
 */
public class Sale {
    private int id;
    private Client client;
    private Book book;
    
    public Sale(int id, Client cliente){
        this.id = id;
        this.client = client;
        this.book = book;
    }
    public Sale(){}
    
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    
    public Client getClient(){return client;}
    public void setClient(){this.client = client;}
    
    public Book getBook(){return book;}
    public void setBook(){this.book = book;}
    
    @Override
    public String toString() {
        return "Venta de " + book.getTitle() + " a " + client.getName();
    }
}
