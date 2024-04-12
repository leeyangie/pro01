package org.ui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ui.dto.Notice;

public class NoticeDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<Notice> getNotiList(){
		List<Notice> notiList = new ArrayList<>();
		
		MySQLDB mysql = new MySQLDB();
		try {
			con = mysql.connect();
			try {
				pstmt = con.prepareStatement(SqlLang.SELECT_ALL_NOTICE);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Notice noti = new Notice(rs.getInt("no"),
							rs.getString("title"),
							rs.getString("contents"),
							rs.getString("resdate"),
							rs.getString("author"),
							rs.getInt("visited"));
					notiList.add(noti);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} catch(Exception e) {
			 
		}finally {
				mysql.close(con, pstmt, rs);
	}
	return notiList;
	}
	
	
	public Notice getNotice(int no) {
		Notice noti = new Notice();
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.VISITED_UPD_NOTICE);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			pstmt = null;
			pstmt = con.prepareStatement(SqlLang.SELECT_NOTICE_BYNO);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				noti.setNo(rs.getInt("no"));
				noti.setTitle(rs.getString("title"));
				noti.setContents(rs.getString("contents"));
				noti.setResdate(rs.getString("resdate"));
				noti.setResdate(rs.getString("author"));
				noti.setVisited(rs.getInt("visited"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt, rs);
		}
		return noti;
	}
	
	
	public int insNotice(Notice noti) {
		int cnt = 0;
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.INS_NOTICE);
			pstmt.setString(1, noti.getTitle());
			pstmt.setString(2, noti.getContents());
			cnt = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt);
		}
		return cnt;
	}
	
	
	
	public int editProNotice(Notice noti) {
		int cnt = 0;
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.UPD_NOTICE);
			pstmt.setString(1, noti.getTitle());
			pstmt.setString(2, noti.getContents());
			pstmt.setInt(3, noti.getNo());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt);
		}
		return cnt;
	}
	
	public int delNotice(int no) {
		int cnt = 0;
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.DEL_NOTICE);
			pstmt.setInt(1, no);
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt);
		}
		return cnt;
	}
	
	public Notice getNotice2(int no) {
		Notice noti = new Notice();
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.VISITED_UPD_NOTICE);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			pstmt = null;
			pstmt = con.prepareStatement(SqlLang.SELECT_NOTICE_BYNO);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				noti.setNo(rs.getInt("no"));
				noti.setTitle(rs.getString("title"));
				noti.setContents(rs.getString("contents"));
				noti.setResdate(rs.getString("resdate"));
				noti.setResdate(rs.getString("author"));
				noti.setVisited(rs.getInt("visited"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mysql.close(con, pstmt, rs);
		}
		return noti;
	}
}