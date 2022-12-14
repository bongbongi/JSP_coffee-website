package repository;

import java.util.List;

import domain.boardVO;
import domain.pagingVO;

public interface boardDAO {

	int insertOne(boardVO bvo);

	List<boardVO> getList();

	boardVO getDetail(int bno);

	int update(boardVO bvo);

	int read_countUp(int bno);

	int delete(int bno);

	int getPageCnt();

	List<boardVO> getListPageCnt(pagingVO pvo);

	List<boardVO> getHide(int bno);

	int deleteAll(String id);

	

}
