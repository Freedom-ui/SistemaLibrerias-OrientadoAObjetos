/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.libreria.view;
import javax.swing.*;
import com.libreria.view.panels.BookWindow;
import com.libreria.view.panels.ClientWindow;
import com.libreria.view.panels.SaleWindow;
import javax.swing.JButton;

/**
 *
 * @author pc
 */
public class MainMenu extends JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainMenu.class.getName());

    public MainMenu() {
        initComponents();
        
        btnBooks.addActionListener(e -> {
            new BookWindow().setVisible(true);
            dispose();
        });
        
        btnClients.addActionListener(e -> {
            new ClientWindow().setVisible(true);
            dispose();
        });
        
        btnSales.addActionListener(e -> {
            new SaleWindow().setVisible(true);
            dispose();
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnBooks = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnClients = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Libreria");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(550, 240));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("Gestion de Libreria"); // NOI18N
        setResizable(false);

        pnlPanel.setBackground(new java.awt.Color(51, 51, 51));

        lblTitle.setBackground(new java.awt.Color(51, 51, 51));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Gestion de Libreria");
        lblTitle.setOpaque(true);

        btnBooks.setBackground(new java.awt.Color(51, 51, 51));
        btnBooks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnBooks.setText("Libros");
        btnBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBooks.setFocusable(false);

        btnSales.setBackground(new java.awt.Color(51, 51, 51));
        btnSales.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSales.setForeground(new java.awt.Color(255, 255, 255));
        btnSales.setText("Ventas");
        btnSales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSales.setFocusable(false);

        btnClients.setBackground(new java.awt.Color(51, 51, 51));
        btnClients.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnClients.setForeground(new java.awt.Color(255, 255, 255));
        btnClients.setText("Clientes");
        btnClients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnClients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClients.setFocusable(false);

        javax.swing.GroupLayout pnlPanelLayout = new javax.swing.GroupLayout(pnlPanel);
        pnlPanel.setLayout(pnlPanelLayout);
        pnlPanelLayout.setHorizontalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(lblTitle))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(btnBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(btnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        pnlPanelLayout.setVerticalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(lblTitle)
                .addGap(68, 68, 68)
                .addComponent(btnBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooks;
    private javax.swing.JButton btnClients;
    private javax.swing.JButton btnSales;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlPanel;
    // End of variables declaration//GEN-END:variables
}
