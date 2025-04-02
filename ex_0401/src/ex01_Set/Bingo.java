package ex01_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Bingo {
	public static void main(String[] args) {
		
		//HashSet을 이용한 5*5의 랜덤 빙고판 만들기
		//숫자는 1~50까지
		HashSet<Integer>set = new HashSet<>();
		
		int[][]bingoBoard = new int[5][5];
		
		for (int i = 0; set.size() < 25; i++) {
			set.add(new Random().nextInt(50) + 1);
		}
		
		//Set index가 없기 때문에 하나씩 꺼낼수가 없다
		//그렇기 때문에 iterator를 통해서 꺼낸다
		
		//shuffle()
		List<Integer> list = new ArrayList<>(set);
		Collections.shuffle(list);
		//set으로 랜덤값을 넣었기 때문에 중복값은 어차피 안들어가있음
		
		Iterator<Integer> iter = list.iterator();
		
		for(int i =0; i< bingoBoard.length; i++) {
			for(int j = 0; j<bingoBoard[i].length; j++) {
				bingoBoard[i][j] = iter.next();
				System.out.printf("%d " , bingoBoard[i][j]);
			}
			System.out.println();
		}
		
	}
}
