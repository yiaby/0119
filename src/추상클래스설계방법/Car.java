package �߻�Ŭ����������;
//�߻�Ŭ����, �θ� Ŭ���� ����
public abstract class Car {
//�߻� �޼ҵ� ����
  public abstract void drive();
  public abstract void stop();
  
  //�Ϲ� �޼ҵ� ����
  public void startCar() {
	  System.out.println("�õ��� �մϴ�.");
  }
 public void turnoff() {
	 System.out.println("�õ��� ���ϴ�.");
  }
//[�߿�]���ø� �޼ҵ�=>������ ���� ���� �ϳ�
//run()���ø� �޼ҵ�� Car�� ��� �޷��� �ϴ����� �����ؾ� �Ѵ�.
//   => ��'�������'��'�ó�����'�� ������ �޼ҵ��̴�.
final public void run() {
	startCar();
	drive();
	stop();
	turnoff();
}

}
