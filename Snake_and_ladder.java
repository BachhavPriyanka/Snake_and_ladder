package day4;

import java.util.Scanner;

public class Snake_and_ladder {
	public static final int Winning_Position = 100;
	
	public static void main(String[] args) {
		 int startPosition = 0;
	        int rollCounter = 0;
	        System.out.println("Enter your name: ");
	        Scanner sc = new Scanner(System.in);
	        String Player_Name = sc.next();

	        while (Winning_Position > startPosition) {

	            int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
	            rollCounter ++;
	            int needToWin = Winning_Position - startPosition;
	            int checkOption = (int) (Math.floor(Math.random() * 10) % 3);

	            if(needToWin >= dieRoll) {

	                switch (checkOption) {
	                    case 0:

	                        startPosition += 0;
	                        break;

	                    case 1:

	                        startPosition += dieRoll;
	                        break;

	                    default:

	                        startPosition -= dieRoll;

	                        if (startPosition < 0) {
	                            System.out.println("Start Again");
	                            startPosition = 0;
	                        }

	                }
	            }
	            System.out.println("Player Current Position" + startPosition);
	        }

	        System.out.println(Player_Name + " Reached the Winning Position :" + startPosition);
	        System.out.println("Dice Rolled :"+rollCounter+" Times");
	}

}
