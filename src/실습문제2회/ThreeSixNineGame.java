package �ǽ�����2ȸ;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class ThreeSixNineGame {

public static void main(String[] args) {

   //�غ�ܰ�
	String inputNum;
	int count =0;
	int noOf369_count = 0;
	
	//�Է� �ܰ�
	System.out.print("1~9999������ ���� �Է��ϼ���>>>");
	Scanner scan = new Scanner(System.in);
	inputNum = scan.next();
	
	//ó���ܰ�
	if(inputNum.length()<=4) {
		for(int i=0; i<inputNum.length();i++) {
			if(inputNum.charAt(i)-48==6 || inputNum.charAt(i)-48==6
					                    || inputNum.charAt(i)-48==9){
					                    	
					count = count + 1;                    }
		
	
		if(inputNum.charAt(i)-48!=3 || inputNum.charAt(i)-48!=6
                                    || inputNum.charAt(i)-48!=9){
                	
			noOf369_count= noOf369_count + 1;                    }
	
	 
	}
	
    
	if(count>0) {
		System.out.print("�ڼ�");
		for(int j=0; j<count; j++) {
			System.out.print("¦");
		}
	}
     if(noOf369_count>0&&count==0) {
    	 System.out.println("�ԷµȰ��� 369�� ���Ե��� �ʾҽ��ϴ�.");}
	
	
	
	
	
	if(inputNum.length()>4) {
		System.out.println("�Էµ� ���� ������ �ʰ��߽��ϴ�.");
	}
	
	
	
	}}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
System.out.print("1~9999������ ���� �Է�>>>");

        String[]tsn = new String[4];
        Scanner scan = new Scanner(System.in);
String [] rule = {"3","6","9"};



for(int i = 0; i<4; i++) {
tsn[i] = scan.next();
System.out.print("�ڼ�");
for(int j = 0; j<3; j++) {
 
Pattern p = Pattern.compile(rule[j]);
   Matcher m = p.matcher(tsn[i]);
   
while(m.find()){
System.out.print("¦");

}
}
if(!(tsn.equals(rule))) {
System.out.println("�Էµ� ���� 3,6,9�� �����ϴ�.");
}
}

*/

