package 실습문제2회;

import java.util.Scanner;

public class JuminNumProcess {

	public static void main(String[] args) {
		String juminNum ;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호입력>>>");
		juminNum = scan.nextLine();
	//해결방법1
		/*juminNum.substring(0, 5);
		System.out.println("주민번호 앞 6자리: " + juminNum.substring(0, 6));
		System.out.println("주민번호 뒤 7자리: " + juminNum.substring(7, 14));
	*/
	//해결방법2
		String[] array = juminNum.split("-", 2);
		System.out.println("주민번호 앞 6자리: " +array[0]);
		System.out.println("주민번호 뒤 7자리: " +array[1]);
	
		 
		 
	 
		
	
	}
	
	}
	

