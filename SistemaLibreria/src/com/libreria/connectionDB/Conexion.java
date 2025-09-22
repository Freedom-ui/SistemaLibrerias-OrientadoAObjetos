/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreria.connectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author pc
 */
public class Conexion {
    private static final String HOST = "yamanote.proxy.rlwy.net";
    private static final String PUERTO = "54171";
    private static final String DB = "railway";
    
    private static String USER = "root";
    private static String PASSWORD = "WEuXBVUziDXDsJSKUeXdFdfLuEUxcxVT";
    
    private static String URL = "";
    
    private static Connection conexion = null;
    
    public static Connection getConexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            URL = "jdbc:mysql://"+HOST+":"+PUERTO+"/"+DB;
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);   
        }catch (Exception e){
            System.out.println(e.getMessage());
        } 
        
        return conexion;
        
    }
    
    public static void cerrarConexion(){
        try{
            conexion.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main (String[]args){
        if (getConexion()!= null){
           System.out.println("Conexion exitosa");
        }
    }
    
}


