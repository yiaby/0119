package �ǽ�����2ȸ;

import java.util.Scanner;

public class JuminNumProcess {

	public static void main(String[] args) {
		String juminNum ;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ�Է�>>>");
		juminNum = scan.nextLine();
	//�ذ���1
		/*juminNum.substring(0, 5);
		System.out.println("�ֹι�ȣ �� 6�ڸ�: " + juminNum.substring(0, 6));
		System.out.println("�ֹι�ȣ �� 7�ڸ�: " + juminNum.substring(7, 14));
	*/
	//�ذ���2
		String[] array = juminNum.split("-", 2);
		System.out.println("�ֹι�ȣ �� 6�ڸ�: " +array[0]);
		System.out.println("�ֹι�ȣ �� 7�ڸ�: " +array[1]);
	
		 
		 
	 
		
	
	}
	
	}
	

