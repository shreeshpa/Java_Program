import java.util.ArrayList;

public class PracticeArrayList {

	public static void main(String[] args) {
		
		ArrayList<Comparable> arr=new ArrayList(); //Default size of ArrayList is 10.
		System.out.println(arr.size());
		
		arr.add("Shreesh");//0
		arr.add(100); //1
		arr.add(200); //2
		arr.add(300); //3 
		
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		//arr.remove(2);
		System.out.println(arr.get(2));
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
	}
// //data types (Generics) based ArrayList:
		
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(20);
		arr1.add(40);
		arr1.add(50);
		
		System.out.println(arr1.size());
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		 System.out.println("=====Itertor");
		for(Integer int2:arr1) {
			System.out.println(int2);
		}
		
		ArrayList<String> stundentList = new ArrayList<String>();
		stundentList.add("sheba");//0
		stundentList.add("Hari");//1
		stundentList.add("Hari");//2
		
		System.out.println(stundentList);
		
		
	}

}
