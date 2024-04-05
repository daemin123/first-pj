package Ch19;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C09URLStreamMain {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("https://n.news.naver.com/article/214/0001337421?cds=news_media_pc&type=editn");
		InputStream bin = url.openStream();
		
		BufferedInputStream buffin = new BufferedInputStream(bin); //보조스트림
																   //버퍼공간추가
		
		Reader in = new InputStreamReader(buffin);				   //보조스트림
		 														   // byte단위 -	> char단위로 변화해서 받음
		Writer wout = new FileWriter("c:\\tmp_io\\index.html");
		
		while(true) {
			int data = in.read();
			if(data == -1 ) {
				break;
			}
			
			wout.write((char)data);
		}
		
		
		
	}
	
	
}
