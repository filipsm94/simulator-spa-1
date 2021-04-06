/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.estudiantes.simulatorspa.logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jhogarcia
 */
public class UtilCore {
    
    public static HashMap<String,List<String>> iniciarPalabrasControl(){
        HashMap<String,List<String>> palabrasControl = new HashMap<String,List<String>>();
        
        List<String> aux = new ArrayList<>();
        
        aux.add("CO;MI");
        aux.add("RO;II;CE");
        palabrasControl.put("FETCH", aux);
        aux = new ArrayList<>();
        
        aux.add("");
        aux.add("");
        aux.add("");
        palabrasControl.put("NOP", aux);
        aux = new ArrayList<>();
        
        aux.add("IO;MI");
        aux.add("RO;AI");
        aux.add("");
        palabrasControl.put("LDA", aux);
        aux = new ArrayList<>();
        
        aux.add("IO;MI");
        aux.add("RO;BI");
        aux.add("EO;AI;FI");
        palabrasControl.put("ADD", aux);
        aux = new ArrayList<>();
        
        aux.add("IO;MI");
        aux.add("RO;BI");
        aux.add("EO;AI;SU;FI");
        palabrasControl.put("SUB", aux);
        aux = new ArrayList<>();
        
        aux.add("IO;MI");
        aux.add("AO;RI");
        aux.add("");
        palabrasControl.put("STA", aux);
        aux = new ArrayList<>();
        
        aux.add("AO;OI");
        aux.add("");
        aux.add("");
        palabrasControl.put("LDI", aux);
        aux = new ArrayList<>();
        
        aux.add("IO;J");
        aux.add("");
        aux.add("");
        palabrasControl.put("JMP", aux);
        aux = new ArrayList<>();
        
        aux.add("");
        aux.add("IO;J");
        aux.add("");
        aux.add("");
        palabrasControl.put("JC", aux);
        aux = new ArrayList<>();
        
        aux.add("");
        aux.add("IO;J");
        aux.add("");
        aux.add("");
        palabrasControl.put("JZ", aux);
        aux = new ArrayList<>();
        
        aux.add("IO;AI");
        aux.add("");
        aux.add("");
        palabrasControl.put("OUT", aux);
        aux = new ArrayList<>();
        
        aux.add("HLT");
        aux.add("");
        aux.add("");
        palabrasControl.put("HLT", aux);
        aux = new ArrayList<>();
        
        return palabrasControl;
    }
    
    
     public static String[] memory1(){
        String[] memory= new String[16];
        memory[0]="LDA 15";
        memory[1]="ADD 14";
        memory[2]="OUT";
        memory[3]="HLT";
        /*memory[4]="";
        memory[5]="";
        memory[6]="";
        memory[7]="";
        memory[8]="";
        memory[9]="";
        memory[10]="";
        memory[11]="";
        memory[12]="";
        memory[13]="";*/
        memory[14]="4";
        memory[15]="2";
        return memory;
 }
 
 public static String[] memory2(){
        String[] memory= new String[16];
        memory[0]="LDA 14";
        memory[1]="SUB 12";
        memory[2]="JC 6";
        memory[3]="LDA 13";
        memory[4]="OUT";
        memory[5]="HLT";
        memory[6]="STA 14";
        memory[7]="LDA 13";
        memory[8]="ADD 15";
        memory[9]="STA 13";
        memory[10]="JMP 0";
        //memory[11]="";
        memory[12]="1";
        memory[13]="0";
        memory[14]="3";
        memory[15]="5";
        return memory;
 }
}
