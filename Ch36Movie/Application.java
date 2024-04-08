package Ch36Prac;


import java.util.Map;


import Ch36Prac.Controller.FrontController;
import Ch36Prac.Domain.Dto.MemberDto;
import Ch36Prac.Domain.Service.MemberServiceImpl;


public class Application {
	public static void main(String[] args) throws Exception {
		// 1
		FrontController controller = new FrontController();
//		Map<String,Object> params = new HashMap();
//		params.put("MovieDto", new MovieDto(2219,"이것이C언어다","EASY",false,"대구","4시"));
//		Map<String,Object> result = controller.execute("/movie", 1, params);

		// 2
//		MovieDaoImpl dao = new MovieDaoImpl();
//		dao.Insert(new MovieDto(1,"웡키","스릴러",true,"경산","202020202"));
//		dao.Insert(new MovieDto(2,"웡키","스릴러",true,"경산","202020202"));
//		dao.Insert(new MovieDto(3,"웡키","스릴러",true,"경산","202020202"));
		
		// 3
//		List<MovieDto> list = dao.SelectAll();
//		list.forEach(dto->{
//			System.out.println(dto);
//		});
//		System.out.println();
//		MovieDto dto = dao.Select(2);
//		System.out.println(dto);
		
		// 4
//		MovieServiceImpl service = new MovieServiceImpl();
//		List<MovieDto> list = service.getAllMovies();
//		list.forEach(dto->{
//			System.out.println(dto);
//		});
//		
		// 5 
//		FrontController controller = new FrontController();
//		Map<String,Object> params = new HashMap();
//		params.put("MovieDto", new MovieDto(123564,"웡키","스릴러",true,"경산","202020202"));
//		Map<String,Object> result = controller.execute("/movie", 1, params);
//		Object response = result.get("response");
		
		// 6
//		UserDaoImpl dao = new UserDaoImpl();
//		dao.Insert(new UserDto("user1","1234","홍길동","주소","55555555",5555555));
		
		// update
		// delete
		// select
		// selectAll
		// select 영화 제목 String
		
//		MemberDaoImpl dao = new MemberDaoImpl();
//		dao.Insert(new MemberDto("user2", "1234", "user1", "대구", "555555", 500,"admin"));
		

		//07
//		MemberServiceImpl service = new MemberServiceImpl();
//		service.MemberJoin(new MemberDto("user3", "1234", "user1", "대구", "555555", 500,"admin"));
		
//		FrontController controller = new FrontController();		
//		Map<String,Object> params= new HashMap();
//		params.put("MemberDto",new MemberDto("user3", "1234", "user1", "대구", "555555", 500,"admin"));
//		controller.execute("/member", 1, params);
		
		MemberServiceImpl service = new MemberServiceImpl();
//		service.MemberJoin(new MemberDto("user4", "1234", "user1", "대구", "555555", 500,"admin"));
		
		Map<String,Object>  islogin3= service.login("user1","1234", 0);
		System.out.println("islogin3 : " + islogin3);
		Integer mySessionId = (Integer)islogin3.get("sessionId");
		
		
		
		
		// 시간별 제목 장르 예매가능여부 장소
		
	}
}
