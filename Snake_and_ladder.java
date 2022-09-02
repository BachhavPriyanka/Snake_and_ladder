package day4;

import java.util.Scanner;

public class Snake_and_ladder {

	public static void main(String[] args) {
        int startPos = 0;
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String Player_Name = sc.next();

        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("Dice Roll number :" + dieRoll);

        int checkOption = (int) (Math.floor(Math.random() * 10) % 3);

        switch (checkOption)

        {
            case 0:
                System.out.println("No Play");
                startPos += 0;
                break;

            case 1:
                System.out.println("Ladder");
                startPos += dieRoll;
                break;

            default:
                System.out.println("Snake");
                startPos -= dieRoll;

                if (startPos < 0)
                    startPos = 0;
        }
        System.out.println( Player_Name + " is on Position :" + startPos);
	}

}
