
public class LoopsProgram {

	public static void main(String[] args) {
		
// 1. WAP to print following output: 
		
		System.out.println("===New Program=====" +"\n");
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("I am Batman" + "\n");
			
			
		}
// 2. WAP to print following output:
		System.out.println("===New Program=====" +"\n");
		
		for(int j=1; j<10;j++) {
			
			System.out.println("I am Batman" +" "+j +"\n");
		}

//3. WAP to print 10 to 1 using for, while and do-while loop	
		
		System.out.println("===While Loop Program=====" +"\n");
		
		int n=10;
		
		while(n>=1) {
			System.out.println(n);
			n--;
		}
		System.out.println("===for Loop Program=====" +"\n");	
		
		for(int k=10;k>=1;k--) {
			System.out.println(k);
			
		}
		System.out.println("===Do-While Loop Program=====" +"\n");	
		 int m=10;
		 do {
			 System.out.println(m);
			 m--;

		 } while(m>=1);
//4. Write a program in Java to print "Hello World" ten times using while loop
		 System.out.println("===While Loop Program=====" +"\n");
		 
		 int l=1;
		 while(l<=10) {
			 System.out.println("Hello World" +"\n");
			 l++;
		 }

// 5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		 System.out.println("===New Program=====" +"\n");
		 int multiple=1;
		 while(multiple<=10) {
			 System.out.println(multiple);
			 if(multiple%7==0) {
				 System.out.println("Multiple of seven has found");
				 break;
				 
			 }
			  multiple++;
			 
		 }
      System.out.println("\n");		 
//5: Write a program to print the following pattern using for loop:	
      System.out.println("===New Program=====" +"\n");	 
		 for(int x=0;x<4;x++) {
			 for(int y=0;y<10;y++) {
				 System.out.print(Integer.toString(x) + Integer.toString(y) +" ");
			 }
			 System.out.println("\n");
		 }
			     
		
		 
	}	

}
