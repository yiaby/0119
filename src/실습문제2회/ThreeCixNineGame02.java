package �ǽ�����2ȸ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.stream.ImageInputStream;

public class ThreeCixNineGame02 {
 public static void main (String[]args) {
	 String[] ans= {"�Էµ� ���� 369�� ���ԵǾ� ���� �ʽ��ϴ�","�ڼ�¦","�ڼ�¦¦","�ڼ�¦¦¦"};
	 //�Է´ܰ�
	 System.out.print("1~9999������ ���� �Է��ϼ���>>>");
		Scanner scan = new Scanner(System.in);
		String inputNum = scan.next();
		
		//ó�� �ܰ�
		if(inputNum.length()>4) {
			System.out.println("�Էµ� ���� ������ �ʰ��߽��ϴ�.");
			
		}else {
			int count =0 ;
			Pattern p = Pattern.compile("[3,6,9]");
			Matcher m = p.matcher(inputNum);
		
		while(m.find()) {
			count++;
			
		}
		System.out.println(ans[count]);//[�߿�]
		}
 }
}
