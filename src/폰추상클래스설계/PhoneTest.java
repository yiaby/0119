package ���߻�Ŭ��������;

public class PhoneTest {

	public static void main(String[] args) {
      SmartPhone smartPhone = new SmartPhone("����� ������");
		
      System.out.println(smartPhone.owner);
      smartPhone.turnOn();
      smartPhone.internetsearch();
      smartPhone.turnOff();
      
      System.out.println();
      
      TelePhone telePhone = new TelePhone("�̰��� ������");
      
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
	
