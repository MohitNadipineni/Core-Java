class Lesson16{
	int ticketno;
	String travelmethod;
	String destination;
	float distancetravelled;
	
	String Journey(){
		String passengername = "John";
		ticketno = 23467;
		travelmethod = "aeroplane";
		destination = "Miami";
		distancetravelled = 359.45f;
		return "ticketno"+ ticketno + "destination" + destination;
	}
	
	public static void main(String[] args) {
		Lesson16 ls = new Lesson16();
		System.out.println(ls.Journey());
	}
	
}