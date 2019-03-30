package org.sijin.book.chap3;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	Map<String,Member> map=new HashMap<>();
	/**
	 * �̸��Ϸ� ȸ�� ���� ������
	 */
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}

	/**
	 * ȸ������ ����
	 */
	public void insert(Member member) {
		map.put(member.getEmail(), member);
}
	
}