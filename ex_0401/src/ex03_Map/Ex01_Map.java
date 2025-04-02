package ex03_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ex01_Map {
	public static void main(String[] args) {
		HashMap<Integer, Character>map = new HashMap<>();
		
		//put(K k. V v)
		//HashMap에 데이터 추가하기
		
		 map.put(1, 'A');	
		 map.put(2, 'B');	
		 map.put(3, 'C'); 
		 // map에 저장되는 value는 중복될 수 있다.
		 map.put(4, 'A');  
		 
		 System.out.println(map); //Value값으로 key값을 찾는건 불가능
		 
		 map.put(1,'F'); // key값은 중복이 될 수 없음
		 System.out.println(map);//같은 값을 가진 key가 있다면 value를 갱신
		 
		 //remove()
		 map.remove(3);
		 System.out.println(map);
		 
		 char res = map.get(1);
		 System.out.println(res);// 인덱스가 아닌 키 값으로 벨류를 찾는다
		 
		 HashMap<String, Double> map2 = new HashMap<>();
		 
		 map2.put("k1",100.0);
		 map2.put("k2",3.14);
		 map2.put("k3",4.15);
		 
		 double result = map2.get("k2");
		 System.out.println(result);
		 
		 //containskey(K k)
		 //map안에 key가 존재하면 true, 없으면 false
		 //containsValue(V v)
		 //map안에 Value가 존재하면 true, 없으면 false
		 
		 Iterator<String> iter = map2.keySet().iterator();
		 
		 while(iter.hasNext()) {
			 //key를 하나씩 꺼내서 val에 대입한다
			 String val = iter.next();
			 System.out.println("key "+val+" value " + map2.get(val));
		 }
		 
		 Iterator<Double> iter2 = map2.values().iterator();
		 
		 while(iter.hasNext()) {
			 //key를 하나씩 꺼내서 val에 대입한다
			 double val = iter2.next();
			 System.out.println("value " + val);
		 }
		 //entrySet() -> key-value쌍을 하나의 entry로 반환
		 //ㄴkey와 value를 동시에 다루고 싶을 때 효율적
		 //Set<Map.Entry<K,V>>
		 
		 //Entry
		 //HashMap 내부에서 key-value쌍 하나를 표현할 수 있는 객체
		 Iterator<Map.Entry<String, Double>> iter3 = map2.entrySet().iterator();
		 while(iter3.hasNext()) {
			 Entry<String,Double> entry = iter3.next();
			 System.out.println(entry.getKey() + " " + entry.getValue());
		 }
	}
}
