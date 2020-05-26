
public class MethodOverLoadingAmazon {
	
	
	public void search() {
		System.out.println("0 parameter search");
	}
    public void search(String name) {
		System.out.println(name);
	}
    public void search(int price) {
		System.out.println(price);
	}
    public void search(String name, int price) {
		System.out.println(name+ " "+ price);
	}
    public void search(int price, String name) {
		System.out.println(price+ " "+ name);
	}
    
    
	public static void main(String[] args) {
	MethodOverLoadingAmazon sear=new MethodOverLoadingAmazon();
	sear.search();
	sear.search("Shreesh");
	sear.search(100);
	sear.search(200, "Hp");
	sear.search("Mac", 100);
	
	}

}
