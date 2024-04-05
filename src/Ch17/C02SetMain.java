package Ch17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02SetMain {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet();
		//추가
		set.add("HTML/CSS/JS"); 
		set.add("JQUERY"); 
		set.add("NODEJS"); 
		set.add("SCSS"); 
		set.add("REACT"); 
		set.add("JAVA"); 
		set.add("JSP/SERVLET"); 
		set.add("STS"); 
		set.add("SRPING BOOT"); // 삭제
		set.add("SRPING BOOT"); // 삭제
		set.add("SRPING BOOT"); // 추가
		
		//조회
		System.out.println("개수확인 : " + set.size());
		//삭제
		set.remove("STS");
		System.out.println("개수확인 : " + set.size());
		
		//전체조회(Iterator)
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("--------------");
		//
		for(String el : set) {
			System.out.println(el);
		}
		
		// 전체삭제
		
		set.clear();
		System.out.println("-------------");
		for(String el : set) {
			System.out.println(el);
		}
		
		
	}
	
}
