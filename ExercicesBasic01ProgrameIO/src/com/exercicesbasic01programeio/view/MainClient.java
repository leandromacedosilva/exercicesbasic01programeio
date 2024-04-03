/*Exercicio 01: Este programa exige algumas informacoes de um determinado cliente
 * e no final ele lista as informacoes */

package com.exercicesbasic01programeio.view;

import java.io.PrintStream;
import java.util.Scanner;

import com.exercicesbasic01programeio.util.Client;

public class MainClient {
	public static void main(String[] args) {
		
		PrintStream pst = System.out;
		
		Scanner input = new Scanner(System.in);
		
		pst.print("NOME: ");
		String nome = input.nextLine();
		pst.print("CPF: ");
		String cpf = input.nextLine();
		pst.print("TELEFONE: ");
		String telefone = input.nextLine();
		pst.print("SEXO: ");
		String sexo = input.nextLine();
		pst.print("ANO DE NASCIMENTO: ");
		int anoNascimento = input.nextInt();
		pst.print("ANO CORRENTE: ");
		int anoAtual = input.nextInt();
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("INFORMACOES DOS CLIENTE");
		System.out.println("----------------------------------------------------------");
		
		Client client = new Client(nome, cpf, telefone, sexo, anoNascimento, anoAtual);
		client.clientPrinter();
		
		input.close();
	}

}
