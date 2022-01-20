package 폰추상클래스설계;

public class PhoneTest {

	public static void main(String[] args) {
      
		Phone Phone1 = new SmartPhone();
       Phone1.use();
       
       System.out.println();
       
      
       Phone Phone2 = new TelePhone();
       Phone2.use();
       
	}

}
