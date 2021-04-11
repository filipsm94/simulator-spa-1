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
    private int contenido;
    private boolean convert;
    private String contenidoString;

    public Instruccion(String nameComponent, String pasosControl) {
        this.nombre = nameComponent;
        this.estadoLineasIn = false;
        this.estadoLineasOut = false;
        this.estado = false;
        this.pasoControl = "";
        this.contenido = 0;
        List<String> pasos = new ArrayList<>();
        for(String paso: pasosControl.split(";")){
            pasos.add(paso);
        }
        this.pasosControl = pasos;
        this.convert=false;
        this.contenidoString = "";
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
    
    public String getContenido(int tamano) {
        return fillWithZerosString(Integer.toBinaryString(contenido), tamano);
    }
    public int getContenido() {
        return this.contenido;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }
    
    public static String fillWithZerosString(String binar, int tamano){
        String retorno = "";
        for(int i = binar.length();i < tamano; i++){
            retorno+="0";
        }
        return retorno.concat(binar);
    }

    @Override
    public boolean getConvert() {
        return this.convert;
    }

    @Override
    public void setConvert(boolean convert) {
        this.convert=convert;
    }

    @Override
    public void setContenidoString(String contenidoString) {
        this.contenidoString= contenidoString;
    }

    @Override
    public String getContenidoString() {
        return this.contenidoString;
    }
}
