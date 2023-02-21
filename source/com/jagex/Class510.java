/* Class510 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class510
{
    public static final int anInt5663 = 49;
    public static final int anInt5664 = -3;
    public static final int anInt5665 = -4;
    public static final int anInt5666 = 42;
    public static final int anInt5667 = 1;
    public static final int anInt5668 = 2;
    public static final int anInt5669 = 3;
    public static final int anInt5670 = 6;
    public static final int anInt5671 = 7;
    public static final int anInt5672 = 9;
    public static final int anInt5673 = 15;
    public static final int anInt5674 = -2;
    public static final int anInt5675 = 48;
    public static final int anInt5676 = 29;
    public static final int anInt5677 = 35;
    public static final int anInt5678 = 23;
    public static final int anInt5679 = 45;
    public static final int anInt5680 = 52;
    public static final int anInt5681 = -5;
    public static final int anInt5682 = 21;
    public static final int anInt5683 = 53;
    
    Class510() throws Throwable {
	throw new Error();
    }
    
    static final void method8503(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687
		  .method17196(920326349) ? 1 : 0;
    }
    
    public static Class702 method8504(int i, int i_0_) {
	Class702[] class702s = Class632.method10325(-1074649744);
	for (int i_1_ = 0; i_1_ < class702s.length; i_1_++) {
	    Class702 class702 = class702s[i_1_];
	    if (108507919 * class702.anInt8786 == i)
		return class702;
	}
	return null;
    }
    
    public static byte[] method8505(byte[] is, int i, int i_2_, byte i_3_) {
	byte[] is_4_;
	if (i > 0) {
	    is_4_ = new byte[i_2_];
	    for (int i_5_ = 0; i_5_ < i_2_; i_5_++)
		is_4_[i_5_] = is[i_5_ + i];
	} else
	    is_4_ = is;
	Class12 class12 = new Class12();
	class12.method723(208013169);
	class12.method719(is_4_, (long) (i_2_ * 8));
	byte[] is_6_ = new byte[64];
	class12.method720(is_6_, 0, (byte) 0);
	return is_6_;
    }
    
    static final void method8506(Class683 class683, int i) {
	class683.anInt8644 -= -438284221;
	String string
	    = ((String)
	       class683.anObjectArray8636[1373599041 * class683.anInt8644]);
	String string_7_ = (String) (class683.anObjectArray8636
				     [class683.anInt8644 * 1373599041 + 1]);
	String string_8_ = (String) (class683.anObjectArray8636
				     [2 + class683.anInt8644 * 1373599041]);
	boolean bool = ((class683.anIntArray8661
			 [(class683.anInt8662 -= 1552651121) * 501271953])
			== 1);
	Class350.method6154(string, string_7_, string_8_, bool, (byte) 0);
    }
}
