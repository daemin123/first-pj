package Ch36Prac.Domain.Dao;

import java.util.List;

import Ch36Prac.Domain.Dto.SessionDto;

public interface SessionDao {

	//SESSION용
	boolean Insert(SessionDto sessionDto) throws Exception;

	SessionDto Select(int sessiondId) throws Exception;

	SessionDto Select(String id) throws Exception;

	boolean Delete(int sessionId) throws Exception;

	// SelectAll
	List<SessionDto> SelectAll() throws Exception;

}