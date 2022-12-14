package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.memberVO;
import orm.DatabaseBuilder;

public class memberDAOImpl implements memberDAO {
	private SqlSession sql;
	private final String NS = "memberMapper.";
	private int isOk;
	private Logger Log = LoggerFactory.getLogger("memberDAOImpl");
	
	public memberDAOImpl() {
		new DatabaseBuilder();
		sql=DatabaseBuilder.getFactory().openSession();
	}

	@Override
	public int insert(memberVO mvo) {
		Log.info("insert check 3");
		isOk = sql.insert(NS+"insert",mvo);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public memberVO selectOne(memberVO mvo) {
		Log.info("loginOk check 3");
		return sql.selectOne(NS+"login",mvo);
	}

	@Override
	public int updateOne(memberVO mvo) {
		Log.info("update check 3");
		isOk = sql.update(NS+"update",mvo);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public int deleteOne(String id) {
		Log.info("회원탈퇴 check 3");
		isOk = sql.delete(NS+"delete",id);
		System.out.println(id);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public List<memberVO> getList() {
		return sql.selectList(NS+"list");
	}
	
	
}
