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
    }
    
    public static void RO(Graphics g){
        g.setColor( Color.RED );
        //RAM
        g.drawString( "RAM", 40, 140 );
        g.drawRect( 40, 140, 120, 60 );
        g.drawString( "OUT", 185, 160 );
        g.drawLine( 160, 160, 260, 160 );
       
    }
    
     public static void CE(Graphics g){
        g.setColor( Color.RED );
        //PC
        g.drawString( "PC", 40, 220 );
        g.drawRect( 40, 220, 120, 60 );
         g.drawString( "IN", 185, 260 );
        g.drawLine( 160, 260, 260, 260 );
    }
     
    public static void CO(Graphics g){
        g.setColor( Color.RED );
        //PC
        g.drawString( "PC", 40, 220 );
        g.drawRect( 40, 220, 120, 60 );
         g.drawString( "OUT", 185, 240 );
        g.drawLine( 160, 240, 260, 240 );
        
    }
    
    public static void II(Graphics g){
        g.setColor( Color.RED );
        //RI
        g.drawString( "REG. INST.", 40, 300 );
        g.drawRect( 40, 300, 120, 60 );
        g.drawString( "IN", 185, 340 );
        g.drawLine( 160, 340, 260, 340 );
    }
    
    public static void IO(Graphics g){
        g.setColor( Color.RED );
        //RI
        g.drawString( "REG. INST.", 40, 300 );
        g.drawRect( 40, 300, 120, 60 );
        g.drawString( "OUT", 185, 320 );
        g.drawLine( 160, 320, 260, 320 );
    }
    
    public static void AI(Graphics g){
         g.setColor( Color.GREEN );
     //A
        g.drawString( "A", 380, 60 );
        g.drawRect(380, 60, 120, 60 );
        g.drawString( "IN", 305, 100 );
        g.drawLine( 280, 100, 380, 100 );
    }
    
    public static void AO(Graphics g){
        g.setColor( Color.GREEN );
     //A
        g.drawString( "A", 380, 60 );
        g.drawRect(380, 60, 120, 60 );
        g.drawString( "OUT", 305, 80 );
        g.drawLine( 280, 80, 380, 80 );
       
    }
    
    public static void EO(Graphics g){
        g.setColor( Color.GREEN );
     //ALU
        g.drawString( "ALU", 380, 140 );
        g.drawRect( 380, 140, 120, 60 );
        g.drawString( "OUT", 305, 160 );
        g.drawLine( 280, 160, 380, 160 );
    }
    
    public static void BI(Graphics g){
        g.setColor( Color.GREEN );
     //B
        g.drawString( "B", 380, 220 );
        g.drawRect( 380, 220, 120, 60 );
        g.drawString( "IN", 305, 260 );
        g.drawLine( 280, 260, 380, 260 );
    }
    
    public static void OI(Graphics g){
        g.setColor( Color.GREEN );
     //RS
        g.drawString( "RS", 380, 300 );
        g.drawRect( 380, 300, 120, 60 );
        g.drawString( "OUT", 305, 340 );
        g.drawLine( 280, 340, 380, 340 );
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
    }
}
