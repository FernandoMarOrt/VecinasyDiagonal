/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vecinas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class vecinas {

    public static void main(String[] args) {
        
        int[][] vecinas = new int[3][3];
        
        rellenarAleatorio(vecinas);
        
        imprimirMatriz(vecinas);
        
        
        
    }
    
    
    
     private static void rellenarAleatorio(int[][] vecinas) {

        Scanner teclado = new Scanner(System.in);

        Random numeroAleatorio = new Random();

        for (int i = 0; i < vecinas.length; i++) {

            for (int j = 0; j < vecinas[i].length; j++) {

                //Genero un numero aleatorio entre 0 y 20
                int nAleatorio = numeroAleatorio.nextInt(0, 10 + 1);

                vecinas[i][j] = nAleatorio;

            }

        }

    }
    
    
    private static void imprimirMatriz(int[][] vecinas) {

        for (int i = 0; i < vecinas.length; i++) {

            for (int j = 0; j < vecinas[i].length; j++) {

                System.out.print(vecinas[i][j] + " | ");

            }

            System.out.println("");

        }

    }
    
    
    private static void imprimirVecinas(int[][] vecinas) {
        
    }
    
    
    
}
