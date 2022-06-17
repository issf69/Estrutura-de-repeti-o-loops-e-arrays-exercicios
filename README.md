# Estrutura-de-repeti-o-loops-e-arrays-exercicios
  Ex1_NomeEIdade
  Ex2_Nota
  Ex3 _MaiorEMedia
  EX4_ParEImpar
  Ex5_Tabuada
  Ex6_Fatorial

##
package dio.com.br.exercicios.loops;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Invalida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}

##
C:\Users\Irene\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\lib\idea_rt.jar=50826:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Irene\Documents\Estrutura de repetição loops-e-arrays\loops-e-arrays-xercicios\out\production\loops-e-arrays-xercicios" dio.com.br.exercicios.loops.Ex2_Nota
Nota: 
-12
Nota Invalida! Digite novamente: 
12
Nota Invalida! Digite novamente: 
13
Nota Invalida! Digite novamente: 

5

Process finished with exit code 0
