/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.estudiantes.simulatorspa.view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author User
 */
public class Dibujo extends Canvas {

    public Dibujo() {
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(10, 10, 200, 200);
    }
    
    
    
}
