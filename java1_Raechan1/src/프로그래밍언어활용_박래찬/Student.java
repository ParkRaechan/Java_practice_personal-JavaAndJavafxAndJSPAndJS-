package ���α׷��־��Ȱ��_�ڷ���;

public class Student {

	String name;
	int ����;
	int ����;
	int ����;
	float sum; //����
	float avg; //���
	int grd; //����
	
	
	

	public Student() {
		super();
	}

	public Student(String name, int ����, int ����, int ����, float sum, float avg) {
		super();
		this.name = name;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		this.sum = sum;
		this.avg = avg;
	}
	
	public Student(String name, int ����, int ����, int ����, float sum, float avg, int grd) {
		super();
		this.name = name;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		this.sum = sum;
		this.avg = avg;
		this.grd = grd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public float getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getGrd() {
		return grd;
	}

	public void setGrd(int grd) {
		this.grd = grd;
	}
	
	
}
