package day17;


class Test02<E>{ //<Generic>: <�ڷ���>
	public void sumF(E a, E b) {
		System.out.println(a + ", " + b);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Test02<String> t = new Test02<>();
		t.sumF("aaa", "bbb");
		Test02<Integer> t01 = new Test02<>();
		t01.sumF(111, 222);
		
	}
}

