/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Circulo;
import Logica_Negocio.Cuadrado;
import Logica_Negocio.Triangulo;

/**
 *
 * @author Santiago Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cuadrado objCuadrado= new Cuadrado(2);
        Triangulo objTriangulo= new Triangulo(2, 2);
        Circulo objCirculo= new Circulo(2);
        
        double area;
        
        area=objCuadrado.CalcularArea();
        System.out.println("El area del cuadrado es:"+"\t"+area);
        objCuadrado.DibujarFigura();
        
        area=objCirculo.CalcularArea();
        System.out.println("El area del circulo es:"+"\t"+area);
        objCirculo.DibujarFigura();
        
        area=objTriangulo.CalcularArea();
        System.out.println("El area del triangulo es:"+"\t"+area);
        objTriangulo.DibujarFigura();
        
        
    }
    
}
