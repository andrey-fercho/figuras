/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Cuadrado implements Figura {
    
    public double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        
        double area= lado*lado;
        return area;
    }

    @Override
    public void DibujarFigura() {
        
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
    }
    
    
    
}
