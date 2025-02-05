package test.main;

import test.mypac.*;

public class MainClass05 {

	public static void main(String[] args) {
		//메소드 안에서 발생하는 예외를 직접처리한 draw() 메소드호출
		MyUtil.draw();
		
		//메소드 안에서 발생하는 예외를 throws 한 draw() 메소드 호출
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
