/* Class525_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub31 extends Class525
{
    public long aLong10732;
    static int anInt10733;
    
    public Class525_Sub31(long l) {
	aLong10732 = -3312960714849657999L * l;
    }
    
    public static int method16523(int i, int i_0_, int i_1_, int i_2_) {
	int i_3_ = 255 - i_1_;
	i_0_ = ((i_0_ & 0xff00ff) * i_1_ & ~0xff00ff
		| i_1_ * (i_0_ & 0xff00) & 0xff0000) >>> 8;
	return (((i_3_ * (i & 0xff00ff) & ~0xff00ff
		  | i_3_ * (i & 0xff00) & 0xff0000)
		 >>> 8)
		+ i_0_);
    }
}
