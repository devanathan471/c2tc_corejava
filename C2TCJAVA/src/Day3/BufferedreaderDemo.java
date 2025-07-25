package Day3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedreaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		
		System.out.println("enter name :");
		name =br.readLine();
		
		int id;
		System.out.println("enter your ID:");
		id = Integer.parseInt(br.readLine());
		
		
		float marks;
		System.out.println("enter marks:");
		marks = Float.parseFloat(br.readLine());
		
		System.out.println("name: "+name+" id: "+id+"marks: "+marks);
	}
	

}
