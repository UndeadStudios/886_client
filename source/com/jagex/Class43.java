/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class43
{
    static Class43 aClass43_342;
    static Class43 aClass43_343 = new Class43();
    
    static {
	aClass43_342 = new Class43();
    }
    
    Class43() {
	/* empty */
    }
    
    static void method1068(int i) {
	Class70.aClass96_741.method1791(2123832470);
	Class70.aClass96_741.aClass525_Sub38_Sub2_1168.index = 0;
	Class70.aClass96_741.aClass416_1181 = null;
	Class70.aClass96_741.aClass416_1165 = null;
	Class70.aClass96_741.aClass416_1183 = null;
	Class70.aClass96_741.anInt1175 = 0;
	client.anInt11257 = 0;
	client.anInt11362 = 0;
	client.anInt11204 = 0;
	client.anInt11366 = 0;
	client.aString11337 = null;
	Class110.anInt1371 = 0;
	Class699.aClass99Array8774 = null;
	Class193.aClass353_2150 = null;
	Class473.aClass353_5161 = null;
	client.aBool11376 = true;
	Class198_Sub5.method15616(-43228798);
	for (int i_0_ = 0;
	     i_0_ < Class532.aClass111_7170.aClass624Array1373.length;
	     i_0_++) {
	    Class624 class624
		= new Class624(Class91.aClass629_903.method10290(i_0_,
								 488031125),
			       false);
	    class624.method10224(0, (byte) 0);
	    class624.method10221(0, -678164011);
	    Class532.aClass111_7170.aClass624Array1373[i_0_] = class624;
	}
	Class532.aClass111_7170.aClass614_1374.method10062(1429253007);
	Class28.method911(-1803179893);
	Class600.method9891(Class70.aClass96_741, 267321791);
    }
    
    public static Class259 method1069(int i, int i_1_) {
	int i_2_ = i >> 16;
	if (null == Class162.aClass245Array1764[i_2_]
	    || (Class162.aClass245Array1764[i_2_].method4473(i, 1134176631)
		== null)) {
	    boolean bool = Class165.method2667(i_2_, null, 1489867698);
	    if (!bool)
		return null;
	}
	return Class162.aClass245Array1764[i_2_].method4473(i, 660997400);
    }
    
    public static Class387 method1070(RSBuffer class525_sub38, int i) {
	String string = class525_sub38.readString((byte) -63);
	Class395 class395 = (Class96.method1813(-490515950)
			     [class525_sub38.readUnsignedByte(1273352738)]);
	Class396 class396 = (Class643.method10595((byte) 16)
			     [class525_sub38.readUnsignedByte(543265286)]);
	int i_3_ = class525_sub38.readSmart((byte) 68);
	int i_4_ = class525_sub38.readSmart((byte) -19);
	int i_5_ = class525_sub38.readUnsignedByte(1392887198);
	int i_6_ = class525_sub38.readUnsignedByte(1303196461);
	int i_7_ = class525_sub38.readUnsignedByte(204481804);
	int i_8_ = class525_sub38.readUnsignedShort((byte) 99);
	int i_9_ = class525_sub38.readUnsignedShort((byte) 126);
	int i_10_ = class525_sub38.readBigSmart(-2043778683);
	int i_11_ = class525_sub38.readInt(1869623196);
	int i_12_ = class525_sub38.readInt(1885830189);
	return new Class387(string, class395, class396, i_3_, i_4_, i_5_, i_6_,
			    i_7_, i_8_, i_9_, i_10_, i_11_, i_12_);
    }
    
    static final void method1071(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class280.aBool3001 ? 1 : 0;
    }
    
    static final void method1072(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class525_Sub39.method16851(-195317676);
    }
    
    static final void method1073(Class259 class259, Class683 class683, int i) {
	int i_13_ = 10;
	int i_14_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class684.method11244(class259, i_13_, i_14_, class683, -1681803501);
    }
}
