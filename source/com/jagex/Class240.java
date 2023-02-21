/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class240 implements Interface28
{
    Class221 this$0;
    public static int anInt2412;
    
    public void method162(Class228 class228) {
	class228.method4287((short) 21546);
    }
    
    public void method163(Class228 class228, int i) {
	class228.method4287((short) 7584);
    }
    
    public void method161(Class228 class228) {
	class228.method4287((short) 4718);
    }
    
    Class240(Class221 class221) {
	this$0 = class221;
    }
    
    public void method160(Class228 class228) {
	class228.method4287((short) 16039);
    }
    
    public void method165(Class228 class228) {
	class228.method4287((short) 18313);
    }
    
    public void method164(Class228 class228) {
	class228.method4287((short) 20217);
    }
    
    public static void method4427
	(int i, int i_0_, String string, String string_1_, String string_2_,
	 String string_3_, Class411 class411, int i_4_) {
	Class627.method10275(i, i_0_, string, string_1_, string_2_, string_3_,
			     null, -1, class411, (byte) 0);
    }
    
    public static int method4428(short i) {
	if (3 == Class589.anInt7805 * -345055283)
	    return -1;
	if (Class589.anInt7805 * -345055283 != 0)
	    return Class589.anInt7791 * 1271064527;
	if (null == Class589.aStringArray7793) {
	    if (Class512.aString5685.startsWith("mac ")) {
		if (Class512.aString5687.startsWith("ppc")) {
		    Class589.anInt7805 = -632066289;
		    return -1;
		}
		Class589.aStringArray7793 = new String[3];
		Class589.aStringArray7793[0] = "sdk-mac-dynamic";
		Class589.aStringArray7793[1] = "twitchsdk";
		Class589.aStringArray7793[2] = "twitchtv";
		Class589.aBoolArray7792 = new boolean[3];
		Class589.aBoolArray7792[0] = false;
		Class589.aBoolArray7792[1] = false;
		Class589.aBoolArray7792[2] = true;
	    } else if (Class512.aString5685.startsWith("win")) {
		Class589.aStringArray7793 = new String[6];
		Class589.aStringArray7793[0] = "avutil-ttv-51";
		Class589.aStringArray7793[1] = "libmp3lame-ttv";
		Class589.aStringArray7793[2] = "swresample-ttv-0";
		Class589.aStringArray7793[5] = "twitchtv";
		if (Class512.aString5687.startsWith("amd64")
		    || Class512.aString5687.startsWith("x86_64")) {
		    Class589.aStringArray7793[3] = "libmfxsw64";
		    Class589.aStringArray7793[4] = "twitchsdk_64_release";
		} else if (Class512.aString5687.startsWith("i386")
			   || Class512.aString5687.startsWith("i486")
			   || Class512.aString5687.startsWith("i586")
			   || Class512.aString5687.startsWith("x86")) {
		    Class589.aStringArray7793[3] = "libmfxsw32";
		    Class589.aStringArray7793[4] = "twitchsdk_32_release";
		} else {
		    Class589.anInt7805 = -632066289;
		    return -1;
		}
		Class589.aBoolArray7792 = new boolean[6];
		Class589.aBoolArray7792[0] = true;
		Class589.aBoolArray7792[1] = true;
		Class589.aBoolArray7792[2] = true;
		Class589.aBoolArray7792[3] = false;
		Class589.aBoolArray7792[4] = true;
		Class589.aBoolArray7792[5] = true;
	    } else {
		Class589.anInt7805 = -632066289;
		return -1;
	    }
	}
	Class589.anInt7805 = -210688763;
	return 0;
    }
    
    static final void method4429(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = new StringBuilder().append(string).append(i_5_).toString();
    }
    
    static final void method4430(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class525.method8760(class259, class245, class683, 32240657);
    }
}
