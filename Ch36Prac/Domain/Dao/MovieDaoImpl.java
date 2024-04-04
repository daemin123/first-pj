package Ch36Prac.Domain.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Ch36Prac.Domain.Dto.MovieDto;

public class MovieDaoImpl {
	private String url ="jdbc:mysql://localhost:3306/moviedb";
	private String id = "root";
	private String pw = "1234";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public MovieDaoImpl() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("[DAO] MovieDaoImpl's INIT DB Connected..");	
	}
	
	// INSERT
	public boolean Insert(MovieDto dto) throws Exception {
		pstmt = conn.prepareStatement("insert into movie values(?,?,?,?,?,?)");
		pstmt.setInt(1, dto.get영화_id());
		pstmt.setString(2, dto.get영화제목());
		pstmt.setString(3, dto.get영화장르());
		pstmt.setBoolean(4, dto.is영화예매여부());
		pstmt.setString(5, dto.get상영장소());
		pstmt.setString(6, dto.get상영시간());
		int result = pstmt.executeUpdate();
		
		pstmt.close();
		return result>0;
	}
	
	// UPDATE
	// DELETE
	// SELECTALL
	public List<MovieDto> SelectAll() throws Exception {
		pstmt = conn.prepareStatement("select * from movie");
		rs = pstmt.executeQuery();
		List<MovieDto> list = new ArrayList();
		MovieDto dto = null;
		if(rs!=null) {
			while(rs.next()) {
				dto = new MovieDto();
				dto.set영화_id(rs.getInt("영화_id"));
				dto.set영화제목(rs.getString("영화제목"));
				dto.set영화장르(rs.getString("영화장르"));
				dto.set영화예매여부(rs.getBoolean("영화예매여부"));
				dto.set상영장소(rs.getString("상영장소"));
				dto.set상영시간(rs.getString("상영시간"));
				list.add(dto);
				
			}
		}
		rs.close();
		pstmt.close();
		return list;
	}
	// SELECTONE
	public MovieDto Select(int 영화_id) throws Exception{
		pstmt = conn.prepareStatement("select * from movie where 영화_id=?");
		pstmt.setInt(1, 영화_id);
		rs = pstmt.executeQuery();
		MovieDto dto = null;
		if(rs!=null) {
				rs.next();
				dto = new MovieDto();
				dto.set영화_id(rs.getInt("영화_id"));
				dto.set영화제목(rs.getString("영화제목"));
				dto.set영화장르(rs.getString("영화장르"));
				dto.set영화예매여부(rs.getBoolean("영화예매여부"));
				dto.set상영장소(rs.getString("상영장소"));
				dto.set상영시간(rs.getString("상영시간"));
		}
		rs.close();
		pstmt.close();
		return dto;
	}
	
}
