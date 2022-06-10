package day17;

import java.util.ArrayList;

public class Ex05 {
	public static void main(String[] args) {
		String[] str = {"111", "222", "333"};
		for(int i=0; i<str.length; i++) {
			System.out.println( str[i] );
		}
		for(String s : str) {//ForEach: 오른쪽(배열이나 여러개의 값을 가진)값이 왼쪽으로 순차적으로 들어감
			System.out.println( s );
		}
		System.out.println("----------------");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(111); //0번째
		arr.add(2); //1번째
		arr.add(333);
		for(int a : arr) {
			System.out.println( a );	
		}
		int i = 0;
		for(; i < arr.size() ; i++) {
			if(arr.get(i) == 2) {
				System.out.println("찾았다");
				break; //반복문을 빠져나감
			}
		}
		System.out.println("i : " + i);
		System.out.println("arr.size : " + arr.size());
	}
}
