package qwer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Controller {
	
	
	
	public static ArrayList<Car> carlist = new ArrayList<>(); 
	
public static void ����() {
	LocalDate wndoww =LocalDate.now();
	LocalTime endnoww = LocalTime.now();

	System.out.println("\t\t\t����ð� : "+wndoww+endnoww);
	for(Car q : carlist) {
		if(q.get�����ð�()==null) {
			System.out.println(q.get��¥()+"\t"+q.get������ȣ()
			+"\t"+q.get�����ð�()+"\t���� ��"
			+"\t������");
		}
		else {
			System.out.println(q.get��¥()+"\t"+q.get������ȣ()
			+"\t"+q.get�����ð�()+"\t"+q.get�����ð�()
			+"\t"+q.get�ݾ�());
		}
			
	}
}
	
	
	// ���� �޼ҵ� 
	public static void ����( String ������ȣ ) {
		// ���� �ڵ� �ۼ� 
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
		String a= ������ȣ;
			// * ������ȣ �ߺ�üũ
		LocalDate wndow =LocalDate.now();
		LocalTime endnow = LocalTime.now();

		Car q3 = new Car(wndow,a,endnow);
		carlist.add(q3);
		
	}
	
	
	
	// ���� �޼ҵ� 
	public static void ����( String ������ȣ ) {
		LocalDate w;
		String f;
		LocalTime c1;
		LocalTime c;
		int ��;
		int �ݾ�2 ;
		String b = ������ȣ;
		int i=0;
		for(Car p : carlist) {
			if(p.get������ȣ().equals(b)) {
				c =LocalTime.now();
				�� = (int) p.get�����ð�().until(c , ChronoUnit.MINUTES);
				if(��<=30) {
					�ݾ�2=0;
				}
				else {
					�ݾ�2=��*100;
				}
				f=p.get������ȣ();
				w=p.get��¥();
				c1=p.get�����ð�();
				Car er = new Car(w,f,c1,c,�ݾ�2);
				carlist.add(i,er);
				carlist.remove(i+1);
				break;
			}
			i++;
			
		}
	}
	
}
