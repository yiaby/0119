package 실습문제2회;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class ThreeSixNineGame {

public static void main(String[] args) {

   //준비단계
	String inputNum;
	int count =0;
	int noOf369_count = 0;
	
	//입력 단계
	System.out.print("1~9999사이의 값을 입력하세요>>>");
	Scanner scan = new Scanner(System.in);
	inputNum = scan.next();
	
	//처리단계
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
		System.out.print("박수");
		for(int j=0; j<count; j++) {
			System.out.print("짝");
		}
	}
     if(noOf369_count>0&&count==0) {
    	 System.out.println("입력된값은 369가 포함되지 않았습니다.");}
	
	
	
	
	
	if(inputNum.length()>4) {
		System.out.println("입력된 값이 범위를 초과했습니다.");
	}
	
	
	
	}}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
System.out.print("1~9999사이의 값을 입력>>>");

        String[]tsn = new String[4];
        Scanner scan = new Scanner(System.in);
String [] rule = {"3","6","9"};



for(int i = 0; i<4; i++) {
tsn[i] = scan.next();
System.out.print("박수");
for(int j = 0; j<3; j++) {
 
Pattern p = Pattern.compile(rule[j]);
   Matcher m = p.matcher(tsn[i]);
   
while(m.find()){
System.out.print("짝");

}
}
if(!(tsn.equals(rule))) {
System.out.println("입력된 값에 3,6,9가 없습니다.");
}
}

*/

