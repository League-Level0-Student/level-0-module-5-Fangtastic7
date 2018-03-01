import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		
	String anynumber = JOptionPane.showInputDialog("Give me a number.");
	int number = Integer.parseInt(anynumber);
	for(int i=2;i<=number-1;i++) {
		if(number%i==0) {
			System.out.println("Not Prime");
			break;
		}
		if(i==number-1) {
			System.out.println("Prime");
			break;
		}
	}
	}
}
