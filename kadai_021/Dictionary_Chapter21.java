package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	private HashMap<String, String> englishMap = new HashMap<String, String>();
	
    public Dictionary_Chapter21(){
    	englishMap.put("apple", "りんご");
    	englishMap.put("peach", "桃");
    	englishMap.put("banana", "バナナ");
    	englishMap.put("lemon", "レモン");
    	englishMap.put("pear", "梨");
    	englishMap.put("kiwi", "キウィ");
    	englishMap.put("strawberry", "いちご");
    	englishMap.put("grape", "ぶどう");
    	englishMap.put("muscat", "マスカット");
    	englishMap.put("cherry", "さくらんぼ");
    }
    
    public void checkWords(String[] words) {
    	for (String word : words) {
    		String mean = englishMap.get(word);
    		if (mean != null) {
    			System.out.println(word + "の意味は" + mean);
    		}
    		else {
    			System.out.println(word + "は辞書に存在しません");
    		}
    	}
    }
}
