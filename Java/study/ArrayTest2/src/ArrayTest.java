
public class ArrayTest {
	public static void main(String arg[]) {
		
		double [] a = new double[3];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i * 10.0;
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int [] [] c = new int[2] [];
		c[0] = new int[3];
		c[1] = new int[4];
		
		int val = 1;
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = val;
				val *= 2;
			}
		}
		
		for(int[] n1 : c) {
			for(int n0 : n1) {
				System.out.println(n0);
			}
		}
		
		Dog[] f = {new Dog("‚ ‚©‚è", 3), new Dog("‚©‚¨‚è", 5)};
		
		for(Dog d : f) {
			System.out.println(d);
		}
	}
}

class Dog{
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " " + age + "Ë";
	}
}