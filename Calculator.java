import java.util.Scanner;

public class Calculator {
	
    int a,b;
	
	Calculator(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	int add() { return a+b;  }
    int sub() { return a-b;  }
	int mul() { return a*b;  }
	int div() { return a/b;  }
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		
		System.out.println("Enter [1/2/3/4]:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("\nEnter your choice:");
		int ch=sc.nextInt();
		int res=0;
		Calculator c = new Calculator(a,b);
		
		switch(ch) {
		case 1: res = c.add(); break;
		case 2: res = c.sub(); break;
		case 3: res = c.mul(); break;
		case 4: res = c.div(); break;
		default: System.out.println("Invalid");
		}
		System.out.println("Result:" + res);
	}
	
}
