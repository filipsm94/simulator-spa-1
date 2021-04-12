/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.model;

import java.util.List;

/**
 *
 * @author User
 */
public interface IInstruccionSimulator {
    public String getNombre();
    
    public boolean getEstado() ;

    public void setEstado(boolean estado);

    public boolean getEstadoLineasIn();

    public void setEstadoLineasIn(boolean estadoLineasIn);

    public boolean getEstadoLineasOut(); 

    public void setEstadoLineasOut(boolean estadoLineasOut);
    
    public List<String> getPasosControl();
    
    public String getPasoControl();
    
    public void setPasoControl(String paso);
    
    public String getContenido(int tamano);
    
    public int getContenido();
    
    public void setContenido(Integer contenido);
    
    public void setContenidoString(String contenidoString);
    
     public String getContenidoString();
    
    public boolean getConvert();
    
    public void setConvert(boolean convert);
    
    public void clearValue();
}
