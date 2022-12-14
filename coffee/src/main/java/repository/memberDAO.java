package repository;

import java.util.List;

import domain.memberVO;

public interface memberDAO {

	int insert(memberVO mvo);

	memberVO selectOne(memberVO mvo);

	int updateOne(memberVO mvo);

	int deleteOne(String id);

	List<memberVO> getList();

}
