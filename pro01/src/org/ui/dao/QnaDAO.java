package org.ui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ui.dto.Notice;
import org.ui.dto.Qna;

public class QnaDAO {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<Qna> getLatestQnaList(){
		List<Qna> qList = new ArrayList<>();
		
		MySQLDB mysql = new MySQLDB();
		try {
			con = mysql.connect();
			try {
				pstmt = con.prepareStatement(MySQLDB.LATEST_QNA);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Qna q = new Qna(rs.getInt("no"),
							rs.getString("plevel"),
							rs.getInt("parno"),
							rs.getString("title"),
							rs.getString("contents"),
							rs.getString("resdate"),
							rs.getString("author"),
							rs.getInt("visited"));
					qList.add(q);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} catch(Exception e) {
			 
		}finally {
				mysql.close(con, pstmt, rs);
	}
	return qList;
	}
	
	public List<Qna> getQnaList(){
		List<Qna> qList = new ArrayList<>();
		
		MySQLDB mysql = new MySQLDB();
		try {
			con = mysql.connect();
			try {
				pstmt = con.prepareStatement(SqlLang.SELECT_ALL_QNA);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Qna q = new Qna(rs.getInt("no"),
							rs.getString("plevel"),
							rs.getInt("parno"),
							rs.getString("title"),
							rs.getString("contents"),
							rs.getString("resdate"),
							rs.getString("author"),
							rs.getInt("visited"));
					qList.add(q);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} catch(Exception e) {
			 
		}finally {
				mysql.close(con, pstmt, rs);
	}
	return qList;
	}
	
	public Qna getQna(int no) {
		Qna q = new Qna();
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.VISITED_UPD_QNA);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			pstmt = null;
			pstmt = con.prepareStatement(SqlLang.SELECT_QNA_BYNO);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				q.setNo(rs.getInt("no"));
				q.setPlevel(rs.getString("plevel"));
				q.setParno(rs.getInt("parno"));
				q.setTitle(rs.getString("title"));
				q.setContents(rs.getString("contents"));
				q.setResdate(rs.getString("resdate"));
				q.setAuthor(rs.getString("author"));
				q.setVisited(rs.getInt("visited"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt, rs);
		}
		return q;
	}
	
	
	public int insQuestion(Qna q) {
		int cnt = 0;
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(MySQLDB.INS_QUESTION);
			pstmt.setString(1, q.getTitle());
			pstmt.setString(2, q.getContents());
			pstmt.setString(3, q.getAuthor());
			cnt = pstmt.executeUpdate();
			
			pstmt = null;
			pstmt = con.prepareStatement(MySQLDB.UPD_PARNO_QUESTION);
			cnt = cnt + pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt);
		}
		return cnt;
	}
	
	public int insAnswer(Qna q) {
		int cnt = 0;
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(MySQLDB.INS_ANSWER);
			pstmt.setInt(1, q.getParno());
			pstmt.setString(2, q.getTitle());
			pstmt.setString(3, q.getContents());
			pstmt.setString(4, q.getAuthor());
			cnt = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt);
		}
		return cnt;
	}
	
	
	public int editProQna(Qna q) {
		int cnt = 0;
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.UPD_QNA);
			pstmt.setString(1, q.getTitle());
			pstmt.setString(2, q.getContents());
			pstmt.setInt(3, q.getNo());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt);
		}
		return cnt;
	}
	
	public int delQuestion(int parno) {
		int cnt = 0;
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.DEL_QUESTION);
			pstmt.setInt(1, parno);
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt);
		}
		return cnt;
	}
	
	public int delAnswer(int no) {
		int cnt = 0;
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.DEL_ANSWER);
			pstmt.setInt(1, no);
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt);
		}
		return cnt;
	}
	
	public Qna getQna2(int no) {
		Qna q = new Qna();
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.SELECT_QNA_BYNO);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				q.setNo(rs.getInt("no"));
				q.setPlevel(rs.getString("plevel"));
				q.setParno(rs.getInt("parno"));
				q.setTitle(rs.getString("title"));
				q.setContents(rs.getString("contents"));
				q.setResdate(rs.getString("resdate"));
				q.setAuthor(rs.getString("author"));
				q.setVisited(rs.getInt("visited"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt, rs);
		}
		return q;
	}
}
