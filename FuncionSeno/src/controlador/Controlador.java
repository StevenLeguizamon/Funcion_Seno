package controlador;

/*
Proyecto:Función SENO con series Taylor
Version:15/02/2020/A
Autor: Johan Steven Leguizamon Mendez

*/
import java.util.Scanner;

import modelo.Modelo;
import vista.Vista;

public class Controlador {

	public static void main(String[] args) {
		 Modelo modelo = new Modelo();
	        Vista vista = new Vista();
	        Scanner sc = new Scanner(System.in);
	        /*Se crea la variable para  recibir el valor del ángulo
	        ------ el valor en decimales se debe realizar con "," ------*/
	        double angulo;
	        //Se pide el valor en grados 
	        System.out.println("Ingrese el valor de los grados");
	        angulo = sc.nextDouble();
	        //Se realiza el llamado de las clases modelo y controlador
	        double total = Modelo.serieTaylor(angulo);
	        vista.vista(total, angulo);

	}

}
