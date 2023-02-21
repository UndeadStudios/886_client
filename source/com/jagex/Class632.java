/* Class632 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class632
{
    public Class598 aClass598_8211;
    public Interface66 anInterface66_8212;
    public Interface66 anInterface66_8213;
    public Interface66 anInterface66_8214;
    public Class598 aClass598_8215;
    public Interface66 anInterface66_8216;
    public Class598 aClass598_8217;
    public int anInt8218;
    public int anInt8219;
    public boolean aBool8220;
    
    void method10319(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(1045536025);
	    if (0 == i_0_)
		break;
	    if (1 == i_0_)
		anInterface66_8212
		    = Class305.method5423(class525_sub38, -1022447020);
	    else if (2 == i_0_)
		anInterface66_8216
		    = Class305.method5423(class525_sub38, 1403857697);
	    else if (3 == i_0_)
		anInterface66_8213
		    = Class305.method5423(class525_sub38, 997809622);
	    else if (i_0_ == 4)
		anInterface66_8214
		    = Class305.method5423(class525_sub38, 352984753);
	    else if (5 == i_0_)
		aClass598_8215
		    = Class571.method9531(class525_sub38, 1125464279);
	    else if (i_0_ == 6)
		aClass598_8211
		    = Class571.method9531(class525_sub38, 2005052214);
	    else if (i_0_ == 7)
		aClass598_8217
		    = Class571.method9531(class525_sub38, 109664696);
	    else if (i_0_ == 8)
		Class305.method5423(class525_sub38, 1825412514);
	    else if (i_0_ == 9)
		Class305.method5423(class525_sub38, 1241928986);
	    else if (i_0_ == 10)
		Class305.method5423(class525_sub38, -961706175);
	    else if (11 == i_0_)
		aBool8220 = true;
	    else if (12 == i_0_)
		anInt8218 = class525_sub38.readInt(1543592054) * 399223749;
	    else if (13 == i_0_)
		anInt8219
		    = class525_sub38.readInt(1342379394) * -639665933;
	}
    }
    
    public Class632(Class458 class458) {
	byte[] is = class458.method7484((Class638.aClass638_8312.anInt8316
					 * 2028004077),
					1272457076);
	method10319(new RSBuffer(is), 852276763);
    }
    
    void method10320(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1564842829);
	    if (0 == i)
		break;
	    if (1 == i)
		anInterface66_8212
		    = Class305.method5423(class525_sub38, -1314137908);
	    else if (2 == i)
		anInterface66_8216
		    = Class305.method5423(class525_sub38, -108139137);
	    else if (3 == i)
		anInterface66_8213
		    = Class305.method5423(class525_sub38, 1489328007);
	    else if (i == 4)
		anInterface66_8214
		    = Class305.method5423(class525_sub38, -2128117822);
	    else if (5 == i)
		aClass598_8215
		    = Class571.method9531(class525_sub38, 481039944);
	    else if (i == 6)
		aClass598_8211
		    = Class571.method9531(class525_sub38, 1726266447);
	    else if (i == 7)
		aClass598_8217
		    = Class571.method9531(class525_sub38, 133524073);
	    else if (i == 8)
		Class305.method5423(class525_sub38, -826414555);
	    else if (i == 9)
		Class305.method5423(class525_sub38, 1074660944);
	    else if (i == 10)
		Class305.method5423(class525_sub38, -1151104655);
	    else if (11 == i)
		aBool8220 = true;
	    else if (12 == i)
		anInt8218 = class525_sub38.readInt(1601286956) * 399223749;
	    else if (13 == i)
		anInt8219 = class525_sub38.readInt(950288934) * -639665933;
	}
    }
    
    void method10321(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1153999014);
	    if (0 == i)
		break;
	    if (1 == i)
		anInterface66_8212
		    = Class305.method5423(class525_sub38, -1828559960);
	    else if (2 == i)
		anInterface66_8216
		    = Class305.method5423(class525_sub38, -1108738064);
	    else if (3 == i)
		anInterface66_8213
		    = Class305.method5423(class525_sub38, -728112437);
	    else if (i == 4)
		anInterface66_8214
		    = Class305.method5423(class525_sub38, -1818679115);
	    else if (5 == i)
		aClass598_8215
		    = Class571.method9531(class525_sub38, 1376395684);
	    else if (i == 6)
		aClass598_8211
		    = Class571.method9531(class525_sub38, 211369491);
	    else if (i == 7)
		aClass598_8217
		    = Class571.method9531(class525_sub38, 663621746);
	    else if (i == 8)
		Class305.method5423(class525_sub38, -685106542);
	    else if (i == 9)
		Class305.method5423(class525_sub38, -831632592);
	    else if (i == 10)
		Class305.method5423(class525_sub38, -930236936);
	    else if (11 == i)
		aBool8220 = true;
	    else if (12 == i)
		anInt8218 = class525_sub38.readInt(1977441863) * 399223749;
	    else if (13 == i)
		anInt8219
		    = class525_sub38.readInt(1441788886) * -639665933;
	}
    }
    
    public static void method10322(Class631 class631, byte i) {
	Class29.anInt288 = -1145717861 * class631.anInt8201;
	Class702.anInt8789 = 566739447 * class631.anInt8200;
	Class29.anInt289 = 44960677 * class631.anInt8165;
	Class696_Sub13.anInt10911 = -60365211 * class631.anInt8208;
	Class525_Sub31.anInt10733 = class631.anInt8188 * 1154232485;
	Class509.anInt5661 = 904690533 * class631.anInt8204;
	Class285.anInt3138 = class631.anInt8205 * 852944561;
	Class29.anInt290 = -380748837 * class631.anInt8206;
	Class138.anInt1639 = -931831621 * class631.anInt8207;
	Class29.anInt291 = -563093445 * class631.anInt8185;
	Class696_Sub35.anInt10976 = 1337457589 * class631.anInt8191;
	Class29.anInt292 = -791536517 * class631.anInt8197;
    }
    
    static final void method10323(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aBool11058 ? 1 : 0;
    }
    
    static final void method10324(Class683 class683, int i)
	throws Exception_Sub7 {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_2_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	Class453_Sub3.aClass309_Sub1_10316.method5509
	    ((float) (2.0 * ((double) i_1_ * 3.141592653589793) / 16384.0),
	     (float) (2.0 * (3.141592653589793 * (double) i_2_) / 16384.0),
	     852634176);
    }
    
    static Class702[] method10325(int i) {
	return (new Class702[]
		{ Class702.aClass702_8787, Class702.aClass702_8788,
		  Class702.aClass702_8785 });
    }
    
    static final void method10326(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class70.anInt790 * 125455839;
    }
    
    public static int method10327(short[] is, int i, Class334 class334,
				  int i_3_, byte i_4_) throws IOException {
	int i_5_ = 1;
	int i_6_ = 0;
	for (int i_7_ = 0; i_7_ < i_3_; i_7_++) {
	    int i_8_ = class334.method5829(is, i + i_5_, (byte) 12);
	    i_5_ <<= 1;
	    i_5_ += i_8_;
	    i_6_ |= i_8_ << i_7_;
	}
	return i_6_;
    }
}
