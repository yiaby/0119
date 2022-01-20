package 폰추상클래스설계;

public class SmartPhone extends Phone {

	public SmartPhone () {
        super("손흥민");
    }
		@Override
		public void using() {
			System.out.println("인터넷 검색을 합니다.");
		}
	}