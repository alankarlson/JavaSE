package section16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * id	name	mobile			addr 
 * 1	홍길동		01011113333		서울특별시
 * 2	짱구		01029293838		떡잎마을
 * 3	둘리		01033331313		쌍문동
 * 	
 */
public class Collection05 {
	public static void main(String[] args) {
		
		//map을 각각 하나의 구성요소로 가진 리스트 선언
		List<Map<String, Object>> memberList = new ArrayList<Map<String, Object>>();
		
		// value는 형이 다양하므로 Object로 선언
		Map<String, Object> member1 = new HashMap<String, Object>();
		Map<String, Object> member2 = new HashMap<String, Object>();
		Map<String, Object> member3 = new HashMap<String, Object>();
		
		//map에 저장
		member1.put("id", 1);
		member1.put("name", "홍길동");
		member1.put("mobile", "01011113333");
		member1.put("addr", "서울특별시");
		
		member2.put("id", 2);
		member2.put("name", "짱구");
		member2.put("mobile", "01029293838");
		member2.put("addr", "떡잎마을");
		
		member3.put("id", 3);
		member3.put("name", "둘리");
		member3.put("mobile", "01033331313");
		member3.put("addr", "쌍문동");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		System.out.println("no\tname\tmobile\taddr");
		for (Map<String, Object> member : memberList) {
			int id = (int) member.get("id");
			String name = (String) member.get("name");
			String mobile = (String) member.get("mobile");
			String addr = (String) member.get("addr");
			
			System.out.println(id + "\t" + name + "\t" + mobile + "\t" + addr);
			
		}
		
	}

}
