/* Class398 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class398 implements Interface45
{
    public int anInt4114;
    public Class396 aClass396_4115;
    public int anInt4116;
    public int anInt4117;
    public Class395 aClass395_4118;
    public int anInt4119;
    public int anInt4120;
    public int anInt4121;
    public int anInt4122;
    public int anInt4123;
    public boolean aBool4124;
    
    Class398(int i, Class395 class395, Class396 class396, int i_0_, int i_1_,
	     int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
	anInt4123 = i * -1244234421;
	aClass395_4118 = class395;
	aClass396_4115 = class396;
	anInt4116 = i_0_ * 1366271307;
	anInt4117 = 2115967073 * i_1_;
	anInt4121 = 1638010161 * i_2_;
	anInt4122 = 1949884577 * i_3_;
	anInt4114 = -436458903 * i_4_;
	anInt4119 = 640415675 * i_5_;
	anInt4120 = i_6_ * -1508319691;
	aBool4124 = bool;
    }
    
    public Class392 method334(int i) {
	return Class392.aClass392_4076;
    }
    
    public Class392 method335() {
	return Class392.aClass392_4076;
    }
    
    public Class392 method336() {
	return Class392.aClass392_4076;
    }
    
    public static Class398 method6540(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1430761567);
	Class395 class395 = (Class96.method1813(-1429567724)
			     [class525_sub38.readUnsignedByte(527041800)]);
	Class396 class396 = (Class643.method10595((byte) 88)
			     [class525_sub38.readUnsignedByte(752267636)]);
	int i_7_ = class525_sub38.readSmart((byte) -78);
	int i_8_ = class525_sub38.readSmart((byte) 101);
	int i_9_ = class525_sub38.readUnsignedShort((byte) 17);
	int i_10_ = class525_sub38.readUnsignedShort((byte) 72);
	int i_11_ = class525_sub38.readInt(1086816719);
	int i_12_ = class525_sub38.readInt(1780011545);
	int i_13_ = class525_sub38.readInt(1007930231);
	boolean bool = class525_sub38.readUnsignedByte(198026596) == 1;
	return new Class398(i, class395, class396, i_7_, i_8_, i_9_, i_10_,
			    i_11_, i_12_, i_13_, bool);
    }
    
    public static Class398 method6541(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1091447954);
	Class395 class395 = (Class96.method1813(579437574)
			     [class525_sub38.readUnsignedByte(278880579)]);
	Class396 class396 = (Class643.method10595((byte) 95)
			     [class525_sub38.readUnsignedByte(2097175345)]);
	int i_14_ = class525_sub38.readSmart((byte) 17);
	int i_15_ = class525_sub38.readSmart((byte) 2);
	int i_16_ = class525_sub38.readUnsignedShort((byte) 94);
	int i_17_ = class525_sub38.readUnsignedShort((byte) 14);
	int i_18_ = class525_sub38.readInt(1956135798);
	int i_19_ = class525_sub38.readInt(2004334558);
	int i_20_ = class525_sub38.readInt(1950939520);
	boolean bool = class525_sub38.readUnsignedByte(2059070055) == 1;
	return new Class398(i, class395, class396, i_14_, i_15_, i_16_, i_17_,
			    i_18_, i_19_, i_20_, bool);
    }
    
    public static Class398 method6542(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(521974783);
	Class395 class395 = (Class96.method1813(-1967240022)
			     [class525_sub38.readUnsignedByte(981758946)]);
	Class396 class396 = (Class643.method10595((byte) 43)
			     [class525_sub38.readUnsignedByte(686683478)]);
	int i_21_ = class525_sub38.readSmart((byte) -8);
	int i_22_ = class525_sub38.readSmart((byte) -36);
	int i_23_ = class525_sub38.readUnsignedShort((byte) 87);
	int i_24_ = class525_sub38.readUnsignedShort((byte) 29);
	int i_25_ = class525_sub38.readInt(1511256912);
	int i_26_ = class525_sub38.readInt(980099249);
	int i_27_ = class525_sub38.readInt(1823085217);
	boolean bool = class525_sub38.readUnsignedByte(1400121176) == 1;
	return new Class398(i, class395, class396, i_21_, i_22_, i_23_, i_24_,
			    i_25_, i_26_, i_27_, bool);
    }
    
    static void method6543(int i) {
	if (Class381.anIntArray3929 == null)
	    Class381.anIntArray3929 = new int[65536];
	else
	    return;
	double d = 0.7;
	int i_28_ = 0;
	for (int i_29_ = 0; i_29_ < 512; i_29_++) {
	    float f = (0.0078125F + (float) (i_29_ >> 3) / 64.0F) * 360.0F;
	    float f_30_ = (float) (i_29_ & 0x7) / 8.0F + 0.0625F;
	    for (int i_31_ = 0; i_31_ < 128; i_31_++) {
		float f_32_ = (float) i_31_ / 128.0F;
		float f_33_ = 0.0F;
		float f_34_ = 0.0F;
		float f_35_ = 0.0F;
		float f_36_ = f / 60.0F;
		int i_37_ = (int) f_36_;
		int i_38_ = i_37_ % 6;
		float f_39_ = f_36_ - (float) i_37_;
		float f_40_ = f_32_ * (1.0F - f_30_);
		float f_41_ = f_32_ * (1.0F - f_30_ * f_39_);
		float f_42_ = f_32_ * (1.0F - f_30_ * (1.0F - f_39_));
		if (i_38_ == 0) {
		    f_33_ = f_32_;
		    f_34_ = f_42_;
		    f_35_ = f_40_;
		} else if (i_38_ == 1) {
		    f_33_ = f_41_;
		    f_34_ = f_32_;
		    f_35_ = f_40_;
		} else if (2 == i_38_) {
		    f_33_ = f_40_;
		    f_34_ = f_32_;
		    f_35_ = f_42_;
		} else if (i_38_ == 3) {
		    f_33_ = f_40_;
		    f_34_ = f_41_;
		    f_35_ = f_32_;
		} else if (4 == i_38_) {
		    f_33_ = f_42_;
		    f_34_ = f_40_;
		    f_35_ = f_32_;
		} else if (i_38_ == 5) {
		    f_33_ = f_32_;
		    f_34_ = f_40_;
		    f_35_ = f_41_;
		}
		f_33_ = (float) Math.pow((double) f_33_, d);
		f_34_ = (float) Math.pow((double) f_34_, d);
		f_35_ = (float) Math.pow((double) f_35_, d);
		int i_43_ = (int) (f_33_ * 256.0F);
		int i_44_ = (int) (f_34_ * 256.0F);
		int i_45_ = (int) (256.0F * f_35_);
		int i_46_ = (i_44_ << 8) + ((i_43_ << 16) + -16777216) + i_45_;
		Class381.anIntArray3929[i_28_++] = i_46_;
	    }
	}
    }
    
    static final void method6544(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class248.method4493(class259, class245, class683, -360563416);
    }
}
