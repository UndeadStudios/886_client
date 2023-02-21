/* Class619 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class619
{
    static RSBuffer aClass525_Sub38_8084;
    
    Class619() throws Throwable {
	throw new Error();
    }
    
    public static int method10166(int i, int i_0_, int i_1_) {
	int i_2_ = i_0_ >>> 24;
	int i_3_ = 255 - i_2_;
	i_0_ = ((i_0_ & 0xff00ff) * i_2_ & ~0xff00ff
		| (i_0_ & 0xff00) * i_2_ & 0xff0000) >>> 8;
	return i_0_ + ((i_3_ * (i & 0xff00ff) & ~0xff00ff
			| i_3_ * (i & 0xff00) & 0xff0000)
		       >>> 8);
    }
    
    static final void method10167(Class259 class259, int i, int i_4_, int i_5_,
				  Class683 class683, int i_6_) {
	if (class259.anIntArray2678 == null)
	    throw new RuntimeException();
	class259.anIntArray2678[i] = i_4_;
	class259.anIntArray2679[i] = i_5_;
    }
    
    static final void method10168(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aClass64_11992
		  .method1393((short) 1981) >> 3;
    }
    
    public static void method10169(int i, int i_7_) {
	if (i < 1)
	    Class556_Sub1.anInt10632 = 2091802645 * Class556_Sub1.anInt10623;
	else
	    Class556_Sub1.anInt10632 = 501736421 * i;
    }
    
    static final void method10170(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2606 * -1549235523;
    }
}
