package ch14.exam06;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		// 생성자 참조, 잘안쓴다
		createMember(new FunctionalInterface() {
			@Override
			public Member createMember(String mid, String mname) {
				Member member = new Member(mid, mname);
				return member;
			}
		});
		createMember(new FunctionalInterface() {
			@Override
			public Member createMember(String mid, String mname) {
				return new Member(mid, mname);
				
			}
		});
		createMember((mid, mname)->{
			return new Member(mid, mname);
		});
		createMember((mid, mname)-> new Member(mid, mname));
		createMember(Member :: new); // 생성자 참조
		
		
	}
	public static void createMember(FunctionalInterface i){
		Member member = i.createMember("white", "홍길동");
	}
}
