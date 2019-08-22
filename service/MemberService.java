package service;

import bean.MemberBean;

/**
 * 요구사항(기능정의) 
 * <사용자기능>
 *  1.회원가입
 *  2.마이페이지 
 *  ********** 
 *  <관리자기능> 
 * 3.회원목록
 * 4.아이디검색
 * 5.비밀번호 검색
 */
public class MemberService {
	private MemberBean[] members;
	private int count;
	
	public MemberService() {
		members = new MemberBean[3];
		count = 0;
	}
	public String join(MemberBean param) {
		String result = "가입성공";
		members[count] = param;
		count++;
		return result;
	}
	public String getMypage(MemberBean param) {
		String result = "회원정보";
		return param.toString();
	}
	public String list() {
		String result = "";
		for(int i=0; i<count;i++) {
			result += members[i].toString()+", \n";
		}
		return result;
	}
	public MemberBean findId(String id) {
		MemberBean member = new MemberBean();
		for(int i =0; i<count;i++) {
			if(id.equals(members[i].getId())){
				member = members[i];
			}
		}return member;
	}
	
	public MemberBean findPass(String pass) {
		MemberBean member = new MemberBean();
		for(int i=0;i<count;i++) {
			if(pass.equals(members[i].getPass())){
			member = members[i];
			}
		}
		return member;
	}
	
}
