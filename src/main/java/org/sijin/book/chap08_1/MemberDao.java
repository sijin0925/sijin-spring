package org.sijin.book.chap08_1;

import java.util.List;

import org.sijin.book.chap3.Member;
import org.springframework.stereotype.Repository;



public interface MemberDao {

	Member selectByEmail(String email);

	void insert(Member member);

	void update(Member member);

	List<Member> selectAll(int offset, int count);
}