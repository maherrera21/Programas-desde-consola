/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author MIGUELH
 */
public class ConMetodos {
    
 int listado [][] = new int [4][4];
 {
        for (int i=0; i<=3; i++){
            //System.out.println("índice " + i);
            for (int j=0; j<=3; j++){
            //System.out.println("índice dos " + j);
                listado [i][j] = i*j;
                //System.out.println("Arreglo en posición " +i+ "," +j+ " = " + listado[i][j]);
                if ((i*j)%2==0){
                System.out.println("Arreglo en posición " +i+ "," +j+ " = " + listado[i][j]);
                }
            }
        }
    }
}
