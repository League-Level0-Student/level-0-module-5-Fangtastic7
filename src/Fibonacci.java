
public class Fibonacci {
public static void main(String[] args) {
	int first = 0;
	int second = 1;
	int third = first + second;
	System.out.println(first);
	System.out.println(second);
	for(int i=2;i<13;i++) {
		System.out.println(third);
		first=second; 
		second=third;
		third=first+second;
	}
}
}
