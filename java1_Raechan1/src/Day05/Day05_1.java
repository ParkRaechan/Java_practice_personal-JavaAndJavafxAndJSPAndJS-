
package Day05; // ��Ű����  

public class Day05_1 {// c s
 
	public static void main(String args[]) {// m s
		// ���� : �ϳ��� ������ ���� 
		// �迭 : ������ �ڷ��� �����͸� Ư������[�ε���]���� ����
		// 1���� �迭 : ����
			// ���� : �ڷ���[] �迭�� = new �ڷ���[����];
			// int[] arr = new int[3];
			//	int int int 
			// * int�� ���� 3�� �����Ҽ� �ִ� �迭 
			
		// 2���� �迭 : ���α��� ���α���
			// ���� : �ڷ���[][] �迭�� = new �ڷ���[����=��][����=��];
			// int[][] arr2 = new int[4][3];
			//   int int int 
			//   int int int 
			//   int int int 
			//	 int int int 
			// * int�� ���� 12�� �����Ҽ� �ִ� �迭 
				
		// 3���� �迭 : ���α븮 ���α��� ���̱���
			// ���� : �ڷ���[][][] �迭�� = new �ڷ���[��][��][����];
				
				
		// ����1) 
		
		int[] �迭 = new int[3];
		�迭[0] = 80;
		�迭[1] = 90;
		�迭[2] = 100;
		
		int[][] �迭2 = new int[2][3];
		�迭2[0][0] = 80; �迭2[0][1] = 90; �迭2[0][2] = 100;
		�迭2[1][0] = 40; �迭2[1][1] = 50; �迭2[1][2] = 60;
		
		System.out.println(" 1���� �迭(�ּҰ�) :" + �迭);
		System.out.println(" 2���� �迭(�ּҰ�) :" + �迭2);
		
		System.out.println(" 1���� �迭 ���� : "+�迭.length);
		System.out.println(" 2���� �迭 �� ���� : "+�迭2.length);
		System.out.println(" 2���� �迭 �� ���� : "+�迭2[0].length);

		// ��2) �ݺ����� �̿��� 
		int[][] �迭3 = new int[2][50];//int:4����Ʈ *2*50 => 400����Ʈ �迭 ����
		
		for(int i=0; i<100; i++) {
			if(i<50) {
				�迭3[0][i] = i;
			}
			else {
				�迭3[1][i-50] = i;
			}
		}
		
		for(int i=0; i<100; i++) {
			if(i<50) {
				System.out.printf("%3d", �迭3[0][i]);
			} 
			else {
				System.out.printf("%3d", �迭3[1][i-50]);
			}
			if(i==49) {System.out.println();}
			
		}
		
	}// m e
	
}// c e