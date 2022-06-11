class Lesson20{
	double height;
	 double width;
	 double depth;
	 double volume ;
  
	 double volume(){
		volume = height*depth*width;
		return volume;
	}
	public static void main(String[] args) {
		Lesson20 box1 = new Lesson20();
		Lesson20 box2 = new Lesson20();
		box1.width = 23.2;
		box1.height= 24.3;
		box1.depth = 30.2;
		
		box2.height = 30.23;
		box2.depth = 32.30;
		box2.width = 23.30;
		System.out.println(box1.volume());
		System.out.println(box2.volume());
	}
}