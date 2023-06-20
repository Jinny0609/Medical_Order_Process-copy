package gmt.medical.model;

public class Hcode {
	private String hcode;
	private String hname;
	
	public String getHcode() {
		return hcode;
	}
	public void setHcode(String hcode) {
		this.hcode = hcode;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	
	@Override
    public String toString() {
        return getHcode(); // 실제로 출력하고자 하는 코드 값 리턴
    }
}
