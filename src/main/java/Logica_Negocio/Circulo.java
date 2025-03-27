/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Circulo implements Figura{
    
    public double radio;

    public Circulo() {
    }
    

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {
        double area= (Math.PI)*(Math.pow(radio, 2));
        return area;
    }

    @Override
    public void DibujarFigura() {
        
        System.out.println(" *  *");
        System.out.println("*    *");
        System.out.println("*    *");
        System.out.println(" *  *");
       
    }
    
    
    
}
