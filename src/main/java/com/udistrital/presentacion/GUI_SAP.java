/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.presentacion;

import com.udistrital.logica.Core;
import com.udistrital.model.IInstruccionSimulator;
import com.udistrital.model.Simulador;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author jhogarcia
 */
public class GUI_SAP extends javax.swing.JFrame implements ChangeListener{

    /**
     * Creates new form GUI_SAP
     */
    
    public SAPModel sapModel=new SAPModel();
    
    public Simulador simulador;
    
    public GUI_SAP() {
        initComponents();
        setSize( 800, 800 );
        jSlider1.addChangeListener(this);
        this.simulador = Simulador.getInstance();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaRam = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        textAreaRam.setColumns(20);
        textAreaRam.setRows(5);
        textAreaRam.setText("LDA 15\nADD 14\nOUT\nHLT\n\n\n\n\n\n\n\n\n\n\n4\n8");
        jScrollPane1.setViewportView(textAreaRam);

        jLabel1.setText("LDA 15");

        jLabel2.setText("Ingresa Los datos ejem:");

        jSlider1.setBackground(new java.awt.Color(153, 153, 153));
        jSlider1.setForeground(new java.awt.Color(0, 0, 0));
        jSlider1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("<html>00 :<p>01 :<p>02 :<p>03 :<p>04 :<p>05 :<p>06 :<p>07 :<p>08 :<p>09 :<p>10 :<p>11 :<p>12 :<p>13 :<p>14 :<p>15 :<html>");

        jLabel4.setText("Lento");

        jLabel5.setText("Rápido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(start)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(start)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        start.setEnabled(false);
        Core.sap=this;
        Core.s=simulador;
        Core.ram=textAreaRam;
        Core core= new Core();
        
        Thread nuevoh=new Thread(core);
        nuevoh.start();
        
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
    
    
//     @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        
//        if(sapModel.isInicia()){
//           UtilFront.pintarBase(g);
//        }else{
//            paintComponents(g);
//        }
//
//    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        UtilFront.pintarBase(g, simulador);
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void paintComponents(Graphics g, boolean bool, String valor) {
        super.paintComponents(g);
        String pasoControl =sapModel.getPasoControl();
        IInstruccionSimulator inst = null;
//        
        switch(pasoControl) {
            case "MI":
//              UtilFront.MI(g);
                inst = simulador.getMAR();
                inst.setEstado(bool);
                inst.setEstadoLineasIn(bool);
                inst.setContenido(Integer.parseInt(valor));
                if(inst.getPasosControl().contains("MI")){
                    inst.setPasoControl("MI");
                }
              break;
            case "RI":
              UtilFront.RI(g);
              break;
            case "RO":
//              UtilFront.RO(g);
                inst = simulador.getRAM();
                inst.setEstado(bool);
                inst.setEstadoLineasOut(bool);
                inst.setContenido(Integer.parseInt(valor));
                if(inst.getPasosControl().contains("RO")){
                    inst.setPasoControl("RO");
                }
              break;
            case "CE":
//              UtilFront.CE(g);
                inst = simulador.getPC();
                inst.setEstado(bool);
                inst.setEstadoLineasIn(bool);
                if(inst.getPasosControl().contains("CE")){
                    inst.setPasoControl("CE");
                }
              break;
            case "CO":
//              UtilFront.CO(g);
                inst = simulador.getPC();
                inst.setEstado(bool);
                inst.setEstadoLineasOut(bool);
                if(inst.getPasosControl().contains("CO")){
                    inst.setPasoControl("CO");
                }
              break;
            case "II":
//              UtilFront.II(g);
                inst = simulador.getIR();
                inst.setEstado(bool);
                inst.setEstadoLineasIn(bool);
                if(inst.getPasosControl().contains("II")){
                    inst.setPasoControl("II");
                }
              break;
            case "IO":
                inst = simulador.getIR();
                inst.setEstado(bool);
                inst.setEstadoLineasOut(bool);
                if(inst.getPasosControl().contains("IO")){
                    inst.setPasoControl("IO");
                }
//              UtilFront.IO(g);
              break;
            case "AI":
                inst = simulador.getAC();
                inst.setEstado(bool);
                inst.setEstadoLineasIn(bool);
                if(inst.getPasosControl().contains("AI")){
                    inst.setPasoControl("AI");
                }
//              UtilFront.AI(g);
              break;
            case "AO":
                inst = simulador.getAC();
                inst.setEstado(bool);
                inst.setEstadoLineasOut(bool);
                if(inst.getPasosControl().contains("AO")){
                    inst.setPasoControl("AO");
                }
//              UtilFront.AO(g);
              break;
            case "EO":
                inst = simulador.getALU();
                inst.setEstado(bool);
                inst.setEstadoLineasOut(bool);
                if(inst.getPasosControl().contains("EO")){
                    inst.setPasoControl("EO");
                }
//              UtilFront.EO(g);
              break;
            case "SU":
                inst = simulador.getALU();
                inst.setEstado(bool);
                if(inst.getPasosControl().contains("SU")){
                    inst.setPasoControl("SU");
                }
//                UtilFront.SU(g);
              break;
            case "BI":
                inst = simulador.getB();
                inst.setEstado(bool);
                inst.setEstadoLineasIn(bool);
                if(inst.getPasosControl().contains("BI")){
                    inst.setPasoControl("BI");
                }
//              UtilFront.BI(g);
              break;
            case "OI":
                inst = simulador.getRESULT();
                inst.setEstado(bool);
                inst.setEstadoLineasOut(bool);
                if(inst.getPasosControl().contains("OI")){
                    inst.setPasoControl("OI");
                }
//              UtilFront.OI(g);
              break;
            case "J":
              UtilFront.J(g);
              break;
            case "FI":
              UtilFront.FI(g);
              break;
            case "OUT":
              UtilFront.OUT(g,sapModel.getInstruccion());
              simulador.setDisplay(sapModel.getInstruccion());
              break;
            default:
              // code block
          }
        
        UtilFront.pintarBase(g,simulador);
    }

//    @Override
//    public void paintComponents(Graphics g) {
//        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
//        UtilFront.pintarBase(g,simulador);
//        String pasoControl =sapModel.getPasoControl();
//        
//        switch(pasoControl) {
//            case "MI":
////              UtilFront.MI(g);
//              break;
//            case "RI":
////              UtilFront.RI(g);
//              break;
//            case "RO":
////              UtilFront.RO(g);
//              break;
//            case "CE":
////              UtilFront.CE(g);
//              break;
//            case "CO":
////              UtilFront.CO(g);
//                simulador.getPC().setEstado(true);
//              break;
//            case "II":
////              UtilFront.II(g);
//              break;
//            case "IO":
////              UtilFront.IO(g);
//              break;
//            case "AI":
////              UtilFront.AI(g);
//              break;
//            case "AO":
////              UtilFront.AO(g);
//              break;
//            case "EO":
////              UtilFront.EO(g);
//              break;
//            case "SU":
////              UtilFront.SU(g);
//              break;
//            case "BI":
////              UtilFront.BI(g);
//              break;
//            case "OI":
////              UtilFront.OI(g);
//              break;
//            case "J":
////              UtilFront.J(g);
//              break;
//            case "FI":
////              UtilFront.FI(g);
//              break;
//            case "OUT":
//              UtilFront.OUT(g,sapModel.getInstruccion());
//              break;
//            default:
//              // code block
//          }
//        
//    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    public javax.swing.JButton start;
    private javax.swing.JTextArea textAreaRam;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        if (!source.getValueIsAdjusting()) {
            int fps = (int)source.getValue();
            fps=fps*30;
            sapModel.setSleep(fps);

            System.out.println("com.udistrital.presentacion.GUI_SAP.stateChanged()"+ fps);
        }
    }
}
