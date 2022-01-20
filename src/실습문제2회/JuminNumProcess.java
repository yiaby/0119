package 실습문제2회;

import java.util.Scanner;

public class JuminNumProcess {

	public static void main(String[] args) {
		
		// 준비단계=>변수 선언,배열 선언=> 메모리의 일부(그릇)
		String juminNum;// 키보드로부터 입력한 주민번호 문자열 객체의 주소값이 담겨질 객체 참조변수

		// 입력 단계
		System.out.print("주민번호 입력>>>");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.next();

		// 처리단계=>제어문들의 조합(if문,switch문,for문,while문,continue,break)
		// logic =>인간의 논리적인 사고=> 주어진 문제를 어떻게 해결할것인지 고민
		// [해결방법1]
		String frontJumin = juminNum.substring(0, 6);
		String backJumin = juminNum.substring(7, 14);

		// 출력단계
		System.out.println("주민번호 앞6자리:" + frontJumin);
		System.out.println("주민번호 뒤7자리:" + backJumin);

		// [해결방법2]
		String[] token = juminNum.split("-");
		String frontString = token[0];
		String backString = token[1];

		System.out.println("주민번호 앞6자리:" + frontString);
		System.out.println("주민번호 뒤7자리:" + backString);

		
		//[중요] 실무사례
		//"971025-1054171"=>"971025-1*******"
		String juminNumMasking = backString.replace(backString. substring(1),"******");
		
		System.out.println("<<주민번호 뒷자리 마스킹처리하기");
		System.out.println(frontString+"-"+juminNumMasking);
	
		
		
		
		
		  //String juminNum ;
		  
		  //Scanner scan = new Scanner(System.in); System.out.print("주민등록번호입력>>>");
		  //juminNum = scan.nextLine(); 
		  //해결방법1
		  //System.out.println("주민번호 앞 6자리: " + juminNum.substring(0, 6));
		  //System.out.println("주민번호 뒤 7자리: " + juminNum.substring(7, 14));
		
		  //해결방법2
		  //String[] array = juminNum.split("-", 2);
		  //System.out.println("주민번호 앞 6자리: " +array[0]);
		  //System.out.println("주민번호 뒤 7자리: " +array[1]);

	}

}
