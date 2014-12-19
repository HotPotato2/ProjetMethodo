package Quiz;

import java.util.Scanner;

public class Main extends Question{

	
	public static void main(String[] args) {
		
		Question quest = new Question();
		Scanner scan = new Scanner(System.in);
		int i;
		
		System.out.println("Menu\n1 : Lancer le quiz\n2 : Afficher les scores");
		
		i = scan.nextInt();
		switch(i) {
		case 1 :
			quest.affiche();
			break;

		case 2 : 
			System.out.println("Voici vos scores : ");
			break;
		}
		
		
		
	}

}
