import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	SkillPractice skills = new SkillPractice();
  	skills.skill1();
  	skills.skill2();
  	skills.skill3();
  	skills.skill4();
  	skills.skill5();
}

 void skill1() {
//Use pop-ups for the following.
//Ask the user how many dimes they have
 String dimes = JOptionPane.showInputDialog( "How many dimes do you have?");



//Tell them how many cents they have (hint multiply by 10)
int dimes1 = Integer.parseInt(dimes);
int cents = 10*dimes1;
JOptionPane.showMessageDialog(null, "You have " + cents + " cents."); 



//Ask the user how tall they are (inches)
String height = JOptionPane.showInputDialog("How tall are you?");



//If they are shorter than 36 inches, tell them to eat their Wheaties
int height1 = Integer.parseInt(height);
if(height1<36) {
	JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for(int i=1;i<30;i++) {
	if(i%3==0) {
		
		System.out.println(i);
	}

}





}

void skill3() { // Get a random number that is less than 20 and print it to the console 
Random r = new Random();
int number1 = r.nextInt(30);
System.out.println(r.nextInt(20));

//Get another random number that is less than 10 and print it to the console 
int number2 = r.nextInt(10);
System.out.println(r.nextInt(10));


//Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
int difference = number1 = number2;
JOptionPane.showMessageDialog(null, difference);


}

void skill4() { // In a pop-up, ask the user for the city they live in 
String city = JOptionPane.showInputDialog("What city do you live in?");


//If they answered "San Diego", tell them they live in Americ's Finest City 
if(city.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
	
}


//Otherwise, tell them to move to San Diego 
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego!");
	
}


//Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
String cars = JOptionPane.showInputDialog("How many cars does you family have?");

int cars1 = Integer.parseInt(cars);
//If there is 1 car, use a pop-up to display the make/model of the car 

if(cars1==1) {
	JOptionPane.showMessageDialog(null, "I bet you have a Jeep.");
	
}

//If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
if(cars1>1) {
	int wheels = cars1 * 4;
	JOptionPane.showMessageDialog(null, "You have " + wheels + " wheels in total.");
	
}


}

void skill5() { // In a pop-up, ask the user for the name of their school 
String school = JOptionPane.showInputDialog("What school do you go to?");


//In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, "Your school, " + school + ", is a fantastic school.");


}
}

	
	
	
	
	
	
	

