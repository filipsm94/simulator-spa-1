/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author jhogarcia
 */
public class UtilFront {
    
    public static void MI(Graphics g){
        g.setColor( Color.RED );
        
        //MAR
        g.drawString( "MAR", 40, 60 );
        g.drawRect( 40, 60, 120, 60 );
        g.drawString( "IN", 185, 100 );
        g.drawLine( 160, 100, 260, 100 );
        
        
        g.drawString( "MI", 45, 525);
        g.fillRect(45, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 50, 542);
    }
    
    public static void RI(Graphics g){
        g.setColor( Color.RED );
        // AO
        // RI
        g.drawString( "RI", 65, 525);
        g.fillRect( 65, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 70, 542);
       
    }
    
    public static void RO(Graphics g){
        g.setColor( Color.RED );
        //RAM
        g.drawString( "RAM", 40, 140 );
        g.drawRect( 40, 140, 120, 60 );
        g.drawString( "OUT", 185, 160 );
        g.drawLine( 160, 160, 260, 160 );
        
        g.drawString( "RO", 85, 525);
        g.fillRect( 85, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 90, 542);
       
    }
    
    public static void CE(Graphics g){
        g.setColor( Color.RED );
        //PC
        g.drawString( "PC", 40, 220 );
        g.drawRect( 40, 220, 120, 60 );
         g.drawString( "IN", 185, 260 );
        g.drawLine( 160, 260, 260, 260 );
        
        // CE
        g.drawString( "CE", 265, 525);
        g.fillRect( 265, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 270, 542);
    }
     
    public static void CO(Graphics g){
        g.setColor( Color.RED );
        //PC
        g.drawString( "PC", 40, 220 );
        g.drawRect( 40, 220, 120, 60 );
         g.drawString( "OUT", 185, 240 );
        g.drawLine( 160, 240, 260, 240 );
        
        // CO
        g.drawString( "CO", 285, 525);
        g.fillRect( 285, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 290, 542);
        
    }
    
    public static void II(Graphics g){
        g.setColor( Color.RED );
        //RI
        g.drawString( "REG. INST.", 40, 300 );
        g.drawRect( 40, 300, 120, 60 );
        g.drawString( "IN", 185, 340 );
        g.drawLine( 160, 340, 260, 340 );
        
        // II
        g.drawString( "II", 125, 525);
        g.fillRect( 125, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 130, 542);
    }
    
    public static void IO(Graphics g){
        g.setColor( Color.RED );
        //RI
        g.drawString( "REG. INST.", 40, 300 );
        g.drawRect( 40, 300, 120, 60 );
        g.drawString( "OUT", 185, 320 );
        g.drawLine( 160, 320, 260, 320 );
        
        g.drawString( "OI", 105, 525);
        g.fillRect( 105, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 110, 542);
    }
    
    public static void AI(Graphics g){
         g.setColor( Color.RED );
     //A
        g.drawString( "A", 380, 60 );
        g.drawRect(380, 60, 120, 60 );
        g.drawString( "IN", 305, 100 );
        g.drawLine( 280, 100, 380, 100 );
        
        // AI
        g.drawString( "AI", 145, 525);
        g.fillRect( 145, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 150, 542);
    }
    
    public static void AO(Graphics g){
        g.setColor( Color.RED );
     //A
        g.drawString( "A", 380, 60 );
        g.drawRect(380, 60, 120, 60 );
        g.drawString( "OUT", 305, 80 );
        g.drawLine( 280, 80, 380, 80 );
        
        // AO
        g.drawString( "AO", 165, 525);
        g.fillRect( 165, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 170, 542);
       
    }
    
    public static void EO(Graphics g){
        g.setColor( Color.RED );
     //ALU
        g.drawString( "ALU", 380, 140 );
        g.drawRect( 380, 140, 120, 60 );
        g.drawString( "OUT", 305, 160 );
        g.drawLine( 280, 160, 380, 160 );
        
        // SO
        g.drawString( "SO", 185, 525);
        g.fillRect( 185, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 190, 542);
    }
    
    public static void SU(Graphics g){
        g.setColor( Color.RED );        
        // SU
        g.drawString( "SU", 205, 525);
        g.drawRect( 205, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 210, 542);
       
    }
    
    public static void BI(Graphics g){
        g.setColor( Color.RED );
     //B
        g.drawString( "B", 380, 220 );
        g.drawRect( 380, 220, 120, 60 );
        g.drawString( "IN", 305, 260 );
        g.drawLine( 280, 260, 380, 260 );
        
        // BI
        g.drawString( "BI", 225, 525);
        g.fillRect( 225, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 230, 542);
        
    }
    
    public static void OI(Graphics g){
        g.setColor( Color.RED );
     //RS
        g.drawString( "RS", 380, 300 );
        g.drawRect( 380, 300, 120, 60 );
        g.drawString( "OUT", 305, 340 );
        g.drawLine( 280, 340, 380, 340 );
        
        // OI
        g.drawString( "OI", 245, 525);
        g.fillRect( 245, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 250, 542);
    }
    
    public static void J(Graphics g){
        g.setColor( Color.RED );
        // J
        g.drawString( "J", 305, 525);
        g.fillRect( 305, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 310, 542);
        
       
       
    }
    
    public static void FI(Graphics g){
        g.setColor( Color.RED );
        // FI
        g.drawString( "FI", 325, 525);
        g.fillRect( 325, 530, 15, 15 );
        g.setColor( Color.WHITE );
        g.drawString( "1", 330, 542);
       
    }
    
    public static void OUT(Graphics g, String result){
        g.setColor( Color.GREEN );
        g.setFont(new Font("TimesRoman", Font.PLAIN, 24)); 
        g.drawString( result, 430, 420 );
    }
    
      public static void pintarBase(Graphics g){
        g.setColor( Color.BLACK );
        
        //MAR
        g.drawString( "MAR", 40, 60 );
        g.drawRect( 40, 60, 120, 60 );
        //OUT MAR
        g.drawLine( 160, 80, 260, 80 );
        //IN MAR
        g.drawLine( 160, 100, 260, 100 );
        
        //RAM
        g.drawString( "RAM", 40, 140 );
        g.drawRect( 40, 140, 120, 60 );
        //OUT RAM
        g.drawLine( 160, 160, 260, 160 );
        //IN MAR
        g.drawLine( 160, 180, 260, 180 );
        
        //PC
        g.drawString( "PC", 40, 220 );
        g.drawRect( 40, 220, 120, 60 );
        //OUT PC
        g.drawLine( 160, 240, 260, 240 );
        //IN PC
        g.drawLine( 160, 260, 260, 260 );
        
        //RI
        g.drawString( "REG. INST.", 40, 300 );
        g.drawRect( 40, 300, 120, 60 );
        //OUT RI
        g.drawLine( 160, 320, 260, 320 );
        //IN RI
        g.drawLine( 160, 340, 260, 340 );
        
        //CS
        g.drawString( "UC", 40, 380 );
        g.drawRect( 40, 380, 120, 60 );
        
        
        //BUS
        g.drawRect( 260, 60, 20, 380 );
        
        //A
        g.drawString( "A", 380, 60 );
        g.drawRect(380, 60, 120, 60 );
        //OUT A
        g.drawLine( 280, 80, 380, 80 );
        //IN A
        g.drawLine( 280, 100, 380, 100 );
        
        //ALU
        g.drawString( "ALU", 380, 140 );
        g.drawRect( 380, 140, 120, 60 );
        //OUT ALU
        g.drawLine( 280, 160, 380, 160 );
        //IN ALU
        g.drawLine( 280, 180, 380, 180 );
        
        //B
        g.drawString( "B", 380, 220 );
        g.drawRect( 380, 220, 120, 60 );
        //OUT B
        g.drawLine( 280, 240, 380, 240 );
        //IN B
        g.drawLine( 280, 260, 380, 260 );
        
        //RS
        g.drawString( "RS", 380, 300 );
        g.drawRect( 380, 300, 120, 60 );
        //OUT RS
        g.drawLine( 280, 320, 380, 320 );
        //IN RS
        g.drawLine( 280, 340, 380, 340 );
        
        //DISPLAY
        g.drawString( "DISPLAY", 380, 380);
        g.drawRect( 380, 380, 120, 60 );
        
        
        
        // Control Words
        g.drawString( "Palabras de control", 40, 500);
        g.drawRect( 40, 500, 380, 120 );
        
        // MI
        g.drawString( "MI", 45, 525);
        g.drawRect( 45, 530, 15, 15 );
        g.drawString( "0", 50, 542);
        
        // RI
        g.drawString( "RI", 65, 525);
        g.drawRect( 65, 530, 15, 15 );
        g.drawString( "0", 70, 542);
        
        // RO
        g.drawString( "RO", 85, 525);
        g.drawRect( 85, 530, 15, 15 );
        g.drawString( "0", 90, 542);
        
        // OI
        g.drawString( "OI", 105, 525);
        g.drawRect( 105, 530, 15, 15 );
        g.drawString( "0", 110, 542);
        
        // II
        g.drawString( "II", 125, 525);
        g.drawRect( 125, 530, 15, 15 );
        g.drawString( "0", 130, 542);
        
        // AI
        g.drawString( "AI", 145, 525);
        g.drawRect( 145, 530, 15, 15 );
        g.drawString( "0", 150, 542);
        
        // AO
        g.drawString( "AO", 165, 525);
        g.drawRect( 165, 530, 15, 15 );
        g.drawString( "0", 170, 542);
        
        // SO
        g.drawString( "SO", 185, 525);
        g.drawRect( 185, 530, 15, 15 );
        g.drawString( "0", 190, 542);
        
        // SU
        g.drawString( "SU", 205, 525);
        g.drawRect( 205, 530, 15, 15 );
        g.drawString( "0", 210, 542);
        
        // BI
        g.drawString( "BI", 225, 525);
        g.drawRect( 225, 530, 15, 15 );
        g.drawString( "0", 230, 542);
        
        // OI
        g.drawString( "OI", 245, 525);
        g.drawRect( 245, 530, 15, 15 );
        g.drawString( "0", 250, 542);
        
        // CE
        g.drawString( "CE", 265, 525);
        g.drawRect( 265, 530, 15, 15 );
        g.drawString( "0", 270, 542);
        
        // CO
        g.drawString( "CO", 285, 525);
        g.drawRect( 285, 530, 15, 15 );
        g.drawString( "0", 290, 542);
        
        // J
        g.drawString( "J", 305, 525);
        g.drawRect( 305, 530, 15, 15 );
        g.drawString( "0", 310, 542);
        
        // FI
        g.drawString( "FI", 325, 525);
        g.drawRect( 325, 530, 15, 15 );
        g.drawString( "0", 330, 542);
        
    }
}
