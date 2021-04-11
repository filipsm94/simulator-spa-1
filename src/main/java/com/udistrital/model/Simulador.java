/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.model;

import com.udistrital.logica.UtilCore;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author User
 */
public class Simulador {
    
    private static Simulador miSimulador;

    private IInstruccionSimulator PC;
    private IInstruccionSimulator MAR;
    private IInstruccionSimulator RAM;
    private IInstruccionSimulator IR;
    private IInstruccionSimulator UC;
    private IInstruccionSimulator AC;
    private IInstruccionSimulator ALU;
    private IInstruccionSimulator B;
    private IInstruccionSimulator OUT;
    private IInstruccionSimulator RESULT;    
    
    private Simulador(){
        HashMap<String,List<String>> palabrasControl = UtilCore.iniciarPalabrasControl();
        PC = new Instruccion("PC","CE;CO;CJ");
        MAR = new Instruccion("MAR","MI");
        RAM = new Instruccion("RAM","RO");
        IR= new Instruccion("IR","II;IO");
        UC= new Instruccion("UC","");
        AC = new Instruccion("AC","AI;AO");
        ALU = new Instruccion("ALU","EO;SU");
        B = new Instruccion("B","BI;BO");
        OUT = new Instruccion("OUT","OI");
        RESULT = new Instruccion("RESULT","");
        
    }
    
    public static Simulador getInstance(){
        if(miSimulador == null){
            miSimulador = new Simulador();
        }
        return miSimulador;
    }

    public IInstruccionSimulator getPC() {
        return PC;
    }

    public void setPC(IInstruccionSimulator PC) {
        this.PC = PC;
    }

    public IInstruccionSimulator getMAR() {
        return MAR;
    }

    public void setMAR(IInstruccionSimulator MAR) {
        this.MAR = MAR;
    }

    public IInstruccionSimulator getRAM() {
        return RAM;
    }

    public void setRAM(IInstruccionSimulator RAM) {
        this.RAM = RAM;
    }

    public IInstruccionSimulator getIR() {
        return IR;
    }

    public void setIR(IInstruccionSimulator IR) {
        this.IR = IR;
    }

    public IInstruccionSimulator getUC() {
        return UC;
    }

    public void setUC(IInstruccionSimulator UC) {
        this.UC = UC;
    }

    public IInstruccionSimulator getAC() {
        return AC;
    }

    public void setAC(IInstruccionSimulator AC) {
        this.AC = AC;
    }

    public IInstruccionSimulator getALU() {
        return ALU;
    }

    public void setALU(IInstruccionSimulator ALU) {
        this.ALU = ALU;
    }

    public IInstruccionSimulator getB() {
        return B;
    }

    public void setB(IInstruccionSimulator B) {
        this.B = B;
    }

    public IInstruccionSimulator getOUT() {
        return OUT;
    }

    public void setOUT(IInstruccionSimulator OUT) {
        this.OUT = OUT;
    }

    public IInstruccionSimulator getRESULT() {
        return RESULT;
    }

    public void setRESULT(IInstruccionSimulator RESULT) {
        this.RESULT = RESULT;
    }
}
