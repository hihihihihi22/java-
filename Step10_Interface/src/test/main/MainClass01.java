package test.main;

import test.mypac.*;

public class MainClass01 {
	public static void main(String[] args) {
		//인터페이스로 객체생성이 가능할까?
		//Remocon r1 = new Remocon(); //단독 객체생성불가
		
		//인터페이스가 data type 역할을 할 수 있을까?
		Remocon r1 = null;
		//r1.up(); //NullPointerException 발생
		
		Remocon r2 = new MyRemocon();
		r2.up();
		r2.down();
		//Remocon 인터페이스에 정의된 static final 상수참조
		String result = Remocon.COMPANY;//:LG"
		
//		//final 상수이기 대문에 수정불가
//		Remocon.COMPANY="SAMSUNG";
		
		//final 을 안붙이면 필요시에 값 변경가능
		int num = 10;
		num=20;
		
		//final 을 붙이면 상수화 되어서 값 변경불가
		final int num2 = 10;
//		num2 = 20;
		
		final String NICK = "김구라";
//		NICK = "원숭이";//변경불가
		
		final Remocon r3 = new MyRemocon();
		
//		r3 안에 대입된 참조값을 다른값으로 변경불가
//		r3 =  null;
//		r3 = new MyRemocon();
		
		
	}

}
