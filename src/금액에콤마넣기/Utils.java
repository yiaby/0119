package �ݾ׿��޸��ֱ�;

import java.text.DecimalFormat;

/*
 * ��ƿ��Ƽ Ŭ������ ���� Ŭ�������� �����ϰ� "����"�ؼ�
 * ����� �� �ִ� Ŭ������ �ǹ��Ѵ�.
 * DecimalFormart(String pattern)������ ����
 */

public class Utils {
//�Ѱܹ��� �ݾ׿� õ���� ���� �޸�
public 	static String toNumberFormat(long totalAmmount) {
	DecimalFormat df = new DecimalFormat("#,###");
	return df.format(totalAmmount);
}
/*
 * �޼ҵ� �������
 * ���� ������(���� ���ɿ���)+(static)+��ȯ Ÿ��+�޼ҵ��̸�()+ {
 * ������ ����...}
 * ()=>������ Ÿ��(�ڷ��� �Ű�����1,...,�ڷ����Ű�����n)
 */
//static �ܺο��� class�̸����� �����Ҽ�����
//void: returns
//return�� :�б⹮
	}

