/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class227 implements Interface28
{
    Class221 this$0;
    boolean aBool2343;
    int anInt2344;
    public static Class40_Sub1 aClass40_Sub1_2345;
    
    public void method165(Class228 class228) {
	class228.method4285(1380301611 * anInt2344, aBool2343, -792493621);
	class228.method4275(1380301611 * anInt2344, -453772301)
	    .method4163(-2066804645);
    }
    
    public void method163(Class228 class228, int i) {
	class228.method4285(1380301611 * anInt2344, aBool2343, 186405539);
	class228.method4275(1380301611 * anInt2344, 386060112)
	    .method4163(-1219549772);
    }
    
    public void method160(Class228 class228) {
	class228.method4285(1380301611 * anInt2344, aBool2343, 979709416);
	class228.method4275(1380301611 * anInt2344, 2120403137)
	    .method4163(-1501997078);
    }
    
    public void method162(Class228 class228) {
	class228.method4285(1380301611 * anInt2344, aBool2343, -1565882076);
	class228.method4275(1380301611 * anInt2344, -1055887758)
	    .method4163(531911378);
    }
    
    public void method161(Class228 class228) {
	class228.method4285(1380301611 * anInt2344, aBool2343, -1239300487);
	class228.method4275(1380301611 * anInt2344, 768760005)
	    .method4163(-1797424101);
    }
    
    Class227(Class221 class221, RSBuffer class525_sub38) {
	this$0 = class221;
	anInt2344 = class525_sub38.readUnsignedShort((byte) 112) * 1260596099;
	aBool2343 = class525_sub38.readUnsignedByte(1019157446) == 1;
    }
    
    public void method164(Class228 class228) {
	class228.method4285(1380301611 * anInt2344, aBool2343, -817262789);
	class228.method4275(1380301611 * anInt2344, -996603478)
	    .method4163(-2044725912);
    }
    
    public static void method4260(boolean bool, boolean bool_0_, short i) {
	Class589.aBool7800 = bool;
	Class589.aBool7809 = bool_0_;
    }
    
    static final void method4261(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.aBool2673
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) == 1;
	Class649.method10708(class259, (byte) 0);
	if (class259.anInt2576 * 1534974651 == -1 && !class245.aBool2428)
	    Class1.method516(class259.anInt2588 * 1984678839, -1460671611);
    }
    
    public static Object[] method4262(RSBuffer class525_sub38,
                                      Class495[] class495s, byte i) {
	int i_1_ = class525_sub38.method16740((byte) -76);
	Object[] objects = new Object[class495s.length * i_1_];
	for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
	    for (int i_3_ = 0; i_3_ < class495s.length; i_3_++) {
		int i_4_ = i_3_ + class495s.length * i_2_;
		objects[i_4_]
		    = class495s[i_3_].aClass480_5456.method7813(class525_sub38,
								1552651121);
	    }
	}
	return objects;
    }
}
