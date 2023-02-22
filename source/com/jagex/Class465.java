/* Class465 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Class465
{
    byte[] aByteArray5120;
    Class470 this$0;
    
    byte[] method7661() {
	return aByteArray5120;
    }
    
    byte[] method7662() {
	return aByteArray5120;
    }
    
    Class465(Class470 class470, InputStream inputstream,
	     Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3, URL url) {
	this$0 = class470;
	aByteArray5120 = null;
	if (null != inputstream) {
	    int i = 10240;
	    RSBuffer class525_sub38 = new RSBuffer(i, true);
	    int i_0_ = 0;
	    byte[] is = Class707.method14310(1024, -1414335122);
	    while (i_0_ >= 0) {
		try {
		    i_0_ = inputstream.read(is);
		} catch (IOException ioexception) {
		    ioexception.printStackTrace();
		    i_0_ = -1;
		}
		if (i_0_ > 0) {
		    if (class525_sub38.index * -1133521593 + i_0_
			>= class525_sub38.buffer.length) {
			int i_1_
			    = 10240 + class525_sub38.buffer.length;
			byte[] is_2_
			    = Class707.method14309(i_1_, true, 710905251);
			System.arraycopy(class525_sub38.buffer, 0,
					 is_2_, 0,
					 (-1133521593
					  * class525_sub38.index));
			Class707.method14308(class525_sub38.buffer,
					     (byte) 51);
			class525_sub38.buffer = is_2_;
		    }
		    class525_sub38.method16614(is, 0, i_0_, 961518704);
		}
	    }
	    for (int i_3_ = 0;
		 i_3_ < -1151916065 * class525_sub16_sub12_sub3.anInt12206;
		 i_3_++)
		class525_sub38.method16735(0, -674340670);
	    byte[] is_4_ = new byte[class525_sub38.index * -1133521593];
	    System.arraycopy(class525_sub38.buffer, 0, is_4_, 0,
			     class525_sub38.index * -1133521593);
	    class525_sub38.method16627(-1092070630);
	    Object object = null;
	    Class707.method14308(is, (byte) 93);
	    Object object_5_ = null;
	    aByteArray5120 = is_4_;
	    try {
		inputstream.close();
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	}
	class525_sub16_sub12_sub3.aBool11832 = false;
	class470.method7719(1554476756);
    }
    
    byte[] method7663(int i) {
	return aByteArray5120;
    }
    
    byte[] method7664() {
	return aByteArray5120;
    }
    
    static final void method7665(Class683 class683, byte i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_6_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_6_ >> 16];
	Class601.method9901(class259, class245, class683,
			    Class238.aClass238_2402, (byte) 9);
    }
    
    static final void method7666(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.anInt2699
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -1601238961;
    }
    
    static final void method7667(Class683 class683, int i) {
	if ((Class453_Sub3.aClass309_Sub1_10316.method5485(-2050393129)
	     != Class289.aClass289_3202)
	    || (Class453_Sub3.aClass309_Sub1_10316.method5484(-2104310870)
		!= Class298.aClass298_3278))
	    throw new RuntimeException();
	Class446 class446
	    = ((Class350_Sub1)
	       Class453_Sub3.aClass309_Sub1_10316.method5481(-1821917369))
		  .method15838(816038128);
	Class446 class446_7_
	    = ((Class704_Sub3)
	       Class453_Sub3.aClass309_Sub1_10316.method5482(295971191))
		  .method17405(1514999152);
	Class446 class446_8_ = Class446.method7209(class446);
	class446_8_.method7300(class446_7_);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) class446_8_.method7230();
    }
    
    static final void method7668(Class683 class683, int i) {
	class683.anInt8662 -= 725972134;
	Class525_Sub28 class525_sub28
	    = ((Class525_Sub28)
	       (class683.anObjectArray8636
		[(class683.anInt8644 -= 1285561025) * 1373599041]));
	if (Class453_Sub3.aClass309_Sub1_10316.method5484(-2102587239)
	    != Class298.aClass298_3275)
	    throw new RuntimeException();
	((Class704_Sub5)
	 Class453_Sub3.aClass309_Sub1_10316.method5482(-634105186))
	    .method17466
	    (class525_sub28.method16381(1866194662),
	     class683.anIntArray8661[class683.anInt8662 * 501271953],
	     class683.anIntArray8661[class683.anInt8662 * 501271953 + 1],
	     class683.anIntArray8661[501271953 * class683.anInt8662 + 2],
	     class683.anIntArray8661[3 + 501271953 * class683.anInt8662],
	     class683.anIntArray8661[4 + class683.anInt8662 * 501271953],
	     class683.anIntArray8661[class683.anInt8662 * 501271953 + 5],
	     603074704);
    }
    
    static void method7669(Class259 class259, int i, int i_9_, boolean bool,
			   byte i_10_) {
	int i_11_ = -1694810043 * class259.anInt2602;
	int i_12_ = class259.anInt2598 * 2054207119;
	if (0 == class259.aByte2666)
	    class259.anInt2602 = class259.anInt2731 * -1835060137;
	else if (class259.aByte2666 == 1)
	    class259.anInt2602
		= 1075958413 * (i - -112469133 * class259.anInt2731);
	else if (class259.aByte2666 == 2)
	    class259.anInt2602
		= (i * (class259.anInt2731 * -112469133) >> 14) * 1075958413;
	if (0 == class259.aByte2719)
	    class259.anInt2598 = class259.anInt2599 * -1132355531;
	else if (1 == class259.aByte2719)
	    class259.anInt2598
		= 452831343 * (i_9_ - class259.anInt2599 * -847369317);
	else if (class259.aByte2719 == 2)
	    class259.anInt2598
		= (-847369317 * class259.anInt2599 * i_9_ >> 14) * 452831343;
	if (4 == class259.aByte2666)
	    class259.anInt2602
		= 1075958413 * (class259.anInt2604 * 1757319403
				* (class259.anInt2598 * 2054207119)
				/ (class259.anInt2705 * -720066775));
	if (4 == class259.aByte2719)
	    class259.anInt2598
		= 452831343 * (-1694810043 * class259.anInt2602
			       * (class259.anInt2705 * -720066775)
			       / (class259.anInt2604 * 1757319403));
	if (client.aBool11363
	    && (client.method17531(class259).anInt10486 * 1228765885 != 0
		|| 0 == class259.anInt2590 * 2010235789)) {
	    if (class259.anInt2598 * 2054207119 < 5
		&& class259.anInt2602 * -1694810043 < 5) {
		class259.anInt2598 = -2030810581;
		class259.anInt2602 = 1084824769;
	    } else {
		if (class259.anInt2598 * 2054207119 <= 0)
		    class259.anInt2598 = -2030810581;
		if (-1694810043 * class259.anInt2602 <= 0)
		    class259.anInt2602 = 1084824769;
	    }
	}
	if (-1148162767 * Class259.anInt2566
	    == -210830273 * class259.anInt2591)
	    client.aClass259_11268 = class259;
	if (bool && class259.anObjectArray2609 != null
	    && (i_11_ != -1694810043 * class259.anInt2602
		|| i_12_ != class259.anInt2598 * 2054207119)) {
	    Class525_Sub32 class525_sub32 = new Class525_Sub32();
	    class525_sub32.aClass259_10736 = class259;
	    class525_sub32.anObjectArray10740 = class259.anObjectArray2609;
	    client.aClass709_11079.method14345(class525_sub32, (byte) 0);
	}
    }
    
    static Class420[] method7670(int i) {
	return (new Class420[]
		{ Class420.aClass420_4682, Class420.aClass420_4684,
		  Class420.aClass420_4679, Class420.aClass420_4683,
		  Class420.aClass420_4688, Class420.aClass420_4686,
		  Class420.aClass420_4677, Class420.aClass420_4690,
		  Class420.aClass420_4685, Class420.aClass420_4687,
		  Class420.aClass420_4681, Class420.aClass420_4680 });
    }
    
    static Class525_Sub16_Sub10 method7671(int i, long l) {
	Class525_Sub16_Sub10.aBool11825 = false;
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = (Class525_Sub16_Sub10) Class525_Sub16_Sub10.aClass10_11795
					 .method684((long) i << 56 | l);
	if (null == class525_sub16_sub10) {
	    class525_sub16_sub10 = new Class525_Sub16_Sub10(i, l);
	    Class525_Sub16_Sub10.aClass10_11795.method695
		(class525_sub16_sub10,
		 -5126207504388691097L * class525_sub16_sub10.aLong7113);
	    Class525_Sub16_Sub10.aBool11825 = true;
	}
	return class525_sub16_sub10;
    }
}
