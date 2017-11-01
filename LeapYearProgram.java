import  java.util.Scanner;
public class LeapYearProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a year to see if it is a leap year");
		int year = in.nextInt();
		System.out.print(isLeapYear(year));
	}
public static String isLeapYear(int year){
	if(year%100==0&&year%400!=0){
		String value = "false";
		return value;
	}
	else if (year%400==0&&year%4==0){
		String value = "True";
		return value;
	}
	else {
			String value ="True";
			return value;
			
}
}
}
