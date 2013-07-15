/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author MIGUELH
 */
public class Arreglos {
 public static void main(String[] args) {
        // TODO code application logic here
       int listado [][] = new int [3][3];
        for (int i=0; i<=2; i++){
            //System.out.println("índice " + i);
            for (int j=0; j<=2; j++){
            //System.out.println("índice dos " + j);
                listado [i][j] = i+j;
                System.out.println("Arreglo en posición " +i+ "," +j+ " = " + listado[i][j]);
            }
        }
        System.out.println("Suma posición 0,2: " + listado [0][2]);
        System.out.println("Suma posición 0,1: " + listado [0][1]);
        System.out.println("Suma posición 2,1: " + listado [2][1]);
        System.out.println("Suma posición 2,2: " + listado [2][2]);
    }
}
    
    
