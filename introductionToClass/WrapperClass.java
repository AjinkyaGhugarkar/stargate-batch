package introductionToClass;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "j8v4 pr09ram";

char [] ch = s.toCharArray();
int add =0;

for(int i =0; i < ch.length; i++) {
	if (Character.isDigit(ch[i])) {
	System.out.println("Digit :"+ch[i]);	
		add= add + Character.getNumericValue(ch[i]);
	}
}
System.out.println("Addition of digits="+add);
	}

}
