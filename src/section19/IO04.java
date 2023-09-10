package section19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream / OutputStream
 * 	바이트 기반 입력과 출력을 다루는 추상 클래스이다.
 * 
 * 파일 I/O Stream
 * 	FileInputStream
 * 		파일을 바이트 단위로 순차적으로 읽는 객체
 * 
 * 	FileOutputStream
 * 		파일을 바이트 단위로 순차적으로 쓰는 객체
 * 
 * 
 */
public class IO04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// ./upload/hello.txt 파일을 읽을 수 있는 객체 생성
			fis = new FileInputStream("./upload/hello.txt");			
			
			// upload2 폴더 생성
			File f1 = new File("./upload2");
			if(f1.mkdir()) {
				System.out.println("upload2 폴더가 생성되었습니다.");
			}
			
			// ./upload/hello.txt 파일에 쓰기 준비하는 객체 생성
			// 파일이 존재하지 않으면 자동으로 생성해준다. (폴더는 생성하지 않음)
			fos = new FileOutputStream("./upload2/hello2.txt");
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			// fis.read(b) --> fis가 읽으려고 대기중인 파일을 1024바이트만큼 읽어서 바이트배열 b에 저장.
			// readByteCnt --> 읽은 크기만큼 얘한테 반환, 더이상 없으면 -1 반환함
			
			while ((readByteCnt = fis.read(b)) != -1) {
				// fos에 읽은 내용 쓰기 --> b를, 0부터 읽은 바이트크기(readByteCnt)만큼.
				fos.write(b, 0, readByteCnt);
			}
			
			System.out.println("파일 복사 완료!");
		} catch (IOException e) {
			e.printStackTrace();			
		} finally {
			try {
				// 파일 닫아줌, 에러나도 종료되어야 하므로 finally 위치 주의
				// 마지막에 나온 순서대로 ㅏㄷ아줌
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			} catch(IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}
	

}
