package section21;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * Jsoup
 * 	자바 오픈소스 라이브러리, HTML 문서를 파싱하고 다루는 데 사용됨
 * 
 */
public class Network04 {
	public static void main(String[] args) throws IOException {
		String url = "https://music.bugs.co.kr/chart";
		
		Document doc = Jsoup.connect(url).get();
		
		Elements musicList = doc.select("p.title"); //html 태그 안의 p클래스의 title값을 리스트로 저장
		Elements artistList = doc.select("p.artist");
		
		for(int i = 0; i < musicList.size(); i++) {
			System.out.print(i+1 + " ");
			System.out.print(musicList.get(i).text().trim() + "-");
			System.out.println(artistList.get(i).select("a").get(0).text().trim()); //artist 리스트 안의 첫번째 꺼 가져옴
		}
	}
	

}
