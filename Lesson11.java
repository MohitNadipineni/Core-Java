import java.io.*;
class Lesson11{
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter No1: ");
		String no1 = br.readLine();
		int a = Integer.parseInt(no1);
		
		System.out.println("Enter No2: ");
		String no2 = br.readLine();
		int b = Integer.parseInt(no2);
		 
		int result = a+b;
		System.out.println("result :"+ result);
		
	}
}