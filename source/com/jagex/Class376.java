/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class376
{
    public static Class376 aClass376_3896;
    public static Class376 aClass376_3897;
    public static Class376 aClass376_3898;
    public static Class376 aClass376_3899;
    public static Class376 aClass376_3900 = new Class376();
    public static Class376 aClass376_3901;
    public static Class376 aClass376_3902;
    
    Class376() {
	/* empty */
    }
    
    static {
	aClass376_3897 = new Class376();
	aClass376_3896 = new Class376();
	aClass376_3899 = new Class376();
	aClass376_3902 = new Class376();
	aClass376_3901 = new Class376();
	aClass376_3898 = new Class376();
    }
    
    static final void method6365(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class231.method4388(class259, class245, class683, -1470142746);
    }
    
    public static Class469[] method6366(byte i) {
	return (new Class469[]
		{ Class469.aClass469_5131, Class469.aClass469_5130,
		  Class469.aClass469_5132 });
    }
    
    public static final void method6367(String string, boolean bool, int i) {
	int i_0_ = client.aBool11229 ? 400 : 100;
	if (null != string) {
	    if (client.anInt11366 * -651611127 >= i_0_)
		Class202.method3852
		    (4,
		     (client.aBool11229
		      ? Class53.aClass53_528.method1169(Class21.aClass666_213,
							1552651121)
		      : Class53.aClass53_529.method1169(Class21.aClass666_213,
							1552651121)),
		     (byte) -2);
	    else {
		String string_1_
		    = Class48.method1111(string, Class454.aClass76_4951,
					 2030034279);
		if (string_1_ != null) {
		    for (int i_2_ = 0; i_2_ < -651611127 * client.anInt11366;
			 i_2_++) {
			Class31 class31 = client.aClass31Array11368[i_2_];
			String string_3_
			    = Class48.method1111(class31.aString300,
						 Class454.aClass76_4951,
						 1627923329);
			if (null != string_3_ && string_3_.equals(string_1_)) {
			    Class202.method3852(4,
						new StringBuilder().append
						    (string).append
						    (Class53.aClass53_530
							 .method1169
						     (Class21.aClass666_213,
						      1552651121))
						    .toString(),
						(byte) -40);
			    return;
			}
			if (null != class31.aString301) {
			    String string_4_
				= Class48.method1111(class31.aString301,
						     Class454.aClass76_4951,
						     1653854409);
			    if (null != string_4_
				&& string_4_.equals(string_1_)) {
				Class202.method3852(4,
						    new StringBuilder().append
							(string).append
							(Class53
							     .aClass53_530
							     .method1169
							 ((Class21
							   .aClass666_213),
							  1552651121))
							.toString(),
						    (byte) -49);
				return;
			    }
			}
		    }
		    for (int i_5_ = 0; i_5_ < client.anInt11204 * -883281325;
			 i_5_++) {
			Class66 class66 = client.aClass66Array11356[i_5_];
			String string_6_
			    = Class48.method1111(class66.aString708,
						 Class454.aClass76_4951,
						 1964934837);
			if (string_6_ != null && string_6_.equals(string_1_)) {
			    Class202.method3852(4,
						new StringBuilder().append
						    (Class53.aClass53_498
							 .method1169
						     (Class21.aClass666_213,
						      1552651121))
						    .append
						    (string).append
						    (Class53.aClass53_537
							 .method1169
						     (Class21.aClass666_213,
						      1552651121))
						    .toString(),
						(byte) -28);
			    return;
			}
			if (null != class66.aString707) {
			    String string_7_
				= Class48.method1111(class66.aString707,
						     Class454.aClass76_4951,
						     1840630531);
			    if (string_7_ != null
				&& string_7_.equals(string_1_)) {
				Class202.method3852
				    (4,
				     new StringBuilder().append
					 (Class53.aClass53_498.method1169
					  (Class21.aClass666_213, 1552651121))
					 .append
					 (string).append
					 (Class53.aClass53_537.method1169
					  (Class21.aClass666_213, 1552651121))
					 .toString(),
				     (byte) -7);
				return;
			    }
			}
		    }
		    if (Class48.method1111
			    ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			      .aString12231),
			     Class454.aClass76_4951, 2051057537)
			    .equals(string_1_))
			Class202.method3852(4, (Class53.aClass53_532.method1169
						(Class21.aClass666_213,
						 1552651121)), (byte) -64);
		    else {
			Class96 class96 = Class111.method1979(373891263);
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4263,
						class96.aClass6_1169,
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16735
			    (Class161.method2628(string, 325819828) + 1,
			     -830761198);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16700(string, 520254952);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(bool ? 1 : 0, -520359224);
			class96.method1794(class525_sub15, (short) 28502);
		    }
		}
	    }
	}
    }
    
    static void method6368(int i) {
	Class109.aClass200_1321.method3791((byte) 29);
    }
    
    static final void method6369(Class683 class683, int i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub21_10689,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]),
	     (byte) -17);
	Class650.method10715(-1758466106);
    }
}
