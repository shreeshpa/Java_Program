import java.util.ArrayList;

public class ArrayListPrograms {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		
		arr.add(100); //0
		arr.add(200); //1
		
		System.out.println(arr.size());
		arr.add(300); //2
		arr.add(400); //3
		System.out.println(arr.size());
		
		
		//arr.remove(2);
		System.out.println(arr.get(2));
		
		for(int i=0; i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
System.out.println("=======New Program========"+ "\n");		
// Generics ArrayList
		
		ArrayList<String> studenlist=new ArrayList<String>();
		studenlist.add("Shreesh");
		studenlist.add("Chandan");
		studenlist.add(null);
		
		
		System.out.println(studenlist.size());
		System.out.println(studenlist.get(1));
		
		System.out.println("=======New Program========"+ "\n");	
		
		ArrayList<Integer> studentMarks=new ArrayList<Integer>();
		studentMarks.add(100);
		studentMarks.add(200);
		studentMarks.add(300);
		
		System.out.println(studentMarks.size());
		System.out.println(studentMarks.get(0));
		System.out.println(studentMarks.get(2));
		
		for(int j=0;j<studentMarks.size();j++)
		{
			System.out.println(studentMarks.get(j));
		}
		System.out.println("=======New Program========"+ "\n");		
		
		ArrayList<Object> obj=new ArrayList<Object>();
		
		obj.add("Shreesh");
		obj.add(2);
		obj.add("9th June 2020");
		
		for(int k=0; k<obj.size();k++) {
			System.out.println(obj.get(k));
		}
		
	}

}
