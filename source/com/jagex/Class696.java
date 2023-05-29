/* Class696 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.lang.management.GarbageCollectorMXBean;

public abstract class Class696
{
    protected Class525_Sub30 aClass525_Sub30_8759;
    protected int anInt8760;
    public static final int anInt8761 = 3;
    protected static final int anInt8762 = 2;
    protected static final int anInt8763 = 1;
    static GarbageCollectorMXBean aGarbageCollectorMXBean8764;
    
    abstract int method14167(int i, byte i_0_);
    
    Class696(Class525_Sub30 class525_sub30) {
	aClass525_Sub30_8759 = class525_sub30;
	anInt8760 = method14168(-719857151) * 1908664649;
    }
    
    abstract int method14168(int i);
    
    abstract void method14169(int i, int i_1_);
    
    void method14170(int i, int i_2_) {
	if (method14167(i, (byte) -118) != 3)
	    method14169(i, -1396688892);
    }
    
    Class696(int i, Class525_Sub30 class525_sub30) {
	anInt8760 = i * 1908664649;
	aClass525_Sub30_8759 = class525_sub30;
    }
    
    void method14171(int i) {
	if (method14167(i, (byte) 14) != 3)
	    method14169(i, -1138302741);
    }
    
    abstract int method14172(int i);
    
    abstract void method14173(int i);
    
    abstract void method14174(int i);
    
    abstract int method14175();
    
    void method14176(int i) {
	if (method14167(i, (byte) 65) != 3)
	    method14169(i, -1970620333);
    }
    
    void method14177(int i) {
	if (method14167(i, (byte) -68) != 3)
	    method14169(i, -534522443);
    }
    
    void method14178(int i) {
	if (method14167(i, (byte) -55) != 3)
	    method14169(i, -1750110614);
    }
    
    static void method14179(Class525_Sub15 class525_sub15, int i, int i_3_,
			    int i_4_, int i_5_) {
	class525_sub15.aClass525_Sub38_Sub2_10546.method16666(i_3_,
							      1779385927);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16665(i_4_,
							      (short) 1274);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16605(i, -2060386521);
    }
    
    static final void method14180(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	client.aShort11350
	    = (short) class683.anIntArray8661[class683.anInt8662 * 501271953];
	if (client.aShort11350 <= 0)
	    client.aShort11350 = (short) 256;
	client.aShort11351 = (short) (class683.anIntArray8661
				      [1 + class683.anInt8662 * 501271953]);
	if (client.aShort11351 <= 0)
	    client.aShort11351 = (short) 320;
    }
    
    public static Class85 method14181(int i, int i_6_) {
	Class85 class85
	    = (Class85) client.aClass200_11206.method3785((long) i);
	if (null == class85) {
	    class85
		= new Class85(Class555.idx_49,
			      Class525_Sub7_Sub3.method18214(i, -1443336058),
			      Class203.method3858(i, 1240045102));
	    client.aClass200_11206.method3788(class85, (long) i);
	}
	return class85;
    }
}
