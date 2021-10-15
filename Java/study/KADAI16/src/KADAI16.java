
public class KADAI16 {

	public static void main(String[] args) {
		int a, b;
		char op;
		
		try {
			a = Integer.parseInt(args[0]);
			
			op = args[1].charAt(0);
			if(op == '\\') {
				op = args[1].charAt(1);
			}
			
			b = Integer.parseInt(args[2]);
			
			switch(op) {
			case '+':
				System.out.println("ans = " + (a + b)); 
				break;
				
			case '-':
				System.out.println("ans = " + (a - b)); 
				break;
				
			case '*':
				System.out.println("ans = " + (a * b)); 
				break;
				
			case '/':
				System.out.println("ans = " + (a / b)); 
				break;
				
			default :
				System.out.println("OPError"); 
				break;
				
			}
		}catch(ArithmeticException e) {
			System.out.println("caught AException.");
		}

	}

}
