package test.array2;

//2차원 배열
/*
다음과 같은 결과가 나오도록 코드를 작성하시오
1   2   3   4   10   
5   6   7   8   26   
9   10   11   12   42   
15   18   21   24   0
*/

public class Ex01_Array {
	public static void main(String[] args) {
		int[][]arr= {{1,2,3,4,0},
					 {5,6,7,8,0},
					 {9,10,11,12,0},
					 {0,0,0,0,0}};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][4]+=arr[i][j];
				arr[3][j]+=arr[i][j];
			}
		}
		
		//출력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
