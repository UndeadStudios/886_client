/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class439
{
    Class439() throws Throwable {
	throw new Error();
    }
    
    public static void method7110(Class446 class446, Class446 class446_0_,
				  Class446 class446_1_, float f,
				  Class446[] class446s) {
	Class446 class446_2_ = Class446.method7225(class446, class446_1_);
	float f_3_ = Class446.method7234(class446_2_, class446_2_) - f * f;
	float f_4_ = Class446.method7234(class446_0_, class446_2_);
	float f_5_ = f_4_ * f_4_ - f_3_;
	if (f_5_ < 0.0F) {
	    Class446[] class446s_6_ = class446s;
	    class446s[1] = null;
	    class446s_6_[0] = null;
	} else if (f_5_ >= 9.765625E-4F) {
	    float f_7_ = (float) Math.sqrt((double) f_5_);
	    class446s[0] = Class446.method7207();
	    class446s[0].method7216(class446);
	    class446s[0].method7221
		(Class446.method7238(Class446.method7209(class446_0_),
				     -f_4_ - f_7_));
	    class446s[1] = Class446.method7207();
	    class446s[1].method7216(class446);
	    class446s[1].method7221
		(Class446.method7238(Class446.method7209(class446_0_),
				     -f_4_ + f_7_));
	} else {
	    class446s[0] = Class446.method7207();
	    class446s[0].method7216(class446);
	    class446s[0].method7221
		(Class446.method7238(Class446.method7209(class446_0_), -f_4_));
	    class446s[1] = null;
	}
    }
    
    public static void method7111(Class446 class446, Class446 class446_8_,
				  Class446 class446_9_, float f,
				  Class446[] class446s) {
	Class446 class446_10_ = Class446.method7225(class446, class446_9_);
	float f_11_ = Class446.method7234(class446_10_, class446_10_) - f * f;
	float f_12_ = Class446.method7234(class446_8_, class446_10_);
	float f_13_ = f_12_ * f_12_ - f_11_;
	if (f_13_ < 0.0F) {
	    Class446[] class446s_14_ = class446s;
	    class446s[1] = null;
	    class446s_14_[0] = null;
	} else if (f_13_ >= 9.765625E-4F) {
	    float f_15_ = (float) Math.sqrt((double) f_13_);
	    class446s[0] = Class446.method7207();
	    class446s[0].method7216(class446);
	    class446s[0].method7221
		(Class446.method7238(Class446.method7209(class446_8_),
				     -f_12_ - f_15_));
	    class446s[1] = Class446.method7207();
	    class446s[1].method7216(class446);
	    class446s[1].method7221
		(Class446.method7238(Class446.method7209(class446_8_),
				     -f_12_ + f_15_));
	} else {
	    class446s[0] = Class446.method7207();
	    class446s[0].method7216(class446);
	    class446s[0].method7221
		(Class446.method7238(Class446.method7209(class446_8_),
				     -f_12_));
	    class446s[1] = null;
	}
    }
}
