class Lesson15{
	int rollno;
	String studentName;
	char grade;
	
	 String ExamMarks() {
		grade = 'A';
		studentName = "john";
		rollno = 1234;
		return "grade :"+  grade;
	}
	
	public static void main(String[] args) {
		Lesson15 ls = new Lesson15();
		System.out.println(ls.ExamMarks());
		}
}