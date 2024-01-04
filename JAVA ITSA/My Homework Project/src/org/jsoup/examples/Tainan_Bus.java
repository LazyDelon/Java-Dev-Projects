package org.jsoup.examples;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;

/** A simple example, used on the jsoup website. **/
public class Tainan_Bus {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.hosp.ncku.edu.tw/nckm/Mobile/OutpatientTime.aspx").get();
        System.out.println( "�������D�G" + doc.title() );
        System.out.println( "�������}�G" + doc.baseUri() + "\n" );
          
        //�ѪR�Ҧ� <tr> ����
        Elements trs = doc.select("tr");
        System.out.println("trs.toString(): \n" + trs.toString() );
        String[] token ;
         
		//�ѪR�Ҧ� <td> ����
        Elements tds = trs.select("td");
        System.out.println("tds.toString(): \n" + tds.toString() );
        for(Element td : tds) {
        	  token = td.text().split(" "); 
              for(int i = 0; i < token.length; i++) {
                  System.out.println(token[i]);
              }  
        }
        
        Elements newsHeadlines = doc .select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            log("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
        }
    }

    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }
}