/* Class198_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class198_Sub3 extends Class198
{
    int anInt9906;
    int anInt9907;
    int anInt9908;
    int anInt9909;
    int anInt9910;
    public static int anInt9911;
    static int anInt9912;
    
    public void method3754() {
	Class201.aClass193Array2203[anInt9906 * 61649953].method3708
	    (anInt9909 * 2070984203, 1582526925 * anInt9907,
	     anInt9908 * 158677621, -138229457 * anInt9910, (byte) 17);
    }
    
    public void method3753(int i) {
	Class201.aClass193Array2203[anInt9906 * 61649953].method3708
	    (anInt9909 * 2070984203, 1582526925 * anInt9907,
	     anInt9908 * 158677621, -138229457 * anInt9910, (byte) 37);
    }
    
    public void method3757() {
	Class201.aClass193Array2203[anInt9906 * 61649953].method3708
	    (anInt9909 * 2070984203, 1582526925 * anInt9907,
	     anInt9908 * 158677621, -138229457 * anInt9910, (byte) 13);
    }
    
    Class198_Sub3(RSBuffer class525_sub38) {
	super(class525_sub38);
	anInt9906 = class525_sub38.readUnsignedShort((byte) 30) * 1571803105;
	int i = class525_sub38.readInt(1357331199);
	anInt9907 = (i >>> 16) * 1984881413;
	anInt9908 = -1451276835 * (i & 0xffff);
	anInt9909 = class525_sub38.readUnsignedByte(184140059) * 1494590883;
	anInt9910 = class525_sub38.readUnsignedByte(1203065867) * -77914673;
    }
    
    public void method3756() {
	Class201.aClass193Array2203[anInt9906 * 61649953].method3708
	    (anInt9909 * 2070984203, 1582526925 * anInt9907,
	     anInt9908 * 158677621, -138229457 * anInt9910, (byte) 68);
    }
    
    public static int method15609(Class685 class685, Class675 class675, int i,
				  int i_0_) {
	if (Class685.aClass685_8686 == class685)
	    return 43594;
	return i + 40000;
    }
    
    static final void method15610(Class683 class683, byte i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_1_, -695254952);
	Class625.method10256(class259, class683, 61967192);
    }
    
    public static final void method15611(int i) {
	Class286.anImage3146 = null;
	Class642.aFont8329 = null;
    }
    
    static final void method15612(Class683 class683, int i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class525_Sub33 class525_sub33
	    = (Class525_Sub33) client.aClass10_11261.method684((long) i_2_);
	if (class525_sub33 != null)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
}
