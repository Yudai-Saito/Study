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
			System.out.println("ゼロ割が起きました");
		}catch(NumberFormatException e) {
			System.out.println("不適切な数値変換が起きました");
		}catch(IOException e) {
			System.out.println("入出力例外が起きました"); 
		}finally {
			System.out.println("必ず行う処理"); 
		}
	}
}
