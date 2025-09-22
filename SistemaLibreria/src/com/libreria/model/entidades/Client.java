/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreria.model.entidades;

/**
 *
 * @author pc
 */
public class Client {
    private int id;
    private String name;
    private int telephone;
    private String email;
    
    public Client(int id, String name, String email, int telephone){
        this.id = id;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }
    
    public Client(){}
    
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    
    public String getEmail(){return email;}
    public void setEmail(){this.email = email;}
    
    public int getTelephone(){return telephone;}
    public void setTelephone(){this.telephone = telephone;}
    
    @Override
    public String toString(){
        return name + " - "  + email + " - " + telephone;
    }
    
    
    
}
