/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.Map;

public class Class58
{
    Class458 aClass458_627;
    Interface72 anInterface72_628;
    public int anInt629 = 0;
    public int anInt630 = 0;
    Class200 aClass200_631 = new Class200(64);
    static final int anInt632 = 1;
    static final int anInt633 = 32768;
    Class458 aClass458_634;
    public static int anInt635;
    public static String aString636;
    
    public Class58(Class666 class666, Class458 class458, Class458 class458_0_,
		   Interface72 interface72) {
	anInterface72_628 = null;
	aClass458_634 = class458;
	aClass458_627 = class458_0_;
	anInterface72_628 = interface72;
	if (aClass458_634 != null)
	    anInt629 = aClass458_634.method7487(1, 2106214191) * 2055524631;
	if (null != aClass458_627)
	    anInt630 = aClass458_627.method7487(1, 2084404157) * -985560621;
    }
    
    public Class525_Sub16_Sub11 method1216(int i) {
	Class525_Sub16_Sub11 class525_sub16_sub11
	    = (Class525_Sub16_Sub11) aClass200_631.method3785((long) i);
	if (null != class525_sub16_sub11)
	    return class525_sub16_sub11;
	byte[] is;
	if (i >= 32768)
	    is = aClass458_627.method7476(1, i & 0x7fff, 143722051);
	else
	    is = aClass458_634.method7476(1, i, 376860191);
	class525_sub16_sub11 = new Class525_Sub16_Sub11();
	class525_sub16_sub11.aClass58_11829 = this;
	if (null != is)
	    class525_sub16_sub11.method18420(new RSBuffer(is), -8682098);
	if (i >= 32768)
	    class525_sub16_sub11.method18428(-853060952);
	aClass200_631.method3788(class525_sub16_sub11, (long) i);
	return class525_sub16_sub11;
    }
    
    String method1217(Class650 class650, int[] is, long l) {
	if (null != anInterface72_628) {
	    String string = anInterface72_628.method493(class650, is, l);
	    if (string != null)
		return string;
	}
	return Long.toString(l);
    }
    
    public Class525_Sub16_Sub11 method1218(int i) {
	Class525_Sub16_Sub11 class525_sub16_sub11
	    = (Class525_Sub16_Sub11) aClass200_631.method3785((long) i);
	if (null != class525_sub16_sub11)
	    return class525_sub16_sub11;
	byte[] is;
	if (i >= 32768)
	    is = aClass458_627.method7476(1, i & 0x7fff, 971946796);
	else
	    is = aClass458_634.method7476(1, i, 94049405);
	class525_sub16_sub11 = new Class525_Sub16_Sub11();
	class525_sub16_sub11.aClass58_11829 = this;
	if (null != is)
	    class525_sub16_sub11.method18420(new RSBuffer(is),
					     1777529075);
	if (i >= 32768)
	    class525_sub16_sub11.method18428(1141058506);
	aClass200_631.method3788(class525_sub16_sub11, (long) i);
	return class525_sub16_sub11;
    }
    
    String method1219(Class650 class650, int[] is, long l) {
	if (null != anInterface72_628) {
	    String string = anInterface72_628.method493(class650, is, l);
	    if (string != null)
		return string;
	}
	return Long.toString(l);
    }
    
    public Class525_Sub16_Sub11 method1220(int i, int i_1_) {
	Class525_Sub16_Sub11 class525_sub16_sub11
	    = (Class525_Sub16_Sub11) aClass200_631.method3785((long) i);
	if (null != class525_sub16_sub11)
	    return class525_sub16_sub11;
	byte[] is;
	if (i >= 32768)
	    is = aClass458_627.method7476(1, i & 0x7fff, 1895982628);
	else
	    is = aClass458_634.method7476(1, i, 1798618641);
	class525_sub16_sub11 = new Class525_Sub16_Sub11();
	class525_sub16_sub11.aClass58_11829 = this;
	if (null != is)
	    class525_sub16_sub11.method18420(new RSBuffer(is),
					     573649052);
	if (i >= 32768)
	    class525_sub16_sub11.method18428(-688634967);
	aClass200_631.method3788(class525_sub16_sub11, (long) i);
	return class525_sub16_sub11;
    }
    
    static void method1221(int i) {
	if (Class144_Sub1.anInt9141 * 1318111247 < 0) {
	    Class144_Sub1.anInt9141 = 0;
	    Class556_Sub1.anInt10626 = -106402817;
	    Class556_Sub1.anInt10627 = 107721765;
	}
	if (1318111247 * Class144_Sub1.anInt9141 > Class556_Sub1.anInt7502) {
	    Class144_Sub1.anInt9141 = -1716705553 * Class556_Sub1.anInt7502;
	    Class556_Sub1.anInt10626 = -106402817;
	    Class556_Sub1.anInt10627 = 107721765;
	}
	if (1586604897 * Class696_Sub13.anInt10912 < 0) {
	    Class696_Sub13.anInt10912 = 0;
	    Class556_Sub1.anInt10626 = -106402817;
	    Class556_Sub1.anInt10627 = 107721765;
	}
	if (Class696_Sub13.anInt10912 * 1586604897 > Class556_Sub1.anInt7521) {
	    Class696_Sub13.anInt10912 = Class556_Sub1.anInt7521 * -2002372447;
	    Class556_Sub1.anInt10626 = -106402817;
	    Class556_Sub1.anInt10627 = 107721765;
	}
    }
    
    static final void method1222(int i, int i_2_, short i_3_) {
	if (Class556_Sub1.aFloat7479 < Class556_Sub1.aFloat7526) {
	    Class556_Sub1.aFloat7479
		+= (double) Class556_Sub1.aFloat7479 / 30.0;
	    if (Class556_Sub1.aFloat7479 > Class556_Sub1.aFloat7526)
		Class556_Sub1.aFloat7479 = Class556_Sub1.aFloat7526;
	    method1221(-414348768);
	    Class556_Sub1.anInt7476 = (int) Class556_Sub1.aFloat7526 >> 1;
	    Class556_Sub1.aByteArrayArrayArray7461
		= Class239.method4421(Class556_Sub1.anInt7476, 1525932402);
	} else if (Class556_Sub1.aFloat7479 > Class556_Sub1.aFloat7526) {
	    Class556_Sub1.aFloat7479
		-= (double) Class556_Sub1.aFloat7479 / 30.0;
	    if (Class556_Sub1.aFloat7479 < Class556_Sub1.aFloat7526)
		Class556_Sub1.aFloat7479 = Class556_Sub1.aFloat7526;
	    method1221(-1365125900);
	    Class556_Sub1.anInt7476 = (int) Class556_Sub1.aFloat7526 >> 1;
	    Class556_Sub1.aByteArrayArrayArray7461
		= Class239.method4421(Class556_Sub1.anInt7476, 1284934439);
	}
	if (-1 != -1489474559 * Class556_Sub1.anInt10626
	    && -1 != Class556_Sub1.anInt10627 * 1259518035) {
	    int i_4_ = (Class556_Sub1.anInt10626 * -1489474559
			- 1318111247 * Class144_Sub1.anInt9141);
	    if (i_4_ != 0)
		i_4_ /= Math.min(Class556_Sub1.anInt10622 * 793654295,
				 Math.abs(i_4_));
	    int i_5_ = (Class556_Sub1.anInt10627 * 1259518035
			- Class696_Sub13.anInt10912 * 1586604897);
	    if (i_5_ != 0)
		i_5_ /= Math.min(Class556_Sub1.anInt10622 * 793654295,
				 Math.abs(i_5_));
	    Class144_Sub1.anInt9141
		= -1716705553 * (1318111247 * Class144_Sub1.anInt9141 + i_4_);
	    Class696_Sub13.anInt10912
		= -2002372447 * (i_5_
				 + 1586604897 * Class696_Sub13.anInt10912);
	    if (0 == i_4_ && 0 == i_5_) {
		Class556_Sub1.anInt10626 = -106402817;
		Class556_Sub1.anInt10627 = 107721765;
	    }
	    method1221(-1493428176);
	}
	Iterator iterator = Class556_Sub1.aHashMap10646.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class34 class34
		= (Class34) ((Map.Entry) iterator.next()).getValue();
	    class34.anInt309 -= -1865076057;
	    if (class34.anInt309 * -392080105 == 0) {
		if (405163313 * class34.anInt308 <= 1
		    && !Class556_Sub1.aBool10631)
		    iterator.remove();
		else {
		    class34.anInt308 -= -1173361711;
		    class34.anInt309 = Class556_Sub1.anInt10648 * -77547357;
		}
	    }
	}
	iterator = Class556_Sub1.aHashMap10641.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class34 class34
		= (Class34) ((Map.Entry) iterator.next()).getValue();
	    class34.anInt309 -= -1865076057;
	    if (0 == -392080105 * class34.anInt309) {
		if (class34.anInt308 * 405163313 <= 1
		    && !Class556_Sub1.aBool10631)
		    iterator.remove();
		else {
		    class34.anInt308 -= -1173361711;
		    class34.anInt309 = -77547357 * Class556_Sub1.anInt10648;
		}
	    }
	}
	if (Class556_Sub1.aBool10628 && null != Class447.aClass709_4900) {
	    for (Class525_Sub9 class525_sub9
		     = ((Class525_Sub9)
			Class447.aClass709_4900.method14372((short) -9595));
		 class525_sub9 != null;
		 class525_sub9
		     = ((Class525_Sub9)
			Class447.aClass709_4900.method14353(-1742521120))) {
		Class287 class287
		    = ((Class287)
		       (Class556_Sub1.aClass40_Sub2_7464.method76
			((-480723851
			  * class525_sub9.aClass525_Sub37_10504.anInt10825),
			 -979705342)));
		if (class525_sub9.method16153(i, i_2_, (short) 16860)) {
		    if (null != class287.aStringArray3163) {
			if (null != class287.aStringArray3163[4])
			    Class564.method9454
				(class287.aStringArray3163[4],
				 class287.aString3191, -1, 1012, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 433521613 * class287.anInt3192, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 32);
			if (class287.aStringArray3163[3] != null)
			    Class564.method9454
				(class287.aStringArray3163[3],
				 class287.aString3191, -1, 1011, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 23);
			if (null != class287.aStringArray3163[2])
			    Class564.method9454
				(class287.aStringArray3163[2],
				 class287.aString3191, -1, 1010, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 false, (byte) 27);
			if (class287.aStringArray3163[1] != null)
			    Class564.method9454
				(class287.aStringArray3163[1],
				 class287.aString3191, -1, 1009, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 false, (byte) 32);
			if (null != class287.aStringArray3163[0])
			    Class564.method9454
				(class287.aStringArray3163[0],
				 class287.aString3191, -1, 1008, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 433521613 * class287.anInt3192, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 30);
		    }
		    if (!class525_sub9.aClass525_Sub37_10504.aBool10829) {
			class525_sub9.aClass525_Sub37_10504.aBool10829 = true;
			Class396.method6536(Class578.aClass578_7655,
					    (class525_sub9
					     .aClass525_Sub37_10504
					     .anInt10825) * -480723851,
					    433521613 * class287.anInt3192,
					    867543016);
		    }
		    if (class525_sub9.aClass525_Sub37_10504.aBool10829)
			Class396.method6536(Class578.aClass578_7657,
					    (-480723851
					     * (class525_sub9
						.aClass525_Sub37_10504
						.anInt10825)),
					    433521613 * class287.anInt3192,
					    1382752631);
		} else if (class525_sub9.aClass525_Sub37_10504.aBool10829) {
		    class525_sub9.aClass525_Sub37_10504.aBool10829 = false;
		    Class396.method6536(Class578.aClass578_7656,
					-480723851 * (class525_sub9
						      .aClass525_Sub37_10504
						      .anInt10825),
					433521613 * class287.anInt3192,
					-691485132);
		}
	    }
	}
    }
    
    static final void method1223(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_6_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_7_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_6_ < i_7_ ? i_6_ : i_7_;
    }
}
