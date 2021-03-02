package view;

import java.util.Scanner;

import controller.Processos;

public class Main {
	public static void main(String[] args) {
		Processos opSistema = new Processos();
		Scanner input = new Scanner(System.in);
		String os = opSistema.Sistema();
		
	
		String a = "Windows";
		String ar[] = new String[3];
		ar = os.split(" ");
		String b = ar[0];
		

		String process = "TASKLIST /FO TABLE";	
		opSistema.Processos(a, b , process);
		String param = input.nextLine();
		opSistema.killProcess(param);
		
	}
}