package Ch36Prac.Controller;

import java.util.HashMap;
import java.util.Map;

import Ch36Prac.Domain.Dto.MovieDto;
import Ch36Prac.Domain.Service.MovieServiceImpl;

public class MovieController implements SubController {
	// 서비스 등록
	private MovieServiceImpl service;
	public MovieController() {
		try {
			service = new MovieServiceImpl();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 1 Insert , 2 Update , 3 Delete 4 SelectAll 5 Select 
	
	@Override
	public Map<String, Object> execute(int serviceNo, Map<String, Object> params) {
		System.out.println("MovieController's execute()");
		
		// 1 파라미터 받기
		// 2 입력값 검증(유호성 체크(Data), Validation Check) 
		// 3 서비스 실행
		// 4 뷰페이지로 이동(or Rest Data 전달)
		
		if(serviceNo==1) { 			// Insert
			
			// 1
			MovieDto dto= (MovieDto)params.get("MovieDto");
			System.out.println("[SC]MovieController's Insert.."+dto);
			// 2
			if (!isValid(dto)) 
				return null;
			
			// 3 서비스 실행
			boolean isRegistred = false;
			try {
				isRegistred = service.MovieRegister(dto);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 4 뷰로 전달 or 이동
			Map<String,Object> result = new HashMap();
			result.put("response", isRegistred);
			return result;
			
		}
		else if(serviceNo==2) {		// Update
			System.out.println("");
		}
		else if(serviceNo==3) {		// Delete
			System.out.println("");
		}
		else if(serviceNo==4) {		// SelectAll
			System.out.println("");
		} 
		else if(serviceNo==5) {		// SelectOne
			System.out.println("");
		}
		else {
			System.out.println("");
		}
		
		
		
		return null;
	}

	private boolean isValid(MovieDto dto) {
		// Null 체크
		// Trim 제거(앞뒤 공백 제거)
		
		return true;
	}
	
	
	
	
}
