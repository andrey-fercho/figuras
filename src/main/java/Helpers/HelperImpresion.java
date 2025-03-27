/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Circulo;
import Logica_Negocio.Cuadrado;
import Logica_Negocio.Figura;
import Logica_Negocio.Triangulo;

/**
 *
 * @author Santiago Lopez
 */
public class HelperImpresion {

    public static void ImprimirInfoFigura(Figura objfFigura) {
        double area;

        area = objfFigura.CalcularArea();
        System.out.println("El area de la figura es:" + "\t" + area);
        objfFigura.DibujarFigura();
    }

    public static void ImprimirInfoFiguraPoli(Figura objFigura) {
        double area = objFigura.CalcularArea();

        if (objFigura instanceof Cuadrado) {
            System.out.println("El area del cudrado es:" + "\t" + area);
            objFigura.DibujarFigura();
        } else if (objFigura instanceof Circulo) {
            System.out.println("El area del circulo es:" + "\t" + area);
            objFigura.DibujarFigura();

        } else if (objFigura instanceof Triangulo) {
            System.out.println("El area del triangulo es:" + "\t" + area);
            objFigura.DibujarFigura();

        }
    }
}
