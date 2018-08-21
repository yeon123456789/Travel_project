package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.map;
import util.DBUtil;

public class mapDAO {
	public static ArrayList<map> getAllpopular() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<map> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from mapinfo");
			rset = pstmt.executeQuery();
			
			//문제 없이 검색된 직후 실질적인 ArrayList객체 생성
			//?왜 접속 문제등이 발생될 경우엔 의미없는 객체는 안 만드는게 좋기 때문
			all = new ArrayList<>();
			while(rset.next()) {
				all.add(new map(rset.getString(1), rset.getFloat(2), rset.getFloat(3)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		return all;
	}
	
	public static ArrayList<map> getAllhistory() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<map> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from history");
			rset = pstmt.executeQuery();
			
			//문제 없이 검색된 직후 실질적인 ArrayList객체 생성
			//?왜 접속 문제등이 발생될 경우엔 의미없는 객체는 안 만드는게 좋기 때문
			all = new ArrayList<>();
			while(rset.next()) {
				all.add(new map(rset.getString(1), rset.getFloat(2), rset.getFloat(3)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		return all;
	}
	
	public static ArrayList<map> getAllculture() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<map> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from culture");
			rset = pstmt.executeQuery();
			
			//문제 없이 검색된 직후 실질적인 ArrayList객체 생성
			//?왜 접속 문제등이 발생될 경우엔 의미없는 객체는 안 만드는게 좋기 때문
			all = new ArrayList<>();
			while(rset.next()) {
				all.add(new map(rset.getString(1), rset.getFloat(2), rset.getFloat(3)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		return all;
	}
	
	public static ArrayList<map> getAlldietoeat() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<map> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from dietoeat");
			rset = pstmt.executeQuery();
			
			//문제 없이 검색된 직후 실질적인 ArrayList객체 생성
			//?왜 접속 문제등이 발생될 경우엔 의미없는 객체는 안 만드는게 좋기 때문
			all = new ArrayList<>();
			while(rset.next()) {
				all.add(new map(rset.getString(1), rset.getFloat(2), rset.getFloat(3)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		return all;
	}
	
	public static ArrayList<map> getAllleisure() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<map> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from leisure");
			rset = pstmt.executeQuery();
			
			//문제 없이 검색된 직후 실질적인 ArrayList객체 생성
			//?왜 접속 문제등이 발생될 경우엔 의미없는 객체는 안 만드는게 좋기 때문
			all = new ArrayList<>();
			while(rset.next()) {
				all.add(new map(rset.getString(1), rset.getFloat(2), rset.getFloat(3)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		return all;
	}
	
	public static ArrayList<map> getAllspringfall() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<map> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from seasons where season= 'springfall'");
			rset = pstmt.executeQuery();
			
			//문제 없이 검색된 직후 실질적인 ArrayList객체 생성
			//?왜 접속 문제등이 발생될 경우엔 의미없는 객체는 안 만드는게 좋기 때문
			all = new ArrayList<>();
			while(rset.next()) {
				all.add(new map(rset.getString(1), rset.getFloat(2), rset.getFloat(3)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		return all;
	}
	
	public static ArrayList<map> getAllsummer() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<map> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from seasons where season= 'summer'");
			rset = pstmt.executeQuery();
			
			//문제 없이 검색된 직후 실질적인 ArrayList객체 생성
			//?왜 접속 문제등이 발생될 경우엔 의미없는 객체는 안 만드는게 좋기 때문
			all = new ArrayList<>();
			while(rset.next()) {
				all.add(new map(rset.getString(1), rset.getFloat(2), rset.getFloat(3)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		return all;
	}
	
	public static ArrayList<map> getAllwinter() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<map> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from seasons where season= 'winter'");
			rset = pstmt.executeQuery();
			
			//문제 없이 검색된 직후 실질적인 ArrayList객체 생성
			//?왜 접속 문제등이 발생될 경우엔 의미없는 객체는 안 만드는게 좋기 때문
			all = new ArrayList<>();
			while(rset.next()) {
				all.add(new map(rset.getString(1), rset.getFloat(2), rset.getFloat(3)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		return all;
	}
	
}



