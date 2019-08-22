package controller;

import javax.swing.JOptionPane;

import bean.MemberBean;
import service.MemberService;

public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberService();
		MemberBean member = null;

		while (true) {
			switch (JOptionPane.showInputDialog(
					"0.종료 \n" + "1.회원가입 \n" + "2.회원정보 \n" + "3.회원목록 \n" + "4.아이디찾기 \n" + "5.비밀번호 찾기")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				String spec = JOptionPane.showInputDialog("이름, 아이디, 비밀번호, " + "주민번호, 혈액형, 키, 몸무게");
				String[] arr = spec.split(",");
				member = new MemberBean();
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPass(arr[2]);
				member.setSsd(arr[3]);
				member.setBt(arr[4]);
				member.setHeight(Double.parseDouble(arr[5]));
				member.setWeight(Double.parseDouble(arr[6]));
				JOptionPane.showMessageDialog(null, service.join(member));
				break;

			case "2":
				JOptionPane.showMessageDialog(null, service.getMypage(member));
				break;

			case "3":
				JOptionPane.showMessageDialog(null, service.list());
				break;

			case "4":
				String searchId = JOptionPane.showInputDialog("검색할 ID 입력");
				member = service.findId(searchId);
				JOptionPane.showMessageDialog(null, member);
				break;

			case "5":
				String serchPass = JOptionPane.showInputDialog("찾으려는 비밀번호 입력");
				member = service.findPass(serchPass);
				JOptionPane.showMessageDialog(null, member);
				break;
			}
		}
	}
}
