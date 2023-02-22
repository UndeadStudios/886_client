/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class508
{
    static Class508 aClass508_5656;
    public static Class508 aClass508_5657 = new Class508();
    static Class508 aClass508_5658;
    public static int[] anIntArray5659;
    
    Class508() {
	/* empty */
    }
    
    static {
	aClass508_5656 = new Class508();
	aClass508_5658 = new Class508();
    }
    
    static final void method8490(Class683 class683, byte i) {
	Class525_Sub28 class525_sub28
	    = Class612.method10050((Class525_Sub28) (class683.anObjectArray8636
						     [((class683.anInt8644
							-= 1285561025)
						       * 1373599041)]),
				   (byte) -36);
	class683.anInt8662 -= 1915637188;
	class525_sub28.anInt10615
	    += (class683.anIntArray8661[501271953 * class683.anInt8662]
		* 1005824369);
	class525_sub28.anInt10614
	    += (class683.anIntArray8661[class683.anInt8662 * 501271953 + 1]
		* -1817162899);
	class525_sub28.anInt10617
	    += (class683.anIntArray8661[501271953 * class683.anInt8662 + 2]
		* 2122014873);
	class525_sub28.anInt10618
	    += (class683.anIntArray8661[3 + class683.anInt8662 * 501271953]
		* 884723639);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = class525_sub28;
    }
    
    static final void method8491(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method8492(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class512.aString5685.startsWith("win") ? 1 : 0;
    }
    
    public static Class712[] method8493(int i) {
	return (new Class712[]
		{ Class712.aClass712_8886, Class712.aClass712_8877,
		  Class712.aClass712_8879, Class712.aClass712_8870,
		  Class712.aClass712_8876, Class712.aClass712_8883,
		  Class712.aClass712_8874, Class712.aClass712_8880,
		  Class712.aClass712_8888, Class712.aClass712_8882,
		  Class712.aClass712_8872, Class712.aClass712_8871,
		  Class712.aClass712_8884, Class712.aClass712_8889,
		  Class712.aClass712_8887, Class712.aClass712_8878,
		  Class712.aClass712_8873, Class712.aClass712_8875,
		  Class712.aClass712_8885 });
    }
    
    static final void method8494(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class479.aString5209 != null
	    && Class479.aString5209.equalsIgnoreCase(string))
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method8495(Class683 class683, short i) {
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = Class648.method10705(Class77.method1565((class683.anIntArray8661
						       [((class683.anInt8662
							  -= 1552651121)
							 * 501271953)]),
						      (byte) 125),
				   Class21.aClass666_213.method80(),
				   -404408675);
    }
    
    public static int method8496(int i, int i_0_, boolean bool, byte i_1_) {
	int i_2_ = 0;
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	for (int i_3_ = 0; i_3_ < class525_sub10.anIntArray10507.length;
	     i_3_++) {
	    if (class525_sub10.anIntArray10507[i_3_] >= 0
		&& ((ItemDefinitions) (Class313_Sub2.aClass40_Sub22_10106.method76
			      (class525_sub10.anIntArray10507[i_3_],
			       -1629096688))).anInt64 * 1533509829 == i_0_)
		i_2_ += AnimationSkin.method3922(i, i_3_, bool, -1179952119);
	}
	return i_2_;
    }
}
