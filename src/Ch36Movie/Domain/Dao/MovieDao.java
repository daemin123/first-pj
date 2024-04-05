package Ch36Movie.Domain.Dao;

import java.util.List;

import Ch36Movie.Domain.Dto.MovieDto;

public interface MovieDao {
	
	//INSERT
	boolean Insert(MovieDto dto) throws Exception;
	
	//SELECTALL
	List<MovieDto> selectAll() throws Exception;
	
	//SELECTONE
	MovieDto Select(int 영화_id) throws Exception;
}
