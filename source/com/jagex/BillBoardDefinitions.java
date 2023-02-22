/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class BillBoardDefinitions
{
    static BillBoardDefinitions aClass504_5601 = new BillBoardDefinitions();
    public static BillBoardDefinitions aClass504_5602 = new BillBoardDefinitions();
    public static BillBoardDefinitions aClass504_5603 = new BillBoardDefinitions();
    static BillBoardDefinitions aClass504_5604 = new BillBoardDefinitions();
    public static JS5 aClass458_5605;
    
    BillBoardDefinitions() {
	/* empty */
    }
    
    public static short method8313(int i, int i_0_) {
	int i_1_ = i >> 10 & 0x3f;
	int i_2_ = i >> 3 & 0x70;
	int i_3_ = i & 0x7f;
	i_2_ = i_3_ <= 64 ? i_2_ * i_3_ >> 7 : i_2_ * (127 - i_3_) >> 7;
	int i_4_ = i_2_ + i_3_;
	int i_5_;
	if (0 != i_4_)
	    i_5_ = (i_2_ << 8) / i_4_;
	else
	    i_5_ = i_2_ << 1;
	int i_6_ = i_4_;
	return (short) (i_1_ << 10 | i_5_ >> 4 << 7 | i_6_);
    }
    
    static final void method8314(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class441.method7120((byte) -55);
    }
    
    static Class method8315(String string, int i)
	throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    static final void method8316(Class683 class683, short i) {
	class683.anInt8662 -= -1189665054;
	int i_7_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_8_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	if (i_7_ == 0)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	else if (i_8_ == 0)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 2147483647;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (int) Math.pow((double) i_7_, 1.0 / (double) i_8_);
    }
    
    static final void method8317(Class683 class683, int i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class525_Sub16_Sub19 class525_sub16_sub19
	    = Class562.aClass471_7557.method7736(i_9_, 56175653);
	if (class525_sub16_sub19.anIntArray11915 == null)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class525_sub16_sub19.anIntArray11915.length;
    }
}
