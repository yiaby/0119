package 폰추상클래스설계;



	
	public class SmartPhone extends Phone {

		   public SmartPhone(String owner) {
		      super(owner); // 폰의 생성자를 호출

		   }

		   public void internetsearch() {
		      System.out.println("자동 응답을 합니다.");
		   }

		}
	
	
	
	
	
	
	
	/*	public SmartPhone () {
        super("손흥민");
    }
		@Override
		public void using() {
			System.out.println("인터넷 검색을 합니다.");
		}
*/		