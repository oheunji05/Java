package test.control;

public class ForEx1 {
	public static void main(String[] args) {
		
		int[] n= {10,20,30,40,50,60,70,80,90,100};
		
		//100 90 80 70 60 50 40 30 20 10
		for(int i=n.length-1;i>=0;i--) {
			System.out.print(n[i]+" ");
		}
		
		System.out.println();
		
		//20 40 60 80 100
		for(int i=0;i<n.length;i++) {
			if(n[i]%20==0) {
				System.out.print(n[i]+" ");
			}
		}
		
		System.out.println();
		
		//Have a nice day --> yad ecin a evaH
		String str="Have a nice day";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i)); //14번째 방의 값부터 하나씩 꺼내와라
		}
	}
}
