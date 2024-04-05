package Ch36Movie.Domain.Dao;

import Ch36Movie.Domain.Dto.MemberDto;

public interface MemberDao {

	//INSERT
	boolean Insert(MemberDto dto) throws Exception;

	MemberDto Select(String id) throws Exception;

}