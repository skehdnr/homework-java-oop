package bean;

public class MemberBean {
	private String name,id,pass,ssd,bt;
	private Double weight,height;
	
	public void setName(String name) {
		this.name = name;
	}public String getName() {
		return this.name;
	}public void setId(String id) {
		this.id = id;
	}public String getId() {
		return this.id;
	}public void setPass(String pass) {
		this.pass = pass;
	}public String getPass() {
		return this.pass;
	}public void setSsd(String ssd) {
		this.ssd = ssd;
	}public String getSsd() {
		return this.ssd;
	}public void setBt(String bt) {
		this.bt = bt;
	}public String getBt() {
		return this.bt;
	}public void setWeight(Double weight) {
		this.weight = weight;
	}public Double weight() {
		return this.weight;
	}public void setHeight(Double height) {
		this.height = height;
	}public Double getHeight() {
		return this.height;
	}
	
	public String toString() {
		
		return String.format("== 회원정보 == \n"
				+ "이름 : %s \n"
				+ "아이디 : %s \n"
				+ "비밀번호 : %s \n"
				+ "주민번호 : %s \n"
				+ "혈액형 : %s \n"
				+ "키 : %s cm\n"
				+ "몸무게 : %s kg",name,id,pass,ssd,bt,height,weight);
	}
	

}
