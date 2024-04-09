package org.ui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ui.dto.Member;

public class MemberDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<Member> getMemberList(){
		List<Member> memList = new ArrayList<Member>();
		
		MySQLDB mysql = new MySQLDB();
		
			con = mysql.connect();
			try {
				pstmt = con.prepareStatement(SqlLang.SELECT_ALL_MEMBER);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Member mem = new Member(
							rs.getString("name"),
							rs.getString("id"),
							rs.getString("pw"),
							rs.getInt("birth"),
							rs.getString("adrress"),
							rs.getString("tel"));
					memList.add(mem);
				}
			
			} catch(Exception e) {
			 
			}finally {
				mysql.close(con, pstmt, rs);
			}
			return memList;
	}
	
	public Member getMember(String id) {
		Member mem = new Member();
		MySQLDB mysql = new MySQLDB();
		
			con = mysql.connect();
			try {
				pstmt = con.prepareStatement(SqlLang.SELECT_ONE_MEMBER);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					mem.setName(rs.getString("name"));
					mem.setId(rs.getString("id"));
					mem.setPw(rs.getString("pw"));
					mem.setBirth(rs.getInt("birth"));
					mem.setAddress(rs.getString("adrress"));
					mem.setTel(rs.getString("tel"));
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				mysql.close(con, pstmt, rs);
			}
			return mem;
	}
	
	public int join(Member mem) {
		int cnt = 0;
		MySQLDB mysql = new MySQLDB();
		
		try {
			con = mysql.connect();
			pstmt = con.prepareStatement(SqlLang.INS_MEMBER);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
		
	}


