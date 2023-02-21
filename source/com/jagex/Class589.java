/* Class589 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import com.jagex.twitchtv.TwitchTV;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamFrameData;

public class Class589
{
    static long aLong7777;
    static final int anInt7778 = 0;
    static final int anInt7779 = 1;
    static final int anInt7780 = 1;
    static boolean aBool7781;
    static int anInt7782;
    static int anInt7783;
    static final int anInt7784 = 2;
    static float aFloat7785;
    static int anInt7786;
    static boolean aBool7787 = false;
    static int anInt7788;
    static final int anInt7789 = 3;
    static final int anInt7790 = 2;
    static int anInt7791;
    static boolean[] aBoolArray7792;
    static String[] aStringArray7793;
    static boolean aBool7794;
    static long aLong7795;
    static long aLong7796;
    static final int anInt7797 = 0;
    static LinkedList aLinkedList7798;
    static boolean aBool7799;
    static boolean aBool7800;
    static TwitchWebcamFrameData aTwitchWebcamFrameData7801;
    static LinkedList aLinkedList7802;
    static TwitchWebcamDevice[] aTwitchWebcamDeviceArray7803;
    static int anInt7804;
    static int anInt7805;
    static long aLong7806;
    static Class157 aClass157_7807;
    static int anInt7808;
    static boolean aBool7809;
    static final int anInt7810 = 2000;
    
    public static boolean method9697() {
	return (null != Class285.aTwitchTV3143
		&& Class285.aTwitchTV3143.IsStreaming());
    }
    
    public static void method9698(Class182 class182, long l) {
	if (3 != anInt7805 * -345055283 && anInt7805 * -345055283 != 0) {
	    if (-345055283 * anInt7805 == 1) {
		if (null == aStringArray7793 || 0 == aStringArray7793.length)
		    throw new RuntimeException("");
		int i = 0;
		for (int i_0_ = 0; i_0_ < aStringArray7793.length; i_0_++) {
		    if (aStringArray7793[i_0_] != null) {
			try {
			    i += (Class312_Sub1.aClass544_10064.method8917
				  (aStringArray7793[i_0_], false, (byte) 0));
			} catch (Exception_Sub1 exception_sub1) {
			    Class223.method4243(Class30.aClass30_297,
						exception_sub1.aString11417,
						(2007005951
						 * exception_sub1.anInt11416),
						exception_sub1.getCause(),
						(byte) -29);
			    anInt7805 = -632066289;
			    return;
			}
		    } else
			i += 100;
		}
		anInt7791 = 1551679279 * (i / aStringArray7793.length);
		if (100 == anInt7791 * 1271064527) {
		    anInt7805 = Class567.method9487(-333086686) * -210688763;
		    if (anInt7805 * -345055283 != 2)
			return;
		} else
		    return;
	    }
	    TwitchEvent[] twitchevents = Class285.aTwitchTV3143.Service();
	    if (twitchevents != null) {
		for (int i = 0; i < twitchevents.length; i++) {
		    TwitchEvent twitchevent = twitchevents[i];
		    if (twitchevent != null
			&& Class566.method9473(twitchevent, l)) {
			Class591 class591 = twitchevent.method6641();
			if (class591 != null)
			    Class50.method1128(class591.method80(),
					       twitchevent, (byte) -3);
		    }
		}
	    }
	    if (Class285.aTwitchTV3143.IsStreaming()
		&& (l - aLong7795 * -1322422399891014571L
		    > Class292.aLong3230 * -7026509616776223987L)) {
		aLong7795 = l * -7476698233485713155L;
		if (class182.method3324())
		    aBool7799 = true;
	    }
	    if (Class285.aTwitchTV3143.IsStreaming()) {
		if (l - aLong7796 * 9124786155275275783L
		    < (long) (-1566646745 * anInt7808))
		    anInt7783 = 1713817950;
		else if (l - 8911274349804159757L * aLong7777
			 < (long) (-1566646745 * anInt7808))
		    anInt7783 = -1290574673;
		else
		    anInt7783 = 0;
	    } else
		anInt7783 = 0;
	    if (l - aLong7806 * 1439562247878886855L > (long) (anInt7782
							       * 21115241)
		&& Class285.aTwitchTV3143.GetWebcamState() == 5) {
		Class285.aTwitchTV3143.RestartWebcamDevice();
		aLong7806 = l * -1688966701639013385L;
	    }
	}
    }
    
    public static boolean method9699() {
	if (Class512.aString5685.startsWith("win"))
	    return true;
	return false;
    }
    
    public static void method9700() {
	aClass157_7807 = null;
    }
    
    public static void method9701() {
	anInt7804 = -1007231145;
    }
    
    public static int method9702() {
	if (null == Class320.aTwitchEventLiveStreams3534
	    || (-1605532775 * anInt7804
		>= Class320.aTwitchEventLiveStreams3534.streamCount - 1))
	    return -1;
	return (anInt7804 += 1007231145) * -1605532775;
    }
    
    public static int method9703() {
	if (null == Class320.aTwitchEventLiveStreams3534
	    || (-1605532775 * anInt7804
		>= Class320.aTwitchEventLiveStreams3534.streamCount - 1))
	    return -1;
	return (anInt7804 += 1007231145) * -1605532775;
    }
    
    public static int method9704() {
	if (null == Class320.aTwitchEventLiveStreams3534
	    || (-1605532775 * anInt7804
		>= Class320.aTwitchEventLiveStreams3534.streamCount - 1))
	    return -1;
	return (anInt7804 += 1007231145) * -1605532775;
    }
    
    public static void method9705(boolean bool) {
	/* empty */
    }
    
    public static boolean method9706() {
	return aBool7799;
    }
    
    public static void method9707(boolean bool) {
	/* empty */
    }
    
    public static void method9708(boolean bool) {
	/* empty */
    }
    
    public static void method9709(boolean bool) {
	/* empty */
    }
    
    public static int method9710(Class182 class182) {
	Class517.method8636((byte) -93);
	return Class285.aTwitchTV3143.StopStreaming();
    }
    
    public static void method9711() {
	anInt7804 = -1007231145;
    }
    
    public static int method9712() {
	return anInt7805 * -345055283;
    }
    
    public static int method9713() {
	if (3 == anInt7805 * -345055283)
	    return -1;
	if (anInt7805 * -345055283 != 0)
	    return anInt7791 * 1271064527;
	if (null == aStringArray7793) {
	    if (Class512.aString5685.startsWith("mac ")) {
		if (Class512.aString5687.startsWith("ppc")) {
		    anInt7805 = -632066289;
		    return -1;
		}
		aStringArray7793 = new String[3];
		aStringArray7793[0] = "sdk-mac-dynamic";
		aStringArray7793[1] = "twitchsdk";
		aStringArray7793[2] = "twitchtv";
		aBoolArray7792 = new boolean[3];
		aBoolArray7792[0] = false;
		aBoolArray7792[1] = false;
		aBoolArray7792[2] = true;
	    } else if (Class512.aString5685.startsWith("win")) {
		aStringArray7793 = new String[6];
		aStringArray7793[0] = "avutil-ttv-51";
		aStringArray7793[1] = "libmp3lame-ttv";
		aStringArray7793[2] = "swresample-ttv-0";
		aStringArray7793[5] = "twitchtv";
		if (Class512.aString5687.startsWith("amd64")
		    || Class512.aString5687.startsWith("x86_64")) {
		    aStringArray7793[3] = "libmfxsw64";
		    aStringArray7793[4] = "twitchsdk_64_release";
		} else if (Class512.aString5687.startsWith("i386")
			   || Class512.aString5687.startsWith("i486")
			   || Class512.aString5687.startsWith("i586")
			   || Class512.aString5687.startsWith("x86")) {
		    aStringArray7793[3] = "libmfxsw32";
		    aStringArray7793[4] = "twitchsdk_32_release";
		} else {
		    anInt7805 = -632066289;
		    return -1;
		}
		aBoolArray7792 = new boolean[6];
		aBoolArray7792[0] = true;
		aBoolArray7792[1] = true;
		aBoolArray7792[2] = true;
		aBoolArray7792[3] = false;
		aBoolArray7792[4] = true;
		aBoolArray7792[5] = true;
	    } else {
		anInt7805 = -632066289;
		return -1;
	    }
	}
	anInt7805 = -210688763;
	return 0;
    }
    
    static int method9714() {
	try {
	    for (int i = 0; i < aStringArray7793.length; i++) {
		if (null != aStringArray7793[i] && aBoolArray7792[i])
		    Class525_Sub7_Sub13.method18248(-691734241)
			.method385(aStringArray7793[i], -1883819320);
	    }
	} catch (Exception_Sub2 exception_sub2) {
	    return 3;
	}
	Class285.aTwitchTV3143 = new TwitchTV();
	int i = Class285.aTwitchTV3143
		    .InitialiseTTV(Class324.method5735((byte) 91));
	if (0 == i)
	    aBool7794 = true;
	else
	    Class525_Sub16_Sub13.method18448(new StringBuilder().append(10)
						 .append
						 (Class55.aString560).append
						 (i).toString(),
					     new RuntimeException(),
					     (byte) 58);
	return 2;
    }
    
    static int method9715() {
	try {
	    for (int i = 0; i < aStringArray7793.length; i++) {
		if (null != aStringArray7793[i] && aBoolArray7792[i])
		    Class525_Sub7_Sub13.method18248(-691734241)
			.method385(aStringArray7793[i], -1849931782);
	    }
	} catch (Exception_Sub2 exception_sub2) {
	    return 3;
	}
	Class285.aTwitchTV3143 = new TwitchTV();
	int i = Class285.aTwitchTV3143
		    .InitialiseTTV(Class324.method5735((byte) -2));
	if (0 == i)
	    aBool7794 = true;
	else
	    Class525_Sub16_Sub13.method18448(new StringBuilder().append(10)
						 .append
						 (Class55.aString560).append
						 (i).toString(),
					     new RuntimeException(),
					     (byte) 67);
	return 2;
    }
    
    public static void method9716(Class182 class182, long l) {
	class182.method3178();
	aLinkedList7802.clear();
	aLinkedList7798.clear();
	aLong7795
	    = ((long) (anInt7788 * -784803871) + l) * -7476698233485713155L;
    }
    
    public static int method9717(String string, String string_1_) {
	if (!aBool7794)
	    return 12;
	if (Class111.method1979(-1672264594) != client.aClass96_11085)
	    return 42;
	return Class285.aTwitchTV3143.Login(string, string_1_);
    }
    
    public static int method9718() {
	return anInt7805 * -345055283;
    }
    
    public static int method9719(String string, String string_2_) {
	if (!aBool7794)
	    return 12;
	if (Class111.method1979(672148309) != client.aClass96_11085)
	    return 42;
	return Class285.aTwitchTV3143.Login(string, string_2_);
    }
    
    public static int method9720() {
	return Class285.aTwitchTV3143.GetLoginState();
    }
    
    public static int method9721() {
	return Class285.aTwitchTV3143.GetLoginState();
    }
    
    public static int method9722() {
	return Class285.aTwitchTV3143.GetStreamState();
    }
    
    public static int method9723() {
	return Class285.aTwitchTV3143.GetStreamState();
    }
    
    public static int method9724(int i, int i_3_, int i_4_, boolean bool) {
	if (0 != i && (i < 50 || i > 100))
	    i = 0;
	if (i_3_ != 0 && (i_3_ < 50 || i_3_ > 100))
	    i_3_ = 0;
	boolean bool_5_ = Class512.aString5685.startsWith("mac");
	int[] is = (Class285.aTwitchTV3143.GetRecommendedSettings
		    (Class434.anInt4827 * -1445589163,
		     -1883654023 * Class696_Sub47.anInt11032, i, 2000, i_4_,
		     aFloat7785, bool_5_));
	if (0 != is[0])
	    return is[0];
	int i_6_ = is[1];
	int i_7_ = is[2];
	int i_8_ = is[3];
	int i_9_ = i_8_;
	aLong7795 = 0L;
	Class292.aLong3230
	    = (long) (1000.0F / (float) i_4_) * 4751262509504766917L;
	Class583.anInt7720 = -235706891 * i_6_;
	Class451.anInt4934 = -1446231193 * i_7_;
	if (i_3_ != 0)
	    i_8_ = i_3_ * i_8_ / 100;
	Class268.method4961(new StringBuilder().append("Stream - Input: ")
				.append
				(-1445589163 * Class434.anInt4827).append
				("x").append
				(-1883654023 * Class696_Sub47.anInt11032)
				.append
				(" (").append
				(i_9_).append
				("kbps)").append
				(" => ").append
				("Output: ").append
				(i_6_).append
				("x").append
				(i_7_).append
				(" [").append
				(0 == i ? "auto" : new StringBuilder().append
						       (i).append
						       ("%").toString())
				.append
				("] (").append
				(i_8_).append
				("kbps [").append
				(0 == i_3_ ? "auto"
				 : new StringBuilder().append(i_3_).append
				       ("%").toString())
				.append
				("])").toString(),
			    1625065208);
	return Class285.aTwitchTV3143.StartStreaming(i_6_, i_7_, i_4_, i_8_,
						     0 != i_3_, aFloat7785,
						     798874017 * anInt7786,
						     bool);
    }
    
    public static int method9725(int i, int i_10_, int i_11_, boolean bool) {
	if (0 != i && (i < 50 || i > 100))
	    i = 0;
	if (i_10_ != 0 && (i_10_ < 50 || i_10_ > 100))
	    i_10_ = 0;
	boolean bool_12_ = Class512.aString5685.startsWith("mac");
	int[] is = (Class285.aTwitchTV3143.GetRecommendedSettings
		    (Class434.anInt4827 * -1445589163,
		     -1883654023 * Class696_Sub47.anInt11032, i, 2000, i_11_,
		     aFloat7785, bool_12_));
	if (0 != is[0])
	    return is[0];
	int i_13_ = is[1];
	int i_14_ = is[2];
	int i_15_ = is[3];
	int i_16_ = i_15_;
	aLong7795 = 0L;
	Class292.aLong3230
	    = (long) (1000.0F / (float) i_11_) * 4751262509504766917L;
	Class583.anInt7720 = -235706891 * i_13_;
	Class451.anInt4934 = -1446231193 * i_14_;
	if (i_10_ != 0)
	    i_15_ = i_10_ * i_15_ / 100;
	Class268.method4961(new StringBuilder().append("Stream - Input: ")
				.append
				(-1445589163 * Class434.anInt4827).append
				("x").append
				(-1883654023 * Class696_Sub47.anInt11032)
				.append
				(" (").append
				(i_16_).append
				("kbps)").append
				(" => ").append
				("Output: ").append
				(i_13_).append
				("x").append
				(i_14_).append
				(" [").append
				(0 == i ? "auto" : new StringBuilder().append
						       (i).append
						       ("%").toString())
				.append
				("] (").append
				(i_15_).append
				("kbps [").append
				(0 == i_10_ ? "auto"
				 : new StringBuilder().append(i_10_).append
				       ("%").toString())
				.append
				("])").toString(),
			    1905277592);
	return Class285.aTwitchTV3143.StartStreaming(i_13_, i_14_, i_11_,
						     i_15_, 0 != i_10_,
						     aFloat7785,
						     798874017 * anInt7786,
						     bool);
    }
    
    public static int method9726(Class182 class182) {
	Class517.method8636((byte) -14);
	return Class285.aTwitchTV3143.StopStreaming();
    }
    
    public static void method9727(boolean bool, boolean bool_17_) {
	aBool7800 = bool;
	aBool7809 = bool_17_;
    }
    
    static void method9728() {
	aBool7799 = false;
	Class621.anIntArray8093 = null;
	Class42.anIntArray341 = null;
	aLinkedList7802.clear();
	aLinkedList7798.clear();
	Class501.aClass182_5564.method3178();
    }
    
    static void method9729() {
	aBool7799 = false;
	Class621.anIntArray8093 = null;
	Class42.anIntArray341 = null;
	aLinkedList7802.clear();
	aLinkedList7798.clear();
	Class501.aClass182_5564.method3178();
    }
    
    static void method9730() {
	aBool7799 = false;
	Class621.anIntArray8093 = null;
	Class42.anIntArray341 = null;
	aLinkedList7802.clear();
	aLinkedList7798.clear();
	Class501.aClass182_5564.method3178();
    }
    
    public static void method9731(Class182 class182, long l) {
	class182.method3178();
	aLinkedList7802.clear();
	aLinkedList7798.clear();
	aLong7795
	    = ((long) (anInt7788 * -784803871) + l) * -7476698233485713155L;
    }
    
    public static int method9732() {
	return Class285.aTwitchTV3143.GetWebcamState();
    }
    
    public static int method9733() {
	if (!Class116.method2057(-1104013179))
	    return 0;
	return -1875742129 * anInt7783;
    }
    
    public static int method9734() {
	if (!Class116.method2057(-1225151065))
	    return 0;
	return -1875742129 * anInt7783;
    }
    
    public static TwitchWebcamDevice method9735(int i) {
	if (aTwitchWebcamDeviceArray7803 == null)
	    return null;
	for (int i_18_ = 0; i_18_ < aTwitchWebcamDeviceArray7803.length;
	     i_18_++) {
	    if (-1577362963 * aTwitchWebcamDeviceArray7803[i_18_].anInt1150
		== i)
		return aTwitchWebcamDeviceArray7803[i_18_];
	}
	return null;
    }
    
    public static void method9736(boolean bool) {
	if (aBool7781 != bool) {
	    Class517.method8636((byte) -104);
	    aBool7781 = bool;
	}
    }
    
    public static int method9737(String string) {
	return Class285.aTwitchTV3143.ChatSendMessage(string);
    }
    
    public static int method9738(String string) {
	return Class285.aTwitchTV3143.ChatSendMessage(string);
    }
    
    public static boolean method9739() {
	if (Class512.aString5685.startsWith("win"))
	    return true;
	return false;
    }
    
    public static boolean method9740() {
	if (Class512.aString5685.startsWith("win"))
	    return true;
	return false;
    }
    
    static void method9741() {
	aTwitchWebcamDeviceArray7803
	    = Class285.aTwitchTV3143.GetWebcamDevices();
    }
    
    public static void method9742(boolean bool) {
	if (aBool7781 != bool) {
	    Class517.method8636((byte) -21);
	    aBool7781 = bool;
	}
    }
    
    public static boolean method9743() {
	return aBool7799;
    }
    
    public static void method9744(Class182 class182, long l) {
	if (3 != anInt7805 * -345055283 && anInt7805 * -345055283 != 0) {
	    if (-345055283 * anInt7805 == 1) {
		if (null == aStringArray7793 || 0 == aStringArray7793.length)
		    throw new RuntimeException("");
		int i = 0;
		for (int i_19_ = 0; i_19_ < aStringArray7793.length; i_19_++) {
		    if (aStringArray7793[i_19_] != null) {
			try {
			    i += (Class312_Sub1.aClass544_10064.method8917
				  (aStringArray7793[i_19_], false, (byte) 0));
			} catch (Exception_Sub1 exception_sub1) {
			    Class223.method4243(Class30.aClass30_297,
						exception_sub1.aString11417,
						(2007005951
						 * exception_sub1.anInt11416),
						exception_sub1.getCause(),
						(byte) 53);
			    anInt7805 = -632066289;
			    return;
			}
		    } else
			i += 100;
		}
		anInt7791 = 1551679279 * (i / aStringArray7793.length);
		if (100 == anInt7791 * 1271064527) {
		    anInt7805 = Class567.method9487(-333086686) * -210688763;
		    if (anInt7805 * -345055283 != 2)
			return;
		} else
		    return;
	    }
	    TwitchEvent[] twitchevents = Class285.aTwitchTV3143.Service();
	    if (twitchevents != null) {
		for (int i = 0; i < twitchevents.length; i++) {
		    TwitchEvent twitchevent = twitchevents[i];
		    if (twitchevent != null
			&& Class566.method9473(twitchevent, l)) {
			Class591 class591 = twitchevent.method6641();
			if (class591 != null)
			    Class50.method1128(class591.method80(),
					       twitchevent, (byte) 27);
		    }
		}
	    }
	    if (Class285.aTwitchTV3143.IsStreaming()
		&& (l - aLong7795 * -1322422399891014571L
		    > Class292.aLong3230 * -7026509616776223987L)) {
		aLong7795 = l * -7476698233485713155L;
		if (class182.method3324())
		    aBool7799 = true;
	    }
	    if (Class285.aTwitchTV3143.IsStreaming()) {
		if (l - aLong7796 * 9124786155275275783L
		    < (long) (-1566646745 * anInt7808))
		    anInt7783 = 1713817950;
		else if (l - 8911274349804159757L * aLong7777
			 < (long) (-1566646745 * anInt7808))
		    anInt7783 = -1290574673;
		else
		    anInt7783 = 0;
	    } else
		anInt7783 = 0;
	    if (l - aLong7806 * 1439562247878886855L > (long) (anInt7782
							       * 21115241)
		&& Class285.aTwitchTV3143.GetWebcamState() == 5) {
		Class285.aTwitchTV3143.RestartWebcamDevice();
		aLong7806 = l * -1688966701639013385L;
	    }
	}
    }
    
    public static int method9745() {
	return (null == aTwitchWebcamDeviceArray7803 ? 0
		: aTwitchWebcamDeviceArray7803.length);
    }
    
    public static int method9746() {
	Class320.aTwitchEventLiveStreams3534 = null;
	int i = Class285.aTwitchTV3143
		    .RequestLiveStreams(client.aClass668_11090.aString8583);
	return i;
    }
    
    public static void method9747(Class182 class182, long l, int i,
				  int i_20_) {
	do {
	    if (class182.method3167() && class182.method3171() > -1) {
		int i_21_ = class182.method3171();
		Class572 class572 = null;
		if (!aLinkedList7798.isEmpty())
		    class572 = (Class572) aLinkedList7798.getFirst();
		if (class572 == null
		    || i_21_ != class572.anInt7642 * 950456133) {
		    class182.method3401();
		    aLinkedList7798.clear();
		} else {
		    aLinkedList7798.removeFirst();
		    class182.method3219();
		    boolean bool = false;
		    int i_22_;
		    if (class572.aLinkedList7640.isEmpty()
			&& class182.method3169()) {
			long l_23_ = class182.method3174((Class583.anInt7720
							  * 873750109),
							 (Class451.anInt4934
							  * 57354327));
			i_22_ = (Class285.aTwitchTV3143.SubmitFrame
				 (l_23_, class182.method3170(), aBool7781, i,
				  i_20_));
			class182.method3552(l_23_);
		    } else {
			class182.method3149(873750109 * Class583.anInt7720,
					    57354327 * Class451.anInt4934,
					    Class621.anIntArray8093,
					    Class42.anIntArray341);
			Class536.method8872(Class621.anIntArray8093,
					    class572.aLinkedList7640,
					    class572.anInt7638 * 1074585717,
					    class572.anInt7639 * 2054428499,
					    class572.aFloat7641, -834221571);
			i_22_
			    = (Class285.aTwitchTV3143.SubmitFrameRaw
			       (Class621.anIntArray8093, aBool7781, i, i_20_));
		    }
		    class182.method3161();
		    if (i_22_ == 2072)
			aLong7796 = 7427304025077989303L * l;
		    else if (23 == i_22_)
			aLong7777 = -8774771765122825275L * l;
		    else if (-995 == i_22_ || 0 != i_22_)
			break;
		}
	    }
	} while (false);
	if (aBool7799) {
	    if (Class621.anIntArray8093 == null) {
		Class621.anIntArray8093
		    = new int[(aBool7781 ? i_20_ * i
			       : (873750109 * Class583.anInt7720
				  * (57354327 * Class451.anInt4934)))];
		Class42.anIntArray341
		    = new int[(aBool7781 ? i_20_ * i
			       : (Class583.anInt7720 * 873750109
				  * (Class451.anInt4934 * 57354327)))];
	    }
	    if (!class182.method3167()) {
		class182.method3219();
		class182.method3149(Class583.anInt7720 * 873750109,
				    57354327 * Class451.anInt4934,
				    Class621.anIntArray8093,
				    Class42.anIntArray341);
		Class536.method8872(Class621.anIntArray8093, aLinkedList7802,
				    1000431205 * class182.anInt1958,
				    1482704485 * class182.anInt1964,
				    class182.aFloat1968, -313907411);
		int i_24_
		    = Class285.aTwitchTV3143.SubmitFrameRaw((Class621
							     .anIntArray8093),
							    aBool7781, i,
							    i_20_);
		class182.method3161();
		aLinkedList7802.clear();
		do {
		    if (2072 == i_24_)
			aLong7796 = l * 7427304025077989303L;
		    else if (23 == i_24_)
			aLong7777 = l * -8774771765122825275L;
		    else if (-995 == i_24_ || i_24_ != 0)
			break;
		} while (false);
	    } else {
		class182.method3173(client.anInt11083,
				    873750109 * Class583.anInt7720,
				    57354327 * Class451.anInt4934);
		aLinkedList7798.add(new Class572(client.anInt11083,
						 aLinkedList7802,
						 (class182.anInt1958
						  * 1000431205),
						 (class182.anInt1964
						  * 1482704485),
						 class182.aFloat1968));
		aLinkedList7802 = new LinkedList();
	    }
	    aBool7799 = false;
	}
    }
    
    public static void method9748() {
	aClass157_7807 = null;
    }
    
    public static void method9749() {
	aClass157_7807 = null;
    }
    
    public static boolean method9750() {
	return aBool7799;
    }
    
    public static boolean method9751() {
	return aBool7799;
    }
    
    static void method9752(int i, int i_25_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_25_);
	Class591 class591 = twitcheventresult.method6641();
	if (class591 != null)
	    Class50.method1128(class591.method80(), twitcheventresult,
			       (byte) 48);
    }
    
    public static TwitchWebcamDevice method9753(int i) {
	if (aTwitchWebcamDeviceArray7803 == null)
	    return null;
	for (int i_26_ = 0; i_26_ < aTwitchWebcamDeviceArray7803.length;
	     i_26_++) {
	    if (-1577362963 * aTwitchWebcamDeviceArray7803[i_26_].anInt1150
		== i)
		return aTwitchWebcamDeviceArray7803[i_26_];
	}
	return null;
    }
    
    public static void method9754(Class182 class182, long l) {
	class182.method3178();
	aLinkedList7802.clear();
	aLinkedList7798.clear();
	aLong7795
	    = ((long) (anInt7788 * -784803871) + l) * -7476698233485713155L;
    }
    
    public static int method9755(String string) {
	return Class285.aTwitchTV3143
		   .SetStreamTitle(string, client.aClass668_11090.aString8583);
    }
    
    static boolean method9756(TwitchEvent twitchevent, long l) {
	if (!aBool7787) {
	    switch (twitchevent.eventType) {
	    case 7:
	    case 8:
	    case 9:
		return false;
	    }
	}
	if (twitchevent.eventType == 33) {
	    if (aTwitchWebcamFrameData7801 == null)
		return false;
	    int i = ((TwitchEventResult) twitchevent).result;
	    int i_27_ = Class285.aTwitchTV3143
			    .GetWebcamFrameData(i, aTwitchWebcamFrameData7801);
	    if (i_27_ == 0) {
		if (aBool7800)
		    aTwitchWebcamFrameData7801.method14461();
		if (aBool7809)
		    aTwitchWebcamFrameData7801.method14462();
		Class405.method6610((byte) 36);
		aLong7806 = l * -1688966701639013385L;
		Class328.method5795(33, 0, -416470522);
	    } else
		aClass157_7807 = null;
	    return false;
	}
	if (twitchevent.eventType == 30) {
	    int i = ((TwitchEventResult) twitchevent).result;
	    if (i == 0 || i == 1)
		Class696_Sub39.method17327(1097833643);
	    else if (i == 2)
		aLong7806 = -1688966701639013385L * l;
	}
	if (twitchevent.eventType == 34) {
	    Class320.aTwitchEventLiveStreams3534
		= (TwitchEventLiveStreams) twitchevent;
	    Class328.method5795(34, 0, 755819226);
	}
	return true;
    }
    
    static void method9757(int i, int i_28_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_28_);
	Class591 class591 = twitcheventresult.method6641();
	if (class591 != null)
	    Class50.method1128(class591.method80(), twitcheventresult,
			       (byte) -110);
    }
    
    static void method9758(int i, int i_29_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_29_);
	Class591 class591 = twitcheventresult.method6641();
	if (class591 != null)
	    Class50.method1128(class591.method80(), twitcheventresult,
			       (byte) 56);
    }
    
    public static int method9759(String string, String string_30_) {
	if (!aBool7794)
	    return 12;
	if (Class111.method1979(-1771757096) != client.aClass96_11085)
	    return 42;
	return Class285.aTwitchTV3143.Login(string, string_30_);
    }
    
    public static int method9760() {
	return Class285.aTwitchTV3143.GetWebcamState();
    }
    
    public static void method9761(boolean bool) {
	/* empty */
    }
    
    Class589() throws Throwable {
	throw new Error();
    }
    
    public static int method9762(int i, int i_31_) {
	aTwitchWebcamFrameData7801 = new TwitchWebcamFrameData();
	if (i < 0 || i >= aTwitchWebcamDeviceArray7803.length)
	    return -1;
	return (Class285.aTwitchTV3143.StartWebcamDevice
		(aTwitchWebcamDeviceArray7803[i].anInt1151 * -1510638163,
		 i_31_));
    }
    
    public static int method9763(int i, int i_32_) {
	aTwitchWebcamFrameData7801 = new TwitchWebcamFrameData();
	if (i < 0 || i >= aTwitchWebcamDeviceArray7803.length)
	    return -1;
	return (Class285.aTwitchTV3143.StartWebcamDevice
		(aTwitchWebcamDeviceArray7803[i].anInt1151 * -1510638163,
		 i_32_));
    }
    
    public static int method9764(int i) {
	aTwitchWebcamFrameData7801 = null;
	aClass157_7807 = null;
	if (i < 0 || i >= aTwitchWebcamDeviceArray7803.length)
	    return -1;
	return (Class285.aTwitchTV3143.StopWebcamDevice
		(aTwitchWebcamDeviceArray7803[i].anInt1151 * -1510638163));
    }
    
    static void method9765() {
	aTwitchWebcamDeviceArray7803
	    = Class285.aTwitchTV3143.GetWebcamDevices();
    }
    
    static void method9766() {
	aTwitchWebcamDeviceArray7803
	    = Class285.aTwitchTV3143.GetWebcamDevices();
    }
    
    public static boolean method9767() {
	if (Class512.aString5685.startsWith("win")) {
	    String string = "msvcr110.dll";
	    String string_33_ = "msvcp110.dll";
	    String[] strings = { string, string_33_ };
	    String string_34_ = System.getenv("WINDIR");
	    if (string_34_ == "")
		return false;
	    for (int i = 0; i < strings.length; i++) {
		File file
		    = new File(new StringBuilder().append(string_34_).append
				   ("\\system32\\").append
				   (strings[i]).toString());
		if (!file.exists() || file.isDirectory())
		    return false;
	    }
	    return true;
	}
	if (Class512.aString5685.startsWith("mac")) {
	    boolean bool;
	    try {
		Process process = Runtime.getRuntime().exec("ps -few");
		BufferedReader bufferedreader
		    = (new BufferedReader
		       (new InputStreamReader(process.getInputStream())));
		do {
		    boolean bool_35_;
		    try {
			int i = process.waitFor();
			if (i == 0)
			    break;
			bool_35_ = false;
		    } catch (InterruptedException interruptedexception) {
			return false;
		    }
		    return bool_35_;
		} while (false);
		boolean bool_36_ = false;
	    while_31_:
		do {
		    String string;
		    do {
			if ((string = bufferedreader.readLine()) == null)
			    break while_31_;
		    } while (string.toLowerCase().indexOf("soundflowerbed")
			     == -1);
		    bool_36_ = true;
		} while (false);
		bufferedreader.close();
		bool = bool_36_;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	return false;
    }
    
    public static int method9768() {
	return (null == aTwitchWebcamDeviceArray7803 ? 0
		: aTwitchWebcamDeviceArray7803.length);
    }
    
    public static void method9769() {
	anInt7804 = -1007231145;
    }
    
    public static int method9770() {
	return (null == aTwitchWebcamDeviceArray7803 ? 0
		: aTwitchWebcamDeviceArray7803.length);
    }
    
    public static void method9771() {
	if (aBool7794) {
	    int i = Class285.aTwitchTV3143.ShutdownTTV();
	    if (i == 0) {
		Class285.aTwitchTV3143 = null;
		aBool7794 = false;
	    }
	}
    }
    
    static void method9772(int[] is, LinkedList linkedlist, int i, int i_37_,
			   float f) {
	if (!linkedlist.isEmpty()) {
	    for (int i_38_ = 0; i_38_ < linkedlist.size(); i_38_++) {
		Class587 class587 = (Class587) linkedlist.get(i_38_);
		int i_39_
		    = ((int) ((float) (class587.anInt7776 * -412107861) * f)
		       + i);
		int i_40_ = i_37_ + (int) (f * (float) (1674353225
							* class587.anInt7775));
		int i_41_
		    = (int) (f * (float) (class587.anInt7774 * 713753825));
		int i_42_
		    = (int) (f * (float) (-1388478751 * class587.anInt7772));
		if (i_39_ < Class583.anInt7720 * 873750109
		    && i_40_ < 57354327 * Class451.anInt4934) {
		    if (i_41_ + i_39_ > 873750109 * Class583.anInt7720)
			i_41_ = Class583.anInt7720 * 873750109 - i_39_;
		    if (i_40_ + i_42_ > 57354327 * Class451.anInt4934)
			i_42_ = Class451.anInt4934 * 57354327 - i_40_;
		    for (int i_43_ = i_40_; i_43_ < i_42_ + i_40_; i_43_++) {
			int i_44_
			    = 873750109 * Class583.anInt7720 * i_43_ + i_39_;
			Arrays.fill(is, i_44_, i_44_ + i_41_, -16777216);
		    }
		}
	    }
	}
    }
    
    public static TwitchWebcamDevice method9773(String string) {
	if (aTwitchWebcamDeviceArray7803 == null)
	    return null;
	for (int i = 0; i < aTwitchWebcamDeviceArray7803.length; i++) {
	    if (aTwitchWebcamDeviceArray7803[i].aString1148.equals(string))
		return aTwitchWebcamDeviceArray7803[i];
	}
	return null;
    }
    
    public static int method9774(String string) {
	return Class285.aTwitchTV3143
		   .SetStreamTitle(string, client.aClass668_11090.aString8583);
    }
    
    public static void method9775(boolean bool, boolean bool_45_) {
	aBool7800 = bool;
	aBool7809 = bool_45_;
    }
    
    public static void method9776(boolean bool, boolean bool_46_) {
	aBool7800 = bool;
	aBool7809 = bool_46_;
    }
    
    public static void method9777(boolean bool, boolean bool_47_) {
	aBool7800 = bool;
	aBool7809 = bool_47_;
    }
    
    public static int method9778() {
	if (3 == anInt7805 * -345055283)
	    return -1;
	if (anInt7805 * -345055283 != 0)
	    return anInt7791 * 1271064527;
	if (null == aStringArray7793) {
	    if (Class512.aString5685.startsWith("mac ")) {
		if (Class512.aString5687.startsWith("ppc")) {
		    anInt7805 = -632066289;
		    return -1;
		}
		aStringArray7793 = new String[3];
		aStringArray7793[0] = "sdk-mac-dynamic";
		aStringArray7793[1] = "twitchsdk";
		aStringArray7793[2] = "twitchtv";
		aBoolArray7792 = new boolean[3];
		aBoolArray7792[0] = false;
		aBoolArray7792[1] = false;
		aBoolArray7792[2] = true;
	    } else if (Class512.aString5685.startsWith("win")) {
		aStringArray7793 = new String[6];
		aStringArray7793[0] = "avutil-ttv-51";
		aStringArray7793[1] = "libmp3lame-ttv";
		aStringArray7793[2] = "swresample-ttv-0";
		aStringArray7793[5] = "twitchtv";
		if (Class512.aString5687.startsWith("amd64")
		    || Class512.aString5687.startsWith("x86_64")) {
		    aStringArray7793[3] = "libmfxsw64";
		    aStringArray7793[4] = "twitchsdk_64_release";
		} else if (Class512.aString5687.startsWith("i386")
			   || Class512.aString5687.startsWith("i486")
			   || Class512.aString5687.startsWith("i586")
			   || Class512.aString5687.startsWith("x86")) {
		    aStringArray7793[3] = "libmfxsw32";
		    aStringArray7793[4] = "twitchsdk_32_release";
		} else {
		    anInt7805 = -632066289;
		    return -1;
		}
		aBoolArray7792 = new boolean[6];
		aBoolArray7792[0] = true;
		aBoolArray7792[1] = true;
		aBoolArray7792[2] = true;
		aBoolArray7792[3] = false;
		aBoolArray7792[4] = true;
		aBoolArray7792[5] = true;
	    } else {
		anInt7805 = -632066289;
		return -1;
	    }
	}
	anInt7805 = -210688763;
	return 0;
    }
    
    public static int method9779() {
	return Class285.aTwitchTV3143.GetViewerCount();
    }
    
    public static int method9780() {
	return Class285.aTwitchTV3143.GetViewerCount();
    }
    
    public static void method9781(int i, int i_48_, int i_49_, int i_50_) {
	aLinkedList7802.addLast(new Class587(i, i_48_, i_49_ - i,
					     i_50_ - i_48_));
    }
    
    public static void method9782(int i, int i_51_, int i_52_, int i_53_) {
	aLinkedList7802.addLast(new Class587(i, i_51_, i_52_ - i,
					     i_53_ - i_51_));
    }
    
    public static void method9783(int i, int i_54_, int i_55_, int i_56_) {
	aLinkedList7802.addLast(new Class587(i, i_54_, i_55_ - i,
					     i_56_ - i_54_));
    }
    
    static void method9784(int[] is, LinkedList linkedlist, int i, int i_57_,
			   float f) {
	if (!linkedlist.isEmpty()) {
	    for (int i_58_ = 0; i_58_ < linkedlist.size(); i_58_++) {
		Class587 class587 = (Class587) linkedlist.get(i_58_);
		int i_59_
		    = ((int) ((float) (class587.anInt7776 * -412107861) * f)
		       + i);
		int i_60_ = i_57_ + (int) (f * (float) (1674353225
							* class587.anInt7775));
		int i_61_
		    = (int) (f * (float) (class587.anInt7774 * 713753825));
		int i_62_
		    = (int) (f * (float) (-1388478751 * class587.anInt7772));
		if (i_59_ < Class583.anInt7720 * 873750109
		    && i_60_ < 57354327 * Class451.anInt4934) {
		    if (i_61_ + i_59_ > 873750109 * Class583.anInt7720)
			i_61_ = Class583.anInt7720 * 873750109 - i_59_;
		    if (i_60_ + i_62_ > 57354327 * Class451.anInt4934)
			i_62_ = Class451.anInt4934 * 57354327 - i_60_;
		    for (int i_63_ = i_60_; i_63_ < i_62_ + i_60_; i_63_++) {
			int i_64_
			    = 873750109 * Class583.anInt7720 * i_63_ + i_59_;
			Arrays.fill(is, i_64_, i_64_ + i_61_, -16777216);
		    }
		}
	    }
	}
    }
    
    public static void method9785(Class182 class182, long l) {
	if (3 != anInt7805 * -345055283 && anInt7805 * -345055283 != 0) {
	    if (-345055283 * anInt7805 == 1) {
		if (null == aStringArray7793 || 0 == aStringArray7793.length)
		    throw new RuntimeException("");
		int i = 0;
		for (int i_65_ = 0; i_65_ < aStringArray7793.length; i_65_++) {
		    if (aStringArray7793[i_65_] != null) {
			try {
			    i += (Class312_Sub1.aClass544_10064.method8917
				  (aStringArray7793[i_65_], false, (byte) 0));
			} catch (Exception_Sub1 exception_sub1) {
			    Class223.method4243(Class30.aClass30_297,
						exception_sub1.aString11417,
						(2007005951
						 * exception_sub1.anInt11416),
						exception_sub1.getCause(),
						(byte) 35);
			    anInt7805 = -632066289;
			    return;
			}
		    } else
			i += 100;
		}
		anInt7791 = 1551679279 * (i / aStringArray7793.length);
		if (100 == anInt7791 * 1271064527) {
		    anInt7805 = Class567.method9487(-333086686) * -210688763;
		    if (anInt7805 * -345055283 != 2)
			return;
		} else
		    return;
	    }
	    TwitchEvent[] twitchevents = Class285.aTwitchTV3143.Service();
	    if (twitchevents != null) {
		for (int i = 0; i < twitchevents.length; i++) {
		    TwitchEvent twitchevent = twitchevents[i];
		    if (twitchevent != null
			&& Class566.method9473(twitchevent, l)) {
			Class591 class591 = twitchevent.method6641();
			if (class591 != null)
			    Class50.method1128(class591.method80(),
					       twitchevent, (byte) 7);
		    }
		}
	    }
	    if (Class285.aTwitchTV3143.IsStreaming()
		&& (l - aLong7795 * -1322422399891014571L
		    > Class292.aLong3230 * -7026509616776223987L)) {
		aLong7795 = l * -7476698233485713155L;
		if (class182.method3324())
		    aBool7799 = true;
	    }
	    if (Class285.aTwitchTV3143.IsStreaming()) {
		if (l - aLong7796 * 9124786155275275783L
		    < (long) (-1566646745 * anInt7808))
		    anInt7783 = 1713817950;
		else if (l - 8911274349804159757L * aLong7777
			 < (long) (-1566646745 * anInt7808))
		    anInt7783 = -1290574673;
		else
		    anInt7783 = 0;
	    } else
		anInt7783 = 0;
	    if (l - aLong7806 * 1439562247878886855L > (long) (anInt7782
							       * 21115241)
		&& Class285.aTwitchTV3143.GetWebcamState() == 5) {
		Class285.aTwitchTV3143.RestartWebcamDevice();
		aLong7806 = l * -1688966701639013385L;
	    }
	}
    }
    
    static {
	aFloat7785 = 0.2F;
	anInt7786 = -1085781407;
	anInt7808 = 1268176736;
	anInt7788 = 0;
	anInt7782 = -1624113328;
	anInt7805 = 0;
	anInt7791 = 0;
	aBoolArray7792 = null;
	aStringArray7793 = null;
	aBool7794 = false;
	aLong7795 = 0L;
	aLong7796 = 0L;
	aLong7777 = 0L;
	anInt7783 = 0;
	aBool7799 = false;
	aBool7781 = false;
	aTwitchWebcamFrameData7801 = null;
	aLinkedList7802 = new LinkedList();
	aLinkedList7798 = new LinkedList();
	anInt7804 = -1007231145;
	aTwitchWebcamDeviceArray7803 = null;
	aLong7806 = 0L;
	aClass157_7807 = null;
	aBool7800 = false;
	aBool7809 = false;
    }
    
    public static boolean method9786() {
	if (Class512.aString5685.startsWith("win")) {
	    String string = "msvcr110.dll";
	    String string_66_ = "msvcp110.dll";
	    String[] strings = { string, string_66_ };
	    String string_67_ = System.getenv("WINDIR");
	    if (string_67_ == "")
		return false;
	    for (int i = 0; i < strings.length; i++) {
		File file
		    = new File(new StringBuilder().append(string_67_).append
				   ("\\system32\\").append
				   (strings[i]).toString());
		if (!file.exists() || file.isDirectory())
		    return false;
	    }
	    return true;
	}
	if (Class512.aString5685.startsWith("mac")) {
	    boolean bool;
	    try {
		Process process = Runtime.getRuntime().exec("ps -few");
		BufferedReader bufferedreader
		    = (new BufferedReader
		       (new InputStreamReader(process.getInputStream())));
		do {
		    boolean bool_68_;
		    try {
			int i = process.waitFor();
			if (i == 0)
			    break;
			bool_68_ = false;
		    } catch (InterruptedException interruptedexception) {
			return false;
		    }
		    return bool_68_;
		} while (false);
		boolean bool_69_ = false;
	    while_32_:
		do {
		    String string;
		    do {
			if ((string = bufferedreader.readLine()) == null)
			    break while_32_;
		    } while (string.toLowerCase().indexOf("soundflowerbed")
			     == -1);
		    bool_69_ = true;
		} while (false);
		bufferedreader.close();
		bool = bool_69_;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	return false;
    }
}
