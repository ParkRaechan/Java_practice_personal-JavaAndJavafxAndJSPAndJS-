
package Day05; // ��Ű����  

import java.util.Iterator;
import java.util.Scanner;

public class Day05_2 {// c s
	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
	// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
		// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
		// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
	// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
		// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
		// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	public static void main(String args[]) {// m s
	
		//�غ�
		Scanner scanner = new Scanner(System.in);
		//ȸ��100�� [id,pw,name]���� �迭
		String[][] memberList = new String[100][3]; //100�� 3�� => ȸ���� 1�� [1��=id][2��=pw][3��=�̸�]
		//�湮��100�� [title,contents,writer]����迭
		String[][] boardList = new String[100][3];
		
		while(true) {//���ѷ��� [�������� : x]
			System.out.println("----------ȸ���� �湮��----------");
			System.out.println("-----------------------------");
			System.out.println("1.ȸ������ 2.�α��� ���� :");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("-----------ȸ������ ������-----------");
				System.out.print(" MEMBER ID : ");
				String id =scanner.next();
				System.out.print(" MEMBER PASSWORD : ");
				String pw =scanner.next();
				System.out.print(" MEMBER NAME : ");
				String name =scanner.next();
				// String 3�� ������ �Է¹޾� memberlist 2���� �迭�� ���� 
				// 1. �� ����[ ����=0 , ��ü(���ڿ�) = null  ]�� ã�Ƽ� ���� [ ���࿡ ������� ������ ȸ�� 100�� �ʰ� ]
				// 2. ���̵� �ߺ�üũ 
				
				
				//���̵� �ߺ�üũ
				boolean idCheck = true;
				for(int i=0;i<memberList.length;i++) {
					if(memberList[i][0]!=null&&memberList[i][0].equals(id)){
						System.err.println("�˸�)) ������ ���̵� ����");
						idCheck = false; //����x
						break;
					}
				}
				
				// ����κ�
				if(idCheck) {
					for(int i=0; i<memberList.length; i++) {
						if(memberList[i][0]==null) {
							memberList[i][0] =id;
							memberList[i][1] =pw;
							memberList[i][2] =name;		
							System.err.println("�˸�)) ȸ������ �Ϸ�");
							break;
						}
					}
				}
			}
				else if(ch==2) {
					System.out.println("-----------�α��� ������-----------");
					System.out.print(" MEMBER ID : ");
					String id =scanner.next();
					System.out.print(" MEMBER PASSWORD : ");
					String pw =scanner.next();
				
					
					boolean loginCheck = false;
					// �迭�� �����Ͱ� �Է¹��� id�� password�� �����ϸ� �α���ó��
					for(int i=0;i<memberList.length;i++) {
						if(memberList[i][0]!=null && memberList[i][0].equals( id ) &&
								memberList[i][1].equals(pw)) {
							System.err.println(" �˸�]] �α��� ���� ");
							loginCheck = true;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
							//�湮�� �ۼ��� �α׾ƿ� ����
							while(true) {
								
								
								
							System.out.println("-----------------------------");
							System.out.println("-------------�湮��------------");
							System.out.println("��ȣ\t�ۼ���\t����\t����");
							
							//��� �湮�� ���
							for(int j=0;j<boardList.length;j++) {
								if(boardList[j][0]!=null)
								System.out.printf("%d\t%s\t%s\t%s \n",
										j,
										boardList[j][2],
										boardList[j][0],
										boardList[j][1]);
							}
							
							System.out.println("1.�湮�ϳ���� 2.�α׾ƿ� ���� : ");
							int ch2 = scanner.nextInt();
							if(ch2==1) {
								System.out.println("-------------�۾���-------------");
								System.out.println(" title : ");
								String title = scanner.next();
								System.out.println(" content : ");
								String content = scanner.next();
								//����
								for(int j = 0; j<boardList.length;j++) {
									if( boardList[j][0] == null) {
										boardList[j][0] = title;
										boardList[j][1] = content;
										boardList[j][2] = id;
										break;
									}//if e
								}//for e
							}//if e
							else if(ch2==2) {
								System.err.println("�˸�)) �α׾ƿ�");
								break;
							}//elseif e
							else {
								System.err.println("�˸�)) �� �� ���� �Է�");
							}//else e//ȸ���޴� e
							
							
							
							}
////////////////////////////////////////////////////////////////////////////////////////////////
						}//if e
					}//for e
					
					if(loginCheck==false) {
						System.err.println("�˸�)) ȸ�������� ���ų� �ٸ��ϴ�.");
					}//if e
					
				}//elseif e
				else {
				System.err.println("�˸�)) �� �� ���� �Է��Դϴ�.");
				}

		}//while e
		
	}// m e
	
}// c e