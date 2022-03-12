
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 5;
		short s = 20;
		int i = 25;
		long l = 561;

		Byte bvalue = new Byte(b);// autoboxing
		System.out.println(bvalue);
		byte c = bvalue.byteValue();// unboxing
		System.out.println(c);

		Integer obj = new Integer(i);
		int num = obj.intValue();
		System.out.println(num);

	}

}
