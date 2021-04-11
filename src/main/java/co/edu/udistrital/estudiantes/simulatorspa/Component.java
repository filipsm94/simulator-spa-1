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
public class Component implements IComponentsSimulator {
    
    private String nombre;
    private boolean estado;
    private boolean estadoLineasIn;
    private boolean estadoLineasOut;

    public Component(String nameComponent) {
        this.nombre = nameComponent;
        this.estadoLineasIn = false;
        this.estadoLineasOut = false;
        this.estado = false;
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
    
   
}
