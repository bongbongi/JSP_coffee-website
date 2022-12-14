package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.memberVO;
import repository.memberDAO;
import repository.memberDAOImpl;

public class memberServiceImpl implements memberService {
	private memberDAO mdao ;
	private Logger Log = LoggerFactory.getLogger("memberServiceImpl.class");
	public memberServiceImpl() {
    	mdao = new memberDAOImpl();
    }
	@Override
	public int insert(memberVO mvo) {
		Log.info("insert check 2");
		return mdao.insert(mvo);
	}
	@Override
	public memberVO loginOk(memberVO mvo) {
		Log.info("loginOk check 2");
		return mdao.selectOne(mvo);
	}
	@Override
	public int update(memberVO mvo) {
		Log.info("update check 2");
		return mdao.updateOne(mvo);
	}
	@Override
	public int delete(String id) {
		//회원 삭제되면 글도 같이 삭제
		boardServiceImpl bsv = new boardServiceImpl();
		int isOk = bsv.removeAll(id);
		
		Log.info("회원탈퇴 check 2");
		return mdao.deleteOne(id);
	}
	@Override
	public List<memberVO> getList() {
		return mdao.getList();
	}
	
	
}
