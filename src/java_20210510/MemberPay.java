package java_20210510;

public class MemberPay {
	private int seq;
	private int group;
	private String name;
	private int price;
	private boolean valid;
	private String status;
	private String sdate;
	private String edate;
	private String regdate;

//	seq의 setter => seq를 수정할 때 사용
	public void setSeq(int seq) {
//		this.를 사용한 이유는 로컨 변수와 멤버변수를 구분하기 위해서 사용
		this.seq = seq; //왼쪽은 멤버 변수고 오른쪽은 로컨 변수
	}
//	seq의 getter => seq의 정보를 가져올 때 사용
	public int getSeq() {
		return seq;
	}
//	group의 setter
	public void setGroup(int group) {
		this.group = group;
	}
//	group의 getter
	public int getGroup() {
		return group;
	}
//	name의 setter
	public void setName(String name) {
		this.name = name;
	}
//	name의 getter
	public String getName() {
		return name;
	}
//	price의 setter
	public void setPrice(int price) {
		this.price = price;
	}
//	price의 getter
	public int getPrice() {
		return price;
	}
//	valid의 setter
	public void setValid(boolean valid) {
		this.valid = valid;
	}
//	valid의 getter => boolean의 자료형일 경우 getXXX가 아니라 isXXX으로 생성한다.
	public boolean isValid() {
		return valid;
	}
//	status의 setter
	public void setStatus(String status) {
		this.status = status;
	}
//	status의 getter
	public String getStatus() {
		return status;
	}
//	sdate의 setter
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
//	sdate의 getter
	public String getSdate() {
		return sdate;
	}
//	edate의 setter
	public void setEdate(String edate) {
		this.edate = edate;
	}
//	edate의 getter
	public String getEdate() {
		return edate;
	}
//	re의 setter
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
//	price의 getter
	public String getRegdate() {
		return regdate;
	}
	
	
	
}
