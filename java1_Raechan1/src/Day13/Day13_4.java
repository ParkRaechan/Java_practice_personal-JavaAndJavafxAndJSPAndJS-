package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//
			//
				//
				//
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("00000000000000.000000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##############.######");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.000");
		System.out.println(df.format(num));

		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		//***********õ���� ��ǥ***************									�߿�
		df = new DecimalFormat("�ݾ� #,##0��");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("[��]+#,### ; [��]-#.###"); //���;����
		System.out.println(df.format(-num));
		
		//****��ǻ��� �����X [���� 1:100%  0.5:50%  0.05:5%]					�߿�
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
		//
		//
		String id = "java";
		String name ="�ſ��";
		String tel ="010-123-5678";
		
		String text = "ȸ�� ID : {0} \n ȸ�� �̸� : {1} \nȸ�� ��ȭ :{2}";
		String result1 = MessageFormat.format(text,id,name,tel);
		
		System.out.println(result1);System.out.println();
		
		//*****�����ͺ��̽����� ����� ���� ***
		String sql = "insert info member values({0},{1},{2})";
										//
		Object[] �迭 = {id,name,tel};
		String result2 = MessageFormat.format(sql,�迭);
		System.out.println(result2);
		
		//Java 7���� ���� Date ���Ŀ��� �������� ��¥ API �߰���
		LocalDate currDate = LocalDate.now();
		System.out.println(" ���� ��¥ : "+currDate);
		
		LocalDate currTime = LocalDate.now();
		System.out.println(" ���� ��¥ : "+currTime);
		
		//Date ���糯¥/�ð� [������ �ȵǰų� �񱳱�� �����]
		//vs
		//LocalDate : ���糯¥			LocalTime : ����ð�
		
		LocalDateTime currdatetime = LocalDateTime.now();
		System.out.println(" ���糯¥/�ð� : "+currdatetime);
		
		// ***�ð����
		Instant instant1 = Instant.now();
		Thread.sleep(10); //1�� ��� [�ڵ��帧 1�ʰ� ����] //�Ϲݿ���
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1 �� ����");
		}
		else if(instant1.isAfter(instant2)) {
			System.out.println("instant1 �� ����");
		}
		else {
			System.out.println("������ �ð��Դϴ�.");
		}	
		
		System.out.println(" �ð� �� : "+instant1.until(instant2,ChronoUnit.NANOS));
		// �ð����� : �и��� = 1000/1��		����ũ���� = 1000000/1��	 ������ = 1000000000/1��
		}
}