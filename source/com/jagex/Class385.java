/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class385 implements Interface47
{
    JS5 aClass458_4021;
    Class200 aClass200_4022 = new Class200(64);
    
    public Class385(JS5 class458) {
	aClass458_4021 = class458;
    }
    
    public Class394 method338(int i, short i_0_) {
	Class394 class394 = (Class394) aClass200_4022.method3785((long) i);
	if (null != class394)
	    return class394;
	byte[] is = aClass458_4021.getFile(0, i, 506515888);
	class394 = new Class394();
	if (is != null)
	    class394.method6504(new RSBuffer(is), i, -1324934615);
	aClass200_4022.method3788(class394, (long) i);
	return class394;
    }
    
    public Class394 method337(int i) {
	Class394 class394 = (Class394) aClass200_4022.method3785((long) i);
	if (null != class394)
	    return class394;
	byte[] is = aClass458_4021.getFile(0, i, 49415475);
	class394 = new Class394();
	if (is != null)
	    class394.method6504(new RSBuffer(is), i, -1587457671);
	aClass200_4022.method3788(class394, (long) i);
	return class394;
    }
    
    static final void method6438(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2707
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1642690565);
	class259.aBool2695 = true;
    }
    
    static final void method6439(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (((ItemDefinitions)
		Class313_Sub2.aClass40_Sub22_10106.method76(i_1_, 1395034233))
	       .aBool83) ? 1 : 0;
    }
    
    static final void method6440(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -1;
    }
    
    static final void method6441(Class683 class683, int i) {
	if (Class695.aBool8757 && null != Class96.aFrame1186)
	    Class332_Sub1.method15672(Class198_Sub13.aClass525_Sub30_9973
					  .aClass696_Sub41_10704
					  .method17337(1285462792),
				      -1, -1, false, (byte) -11);
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	boolean bool = ((class683.anIntArray8661
			 [(class683.anInt8662 -= 1552651121) * 501271953])
			== 1);
	String string_2_ = new StringBuilder().append
			       (Class453_Sub4.method15959(-1527038723)).append
			       (string).toString();
	NPCDefinitions.method5393(string_2_, bool, client.aBool11241, -1892528428);
    }
    
    static final void method6442(Class683 class683, int i) {
	if (0 == client.anInt11362 * 1819257147)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -2;
	else if (1819257147 * client.anInt11362 == 1)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= client.anInt11204 * -883281325;
    }
    
    public static boolean method6443(int i, int i_3_) {
	for (Class525_Sub16_Sub16 class525_sub16_sub16
		 = ((Class525_Sub16_Sub16)
		    Class61.aClass709_660.method14372((short) -22241));
	     class525_sub16_sub16 != null;
	     class525_sub16_sub16
		 = ((Class525_Sub16_Sub16)
		    Class61.aClass709_660.method14353(-1450727660))) {
	    if (Class468.method7708(91103913 * class525_sub16_sub16.anInt11861,
				    (byte) 112)
		&& (long) i == (class525_sub16_sub16.aLong11860
				* -6417801577210029731L))
		return true;
	}
	return false;
    }
}
