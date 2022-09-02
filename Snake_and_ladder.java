package day4;

public class Snake_and_ladder {

	public static void main(String[] args) {
		int startPos = 0;  
        int dieRoll = (int) (Math.floor(Math.random() * 10 ) % 6 + 1);
        
        System.out.println("Starting Position is :" + startPos);
        System.out.println("Dice Roll Number :" + dieRoll);
	}

}
