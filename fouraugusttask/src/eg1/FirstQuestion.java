package eg1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class FirstQuestion {

	public static void main(String[] args) {
		 //1)Arrange the sentence by words with the word which is 
         // having highest vowel count first and followed by rest, if two
          //or more words have same vowel count then arrange it reverse alphabetical order
		String s="Hii hello i just love to travel the whole world and practicing my fav dance over there";
		System.out.println(hello(s));
	}
	public static String hello(String s) {
		String[] ar=s.split(" ");
		//Arrays.sort(ar);
		Map<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
		for(String w:ar) {
			int length=w.length();
			if(map.containsKey(length)) {
				String temp=map.get(length);
				temp=w+" "+temp;
				map.put(length, temp);
				
			}else {
				map.put(length, w);
				
			}
		}
		System.out.println("map: "+map);
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer,String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
	}

}
