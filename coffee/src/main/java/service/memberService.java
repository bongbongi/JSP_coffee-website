package service;

import java.util.List;

import domain.memberVO;

public interface memberService {

	int insert(memberVO mvo);

	memberVO loginOk(memberVO mvo);

	int update(memberVO mvo);

	int delete(String id);

	List<memberVO> getList();

}
