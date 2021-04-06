/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.presentacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jhogarcia
 */
public class SAP1 {
    
    static HashMap<String,List<String>> palabrasControl = new HashMap<String,List<String>>();
    static String[] memory= new String[16];
    static int A;
    static boolean flag=false; 
    
    public static void main(String[] args) {
        List<String> fetch = new ArrayList<>();
        fetch.add("MI;CO");
        fetch.add("RO;II;CE");
        palabrasControl.put("FETCH", fetch);
        
        List<String> lda = new ArrayList<>();
        lda.add("MI;IO");
        lda.add("RO;AI");
        lda.add("");
        palabrasControl.put("LDA", lda);
        
        List<String> add = new ArrayList<>();
        add.add("MI;IO");
        add.add("RO;BI");
        add.add("AI;EO;FI");
        palabrasControl.put("ADD", add);
        
        List<String> out = new ArrayList<>();
        out.add("AO;OI");
        out.add("");out.add("");
        out.add("");
        palabrasControl.put("OUT", add);
        
        List<String> hlt = new ArrayList();
        hlt.add("HLT");
        hlt.add("");
        hlt.add("");
        palabrasControl.put("HLT", hlt);
        
        memory2();
        
        
        
    }
    
    public static void paso(String instruccion, int value){
        List<String> pasoViewFetch=palabrasControl.get("FETCH");
        List<String> pasoView= new ArrayList<String>();
        switch(instruccion) {
            case "LDA":
              pasoView=palabrasControl.get("LDA");
              System.out.println("pintar "+ pasoViewFetch.toString() +" - "+ pasoView.toString());
              A=Integer.parseInt(memory[value]);
              break;
            case "ADD":
              pasoView=palabrasControl.get("ADD");
              System.out.println("pintar "+ pasoViewFetch.toString() +" - "+ pasoView.toString());
              A=A+Integer.parseInt(memory[value]);
              break;
            case "SUB":
              A=A-Integer.parseInt(memory[value]);
              flag = A>=0;
              break;
            case "STA":
              memory[value]=""+A;
              break;
            case "OUT":
              pasoView=palabrasControl.get("OUT");
              System.out.println("pintar "+ pasoViewFetch.toString() +" - "+ pasoView.toString());
              System.out.println("OUT "+ A);
              break;
            case "HLT":
              pasoView=palabrasControl.get("HLT");
              System.out.println("pintar "+ pasoViewFetch.toString() +" - "+ pasoView.toString());
              break;
            default:
              // code block
          }

    }
    
    
 public static void memory1(){
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
 }
 
 public static void memory2(){
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
 }
   
}
