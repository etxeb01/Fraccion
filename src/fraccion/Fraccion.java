/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraccion;

/**
 *
 * @author Etxeb
 */
public class Fraccion {

    private double numerador;
    private double denominador;

    public Fraccion(double numerador, double denominador) {
        
        if(denominador==0){
            System.err.println("Error, denominador no puede ser 0");
        }
        else{
            this.numerador = numerador;
            this.denominador = denominador;
        }
       
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }
    
    public String mostrarFraccion(){
        return numerador+"/"+denominador;
    }
    
    public Fraccion sumaFracciones(Fraccion fraccion){
        Fraccion resultado = new Fraccion(0,1);
        
        resultado.denominador = fraccion.denominador*denominador;
        resultado.numerador = fraccion.denominador*numerador + denominador*fraccion.numerador;
        
        return resultado;
    }
    
    public static void main(String[] args) {
    
        Fraccion fraccion = new Fraccion(3,6);
        
        System.out.println(fraccion.sumaFracciones(new Fraccion(9,2)).mostrarFraccion());
        
        
    }
    
}
