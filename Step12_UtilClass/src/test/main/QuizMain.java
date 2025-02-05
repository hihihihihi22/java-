package test.main;

import java.util.*;
import java.util.random.*;

public class QuizMain {

	public static void main(String[] args) {
		//1. 정수를 담을 수 있는 ArrayList 객체를 생성해서 nums 라는 지역변수에 담아보세요
		List <Integer> nums = new ArrayList<>();
		
		//2. 반복문 10번 돌면서 1~100 사이의 랜덤한 정수를 10개 각각 얻어내서
		//	 위에서 생성한 nums 객체에 순서대로 담아보세요.
		Random ran = new Random();
		for(int i=0; i<10; i++) {
			nums.add(ran.nextInt(1,100));}	
		
		//3. nums 배열에 저장된 숫자에서 중복된 숫자가 제거된 새로운 ArrayList 객체를 얻어내보세요
		Set<Integer> set = new HashSet<>(nums);
		List<Integer> result = new ArrayList<>(set);
		
		//4. 새로운 배열에 숫자를 오름차순 정렬해보세요.
		Collections.sort(result);
		
		//5. 새로운 배열에 저장된 숫자를 순서대로 콘솔창에 출력해보세요.
//		System.out.println(result);
		
		for(Integer tmp:result) {
			System.out.print(tmp+" ");
		}
	}

}
