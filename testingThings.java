package testingThings;

import javax.swing.JOptionPane;

public class testingThings{

	public static void main(String[] args) {
		
		
		String person1 = JOptionPane.showInputDialog(null, "Enter the first person's name");
		String person2 = JOptionPane.showInputDialog(null, "Enter the second person's name");
		String height1 = JOptionPane.showInputDialog(null, "Enter the first person's height");
		String height2 = JOptionPane.showInputDialog(null, "Enter the second person's height");

		int l= Integer.parseInt(height1);
		int j= Integer.parseInt(height2);

		if(l>j){
		JOptionPane.showMessageDialog(null, person1 + " is taller!");
		}else if(j>l){
		JOptionPane.showMessageDialog(null, person2 + " is taller!");
		}else{JOptionPane.showMessageDialog(null, "You're the same height!");}

		}
		
	}


