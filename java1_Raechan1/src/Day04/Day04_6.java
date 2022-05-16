package Day04;

import java.util.Scanner;
import java.util.Random;

public class Day04_6 {// cs
	public static void main(String[] args) {// ms
		/*
		 * 삼목 게임 [ 틱택토 게임 ]
				1. 게임판 9칸 생성 
					1. String[] 배열 = new String[9]
			
				2. 사용자에게 0~8 인덱스번호 입력받기
					1. 해당 인덱스에 O 표시
					2. 이미 둔 자리는 재 입력 
			
				3. 컴퓨터는 0~8 사이 난수 발생 
					1. 해당 인덱스에 X 표시
					2. 이미 둔 자리는 재 난수 생성  
			
				4. 승리판단 
					가로 인덱스들의 모양이 모두 동일하면
					012 345 678
						첫번째 인덱스가 0부터 6까지 3씩증가
							두번쨰 : 첫번째+1
	 						세번쨰 : 첫번째+2 
					세로 인덱스들의 모양이 모두 동일하면 
					036 147 258
					대각선 인덱스들의 모양이 모두 동일하면 
					048 246
		 */
		
		///준비
		Scanner sc1 = new Scanner(System.in);
		
		String[] 게임판 = {"[ ]","[ ]","[ ]",
				"[ ]","[ ]","[ ]",
				"[ ]","[ ]","[ ]"};

		String 승리알 = "";//3목 되었을때 해당 알 저장 변수
		
		while(true) {
			
			/////////게임판 출력
			for(int i = 0; i<게임판.length;i++) {
				System.out.print(게임판[i]);
				//인덱스2,5,8에서 줄바꿈
				if(i%3==2) System.out.println();
			}
		
			
			
			
			/////////플레이어 선택
			while(true) {
				System.out.print("위치 선택 : ");
				int 위치 = sc1.nextInt();
				if(게임판[위치].equals("[ ]")) {
					게임판[위치] = "[0]";			//해당위치가 공백이면 알두기
					break;
				}
				else {
					System.out.println("알림)) 해당위치에 이미 알이 있습니다.");
				}
			}
			
		
		
			/////////컴퓨터 선택
			while(true) {
				Random r1 = new Random();
				int 위치2 = r1.nextInt(9);
				if(게임판[위치2].equals("[ ]")) {
					게임판[위치2] = "[x]";			//해당위치가 공백이면 알두기
					break;
				}
			}
			
			
			/////////승리조건
			//가로
			for(int i =0; i<=6; i+=3) {
				if(게임판[i].equals(게임판[i+1])&&게임판[i+1].equals(게임판[i+2]))
				{
					승리알 = 게임판[i];
				}
			}
			
			//세로
			for(int i =0; i<=2; i++) {
				if(게임판[i].equals(게임판[i+3])&&게임판[i+3].equals(게임판[i+6]))
				{
					승리알 = 게임판[i];
				}
			}
			
			
			//대각선
			if(게임판[0].equals(게임판[4])&& 게임판[4].equals(게임판[8])) {
				승리알 = 게임판[0];
			}
			
			if(게임판[2].equals(게임판[4])&& 게임판[4].equals(게임판[6])) {
				승리알 = 게임판[2];
			}
			
			
			///////무승부
			
			
			
			
			
			
			/////////////////////////// 4. 게임종료 //////////////////////////////
			if( 승리알.equals("[0]") ) { 
				System.out.println(" 알림)) 플레이어 승리"); 
				for(int i = 0; i<게임판.length;i++) {
					System.out.print(게임판[i]);
					//인덱스2,5,8에서 줄바꿈
					if(i%3==2) System.out.println();
				}
				break; // 게임종료 
				
			}
			else if( 승리알.equals("[X]") ) {
				System.out.println(" 알림)) 컴퓨터 승리");
				for(int i = 0; i<게임판.length;i++) {
					System.out.print(게임판[i]);
					//인덱스2,5,8에서 줄바꿈
					if(i%3==2) System.out.println();
				}
				break; // 게임종료
			}
			
		}	
		
		
		
		
	}// me
} // c e 
