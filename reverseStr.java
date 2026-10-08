public class reverseStr{
	public static void main(String[] args){
		String yum = "desserts";
		for (int i = 0; i < yum.length(); i++){
			System.out.print(yum.charAt(yum.length()-1-i));
		}
	}
}
