import java.util.Scanner;

public class Hello_World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = input.nextLine();
		System.out.printf("Hello %s !! \n", name);

	}

}
