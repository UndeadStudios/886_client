/* Class198_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class198_Sub15 extends Class198
{
    public static JS5 idx_29;
    
    public void method3753(int i) {
	Class231.method4392(true, (short) -17706);
    }
    
    Class198_Sub15(RSBuffer class525_sub38) {
	super(class525_sub38);
    }
    
    public void method3754() {
	Class231.method4392(true, (short) 87);
    }
    
    public void method3757() {
	Class231.method4392(true, (short) -26083);
    }
    
    public void method3756() {
	Class231.method4392(true, (short) -8868);
    }
    
    static void method15654(Class71_Sub1 class71_sub1, int i, int i_0_,
			    byte i_1_) {
	class71_sub1.method16371(i, -1017856077);
	int i_2_;
	if (i_0_ > 100000) {
	    Class101.method1882((short) -27551);
	    i_2_ = 4;
	} else if (i_0_ > 50000) {
	    Class654.method10801(1066586323);
	    i_2_ = 3;
	} else if (i_0_ > 10000) {
	    Class36.method978((byte) -11);
	    i_2_ = 2;
	} else {
	    Class473.method7754(true, -1335910809);
	    i_2_ = 1;
	}
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708
		.method17160(990080314)
	    != i) {
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701, i,
		 (byte) -25);
	    Class217.method4146(i, false, (byte) 24);
	} else
	    Class198_Sub13.aClass525_Sub30_9973.method16503
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708,
		 true, (byte) -43);
	Class650.method10715(-1758466106);
	class71_sub1.method16367(i_2_, (byte) 40);
    }
    
    static final void method15655(Class683 class683, byte i) {
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (i_3_ < 0 || i_3_ > 5 || i_3_ == 2)
	    i_3_ = 3;
	Class217.method4146(i_3_, false, (byte) 45);
    }
    
    static boolean method15656(Interface62 interface62, int i) {
	ObjectDefinitions class602
	    = ((ObjectDefinitions)
	       client.aClass507_11137.method8362((byte) -1)
		   .method76(interface62.method406((byte) 1), -645379175));
	if (class602.anInt7895 * 1280945471 == -1)
	    return true;
	Class79 class79
	    = ((Class79)
	       Class568.aClass40_Sub17_7627
		   .method76(class602.anInt7895 * 1280945471, -663966824));
	if (-1 == 1911611899 * class79.anInt838)
	    return true;
	return class79.method1585(981282040);
    }
}
