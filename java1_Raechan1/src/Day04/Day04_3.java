
package Day04; // 패키지명
import java.util.Random;
import java.util.Scanner;

public class Day04_3 {// c s
	
	/*
	 * 가위바위보게임
		1. 사용자에게 가위[0]바위[1]보[2] 종료[3] 중에  입력받기
		2. 컴퓨터 난수발생[0~2] 
		3. 사용자와 컴퓨터중 승리자 판단 [ 경우의수 ]
		4. 3번 선택하기 전까지 게임 실행 
		5. 3번 선택시 게임종료 
			1. 총 게임수 출력	예) 3판
			2. 최종 승리 출력	예) 컴퓨터 2  사용자 1
	 */
	
	public static void main(String args[]) {// m s

		
		int 컴퓨터=0;
		int 플레이어win=0;
		int 컴퓨터win=0;
		
		int 총게임수=0;
		int 비김=0;
		
		Random r1 = new Random();
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("-------가위바위보-------");
		System.out.println("가위[0] 바위[1] 보[2] 결과 및 종료[3]");
		System.out.println("컴퓨터를 이겨라@@~!");
		while(true) {
			System.out.println("현황 ---- 총게임수 ---- 플레이어win ---- 컴퓨터win ----  비김 ----");
			System.out.println("           "+총게임수+"           "+플레이어win+"              "+컴퓨터win + "          "+비김);
			System.out.println("당신의 선택은? 가위!바위? 보!");
			int you = sc1.nextInt();
			컴퓨터 = r1.nextInt(3);
			if(you==0) {
				if(컴퓨터==0) {
					System.out.println("당신의 선택 : 가위!");
					System.out.println("컴퓨터의 선택 : 가위!");
					System.out.println("비김...");
					비김++;
				}
				else if(컴퓨터==1) {
					System.out.println("당신의 선택 : 가위!");
					System.out.println("컴퓨터의 선택 : 바위!");
					System.out.println("졌음...");
					컴퓨터win++;
				}
				else {
					System.out.println("당신의 선택 : 가위!");
					System.out.println("컴퓨터의 선택 : 보!");
					System.out.println("이김...");
					플레이어win++;
				}
				총게임수++;
			}
			if(you==1) {
				if(컴퓨터==0) {
					System.out.println("당신의 선택 : 바위!");
					System.out.println("컴퓨터의 선택 : 가위!");
					System.out.println("이김...");
					플레이어win++;
				}
				else if(컴퓨터==1) {
					System.out.println("당신의 선택 : 바위!");
					System.out.println("컴퓨터의 선택 : 바위!");
					System.out.println("비김...");
					비김++;
				}
				else {
					System.out.println("당신의 선택 : 바위!");
					System.out.println("컴퓨터의 선택 : 보!");
					System.out.println("졌음...");
					컴퓨터win++;
				}
				총게임수++;
			}
			if(you==2) {
				if(컴퓨터==0) {
					System.out.println("당신의 선택 : 보!");
					System.out.println("컴퓨터의 선택 : 가위!");
					System.out.println("졌음...");
					컴퓨터win++;
				}
				else if(컴퓨터==1) {
					System.out.println("당신의 선택 : 보!");
					System.out.println("컴퓨터의 선택 : 바위!");
					System.out.println("이김...");
					플레이어win++;
				}
				else {
					System.out.println("당신의 선택 : 보!");
					System.out.println("컴퓨터의 선택 : 보!");
					System.out.println("비김...");
					비김++;
				}
				총게임수++;
			}
			if(you==3) {
				if(플레이어win>컴퓨터win) System.out.println("최종결과는....플레이어의 승!!");
				else if(플레이어win<컴퓨터win) System.out.println("최종결과는....컴퓨터의 승!!");
				else System.out.println("최종결과는....비겼다..!!");
				break;
			}
		}
		
		
		
	}// m e
	
}// c e