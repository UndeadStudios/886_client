/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class241
{
    public static Class241 method4431(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(10746638);
	if (0 == i)
	    return null;
	i--;
	class525_sub38.index += 339428471;
	int i_0_ = class525_sub38.readInt(2052448512);
	Object[] objects = new Object[i];
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    int i_2_ = class525_sub38.readUnsignedByte(105519783);
	    if (0 == i_2_)
		objects[i_1_]
		    = Class480.method7810
			  (java.lang.Integer.class, -1142553160)
			  .method65(class525_sub38, -2012553796);
	    else if (1 == i_2_)
		objects[i_1_]
		    = Class480.method7810
			  (java.lang.String.class, -2085892082)
			  .method65(class525_sub38, -2012553796);
	    else
		throw new IllegalStateException
			  (new StringBuilder().append
			       ("Unrecognised type ID in deserialise: ").append
			       (i_2_).toString());
	}
	return new Class241(i_0_, objects);
    }
    
    public static Class241 method4432(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1412667281);
	if (0 == i)
	    return null;
	i--;
	class525_sub38.index += 339428471;
	int i_3_ = class525_sub38.readInt(1942991215);
	Object[] objects = new Object[i];
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    int i_5_ = class525_sub38.readUnsignedByte(1058986930);
	    if (0 == i_5_)
		objects[i_4_]
		    = Class480.method7810
			  (java.lang.Integer.class, -2049806320)
			  .method65(class525_sub38, -2012553796);
	    else if (1 == i_5_)
		objects[i_4_]
		    = Class480.method7810
			  (java.lang.String.class, -511170794)
			  .method65(class525_sub38, -2012553796);
	    else
		throw new IllegalStateException
			  (new StringBuilder().append
			       ("Unrecognised type ID in deserialise: ").append
			       (i_5_).toString());
	}
	return new Class241(i_3_, objects);
    }
    
    public static Class241 method4433(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(680390549);
	if (0 == i)
	    return null;
	i--;
	class525_sub38.index += 339428471;
	int i_6_ = class525_sub38.readInt(1758321461);
	Object[] objects = new Object[i];
	for (int i_7_ = 0; i_7_ < i; i_7_++) {
	    int i_8_ = class525_sub38.readUnsignedByte(2080944798);
	    if (0 == i_8_)
		objects[i_7_]
		    = Class480.method7810
			  (java.lang.Integer.class, -2005201415)
			  .method65(class525_sub38, -2012553796);
	    else if (1 == i_8_)
		objects[i_7_]
		    = Class480.method7810
			  (java.lang.String.class, -685260752)
			  .method65(class525_sub38, -2012553796);
	    else
		throw new IllegalStateException
			  (new StringBuilder().append
			       ("Unrecognised type ID in deserialise: ").append
			       (i_8_).toString());
	}
	return new Class241(i_6_, objects);
    }
    
    Class241(int i, Object[] objects) {
	/* empty */
    }
    
    static void method4434(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_9_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_10_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	TwitchWebcamDevice twitchwebcamdevice
	    = Class541.method8901(i_9_, 1098593497);
	TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
	if (null != twitchwebcamdevice)
	    twitchwebcamdevicecapability
		= twitchwebcamdevice.method1752(i_10_);
	if (twitchwebcamdevicecapability == null) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -530318113 * twitchwebcamdevicecapability.anInt1159;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1797575109 * twitchwebcamdevicecapability.anInt1160;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= twitchwebcamdevicecapability.anInt1161 * -1777334653;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= twitchwebcamdevicecapability.anInt1162 * -169581313;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1668677381 * twitchwebcamdevicecapability.anInt1163;
	}
    }
    
    public static void method4435(Class525_Sub32 class525_sub32, int i) {
	Class262.method4777(class525_sub32, 500000, 1144342070);
    }
    
    static final void method4436(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int i_11_ = 0;
	if (Class493.method7997(string, -571385798))
	    i_11_ = Class275.method5102(string, -226672433);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4291,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16605(i_11_,
							      -322642917);
	client.aClass96_11085.method1794(class525_sub15, (short) 20370);
    }
    
    static final void method4437(Class683 class683, int i) {
	Class410.method6666((String) (class683.anObjectArray8636
				      [((class683.anInt8644 -= 1285561025)
					* 1373599041)]),
			    false, false, (byte) 49);
    }
    
    static int method4438(int i) {
	int i_12_ = Class328.aClass303_3583.anInt3399 * -631431271;
	if (i_12_ < Class328.aClass303Array3578.length - 1)
	    Class328.aClass303_3583 = Class328.aClass303Array3578[1 + i_12_];
	return 100;
    }
    
    public static final void method4439(boolean bool, byte i) {
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4336,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	client.aClass96_11085.method1794(class525_sub15, (short) 13620);
	for (Class525_Sub33 class525_sub33
		 = (Class525_Sub33) client.aClass10_11261.method689(655540679);
	     null != class525_sub33;
	     class525_sub33 = ((Class525_Sub33)
			       client.aClass10_11261.method690((byte) -74))) {
	    if (!class525_sub33.method8756(602870408)) {
		class525_sub33 = ((Class525_Sub33)
				  client.aClass10_11261.method689(1832641448));
		if (class525_sub33 == null)
		    break;
	    }
	    if (0 == class525_sub33.anInt10746 * -271654987)
		Class708.method14341(class525_sub33, true, bool, 25473208);
	}
	if (null != client.aClass259_11263) {
	    Class649.method10708(client.aClass259_11263, (byte) 0);
	    client.aClass259_11263 = null;
	}
    }
    
    static final void method4440(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.aByte3784;
    }
}
