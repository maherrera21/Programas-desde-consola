/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MIGUELH
 */
public class metodosSumaryRestar {
   public static void main(String[] args) throws NumberFormatException,
  		IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
                System.out.println("3. MULTIPLICACIÓN");
                System.out.println("4. DIVISIÓN");
		
		
		System.out.println(">>> QUÉ DESEA REALIZAR? ");
		int operacion = Integer.parseInt(lectura.readLine());
		switch (operacion) {
		case 1:
			sumar();
			break;
		case 2:
			restar();
			break;
                case 3:
			multiplicar();
			break;
		case 4:
			dividir();
			break;
		
		default:
			System.out.println("Eleccion Incorrecta");
		}
	}

    public static void sumar(){
        int a = 1230;
        int b = 1211;
        int suma = a + b;
        System.out.println("Suma " + suma);
    }
     public static void restar(){
        int a = 1023;
        int b = 1231;
        int resta = a - b;
        System.out.println("Suma " + resta);
    }
     public static void multiplicar(){
        int a = 1034;
        int b = 1143;
        int suma = a * b;
        System.out.println("Multiplicación " + suma);
    }
     public static void dividir(){
        int a = 123;
        int b = 11;
        int resta = a / b;
        System.out.println("División " + resta);
    }
}
