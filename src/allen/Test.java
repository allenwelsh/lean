package allen;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import jdk.management.cmm.SystemResourcePressureMXBean;

public class Test {

	public static void main(String[] args) {
//		testoutput();
		redirctOutput();
	}
	
	
	public static  void testoutput() {
		Scanner scanner = new Scanner(System.in);
		System.err.println("test");
		System.out.print("Test.main()");
		System.out.print("请输入您的id：");
		String line = scanner.nextLine();
		System.out.println(line);
	}
	
	
	public static void redirctOutput() {
		
		try {
			
			PrintStream out = System.out;
			PrintStream ps = new PrintStream("./log.txt");
			System.setOut(ps);
			int age =19;
			System.out.println("初始化开始");
			String sex = "女";
			String info = "dsadsa"+sex+age;
			System.out.println(info);
			System.setOut(out);
			System.out.println("over");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("over2");
			e.printStackTrace();
		}
		
	}
}





