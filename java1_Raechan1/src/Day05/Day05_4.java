
package Day05; // ��Ű����  

import java.util.Iterator;
import java.util.Scanner;

public class Day05_4 {// c s
	
	
	
	public static void main(String args[]) {// m s
		
		Scanner sc1 = new Scanner(System.in);
		String[][] ȸ�� = new String[100][2];
		String[][] ���� = new String[100][2];
		
		//�����⺻��
		//����0
		����[0][0]= "�̰����ڹٴ�";
		����[0][1]= "�뿩��X";
		//����1
		����[1][0]= "�̰����ڹ�?";
		����[1][1]= "�뿩��X";
		
		while(true) {
			
			
			System.out.println("---------------");
			System.out.println("1.ȸ������ 2.�α���");
			System.out.println("---------------");
			
			int ch1 = sc1.nextInt();
			
			
			//ȸ������
			if(ch1==1) {
				//��Ʈ��
				System.out.print("���ϴ� ID : ");
				String ID = sc1.next();
				System.out.print("���ϴ� PW : ");
				String PW = sc1.next();
					
				//���̵��ߺ� Ȯ��
				boolean idCheck = true;
				for(int i=0; i<ȸ��.length; i++) {
					if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(ID)) {
						System.err.println("���̵� �ߺ�");
						idCheck = false;
						break;
					}
				}
					
				//����
				if(idCheck) {
					for(int i=0; i<ȸ��.length; i++) {
						if(ȸ��[i][0]==null) {
							ȸ��[i][0] = ID;
							ȸ��[i][1] = PW;
							System.err.println("�˸�)) ȸ������  �Ϸ�");
							break;
						}//if e
					}//for e
				}//if e
			}
					
				
				//�α���
			else if(ch1==2) {
				//��Ʈ��
				System.out.print("����� ID : ");
				String ID = sc1.next();
				System.out.print("����� PW : ");
				String PW = sc1.next();
					
				boolean loginCheck = false;
				
				//ȸ�� Ȯ��
				for(int i=0; i<ȸ��.length; i++) {
					if(loginCheck==true) {break;}

					//if����
					if(ID.equals("admin")) {
						System.out.println("�˸�)) �α��� ����");
						loginCheck = true;
		/////////������ �α׾ƿ� ����/////////
						while(true) {
							//��Ʈ��
							System.out.println("-----------------------------------------");
							System.out.println("1.������� 2.������� 3.��������(����) 4.�α׾ƿ�");
							System.out.println("-----------------------------------------");
							int ch2 = sc1.nextInt();
							
							//���� 1�������
							if(ch2==1) {
								
								//��Ʈ��
								System.out.print("����� ���� �̸��� �Է� �ϼ��� : ");
								String name = sc1.next();
								//�ߺ�����Ȯ��
								for(int j = 0; j<����.length; j++) {
									if(����[j][0]==null) {
										����[j][0]=name;
										����[j][1]="�뿩��X";
										System.out.println("��ϿϷ�");
										break;
									}
								}
							}
							else if(ch2==2) {
								System.out.print("������Ϲ�ȣ\t\t�����̸�\t\t�뿩����\n");
								for(int j =0; j<����.length; j++) {
									if(����[j][0]!=null) {
										System.out.printf("%d\t\t%s\t\t%s\n",
												j,
												����[j][0],
												����[j][1]);
									}
								}
							}
							else if(ch2==3) {
								System.out.println("������ ������ �̸���..?");
								String name2 = sc1.next();
								for(int j =0; j<����.length; j++) {
									if(����[j][0].equals(name2)) {

											System.out.println("�����Ͻðڽ��ϱ�?");
											System.out.println("1.�� 2.�ƴϿ�");
											int ���4 = sc1.nextInt();
											if(���4==1) {
												����[j][0] = "������";
												����[j][1] = "������";
												break;
											}
											else { break;}
										
									}
								}
							}
							else if(ch2==4) {
								System.err.println("�α׾ƿ�");
								break;
							}
							else {
								System.err.println("�� �� ���� �Է�");
							}
							
						}
					
					}
					else if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(ID)&&ȸ��[i][1].equals(PW)) {
						System.out.println("�˸�)) �α��� ����");
						loginCheck = true;
		/////////�α׾ƿ� ����/////////
						while(true) {
							//��Ʈ��
							System.out.println("-----------------------------------------");
							System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�");
							System.out.println("-----------------------------------------");
							int ch2 = sc1.nextInt();
							
							//1�����˻�
							if(ch2==1) {
								
								//��Ʈ��
								System.out.print("�˻��� ���� �̸��� �Է� �ϼ��� : ");
								String name = sc1.next();
								//�ȳ�
								System.out.print("������Ϲ�ȣ\t�����̸�\t�뿩����\n");
								//����ã��
								for(int j = 0; j<����.length; j++) {
									
									boolean a = ����[j][0].equals(name);
									if(a) {
										System.out.printf("%d\t\t%s\t\t%s\n",
												j,
												����[j][0],
												����[j][1]);
												break;
									}
								}
							}
							else if(ch2==2) {
								System.out.print("������Ϲ�ȣ\t\t�����̸�\t\t�뿩����\n");
								for(int j =0; j<����.length; j++) {
									if(����[j][0]!=null) {
										System.out.printf("%d\t\t%s\t\t%s\n",
												j,
												����[j][0],
												����[j][1]);
									}
								}
							}
							else if(ch2==3) {
								System.out.print("�뿩�� ���� �̸��� �Է� �ϼ��� : ");
								String name = sc1.next();
								//�ȳ�
								System.out.print("������Ϲ�ȣ\t�����̸�\t�뿩����\n");
								//����ã��
								for(int j =0; j<����.length; j++) {
									if(����[j][0].equals(name)) {
										//�����ȳ�
										System.out.printf("%d\t\t%s\t\t%s\n",
												j,
												����[j][0],
												����[j][1]);
										//�뿩����
										if(����[j][1].equals("�뿩��X")) {
											System.err.println("�뿩�����մϴ�.");
											System.out.println("�뿩�Ͻðڽ��ϱ�?");
											System.out.println("1.�� 2.�ƴϿ�");
											int ch2_1 = sc1.nextInt();
											if(ch2_1==1) {
												����[j][1] = "�뿩��("+ID+")";
											}
											else { break;}
											System.out.printf("%s~�뿩��\n",����[j][0]);
											break;
										}
										else {
											System.err.println("�뿩���Դϴ�.");
											break;
										}
									}
								}
							}
							else if(ch2==4) {
								System.out.println("�ݳ��� ������ �̸���..?");
								String name2 = sc1.next();
								for(int j =0; j<����.length; j++) {
									if(����[j][0].equals(name2)) {
										if(����[j][1].equals("�뿩��("+ID+")")) {
											System.out.println("����� �뿩�� �����Դϴ�...�ݳ�����");
											System.out.println("�ݳ��Ͻðڽ��ϱ�?");
											System.out.println("1.�� 2.�ƴϿ�");
											int ���4 = sc1.nextInt();
											if(���4==1) {
												����[j][1] = "�뿩��X";
												break;
											}
											else { break;}
										}
										else {
											System.out.println("����� �뿩�� ������ �ƴմϴ�.");
											break;
										}
									}
								}
							}
							else if(ch2==5) {
								System.err.println("�α׾ƿ�");
								break;
							}
							else {
								System.err.println("�� �� ���� �Է�");
							}
							
						}
						
						
						
					}
				}
			}
			
		}
	
	
	}// m e
	
	
	
	
}// c e