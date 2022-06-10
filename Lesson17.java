class Lesson17{
	int x = 23;                                           // Instance variable
	double y = 30.04;
	
  double  addition(){
	  int x = 30	;	                                    // Local Variable
	  return  x+y;
}
  public static void main (String[] args) {
	  Lesson17 ls = new Lesson17();
	  System.out.println(ls.x);
	  System.out.println(ls.addition());
  }
}