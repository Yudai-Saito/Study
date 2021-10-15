
public class ArrayTest3 {

	public static void main(String[] args) {
		
		double [] d = new double[3];
		
		for(int i = 0; i < d.length; i++) {
			d[i] = 2.718;
		}
		
		for(double i : d) {
				System.out.println(i);
		}
		
		int[][] e = new int [2][];
		e[0] = new int[2];
		e[1] = new int[3];
		//insert 5 to all arrays.
		for(int i = 0; i < e.length; i++){
			for(int j = 0; j < e[i].length; j++) {
				e[i][j] = 5;
			}
		}

		for(int[] i : e) {
			for(int j : i) {
				System.out.println(j);
			}
		}
		
		//create TigerClass arrays.
		Tiger[] f = {new Tiger("¼’Ë", 34, 120), new Tiger("²“¡", 5, 30), new Tiger("—Lì", 32, 290)};
		
		for(Tiger i : f) {
			System.out.println(i);
		}
	}
}

class Tiger{
	
	private String name;
	private int age;
	private double len;
	
	public Tiger(String name, int age, double len) {
		this.name = name;
		this.age = age;
		this.len = len;
	}
	
	public String toString(){
		return name + " " + age + "Ë" + " " + len + "cm";
	}
}