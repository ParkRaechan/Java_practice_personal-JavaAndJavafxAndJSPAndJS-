package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarDataProvider;

public class Day13_2 {
	
	public static void main(String[] args) {
		
		//
			//
		Date date = new Date(); //date ��ü ����
		System.out.println("���� ��¥/�ð� : "+date);
		
			//
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� hh�� ss��");
		// ��¥�� ���ñ� �����ϱ� [date ���� -> String�� ��ȯ]
		System.out.println("��¥���ĺ��� : "+sdf.format(date));
										//
		//
			//
		Calendar now = Calendar.getInstance();//
			//
		System.out.println(" ���� : "+now.get(Calendar.YEAR));//
		System.out.println(" �� : "+(now.get(Calendar.MONTH)+1));//
		System.out.println(" �� : "+now.get(Calendar.DAY_OF_MONTH));//
													//
		System.out.println(" ���� : "+now.get(Calendar.DAY_OF_WEEK));//
													//
		//
		int week = now.get(Calendar.DAY_OF_WEEK);
		String ���� = null;
		switch(week) {
			case 1 : ���� = "�Ͽ���"; break;
			case 2 : ���� = "������"; break;
			case 3 : ���� = "ȭ����"; break;
			case 4 : ���� = "������"; break;
			case 5 : ���� = "�����"; break;
			case 6 : ���� = "�ݿ���"; break;
			case 7 : ���� = "�����"; break;
		}
		System.out.println(" ����[�ѱ�] : "+����);
		
		//
		System.out.println(" ����/���� : "+now.get(Calendar.AM_PM));
		int ampm = now.get(Calendar.AM_PM);
		String �������� = null;
		if(ampm==0) ��������="����";
		else �������� = "����";
		System.out.println(" ����/���� : "+ ��������);
		
		System.out.println(" �� : "+now.get(Calendar.HOUR));
		System.out.println(" �� : "+now.get(Calendar.MINUTE));
		System.out.println(" �� : "+now.get(Calendar.SECOND));
		
		//
		ZonedDateTime ������ = ZonedDateTime.now(ZoneId.of("UTC"));
			System.out.println(" ������ : "+������);
		������ = ZonedDateTime.now(ZoneId.of("Asia/seoul"));
			System.out.println(" ���� �ð� : "+������);
		������ = ZonedDateTime.now(ZoneId.of("America/New_York"));
			System.out.println(" ���� �ð� : "+������);
		
			
		
	}
	
}
