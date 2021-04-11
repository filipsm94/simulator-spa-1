/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.logica;

import com.udistrital.model.Simulador;
import com.udistrital.presentacion.GUI_SAP;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author jhogarcia
 */
public class Core implements Runnable {

    private int counter = 0;
    
    public static GUI_SAP sap;
    public static Simulador s; 
    public static JTextArea ram;
    
    public static void logica(){
        int A=0;
        boolean flag=false;
        HashMap<String,List<String>> palabrasControl = UtilCore.iniciarPalabrasControl();
        s.resetValues();
        String[] memory = cargarRam();
        System.out.println("Ram en binarios" + Arrays.asList(s.getBinRAM()));

        
        int i=0;
        while(i<memory.length){
            s.getPC().setContenido(i+1);
            if(memory[i]!=null){
                if(memory[i].equals("HLT")){
//                    pintarPaso(palabrasControl, memory[i],sap);
                    break;
                }
                String[] paso = memory[i].split(" ");
                s.setUserControl(paso[0]);
                
                if(paso.length>1){
                    System.out.println("paso "+ paso[0] +" "+paso[1]+" i:"+i);
                    pintarPaso(palabrasControl,paso);
                    
                    if((flag && paso[0].equals("JC")) || paso[0].equals("JMP")){
                        i=Integer.parseInt(paso[1]);
                    }else{
                        A=pasoInst(paso[0],Integer.parseInt(paso[1]),memory,A);
                        if(paso[0].equals("SUB")){
                            flag = A>=0;
                        }
                        
                        i++;
                    }                    
                }else{
                    System.out.println("paso "+ paso[0] +" i:"+i);
                    if(paso[0].equals("OUT")){
                        pintarPaso(palabrasControl,paso);
                    }
                    A=pasoInst(paso[0],0,memory,A);
                    i++;
                }
            }else{
                i++;
            }
        }
        sap.repaint();
        System.out.println("TERMINO PROGRAMA "+ A);
    }
    
    
    
    public static String[] cargarRam(){
        String memory[] = ram.getText().split("\\r?\\n");
        String memoryBin[] = ram.getText().split("\\r?\\n");
        Constans constant = new Constans();
        
        for (int i = 0; i < memory.length; i++) {
            if(memory[i].equals("")){
                memory[i] = "null";
                memoryBin[i] = constant.NOP + constant.NOP;
            }else {
                String[] instruccion = memory[i].split(" ");
                switch(instruccion[0]) {                    
                    case "NOP":                    
                        memoryBin[i] = constant.LDA + UtilCore.fillWithZerosString(Integer.toBinaryString(new Integer(instruccion[1])), 4);
                        break;
                    case "LDA":
                        memoryBin[i] = constant.LDA + UtilCore.fillWithZerosString(Integer.toBinaryString(new Integer(instruccion[1])), 4);
                        break;
                    case "ADD":
                        memoryBin[i] = constant.ADD + UtilCore.fillWithZerosString(Integer.toBinaryString(new Integer(instruccion[1])), 4);
                        break;
                    case "SUB":
                        memoryBin[i] = constant.SUB + UtilCore.fillWithZerosString(Integer.toBinaryString(new Integer(instruccion[1])), 4);
                        break;
                    case "STA":
                        memoryBin[i] = constant.STA + UtilCore.fillWithZerosString(Integer.toBinaryString(new Integer(instruccion[1])), 4);
                        break;
                    case "OUT":
                        memoryBin[i] = constant.OUT + constant.NOP;
                        break;
                    case "HLT":
                        memoryBin[i] = constant.HLT + constant.NOP;
                        break;                 
                    default:
                        memoryBin[i] = constant.NOP + UtilCore.fillWithZerosString(Integer.toBinaryString(new Integer(instruccion[0])), 4);
              }
            }
        }
        s.setBinRAM(memoryBin);
        return memory;                 
    }
    
    public static int pasoInst(String instruccion, int value,String[] memory, int A){
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
              sap.paintComponents(sap.getGraphics(),true,""+A);
              break;
            case "HLT":
              break;
            default:
              // code block
          }

        return A;
    }
    
    
    public static void pintarPaso(HashMap<String,List<String>> palabrasControl,String[] instruccion){
        List<String> pasoViewFetch=palabrasControl.get("FETCH");
        List<String> pasoView= palabrasControl.get(instruccion[0]);
        System.out.println("Instruccion : "+instruccion[0]);
        sap.sapModel.setInicia(false);
        for(String paso: pasoViewFetch){
            for(String inst : paso.split(";")){
                System.out.println("itera : "+inst);
                
                sap.sapModel.setPasoControl(inst);
                String instruct = "0";
                if(instruccion.length > 1) instruct = instruccion[1];
                sap.paintComponents(sap.getGraphics(),true,instruct);
                try {
                    Thread.sleep(sap.sapModel.getSleep());
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
                }
                sap.paintComponents(sap.getGraphics(),false,instruct);
            }
            sap.sapModel.setReloj(sap.sapModel.getReloj()+1);
            System.out.println("CICLO DE RELOJ"+(sap.sapModel.getReloj()));
        }
        for(String paso: pasoView){
            for(String inst : paso.split(";")){
                System.out.println("itera : "+inst);
                
                sap.sapModel.setPasoControl(inst);
                
                String instruct = "0";
                if(instruccion.length > 1) instruct = instruccion[1];
                
                sap.paintComponents(sap.getGraphics(),true,instruct);
                try {
                    Thread.sleep(sap.sapModel.getSleep());
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
                }
                sap.paintComponents(sap.getGraphics(),false,instruct);
            }
            sap.sapModel.setReloj(sap.sapModel.getReloj()+1);
            System.out.println("CICLO DE RELOJ"+(sap.sapModel.getReloj()));
        }
    }

    @Override
    public void run() {
        logica();
        sap.start.setEnabled(true);
    }
    
}
