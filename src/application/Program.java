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
		catch(ArrayIndexOutOfBoundsException e){// para posi��o maior que o vetor
			System.out.println("Posi��o Inv�lida");
		}
		catch(InputMismatchException e){// para posi��o maior que o vetor
			System.out.println("Posi��o Errada");
		}
		System.out.println("Fim do programa");
		
		sc.close();
	}

}
