package ui;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			
			int num = sc.nextInt();
			int[] array = new int[num];
			
			for (int i = 0; i < num; i++)
				array[i] = sc.nextInt();
			
			Arrays.sort(array);

			System.out.println("Peter should buy books whose prices are " );
		}
		sc.close();
	}
}
