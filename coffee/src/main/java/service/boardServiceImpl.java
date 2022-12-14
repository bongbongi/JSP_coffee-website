package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.boardVO;
import domain.pagingVO;
import repository.boardDAO;
import repository.boardDAOImpl;

public class boardServiceImpl implements boardService {
	private Logger Log = LoggerFactory.getLogger("boardServiceImpl.class");
	private boardDAO bdao;
	
	public boardServiceImpl() {
		bdao = new boardDAOImpl();
	}

	@Override
	public int insert(boardVO bvo) {
		Log.info("글작성 check 1");
		return bdao.insertOne(bvo);
	}

	@Override
	public List<boardVO> getList() {
		return bdao.getList();
	}

	@Override
	public boardVO getDetail(int bno) {
		return bdao.getDetail(bno);
	}

	@Override
	public int update(boardVO bvo) {
		return bdao.update(bvo);
	}

	@Override
	public int read_countUp(int bno) {
		return bdao.read_countUp(bno);
	}

	@Override
	public int deleteOne(int bno) {
		return bdao.delete(bno);
	}

	@Override
	public int getPageCnt() {
		return bdao.getPageCnt();
	}

	@Override
	public List<boardVO> getListPage(pagingVO pvo) {
		return bdao.getListPageCnt(pvo);
	}

	@Override
	public List<boardVO> getHide(int bno) {
		return bdao.getHide(bno);
	}

	public int removeAll(String id) {
		return bdao.deleteAll(id);
		
	}




	
}
