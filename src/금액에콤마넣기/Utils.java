package 금액에콤마넣기;

import java.text.DecimalFormat;

/*
 * 유틸리티 클래스란 여러 클래스에서 유용하게 "공유"해서
 * 사용할 수 있는 클래스를 의미한다.
 * DecimalFormart(String pattern)생성자 적용
 */

public class Utils {
//넘겨받은 금액에 천단위 마다 콤마
public 	static String toNumberFormat(long totalAmmount) {
	DecimalFormat df = new DecimalFormat("#,###");
	return df.format(totalAmmount);
}
/*
 * 메소드 구현방법
 * 접근 지정자(접근 가능여부)+(static)+반환 타입+메소드이름()+ {
 * 실행할 문장...}
 * ()=>대입할 타입(자료형 매개변수1,...,자료형매개변수n)
 */
//static 외부에서 class이름으로 접근할수있음
//void: returns
//return문 :분기문
	}

