package org.ui.dao;

public interface SqlLang {
	

	String SELECT_ALL_NOTICE = "select * from notice order by resdate desc";
	String SELECT_NOTICE_BYNO = "select * from notice where no=?";
	String INS_NOTICE = "insert into notice values(default, ?, ?, current_timestamp, '관리자', 0)";
	String UPD_NOTICE = "update notice set title=?, contents=? where no=?";
	String VISITED_UPD_NOTICE = "update notice set visited=visited+1 where no=?";
	String DEL_NOTICE = "delete from notice where no=?";
	
	String SELECT_ALL_MEMBER = "select * from member order by id";
	String SELECT_ONE_MEMBER = "select * from member where id=?";
	String INS_MEMBER = "insert into member values(?,?,?,?,?)";
	String UPD_MEMBER = "update member set pw=?,name=?,email=?,tel=? where id=?";
	String DEL_MEMBER = "delete from member where id=?";
	
	String SELECT_QNA_BYNO = "select * from";
	String SELECT_ALL_QNA = "select *from qna order by parno desc, plevel asc";
	String DEL_ANSWER = "delet from qna where no=?";
	String DEL_QUESTION = "delet from qna where parno=?";
	String VISITED_UPD_QNA = null;
	String UPD_QNA = null;
	

}
