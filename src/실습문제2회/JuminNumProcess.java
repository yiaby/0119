package �ǽ�����2ȸ;

import java.util.Scanner;

public class JuminNumProcess {

	public static void main(String[] args) {
		
		// �غ�ܰ�=>���� ����,�迭 ����=> �޸��� �Ϻ�(�׸�)
		String juminNum;// Ű����κ��� �Է��� �ֹι�ȣ ���ڿ� ��ü�� �ּҰ��� ����� ��ü ��������

		// �Է� �ܰ�
		System.out.print("�ֹι�ȣ �Է�>>>");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.next();

		// ó���ܰ�=>������� ����(if��,switch��,for��,while��,continue,break)
		// logic =>�ΰ��� ������ ���=> �־��� ������ ��� �ذ��Ұ����� ���
		// [�ذ���1]
		String frontJumin = juminNum.substring(0, 6);
		String backJumin = juminNum.substring(7, 14);

		// ��´ܰ�
		System.out.println("�ֹι�ȣ ��6�ڸ�:" + frontJumin);
		System.out.println("�ֹι�ȣ ��7�ڸ�:" + backJumin);

		// [�ذ���2]
		String[] token = juminNum.split("-");
		String frontString = token[0];
		String backString = token[1];

		System.out.println("�ֹι�ȣ ��6�ڸ�:" + frontString);
		System.out.println("�ֹι�ȣ ��7�ڸ�:" + backString);

		
		//[�߿�] �ǹ����
		//"971025-1054171"=>"971025-1*******"
		String juminNumMasking = backString.replace(backString. substring(1),"******");
		
		System.out.println("<<�ֹι�ȣ ���ڸ� ����ŷó���ϱ�");
		System.out.println(frontString+"-"+juminNumMasking);
	
		
		
		
		
		  //String juminNum ;
		  
		  //Scanner scan = new Scanner(System.in); System.out.print("�ֹε�Ϲ�ȣ�Է�>>>");
		  //juminNum = scan.nextLine(); 
		  //�ذ���1
		  //System.out.println("�ֹι�ȣ �� 6�ڸ�: " + juminNum.substring(0, 6));
		  //System.out.println("�ֹι�ȣ �� 7�ڸ�: " + juminNum.substring(7, 14));
		
		  //�ذ���2
		  //String[] array = juminNum.split("-", 2);
		  //System.out.println("�ֹι�ȣ �� 6�ڸ�: " +array[0]);
		  //System.out.println("�ֹι�ȣ �� 7�ڸ�: " +array[1]);

	}

}
