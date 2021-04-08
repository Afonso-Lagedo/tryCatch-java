package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");//armazenamento dentro do vetor as palavras digitadas  
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e){// para posição maior que o vetor
			System.out.println("Posição Inválida");
		}
		catch(InputMismatchException e){// para posição maior que o vetor
			System.out.println("Posição Errada");
		}
		System.out.println("Fim do programa");
		
		sc.close();
	}

}
