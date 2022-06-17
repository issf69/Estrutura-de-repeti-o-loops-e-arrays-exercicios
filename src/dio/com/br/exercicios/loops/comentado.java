## Ex1_NomeEIdade

package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variáveis
        String nome; //armazena o nome
        int idade; //armazena a idade

        while(true) { //Enquando o loop for verdadeiro
            System.out.println("Nome: "); //Peça o nome
            nome = scan.next(); //armazene esse nome na variável

            if (nome.equals("0")) { //caso o nome igual a "0"
                break; //interrompa o programa
            }

            System.out.println("Idade: "); //Peça a idade
            idade = scan.nextInt(); //armazene a idade na variável

            //imprima o nome e a idade
            System.out.println("Nome: " + nome + " - idade: " + idade);
        }
    }
}

##
      ##  Ex2_Nota
      
      package br.com.dio.exercicios.loops.comentado;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Nota de 0 a 10: "); //Peça uma nota de 0 a 10
        int nota = scan.nextInt(); //Entrada de dados, neste caso de um int

        while(nota < 0 | nota > 10) { //Enquanto o valor da nota for menor que 0 ou maior que 10.
            System.out.println("Nota Inválida!"); //Mensagem que o valor é inválido
            System.out.println("Tente novamente. Nota: "); //Peça novamente a nota
            nota = scan.nextInt(); //Entrada de dados, neste caso de um int
        }

        System.out.println("Nota: " + nota); //imprimindo a nota válida
    }

}


##
     ##   Ex3 _MaiorEMedia
     
     package br.com.dio.exercicios.loops.comentado;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        //variáveis
        double maior = 0; //guarda o maior número
        double soma = 0; //guarda a soma
        double media; //guarda a média

        int count = 0; //controla o loop
        //loop
        do {
            System.out.println("Número: "); //Peça um número
            double numero = scan.nextDouble(); //Entrada de dados, neste caso de um Double.

            if (numero > maior) { //Caso o valor que o usuário digitou seja maior que o valor armazanado na variável maior.
                maior = numero; //atribua o valor deste número a variável maior.
            }

            soma = soma + numero; //some o número informado pelo usuário com variável soma (independente do valor)

            count = count + 1; //some o valor 1 ao contador, até que invalide a condição do loop. (count < 5)
        } while (count < 5); //enquanto o contador tiver o valor menor que 5

        media = soma / 5; //faça o cálculo da média. (soma/quantidade)

        //imprimindo o maior número digtados e a média dos mesmos
        System.out.println("Maior: " + maior + " - Média: " + media);
    }

}

##  
    ##  EX4_ParEImpar
    
    package br.com.dio.exercicios.loops.comentado;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Quantidade de números: "); //Peça um número
        int quantidadeDeNumeros = scan.nextInt(); //Entrada de dados, neste caso de um int.

        //variáveis para guardar a quantidade dos números pares e ímpares
        int quantPar = 0, quantImpar = 0;

        int count = 0; //controla o loop
        //loop
        do { //primeiro, independente do que tem no while, faça:
            System.out.println("Número: "); //Peça um número
            int numero = scan.nextInt(); //Entrada de dados, neste caso de um int.

            //se o resto da divisão do número por 2 (numero/2) for 0,
            if (numero % 2 == 0) quantPar++; //acrescente o valor 1 a variável quantPar.
                //caso contrário, o número digitado é ímpar
            else quantImpar++; //adicione o valor 1 a variável quantImpar.

            count++; //some o valor 1 ao contador até que invalide a condição do loop. (count < quantidadeDeNumeros)
        } while (count < quantidadeDeNumeros);
        // Faça o loop caso o valor do contador seja menor que a quantidade de números

        //imprimindo a quantidade de números pares digtados e números ímpares digitados
        System.out.println("Quantidade números pares: " + quantPar + " / Quantidade números ímpares: " + quantImpar);
    }
}

##

    ## Ex5_Tabuada
    
    
    package br.com.dio.exercicios.loops.comentado;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Número: "); //Peça um número
        int numero = scan.nextInt(); //Entrada de dados, neste caso de um int.

        System.out.println("Tabuada de " + numero + ":");//frase ilustrativa para indicar a tabuada

        //para: variável i = 0, até i menor ou igual a 10, adicionando 1 ao valor de i a cada loop.
        for (int i = 0; i <= 10; i = i + 1) {
            //número escolhido pelo usuário "X" o valor de i "=" a multiplicação do número com o i.
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}

##
    ## Ex6_Fatorial
    
    package br.com.dio.exercicios.loops.comentado;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Número: "); //Peça um número
        int numero = scan.nextInt(); //Entrada de dados, neste caso de um int.

        int multiplicacao = 1; //variável para guardar o valor da multiplicação dos valores.

        System.out.print(numero + "!="); //frase ilustrativo para indicar o fatorial

        //para: variável i = numero, até i maior que 0, diminuimos 1 ao valor de i a cada loop.
        for(int i = numero; i > 0; i--) {
            multiplicacao *= i; //multiplicamos os valores de i e armazenamos na variável multiplicação

            //criamos esta estrutura condicional para imprimir o resultado conforme foi solicitado no exercício.
            if (i != 1) { //se o i tiver o valor diferente de 1
                System.out.print(i + "."); //imprima o valor do i seguido de "."
            } else { //se não (se o i tiver o valor igual a 1)
                //imprima o valor do i seguido do sinal "=" e o resultado da multiplicação
                System.out.print(i + "=" + (multiplicacao));
            }
        }
    }
}

