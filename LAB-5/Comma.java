package lab_5;

public class Comma {
	public String comma(String str) {
		String formattedNumber = new String();
		int len = str.length();
		int i = len - 1;
		while (i >= 0) {
			if (i % 3 == 0 && i > 0) {
				
			}
		}
		return formattedNumber;
	}
	
	public static void main(String[] args) {
		String str = new String();
		Comma num = new Comma();
		System.out.println("Enter the number: ");
		System.out.println("Formatted number: " + num.comma(str));
	}
}
