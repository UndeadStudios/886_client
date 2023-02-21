/* Class536 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;
import java.util.LinkedList;

public class Class536
{
    Class530 this$0;
    
    Class536(Class530 class530) {
	this$0 = class530;
    }
    
    static final void method8868(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class251.method4513(class259, class245, class683, (byte) 81);
    }
    
    static final void method8869(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_1_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_1_ >> 16];
	Class537.method8879(class259, class245, class683, -294041153);
    }
    
    static final void method8870(Class683 class683, int i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aClass31Array11368[i_2_].aBool303 ? 1 : 0;
    }
    
    static void method8871(int i, int i_3_, Class259 class259, short i_4_) {
	int i_5_ = i + -1694810043 * class259.anInt2602;
	int i_6_ = i_3_ + 15;
	if (client.aBool11086) {
	    int i_7_ = -256;
	    if (client.anInt5567 * -300823033 < 20)
		i_7_ = -65536;
	    Class29.aClass175_293.method2852
		(new StringBuilder().append("Fps:").append
		     (client.anInt5567 * -300823033).append
		     (" (").append
		     (1203003921 * client.anInt5595).append
		     (" ms)").toString(),
		 i_5_, i_6_, i_7_, -1, 2114092204);
	    i_6_ += 15;
	    Runtime runtime = Runtime.getRuntime();
	    long l = runtime.totalMemory() / 1024L;
	    long l_8_ = l - runtime.freeMemory() / 1024L;
	    int i_9_ = -256;
	    if (l_8_ > 262144L)
		i_9_ = -65536;
	    Class29.aClass175_293.method2852(new StringBuilder().append
						 ("Mem:").append
						 (l_8_).append
						 ("/").append
						 (l).append
						 ("k").toString(),
					     i_5_, i_6_, i_9_, -1, 1910493449);
	    i_6_ += 15;
	    long l_10_
		= client.aClass96_11085.aClass49_1185.method1119(-1877563864);
	    String string = "N/A";
	    if (l_10_ != -1L) {
		string = new StringBuilder().append(l_10_).append("ms")
			     .toString();
		if (l_10_ > 500L)
		    string = new StringBuilder().append
				 (Class493.method8001(16711680, 1490139795))
				 .append
				 (string).append
				 (Class493.method8001(16776960, 1304076288))
				 .toString();
	    }
	    Class29.aClass175_293.method2852
		(new StringBuilder().append("Game: In:").append
		     (994731871 * client.aClass96_11085.anInt1180).append
		     ("B/s ").append
		     ("Out:").append
		     (client.aClass96_11085.anInt1179 * -245108411).append
		     ("B/s ").append
		     ("Ping:").append
		     (string).toString(),
		 i_5_, i_6_, -256, -1, 2035466787);
	    i_6_ += 15;
	    long l_11_
		= client.aClass96_11361.aClass49_1185.method1119(-1593581778);
	    String string_12_ = "N/A";
	    if (l_11_ != -1L) {
		string_12_ = new StringBuilder().append(l_11_).append("ms")
				 .toString();
		if (l_11_ > 500L)
		    string_12_
			= new StringBuilder().append
			      (Class493.method8001(16711680, 1699014014))
			      .append
			      (string_12_).append
			      (Class493.method8001(16776960, 832621242))
			      .toString();
	    }
	    Class29.aClass175_293.method2852
		(new StringBuilder().append("Lobby: In:").append
		     (client.aClass96_11361.anInt1180 * 994731871).append
		     ("B/s ").append
		     ("Out:").append
		     (client.aClass96_11361.anInt1179 * -245108411).append
		     ("B/s ").append
		     ("Ping:").append
		     (string_12_).toString(),
		 i_5_, i_6_, -256, -1, 1868389681);
	    i_6_ += 15;
	    int i_13_ = Class501.aClass182_5564.method3137() / 1024;
	    Class29.aClass175_293.method2852(new StringBuilder().append
						 ("Offheap:").append
						 (i_13_).append
						 ("k").toString(),
					     i_5_, i_6_,
					     i_13_ > 65536 ? -65536 : -256, -1,
					     1909835442);
	    i_6_ += 15;
	    int i_14_ = 0;
	    int i_15_ = 0;
	    int i_16_ = 0;
	    for (int i_17_ = 0;
		 i_17_ < Class652_Sub2.aClass454_Sub1Array10916.length;
		 i_17_++) {
		if (Class652_Sub2.aClass454_Sub1Array10916[i_17_] != null
		    && Class652_Sub2.aClass454_Sub1Array10916[i_17_]
			   .method16009(1017368883)) {
		    i_14_ += Class652_Sub2.aClass454_Sub1Array10916[i_17_]
				 .method16007(-119986763);
		    i_15_ += Class652_Sub2.aClass454_Sub1Array10916[i_17_]
				 .method16005(488323665);
		    i_16_ += Class652_Sub2.aClass454_Sub1Array10916[i_17_]
				 .method16006(-925969520);
		}
	    }
	    long l_18_ = i_14_ == 0 ? 0L : (long) i_16_ * 100L / (long) i_14_;
	    long l_19_
		= i_14_ == 0 ? 0L : (long) i_15_ * 10000L / (long) i_14_;
	    String string_20_
		= new StringBuilder().append("Cache:").append
		      (Class96.method1817(l_19_, 2, true,
					  Class666.aClass666_8562, 24503836))
		      .append
		      ("% (").append
		      (l_18_).append
		      ("%)").toString();
	    Class222.aClass175_2338.method2852(string_20_, i_5_, i_6_, -256,
					       -1, 1966045491);
	    i_6_ += 12;
	}
    }
    
    static void method8872(int[] is, LinkedList linkedlist, int i, int i_21_,
			   float f, int i_22_) {
	if (!linkedlist.isEmpty()) {
	    for (int i_23_ = 0; i_23_ < linkedlist.size(); i_23_++) {
		Class587 class587 = (Class587) linkedlist.get(i_23_);
		int i_24_
		    = ((int) ((float) (class587.anInt7776 * -412107861) * f)
		       + i);
		int i_25_ = i_21_ + (int) (f * (float) (1674353225
							* class587.anInt7775));
		int i_26_
		    = (int) (f * (float) (class587.anInt7774 * 713753825));
		int i_27_
		    = (int) (f * (float) (-1388478751 * class587.anInt7772));
		if (i_24_ < Class583.anInt7720 * 873750109
		    && i_25_ < 57354327 * Class451.anInt4934) {
		    if (i_26_ + i_24_ > 873750109 * Class583.anInt7720)
			i_26_ = Class583.anInt7720 * 873750109 - i_24_;
		    if (i_25_ + i_27_ > 57354327 * Class451.anInt4934)
			i_27_ = Class451.anInt4934 * 57354327 - i_25_;
		    for (int i_28_ = i_25_; i_28_ < i_27_ + i_25_; i_28_++) {
			int i_29_
			    = 873750109 * Class583.anInt7720 * i_28_ + i_24_;
			Arrays.fill(is, i_29_, i_29_ + i_26_, -16777216);
		    }
		}
	    }
	}
    }
    
    static final void method8873(Class683 class683, int i) {
	int i_30_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class182_Sub2.aClass228_9503.method4275(i_30_, -57845101)
		  .method4164((byte) 2) ? 1 : 0;
    }
    
    public static Class525_Sub16_Sub9 method8874
	(int i, Class264 class264, RSBuffer class525_sub38, byte i_31_) {
	if (Class264.aClass264_2802 == class264)
	    return new Class525_Sub16_Sub9_Sub2(i, class525_sub38);
	if (class264 == Class264.aClass264_2803)
	    return new Class525_Sub16_Sub9_Sub1(i, class525_sub38);
	return null;
    }
}
