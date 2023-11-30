package collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class WordBook {

	public static void main(String[] args) {
		HashMap <String, String[]> wordBook = new HashMap<> ();
		HashSet<String> meanings = new HashSet<>();
		
		meanings.add("에이(영어 알파벳의 첫째 글자)");
		meanings.add("음악 ‘가’ 음(다장조의 제6음)");
		meanings.add("(영국의) A 도로, 국도");
		meanings.add("<부정의 의미를 덧붙이는 ‘부–·무–·비–’의 뜻을 나타냄>");

//		wordBook.put("a", meanings.add("111"));
		
		System.out.println(wordBook);

		// List / Collection 을 활용하는 방법 생각해보자
		
//		HashMap <String, Stack<String>> wordBook = new HashMap<> ();
//		Stack<String> meanings = new Stack<>();
//		
//		wordBook.put("a", meanings.push("에이(영어 알파벳의 첫째 글자)"));
//		wordBook.put("a", meanings.push("에이(영어 알파벳의 첫째 글자)"));
//		wordBook.put("a", meanings.push("에이(영어 알파벳의 첫째 글자)"));
//		wordBook.put("a", meanings.push("에이(영어 알파벳의 첫째 글자)"));
//		
//		System.out.println(wordBook);		
		
		
		

	}

}
