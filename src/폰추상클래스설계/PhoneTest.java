package 폰추상클래스설계;

public class PhoneTest {

	public static void main(String[] args) {
      SmartPhone smartPhone = new SmartPhone("손흥민 선수가");
		
      System.out.println(smartPhone.owner);
      smartPhone.turnOn();
      smartPhone.internetsearch();
      smartPhone.turnOff();
      
      System.out.println();
      
      TelePhone telePhone = new TelePhone("이강민 선수가");
      
      System.out.println(telePhone.owner);
      telePhone.turnOn();
      telePhone.auto();
      telePhone.turnOn();
      
	}
}

      
      
      
      /*    
      Phone Phone1 = new SmartPhone();
       Phone1.use();
       
       System.out.println();
       
      
       Phone Phone2 = new TelePhone();
       Phone2.use();
   */    
	
