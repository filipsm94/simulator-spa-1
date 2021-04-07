/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.presentacion;

/**
 *
 * @author jhogarcia
 */
public class SAPModel {
    public boolean inicia=true;

    public String instruccion;
    
    public int reloj = 0;
    
    public String pasoControl;

    public String getPasoControl() {
        return pasoControl;
    }

    public void setPasoControl(String pasoControl) {
        this.pasoControl = pasoControl;
    }

    public int getReloj() {
        return reloj;
    }

    public void setReloj(int reloj) {
        this.reloj = reloj;
    }

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
