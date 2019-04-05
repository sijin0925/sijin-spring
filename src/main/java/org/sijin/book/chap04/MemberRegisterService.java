package org.sijin.book.chap04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sijin.book.chap3.DuplicateMemberException;
import org.sijin.book.chap3.Member;
import org.sijin.book.chap3.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;

	static Logger logger = LogManager.getLogger();

	public void regist(RegisterRequest req) {
		logger.debug(req);
		Member member = memberDao.selectByEmail(req.getEmail());

		if (member != null) {
			throw new DuplicateMemberException("이메일 중복 " + req.getEmail());
		}

		Member newMember = new Member(req.getEmail(), req.getPassword(),
				req.getName());
		memberDao.insert(newMember);
		logger.debug("회원 정보를 저장했습니다.");
	}
}