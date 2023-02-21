/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

import com.jagex.twitchtv.TwitchTV;

public class Class285
{
    static int anInt3138;
    int anInt3139;
    int anInt3140;
    String aString3141;
    public static String aString3142;
    static TwitchTV aTwitchTV3143;
    
    Class285(String string, int i, int i_0_) {
	aString3141 = string;
	anInt3139 = 1933418271 * i;
	anInt3140 = i_0_ * 1928276159;
    }
    
    static final void method5221(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	boolean bool
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1] == 1;
	if (null != Class556_Sub1.aClass10_10640) {
	    Class525 class525
		= Class556_Sub1.aClass10_10640.method684((long) i_1_);
	    if (class525 != null && !bool)
		class525.method8755(-1933461091);
	    else if (null == class525 && bool) {
		class525 = new Class525();
		Class556_Sub1.aClass10_10640.method695(class525, (long) i_1_);
	    }
	}
    }
    
    static final void method5222(Class683 class683, int i) {
	String string = "";
	if (Class661.aClipboard8474 != null) {
	    Transferable transferable
		= Class661.aClipboard8474.getContents(null);
	    if (transferable != null) {
		try {
		    string
			= (String) transferable.getTransferData(DataFlavor
								.stringFlavor);
		    if (null == string)
			string = "";
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = string;
    }
    
    static final void method5223(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_3_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	int i_4_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	Class276 class276 = Class229.method4380(i_2_, 304009002);
	float f = (float) i_3_;
	if (class276 == Class276.aClass276_2871
	    || Class276.aClass276_2873 == class276
	    || Class276.aClass276_2868 == class276)
	    f = Class436.method7071(i_3_);
	Class525_Sub16_Sub9_Sub2 class525_sub16_sub9_sub2
	    = new Class525_Sub16_Sub9_Sub2(Class453_Sub3
					       .aClass309_Sub1_10316
					       .method15748(2111491488),
					   class276, f,
					   (float) i_4_ / 1000.0F);
	Class453_Sub3.aClass309_Sub1_10316.method5551(class525_sub16_sub9_sub2,
						      -392782290);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1940820665 * class525_sub16_sub9_sub2.anInt11794;
    }
}
