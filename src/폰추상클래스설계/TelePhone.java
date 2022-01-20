package 폰추상클래스설계;

public class TelePhone extends Phone {

	   public TelePhone() {
        super("이강민");
    }

		
		@Override
		public void using() {
			System.out.println("자동 응답을 합니다.");
		}
	}

	
		
	


