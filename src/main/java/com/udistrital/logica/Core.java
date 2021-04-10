/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.logica;

import com.udistrital.presentacion.GUI_SAP;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jhogarcia
 */
public class Core {

    private int counter = 0;
    
    public static void logica(GUI_SAP sap){
        int A=0;
        boolean flag=false;
        HashMap<String,List<String>> palabrasControl = UtilCore.iniciarPalabrasControl();
        String[] memory=UtilCore.memory1();
        
        int i=0;
        while(i<memory.length){
            if(memory[i]!=null){
                if(memory[i].equals("HLT")){
//                    pintarPaso(palabrasControl, memory[i],sap);
                    break;
                }
                String[] paso = memory[i].split(" ");
                if(paso.length>1){
                    System.out.println("paso "+ paso[0] +" "+paso[1]+" i:"+i);
                    
                    pintarPaso(palabrasControl,paso[0],sap);
                    
                    if((flag && paso[0].equals("JC")) || paso[0].equals("JMP")){
                        i=Integer.parseInt(paso[1]);
                    }else{
                        A=pasoInst(paso[0],Integer.parseInt(paso[1]),memory,A,sap);
                        if(paso[0].equals("SUB")){
                            flag = A>=0;
                        }
                        
                        i++;
                    }                    
                }else{
                    System.out.println("paso "+ paso[0] +" i:"+i);
                    if(paso[0].equals("OUT")){
                        pintarPaso(palabrasControl,paso[0],sap);
                    }
                    A=pasoInst(paso[0],0,memory,A,sap);
                    i++;
                }
            }else{
                i++;
            }
        }
        System.out.println("TERMINO PROGRAMA "+ A);
    }
    
    public static int pasoInst(String instruccion, int value,String[] memory, int A,GUI_SAP sap){
        switch(instruccion) {
            case "LDA":
              A=Integer.parseInt(memory[value]);
                System.out.println("A: "+ A);
              break;
            case "ADD":
              A=A+Integer.parseInt(memory[value]);
              System.out.println("A: "+ A);
              break;
            case "SUB":
              A=A-Integer.parseInt(memory[value]);
              break;
            case "STA":
              memory[value]=""+A;
              break;
            case "OUT":
              System.out.println("OUT "+ A);
              sap.sapModel.setPasoControl("OUT");
              sap.sapModel.setInstruccion(A+"");
              sap.paintComponents(sap.getGraphics());
              break;
            case "HLT":
              break;
            default:
              // code block
          }

        return A;
    }
    
    
    public static void pintarPaso(HashMap<String,List<String>> palabrasControl,String instruccion,GUI_SAP sap){
        List<String> pasoViewFetch=palabrasControl.get("FETCH");
        List<String> pasoView= palabrasControl.get(instruccion);
        System.out.println("Instruccion : "+instruccion);
        sap.sapModel.setInicia(false);
        for(String paso: pasoViewFetch){
            for(String inst : paso.split(";")){
                System.out.println("itera : "+inst);
                
                sap.sapModel.setPasoControl(inst);
                sap.paintComponents(sap.getGraphics());
                try {
                    Thread.sleep(500);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            sap.sapModel.setReloj(sap.sapModel.getReloj()+1);
            System.out.println("CICLO DE RELOJ"+(sap.sapModel.getReloj()));
        }
        for(String paso: pasoView){
            for(String inst : paso.split(";")){
                System.out.println("itera : "+inst);
                
                sap.sapModel.setPasoControl(inst);
                sap.paintComponents(sap.getGraphics());
                try {
                    Thread.sleep(500);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            sap.sapModel.setReloj(sap.sapModel.getReloj()+1);
            System.out.println("CICLO DE RELOJ"+(sap.sapModel.getReloj()));
        }
    }
    
}
