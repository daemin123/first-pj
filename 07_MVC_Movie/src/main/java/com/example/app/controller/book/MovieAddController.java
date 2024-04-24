package com.example.app.controller.book;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.SubController;
import com.example.app.domain.common.dao.common.ConnectionPool;
import com.example.app.domain.common.dto.MovieDto;
import com.example.app.domain.common.service.MovieService;
import com.example.app.domain.common.service.MovieServiceImpl;

public class MovieAddController implements SubController{

	private MovieService movieService;
	private ConnectionPool connectionPool;
	
	public MovieAddController(){
		
		try {
			
			movieService = MovieServiceImpl.getInstance();
			connectionPool = ConnectionPool.getInstance();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("MovieAddController's execute() invoke ");
		
		try {
			
			//GET 요청
			String method = request.getMethod();
			if(method.contains("GET")) {
				request.getRequestDispatcher("/WEB-INF/view/book/add.jsp").forward(request, response);
				return ;
			}
			
			//POST 요청(etc Method)
			//1
			String 영화_ID = request.getParameter("영화_ID");
			String 영화제목 = request.getParameter("영화제목");
			String 영화장르 = request.getParameter("영화장르");
			String 영화예매여부 = request.getParameter("영화예매여부");
			String 상영장소 = request.getParameter("상영장소");
			String 상영시간 = request.getParameter("상영시간");
			
			//2
			if(!isValid(영화_ID,영화제목,영화장르,영화예매여부,상영장소,상영시간)) {		
				
				return ;
			}
			
			//3
			MovieDto movieDto = new MovieDto(Integer.parseInt(영화_ID),영화제목,영화장르,Boolean.parseBoolean(영화예매여부),상영장소,상영시간);
			
			boolean isadded = MovieService.movieRegister(movieDto);
				
			//4
			if(isadded) {
				
				response.sendRedirect(request.getContextPath()+ "/book/list"); 
				
			}else {
				
				request.getRequestDispatcher("/WEB-INF/view/book/add.jsp").forward(request, response);
				
			}
		
			
		}catch(Exception e) {
			e.printStackTrace();
			//예외페이지로 넘기기..or new ServletException("message") 처ㅣ
			
			try {
				connectionPool.txRollBack();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}

	private boolean isValid(String 영화_ID, String 영화제목, String 영화장르, String 영화예매여부, String 상영장소, String 상영시간) {
		if(영화_ID==null) {
			return false;
		}
		if(영화_ID.isEmpty()) {
			return false;
		}
		if(영화제목==null || 영화제목.isEmpty())
			return false;
		if(영화장르==null || 영화장르.isEmpty())
			return false;
		if(영화예매여부==null || 영화예매여부.isEmpty())
			return false;
		if(상영장소==null || 상영장소.isEmpty())
			return false;
		if(상영시간==null || 상영시간.isEmpty())
			return false;
		if(Boolean.parseBoolean(영화예매여부)!=true && Boolean.parseBoolean(영화예매여부)!= false)
			return false;
		
		return true;
	}
	

}
