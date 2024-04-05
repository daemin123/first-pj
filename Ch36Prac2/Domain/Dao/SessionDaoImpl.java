package Ch36Prac.Domain.Dao;

import java.util.ArrayList;
import java.util.List;

import Ch36Prac.Domain.Dto.SessionDto;

public class SessionDaoImpl extends CommonDao implements  SessionDao{
	
	
	private static SessionDao instance;
	
	public static SessionDao getInstance() throws Exception {
		if(instance==null)
			instance=new SessionDaoImpl();
		return instance;
	}
	
	public SessionDaoImpl() throws Exception{
		System.out.println("[DAO] SessionDaoImpl's INIT" + conn);
	}
	
	//SESSION용
	@Override
	public boolean Insert(SessionDto sessionDto) throws Exception {
		pstmt =  conn.prepareStatement("insert into session values(null,?,?)");
		pstmt.setString(1, sessionDto.getMembername());
		pstmt.setString(2, sessionDto.getRole());
		int result = pstmt.executeUpdate();
		freeConnection(pstmt);
		return result>0;
	}
	
	@Override
	public SessionDto Select(int sessiondId) throws Exception {
		pstmt = conn.prepareStatement("select * from session where sessionId=?");
		pstmt.setInt(1,sessiondId);
		rs=pstmt.executeQuery();
		SessionDto dto=null;
		if(rs!=null) {
			rs.next();
			dto=new SessionDto();
			dto.setMembername(rs.getString("membername"));
			dto.setRole(rs.getString("role"));
			dto.setSessionId(rs.getInt("sessionId"));
		}
		freeConnection(pstmt,rs);
		return dto;
	}
	@Override
	public SessionDto Select(String membername) throws Exception {
		pstmt = conn.prepareStatement("select * from session where membername=?");
		pstmt.setString(1,membername);
		rs=pstmt.executeQuery();
		SessionDto dto=null;
		if(rs!=null) {
			rs.next();
			dto=new SessionDto();
			dto.setMembername(rs.getString("membername"));
			dto.setRole(rs.getString("role"));
			dto.setSessionId(rs.getInt("sessionId"));
		}
		freeConnection(pstmt,rs);
		return dto;
	}

	@Override
	public boolean Delete(int sessionId) throws Exception {
		pstmt = conn.prepareStatement("delete from session where sessionId=?");
		pstmt.setInt(1, sessionId);
		int result = pstmt.executeUpdate();
		freeConnection(pstmt);
		return  result>0;
	}
	// SelectAll
	@Override
	public List<SessionDto> SelectAll() throws Exception {
		pstmt=conn.prepareStatement("select * from session");
		rs = pstmt.executeQuery();
		List<SessionDto> list = new ArrayList();
		SessionDto dto = null;
		if(rs!= null) {
			while (rs.next()) {
				dto = new SessionDto();
				dto.setMembername(rs.getString("membername"));
				dto.setSessionId(rs.getInt("sessionId"));
				dto.setRole(rs.getString("role"));
				list.add(dto);
			}
		}
		freeConnection(pstmt,rs);
		return list;
	}	
	
	
	
}
