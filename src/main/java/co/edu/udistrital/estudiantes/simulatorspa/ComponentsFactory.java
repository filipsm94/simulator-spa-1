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
public class ComponentsFactory {
    
    public IComponentsSimulator getComponent(String componentName){
        if(componentName.equals("PC")){
            return new PC();
        }else if(componentName.equals("RAM")){
            return new RAM();
        }
        return new Component(componentName);
    }
    
}
