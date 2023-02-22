/* Class691 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;

public class Class691
{
    boolean aBool8743 = false;
    int anInt8744;
    int anInt8745;
    int anInt8746;
    Class525_Sub16_Sub18 aClass525_Sub16_Sub18_8747;
    Class525_Sub16_Sub18 aClass525_Sub16_Sub18_8748;
    
    final boolean method14102(Class40_Sub8 class40_sub8, AnimationDefinition class194,
			      int i, int i_0_, int[] is, int i_1_) {
	if (!aBool8743) {
	    if (i >= is.length)
		return false;
	    anInt8744 = 160236983 * is[i];
	    aClass525_Sub16_Sub18_8748
		= class40_sub8.method17433(1740761095 * anInt8744 >> 16,
					   -1713923430);
	    anInt8744 = 160236983 * (1740761095 * anInt8744 & 0xffff);
	    if (aClass525_Sub16_Sub18_8748 != null) {
		if (class194.tweened && -1 != i_0_ && i_0_ < is.length) {
		    anInt8745 = is[i_0_] * 176818195;
		    aClass525_Sub16_Sub18_8747
			= class40_sub8.method17433((anInt8745 * -1589968357
						    >> 16),
						   -2087310351);
		    anInt8745 = 176818195 * (-1589968357 * anInt8745 & 0xffff);
		}
		if (class194.aBool2169)
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x200);
		if (aClass525_Sub16_Sub18_8748
			.method18481(1740761095 * anInt8744, -690607528))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x80);
		if (aClass525_Sub16_Sub18_8748
			.method18488(1740761095 * anInt8744, -998482580))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x100);
		if (aClass525_Sub16_Sub18_8748
			.method18482(1740761095 * anInt8744, (byte) 69))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x400);
		if (aClass525_Sub16_Sub18_8747 != null) {
		    if (aClass525_Sub16_Sub18_8747
			    .method18481(anInt8745 * -1589968357, 1696019290))
			anInt8746
			    = -896260235 * (anInt8746 * -1721487139 | 0x80);
		    if (aClass525_Sub16_Sub18_8747
			    .method18488(-1589968357 * anInt8745, -852321242))
			anInt8746
			    = (-1721487139 * anInt8746 | 0x100) * -896260235;
		    if (aClass525_Sub16_Sub18_8747
			    .method18482(-1589968357 * anInt8745, (byte) 103))
			anInt8746
			    = -896260235 * (-1721487139 * anInt8746 | 0x400);
		}
		anInt8746 = -896260235 * (anInt8746 * -1721487139 | 0x20);
		aBool8743 = true;
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    final boolean method14103(Class40_Sub8 class40_sub8, AnimationDefinition class194,
			      int i, int i_2_, int[] is) {
	if (!aBool8743) {
	    if (i >= is.length)
		return false;
	    anInt8744 = 160236983 * is[i];
	    aClass525_Sub16_Sub18_8748
		= class40_sub8.method17433(1740761095 * anInt8744 >> 16,
					   -2037699506);
	    anInt8744 = 160236983 * (1740761095 * anInt8744 & 0xffff);
	    if (aClass525_Sub16_Sub18_8748 != null) {
		if (class194.tweened && -1 != i_2_ && i_2_ < is.length) {
		    anInt8745 = is[i_2_] * 176818195;
		    aClass525_Sub16_Sub18_8747
			= class40_sub8.method17433((anInt8745 * -1589968357
						    >> 16),
						   -1853049501);
		    anInt8745 = 176818195 * (-1589968357 * anInt8745 & 0xffff);
		}
		if (class194.aBool2169)
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x200);
		if (aClass525_Sub16_Sub18_8748
			.method18481(1740761095 * anInt8744, 49006177))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x80);
		if (aClass525_Sub16_Sub18_8748
			.method18488(1740761095 * anInt8744, -542366290))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x100);
		if (aClass525_Sub16_Sub18_8748
			.method18482(1740761095 * anInt8744, (byte) 99))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x400);
		if (aClass525_Sub16_Sub18_8747 != null) {
		    if (aClass525_Sub16_Sub18_8747
			    .method18481(anInt8745 * -1589968357, 2013502665))
			anInt8746
			    = -896260235 * (anInt8746 * -1721487139 | 0x80);
		    if (aClass525_Sub16_Sub18_8747
			    .method18488(-1589968357 * anInt8745, -589607875))
			anInt8746
			    = (-1721487139 * anInt8746 | 0x100) * -896260235;
		    if (aClass525_Sub16_Sub18_8747
			    .method18482(-1589968357 * anInt8745, (byte) 107))
			anInt8746
			    = -896260235 * (-1721487139 * anInt8746 | 0x400);
		}
		anInt8746 = -896260235 * (anInt8746 * -1721487139 | 0x20);
		aBool8743 = true;
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    final void method14104(byte i) {
	aBool8743 = false;
	anInt8746 = 0;
	aClass525_Sub16_Sub18_8747 = null;
	aClass525_Sub16_Sub18_8748 = null;
    }
    
    final boolean method14105(Class40_Sub8 class40_sub8, AnimationDefinition class194,
			      int i, int i_3_, int[] is) {
	if (!aBool8743) {
	    if (i >= is.length)
		return false;
	    anInt8744 = 160236983 * is[i];
	    aClass525_Sub16_Sub18_8748
		= class40_sub8.method17433(1740761095 * anInt8744 >> 16,
					   -1812249501);
	    anInt8744 = 160236983 * (1740761095 * anInt8744 & 0xffff);
	    if (aClass525_Sub16_Sub18_8748 != null) {
		if (class194.tweened && -1 != i_3_ && i_3_ < is.length) {
		    anInt8745 = is[i_3_] * 176818195;
		    aClass525_Sub16_Sub18_8747
			= class40_sub8.method17433((anInt8745 * -1589968357
						    >> 16),
						   -1818318426);
		    anInt8745 = 176818195 * (-1589968357 * anInt8745 & 0xffff);
		}
		if (class194.aBool2169)
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x200);
		if (aClass525_Sub16_Sub18_8748
			.method18481(1740761095 * anInt8744, 834565557))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x80);
		if (aClass525_Sub16_Sub18_8748
			.method18488(1740761095 * anInt8744, -1810076155))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x100);
		if (aClass525_Sub16_Sub18_8748
			.method18482(1740761095 * anInt8744, (byte) 25))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x400);
		if (aClass525_Sub16_Sub18_8747 != null) {
		    if (aClass525_Sub16_Sub18_8747
			    .method18481(anInt8745 * -1589968357, 487546785))
			anInt8746
			    = -896260235 * (anInt8746 * -1721487139 | 0x80);
		    if (aClass525_Sub16_Sub18_8747
			    .method18488(-1589968357 * anInt8745, -1848668209))
			anInt8746
			    = (-1721487139 * anInt8746 | 0x100) * -896260235;
		    if (aClass525_Sub16_Sub18_8747
			    .method18482(-1589968357 * anInt8745, (byte) 68))
			anInt8746
			    = -896260235 * (-1721487139 * anInt8746 | 0x400);
		}
		anInt8746 = -896260235 * (anInt8746 * -1721487139 | 0x20);
		aBool8743 = true;
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    final boolean method14106(Class40_Sub8 class40_sub8, AnimationDefinition class194,
			      int i, int i_4_, int[] is) {
	if (!aBool8743) {
	    if (i >= is.length)
		return false;
	    anInt8744 = 160236983 * is[i];
	    aClass525_Sub16_Sub18_8748
		= class40_sub8.method17433(1740761095 * anInt8744 >> 16,
					   -2075020771);
	    anInt8744 = 160236983 * (1740761095 * anInt8744 & 0xffff);
	    if (aClass525_Sub16_Sub18_8748 != null) {
		if (class194.tweened && -1 != i_4_ && i_4_ < is.length) {
		    anInt8745 = is[i_4_] * 176818195;
		    aClass525_Sub16_Sub18_8747
			= class40_sub8.method17433((anInt8745 * -1589968357
						    >> 16),
						   -1868077749);
		    anInt8745 = 176818195 * (-1589968357 * anInt8745 & 0xffff);
		}
		if (class194.aBool2169)
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x200);
		if (aClass525_Sub16_Sub18_8748
			.method18481(1740761095 * anInt8744, 352371183))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x80);
		if (aClass525_Sub16_Sub18_8748
			.method18488(1740761095 * anInt8744, -2027483652))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x100);
		if (aClass525_Sub16_Sub18_8748
			.method18482(1740761095 * anInt8744, (byte) 76))
		    anInt8746 = -896260235 * (-1721487139 * anInt8746 | 0x400);
		if (aClass525_Sub16_Sub18_8747 != null) {
		    if (aClass525_Sub16_Sub18_8747
			    .method18481(anInt8745 * -1589968357, 1289713605))
			anInt8746
			    = -896260235 * (anInt8746 * -1721487139 | 0x80);
		    if (aClass525_Sub16_Sub18_8747
			    .method18488(-1589968357 * anInt8745, -1361162620))
			anInt8746
			    = (-1721487139 * anInt8746 | 0x100) * -896260235;
		    if (aClass525_Sub16_Sub18_8747
			    .method18482(-1589968357 * anInt8745, (byte) 120))
			anInt8746
			    = -896260235 * (-1721487139 * anInt8746 | 0x400);
		}
		anInt8746 = -896260235 * (anInt8746 * -1721487139 | 0x20);
		aBool8743 = true;
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    Class691() {
	/* empty */
    }
    
    final void method14107() {
	aBool8743 = false;
	anInt8746 = 0;
	aClass525_Sub16_Sub18_8747 = null;
	aClass525_Sub16_Sub18_8748 = null;
    }
    
    final void method14108() {
	aBool8743 = false;
	anInt8746 = 0;
	aClass525_Sub16_Sub18_8747 = null;
	aClass525_Sub16_Sub18_8748 = null;
    }
    
    static final void method14109(Class683 class683, byte i) {
	Class600 class600 = new Class600();
	class600.method9871((Class525_Sub28) (class683.anObjectArray8636
					      [(class683.anInt8644
						-= 1285561025) * 1373599041]),
			    -1491361156);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class600.method9872((byte) 1);
    }
    
    public static final void method14110(int i) {
	if (-1 != -1693615781 * client.anInt11189
	    && client.anInt11191 * 1110984061 != -1) {
	    int i_5_ = ((((-414627725 * client.anInt11142
			   - 667255273 * client.anInt11194)
			  * (1540078747 * client.anInt11193))
			 >> 16)
			+ 667255273 * client.anInt11194);
	    client.anInt11193 += -1290286701 * i_5_;
	    if (1540078747 * client.anInt11193 >= 65535) {
		client.anInt11193 = 377173613;
		if (!client.aBool11177)
		    client.aBool11196 = true;
		else
		    client.aBool11196 = false;
		client.aBool11177 = true;
	    } else {
		client.aBool11196 = false;
		client.aBool11177 = false;
	    }
	    float f = (float) (1540078747 * client.anInt11193) / 65535.0F;
	    float[] fs = new float[3];
	    int i_6_ = 1988640714 * client.anInt11184;
	    for (int i_7_ = 0; i_7_ < 3; i_7_++) {
		int i_8_ = 3 * (client.anIntArrayArrayArray11188
				[-1693615781 * client.anInt11189][i_6_][i_7_]);
		int i_9_ = ((client.anIntArrayArrayArray11188
			     [client.anInt11189 * -1693615781][1 + i_6_][i_7_])
			    * 3);
		int i_10_
		    = (((client.anIntArrayArrayArray11188
			 [client.anInt11189 * -1693615781][2 + i_6_][i_7_])
			- ((client.anIntArrayArrayArray11188
			    [-1693615781 * client.anInt11189][i_6_ + 3][i_7_])
			   - (client.anIntArrayArrayArray11188
			      [client.anInt11189 * -1693615781][i_6_ + 2]
			      [i_7_])))
		       * 3);
		int i_11_ = (client.anIntArrayArrayArray11188
			     [client.anInt11189 * -1693615781][i_6_][i_7_]);
		int i_12_ = i_9_ - i_8_;
		int i_13_ = i_8_ - 2 * i_9_ + i_10_;
		int i_14_
		    = ((client.anIntArrayArrayArray11188
			[client.anInt11189 * -1693615781][2 + i_6_][i_7_])
		       - i_11_ + i_9_ - i_10_);
		fs[i_7_] = (float) i_11_ + f * ((float) i_12_
						+ f * (f * (float) i_14_
						       + (float) i_13_));
	    }
	    Class600 class600 = client.aClass507_11137.method8350(1044609551);
	    Class477.anInt5200
		= 54795941 * ((int) fs[0] - -1159839232 * class600.anInt7858);
	    Class575.anInt7648 = (int) fs[1] * 1332233853;
	    Class475.anInt5179
		= ((int) fs[2] - class600.anInt7860 * 1633099264) * 662343119;
	    float[] fs_15_ = new float[3];
	    int i_16_ = client.anInt11192 * 1470747702;
	    for (int i_17_ = 0; i_17_ < 3; i_17_++) {
		int i_18_ = ((client.anIntArrayArrayArray11188
			      [client.anInt11191 * 1110984061][i_16_][i_17_])
			     * 3);
		int i_19_
		    = 3 * (client.anIntArrayArrayArray11188
			   [1110984061 * client.anInt11191][1 + i_16_][i_17_]);
		int i_20_
		    = (((client.anIntArrayArrayArray11188
			 [1110984061 * client.anInt11191][i_16_ + 2][i_17_])
			- ((client.anIntArrayArrayArray11188
			    [1110984061 * client.anInt11191][i_16_ + 3][i_17_])
			   - (client.anIntArrayArrayArray11188
			      [1110984061 * client.anInt11191][2 + i_16_]
			      [i_17_])))
		       * 3);
		int i_21_ = (client.anIntArrayArrayArray11188
			     [client.anInt11191 * 1110984061][i_16_][i_17_]);
		int i_22_ = i_19_ - i_18_;
		int i_23_ = i_18_ - 2 * i_19_ + i_20_;
		int i_24_ = i_19_ + ((client.anIntArrayArrayArray11188
				      [client.anInt11191 * 1110984061]
				      [i_16_ + 2][i_17_])
				     - i_21_) - i_20_;
		fs_15_[i_17_] = f * (((float) i_23_ + f * (float) i_24_) * f
				     + (float) i_22_) + (float) i_21_;
	    }
	    float f_25_ = fs_15_[0] - fs[0];
	    float f_26_ = (fs_15_[1] - fs[1]) * -1.0F;
	    float f_27_ = fs_15_[2] - fs[2];
	    double d = Math.sqrt((double) (f_27_ * f_27_ + f_25_ * f_25_));
	    Class689_Sub1.anInt11019
		= ((int) (Math.atan2((double) f_26_, d) * 2607.5945876176133)
		   & 0x3fff) * 784259773;
	    Class64.anInt695
		= ((int) (-Math.atan2((double) f_25_, (double) f_27_)
			  * 2607.5945876176133)
		   & 0x3fff) * -1054956469;
	    ItemDefinitions.anInt137
		= (((1540078747 * client.anInt11193
		     * ((client.anIntArrayArrayArray11188
			 [client.anInt11189 * -1693615781][i_6_ + 2][3])
			- (client.anIntArrayArrayArray11188
			   [-1693615781 * client.anInt11189][i_6_][3])))
		    >> 16)
		   + (client.anIntArrayArrayArray11188
		      [client.anInt11189 * -1693615781][i_6_][3])) * 786225157;
	}
    }
    
    public static int method14111(String string, boolean bool, int i) {
	string = string.toLowerCase();
	Class508.anIntArray5659 = null;
	Class666.anInt8572 = 0;
	LinkedList linkedlist = new LinkedList();
	LinkedList linkedlist_28_ = new LinkedList();
	for (int i_29_ = 0;
	     i_29_ < Class313_Sub2.aClass40_Sub22_10106.anInt332 * -1988422751;
	     i_29_++) {
	    ItemDefinitions class8 = (ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
					 .method76(i_29_, -982284805);
	    if ((!bool || class8.aBool123)
		&& -1095552769 * class8.anInt77 == -1
		&& class8.anInt98 * 2020962253 == -1
		&& 1860754759 * class8.anInt131 == -1
		&& 0 == -1139124461 * class8.anInt126
		&& class8.aString66.toLowerCase().indexOf(string) != -1) {
		if (linkedlist.size() >= 250)
		    return -1;
		linkedlist.add(Integer.valueOf(i_29_));
		linkedlist_28_.add(class8.aString66);
	    }
	}
	Class508.anIntArray5659 = new int[linkedlist.size()];
	int i_30_ = 0;
	Iterator iterator = linkedlist.iterator();
	while (iterator.hasNext()) {
	    Integer integer = (Integer) iterator.next();
	    Class508.anIntArray5659[i_30_++] = integer.intValue();
	}
	String[] strings
	    = ((String[])
	       linkedlist_28_
		   .toArray(new String[Class508.anIntArray5659.length]));
	Class610.method10025(strings, Class508.anIntArray5659, (byte) 34);
	return linkedlist.size();
    }
    
    static void method14112(Class525_Sub16_Sub16 class525_sub16_sub16, int i) {
	if (!Class61.aBool670) {
	    class525_sub16_sub16.method8755(-1933461091);
	    Class61.anInt658 -= 963673869;
	    if (!class525_sub16_sub16.aBool11867) {
		long l
		    = -4663703702830765539L * class525_sub16_sub16.aLong11866;
		Class525_Sub16_Sub7 class525_sub16_sub7;
		for (class525_sub16_sub7 = ((Class525_Sub16_Sub7)
					    Class61.aClass10_661.method684(l));
		     (class525_sub16_sub7 != null
		      && !class525_sub16_sub7.aString11779
			      .equals(class525_sub16_sub16.aString11868));
		     class525_sub16_sub7
			 = ((Class525_Sub16_Sub7)
			    Class61.aClass10_661.method696(-2057538770))) {
		    /* empty */
		}
		if (class525_sub16_sub7 != null
		    && class525_sub16_sub7.method18291(class525_sub16_sub16,
						       (byte) 66))
		    Class176.method2911(class525_sub16_sub7, (byte) 0);
	    } else {
		for (Class525_Sub16_Sub7 class525_sub16_sub7
			 = ((Class525_Sub16_Sub7)
			    Class61.aClass697_656.method14186((byte) -56));
		     class525_sub16_sub7 != null;
		     class525_sub16_sub7
			 = ((Class525_Sub16_Sub7)
			    Class61.aClass697_656.method14201((byte) -1))) {
		    if (class525_sub16_sub7.aString11779
			    .equals(class525_sub16_sub16.aString11868)) {
			boolean bool = false;
			for (Class525_Sub16_Sub16 class525_sub16_sub16_31_
				 = ((Class525_Sub16_Sub16)
				    class525_sub16_sub7.aClass697_11778
					.method14186((byte) -49));
			     class525_sub16_sub16_31_ != null;
			     class525_sub16_sub16_31_
				 = ((Class525_Sub16_Sub16)
				    class525_sub16_sub7.aClass697_11778
					.method14201((byte) -1))) {
			    if (class525_sub16_sub16
				== class525_sub16_sub16_31_) {
				if (class525_sub16_sub7.method18291
				    (class525_sub16_sub16, (byte) 12))
				    Class176.method2911(class525_sub16_sub7,
							(byte) 0);
				bool = true;
				break;
			    }
			}
			if (bool)
			    break;
		    }
		}
	    }
	}
    }
}
