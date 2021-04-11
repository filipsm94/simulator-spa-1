/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Instruccion implements IInstruccionSimulator{
    
    private String nombre;
    private boolean estado;
    private List<String> pasosControl;
    private String pasoControl;
    private boolean estadoLineasIn;
    private boolean estadoLineasOut;

    public Instruccion(String nameComponent, String pasosControl) {
        this.nombre = nameComponent;
        this.estadoLineasIn = false;
        this.estadoLineasOut = false;
        this.estado = false;
        this.pasoControl = "";
        List<String> pasos = new ArrayList<>();
        for(String paso: pasosControl.split(";")){
            pasos.add(paso);
        }
        this.pasosControl = pasos;
    }
    

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean getEstado() {
        return this.estado;
    }

    @Override
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean getEstadoLineasIn() {
        return this.estadoLineasIn;
    }

    @Override
    public void setEstadoLineasIn(boolean estadoLineasIn) {
        this.estadoLineasIn = estadoLineasIn;
    }

    @Override
    public boolean getEstadoLineasOut() {
        return this.estadoLineasOut;
    }

    @Override
    public void setEstadoLineasOut(boolean estadoLineasOut) {
        this.estadoLineasOut = estadoLineasOut;
    }
    
    @Override
    public String getPasoControl() {
        return pasoControl;
    }

    @Override
    public void setPasoControl(String pasoControl) {
        this.pasoControl = pasoControl;
    }

    @Override
    public List<String> getPasosControl() {
        return pasosControl;
    }

    public void setPasosControl(List<String> pasosControl) {
        this.pasosControl = pasosControl;
    }
}
