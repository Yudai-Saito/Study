import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Car{
	int fuel;
	String name;
	
	public Car(String name, int fuel) {
		this.fuel = fuel;
		this.name = name;
	}
	
	public int getFuel() {
		return fuel;
	}

	@Override
	public String toString() {
		return name + " : " + fuel + "L" ;
	}
}

class SuperCar extends Car{

	public SuperCar(String name, int fuel) {
		super(name, fuel);
	}
}

class WorkCar extends Car{

	public WorkCar(String name, int fuel) {
		super(name, fuel);
	}
}

class CarComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getFuel() - o2.getFuel();
	}
	
}

public class KADAI24 {

	public static void main(String[] args) {
		
		ArrayList<Car> ins = new ArrayList<Car>();
		
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			int value = random.nextInt(100);
			ins.add(new SuperCar("superCar" + Integer.toString(i), value)); 
			
			value = random.nextInt(100);
			ins.add(new WorkCar("workCar" + Integer.toString(i), value)); 
		}
		
		System.out.println("---Before sorting---");
		
		System.out.println(ins);
		
		Collections.sort(ins,new CarComparator());
		
		System.out.println("\n" + "---Aftere sorting---");
		
		System.out.println(ins);
		
		
		ArrayList<SuperCar> scar = new ArrayList<>();
		ArrayList<WorkCar> wcar = new ArrayList<>();
		
		int scount = 0, wcount = 0;
		
		for(Car car: ins) {
			if(car instanceof SuperCar) {
				scar.add((SuperCar)car);
				scount += 1;
			}else if(car instanceof WorkCar) {
				wcar.add((WorkCar)car);
				wcount += 1;
			}
		}
		
		System.out.println("\n" + "---SuperCar class info---");
		System.out.println(scar);
		System.out.println("SuperCar inscance is " + scount + " count");
		
		System.out.println("\n" + "---WorkCar class info---");
		System.out.println(wcar);
		System.out.println("WorkCar instance is " + wcount + " count");
	}
}
