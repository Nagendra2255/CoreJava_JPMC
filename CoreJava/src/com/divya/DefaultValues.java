package com.divya;

class Default1
{
	static int intVariable;
	static String strVariabke;
	static byte byteVariable;
	static char charVariable;
	static double doubleVariable;
	static boolean booleanVariable;
	static float floatVariable;
	static short shortVariable;
	
	
}

public class DefaultValues {

	public static void main(String[] args)
	{
		Accessspecifiers aa = new Accessspecifiers();
		System.out.println(aa.d);
		int xx;
		//System.out.println(xx);
		System.out.println("PRINTING DEFAULT VALUES..");
		
		Default1 def = new Default1();
		System.out.println(def.booleanVariable);//False
		System.out.println(def.intVariable);//0
		System.out.println(def.strVariabke);//null
		System.out.println(def.byteVariable);//0
		System.out.println(def.floatVariable);//0.0
		System.out.println(def.doubleVariable);//0.0
		System.out.println(def.charVariable);
		System.out.println(def.shortVariable);//0
		System.out.println(Default1.byteVariable);
		System.out.println(def.byteVariable);

	}

}
