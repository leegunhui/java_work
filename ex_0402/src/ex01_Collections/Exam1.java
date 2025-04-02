package ex01_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Exam1 {
    public static void main(String[] args) {
//    	가장 많이 주문된 상품 구하기
//    	각사용자는 여러 상품을 주문할 수 있으며
//    	주문 내역은 ArrayList에 문자열 형태로 저장이 되고
//    	"사용자이름 : 상품이름" 형태로 저장이 된다
//    	가장 많이 주문된 상품 이름과 주문 수량을 출력하세요
//    	List<String> orders = Arrays.asList(
//    			"Alice:TV","Bob:TV","Alice:Phone","Charlie:Tv",
//    			"David:tablet", "Eve:Phone", "Frank:Phone", "Alice:Phone"
//    		);
//    	결과 => 4
    	
    	 List<String> orders = Arrays.asList(
    	            "Alice:TV", "Bob:TV", "Alice:Phone", "Charlie:Tv",
    	            "David:tablet", "Eve:Phone", "Frank:Phone", "Alice:Phone"
    	        );
    	 
    	 Map<String,Integer> productCount = new HashMap<>();
    	 for(String value : orders) {
    		String[] part = value.split(":");
    		
    		//상품이름이 들어갔음
    		String product = part[1];
    		
    		productCount.put(product, productCount.getOrDefault(product,0)+1);
    		
    		
    	 }
    	 
    	 //가장 많이 주문된 상품 찾기
    	 String maxProduct = null;
    	 int maxCount = 0;
    	 
    	 for(Map.Entry<String, Integer> entry : productCount.entrySet()) {
    		 if(entry.getValue() > maxCount) {
    			 maxProduct = entry.getKey();
    			 maxCount = entry.getValue();
    		 }
    	 }
    	 System.out.println(maxProduct + "=>" + maxCount);
    }
  } 
    	        
