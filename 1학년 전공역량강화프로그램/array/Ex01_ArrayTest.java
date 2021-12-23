package test.array;

public class Ex01_ArrayTest {
	static int[]arr= {10,20,30};
	
	//배열을 이용한 출력
	public static void printArray1() {
		//for(int i=0;i<arr.length;i++) {
		//	System.out.println(arr[i]);
		//}
		
		for(int n:arr) {
			System.out.println(n);
		}
	}
	
	//재귀호출을 이용한 출력
	public static void printArray2(int i) {
		if(i==arr.length) {
			System.out.println();
			return;
		}
		System.out.println(arr[i]+"\t");
		printArray2(i+1);
	}
	
	public static void main(String[] args) {
		printArray1();
		//printArray2();
	}
}
