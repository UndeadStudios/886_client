/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Textures
{
    int numTextures;
	TextureMetrics[] textures;
    
    public TextureMetrics method3115(int i) {
	return textures[i];
    }
    
    public TextureMetrics method3116(int i, int i_0_) {
	return textures[i];
    }
    
    public TextureMetrics method3117(int i) {
	return textures[i];
    }
    
    public Textures(JS5 idx26) {
	numTextures = idx26.getFileCountForArchive(0, 2058371176) * -1767884951;
	textures = new TextureMetrics[numTextures * 1909442777];
	for (int i = 0; i < 1909442777 * numTextures; i++) {
	    RSBuffer buffer
		= new RSBuffer(idx26.getFile(0, i, 786827373));
	    if (buffer.buffer == null)
		textures[i] = null;
	    else {
		try {
		    TextureMetrics info = new TextureMetrics();
		    info.method2669(i, buffer, (byte) 6);
		    textures[i] = info;
		} catch (Exception exception) {
		    textures[i] = null;
		}
	    }
	}
    }
    
    public static void method3118(String string, short i) {
	if (1777895575 * client.anInt11075 == 9) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4312,
				    client.aClass96_11361.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16602(0,
								  585805413);
	    int i_1_
		= (-1133521593
		   * class525_sub15.aClass525_Sub38_Sub2_10546.index);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
								  249411168);
	    class525_sub15.aClass525_Sub38_Sub2_10546.index
		+= -1918967999;
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16650
		(Class25.anIntArray238, i_1_,
		 (-1133521593
		  * class525_sub15.aClass525_Sub38_Sub2_10546.index),
		 (byte) -38);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16616
		((class525_sub15.aClass525_Sub38_Sub2_10546.index
		  * -1133521593) - i_1_,
		 1435355172);
	    client.aClass96_11361.method1794(class525_sub15, (short) 25248);
	    Class669_Sub1.aClass706_10920 = Class706.aClass706_8803;
	}
    }
    
    static final void method3119(Class683 class683, int i) {
	Class259 class259
	    = Class43.method1069(class683.anIntArray8661[((class683.anInt8662
							   -= 1552651121)
							  * 501271953)],
				 -695254952);
	if (class259.anInt2740 * 372293357 != -1)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1408303227 * class259.anInt2741;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    public static int method3120(int i, byte i_2_) {
	int i_3_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_3_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_3_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_3_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_3_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_3_++;
	}
	return i_3_ + i;
    }
    
    static final void method3121(int i, int i_4_, byte i_5_) {
	if (Class165.method2667(i, null, 817128354))
	    Class404.method6608((Class162.aClass245Array1764[i]
				 .aClass259Array2426),
				i_4_, 1465012932);
    }
}
