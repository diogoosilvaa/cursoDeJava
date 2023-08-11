package sp.br.senai.com;

import java.util.Scanner;

public class Balada {

    public static void main(String[] args) {

        /** Declarar as variaveis */

        String nome, nomeAcompanhante;
        long cpf, cpfAcompanhante;
        int rg, rgAcompanahante;
        int idade, idadeAcompanhante = 0;


        /** Instanciar teclado scanner */

        Scanner teclado = new Scanner(System.in);


        System.out.println("Ola seja bem vindo a balada");
        System.out.println("-----------------------------");

        System.out.print("digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("digite seu cpf: ");
        cpf = teclado.nextLong();

        System.out.print("digite seu rg: ");
        rg = teclado.nextInt();

        System.out.print("digite sua idade: ");
        idade = teclado.nextInt();
        while (idade == 0) {
            if (teclado.hasNextInt()) {
                idade = teclado.nextInt();
            } else {
                System.out.println("Digite um numero inteiro!!");
                teclado.next();
            }
        }
        if (idade >= 18 && idade % 2 == 0) {
            System.out.println("entrada para balada liberada");
        } else if (idade >= 18 && idade % 2 != 0) {
            System.out.println("Seja bem vindo a balada !!!");
            System.out.println("Digite o nome do (acompanhante): ");
            nomeAcompanhante = teclado.next();
            System.out.println("digite a idade do (acompanhante): ");
            idadeAcompanhante = teclado.nextInt();
            System.out.println("Digite CPF do (acompanhante): ");
            cpfAcompanhante = teclado.nextLong();
            System.out.println("Digite o RG do (acompanhante): ");
            rgAcompanahante = teclado.nextInt();

        } else {

            System.out.println("proibido a entrada de menores");
        }
        if ((idade + idadeAcompanhante) % 2 == 0 && idadeAcompanhante >= 18) {
            System.out.println("entrem na balada !!");
        } else {
            System.out.println("Vao embora !!");
        }


        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Idade: " + idade);

    }
}
