
import java.io.*;

public class KADAI19 {

	public static void main(String[] args) throws IOException{
		String str, str2;
		int[] n = new int [4];
		int index1 = 0, index2 = 0;
		
		System.out.println("IP address = ");
		
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
		str = kbd.readLine();
		
		for(int i=0; i < n.length; i++) {
			index2 = str.indexOf(".", index1);
			if(index2 == -1) {
				index2 = str.length();
			}
			n[i] = Integer.parseInt(str.substring(index1, index2));
			str2 = "00000000" + Integer.toBinaryString(n[i]);
			System.out.println("��" + (i+1) + "�I�N�e�b�g : " + str2.substring(str2.length()-8, str2.length()));
			index1 = index2 + 1;
		}
		
		if(n[0] < 128) {
			System.out.println("�N���X�`�ł�"); 
		}else if(n[0] < 192) {
			System.out.println("�N���X�a�ł�");
		}
		else if(n[0] < 224) {
			System.out.println("�N���X�b�ł�");
		}
	}
}
