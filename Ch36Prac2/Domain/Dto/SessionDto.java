package Ch36Prac.Domain.Dto;

public class SessionDto {
	private int sessionId;
	private String membername;
	private String role;
	//toString
	//getter and setter
	//생성자(디폴트,모든인자)
	@Override
	public String toString() {
		return "SessionDto [sessionId=" + sessionId + ", membername=" + membername + ", role=" + role + "]";
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public SessionDto(int sessionId, String id, String role) {
		super();
		this.sessionId = sessionId;
		this.membername = membername;
		this.role = role;
	}
	public SessionDto() {}
	
	
}
