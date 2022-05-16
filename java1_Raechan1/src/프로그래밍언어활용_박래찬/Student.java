package 프로그래밍언어활용_박래찬;

public class Student {

	String name;
	int 국어;
	int 영어;
	int 수학;
	float sum; //총점
	float avg; //평균
	int grd; //석차
	
	
	

	public Student() {
		super();
	}

	public Student(String name, int 국어, int 영어, int 수학, float sum, float avg) {
		super();
		this.name = name;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		this.sum = sum;
		this.avg = avg;
	}
	
	public Student(String name, int 국어, int 영어, int 수학, float sum, float avg, int grd) {
		super();
		this.name = name;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
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

	public int get국어() {
		return 국어;
	}

	public void set국어(int 국어) {
		this.국어 = 국어;
	}

	public int get영어() {
		return 영어;
	}

	public void set영어(int 영어) {
		this.영어 = 영어;
	}

	public int get수학() {
		return 수학;
	}

	public void set수학(int 수학) {
		this.수학 = 수학;
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
