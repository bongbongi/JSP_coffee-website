package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.boardVO;
import domain.pagingVO;
import orm.DatabaseBuilder;

public class boardDAOImpl implements boardDAO {
	private Logger Log = LoggerFactory.getLogger("boardDAOImpl");
	private SqlSession sql;
	private int isOk;
	private final String NS = "boardMapper.";
	
	public boardDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}

	@Override
	public int insertOne(boardVO bvo) {
		Log.info("글작성 체크2");
		isOk = sql.insert(NS+"insert",bvo);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public List<boardVO> getList() {
		return sql.selectList(NS+"list");
	}

	@Override
	public boardVO getDetail(int bno) {
		return sql.selectOne(NS+"detail",bno);
	}

	@Override
	public int update(boardVO bvo) {
		isOk = sql.update(NS+"update",bvo);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public int read_countUp(int bno) {
		isOk = sql.update(NS+"read_countUp",bno);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public int delete(int bno) {
		isOk = sql.update(NS+"delete",bno);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public int getPageCnt() {
		return sql.selectOne(NS+"cnt");
	}

	@Override
	public List<boardVO> getListPageCnt(pagingVO pvo) {
		return sql.selectList(NS+"pagingList",pvo);
	}

	@Override
	public List<boardVO> getHide(int bno) {
		return sql.selectList(NS+"hide",bno);
	}

	@Override
	public int deleteAll(String id) {
		isOk = sql.delete(NS+"deleteAll",id);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}


			
		
}

