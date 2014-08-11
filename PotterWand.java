
import java.util.*;
public class PotterWand
{	
	public static void main(String[] args)
	{
		//create new wand
		Wand w = new Wand();
		//collect input
		Scanner s = new Scanner(System.in);
		
		//Question 1
		
		System.out.println("Enter the number that corresponds to your answer.");
		System.out.println("Enter your height:");
		System.out.println("1: Short for your age.");
		System.out.println("2: Average for your age.");
		System.out.println("3: Tall for your age.");
		w.setHeight(s.nextInt());
		
		//Question 2
		System.out.println("\nEnter your eye color:");
		System.out.println("1: Brown/black");
		System.out.println("2: Light Brown");
		System.out.println("3: Hazel");
		System.out.println("4: Green");
		System.out.println("5: Blue");
		System.out.println("6: Blue-grey");
		System.out.println("7: Blue-green");
		System.out.println("8: Grey");
		System.out.println("9: Other");
		w.setEyeColor(s.nextInt());
		
		//Question 3
		System.out.println("\nIs your birthdate even or odd?");
		System.out.println("1: Even");
		System.out.println("2: Odd");
		w.setBirthDate(s.nextInt());
		
		//Question 4
		System.out.println("\nYou are at a crossroads. Which way do you go?");
		System.out.println("1: Left, towards the sea");
		System.out.println("2: Ahead, towards the forest");
		System.out.println("3: Right, towards the castle");
		w.setPath(s.nextInt());
		
		//Question 5
		System.out.println("\nWhat characteristic of yourself do you value the most?");
		System.out.println("1: Resilience");
		System.out.println("2: Intelligence");
		System.out.println("3: Determination");
		System.out.println("4: Originality");
		System.out.println("5: Kindness");
		System.out.println("6: Optimism");
		System.out.println("7: Imagination");
		w.setPride(s.nextInt());
		
		//Question 6
		System.out.println("\nWhat do you most fear?");
		System.out.println("1: Fire");
		System.out.println("2: Darkness");
		System.out.println("3: Heights");
		System.out.println("4: Small spaces");
		System.out.println("5: Isolation");
		w.setFear(s.nextInt());
		
		//Question 7
		System.out.println("\nOut of these magical objects, what do you pick?");
		System.out.println("1: Dusty Bottle");
		System.out.println("2: Old Black Glove");
		System.out.println("3: Golden Key");
		System.out.println("4: Bound-up Scroll");
		System.out.println("5: Glittering Jewel");
		System.out.println("6: Silver Dagger");
		System.out.println("7: Ornate Mirror");
		w.setArtifact(s.nextInt());
		
		
		
		//verify answers
		System.out.println("\nYour responses");
		w.printAnswers();
		w.calcWandCore();
		w.calcWandFlex();
		w.calcWandLength();
		w.calcWandWood();
		
		//display wand
		System.out.println("\n\nYour wand:");
		System.out.println("*******************************************************************");
		w.printWand();
		System.out.println("\n*******************************************************************");
		System.out.println();
		w.printWandDetails();
	}

}
