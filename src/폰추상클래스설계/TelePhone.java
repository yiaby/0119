package 폰추상클래스설계;


	
	
	public class TelePhone extends Phone {

		   public TelePhone(String owner) {
		      super(owner); // 폰의 생성자를 호출

		   }

		   public void auto() {
		      System.out.println("자동 응답을 합니다.");
		   }

		}
	
	
	
	//public TelePhone() {
      //  super("이강민");
   // }

		
		//@Override
		//public void using() {
	   // System.out.println("자동 응답을 합니다.");
		//}
	//}

	
		
	


