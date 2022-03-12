package controlStatement;

public class TwoDiamensionalforloopArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str [] [] = new String [3] [2];
		String str [] [] = {{"username","password"},{"username","password"},{"username","password"}};
		System.out.println("Array size = " +str.length);
System.out.println("Array second size ="+str[0].length);
for (int i=0; i< str.length; i++) {
	for(int j=0;j< str[i].length; j++) {
		System.out.println(str[i][j]);
	}
}
		

	}}
