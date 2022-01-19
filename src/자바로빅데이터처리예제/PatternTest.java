package �ڹٷκ�����ó������;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		String str = "�������� ���� �ܰ�� �����м��̴�.���� �����м��� Ű���带 �����ϴ� ����� ��Ƴ��´�.";

		Pattern p = Pattern.compile("�����м�");// ����ǥ����:Regular expressions(Regex)���ڿ��� � ������ ���ڵ��� �ִ��� ã�µ� ������ �ش�.
		Matcher m = p.matcher(str);

		int count = 0;
		String word = null;
		/*
		 * find()�޼ҵ�� ������ ��ġ�ϴ� ��� true�� �����ϰ�, �׷��� ������ false�� �������ִ� �޼ҵ� group()�޼ҵ�� ��Ī��
		 * �κ��� ��ȯ(return)���ִ� �޼ҵ�
		 */
		while (m.find()) {// ���ǹ����� boolean(true or false)
			word = m.group();// word��� ��ü���� ������ ����Ű�� ���ڿ���"�����м�"�̴�.
			count++;

		}
		System.out.println("�м����: " + "������ġ");
		System.out.println(word + " " + count + "��");
		// �м����: ������ġ �����м� 2��

	}

}
