package Ch36Prac.Domain.Dao;

import Ch36Prac.Domain.Dto.MemberDto;

public interface MemberDao {

	//INSERT
	boolean Insert(MemberDto dto) throws Exception;

	MemberDto Select(String id) throws Exception;

}