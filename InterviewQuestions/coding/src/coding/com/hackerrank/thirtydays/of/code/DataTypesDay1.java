package coding.com.hackerrank.thirtydays.of.code;

import java.util.Scanner;

public class DataTypesDay1 {

	public static void main(String[] args) {
		
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        int secondInteger = scan.nextInt();
	        double secondDouble = scan.nextDouble();
	        scan.nextLine();
	        String secondString = scan.nextLine();
	        scan.close();
	        System.out.println(i+secondInteger);
	        System.out.println(d+secondDouble);
	        System.out.println(s+secondString);
	}

}