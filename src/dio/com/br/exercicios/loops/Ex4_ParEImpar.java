##
package dio.com.br.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = Scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = Scan.nextInt();

            if (numero % 2 == 0 ) quantPares++;  // quantPares = quantPares + 1
            else quantImpares++;


            count++;
        } while(count < quantNumeros);
        System.out.println("Quantide Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }
}

##

C:\Users\Irene\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\lib\idea_rt.jar=51971:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Irene\Documents\Estrutura de repetição loops-e-arrays\loops-e-arrays-xercicios\out\production\loops-e-arrays-xercicios" dio.com.br.exercicios.loops.Ex4_ParEImpar
Quantidade de numeros: 

6
Numero: 
1
Numero: 
8
Numero: 
7
Numero: 
3
Numero: 
8
Numero: 
6
Quantide Par: 3
Quantidade Impar: 3

Process finished with exit code 0

