/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

class Class226 implements Interface57
{
    static int anInt2342;
    Class217 this$0;
    
    public void method360(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 100);
	float f_0_ = class488.method7924(-1303980491);
	Class446 class446_1_
	    = Class446.method7225(class446, this$0.method4030(-1493431548));
	float f_2_ = 0.0F;
	float f_3_ = class446_1_.method7230();
	if (f_3_ >= f_0_)
	    f_2_ = 0.0F;
	if (f_3_ <= f)
	    f_2_ = 1.0F;
	else {
	    float f_4_ = 1.0F - (f_3_ - f) * (1.0F / (f_0_ - f));
	    if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
		f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
	    f_2_ = f_4_;
	}
	fs[0] = f_2_;
	fs[1] = f_2_;
    }
    
    public void method357(Object object, float[] fs, Object[] objects, int i) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) -45);
	float f_5_ = class488.method7924(1818625977);
	Class446 class446_6_
	    = Class446.method7225(class446, this$0.method4030(1938335196));
	float f_7_ = 0.0F;
	float f_8_ = class446_6_.method7230();
	if (f_8_ >= f_5_)
	    f_7_ = 0.0F;
	if (f_8_ <= f)
	    f_7_ = 1.0F;
	else {
	    float f_9_ = 1.0F - (f_8_ - f) * (1.0F / (f_5_ - f));
	    if ((double) f_9_ < 0.0 || (double) f_9_ > 1.0)
		f_9_ = Math.min(Math.max(f_9_, 0.0F), 1.0F);
	    f_7_ = f_9_;
	}
	fs[0] = f_7_;
	fs[1] = f_7_;
    }
    
    public void method359(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 46);
	float f_10_ = class488.method7924(-1367774025);
	Class446 class446_11_
	    = Class446.method7225(class446, this$0.method4030(-974524869));
	float f_12_ = 0.0F;
	float f_13_ = class446_11_.method7230();
	if (f_13_ >= f_10_)
	    f_12_ = 0.0F;
	if (f_13_ <= f)
	    f_12_ = 1.0F;
	else {
	    float f_14_ = 1.0F - (f_13_ - f) * (1.0F / (f_10_ - f));
	    if ((double) f_14_ < 0.0 || (double) f_14_ > 1.0)
		f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
	    f_12_ = f_14_;
	}
	fs[0] = f_12_;
	fs[1] = f_12_;
    }
    
    Class226(Class217 class217) {
	this$0 = class217;
    }
    
    public void method358(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 24);
	float f_15_ = class488.method7924(2116765721);
	Class446 class446_16_
	    = Class446.method7225(class446, this$0.method4030(-372409916));
	float f_17_ = 0.0F;
	float f_18_ = class446_16_.method7230();
	if (f_18_ >= f_15_)
	    f_17_ = 0.0F;
	if (f_18_ <= f)
	    f_17_ = 1.0F;
	else {
	    float f_19_ = 1.0F - (f_18_ - f) * (1.0F / (f_15_ - f));
	    if ((double) f_19_ < 0.0 || (double) f_19_ > 1.0)
		f_19_ = Math.min(Math.max(f_19_, 0.0F), 1.0F);
	    f_17_ = f_19_;
	}
	fs[0] = f_17_;
	fs[1] = f_17_;
    }
    
    static void method4256(Class259 class259, Class152 class152, int i,
			   int i_20_, int i_21_, int i_22_, int i_23_,
			   String string, Class175 class175, Class7 class7,
			   int i_24_, int i_25_) {
	int i_26_;
	if (-174799205 * Class700.anInt8779 == 5)
	    i_26_ = ((int) ((double) Class453_Sub3.aClass309_Sub1_10316
					 .method5491((byte) 0)
			    * 2607.5945876176133)
		     + 223546583 * client.anInt11059) & 0x3fff;
	else if (-174799205 * Class700.anInt8779 == 2)
	    i_26_ = (int) client.aFloat11052 & 0x3fff;
	else
	    i_26_ = (223546583 * client.anInt11059 + (int) client.aFloat11052
		     & 0x3fff);
	int i_27_ = (Math.max(-1694810043 * class259.anInt2602 / 2,
			      2054207119 * class259.anInt2598 / 2)
		     + 10);
	int i_28_ = i_21_ * i_21_ + i_22_ * i_22_;
	if (i_28_ <= i_27_ * i_27_) {
	    int i_29_ = Class436.anIntArray4831[i_26_];
	    int i_30_ = Class436.anIntArray4838[i_26_];
	    if (2 != -174799205 * Class700.anInt8779) {
		i_29_ = 256 * i_29_ / (-198324601 * client.anInt11169 + 256);
		i_30_ = i_30_ * 256 / (-198324601 * client.anInt11169 + 256);
	    }
	    int i_31_ = i_21_ * i_30_ + i_22_ * i_29_ >> 14;
	    int i_32_ = i_30_ * i_22_ - i_29_ * i_21_ >> 14;
	    int i_33_ = class7.method566(string, 100, null, 805534933);
	    int i_34_ = class7.method594(string, 100, 0, null, -2139516275);
	    i_31_ -= i_33_ / 2;
	    if (i_31_ >= -(class259.anInt2602 * -1694810043)
		&& i_31_ <= class259.anInt2602 * -1694810043
		&& i_32_ >= -(2054207119 * class259.anInt2598)
		&& i_32_ <= class259.anInt2598 * 2054207119)
		class175.method2839(string,
				    (i_31_ + i
				     + class259.anInt2602 * -1694810043 / 2),
				    (2054207119 * class259.anInt2598 / 2
				     + i_20_ - i_32_ - i_23_ - i_34_),
				    i_33_, 50, i_24_, 0, 1, 0, 0, null, null,
				    class152, i, i_20_, -1050370206);
	}
    }
    
    public static void method4257(Class182 class182, long l) {
	Class616.anInt8055 = -883801177 * Class616.anInt8042;
	Class616.anInt8042 = 0;
	Class251.method4508((byte) 8);
	Iterator iterator = Class616.aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    boolean bool = class633.method10371(class182, l);
	    if (!bool) {
		iterator.remove();
		Class329.aClass633Array3589[1593133783 * Class616.anInt8046]
		    = class633;
		Class616.anInt8046
		    = -1700050713 * (1593133783 * Class616.anInt8046 + 1
				     & (Class181.anIntArray1922
					[Class616.anInt8047 * 1206403205]));
	    }
	}
    }
    
    static final void method4258(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	int i_35_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (1891025759 * class259.anInt2737 != i_35_) {
	    if (-1 != i_35_) {
		if (null == class259.aClass689_2664)
		    class259.aClass689_2664 = new Class689_Sub3();
		class259.aClass689_2664.method14068(i_35_, (byte) -127);
	    } else
		class259.aClass689_2664 = null;
	    class259.anInt2737 = i_35_ * -919840609;
	    Class649.method10708(class259, (byte) 0);
	}
	if (class259.anInt2576 * 1534974651 == -1 && !class245.aBool2428)
	    Class708.method14342(class259.anInt2588 * 1984678839, -1353919616);
    }
    
    static final void method4259(Class683 class683, byte i) {
	int i_36_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (Class695.aBool8757) {
	    Class18[] class18s = Class63.method1389((byte) -91);
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class18s[i_36_].anInt200 * 1036776891;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class18s[i_36_].anInt201 * -2072667521;
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	}
    }
}
