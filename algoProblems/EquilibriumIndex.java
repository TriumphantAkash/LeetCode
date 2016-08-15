package algoProblems;
public class EquilibriumIndex {
	public static void main(String[] args){
		int[] A = new int[7];
		A[0] = -7; A[1] = 1; A[2] = 5; A[3] = 2; A[4] = -4; A[5] = 3; A[6]=0;
		
		int eqIndex = 1;
		int ls = A[0];
		int rs = 0;
		int eq = 1;
		
		for(int i=2;i<A.length;i++){
			rs = rs + A[i];	
		}

		while(eq < (A.length - 1)){
			if(ls == rs){
				System.out.println("index is: "+eq);
				return;
			}else {
				ls = ls	+ A[eq];
				rs = rs - A[eq+1];
				eq = eq + 1;
			}
		}

		System.out.println("There is no equilibrium index for this array");
	}
}
