package org.sijin.book.chap04;

import java.util.HashMap;
import java.util.Map;

import org.sijin.book.chap3.Member;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

	Map<String, Member> map = new HashMap<>();

	public Member selectByEmail(String email) {
		return map.get(email);
	}

	public void insert(Member member) {
		map.put(member.getEmail(), member);
	}
}