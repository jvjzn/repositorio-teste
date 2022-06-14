/*
 12) Faça um programa, em Java, que preencha uma matriz de ordem 3 x 4
(3 linhas e 4 colunas) com números inteiros e positivos; calcule e mostre: 
 
c) o maior elemento da matriz e sua posição (linha e coluna); 
d) o menor elemento da matriz e sua posição (linha e coluna). 
 */
package tarefa5;

// João Vitor Bessa Lacerda

import java.util.Scanner;

public class Tarefa5 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int matriz[][];
        matriz = new int[3][4];
        
        int num;
        int maior;
        int menor;
        
        int linhaMaior = 0;
        int colunaMaior = 0;
        int linhaMenor = 0;
        int colunaMenor = 0;
     
        System.out.println("Preencha a matriz");
        for (int linha = 0; linha < 3; linha++){
            System.out.println("Linha " +(linha + 1) + ":");
            for (int coluna = 0; coluna < 4; coluna++){    
            num = teclado.nextInt();
            matriz[linha][coluna] = num;
            }
        }
        
        System.out.println("Sua matriz:");
        System.out.println("-----------");
        for(int contador = 0; contador < 3; contador++){
            System.out.println(matriz[contador][0] +" | "+ matriz[contador][1] +" | "+ matriz[contador][2] +" | "+ matriz[contador][3]);
        }
        System.out.println("-----------");
        
        maior = matriz[0][0];
        menor = matriz[0][0];
        
        
        for(int contador2 = 0; contador2 < 3; contador2++){
            for (int contador3 = 0; contador3 < 4; contador3++){
                if (matriz[contador2][contador3] > maior){
                    maior = matriz[contador2][contador3];
                    linhaMaior = contador2;
                    colunaMaior = contador3;
                    
                }else{
                    if (matriz[contador2][contador3] < menor){
                        menor = matriz[contador2][contador3]; 
                        linhaMenor = contador2;
                        colunaMenor = contador3;
                    }
                }
            }
        
        }
                
        System.out.println("Maior elemento da matriz:" + maior);
        System.out.println("Sua posição é: [" + linhaMaior + ", "+colunaMaior+"]");
        System.out.println("Menor elemento da matriz:" + menor);
        System.out.println("Sua posição é: [" + linhaMenor + ", "+colunaMenor+"]");
    }
    
}
