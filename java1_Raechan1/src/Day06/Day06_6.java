package Day06;

import java.util.Scanner;

public class Day06_6 {//c s
	// ��ȸ���� �Խ��� [ Ŭ���� ���� ]
		// 0. �Խù� ���� => Ŭ���� ���� 
			// �ʵ� : ���� , ���� , �ۼ��� , ��й�ȣ
			// ������ : ������� ����
		// 1. ùȭ�� [ ��� �Խù�(��ȣ,�ۼ���,����) ��� ]
		// 2. �޴� [ 1. �۾��� 2.�ۺ��� ]
			// 1. �۾��� [ ���� , ���� , �ۼ��� , ��й�ȣ => 4������ -> ��üȭ ]
			// 2. �ۺ��� [ �ش� �۹�ȣ�� �Է¹޾� �ش� �� ��������(��ȣ,�ۼ���,����,����) ǥ�� ]
				// �۹�ȣ�� �迭�� ����Ǵ� ���� [ �ε��� ]
				// �ۺ��� �޴� 
		// 3. �ۺ��� �޴� [ 1. ��Ϻ��� 2.���� 3.���� ]
			// 1. ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����
			// 2. ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ���� 
	
	public static void main(String[] args) {//m s
		// �غ� [ ��� {} �ȿ��� ���Ǵ� ���� ���� ]
		Scanner scanner = new Scanner(System.in);
		Board[] boardList = new Board[100];
		
		//���α׷� ����
		while(true) {//[�������Ǿ���]
			System.out.println("----------Ŀ�´�Ƽ----------");
//////////////////////////////��� �Խù� ��ȸ///////////////////////
			System.out.println("��ȣ\t�ۼ���\t����");
			//�迭�� ��� ��ü�� ����ϴ� �ݺ���
			int index =0;
			for(Board board : boardList) {
				if(board != null) {
					System.out.printf("%d\t%s\t%s\n",index,board.writer,board.title);	
				}
				index++;
			}
////////////////////////////////////////////////////////////////
			System.out.println("1.�۾��� 2.�ۺ���");
			int ch = scanner.nextInt();
			if(ch==1) {// 1. �۾��� 
/////////////////////////�۾����ڵ�////////////////////////////////
				//1.4�������Է¹���
				System.out.println("----------------- �� ���� ������ ----------------");
				System.out.println("title : "); String title = scanner.next();
				System.out.println("content : "); String content = scanner.next();
				System.out.println("writer : "); String writer = scanner.next();
				System.out.println("password : "); String password = scanner.next();
				//2.4��������üȭ[ ��ü�� ���� 4�������� ��ü�� �ʵ忡 ���� ]
				Board board = new Board(title, content, writer, password);
							//4���ʵ帣 ���� ������ ���
				//3.�迭�� ������� ã�Ƽ� ������� ��ü ����
				int i = 0;
				for(Board temp : boardList) {
					if(temp==null) {
						boardList[i] = board;
						break;
					}
					i++;
				}
/////////////////////////////////////////////////////////////////
			}
			else if(ch==2) {//2.�ۺ���
				System.out.println("�Խù� ��ȣ(�ε���) ����"); int bno = scanner.nextInt();
				System.out.printf("�ۼ���: %s  ���� : %s \n"
						,boardList[bno].writer,boardList[bno].title);
				System.out.printf("����: %s \n "
						,boardList[bno].content);
				System.out.println("---------------------------------");
				System.out.println("1.��κ���(�ڷΰ���) 2.�ۻ��� 3.�ۼ���");
				int ch2 = scanner.nextInt();
				if(ch2==1) {
					
				}
				else if(ch2==2) {
					
					System.out.println("�� �Խù� ��й�ȣ : "); String password = scanner.next();
					//�ݺ���X
					if(boardList[bno].password.equals(password)) {
						System.out.println("������");
						boardList[bno] = null;
					}
					else {
						System.out.println("����� �ٸ�");
					}
					//������ ������ �ε����ڷ� ��ĭ�� ������ �̵�
						//��??? ���࿡ �ش��ڵ尡 ������� �迭�� ���̻��� ���� ��
					for( int i = bno ; i< boardList.length ; i++ ) {
						// * �˻��� �Խù��� �ε������� �������ε������� 1������ 
						
						if( i == boardList.length-1) boardList[ boardList.length-1 ] = null;
						// i�� �������ε��� �� ������ �������ε������� null ����
						else boardList[i] = boardList[i+1];// ������ �Խù� ���� �Խù�
						// ������ �ε����� �ƴϸ� �ε��� ���� 
						
							// *  	���࿡ 2�� �ε��� ������ 
							// 		2�ε��� = 3�ε��� 
							//	  	3�ε��� = 4�ε��� 
							//		4�ε��� = 5�ε��� 
							//      ~~~~~~~~~~~
							//		98�ε��� = 99�ε��� [ 0��~99�� -> 100�� �ε��� ]
							//		99�ε��� = null [ 99�� �ε��� : �������ε��� ] 
					
					}
				}
				else if(ch2==3) {
					System.out.println("----------------- �� ���� ������ ----------------");
					System.out.println("title : "); String title = scanner.next();
					System.out.println("content : "); String content = scanner.next();
					System.out.println("writer : "); String writer = scanner.next();
					System.out.println("password : "); String password = scanner.next();
					Board board = new Board(title, content, writer, password);
					boardList[bno] = board;
				}
				
			}
			else {
				System.err.println("�˸�)) �� �� ���� ��ȣ");
			}
		}// ���α׷� while end  
	}// m e 
}// c e
