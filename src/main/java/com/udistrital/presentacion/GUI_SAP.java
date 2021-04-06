/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.presentacion;

import com.udistrital.logica.Core;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author jhogarcia
 */
public class GUI_SAP extends javax.swing.JFrame {

    /**
     * Creates new form GUI_SAP
     */
    
    public SAPModel sapModel=new SAPModel();
    
    public GUI_SAP() {
        initComponents();
        setSize( 800, 800 );
        setVisible( true );
//        if(sapModel==null){
//            sapModel=new SAPModel();
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(start)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(start)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        
        Core.logica(this);
        
    }//GEN-LAST:event_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_SAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_SAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_SAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_SAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_SAP().setVisible(true);
            }
        });
    }

    
     @Override
    public void paint(Graphics g) {
        super.paint(g);
        
         System.out.println("com.udistrital.presentacion.GUI_SAP.paint() aquiiii");
        
        if(sapModel.isInicia()){
           UtilFront.pintarBase(g);
        }else{
            paintComponents(g);
        }

    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
        UtilFront.pintarBase(g);
        String instruccion=sapModel.getInstruccion();
        
        System.out.println("com.udistrital.presentacion.GUI_SAP.paintComponents()"+instruccion);
        
        switch(instruccion) {
            case "MI":
              UtilFront.MI(g);
              break;
            case "RO":
              UtilFront.RO(g);
              break;
            case "CE":
              UtilFront.CE(g);
              break;
            case "CO":
              UtilFront.CO(g);
              break;
            case "II":
              UtilFront.II(g);
              break;
            case "IO":
              UtilFront.IO(g);
              break;
            case "AI":
              UtilFront.AI(g);
              break;
            case "AO":
              UtilFront.AO(g);
              break;
            case "EO":
              UtilFront.EO(g);
              break;
            case "BI":
              UtilFront.BI(g);
              break;
            case "OI":
              UtilFront.OI(g);
              break;
            default:
              // code block
          }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}