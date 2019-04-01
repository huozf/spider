package com.zf.spider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class RiptileUtil {

	public static List<DataItem> getDataList(String category,String page) throws IOException{

		//创建数据集合
		List<DataItem> data = new ArrayList<DataItem>();

		String url="http://www.weimeitupian.com/";
		
		if(category!=null && page==null)
			url+= category;
		else if(category==null && page!=null)
			url+= "page/"+page;
		else if(category!=null && page!=null)
			url+= category+"/page/"+page;
		

		Document doc = Jsoup.connect(url).timeout(10000).get();
		Element imgDiv =  doc.getElementsByAttributeValue("class","wrapinner").first();
		Elements imgs = imgDiv.getElementsByTag("img");

		DataItem d = null;

		for(Element img:imgs){
			d = new DataItem();
			String src = img.attr("src");
			String title = img.attr("alt");
			if(src!=null && !"".equals(src)){
				d.setSrc(src);
				d.setTitle(title);
				data.add(d);
			}
		}

		return data;


	}


}
