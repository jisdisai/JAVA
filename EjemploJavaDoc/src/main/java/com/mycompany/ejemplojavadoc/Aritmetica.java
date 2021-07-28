package com.mycompany.ejemplojavadoc;
/**
 * Esta clase Permite realizar operacione aritmeticas como sumar,restar, etc.
 * 
 * @author ISAI
 * @version 1.0
 * 
 */
public class Aritmetica {
    
    /**
     * Primer operanto 
     */
    
    int operandoA;
    
    /**
     * Segundo operando 
     */
    int operandoB;
    
    /**
     * Constrito vacio de la clase 
     */
    
    public Aritmetica(){
    
    }
    
    /**
     * Cosntrutor con dos argumentos 
     * @param  operandoA es el primer parametro
     * @param  operandoB es el segundo operando
     */
    public Aritmetica(int operandoA, int operandoB){
        this.operandoA= operandoA;
        this.operandoB = operandoB;
    
    }
    
    /**
     * Este metodo realiza la suma de dos operando enteros 
     * @return  int resultado  de la suma 
     */
    public int sumar(){
    
        return this.operandoA + this.operandoB;
    }
    
}
