package weaponGame;

import java.util.Scanner;

public class Game {
	
	
	Game(){
	System.out.println("----Game has started----");
	}

	public Weapon selectWeapon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score : ");
		int score=sc.nextInt();
		if(score<=400) {
			System.out.println("You got the Knife!!");
			Knife k=new Knife();
			return k;
		}
		
		else if(score<=800) {
			System.out.println("Press 1 for Knife or 2 for gun!!");
			int choise=sc.nextInt();
			if(choise==1) {
				System.out.println("You have selectred knife");
			
			return new Knife();
			}
			else{
				System.out.println("You have selected Gun");
				return new Gun();
			}
		}
		
		else {
			System.out.println("Press 1 for knife , 2 for gun or 3 for bomb!!");
			int choise=sc.nextInt();
			if(choise==1) {
				System.out.println("You have selected Knife");
				return new Knife();
			}
			
			else if(choise==2) {
				System.out.println("You have selected Gun");
				return new Gun();
			}
			else {
				System.out.println("You have selected Bomb");
				return new Bomb();
			}
					
		
		}
		
	}
	
}
