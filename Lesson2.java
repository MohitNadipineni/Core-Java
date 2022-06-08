class Lesson2{
	public static void main(String[] args) {
		int num1 =  23;
		int num2 = 30;
		char myNum;
		myNum = 'N';
		switch(myNum) {
		case '1' :
			if(num1 < num2) {
				System.out.println("23 is less than 30");
			}
			break;
		case '2' :
			if (num1 > num2) {
				System.out.println("23 is greater than 30");
			}
			break;
			
		}
	}
}