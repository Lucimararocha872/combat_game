package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class FightArea {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name1 = sc.nextLine();

		System.out.print("Vida inicial: ");
		int life1 = sc.nextInt();

		System.out.print("Ataque: ");
		int attack1 = sc.nextInt();

		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();

		Champion champion1 = new Champion(name1, life1, attack1, armor1);
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String name2 = sc.nextLine();

		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();

		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		
		System.out.print("Armadura:");
		int armor2 = sc.nextInt();
		
		System.out.println();
		Champion champion2 = new Champion(name2, life2, attack2, armor2);
		
		System.out.println();
		System.out.print("Informe a quantidade de turnos: ");
		int turnos = sc.nextInt();
		System.out.println();
		
		
			for (int i = 0; i < turnos; i ++) {
				
				
				champion1.takeDamage(champion2);
				champion2.takeDamage(champion1);
				System.out.println();
				System.out.println("Resultado do turno " + (i + 1));
				System.out.println(champion1.status());
				System.out.println(champion2.status());
				System.out.println();
				
				if(champion1.getLife() < 0 || champion2.getLife() < 0) {
					i = turnos;
					System.out.println();
				}	
			
				
				if(i == turnos) {
					System.out.println();
					
							

				}
			
		
	}
			System.out.println("Fim de combate!");
			
			
			sc.close();

}
}