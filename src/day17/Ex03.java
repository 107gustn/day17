package day17;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
//		ArrayList arr = new ArrayList();
//		arr.add("안녕하세요");
//		arr.add(1111);
//		arr.add(1.111);
//
//		String str = (String) arr.get(0); // 오브젝트 타입으로 되돌려줘서 다운캐스팅을 통해 자료형을 맞춰준다.
//		int num = (int) arr.get(1);
		
		ArrayList<String> arr = new ArrayList<String>(); //저장될 자료형 타입을 지정해줌
		arr.add("aaa");
		arr.add("aaa");
		arr.add("aaa");
		
		String s = arr.get(0);
		
		ArrayList<Integer> arr02 = new ArrayList<Integer>(); //Integer: int 타입 지정
		
		Integer num = 100;
	}
}
