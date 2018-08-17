package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DBUtil;

public class memberDAO {
	
/*	public int join(member member) {
		String SQL= "insert into member values (?,?,?,?,?,?)";
		try {
			pstmt= conn.prepareStatement(SQL);
			pstmt.setString(1, member.getMemberID());
			pstmt.setString(2, member.getMemberPassword());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberCountry());
			pstmt.setString(5, member.getMemberEmail());
			pstmt.setString(6, member.getMemberGender());
			
			return pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}*/
	
	public static String loginCheck(String memberID, String memberPassword) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String name = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select memberName from member where memberID=? and memberPassword=?");
			
			pstmt.setString(1, memberID);
			pstmt.setString(2, memberPassword);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				name = rset.getString(1);
			}
			
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		return name;
	}
	
	public static int join(String memberID, String memberPassword,String memberName, String memberCountry,String memberEmail, String memberGender) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
			try {
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement("insert into member values (?,?,?,?,?,?)");
				pstmt.setString(1, memberID);
				pstmt.setString(2, memberPassword);
				pstmt.setString(3, memberName);
				pstmt.setString(4, memberCountry);
				pstmt.setString(5, memberEmail);
				pstmt.setString(6, memberGender);
				
				return pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		return -1;
		}
		
		
	}

