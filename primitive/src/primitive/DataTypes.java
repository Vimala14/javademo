package primitive;

public class DataTypes {
	public static void main(String[] args)
	{
		long minLongValue=Long.MIN_VALUE;
		long maxLongValue=Long.MAX_VALUE;
		System.out.println(minLongValue);
		System.out.println(maxLongValue);
		float a=7f/3f;
		System.out.println(a);
		double b=7d/3d;
		System.out.println(b);
		byte[] c= {97,98,99};
		String s1=new String(c);
		System.out.println(s1);
	}

}
