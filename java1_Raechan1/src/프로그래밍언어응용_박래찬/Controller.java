package ���α׷��־������_�ڷ���;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<Car> carlist = new ArrayList<>();
	
	
	
	
	
	public static boolean inCar(String carNum) {
		// 1. �Է¹��� ������ȣ(�μ�) �����´�.
		String num = carNum;
		// * ������ȣ �ߺ�üũ
		for(Car q1 : carlist) {
			if(q1.get������ȣ().equals(num)) {
				System.out.println("������ȣ �ߺ�,,,,�ٽ��Է�");
				return false;
			}
		}
		
		// 2. ������¥(���糯¥) �� ���Ѵ�( ????? : )
		LocalDate day1 = LocalDate.now();
		// 3. �����ð�(����ð�) �� ���Ѵ�( ????? : )
		LocalTime time1 = LocalTime.now();
		// * �����ð� , �ݾ��� ������ x 
		// 4. ������ȣ,������¥,�����ð� => 3������ -> 1��üȭ
		Car car1 = new Car(day1,num,time1);
		// 5. ������ü�� �迭�̳� ����Ʈ �� ���� 
		carlist.add(car1);
		return true;
	}
	
	
	
	
	public static boolean outCar(String carNum) {
		LocalDate date2;
		String num;
		LocalTime time2;
		LocalTime time3;
		int gold;
		
		// 1. �Է¹��� ������ȣ(�μ�) �����´�.
		num = carNum;
		// 2. �迭 or ����Ʈ�� ������ ������ȣ�� ã�Ƽ� 
		int i =0;
		for(Car q2 : carlist) {
			if(q2.get������ȣ().equals(num)) {
				// 3. �����ð�(����ð�) �� ���Ѵ� (????? : )
				time3 = LocalTime.now();
				// 4. ��� [ �����ð� - �����ð� => (��-30)/10 *1000  ]
				int whileTime =  (int)q2.get�����ð�().until(time3,ChronoUnit.MINUTES);
				if(whileTime<30) {
					gold = 0;
				}
				else {
					gold = whileTime*1000/10;	
				}
				// 5. (����)ã�� ��ü�� ��ð��� �ݾ��� �����Ѵ�.
				date2 = q2.get��¥();
				time2 = q2.get�����ð�();
				Car car2 = new Car(date2,num,time2,time3,gold);
				carlist.add(i,car2);
				carlist.remove(i+1);
				return true;
			}
			i++;
		}
		
		return false;
	}
	
	
	
	
	
}
