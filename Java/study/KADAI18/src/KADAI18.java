
class Car{
	private String name;
	private double speed;
	private int numpass;
	
	public Car(String name, double speed, int numpass) {
		this.name = name;
		this.speed = speed;
		this.numpass = numpass;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumpass() {
		return numpass;
	}
	
	public double getSpeed() {
		return speed;
	}

	@Override
	public String toString() {
		return "Car [車種=" + name + ", 速度=" + speed + ", 乗員=" + numpass + "]";
	}
	
}

class FireTruck extends Car{
	
	private boolean ladder;
	private int hose;

	public FireTruck(String name, double speed, int numpass, boolean ladder, int hose) {
		super(name, speed, numpass);
		this.ladder = ladder;
		this.hose = hose;
	}
	
	public boolean isLadder() {
		return ladder;
	}

	public int getHose() {
		return hose;
	}

	@Override
	public String toString() {
		return "FireTruck [車種=" + getName() + ", 速度=" + getSpeed() + ", 乗員=" + getNumpass() +  ", 梯子=" + (this.ladder ? "あり" : "なし") + ", ホース長=" + hose + "]";
	}
	
}

public class KADAI18 {
	public static void main(String[] args) {
		String name;
		double speed;
		int hose;
		
		Car c1 = new Car("Toyota", 120.0, 5);
		FireTruck t1 = new FireTruck("Isuzu", 80.0, 3, true, 100);
		Car c2 = new FireTruck("Hino", 90.0, 3, false, 120);
		
		name = c1.getName();
		System.out.println("C1 = " + name);
		
		speed = t1.getSpeed();
		System.out.println("t1 = " + speed);
		
		hose = ((FireTruck)c2).getHose();
		System.out.println("c2 = " + hose);
		
		System.out.println(c1);
		System.out.println(t1);
		System.out.println(c2);

	}
}
