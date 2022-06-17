##
package dio.com.br.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;
            count = count + 1;

        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));
    }
}

##
C:\Users\Irene\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\lib\idea_rt.jar=51102:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Irene\Documents\Estrutura de repetição loops-e-arrays\loops-e-arrays-xercicios\out\production\loops-e-arrays-xercicios" dio.com.br.exercicios.loops.Ex3_MaiorEMedia
Numero: 
5
Numero: 
8
Numero: 
13
Numero: 
9
Numero: 
10
Maior: 13
Media: 9

Process finished with exit code 0
