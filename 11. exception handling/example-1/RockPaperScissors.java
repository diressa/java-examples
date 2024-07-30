/*
* Created By: Beza Nigatu
* Rock, Paper, Scissors
* November 6, 2021
*/
import javax.swing.JOptionPane;

public class RPS
{
	 public static void main(String args[])
	 {
			//Variable declaration
			int yourChoice = -1;
			int computerChoice; //computer chooses rock, paper, scissors
			String yourInput;

			//Welcome screen and show the basic rule to the user
			JOptionPane.showMessageDialog(null,"Welcome to Paper, Scissor and Rock");
			JOptionPane.showMessageDialog(null,"Let me remind you the rule first:\nScissor cuts paper, paper covers rock, and rock breaks scissors.");
			JOptionPane.showMessageDialog(null,"0: Rock\n1: Paper\n2: Scissor\n Any other number exits the game.");

			//Get your choice
			do{
				try {
					yourInput = JOptionPane.showInputDialog("Now tell me your choice!");
					yourChoice = Integer.parseInt(yourInput);

					//Get computer choice
					computerChoice = (int)(Math.random()*10); //generates random number
					computerChoice %= 3; //modulus 3 for 3 choices of rock, paper, scissors

					//== means a comparison of player's choice with the computer’s
					//Case I: Both picks same choice = a tie
					if (yourChoice == computerChoice){
						JOptionPane.showMessageDialog(null,"It’s a tie!");  //outputs the result
					}
					//Case II: Player wins
					if ((yourChoice == 1 && computerChoice == 0) || (yourChoice == 2 && computerChoice == 1) || yourChoice == 0 && computerChoice == 2) {
						JOptionPane.showMessageDialog(null,"YOU WIN!");
					}
					//Case III: Player loses
					if ((yourChoice == 0 && computerChoice == 1) || (yourChoice == 1 && computerChoice == 2) || yourChoice == 2 && computerChoice == 0){
						JOptionPane.showMessageDialog(null,"YOU LOSE :-(");
					}

					//Error catching
					if(yourInput.isEmpty()) {
						//isEmpty is a method is defined within java (default)
						throw new Exception(JOptionPane.showInputDialog("Please enter a valid number\n0: Rock\n1: Paper\n2: Scissor\n"));
					}
					if (yourChoice > 2 || yourChoice < 0) {
						//if the input is not in bounds of what's listed
						throw new Exception(JOptionPane.showInputDialog("Please enter a valid number\n0: Rock\n1: Paper\n2: Scissor\n"));
					}
					else {
						throw new Exception("Please enter a valid number\n0: Rock\n1: Paper\n2: Scissor\n");
					}

				} catch(Exception e ) { //exception is a data type, e is the variable
						System.out.println(e.getMessage() + " error"); //when an error is caught in the try block, the catch block will execute and print an error message
						JOptionPane.showInputDialog("Error, enter a valid number. " + e.getMessage());
					} //getMessage tells us what error message is, already defined in Java
			} while(yourChoice < 3 && yourChoice > -1); //condition of 0-2 user input is handled while do argument is true
	 }
}
