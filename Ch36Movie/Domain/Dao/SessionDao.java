package Ch36Prac.Domain.Dao;

import java.util.List;

import Ch36Prac.Domain.Dto.SessionDto;

public interface SessionDao {

	boolean Insert(SessionDto sessionDto) throws Exception;

	SessionDto Select(int sessiondId) throws Exception;

	SessionDto Select(String username) throws Exception;

	boolean Delete(int sessionId) throws Exception;

	//SELECTALL
	List<SessionDto> SelectAll() throws Exception;
}