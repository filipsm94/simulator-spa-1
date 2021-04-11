/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.estudiantes.simulatorspa;

/**
 *
 * @author User
 */
public interface IComponentsSimulator {
    public String getNombre();
    
    public boolean getEstado() ;

    public void setEstado(boolean estado);

    public boolean getEstadoLineasIn();

    public void setEstadoLineasIn(boolean estadoLineasIn);

    public boolean getEstadoLineasOut(); 

    public void setEstadoLineasOut(boolean estadoLineasOut);
    
}
