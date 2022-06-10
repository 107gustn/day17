package day17;

import java.util.ArrayList;
import java.util.Scanner;

class StInfo {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<StInfo> arr = new ArrayList<StInfo>(); //<클래스 타입>
		
		String name;
		int age;
		while(true) {
			System.out.println("1.등록 2.출력 3.검색");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				StInfo s = new StInfo(); //객체 생성
				
				System.out.println("이름 입력");
				name = sc.next();
				System.out.println("나이 입력");
				age = sc.nextInt(); //입력 받음
				
				s.setName(name); s.setAge(age); //객체에 저장
				
				arr.add(s); //ArrayList에 객체 저장
				break;
			case 2:
				for(int i=0; i<arr.size(); i++) {
					StInfo ss = arr.get(i);
					System.out.println("이름 : " + ss.getName());
					System.out.println("나이 : " + ss.getAge());
					System.out.println("---------------");
				}
				/*
				StInfo ss = arr.get(0);
				System.out.println("이름 : " + ss.getName());
				System.out.println("나이 : " + ss.getAge());
				
				ss = arr.get(1);
				System.out.println("이름 : " + ss.getName());
				System.out.println("나이 : " + ss.getAge());
				*/
				
				break;
			case 3:
				System.out.println("찾을 이름 입력");
				name = sc.next();
				int i = 0;
				for( ; i<arr.size(); i++) {
					StInfo st = arr.get(i);
					if(st.getName().equals(name)) {
						System.out.println(st.getName());
						System.out.println(st.getAge());
						break;
					}
				}
				if(i == arr.size()) {
					System.out.println("찾는 정보가 없다");
				}
				/*
				for(StInfo st : arr) { //모든값을 꺼내와서 처리
					if(st.getName().equals(name)) {
						System.out.println(st.getName());
						System.out.println(st.getAge());
					}
				}
				*/
				break;
			}
		}
		
		
	}
}