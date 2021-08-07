package eg1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SecondQuestion {

	public static void main(String[] args) {
		//  2)Same as task1 but you should only count unique vowel 
		//count i.e if a word is having aeeeeee like that so that count of vowel is 2 not 8
		String s="Hii try of things you want to buy";
		System.out.println(hello(s));
	}
	public static String hello(String s) {
		String[] ar=s.split(" ");
		Arrays.sort(ar);
		Map<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
		for(String w:ar) {
			int count=0;
			for(int i=0;i<w.length()-1;i++) {
				if(w.charAt(i)=='A' || w.charAt(i)=='E' || w.charAt(i)=='I' || w.charAt(i)=='O'|| w.charAt(i)=='U' 
				  ||w.charAt(i)=='a'	||w.charAt(i)=='e' ||w.charAt(i)=='i' ||w.charAt(i)=='o' ||w.charAt(i)=='u') {
				for(int j=i+1;j<w.length();j++) {
					if(w.charAt(i)==w.charAt(j)) {
					count++;
					}
				}
			}
			}
			int length=w.length()-count;
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
