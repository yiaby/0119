package ���߻�Ŭ��������;

public abstract class Phone {
	
	
	String owner; 
	public Phone(String owner) {
		this.owner=owner;
     System.out.println(owner+"��");
	}
	//�߻� �޼ҵ� ����
	public abstract void using();
	
	//�Ϲݸ޼ҵ� ����
	 public void turnOn() {
		System.out.println("������ �մϴ�.");
		
	}

	 public void turnOff() {
		System.out.println("������ ���ϴ�.");}
        
	
		final public void use() {
			turnOn();
			using();
			turnOff();
}

}
