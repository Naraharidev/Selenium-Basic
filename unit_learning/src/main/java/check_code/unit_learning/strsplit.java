package check_code.unit_learning;

public class strsplit {
 public static void main(String[] args) {
	String str = "helow\nmarhsfj";
	String [] s=str.split("\n");
	System.out.println(str);
	
	for (String s1:s) System.out.println(s1);
}
}
