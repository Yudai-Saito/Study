
public class KADAI17 {
	public static void main(String[] args) {
		String n = "TARO";
		int a = 7;
		String f = "AOMORI";
		
		Animal a1 = new Animal();
		
		a1.setName(n);
		String na = a1.getName();
		
		a1.setAge(a);
		int ag = a1.getAge();
		
		a1.setFrom(f);
		String fr = a1.getFrom();
		
		System.out.println("Name : " + na);
		System.out.println("Age : " + ag);
		System.out.println("From : " + fr);
		System.out.println(a1);
		
	}
}

class Animal{
	private String name;
	private int age;
	private String from;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}

	@Override
	public String toString() {
		return "Animal [getName()=" + getName() + ", getAge()=" + getAge() + ", getFrom()=" + getFrom() + "]";
	}
}
