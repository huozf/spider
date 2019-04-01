package com.zf.spider;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class RiptileTest {
	
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.weimeitupian.com/meinv/page/2").get();
			Element singleDiv =  doc.getElementsByAttributeValue("class","wrapinner").first();
			
			Elements imgs = singleDiv.getElementsByTag("img");
			
			
			
			for (Element img : imgs) {
				//取src属性
				String src=img.attr("src");
				System.out.println(src);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
