class Lesson8 {
	public static void main (String[] args ) {
		String str = "Son Of A Gun";
		String iM = "Son Of A Gun";
		if(str==iM) {
			System.out.println(str.hashCode());
			System.out.println(iM.hashCode());
		}
	}
}