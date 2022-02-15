package org.listops;


public class Zhn {
	private int fun(int a,int b) {
		if(a==0)
		{
			return b;
		}
		if(a%2==0)
		{
			fun(a/2,b/2);
		}
		return fun(a++-1,++b+1);

	}
	public static int main(String[] args) {
		Zhn z = new Zhn();
		int fun1 = z.fun(13, 7);
		System.out.println(fun1);
		return 0;

}
}
