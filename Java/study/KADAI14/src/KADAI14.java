import java.util.Random;

public class KADAI14 {

	public static void main(String[] args) {
		Random r = new Random();
		int [] x = new int[10];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = (r.nextInt()) % 100;
		}
		
		System.out.println("ソート前");
		
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
		
		for(int i = x.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(x[j] > x[j + 1]) {
					int t;
					t = x[j];
					x[j] = x[j + 1];
					x[j + 1] = t;
				}
			}
		}
		
		System.out.println("ソート数");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();

	}
}
