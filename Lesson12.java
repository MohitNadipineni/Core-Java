class Lesson12{
	public static void main (String[] args) {
		Integer a = Integer.parseInt(args[0]);
		switch (a) {
		case 90 : System.out.println("Grade A+");
		break;
		case 80 : System.out.println("Grade A");
		break;
		case 70 : System.out.println("Grade B+");
		break;
		case 75 : System.out.println("Grade B");
		break;
		case 60 : System.out.println("Grade c");
		break;
		default : System.out.println("Fail");
		}
	}
}