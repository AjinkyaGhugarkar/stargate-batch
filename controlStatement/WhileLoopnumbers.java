package controlStatement;

public class WhileLoopnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers = {1,2,3,4,5,6};
int size = numbers.length;
System.out.println("size of array="+size);
int index=0;
while (index <size) {
	System.out.println(numbers[index]);
	index ++;
}
	}

}
