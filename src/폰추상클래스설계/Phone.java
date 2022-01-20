package 폰추상클래스설계;

public abstract class Phone {
	
	
	String owner; 
	public Phone(String owner) {
		this.owner=owner;
     System.out.println(owner+"이");
	}
	//추상 메소드 선언
	public abstract void using();
	
	//일반메소드 선언
	 public void turnOn() {
		System.out.println("전원을 켭니다.");
		
	}

	 public void turnOff() {
		System.out.println("전원을 끕니다.");}
        
	
		final public void use() {
			turnOn();
			using();
			turnOff();
}

}
