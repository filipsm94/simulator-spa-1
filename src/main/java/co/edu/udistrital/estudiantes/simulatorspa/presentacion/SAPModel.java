/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.estudiantes.simulatorspa.presentacion;

/**
 *
 * @author jhogarcia
 */
public class SAPModel {
    public boolean inicia=true;

    public String instruccion;

    public boolean isInicia() {
        return inicia;
    }

    public void setInicia(boolean inicia) {
        this.inicia = inicia;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }
    
    
}
