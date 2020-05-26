
public class PracticeArray {

	public static void main(String[] args) {
		
	//1. int array
		
	    int arr[]=new int[4];
	    arr[0]=10;
	    arr[1]=20;
	    arr[2]=30;
	    arr[3]=40;
	   // arr[4]=50;  //ArrayIndexOutOfBoundsException
		
	    System.out.println(arr[0]);
	    System.out.println(arr[1]+arr[2]);
	 //   System.out.println(arr[4]); ////ArrayIndexOutOfBoundsException
		System.out.println(arr.length);
		int len=arr.length;
		System.out.println("The Length Of the array is : "+len);
		
		System.out.println("LI=>"+ 0);
		System.out.println("HI=>"+(len-1));
		
		System.out.println("=====Print all the values if array using Loops");
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
     // Double array
		System.out.println("=====Double Array");
		double arr1[]=new double[3];
	    arr1[0]=12.1;
	    arr1[1]=10.1;
	    arr1[2]=11.1;
	    System.out.println(arr1[0]+ arr1[1]);
	    System.out.println(arr1.length);
		int leng=arr1.length;
		System.out.println("The Length of double array is: "+leng);
		for(int j=0;j<arr1.length;j++) {
			System.out.println(arr1[j]);
		}
	// Char array
		System.out.println("=====Character Array");
		
		char ch[]=new char[3];
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch.length);
		for(int k=0;k<ch.length;k++) {
			System.out.println(ch[k]);
		}
	// String array
		System.out.println("=====String Array");
		
		String str[]=new String[4];
		str[0]="Java";
		str[1]="C++";
		str[2]="Python";
		str[3]="Java";
		
		System.out.println(str[0]+str[3]);
		for(int s=0;s<str.length;s++) {
			System.out.println(str[s]);
		}
	// String array
		System.out.println("=====String Array=====");	
		
		String studentNames[]=new String[4];
		studentNames[0]="Shreesh";
		studentNames[1]="Chandan";
		studentNames[2]="Shirish";
		studentNames[3]="Krishna";
		System.out.println(studentNames.length);
		for(int l=0;l<studentNames.length;l++) {
			
			if(studentNames[l].equals("Shreesh")) {
				System.out.println("Marks is "+ 100);
			}
			else if(studentNames[l].equals("Shirish")) {
				System.out.println("Marks is "+ 200);
			}
		}
	//Object Array: 	
		System.out.println("=====Object Array=====");	
		
		Object obj[]=new Object[4];
		obj[0]="Shreesh";
		obj[1]=23;
		obj[2]="Male";
		obj[3]=12.33;
		
		int len1=obj.length;
		System.out.println(obj.length);
		System.out.println("LI=> "+ 0);
		System.out.println("HI=> "+(len1-1));
		for(int ob=0;ob<obj.length;ob++) {
			System.out.println(obj[ob]);
		}
		
		
	}

}
