 package leap;

public class pattern {
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j = 3; j >=i; j--) {
				System.out.print(" ");
			}
				for (int j2 = 1; j2 <=i; j2++) {
					System.out.print("*");
				}
				System.out.println( );
		}}
}
