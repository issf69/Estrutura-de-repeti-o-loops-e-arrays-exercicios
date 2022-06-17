package dio.com.br.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade:");
            idade = scan.nextInt();
        }

        System.out.println("continua aqui ...");
    }

}


##
C:\Users\Irene\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\lib\idea_rt.jar=51180:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Irene\Documents\Estrutura de repetição loops-e-arrays\loops-e-arrays-xercicios\out\production\loops-e-arrays-xercicios" dio.com.br.exercicios.loops.Ex1_NomeEIdade
Nome: 

camila
Idade:
27
Nome: 
joao
Idade:
65
Nome: 
vera
Idade:
20
Nome: 
marlen
Idade:
13
Nome: 
0
continua aqui ...

Process finished with exit code 0
