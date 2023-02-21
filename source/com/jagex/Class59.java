/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchEvent;

public class Class59
{
    static final int anInt637 = 127;
    static final int anInt638 = 7;
    
    static void method1224(Class182 class182, int i, int i_0_,
			   Class259 class259, int i_1_) {
	for (int i_2_ = 7; i_2_ >= 0; i_2_--) {
	    for (int i_3_ = 127; i_3_ >= 0; i_3_--) {
		int i_4_
		    = (i_1_ & 0x3f) << 10 | (i_2_ & 0x7) << 7 | i_3_ & 0x7f;
		Class455_Sub1.method15988(false, true, 679780902);
		int i_5_ = Class381.anIntArray3929[i_4_];
		Class511.method8524(false, true, (byte) 1);
		class182.method3151(i + (i_3_ * (class259.anInt2602
						 * -1694810043)
					 >> 7),
				    (2054207119 * class259.anInt2598 * (7
									- i_2_)
				     >> 3) + i_0_,
				    ((class259.anInt2602 * -1694810043 >> 7)
				     + 1),
				    (class259.anInt2598 * 2054207119 >> 3) + 1,
				    ~0xffffff | i_5_, 0);
	    }
	}
    }
    
    static void method1225(Class182 class182, int i, int i_6_,
			   Class259 class259, int i_7_) {
	for (int i_8_ = 7; i_8_ >= 0; i_8_--) {
	    for (int i_9_ = 127; i_9_ >= 0; i_9_--) {
		int i_10_
		    = (i_7_ & 0x3f) << 10 | (i_8_ & 0x7) << 7 | i_9_ & 0x7f;
		Class455_Sub1.method15988(false, true, 679780902);
		int i_11_ = Class381.anIntArray3929[i_10_];
		Class511.method8524(false, true, (byte) 1);
		class182.method3151(i + (i_9_ * (class259.anInt2602
						 * -1694810043)
					 >> 7),
				    (2054207119 * class259.anInt2598 * (7
									- i_8_)
				     >> 3) + i_6_,
				    ((class259.anInt2602 * -1694810043 >> 7)
				     + 1),
				    (class259.anInt2598 * 2054207119 >> 3) + 1,
				    ~0xffffff | i_11_, 0);
	    }
	}
    }
    
    Class59() throws Throwable {
	throw new Error();
    }
    
    public static void method1226(Class182 class182, long l) {
	if (3 != Class589.anInt7805 * -345055283
	    && Class589.anInt7805 * -345055283 != 0) {
	    if (-345055283 * Class589.anInt7805 == 1) {
		if (null == Class589.aStringArray7793
		    || 0 == Class589.aStringArray7793.length)
		    throw new RuntimeException("");
		int i = 0;
		for (int i_12_ = 0; i_12_ < Class589.aStringArray7793.length;
		     i_12_++) {
		    if (Class589.aStringArray7793[i_12_] != null) {
			try {
			    i += (Class312_Sub1.aClass544_10064.method8917
				  (Class589.aStringArray7793[i_12_], false,
				   (byte) 0));
			} catch (Exception_Sub1 exception_sub1) {
			    Class223.method4243(Class30.aClass30_297,
						exception_sub1.aString11417,
						(2007005951
						 * exception_sub1.anInt11416),
						exception_sub1.getCause(),
						(byte) -48);
			    Class589.anInt7805 = -632066289;
			    return;
			}
		    } else
			i += 100;
		}
		Class589.anInt7791
		    = 1551679279 * (i / Class589.aStringArray7793.length);
		if (100 == Class589.anInt7791 * 1271064527) {
		    Class589.anInt7805
			= Class567.method9487(-333086686) * -210688763;
		    if (Class589.anInt7805 * -345055283 != 2)
			return;
		} else
		    return;
	    }
	    TwitchEvent[] twitchevents = Class285.aTwitchTV3143.Service();
	    if (twitchevents != null) {
		for (int i = 0; i < twitchevents.length; i++) {
		    TwitchEvent twitchevent = twitchevents[i];
		    if (twitchevent != null
			&& Class566.method9473(twitchevent, l)) {
			Class591 class591 = twitchevent.method6641();
			if (class591 != null)
			    Class50.method1128(class591.method80(),
					       twitchevent, (byte) -83);
		    }
		}
	    }
	    if (Class285.aTwitchTV3143.IsStreaming()
		&& (l - Class589.aLong7795 * -1322422399891014571L
		    > Class292.aLong3230 * -7026509616776223987L)) {
		Class589.aLong7795 = l * -7476698233485713155L;
		if (class182.method3324())
		    Class589.aBool7799 = true;
	    }
	    if (Class285.aTwitchTV3143.IsStreaming()) {
		if (l - Class589.aLong7796 * 9124786155275275783L
		    < (long) (-1566646745 * Class589.anInt7808))
		    Class589.anInt7783 = 1713817950;
		else if (l - 8911274349804159757L * Class589.aLong7777
			 < (long) (-1566646745 * Class589.anInt7808))
		    Class589.anInt7783 = -1290574673;
		else
		    Class589.anInt7783 = 0;
	    } else
		Class589.anInt7783 = 0;
	    if ((l - Class589.aLong7806 * 1439562247878886855L
		 > (long) (Class589.anInt7782 * 21115241))
		&& Class285.aTwitchTV3143.GetWebcamState() == 5) {
		Class285.aTwitchTV3143.RestartWebcamDevice();
		Class589.aLong7806 = l * -1688966701639013385L;
	    }
	}
    }
    
    static final void method1227(Class683 class683, int i) {
	int i_13_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_13_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_13_ >> 16];
	Class639.method10556(class259, class245, class683, (byte) 7);
    }
}
