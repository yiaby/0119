package 추상클래스설계방법;
//일반클래스, 자식 클래스 설계,실제 클래스
public class AIcars extends Car{
	 @Override
	  public void drive() {
	 System.out.println("자율 주행 합니다.");
	 System.out.println("자율 주행 자동차가 스스로 방향을 전환합니다.");}
	 @Override  
	  public void stop() {
	 System.out.println("주행을 멈춥니다.");
	 }
}