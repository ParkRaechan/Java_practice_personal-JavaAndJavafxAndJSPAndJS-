package Day00;

public class Student {

	String name;
	int 국어;
	int 수학;
	int 영어;
	int sum;
	double 평균;
	int 등수;
	
	public Student() {
		super();
	}

	public Student(String name, int 국어, int 수학, int 영어, int sum, double 평균, int 등수) {
		super();
		this.name = name;
		this.국어 = 국어;
		this.수학 = 수학;
		this.영어 = 영어;
		this.sum = sum;
		this.평균 = 평균;
		this.등수 = 등수;
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

	public int get수학() {
		return 수학;
	}

	public void set수학(int 수학) {
		this.수학 = 수학;
	}

	public int get영어() {
		return 영어;
	}

	public void set영어(int 영어) {
		this.영어 = 영어;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double get평균() {
		return 평균;
	}

	public void set평균(double 평균) {
		this.평균 = 평균;
	}

	public int get등수() {
		return 등수;
	}

	public void set등수(int 등수) {
		this.등수 = 등수;
	}
	
	
	
	
}
