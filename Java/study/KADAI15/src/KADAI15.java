import java.io.*;

public class KADAI15 {
	public static void main(String[] arg) {
		int i, j, k;
		String s;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			System.out.print("i = ");
			s = bf.readLine();
			i = Integer.parseInt(s);
			System.out.print("j = ");
			s = bf.readLine();
			j = Integer.parseInt(s);
			
			k = i / j;
			
			System.out.println("k = " + k);
		}catch(ArithmeticException e) {
			System.out.println("�[�������N���܂���");
		}catch(NumberFormatException e) {
			System.out.println("�s�K�؂Ȑ��l�ϊ����N���܂���");
		}catch(IOException e) {
			System.out.println("���o�͗�O���N���܂���"); 
		}finally {
			System.out.println("�K���s������"); 
		}
	}
}
