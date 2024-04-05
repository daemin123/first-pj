package Ch36Movie.Domain.Service;

import java.util.List;
import java.util.Map;
import Ch36Movie.Domain.Dto.MemberDto;

public interface MemberService {

    // 회원가입 메서드
    boolean MemberJoin(MemberDto dto) throws Exception;

    // 로그인 메서드
    Map<String, Object> login(String username, String password, int SessiondId) throws Exception;

    // 로그아웃 메서드
    Map<String, Object> logout(int SessionId) throws Exception;

    // 유저 정보 가져오기 메서드
    MemberDto getId(String id) throws Exception;

    // 현재 접속 중인 세션 ID 리스트를 리턴하는 메서드
    List<Integer> getSessionIdList();
    
    // 추가적으로 필요한 메서드들을 여기에 정의할 수 있습니다.
}
