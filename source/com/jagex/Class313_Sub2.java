/* Class313_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Graphics;
import java.awt.Image;

public class Class313_Sub2 extends Class313
{
    Class292 this$0;
    Image anImage10105;
    public static Class40_Sub22 aClass40_Sub22_10106;
    
    void method5642(Graphics graphics) {
	int i = (this$0.method5283(anImage10105.getWidth(null), -1918736928)
		 + anInt3483 * 642724771);
	int i_0_ = (this$0.method5284(anImage10105.getHeight(null), (byte) 91)
		    + -1691032291 * anInt3482);
	graphics.drawImage(anImage10105, i, i_0_, null);
    }
    
    Class313_Sub2(Class292 class292, Image image, int i, int i_1_) {
	super(class292, i, i_1_);
	this$0 = class292;
	anImage10105 = image;
    }
    
    void method5641(Graphics graphics, int i) {
	int i_2_ = (this$0.method5283(anImage10105.getWidth(null), -708065369)
		    + anInt3483 * 642724771);
	int i_3_ = (this$0.method5284(anImage10105.getHeight(null), (byte) 88)
		    + -1691032291 * anInt3482);
	graphics.drawImage(anImage10105, i_2_, i_3_, null);
    }
    
    static final void method15732(int i, int i_4_) {
	int i_5_ = client.anInt11083 - -1403321755 * client.anInt11340;
	if (i_5_ >= 100) {
	    Class700.anInt8779
		= Class152_Sub1.method14533(-1904050599) * 222998419;
	    Class648.anInt8363 = -1945230309;
	    Class198_Sub3.anInt9911 = 56698409;
	} else {
	    float f = 1.0F - (float) ((100 - i_5_) * (100 - i_5_)
				      * (100 - i_5_)) / 1000000.0F;
	    int i_6_;
	    if (Class152_Sub1.method14533(-1757806435) == 5) {
		Class525_Sub28 class525_sub28
		    = Class453_Sub3.aClass309_Sub1_10316.method5481
			  (-1720776241).method6133((byte) -5);
		Class600 class600
		    = client.aClass507_11137.method8350(-1010695559);
		Class689_Sub1.anInt11019
		    = ((int) ((double) Class453_Sub3.aClass309_Sub1_10316
					   .method5490(1396183812)
			      * 2607.5945876176133)
		       & 0x3fff) * 784259773;
		Class64.anInt695
		    = ((int) ((double) Class453_Sub3.aClass309_Sub1_10316
					   .method5491((byte) 0)
			      * -2607.5945876176133)
		       & 0x3fff) * -1054956469;
		ItemDefinitions.anInt137 = 0;
		client.anInt11360
		    = (int) ((float) (-1839278261 * Class329.anInt3590)
			     + (float) ((int) ((double) (client.anInt11067
							 * -672051425)
					       / (4.0
						  * (Math.tan
						     ((double) ((Class453_Sub3
								     .aClass309_Sub1_10316
								     .method5501
								 ((byte) 28))
								/ 2.0F)))))
					- (-1839278261
					   * (Class329
					      .anInt3590))) * f) * -2079531213;
		Class477.anInt5200
		    = (int) ((float) (Class276.anInt2876 * -1916055853)
			     + ((float) (-794397083 * class525_sub28.anInt10614
					 - -1159839232 * class600.anInt7858
					 - Class276.anInt2876 * -1916055853)
				* f)) * 54795941;
		Class575.anInt7648
		    = (int) ((float) (2052556445 * Class218.anInt2328)
			     + ((float) (-(-1069747287
					   * class525_sub28.anInt10617)
					 - Class218.anInt2328 * 2052556445)
				* f)) * -1332233853;
		Class475.anInt5179
		    = (662343119
		       * (int) (f * (float) ((602488327
					      * class525_sub28.anInt10618)
					     - 1633099264 * class600.anInt7860
					     - -618390327 * Class238.anInt2404)
				+ (float) (Class238.anInt2404 * -618390327)));
		i_6_ = (-(-684522141 * Class64.anInt695)
			- Class265.anInt2806 * 1285676489) & 0x3fff;
		if (i_6_ > 8192)
		    i_6_ -= 16384;
		else if (i_6_ < -8192)
		    i_6_ += 16384;
	    } else {
		int i_7_ = (int) client.aFloat11176;
		if (466430475 * client.anInt11185 >> 8 > i_7_)
		    i_7_ = 466430475 * client.anInt11185 >> 8;
		if (client.aBoolArray11343[4]
		    && 128 + client.anIntArray11345[4] > i_7_)
		    i_7_ = client.anIntArray11345[4] + 128;
		int i_8_ = (((int) client.aFloat11052
			     + 1579923035 * client.anInt11164)
			    & 0x3fff);
		Class446 class446
		    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818
		       ().aClass446_4807);
		Class492.method7994
		    (Class275.anInt2867 * 1497781253,
		     (Class335.method5855((int) class446.aFloat4895,
					  (int) class446.aFloat4897,
					  -1335910809 * Class677.anInt8619,
					  2020563229)
		      - -858398829 * client.anInt11195),
		     1222586347 * Class381.anInt3930, i_7_, i_8_,
		     (i_7_ >> 3) * 3 + 600 << 2, i, -4768124);
		Class477.anInt5200
		    = ((int) ((float) (-469853907 * Class477.anInt5200
				       - Class276.anInt2876 * -1916055853) * f
			      + (float) (Class276.anInt2876 * -1916055853))
		       * 54795941);
		Class575.anInt7648
		    = ((int) (f * (float) (Class575.anInt7648 * -142598869
					   - 2052556445 * Class218.anInt2328)
			      + (float) (2052556445 * Class218.anInt2328))
		       * -1332233853);
		Class475.anInt5179
		    = (662343119
		       * (int) ((float) (Class238.anInt2404 * -618390327)
				+ f * (float) (-1889707729 * Class475.anInt5179
					       - (Class238.anInt2404
						  * -618390327))));
		Class689_Sub1.anInt11019
		    = (784259773
		       * (int) (f * (float) ((Class689_Sub1.anInt11019
					      * 1201172629)
					     - Class514.anInt5696 * 301160633)
				+ (float) (Class514.anInt5696 * 301160633)));
		i_6_ = (Class64.anInt695 * -684522141
			- 1285676489 * Class265.anInt2806);
		if (i_6_ > 8192)
		    i_6_ -= 16384;
		else if (i_6_ < -8192)
		    i_6_ += 16384;
	    }
	    Class64.anInt695
		= -1054956469 * (int) ((float) (1285676489
						* Class265.anInt2806)
				       + (float) i_6_ * f);
	    Class64.anInt695
		= -1054956469 * (Class64.anInt695 * -684522141 & 0x3fff);
	    client.anInt11360
		= ((int) ((float) (Class329.anInt3590 * -1839278261)
			  + f * (float) (client.anInt11360 * -1251068933
					 - Class329.anInt3590 * -1839278261))
		   * -2079531213);
	}
    }
    
    public static final void method15733(String string, int i) {
	if (null != string) {
	    String string_9_
		= Class48.method1111(string, Class454.aClass76_4951,
				     1806428570);
	    if (string_9_ != null) {
		for (int i_10_ = 0; i_10_ < -883281325 * client.anInt11204;
		     i_10_++) {
		    Class66 class66 = client.aClass66Array11356[i_10_];
		    String string_11_ = class66.aString708;
		    String string_12_
			= Class48.method1111(string_11_,
					     Class454.aClass76_4951,
					     2090525667);
		    if (Class569.method9523(string, string_9_, string_11_,
					    string_12_, -247913013)) {
			client.anInt11204 -= 1920262619;
			for (int i_13_ = i_10_;
			     i_13_ < client.anInt11204 * -883281325; i_13_++)
			    client.aClass66Array11356[i_13_]
				= client.aClass66Array11356[1 + i_13_];
			client.anInt11304 = 1928320841 * client.anInt11162;
			Class96 class96 = Class111.method1979(-1266379814);
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4302,
						class96.aClass6_1169,
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16735
			    (Class161.method2628(string, 665097965),
			     -1794978985);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16700(string, -1394734939);
			class96.method1794(class525_sub15, (short) 10145);
			break;
		    }
		}
	    }
	}
    }
    
    public static Class179 method15734(Class182 class182, int i, int i_14_,
				       int i_15_, int i_16_, int i_17_,
				       byte i_18_) {
	long l = (long) i_17_;
	Class179 class179 = (Class179) Class109.aClass200_1321.method3785(l);
	int i_19_ = 2055;
	if (class179 == null) {
	    ModelDecoder class186
		= ModelDecoder.method3644(WorldTile.aClass458_705, i_17_, 0);
	    if (null == class186)
		return null;
	    if (class186.version < 13)
		class186.method3651(2);
	    class179 = class182.method3556(class186, i_19_,
					   Class109.anInt1322 * -2113606617,
					   64, 768);
	    Class109.aClass200_1321.method3788(class179, l);
	}
	class179 = class179.method2926((byte) 6, i_19_, true);
	if (i != 0)
	    class179.method2930(i);
	if (i_14_ != 0)
	    class179.method2932(i_14_);
	if (0 != i_15_)
	    class179.method2933(i_15_);
	if (i_16_ != 0)
	    class179.method2934(0, i_16_, 0);
	return class179;
    }
}
