/* Class399 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class399 implements Interface45
{
    public int anInt4125;
    public Class395 aClass395_4126;
    public int anInt4127;
    public int anInt4128;
    public Class396 aClass396_4129;
    
    public static Class399 method6545(RSBuffer class525_sub38) {
	int i = class525_sub38.readBigSmart(-2043778683);
	Class395 class395 = (Class96.method1813(-1885147685)
			     [class525_sub38.readUnsignedByte(467273416)]);
	Class396 class396 = (Class643.method10595((byte) 3)
			     [class525_sub38.readUnsignedByte(5981338)]);
	int i_0_ = class525_sub38.readSmart((byte) -84);
	int i_1_ = class525_sub38.readSmart((byte) -31);
	return new Class399(i, class395, class396, i_0_, i_1_);
    }
    
    public Class392 method336() {
	return Class392.aClass392_4072;
    }
    
    public Class392 method335() {
	return Class392.aClass392_4072;
    }
    
    Class399(int i, Class395 class395, Class396 class396, int i_2_, int i_3_) {
	anInt4127 = i * -966173531;
	aClass395_4126 = class395;
	aClass396_4129 = class396;
	anInt4128 = i_2_ * 9365713;
	anInt4125 = i_3_ * 1474561359;
    }
    
    public Class392 method334(int i) {
	return Class392.aClass392_4072;
    }
    
    public static Class399 method6546(RSBuffer class525_sub38) {
	int i = class525_sub38.readBigSmart(-2043778683);
	Class395 class395 = (Class96.method1813(1828899263)
			     [class525_sub38.readUnsignedByte(928189185)]);
	Class396 class396 = (Class643.method10595((byte) 45)
			     [class525_sub38.readUnsignedByte(2130720390)]);
	int i_4_ = class525_sub38.readSmart((byte) 13);
	int i_5_ = class525_sub38.readSmart((byte) 42);
	return new Class399(i, class395, class396, i_4_, i_5_);
    }
    
    public static String method6547(byte i) {
	return Class587.aString7773;
    }
    
    static final void method6548(Class683 class683, int i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_6_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_6_ >> 16];
	Class32.method942(class259, class245, class683, (byte) 1);
    }
    
    static final void method6549(Class683 class683, byte i) {
	class683.anInt8662 -= 1552651121;
	int i_7_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	Class525_Sub16_Sub8 class525_sub16_sub8
	    = Class110.method1964(i_7_, 1684360816);
	if (null != class525_sub16_sub8) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class525_sub16_sub8.anInt11783 * -2034616761;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= Class40_Sub17.method17489((class525_sub16_sub8.aLong11784
					     * 5358036406326939073L),
					    1553960475 * (Class21.aClass666_213
							  .anInt8569),
					    501271953);
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class525_sub16_sub8.anInt11785 * 1798449891;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= (null != class525_sub16_sub8.aString11786
		   ? class525_sub16_sub8.aString11786 : "");
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= (class525_sub16_sub8.aString11792 != null
		   ? class525_sub16_sub8.aString11792 : "");
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= (class525_sub16_sub8.aString11788 != null
		   ? class525_sub16_sub8.aString11788 : "");
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= (class525_sub16_sub8.aString11789 != null
		   ? class525_sub16_sub8.aString11789 : "");
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class525_sub16_sub8.anInt11790 * 457072043;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= (null != class525_sub16_sub8.aString11791
		   ? class525_sub16_sub8.aString11791 : "");
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (null != class525_sub16_sub8.aClass411_11787
		   ? class525_sub16_sub8.aClass411_11787.method80() : -1);
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	}
    }
}
