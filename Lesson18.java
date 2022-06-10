class Lesson18{
	int r = 2;
	double pi = 3.14;
	
	String areaofcircle() {
		 return "areaofcircle = "+ pi *r * r;
	}
	public static void main(String[] args) {
		Lesson18 ls = new Lesson18();
		System.out.println(ls.areaofcircle());
	}
}