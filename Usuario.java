package M2S02_EX02;

import java.util.Scanner;

public class Usuario {

    void nomeUsuario() {

        String nome;
        String sobrenome;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite seu Sobrenome: ");
        sobrenome = keyboard.nextLine();

        System.out.println("Digite seu Nome: ");
        nome = keyboard.nextLine();

        System.out.println("Seu nome completo: " + nome + " " + sobrenome + "!");

    }
}
