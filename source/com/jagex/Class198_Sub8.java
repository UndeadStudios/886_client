/* Class198_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class198_Sub8 extends Class198
{
    int anInt9948;
    Class488 aClass488_9949;
    int anInt9950;
    int anInt9951;
    int anInt9952;
    static Class525_Sub16_Sub16 aClass525_Sub16_Sub16_9953;
    
    public void method3753(int i) {
	if (null != aClass488_9949)
	    aClass488_9949.method7928(-510381552);
    }
    
    void method3761() {
	if (null != aClass488_9949) {
	    aClass488_9949.method7916(50, (byte) -52);
	    Class40_Sub20.aClass217_11050.method4026(aClass488_9949,
						     -18720951);
	    aClass488_9949 = null;
	}
    }
    
    void method3755(short i) {
	if (null != aClass488_9949) {
	    aClass488_9949.method7916(50, (byte) -1);
	    Class40_Sub20.aClass217_11050.method4026(aClass488_9949, 67201726);
	    aClass488_9949 = null;
	}
    }
    
    public void method3754() {
	if (null != aClass488_9949)
	    aClass488_9949.method7928(-709753456);
    }
    
    public void method3757() {
	if (null != aClass488_9949)
	    aClass488_9949.method7928(-1736619584);
    }
    
    public void method3756() {
	if (null != aClass488_9949)
	    aClass488_9949.method7928(-1724610277);
    }
    
    Class198_Sub8(RSBuffer class525_sub38) {
	super(class525_sub38);
	anInt9952 = class525_sub38.readUnsignedShort((byte) 16) * -221038035;
	anInt9948 = class525_sub38.readUnsignedByte(997263884) * -1051804455;
	anInt9950 = class525_sub38.readUnsignedByte(1834861786) * 1221902307;
	anInt9951 = class525_sub38.readUnsignedByte(1647213623) * -401592673;
	aClass488_9949
	    = (Class40_Sub20.aClass217_11050.method4046
	       (Class204.aClass204_2233, this, anInt9952 * 1998529957,
		anInt9951 * 280718687, anInt9948 * -2018638999,
		Class208.aClass208_2250.method3907((short) -18976),
		Class195.aClass195_2177, 0.0F, 0.0F, null, 0,
		anInt9950 * 1797160395, false, 356879083));
	if (aClass488_9949 != null)
	    aClass488_9949.method7872((byte) 1);
    }
    
    void method3762() {
	if (null != aClass488_9949) {
	    aClass488_9949.method7916(50, (byte) -33);
	    Class40_Sub20.aClass217_11050.method4026(aClass488_9949,
						     1411647293);
	    aClass488_9949 = null;
	}
    }
    
    public static void method15643(boolean bool, int i) {
	Class556_Sub1.aBool10631 = bool;
    }
    
    static final void method15644(Class259 class259, byte[] is, byte[] is_0_,
				  Class683 class683, int i) {
	int i_1_ = ((class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953])
		    - 1);
	if (i_1_ < 0 || i_1_ > 9)
	    throw new RuntimeException();
	Class515.method8595(class259, i_1_, is, is_0_, class683, (short) 9026);
    }
}
