package service;

import java.util.List;

import domain.boardVO;
import domain.pagingVO;

public interface boardService {

	int insert(boardVO bvo);

	List<boardVO> getList();

	boardVO getDetail(int bno);

	int update(boardVO bvo);

	int read_countUp(int bno);

	int deleteOne(int bno);

	int getPageCnt();

	List<boardVO> getListPage(pagingVO pvo);

	List<boardVO> getHide(int bno);

}
