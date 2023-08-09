package sp.br.senai.com;

import java.util.Scanner;

public class Balada {

    public static void main(String[] args){

        /** Declarar as variaveis */

        String nome;
        long cpf;
        int rg;
        int idade;


        /** Instanciar teclado scanner */

        Scanner teclado = new Scanner(System.in);

        /** Coletar dados */

        System.out.println("Ola seja bem vindo a balada");
        System.out.println("-----------------------------");

        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Informe seu cpf: ");
        cpf = teclado.nextLong();

        System.out.print("informe seu rg: ");
        rg = teclado.nextInt();

        System.out.print("informe sua idade: ");
        idade = teclado.nextInt();

        System.out.println("----------------------------");

        if(idade >= 18) {
            System.out.println("pode entrar");
        } else {
            System.out.println("nao pode entrar");
        }


        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Idade: " +idade);

    }
}
