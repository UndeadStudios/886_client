/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class372
{
    public abstract Object method6331(int i, int i_0_, Class397 class397,
				      Class391 class391, int i_1_, float f);
    
    public abstract void method6332(byte i);
    
    public abstract Object method6333(int i, int i_2_, Class397 class397,
				      Class391 class391, int i_3_, float f,
				      int i_4_);
    
    public abstract void method6334(Object object, byte i);
    
    public abstract void method6335(Object object, byte[] is, int i, int i_5_,
				    int i_6_);
    
    public abstract int method6336(Object object, int i);
    
    public abstract Class494 method6337(Class477 class477, int i);
    
    abstract Object method6338(Class393 class393, int i);
    
    public abstract void method6339(Object object);
    
    public abstract void method6340(int i);
    
    Class372() {
	/* empty */
    }
    
    public abstract int method6341(Object object);
    
    public abstract Class381 method6342(int i);
    
    public abstract Object method6343(int i, int i_7_, Class397 class397,
				      Class391 class391, int i_8_, float f);
    
    public abstract Object method6344(int i, int i_9_, Class397 class397,
				      Class391 class391, int i_10_, float f);
    
    abstract Object method6345(Class393 class393);
    
    public abstract void method6346(Object object);
    
    public abstract Class381 method6347();
    
    public abstract void method6348(Object object);
    
    public abstract void method6349(Object object, byte[] is, int i,
				    int i_11_);
    
    public abstract void method6350(Object object, byte[] is, int i,
				    int i_12_);
    
    public abstract void method6351();
    
    public abstract Class494 method6352(Class477 class477);
    
    public abstract Class494 method6353(Class477 class477);
    
    abstract Object method6354(Class393 class393);
    
    abstract Object method6355(Class393 class393);
    
    public abstract Class494 method6356(Class477 class477);
    
    public abstract void method6357();
    
    public abstract Object method6358(int i, int i_13_, Class397 class397,
				      Class391 class391, int i_14_, float f);
    
    public abstract void method6359();
    
    static final void method6360(Class683 class683, short i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class422.method6758(1973152626);
    }
    
    static final void method6361(Class683 class683, int i) {
	if (0 == 1819257147 * client.anInt11362)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= client.anInt11366 * -651611127;
    }
    
    static final void method6362(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	long l
	    = (long) class683.anIntArray8661[501271953 * class683.anInt8662];
	long l_15_ = (long) (class683.anIntArray8661
			     [1 + class683.anInt8662 * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) (l + l * l_15_ / 100L);
    }
    
    static final void method6363(Class683 class683, int i) {
	int i_16_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (Class162.aClass245Array1764[i_16_] == null)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	else {
	    String string = (Class162.aClass245Array1764[i_16_]
			     .aClass259Array2426[0].aString2586);
	    if (null == string)
		class683.anObjectArray8636
		    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		    = "";
	    else
		class683.anObjectArray8636
		    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		    = string.substring(0, string.indexOf(':'));
	}
    }
    
    public static void method6364(Class245 class245, Class259 class259,
				  int i) {
	Class259 class259_17_
	    = Class65.method1432(class245, class259, 93078391);
	int i_18_;
	int i_19_;
	if (class259_17_ == null) {
	    i_18_ = -1445589163 * Class434.anInt4827;
	    i_19_ = Class696_Sub47.anInt11032 * -1883654023;
	} else {
	    i_18_ = -1694810043 * class259_17_.anInt2602;
	    i_19_ = class259_17_.anInt2598 * 2054207119;
	}
	Class465.method7669(class259, i_18_, i_19_, false, (byte) -32);
	Class617.method10115(class259, i_18_, i_19_, -1297484406);
    }
}
