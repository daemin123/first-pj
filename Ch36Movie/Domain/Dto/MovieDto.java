package Ch36Prac.Domain.Dto;

public class MovieDto {
	private int 영화_id;
	private String 영화제목;
	private String 영화장르;
	private boolean 영화예매여부;
	private String 상영장소;
	private String 상영시간;
	public int get영화_id() {
		return 영화_id;
	}
	public void set영화_id(int 영화_id) {
		this.영화_id = 영화_id;
	}
	public String get영화제목() {
		return 영화제목;
	}
	public void set영화제목(String 영화제목) {
		this.영화제목 = 영화제목;
	}
	public String get영화장르() {
		return 영화장르;
	}
	public void set영화장르(String 영화장르) {
		this.영화장르 = 영화장르;
	}
	public boolean is영화예매여부() {
		return 영화예매여부;
	}
	public void set영화예매여부(boolean 영화예매여부) {
		this.영화예매여부 = 영화예매여부;
	}
	public String get상영장소() {
		return 상영장소;
	}
	public void set상영장소(String 상영장소) {
		this.상영장소 = 상영장소;
	}
	public String get상영시간() {
		return 상영시간;
	}
	public void set상영시간(String 상영시간) {
		this.상영시간 = 상영시간;
	}
	@Override
	public String toString() {
		return "MovieDto [영화_id=" + 영화_id + ", 영화제목=" + 영화제목 + ", 영화장르=" + 영화장르 + ", 영화예매여부=" + 영화예매여부 + ", 상영장소="
				+ 상영장소 + ", 상영시간=" + 상영시간 + ", get영화_id()=" + get영화_id() + ", get영화제목()=" + get영화제목() + ", get영화장르()="
				+ get영화장르() + ", is영화예매여부()=" + is영화예매여부() + ", get상영장소()=" + get상영장소() + ", get상영시간()=" + get상영시간()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public MovieDto(int 영화_id, String 영화제목, String 영화장르, boolean 영화예매여부, String 상영장소, String 상영시간) {
		super();
		this.영화_id = 영화_id;
		this.영화제목 = 영화제목;
		this.영화장르 = 영화장르;
		this.영화예매여부 = 영화예매여부;
		this.상영장소 = 상영장소;
		this.상영시간 = 상영시간;
	}
	
	public MovieDto() {
		
	}
	
	
	
	
	
	
	
}