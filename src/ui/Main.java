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
			
			int mon = sc.nextInt();
			int x = -1;
			int y = -1;
			
			for (int i = 0; i < num; i++) {
				
				int req = mon - array[i];
				int res = Arrays.binarySearch(array,i+1,num,req);
				if (res >= 0 && (array[res] - array[i] < y - x || (x == -1 && y == -1))) {
					x = array[i];
					y = array[res];
				}
			}
			
			System.out.println("Peter should buy books whose prices are " + x + " and " + y);
		}
		sc.close();
	}
}