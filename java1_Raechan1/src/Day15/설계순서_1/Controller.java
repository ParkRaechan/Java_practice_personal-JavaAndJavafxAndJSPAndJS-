package Day15.�������_1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {
	
	public static ArrayList<Car> carlist = new ArrayList<>(); 
	
	 // 1. �迭 ��� 
	//public static Car[] carlist = new Car[100];
	// 2. ����Ʈ ���
	//public static ArrayList<Car> carlist = new ArrayList<>(); 


	// ���� �޼ҵ� 
	public static void ����( String ������ȣ ) {
		// ���� �ڵ� �ۼ� 
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
		String a= ������ȣ;
			// * ������ȣ �ߺ�üũ
		for(Car temp : carlist) {
			// 2. ������¥(���糯¥) �� ���Ѵ�( ????? : )
			LocalDate wndow =LocalDate.now();
			// 3. �����ð�(����ð�) �� ���Ѵ�( ????? : )
			LocalTime endnow = LocalTime.now();
			// * �����ð� , �ݾ��� ������ x 
			LocalTime q1 = null;
			int q2 = 0;
			
			// 4. ������ȣ,������¥,�����ð� => 3������ -> 1��üȭ
			Car q = new Car(wndow,a,endnow,q1,q2);
			// 5. ������ü�� �迭�̳� ����Ʈ �� ���� 
			carlist.add(q);
			break;
			
		}
		
	}
	
	
	
	// ���� �޼ҵ� 
	public static boolean ����( String ������ȣ ) {
		// ���� �ڵ� �ۼ�
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
			// 2. �迭 or ����Ʈ�� ������ ������ȣ�� ã�Ƽ� 
			// 3. �����ð�(����ð�) �� ���Ѵ� (????? : )
			// 4. ��� [ �����ð� - �����ð� => (��-30)/10 *1000  ]
			// 5. (����)ã�� ��ü�� ��ð��� �ݾ��� �����Ѵ�.
		return false;
	}
	
}
