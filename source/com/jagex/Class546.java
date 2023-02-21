/* Class546 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class546
{
    boolean[][] aBoolArrayArray7199;
    public int anInt7200;
    byte[][] aByteArrayArray7201;
    int anInt7202;
    int anInt7203 = 16;
    Class182 aClass182_7204;
    Class51 aClass51_7205;
    float[] aFloatArray7206;
    public Class557 aClass557_7207;
    public Class554 aClass554_7208;
    int anInt7209;
    public int anInt7210;
    public int anInt7211;
    byte[][] aByteArrayArray7212;
    boolean aBool7213;
    int anInt7214;
    public Class161[] aClass161Array7215;
    public Class547[][][] aClass547ArrayArrayArray7216;
    int[][] anIntArrayArray7217;
    boolean aBool7218;
    short[][] aShortArrayArray7219;
    public Class547[][][] aClass547ArrayArrayArray7220;
    int anInt7221;
    byte[][] aByteArrayArray7222;
    int anInt7223 = 5024;
    int anInt7224 = 0;
    int anInt7225;
    public Class161[] aClass161Array7226;
    int anInt7227 = 10089;
    Class656_Sub1[] aClass656_Sub1Array7228;
    Class656_Sub1[] aClass656_Sub1Array7229;
    Class656_Sub1[] aClass656_Sub1Array7230;
    int anInt7231;
    public static boolean aBool7232 = true;
    Class656_Sub1[] aClass656_Sub1Array7233;
    Class656_Sub1[] aClass656_Sub1Array7234;
    Class656_Sub1_Sub3[] aClass656_Sub1_Sub3Array7235;
    int[] anIntArray7236;
    int anInt7237 = 5023;
    int anInt7238;
    int anInt7239;
    int anInt7240;
    public int anInt7241;
    int anInt7242;
    int anInt7243;
    int anInt7244;
    int anInt7245;
    int anInt7246;
    int anInt7247;
    int anInt7248;
    public Class161[] aClass161Array7249;
    Class525_Sub21[] aClass525_Sub21Array7250;
    int anInt7251 = 65005;
    static final int anInt7252 = 4;
    int anInt7253;
    long[][][] aLongArrayArrayArray7254;
    Class564[] aClass564Array7255;
    boolean[] aBoolArray7256;
    HashMap aHashMap7257;
    HashMap aHashMap7258;
    byte[][] aByteArrayArray7259;
    boolean[][] aBoolArrayArray7260;
    int anInt7261;
    boolean[][] aBoolArrayArray7262;
    public Class547[][][] aClass547ArrayArrayArray7263;
    
    public Class656_Sub1_Sub5 method8935(int i, int i_0_, int i_1_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_0_][i_1_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub5_7266;
    }
    
    public void method8936(int i, int i_2_, int i_3_,
			   Class656_Sub1_Sub5 class656_sub1_sub5,
			   Class656_Sub1_Sub5 class656_sub1_sub5_4_) {
	Class547 class547 = method9088(i, i_2_, i_3_, (byte) 14);
	if (class547 != null) {
	    class547.aClass656_Sub1_Sub5_7266 = class656_sub1_sub5;
	    class547.aClass656_Sub1_Sub5_7267 = class656_sub1_sub5_4_;
	    int i_5_ = aClass161Array7226 == aClass161Array7249 ? 1 : 0;
	    if (class656_sub1_sub5.method16913(1040451145)) {
		if (class656_sub1_sub5.method16914(-1935186548)) {
		    class656_sub1_sub5.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_5_];
		    aClass656_Sub1Array7229[i_5_] = class656_sub1_sub5;
		} else {
		    class656_sub1_sub5.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_5_];
		    aClass656_Sub1Array7228[i_5_] = class656_sub1_sub5;
		}
	    } else {
		class656_sub1_sub5.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_5_];
		aClass656_Sub1Array7230[i_5_] = class656_sub1_sub5;
	    }
	    if (null != class656_sub1_sub5_4_) {
		if (class656_sub1_sub5_4_.method16913(1040451145)) {
		    if (class656_sub1_sub5_4_.method16914(-2001843019)) {
			class656_sub1_sub5_4_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7229[i_5_];
			aClass656_Sub1Array7229[i_5_] = class656_sub1_sub5_4_;
		    } else {
			class656_sub1_sub5_4_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7228[i_5_];
			aClass656_Sub1Array7228[i_5_] = class656_sub1_sub5_4_;
		    }
		} else {
		    class656_sub1_sub5_4_.aClass656_Sub1_10868
			= aClass656_Sub1Array7230[i_5_];
		    aClass656_Sub1Array7230[i_5_] = class656_sub1_sub5_4_;
		}
	    }
	}
    }
    
    public void method8937(Class175 class175, int i) {
	/* empty */
    }
    
    void method8938(Class656_Sub1[] class656_sub1s, int i, int i_6_) {
	if (i < i_6_) {
	    int i_7_ = (i_6_ + i) / 2;
	    int i_8_ = i;
	    Class656_Sub1 class656_sub1 = class656_sub1s[i_7_];
	    class656_sub1s[i_7_] = class656_sub1s[i_6_];
	    class656_sub1s[i_6_] = class656_sub1;
	    int i_9_ = 46608013 * class656_sub1.anInt10871;
	    for (int i_10_ = i; i_10_ < i_6_; i_10_++) {
		if (46608013 * class656_sub1s[i_10_].anInt10871
		    < i_9_ + (i_10_ & 0x1)) {
		    Class656_Sub1 class656_sub1_11_ = class656_sub1s[i_10_];
		    class656_sub1s[i_10_] = class656_sub1s[i_8_];
		    class656_sub1s[i_8_++] = class656_sub1_11_;
		}
	    }
	    class656_sub1s[i_6_] = class656_sub1s[i_8_];
	    class656_sub1s[i_8_] = class656_sub1;
	    method8969(class656_sub1s, i, i_8_ - 1);
	    method8969(class656_sub1s, i_8_ + 1, i_6_);
	}
    }
    
    public void method8939(int i) {
	for (int i_12_ = 0; i_12_ < 1761949661 * anInt7210; i_12_++) {
	    for (int i_13_ = 0; i_13_ < 947301287 * anInt7211; i_13_++) {
		if (aClass547ArrayArrayArray7263[0][i_12_][i_13_] == null)
		    aClass547ArrayArrayArray7263[0][i_12_][i_13_]
			= new Class547(0);
	    }
	}
    }
    
    public void method8940(int i, int i_14_, int i_15_) {
	Class547 class547 = aClass547ArrayArrayArray7263[0][i][i_14_];
	for (int i_16_ = 0; i_16_ < 3; i_16_++) {
	    Class547 class547_17_
		= (aClass547ArrayArrayArray7263[i_16_][i][i_14_]
		   = aClass547ArrayArrayArray7263[1 + i_16_][i][i_14_]);
	    if (class547_17_ != null) {
		for (Class560 class560 = class547_17_.aClass560_7272;
		     class560 != null; class560 = class560.aClass560_7546) {
		    Class656_Sub1_Sub3 class656_sub1_sub3
			= class560.aClass656_Sub1_Sub3_7547;
		    if (class656_sub1_sub3.aShort11923 == i
			&& class656_sub1_sub3.aShort11925 == i_14_)
			class656_sub1_sub3.aByte10867--;
		}
		if (class547_17_.aClass656_Sub1_Sub1_7264 != null)
		    class547_17_.aClass656_Sub1_Sub1_7264.aByte10867--;
		if (null != class547_17_.aClass656_Sub1_Sub5_7266)
		    class547_17_.aClass656_Sub1_Sub5_7266.aByte10867--;
		if (null != class547_17_.aClass656_Sub1_Sub5_7267)
		    class547_17_.aClass656_Sub1_Sub5_7267.aByte10867--;
		if (class547_17_.aClass656_Sub1_Sub4_7268 != null)
		    class547_17_.aClass656_Sub1_Sub4_7268.aByte10867--;
		if (null != class547_17_.aClass656_Sub1_Sub4_7276)
		    class547_17_.aClass656_Sub1_Sub4_7276.aByte10867--;
	    }
	}
	if (aClass547ArrayArrayArray7263[0][i][i_14_] == null) {
	    aClass547ArrayArrayArray7263[0][i][i_14_] = new Class547(0);
	    aClass547ArrayArrayArray7263[0][i][i_14_].aByte7271 = (byte) 1;
	}
	aClass547ArrayArrayArray7263[0][i][i_14_].aClass547_7269 = class547;
	aClass547ArrayArrayArray7263[3][i][i_14_] = null;
    }
    
    void method8941(Class656_Sub1_Sub3 class656_sub1_sub3, boolean bool) {
	int i = Math.min(1761949661 * anInt7210 - 1,
			 Math.max(0, class656_sub1_sub3.aShort11923));
	int i_18_ = Math.min(anInt7210 * 1761949661 - 1,
			     Math.max(0, class656_sub1_sub3.aShort11924));
	int i_19_ = Math.min(947301287 * anInt7211 - 1,
			     Math.max(0, class656_sub1_sub3.aShort11925));
	int i_20_ = Math.min(anInt7211 * 947301287 - 1,
			     Math.max(0, class656_sub1_sub3.aShort11930));
	for (int i_21_ = i; i_21_ <= i_18_; i_21_++) {
	    for (int i_22_ = i_19_; i_22_ <= i_20_; i_22_++) {
		Class547 class547
		    = (aClass547ArrayArrayArray7263
		       [class656_sub1_sub3.aByte10867][i_21_][i_22_]);
		if (null != class547) {
		    Class560 class560 = class547.aClass560_7272;
		    Class560 class560_23_ = null;
		    for (/**/; null != class560;
			 class560 = class560.aClass560_7546) {
			if (class560.aClass656_Sub1_Sub3_7547
			    == class656_sub1_sub3) {
			    if (null != class560_23_)
				class560_23_.aClass560_7546
				    = class560.aClass560_7546;
			    else
				class547.aClass560_7272
				    = class560.aClass560_7546;
			    class560.method9403(-1735533430);
			    break;
			}
			class560_23_ = class560;
		    }
		}
	    }
	}
	if (!bool)
	    method8967(class656_sub1_sub3, 508599315);
    }
    
    Class547 method8942(int i, int i_24_, int i_25_, short i_26_) {
	return method9088(i,
			  Math.min(1761949661 * anInt7210 - 1,
				   Math.max(0, i_24_)),
			  Math.min(947301287 * anInt7211 - 1,
				   Math.max(0, i_25_)),
			  (byte) 14);
    }
    
    public void method8943(Class175 class175) {
	/* empty */
    }
    
    void method8944(Class656_Sub1_Sub3 class656_sub1_sub3, boolean bool) {
	int i = Math.min(1761949661 * anInt7210 - 1,
			 Math.max(0, class656_sub1_sub3.aShort11923));
	int i_27_ = Math.min(anInt7210 * 1761949661 - 1,
			     Math.max(0, class656_sub1_sub3.aShort11924));
	int i_28_ = Math.min(947301287 * anInt7211 - 1,
			     Math.max(0, class656_sub1_sub3.aShort11925));
	int i_29_ = Math.min(anInt7211 * 947301287 - 1,
			     Math.max(0, class656_sub1_sub3.aShort11930));
	for (int i_30_ = i; i_30_ <= i_27_; i_30_++) {
	    for (int i_31_ = i_28_; i_31_ <= i_29_; i_31_++) {
		Class547 class547
		    = (aClass547ArrayArrayArray7263
		       [class656_sub1_sub3.aByte10867][i_30_][i_31_]);
		if (null != class547) {
		    Class560 class560 = class547.aClass560_7272;
		    Class560 class560_32_ = null;
		    for (/**/; null != class560;
			 class560 = class560.aClass560_7546) {
			if (class560.aClass656_Sub1_Sub3_7547
			    == class656_sub1_sub3) {
			    if (null != class560_32_)
				class560_32_.aClass560_7546
				    = class560.aClass560_7546;
			    else
				class547.aClass560_7272
				    = class560.aClass560_7546;
			    class560.method9403(-1735533430);
			    break;
			}
			class560_32_ = class560;
		    }
		}
	    }
	}
	if (!bool)
	    method8967(class656_sub1_sub3, -241114770);
    }
    
    public int method8945(int i, int i_33_, int i_34_) {
	return (aShortArrayArray7219 != null
		? aShortArrayArray7219[i][i_33_] & 0xffff : 0);
    }
    
    public void method8946(boolean bool, int i) {
	if (bool) {
	    aClass547ArrayArrayArray7263 = aClass547ArrayArrayArray7216;
	    aClass161Array7226 = aClass161Array7249;
	} else {
	    aClass547ArrayArrayArray7263 = aClass547ArrayArrayArray7220;
	    aClass161Array7226 = aClass161Array7215;
	}
	anInt7241 = aClass547ArrayArrayArray7263.length * 902416523;
    }
    
    public int method8947(int i, int i_35_, int i_36_) {
	return (null != aByteArrayArray7259
		? aByteArrayArray7259[i][i_35_] & 0xff : 0);
    }
    
    public int method8948(int i, int i_37_, int i_38_) {
	return (aByteArrayArray7201 != null
		? aByteArrayArray7201[i][i_37_] & 0xff : 0);
    }
    
    public int method8949(int i, int i_39_, int i_40_) {
	return (aByteArrayArray7222 != null
		? aByteArrayArray7222[i][i_39_] & 0xff : 0);
    }
    
    public int method8950(int i, int i_41_, int i_42_) {
	return (aByteArrayArray7212 != null
		? aByteArrayArray7212[i][i_41_] & 0xff : 0);
    }
    
    public HashMap method8951() {
	aHashMap7258.clear();
	Iterator iterator = aHashMap7257.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    aHashMap7258.put(entry.getKey(),
			     (((Class564) ((List) entry.getValue()).get(0))
			      .aClass525_Sub21_7595));
	}
	return aHashMap7258;
    }
    
    public void method8952(int i, int i_43_, int i_44_,
			   Class656_Sub1_Sub1 class656_sub1_sub1, int i_45_) {
	Class547 class547 = method9088(i, i_43_, i_44_, (byte) 14);
	if (class547 != null) {
	    class547.aClass656_Sub1_Sub1_7264 = class656_sub1_sub1;
	    int i_46_ = aClass161Array7249 == aClass161Array7226 ? 1 : 0;
	    if (class656_sub1_sub1.method16913(1040451145)) {
		if (class656_sub1_sub1.method16914(-1812493549)) {
		    class656_sub1_sub1.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_46_];
		    aClass656_Sub1Array7229[i_46_] = class656_sub1_sub1;
		} else {
		    class656_sub1_sub1.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_46_];
		    aClass656_Sub1Array7228[i_46_] = class656_sub1_sub1;
		}
	    } else {
		class656_sub1_sub1.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_46_];
		aClass656_Sub1Array7230[i_46_] = class656_sub1_sub1;
	    }
	}
    }
    
    public void method8953(int i, int i_47_, int i_48_, int i_49_,
			   Class656_Sub1_Sub2 class656_sub1_sub2, int i_50_) {
	Class547 class547 = method9088(i, i_47_, i_48_, (byte) 14);
	if (null != class547) {
	    class656_sub1_sub2.method10823
		(new Class446((float) (-576707309 * anInt7240
				       + (i_47_ << anInt7200 * 1819515263)),
			      (float) i_49_,
			      (float) ((i_48_ << anInt7200 * 1819515263)
				       + -576707309 * anInt7240)));
	    class547.aClass656_Sub1_Sub2_7275 = class656_sub1_sub2;
	    int i_51_ = aClass161Array7249 == aClass161Array7226 ? 1 : 0;
	    if (class656_sub1_sub2.method16913(1040451145)) {
		if (class656_sub1_sub2.method16914(-1867883442)) {
		    class656_sub1_sub2.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_51_];
		    aClass656_Sub1Array7229[i_51_] = class656_sub1_sub2;
		} else {
		    class656_sub1_sub2.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_51_];
		    aClass656_Sub1Array7228[i_51_] = class656_sub1_sub2;
		}
	    } else {
		class656_sub1_sub2.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_51_];
		aClass656_Sub1Array7230[i_51_] = class656_sub1_sub2;
	    }
	}
    }
    
    public void method8954(int i, int i_52_) {
	/* empty */
    }
    
    public void method8955
	(int i, int i_53_, int i_54_, Class656_Sub1_Sub4 class656_sub1_sub4,
	 Class656_Sub1_Sub4 class656_sub1_sub4_55_, byte i_56_) {
	Class547 class547 = method9088(i, i_53_, i_54_, (byte) 14);
	if (class547 != null) {
	    class547.aClass656_Sub1_Sub4_7268 = class656_sub1_sub4;
	    class547.aClass656_Sub1_Sub4_7276 = class656_sub1_sub4_55_;
	    int i_57_ = aClass161Array7249 == aClass161Array7226 ? 1 : 0;
	    if (class656_sub1_sub4.method16913(1040451145)) {
		if (class656_sub1_sub4.method16914(-1796137985)) {
		    class656_sub1_sub4.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_57_];
		    aClass656_Sub1Array7229[i_57_] = class656_sub1_sub4;
		} else {
		    class656_sub1_sub4.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_57_];
		    aClass656_Sub1Array7228[i_57_] = class656_sub1_sub4;
		}
	    } else {
		class656_sub1_sub4.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_57_];
		aClass656_Sub1Array7230[i_57_] = class656_sub1_sub4;
	    }
	    if (class656_sub1_sub4_55_ != null) {
		if (class656_sub1_sub4_55_.method16913(1040451145)) {
		    if (class656_sub1_sub4_55_.method16914(-1913438714)) {
			class656_sub1_sub4_55_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7229[i_57_];
			aClass656_Sub1Array7229[i_57_]
			    = class656_sub1_sub4_55_;
		    } else {
			class656_sub1_sub4_55_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7228[i_57_];
			aClass656_Sub1Array7228[i_57_]
			    = class656_sub1_sub4_55_;
		    }
		} else {
		    class656_sub1_sub4_55_.aClass656_Sub1_10868
			= aClass656_Sub1Array7230[i_57_];
		    aClass656_Sub1Array7230[i_57_] = class656_sub1_sub4_55_;
		}
	    }
	}
    }
    
    public boolean method8956(Class656_Sub1_Sub3 class656_sub1_sub3,
			      boolean bool, byte i) {
	boolean bool_58_ = aClass161Array7226 == aClass161Array7249;
	int i_59_ = 0;
	short i_60_ = 0;
	byte i_61_ = 0;
	class656_sub1_sub3.method18557(-1178932108);
	short i_62_ = 0;
	int i_63_ = Math.min(anInt7210 * 1761949661 - 1,
			     Math.max(0, class656_sub1_sub3.aShort11923));
	int i_64_ = Math.min(1761949661 * anInt7210 - 1,
			     Math.max(0, class656_sub1_sub3.aShort11924));
	int i_65_ = Math.min(947301287 * anInt7211 - 1,
			     Math.max(0, class656_sub1_sub3.aShort11925));
	int i_66_ = Math.min(947301287 * anInt7211 - 1,
			     Math.max(0, class656_sub1_sub3.aShort11930));
	for (int i_67_ = i_63_; i_67_ <= i_64_; i_67_++) {
	    for (int i_68_ = i_65_; i_68_ <= i_66_; i_68_++) {
		Class547 class547 = method8942(class656_sub1_sub3.aByte10867,
					       i_67_, i_68_, (short) 9446);
		if (class547 != null) {
		    Class560 class560
			= Class233.method4398(class656_sub1_sub3, -207484275);
		    Class560 class560_69_ = class547.aClass560_7272;
		    if (class560_69_ == null)
			class547.aClass560_7272 = class560;
		    else {
			for (/**/; null != class560_69_.aClass560_7546;
			     class560_69_ = class560_69_.aClass560_7546) {
			    /* empty */
			}
			class560_69_.aClass560_7546 = class560;
		    }
		    if (bool_58_ && 0 != (anIntArrayArray7217[i_67_][i_68_]
					  & ~0xffffff)) {
			i_59_ = anIntArrayArray7217[i_67_][i_68_];
			i_60_ = aShortArrayArray7219[i_67_][i_68_];
			i_61_ = aByteArrayArray7259[i_67_][i_68_];
		    }
		    if (!bool && class547.aClass656_Sub1_Sub1_7264 != null
			&& (class547.aClass656_Sub1_Sub1_7264.aShort11836
			    > i_62_))
			i_62_ = class547.aClass656_Sub1_Sub1_7264.aShort11836;
		}
	    }
	}
	if (bool_58_ && 0 != (i_59_ & ~0xffffff)) {
	    for (int i_70_ = i_63_; i_70_ <= i_64_; i_70_++) {
		for (int i_71_ = i_65_; i_71_ <= i_66_; i_71_++) {
		    if ((anIntArrayArray7217[i_70_][i_71_] & ~0xffffff) == 0) {
			anIntArrayArray7217[i_70_][i_71_] = i_59_;
			aShortArrayArray7219[i_70_][i_71_] = i_60_;
			aByteArrayArray7259[i_70_][i_71_] = i_61_;
		    }
		}
	    }
	}
	if (bool) {
	    aClass656_Sub1_Sub3Array7235
		[(anInt7224 += 1972563987) * -1849796069 - 1]
		= class656_sub1_sub3;
	    class656_sub1_sub3.aClass546_10872 = this;
	} else {
	    int i_72_ = aClass161Array7226 == aClass161Array7249 ? 1 : 0;
	    if (class656_sub1_sub3.method16913(1040451145)) {
		if (class656_sub1_sub3.method16914(-1830630295)) {
		    class656_sub1_sub3.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_72_];
		    aClass656_Sub1Array7229[i_72_] = class656_sub1_sub3;
		} else {
		    class656_sub1_sub3.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_72_];
		    aClass656_Sub1Array7228[i_72_] = class656_sub1_sub3;
		}
	    } else {
		class656_sub1_sub3.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_72_];
		aClass656_Sub1Array7230[i_72_] = class656_sub1_sub3;
	    }
	}
	if (bool) {
	    Class446 class446
		= Class446.method7209(class656_sub1_sub3.method10818()
				      .aClass446_4807);
	    class446.aFloat4896 -= (float) i_62_;
	    class656_sub1_sub3.method10823(class446);
	    class446.method7260();
	}
	return true;
    }
    
    public void method8957(int i, int i_73_, int i_74_, int i_75_, int i_76_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_73_][i_74_];
	if (class547 != null) {
	    Class656_Sub1_Sub4 class656_sub1_sub4
		= class547.aClass656_Sub1_Sub4_7268;
	    Class656_Sub1_Sub4 class656_sub1_sub4_77_
		= class547.aClass656_Sub1_Sub4_7276;
	    if (null != class656_sub1_sub4) {
		class656_sub1_sub4.aShort11942
		    = (short) (class656_sub1_sub4.aShort11942 * i_75_
			       / (16 << 1819515263 * anInt7200 - 7));
		class656_sub1_sub4.aShort11939
		    = (short) (i_75_ * class656_sub1_sub4.aShort11939
			       / (16 << 1819515263 * anInt7200 - 7));
	    }
	    if (null != class656_sub1_sub4_77_) {
		class656_sub1_sub4_77_.aShort11942
		    = (short) (i_75_ * class656_sub1_sub4_77_.aShort11942
			       / (16 << anInt7200 * 1819515263 - 7));
		class656_sub1_sub4_77_.aShort11939
		    = (short) (i_75_ * class656_sub1_sub4_77_.aShort11939
			       / (16 << 1819515263 * anInt7200 - 7));
	    }
	}
    }
    
    public void method8958(int i) {
	for (int i_78_ = 0; i_78_ < -1849796069 * anInt7224; i_78_++) {
	    Class656_Sub1_Sub3 class656_sub1_sub3
		= aClass656_Sub1_Sub3Array7235[i_78_];
	    method8966(class656_sub1_sub3, true, (byte) 7);
	    aClass656_Sub1_Sub3Array7235[i_78_] = null;
	}
	anInt7224 = 0;
    }
    
    public Class656_Sub1_Sub5 method8959(int i, int i_79_, int i_80_,
					 int i_81_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_79_][i_80_];
	if (null != class547) {
	    method8967(class547.aClass656_Sub1_Sub5_7266, -2079980888);
	    if (null != class547.aClass656_Sub1_Sub5_7266) {
		Class656_Sub1_Sub5 class656_sub1_sub5
		    = class547.aClass656_Sub1_Sub5_7266;
		class547.aClass656_Sub1_Sub5_7266 = null;
		return class656_sub1_sub5;
	    }
	}
	return null;
    }
    
    public Class656_Sub1_Sub5 method8960(int i, int i_82_, int i_83_,
					 int i_84_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_82_][i_83_];
	if (null != class547) {
	    method8967(class547.aClass656_Sub1_Sub5_7267, -333675631);
	    if (class547.aClass656_Sub1_Sub5_7267 != null) {
		Class656_Sub1_Sub5 class656_sub1_sub5
		    = class547.aClass656_Sub1_Sub5_7267;
		class547.aClass656_Sub1_Sub5_7267 = null;
		return class656_sub1_sub5;
	    }
	}
	return null;
    }
    
    public Class656_Sub1_Sub4 method8961(int i, int i_85_, int i_86_,
					 int i_87_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_85_][i_86_];
	if (null != class547) {
	    method8967(class547.aClass656_Sub1_Sub4_7268, 481985515);
	    if (class547.aClass656_Sub1_Sub4_7268 != null) {
		Class656_Sub1_Sub4 class656_sub1_sub4
		    = class547.aClass656_Sub1_Sub4_7268;
		class547.aClass656_Sub1_Sub4_7268 = null;
		return class656_sub1_sub4;
	    }
	}
	return null;
    }
    
    public Class656_Sub1_Sub4 method8962(int i, int i_88_, int i_89_,
					 byte i_90_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_88_][i_89_];
	if (null != class547) {
	    method8967(class547.aClass656_Sub1_Sub4_7276, 538022697);
	    if (null != class547.aClass656_Sub1_Sub4_7276) {
		Class656_Sub1_Sub4 class656_sub1_sub4
		    = class547.aClass656_Sub1_Sub4_7276;
		class547.aClass656_Sub1_Sub4_7276 = null;
		return class656_sub1_sub4;
	    }
	}
	return null;
    }
    
    public Class656_Sub1_Sub1 method8963(int i, int i_91_, int i_92_,
					 int i_93_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_91_][i_92_];
	if (null == class547)
	    return null;
	method8967(class547.aClass656_Sub1_Sub1_7264, 644827548);
	if (class547.aClass656_Sub1_Sub1_7264 != null) {
	    Class656_Sub1_Sub1 class656_sub1_sub1
		= class547.aClass656_Sub1_Sub1_7264;
	    class547.aClass656_Sub1_Sub1_7264 = null;
	    return class656_sub1_sub1;
	}
	return null;
    }
    
    public Class656_Sub1_Sub2 method8964(int i, int i_94_, int i_95_,
					 int i_96_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_94_][i_95_];
	if (null == class547)
	    return null;
	Class656_Sub1_Sub2 class656_sub1_sub2
	    = class547.aClass656_Sub1_Sub2_7275;
	class547.aClass656_Sub1_Sub2_7275 = null;
	method8967(class656_sub1_sub2, 451471422);
	return class656_sub1_sub2;
    }
    
    public Class656_Sub1_Sub3 method8965(int i, int i_97_, int i_98_,
					 Interface63 interface63, int i_99_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_97_][i_98_];
	if (null == class547)
	    return null;
	for (Class560 class560 = class547.aClass560_7272; class560 != null;
	     class560 = class560.aClass560_7546) {
	    Class656_Sub1_Sub3 class656_sub1_sub3
		= class560.aClass656_Sub1_Sub3_7547;
	    if ((null == interface63
		 || interface63.method414(class656_sub1_sub3, 179401634))
		&& class656_sub1_sub3.aShort11923 == i_97_
		&& class656_sub1_sub3.aShort11925 == i_98_) {
		method8966(class656_sub1_sub3, false, (byte) 101);
		return class656_sub1_sub3;
	    }
	}
	return null;
    }
    
    void method8966(Class656_Sub1_Sub3 class656_sub1_sub3, boolean bool,
		    byte i) {
	int i_100_ = Math.min(1761949661 * anInt7210 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11923));
	int i_101_ = Math.min(anInt7210 * 1761949661 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11924));
	int i_102_ = Math.min(947301287 * anInt7211 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11925));
	int i_103_ = Math.min(anInt7211 * 947301287 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11930));
	for (int i_104_ = i_100_; i_104_ <= i_101_; i_104_++) {
	    for (int i_105_ = i_102_; i_105_ <= i_103_; i_105_++) {
		Class547 class547
		    = (aClass547ArrayArrayArray7263
		       [class656_sub1_sub3.aByte10867][i_104_][i_105_]);
		if (null != class547) {
		    Class560 class560 = class547.aClass560_7272;
		    Class560 class560_106_ = null;
		    for (/**/; null != class560;
			 class560 = class560.aClass560_7546) {
			if (class560.aClass656_Sub1_Sub3_7547
			    == class656_sub1_sub3) {
			    if (null != class560_106_)
				class560_106_.aClass560_7546
				    = class560.aClass560_7546;
			    else
				class547.aClass560_7272
				    = class560.aClass560_7546;
			    class560.method9403(-1735533430);
			    break;
			}
			class560_106_ = class560;
		    }
		}
	    }
	}
	if (!bool)
	    method8967(class656_sub1_sub3, 683065015);
    }
    
    void method8967(Class656_Sub1 class656_sub1, int i) {
	if (null != class656_sub1) {
	    class656_sub1.method10828();
	    for (int i_107_ = 0; i_107_ < 2; i_107_++) {
		Class656_Sub1 class656_sub1_108_ = null;
		for (Class656_Sub1 class656_sub1_109_
			 = aClass656_Sub1Array7228[i_107_];
		     class656_sub1_109_ != null;
		     class656_sub1_109_
			 = class656_sub1_109_.aClass656_Sub1_10868) {
		    if (class656_sub1_109_ == class656_sub1) {
			if (null != class656_sub1_108_)
			    class656_sub1_108_.aClass656_Sub1_10868
				= class656_sub1_109_.aClass656_Sub1_10868;
			else
			    aClass656_Sub1Array7228[i_107_]
				= class656_sub1_109_.aClass656_Sub1_10868;
			return;
		    }
		    class656_sub1_108_ = class656_sub1_109_;
		}
		class656_sub1_108_ = null;
		for (Class656_Sub1 class656_sub1_110_
			 = aClass656_Sub1Array7229[i_107_];
		     class656_sub1_110_ != null;
		     class656_sub1_110_
			 = class656_sub1_110_.aClass656_Sub1_10868) {
		    if (class656_sub1 == class656_sub1_110_) {
			if (null != class656_sub1_108_)
			    class656_sub1_108_.aClass656_Sub1_10868
				= class656_sub1_110_.aClass656_Sub1_10868;
			else
			    aClass656_Sub1Array7229[i_107_]
				= class656_sub1_110_.aClass656_Sub1_10868;
			return;
		    }
		    class656_sub1_108_ = class656_sub1_110_;
		}
		class656_sub1_108_ = null;
		for (Class656_Sub1 class656_sub1_111_
			 = aClass656_Sub1Array7230[i_107_];
		     null != class656_sub1_111_;
		     class656_sub1_111_
			 = class656_sub1_111_.aClass656_Sub1_10868) {
		    if (class656_sub1 == class656_sub1_111_) {
			if (null != class656_sub1_108_)
			    class656_sub1_108_.aClass656_Sub1_10868
				= class656_sub1_111_.aClass656_Sub1_10868;
			else
			    aClass656_Sub1Array7230[i_107_]
				= class656_sub1_111_.aClass656_Sub1_10868;
			return;
		    }
		    class656_sub1_108_ = class656_sub1_111_;
		}
	    }
	}
    }
    
    public Class656_Sub1_Sub5 method8968(int i, int i_112_, int i_113_,
					 byte i_114_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_112_][i_113_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub5_7266;
    }
    
    void method8969(Class656_Sub1[] class656_sub1s, int i, int i_115_) {
	if (i < i_115_) {
	    int i_116_ = (i_115_ + i) / 2;
	    int i_117_ = i;
	    Class656_Sub1 class656_sub1 = class656_sub1s[i_116_];
	    class656_sub1s[i_116_] = class656_sub1s[i_115_];
	    class656_sub1s[i_115_] = class656_sub1;
	    int i_118_ = 46608013 * class656_sub1.anInt10871;
	    for (int i_119_ = i; i_119_ < i_115_; i_119_++) {
		if (46608013 * class656_sub1s[i_119_].anInt10871
		    < i_118_ + (i_119_ & 0x1)) {
		    Class656_Sub1 class656_sub1_120_ = class656_sub1s[i_119_];
		    class656_sub1s[i_119_] = class656_sub1s[i_117_];
		    class656_sub1s[i_117_++] = class656_sub1_120_;
		}
	    }
	    class656_sub1s[i_115_] = class656_sub1s[i_117_];
	    class656_sub1s[i_117_] = class656_sub1;
	    method8969(class656_sub1s, i, i_117_ - 1);
	    method8969(class656_sub1s, i_117_ + 1, i_115_);
	}
    }
    
    public Class656_Sub1_Sub4 method8970(int i, int i_121_, int i_122_,
					 byte i_123_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_121_][i_122_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub4_7268;
    }
    
    public Class656_Sub1_Sub1 method8971(int i, int i_124_, int i_125_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_124_][i_125_];
	if (class547 == null || null == class547.aClass656_Sub1_Sub1_7264)
	    return null;
	return class547.aClass656_Sub1_Sub1_7264;
    }
    
    public Class656_Sub1_Sub3 method8972(int i, int i_126_, int i_127_,
					 Interface63 interface63, int i_128_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_126_][i_127_];
	if (null == class547)
	    return null;
	for (Class560 class560 = class547.aClass560_7272; null != class560;
	     class560 = class560.aClass560_7546) {
	    Class656_Sub1_Sub3 class656_sub1_sub3
		= class560.aClass656_Sub1_Sub3_7547;
	    if ((interface63 == null
		 || interface63.method414(class656_sub1_sub3, -797393835))
		&& class656_sub1_sub3.aShort11923 == i_126_
		&& class656_sub1_sub3.aShort11925 == i_127_)
		return class656_sub1_sub3;
	}
	return null;
    }
    
    public void method8973
	(int i, int i_129_, int i_130_, int i_131_, byte[][][] is,
	 int[] is_132_, int[] is_133_, int[] is_134_, int[] is_135_,
	 int[] is_136_, int i_137_, byte i_138_, int i_139_, int i_140_,
	 boolean bool, boolean bool_141_, int i_142_, boolean bool_143_) {
	aClass554_7208.aBool7421 = true;
	aBool7218 = bool_141_;
	anInt7214 = -533161521 * (i_129_ >> anInt7200 * 1819515263);
	anInt7202 = (i_131_ >> 1819515263 * anInt7200) * -868439961;
	anInt7238 = 462881393 * i_129_;
	anInt7239 = i_131_ * -1804477433;
	anInt7244 = -251673233 * i_130_;
	anInt7245 = -1411374655 * anInt7214 - anInt7242 * 372885149;
	if (anInt7245 * 979290863 < 0) {
	    anInt7243 = -(anInt7245 * -1118753465);
	    anInt7245 = 0;
	} else
	    anInt7243 = 0;
	anInt7247 = anInt7202 * 1612796921 - anInt7242 * 1745522685;
	if (anInt7247 * -525421105 < 0) {
	    anInt7225 = -(1158430263 * anInt7247);
	    anInt7247 = 0;
	} else
	    anInt7225 = 0;
	anInt7246 = anInt7214 * 1831485429 + 1836053889 * anInt7242;
	if (anInt7246 * -2031741421 > 1761949661 * anInt7210)
	    anInt7246 = anInt7210 * -1357449137;
	anInt7248 = -866304157 * anInt7242 + 1621561319 * anInt7202;
	if (573592337 * anInt7248 > 947301287 * anInt7211)
	    anInt7248 = 102867767 * anInt7211;
	boolean[][] bools = aBoolArrayArray7262;
	boolean[][] bools_144_ = aBoolArrayArray7260;
	if (aBool7218) {
	    for (int i_145_ = 0;
		 i_145_ < -699511149 * anInt7242 + -699511149 * anInt7242 + 2;
		 i_145_++) {
		int i_146_ = 0;
		int i_147_ = 0;
		for (int i_148_ = 0;
		     (i_148_
		      < -699511149 * anInt7242 + anInt7242 * -699511149 + 2);
		     i_148_++) {
		    if (i_148_ > 1)
			anIntArray7236[i_148_ - 2] = i_146_;
		    i_146_ = i_147_;
		    int i_149_ = i_145_ + (1874840879 * anInt7214
					   - -699511149 * anInt7242);
		    int i_150_ = i_148_ + (anInt7202 * 1049621335
					   - anInt7242 * -699511149);
		    if (i_149_ >= 0 && i_150_ >= 0
			&& i_149_ < anInt7210 * 1761949661
			&& i_150_ < anInt7211 * 947301287) {
			int i_151_ = i_149_ << 1819515263 * anInt7200;
			int i_152_ = i_150_ << 1819515263 * anInt7200;
			int i_153_
			    = (aClass161Array7215
				   [aClass161Array7215.length - 1]
				   .method2577(i_149_, i_150_, (byte) -23)
			       - (1000 << anInt7200 * 1819515263 - 7));
			int i_154_
			    = ((null != aClass161Array7249
				? (aClass161Array7249[0]
				       .method2577(i_149_, i_150_, (byte) 63)
				   + -466040829 * anInt7221)
				: (aClass161Array7215[0]
				       .method2577(i_149_, i_150_, (byte) -84)
				   + -466040829 * anInt7221))
			       + (1000 << anInt7200 * 1819515263 - 7));
			i_147_ = aClass182_7204.method3206(i_151_, i_153_,
							   i_152_, i_151_,
							   i_154_, i_152_);
			aBoolArrayArray7260[i_145_][i_148_] = 0 == i_147_;
		    } else {
			i_147_ = -1;
			aBoolArrayArray7260[i_145_][i_148_] = false;
		    }
		    if (i_145_ > 0 && i_148_ > 0) {
			int i_155_
			    = (anIntArray7236[i_148_ - 1]
			       & anIntArray7236[i_148_] & i_146_ & i_147_);
			aBoolArrayArray7262[i_145_ - 1][i_148_ - 1]
			    = 0 == i_155_;
		    }
		}
		anIntArray7236[-699511149 * anInt7242 + anInt7242 * -699511149]
		    = i_146_;
		anIntArray7236[(anInt7242 * -699511149 + -699511149 * anInt7242
				+ 1)]
		    = i_147_;
	    }
	    if (!bool_143_)
		aClass554_7208.aBool7421 = false;
	    else {
		aClass554_7208.anIntArray7450 = is_132_;
		aClass554_7208.anIntArray7441 = is_133_;
		aClass554_7208.anIntArray7440 = is_134_;
		aClass554_7208.anIntArray7443 = is_135_;
		aClass554_7208.anIntArray7444 = is_136_;
		aClass554_7208.method9190(aClass182_7204, i_137_);
	    }
	} else {
	    if (null == aBoolArrayArray7199)
		aBoolArrayArray7199
		    = (new boolean
		       [anInt7242 * -699511149 + anInt7242 * -699511149 + 2]
		       [-699511149 * anInt7242 + -699511149 * anInt7242 + 2]);
	    for (int i_156_ = 0; i_156_ < aBoolArrayArray7199.length;
		 i_156_++) {
		for (int i_157_ = 0; i_157_ < aBoolArrayArray7199[0].length;
		     i_157_++)
		    aBoolArrayArray7199[i_156_][i_157_] = true;
	    }
	    aBoolArrayArray7260 = aBoolArrayArray7199;
	    aBoolArrayArray7262 = aBoolArrayArray7199;
	    anInt7245 = 0;
	    anInt7247 = 0;
	    anInt7246 = anInt7210 * -1357449137;
	    anInt7248 = 102867767 * anInt7211;
	    aClass554_7208.aBool7421 = false;
	}
	Class272.method5020(this, aClass182_7204, 1851461151);
	if (!aClass557_7207.aBool7533) {
	    Iterator iterator = aClass557_7207.aList7534.iterator();
	    while (iterator.hasNext()) {
		Class567 class567 = (Class567) iterator.next();
		iterator.remove();
		Class168.method2718(class567, -2072849532);
	    }
	}
	if (aBool7213) {
	    for (int i_158_ = 0; i_158_ < anInt7253 * 1999654737; i_158_++)
		aClass564Array7255[i_158_].method9439(i, bool, 1462984849);
	}
	if (aClass547ArrayArrayArray7216 != null) {
	    method8946(true, 1998016646);
	    aClass182_7204.method3261(-1, new Class176(1583160, 40, 127, 63, 0,
						       0, 0));
	    method8979(true, is, i_137_, i_138_, i_142_);
	    aClass182_7204.method3263();
	    method8946(false, 281427311);
	}
	method8979(false, is, i_137_, i_138_, i_142_);
	if (!aBool7218) {
	    aBoolArrayArray7262 = bools;
	    aBoolArrayArray7260 = bools_144_;
	}
    }
    
    public Class656_Sub1_Sub1 method8974(int i, int i_159_, int i_160_,
					 byte i_161_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_159_][i_160_];
	if (class547 == null || null == class547.aClass656_Sub1_Sub1_7264)
	    return null;
	return class547.aClass656_Sub1_Sub1_7264;
    }
    
    public void method8975() {
	for (int i = 0; i < 230317859 * anInt7241; i++) {
	    for (int i_162_ = 0; i_162_ < 1761949661 * anInt7210; i_162_++) {
		for (int i_163_ = 0; i_163_ < anInt7211 * 947301287;
		     i_163_++) {
		    Class547 class547
			= aClass547ArrayArrayArray7263[i][i_162_][i_163_];
		    if (class547 != null) {
			Class656_Sub1_Sub5 class656_sub1_sub5
			    = class547.aClass656_Sub1_Sub5_7266;
			Class656_Sub1_Sub5 class656_sub1_sub5_164_
			    = class547.aClass656_Sub1_Sub5_7267;
			if (null != class656_sub1_sub5
			    && class656_sub1_sub5.method16912(663040482)) {
			    method9024(class656_sub1_sub5, i, i_162_, i_163_,
				       1, 1);
			    if (null != class656_sub1_sub5_164_
				&& class656_sub1_sub5_164_
				       .method16912(310644662)) {
				method9024(class656_sub1_sub5_164_, i, i_162_,
					   i_163_, 1, 1);
				class656_sub1_sub5_164_.method16915
				    (aClass182_7204, class656_sub1_sub5, 0, 0,
				     0, false, -349283814);
				class656_sub1_sub5_164_
				    .method16916(1789117128);
			    }
			    class656_sub1_sub5.method16916(581927188);
			}
			for (Class560 class560 = class547.aClass560_7272;
			     class560 != null;
			     class560 = class560.aClass560_7546) {
			    Class656_Sub1_Sub3 class656_sub1_sub3
				= class560.aClass656_Sub1_Sub3_7547;
			    if (class656_sub1_sub3 != null
				&& class656_sub1_sub3.method16912(91334164)) {
				method9024(class656_sub1_sub3, i, i_162_,
					   i_163_,
					   (class656_sub1_sub3.aShort11924
					    - class656_sub1_sub3.aShort11923
					    + 1),
					   1 + (class656_sub1_sub3.aShort11930
						- (class656_sub1_sub3
						   .aShort11925)));
				class656_sub1_sub3.method16916(1684814064);
			    }
			}
			Class656_Sub1_Sub1 class656_sub1_sub1
			    = class547.aClass656_Sub1_Sub1_7264;
			if (null != class656_sub1_sub1
			    && class656_sub1_sub1.method16912(1234014173)) {
			    method8976(class656_sub1_sub1, i, i_162_, i_163_,
				       -764164205);
			    class656_sub1_sub1.method16916(856794725);
			}
		    }
		}
	    }
	}
    }
    
    void method8976(Class656_Sub1 class656_sub1, int i, int i_165_, int i_166_,
		    int i_167_) {
	if (i_165_ < anInt7210 * 1761949661) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][1 + i_165_][i_166_];
	    if (class547 != null && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(1572175937)) {
		int i_168_
		    = ((aClass161Array7226[i].method2577(1 + i_165_, i_166_,
							 (byte) 26)
			+ aClass161Array7226[i].method2577(i_165_ + 1 + 1,
							   i_166_, (byte) -67)
			+ aClass161Array7226[i]
			      .method2577(1 + i_165_, 1 + i_166_, (byte) 45)
			+ aClass161Array7226[i].method2577(1 + (i_165_ + 1),
							   i_166_ + 1,
							   (byte) -2)) / 4
		       - (aClass161Array7226[i].method2577(i_165_, i_166_,
							   (byte) 45)
			  + aClass161Array7226[i]
				.method2577(i_165_ + 1, i_166_, (byte) -68)
			  + aClass161Array7226[i]
				.method2577(i_165_, 1 + i_166_, (byte) 71)
			  + aClass161Array7226[i].method2577(i_165_ + 1,
							     i_166_ + 1,
							     (byte) -76)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  -466040829 * anInt7221, i_168_, 0,
					  true, 1838561226);
	    }
	}
	if (i_166_ < anInt7210 * 1761949661) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_165_][i_166_ + 1];
	    if (class547 != null && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-434934536)) {
		int i_169_
		    = ((aClass161Array7226[i].method2577(i_165_, i_166_,
							 (byte) -20)
			+ aClass161Array7226[i]
			      .method2577(i_165_ + 1, i_166_ + 1, (byte) 72)
			+ aClass161Array7226[i]
			      .method2577(i_165_, 1 + i_166_ + 1, (byte) -6)
			+ aClass161Array7226[i].method2577(i_165_ + 1,
							   1 + (i_166_ + 1),
							   (byte) -10)) / 4
		       - (aClass161Array7226[i].method2577(i_165_, i_166_,
							   (byte) -81)
			  + aClass161Array7226[i]
				.method2577(i_165_ + 1, i_166_, (byte) -26)
			  + aClass161Array7226[i]
				.method2577(i_165_, 1 + i_166_, (byte) -52)
			  + aClass161Array7226[i].method2577(1 + i_165_,
							     i_166_ + 1,
							     (byte) 105)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264, 0,
					  i_169_, -466040829 * anInt7221, true,
					  548356635);
	    }
	}
	if (i_165_ < anInt7210 * 1761949661
	    && i_166_ < 947301287 * anInt7211) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_165_ + 1][1 + i_166_];
	    if (null != class547 && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-305033635)) {
		int i_170_
		    = ((aClass161Array7226[i]
			    .method2577(1 + i_165_, 1 + i_166_, (byte) -58)
			+ aClass161Array7226[i].method2577(i_165_ + 1 + 1,
							   1 + i_166_,
							   (byte) 15)
			+ aClass161Array7226[i].method2577(i_165_ + 1,
							   1 + (1 + i_166_),
							   (byte) 76)
			+ aClass161Array7226[i].method2577(1 + (1 + i_165_),
							   i_166_ + 1 + 1,
							   (byte) 4)) / 4
		       - (aClass161Array7226[i].method2577(i_165_, i_166_,
							   (byte) 60)
			  + aClass161Array7226[i].method2577(1 + i_165_,
							     i_166_, (byte) 16)
			  + aClass161Array7226[i]
				.method2577(i_165_, 1 + i_166_, (byte) -4)
			  + aClass161Array7226[i].method2577(i_165_ + 1,
							     i_166_ + 1,
							     (byte) 50)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  anInt7221 * -466040829, i_170_,
					  -466040829 * anInt7221, true,
					  1703400085);
	    }
	}
	if (i_165_ < anInt7210 * 1761949661 && i_166_ > 0) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_165_ + 1][i_166_ - 1];
	    if (class547 != null && null != class547.aClass656_Sub1_Sub1_7264
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-437061706)) {
		int i_171_
		    = ((aClass161Array7226[i]
			    .method2577(1 + i_165_, i_166_ - 1, (byte) -42)
			+ aClass161Array7226[i].method2577(1 + i_165_ + 1,
							   i_166_ - 1,
							   (byte) 12)
			+ aClass161Array7226[i].method2577(1 + i_165_,
							   1 + i_166_ - 1,
							   (byte) -37)
			+ aClass161Array7226[i].method2577(1 + i_165_ + 1,
							   i_166_ + 1 - 1,
							   (byte) -1)) / 4
		       - (aClass161Array7226[i].method2577(i_165_, i_166_,
							   (byte) -8)
			  + aClass161Array7226[i].method2577(i_165_ + 1,
							     i_166_, (byte) -5)
			  + aClass161Array7226[i]
				.method2577(i_165_, 1 + i_166_, (byte) 23)
			  + aClass161Array7226[i].method2577(i_165_ + 1,
							     i_166_ + 1,
							     (byte) -41)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  -466040829 * anInt7221, i_171_,
					  -(anInt7221 * -466040829), true,
					  1629406619);
	    }
	}
    }
    
    public Class656_Sub1_Sub2 method8977(int i, int i_172_, int i_173_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_172_][i_173_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub2_7275;
    }
    
    public void method8978
	(int i, int i_174_, int i_175_, int i_176_, byte[][][] is,
	 int[] is_177_, int[] is_178_, int[] is_179_, int[] is_180_,
	 int[] is_181_, int i_182_, byte i_183_, int i_184_, int i_185_,
	 boolean bool, boolean bool_186_, int i_187_, boolean bool_188_) {
	aClass554_7208.aBool7421 = true;
	aBool7218 = bool_186_;
	anInt7214 = -533161521 * (i_174_ >> anInt7200 * 1819515263);
	anInt7202 = (i_176_ >> 1819515263 * anInt7200) * -868439961;
	anInt7238 = 462881393 * i_174_;
	anInt7239 = i_176_ * -1804477433;
	anInt7244 = -251673233 * i_175_;
	anInt7245 = -1411374655 * anInt7214 - anInt7242 * 372885149;
	if (anInt7245 * 979290863 < 0) {
	    anInt7243 = -(anInt7245 * -1118753465);
	    anInt7245 = 0;
	} else
	    anInt7243 = 0;
	anInt7247 = anInt7202 * 1612796921 - anInt7242 * 1745522685;
	if (anInt7247 * -525421105 < 0) {
	    anInt7225 = -(1158430263 * anInt7247);
	    anInt7247 = 0;
	} else
	    anInt7225 = 0;
	anInt7246 = anInt7214 * 1831485429 + 1836053889 * anInt7242;
	if (anInt7246 * -2031741421 > 1761949661 * anInt7210)
	    anInt7246 = anInt7210 * -1357449137;
	anInt7248 = -866304157 * anInt7242 + 1621561319 * anInt7202;
	if (573592337 * anInt7248 > 947301287 * anInt7211)
	    anInt7248 = 102867767 * anInt7211;
	boolean[][] bools = aBoolArrayArray7262;
	boolean[][] bools_189_ = aBoolArrayArray7260;
	if (aBool7218) {
	    for (int i_190_ = 0;
		 i_190_ < -699511149 * anInt7242 + -699511149 * anInt7242 + 2;
		 i_190_++) {
		int i_191_ = 0;
		int i_192_ = 0;
		for (int i_193_ = 0;
		     (i_193_
		      < -699511149 * anInt7242 + anInt7242 * -699511149 + 2);
		     i_193_++) {
		    if (i_193_ > 1)
			anIntArray7236[i_193_ - 2] = i_191_;
		    i_191_ = i_192_;
		    int i_194_ = i_190_ + (1874840879 * anInt7214
					   - -699511149 * anInt7242);
		    int i_195_ = i_193_ + (anInt7202 * 1049621335
					   - anInt7242 * -699511149);
		    if (i_194_ >= 0 && i_195_ >= 0
			&& i_194_ < anInt7210 * 1761949661
			&& i_195_ < anInt7211 * 947301287) {
			int i_196_ = i_194_ << 1819515263 * anInt7200;
			int i_197_ = i_195_ << 1819515263 * anInt7200;
			int i_198_
			    = (aClass161Array7215
				   [aClass161Array7215.length - 1]
				   .method2577(i_194_, i_195_, (byte) -11)
			       - (1000 << anInt7200 * 1819515263 - 7));
			int i_199_
			    = ((null != aClass161Array7249
				? (aClass161Array7249[0]
				       .method2577(i_194_, i_195_, (byte) 41)
				   + -466040829 * anInt7221)
				: (aClass161Array7215[0]
				       .method2577(i_194_, i_195_, (byte) 35)
				   + -466040829 * anInt7221))
			       + (1000 << anInt7200 * 1819515263 - 7));
			i_192_ = aClass182_7204.method3206(i_196_, i_198_,
							   i_197_, i_196_,
							   i_199_, i_197_);
			aBoolArrayArray7260[i_190_][i_193_] = 0 == i_192_;
		    } else {
			i_192_ = -1;
			aBoolArrayArray7260[i_190_][i_193_] = false;
		    }
		    if (i_190_ > 0 && i_193_ > 0) {
			int i_200_
			    = (anIntArray7236[i_193_ - 1]
			       & anIntArray7236[i_193_] & i_191_ & i_192_);
			aBoolArrayArray7262[i_190_ - 1][i_193_ - 1]
			    = 0 == i_200_;
		    }
		}
		anIntArray7236[-699511149 * anInt7242 + anInt7242 * -699511149]
		    = i_191_;
		anIntArray7236[(anInt7242 * -699511149 + -699511149 * anInt7242
				+ 1)]
		    = i_192_;
	    }
	    if (!bool_188_)
		aClass554_7208.aBool7421 = false;
	    else {
		aClass554_7208.anIntArray7450 = is_177_;
		aClass554_7208.anIntArray7441 = is_178_;
		aClass554_7208.anIntArray7440 = is_179_;
		aClass554_7208.anIntArray7443 = is_180_;
		aClass554_7208.anIntArray7444 = is_181_;
		aClass554_7208.method9190(aClass182_7204, i_182_);
	    }
	} else {
	    if (null == aBoolArrayArray7199)
		aBoolArrayArray7199
		    = (new boolean
		       [anInt7242 * -699511149 + anInt7242 * -699511149 + 2]
		       [-699511149 * anInt7242 + -699511149 * anInt7242 + 2]);
	    for (int i_201_ = 0; i_201_ < aBoolArrayArray7199.length;
		 i_201_++) {
		for (int i_202_ = 0; i_202_ < aBoolArrayArray7199[0].length;
		     i_202_++)
		    aBoolArrayArray7199[i_201_][i_202_] = true;
	    }
	    aBoolArrayArray7260 = aBoolArrayArray7199;
	    aBoolArrayArray7262 = aBoolArrayArray7199;
	    anInt7245 = 0;
	    anInt7247 = 0;
	    anInt7246 = anInt7210 * -1357449137;
	    anInt7248 = 102867767 * anInt7211;
	    aClass554_7208.aBool7421 = false;
	}
	Class272.method5020(this, aClass182_7204, -1341326200);
	if (!aClass557_7207.aBool7533) {
	    Iterator iterator = aClass557_7207.aList7534.iterator();
	    while (iterator.hasNext()) {
		Class567 class567 = (Class567) iterator.next();
		iterator.remove();
		Class168.method2718(class567, -1876621569);
	    }
	}
	if (aBool7213) {
	    for (int i_203_ = 0; i_203_ < anInt7253 * 1999654737; i_203_++)
		aClass564Array7255[i_203_].method9439(i, bool, 1525881634);
	}
	if (aClass547ArrayArrayArray7216 != null) {
	    method8946(true, 676664276);
	    aClass182_7204.method3261(-1, new Class176(1583160, 40, 127, 63, 0,
						       0, 0));
	    method8979(true, is, i_182_, i_183_, i_187_);
	    aClass182_7204.method3263();
	    method8946(false, -1781139793);
	}
	method8979(false, is, i_182_, i_183_, i_187_);
	if (!aBool7218) {
	    aBoolArrayArray7262 = bools;
	    aBoolArrayArray7260 = bools_189_;
	}
    }
    
    void method8979(boolean bool, byte[][][] is, int i, byte i_204_,
		    int i_205_) {
	int i_206_ = bool ? 1 : 0;
	anInt7231 = 0;
	anInt7209 = 0;
	anInt7261 += 308533961;
	if (0 == (i_205_ & 0x2)) {
	    for (Class656_Sub1 class656_sub1 = aClass656_Sub1Array7228[i_206_];
		 class656_sub1 != null;
		 class656_sub1 = class656_sub1.aClass656_Sub1_10868) {
		method8980(class656_sub1, -2121554454);
		if (class656_sub1.anInt10871 * 46608013 != -1
		    && !method9072(class656_sub1, bool, is, i, i_204_))
		    aClass656_Sub1Array7234
			[(anInt7231 += 1290009477) * -1184840371 - 1]
			= class656_sub1;
	    }
	}
	if ((i_205_ & 0x1) == 0) {
	    for (Class656_Sub1 class656_sub1 = aClass656_Sub1Array7229[i_206_];
		 class656_sub1 != null;
		 class656_sub1 = class656_sub1.aClass656_Sub1_10868) {
		method8980(class656_sub1, -1260616511);
		if (46608013 * class656_sub1.anInt10871 != -1
		    && !method9072(class656_sub1, bool, is, i, i_204_))
		    aClass656_Sub1Array7233
			[(anInt7209 += 1765243827) * -1427264645 - 1]
			= class656_sub1;
	    }
	    for (Class656_Sub1 class656_sub1 = aClass656_Sub1Array7230[i_206_];
		 null != class656_sub1;
		 class656_sub1 = class656_sub1.aClass656_Sub1_10868) {
		method8980(class656_sub1, -1094403856);
		if (-1 != 46608013 * class656_sub1.anInt10871
		    && !method9072(class656_sub1, bool, is, i, i_204_)) {
		    if (class656_sub1.method16914(-2075998750))
			aClass656_Sub1Array7233
			    [(anInt7209 += 1765243827) * -1427264645 - 1]
			    = class656_sub1;
		    else
			aClass656_Sub1Array7234
			    [(anInt7231 += 1290009477) * -1184840371 - 1]
			    = class656_sub1;
		}
	    }
	    if (!bool) {
		for (int i_207_ = 0; i_207_ < anInt7224 * -1849796069;
		     i_207_++) {
		    method8980(aClass656_Sub1_Sub3Array7235[i_207_],
			       -875576930);
		    if ((aClass656_Sub1_Sub3Array7235[i_207_].anInt10871
			 * 46608013) != -1
			&& !method9072(aClass656_Sub1_Sub3Array7235[i_207_],
				       bool, is, i, i_204_)) {
			if (aClass656_Sub1_Sub3Array7235[i_207_]
				.method16914(-1808967121))
			    aClass656_Sub1Array7233
				[(anInt7209 += 1765243827) * -1427264645 - 1]
				= aClass656_Sub1_Sub3Array7235[i_207_];
			else
			    aClass656_Sub1Array7234
				[(anInt7231 += 1290009477) * -1184840371 - 1]
				= aClass656_Sub1_Sub3Array7235[i_207_];
		    }
		}
	    }
	}
	if (-1184840371 * anInt7231 > 0) {
	    method8969(aClass656_Sub1Array7234, 0,
		       anInt7231 * -1184840371 - 1);
	    for (int i_208_ = 0; i_208_ < -1184840371 * anInt7231; i_208_++)
		method9087(aClass656_Sub1Array7234[i_208_],
			   aClass525_Sub21Array7250);
	}
	if (aBool7213)
	    aClass182_7204.method3244(0, null);
	if ((i_205_ & 0x2) == 0) {
	    for (int i_209_ = 0; i_209_ < 230317859 * anInt7241; i_209_++) {
		if (i_209_ >= i && is != null) {
		    int i_210_ = aBoolArrayArray7262.length;
		    if (aBoolArrayArray7262.length + 979290863 * anInt7245
			> 1761949661 * anInt7210)
			i_210_ -= (aBoolArrayArray7262.length
				   + anInt7245 * 979290863
				   - anInt7210 * 1761949661);
		    int i_211_ = aBoolArrayArray7262[0].length;
		    if (-525421105 * anInt7247 + aBoolArrayArray7262[0].length
			> anInt7211 * 947301287)
			i_211_ -= (anInt7247 * -525421105
				   + aBoolArrayArray7262[0].length
				   - 947301287 * anInt7211);
		    boolean[][] bools = aBoolArrayArray7260;
		    if (aBool7218) {
			for (int i_212_ = -1647892199 * anInt7243;
			     i_212_ < i_210_; i_212_++) {
			    int i_213_ = (i_212_ + anInt7245 * 979290863
					  - anInt7243 * -1647892199);
			    for (int i_214_ = -204097239 * anInt7225;
				 i_214_ < i_211_; i_214_++) {
				bools[i_212_][i_214_] = false;
				if (aBoolArrayArray7262[i_212_][i_214_]) {
				    int i_215_
					= (i_214_ + anInt7247 * -525421105
					   - anInt7225 * -204097239);
				    for (int i_216_ = i_209_; i_216_ >= 0;
					 i_216_--) {
					if ((null
					     != (aClass547ArrayArrayArray7263
						 [i_216_][i_213_][i_215_]))
					    && (aClass547ArrayArrayArray7263
						[i_216_][i_213_][i_215_]
						.aByte7271) == i_209_) {
					    if ((i_216_ >= i
						 && (is[i_216_][i_213_][i_215_]
						     == i_204_))
						|| (aClass554_7208.method9181
						    (i_209_, i_213_, i_215_)))
						bools[i_212_][i_214_] = false;
					    else
						bools[i_212_][i_214_] = true;
					    break;
					}
				    }
				}
			    }
			}
		    }
		    aClass161Array7226[i_209_].method2579
			(anInt7214 * 1874840879, anInt7202 * 1049621335,
			 -699511149 * anInt7242, aBoolArrayArray7260, false,
			 i_205_);
		} else {
		    int i_217_ = aBoolArrayArray7262.length;
		    if (aBoolArrayArray7262.length + 979290863 * anInt7245
			> 1761949661 * anInt7210)
			i_217_ -= (aBoolArrayArray7262.length
				   + 979290863 * anInt7245
				   - anInt7210 * 1761949661);
		    int i_218_ = aBoolArrayArray7262[0].length;
		    if (anInt7247 * -525421105 + aBoolArrayArray7262[0].length
			> 947301287 * anInt7211)
			i_218_ -= (aBoolArrayArray7262[0].length
				   + -525421105 * anInt7247
				   - anInt7211 * 947301287);
		    boolean[][] bools = aBoolArrayArray7260;
		    if (aBool7218) {
			for (int i_219_ = -1647892199 * anInt7243;
			     i_219_ < i_217_; i_219_++) {
			    int i_220_ = (979290863 * anInt7245 + i_219_
					  - anInt7243 * -1647892199);
			    for (int i_221_ = -204097239 * anInt7225;
				 i_221_ < i_218_; i_221_++) {
				if (aBoolArrayArray7262[i_219_][i_221_]
				    && !(aClass554_7208.method9181
					 (i_209_, i_220_,
					  (i_221_ + anInt7247 * -525421105
					   - anInt7225 * -204097239))))
				    bools[i_219_][i_221_] = true;
				else
				    bools[i_219_][i_221_] = false;
			    }
			}
		    }
		    aClass161Array7226[i_209_].method2579
			(anInt7214 * 1874840879, 1049621335 * anInt7202,
			 -699511149 * anInt7242, aBoolArrayArray7260, true,
			 i_205_);
		}
	    }
	}
	if (anInt7209 * -1427264645 > 0) {
	    method8981(aClass656_Sub1Array7233, 0,
		       anInt7209 * -1427264645 - 1);
	    for (int i_222_ = 0; i_222_ < -1427264645 * anInt7209; i_222_++)
		method9087(aClass656_Sub1Array7233[i_222_],
			   aClass525_Sub21Array7250);
	}
    }
    
    void method8980(Class656_Sub1 class656_sub1, int i) {
	Class446 class446 = class656_sub1.method10818().aClass446_4807;
	aClass182_7204.method3360((float) (int) class446.aFloat4895,
				  (float) ((int) class446.aFloat4896
					   + (class656_sub1
						  .method16909((byte) 109)
					      >> 1)),
				  (float) (int) class446.aFloat4897,
				  aFloatArray7206);
	class656_sub1.anInt10871 = 1082082373 * (int) aFloatArray7206[2];
    }
    
    void method8981(Class656_Sub1[] class656_sub1s, int i, int i_223_) {
	if (i < i_223_) {
	    int i_224_ = (i_223_ + i) / 2;
	    int i_225_ = i;
	    Class656_Sub1 class656_sub1 = class656_sub1s[i_224_];
	    class656_sub1s[i_224_] = class656_sub1s[i_223_];
	    class656_sub1s[i_223_] = class656_sub1;
	    int i_226_ = class656_sub1.anInt10871 * 46608013;
	    for (int i_227_ = i; i_227_ < i_223_; i_227_++) {
		if (class656_sub1s[i_227_].anInt10871 * 46608013
		    > (i_227_ & 0x1) + i_226_) {
		    Class656_Sub1 class656_sub1_228_ = class656_sub1s[i_227_];
		    class656_sub1s[i_227_] = class656_sub1s[i_225_];
		    class656_sub1s[i_225_++] = class656_sub1_228_;
		}
	    }
	    class656_sub1s[i_223_] = class656_sub1s[i_225_];
	    class656_sub1s[i_225_] = class656_sub1;
	    method8981(class656_sub1s, i, i_225_ - 1);
	    method8981(class656_sub1s, i_225_ + 1, i_223_);
	}
    }
    
    public int method8982(int i, int i_229_) {
	return (aByteArrayArray7201 != null
		? aByteArrayArray7201[i][i_229_] & 0xff : 0);
    }
    
    public Class656_Sub1_Sub1 method8983(int i, int i_230_, int i_231_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_230_][i_231_];
	if (null == class547)
	    return null;
	method8967(class547.aClass656_Sub1_Sub1_7264, -1029041496);
	if (class547.aClass656_Sub1_Sub1_7264 != null) {
	    Class656_Sub1_Sub1 class656_sub1_sub1
		= class547.aClass656_Sub1_Sub1_7264;
	    class547.aClass656_Sub1_Sub1_7264 = null;
	    return class656_sub1_sub1;
	}
	return null;
    }
    
    public boolean method8984(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_232_, int i_233_, boolean[] bools,
			      short i_234_) {
	boolean bool = false;
	if (aClass161Array7249 != aClass161Array7226) {
	    int i_235_
		= aClass161Array7215[i].method2619(i_232_, i_233_, 550698431);
	    int i_236_ = 0;
	    for (/**/; i_236_ <= i; i_236_++) {
		Class161 class161 = aClass161Array7215[i_236_];
		if (class161 != null) {
		    int i_237_ = i_235_ - class161.method2619(i_232_, i_233_,
							      -1825581651);
		    if (bools != null) {
			bools[i_236_]
			    = class161.method2615(class525_sub16_sub17, i_232_,
						  i_237_, i_233_, 0, false);
			if (!bools[i_236_])
			    continue;
		    }
		    class161.method2586(class525_sub16_sub17, i_232_, i_237_,
					i_233_, 0, false);
		    bool = true;
		}
	    }
	}
	return bool;
    }
    
    public boolean method8985(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_238_, int i_239_, boolean[] bools) {
	boolean bool = false;
	if (aClass161Array7249 != aClass161Array7226) {
	    int i_240_
		= aClass161Array7215[i].method2619(i_238_, i_239_, 2015489464);
	    int i_241_ = 0;
	    for (/**/; i_241_ <= i; i_241_++) {
		Class161 class161 = aClass161Array7215[i_241_];
		if (class161 != null) {
		    int i_242_ = i_240_ - class161.method2619(i_238_, i_239_,
							      -486780382);
		    if (bools != null) {
			bools[i_241_]
			    = class161.method2615(class525_sub16_sub17, i_238_,
						  i_242_, i_239_, 0, false);
			if (!bools[i_241_])
			    continue;
		    }
		    class161.method2586(class525_sub16_sub17, i_238_, i_242_,
					i_239_, 0, false);
		    bool = true;
		}
	    }
	}
	return bool;
    }
    
    void method8986(boolean bool, byte[][][] is, int i, byte i_243_,
		    int i_244_) {
	int i_245_ = bool ? 1 : 0;
	anInt7231 = 0;
	anInt7209 = 0;
	anInt7261 += 308533961;
	if (0 == (i_244_ & 0x2)) {
	    for (Class656_Sub1 class656_sub1 = aClass656_Sub1Array7228[i_245_];
		 class656_sub1 != null;
		 class656_sub1 = class656_sub1.aClass656_Sub1_10868) {
		method8980(class656_sub1, -1370139379);
		if (class656_sub1.anInt10871 * 46608013 != -1
		    && !method9072(class656_sub1, bool, is, i, i_243_))
		    aClass656_Sub1Array7234
			[(anInt7231 += 1290009477) * -1184840371 - 1]
			= class656_sub1;
	    }
	}
	if ((i_244_ & 0x1) == 0) {
	    for (Class656_Sub1 class656_sub1 = aClass656_Sub1Array7229[i_245_];
		 class656_sub1 != null;
		 class656_sub1 = class656_sub1.aClass656_Sub1_10868) {
		method8980(class656_sub1, 356744518);
		if (46608013 * class656_sub1.anInt10871 != -1
		    && !method9072(class656_sub1, bool, is, i, i_243_))
		    aClass656_Sub1Array7233
			[(anInt7209 += 1765243827) * -1427264645 - 1]
			= class656_sub1;
	    }
	    for (Class656_Sub1 class656_sub1 = aClass656_Sub1Array7230[i_245_];
		 null != class656_sub1;
		 class656_sub1 = class656_sub1.aClass656_Sub1_10868) {
		method8980(class656_sub1, -1742804400);
		if (-1 != 46608013 * class656_sub1.anInt10871
		    && !method9072(class656_sub1, bool, is, i, i_243_)) {
		    if (class656_sub1.method16914(-1914689186))
			aClass656_Sub1Array7233
			    [(anInt7209 += 1765243827) * -1427264645 - 1]
			    = class656_sub1;
		    else
			aClass656_Sub1Array7234
			    [(anInt7231 += 1290009477) * -1184840371 - 1]
			    = class656_sub1;
		}
	    }
	    if (!bool) {
		for (int i_246_ = 0; i_246_ < anInt7224 * -1849796069;
		     i_246_++) {
		    method8980(aClass656_Sub1_Sub3Array7235[i_246_],
			       -2089080747);
		    if ((aClass656_Sub1_Sub3Array7235[i_246_].anInt10871
			 * 46608013) != -1
			&& !method9072(aClass656_Sub1_Sub3Array7235[i_246_],
				       bool, is, i, i_243_)) {
			if (aClass656_Sub1_Sub3Array7235[i_246_]
				.method16914(-1904204998))
			    aClass656_Sub1Array7233
				[(anInt7209 += 1765243827) * -1427264645 - 1]
				= aClass656_Sub1_Sub3Array7235[i_246_];
			else
			    aClass656_Sub1Array7234
				[(anInt7231 += 1290009477) * -1184840371 - 1]
				= aClass656_Sub1_Sub3Array7235[i_246_];
		    }
		}
	    }
	}
	if (-1184840371 * anInt7231 > 0) {
	    method8969(aClass656_Sub1Array7234, 0,
		       anInt7231 * -1184840371 - 1);
	    for (int i_247_ = 0; i_247_ < -1184840371 * anInt7231; i_247_++)
		method9087(aClass656_Sub1Array7234[i_247_],
			   aClass525_Sub21Array7250);
	}
	if (aBool7213)
	    aClass182_7204.method3244(0, null);
	if ((i_244_ & 0x2) == 0) {
	    for (int i_248_ = 0; i_248_ < 230317859 * anInt7241; i_248_++) {
		if (i_248_ >= i && is != null) {
		    int i_249_ = aBoolArrayArray7262.length;
		    if (aBoolArrayArray7262.length + 979290863 * anInt7245
			> 1761949661 * anInt7210)
			i_249_ -= (aBoolArrayArray7262.length
				   + anInt7245 * 979290863
				   - anInt7210 * 1761949661);
		    int i_250_ = aBoolArrayArray7262[0].length;
		    if (-525421105 * anInt7247 + aBoolArrayArray7262[0].length
			> anInt7211 * 947301287)
			i_250_ -= (anInt7247 * -525421105
				   + aBoolArrayArray7262[0].length
				   - 947301287 * anInt7211);
		    boolean[][] bools = aBoolArrayArray7260;
		    if (aBool7218) {
			for (int i_251_ = -1647892199 * anInt7243;
			     i_251_ < i_249_; i_251_++) {
			    int i_252_ = (i_251_ + anInt7245 * 979290863
					  - anInt7243 * -1647892199);
			    for (int i_253_ = -204097239 * anInt7225;
				 i_253_ < i_250_; i_253_++) {
				bools[i_251_][i_253_] = false;
				if (aBoolArrayArray7262[i_251_][i_253_]) {
				    int i_254_
					= (i_253_ + anInt7247 * -525421105
					   - anInt7225 * -204097239);
				    for (int i_255_ = i_248_; i_255_ >= 0;
					 i_255_--) {
					if ((null
					     != (aClass547ArrayArrayArray7263
						 [i_255_][i_252_][i_254_]))
					    && (aClass547ArrayArrayArray7263
						[i_255_][i_252_][i_254_]
						.aByte7271) == i_248_) {
					    if ((i_255_ >= i
						 && (is[i_255_][i_252_][i_254_]
						     == i_243_))
						|| (aClass554_7208.method9181
						    (i_248_, i_252_, i_254_)))
						bools[i_251_][i_253_] = false;
					    else
						bools[i_251_][i_253_] = true;
					    break;
					}
				    }
				}
			    }
			}
		    }
		    aClass161Array7226[i_248_].method2579
			(anInt7214 * 1874840879, anInt7202 * 1049621335,
			 -699511149 * anInt7242, aBoolArrayArray7260, false,
			 i_244_);
		} else {
		    int i_256_ = aBoolArrayArray7262.length;
		    if (aBoolArrayArray7262.length + 979290863 * anInt7245
			> 1761949661 * anInt7210)
			i_256_ -= (aBoolArrayArray7262.length
				   + 979290863 * anInt7245
				   - anInt7210 * 1761949661);
		    int i_257_ = aBoolArrayArray7262[0].length;
		    if (anInt7247 * -525421105 + aBoolArrayArray7262[0].length
			> 947301287 * anInt7211)
			i_257_ -= (aBoolArrayArray7262[0].length
				   + -525421105 * anInt7247
				   - anInt7211 * 947301287);
		    boolean[][] bools = aBoolArrayArray7260;
		    if (aBool7218) {
			for (int i_258_ = -1647892199 * anInt7243;
			     i_258_ < i_256_; i_258_++) {
			    int i_259_ = (979290863 * anInt7245 + i_258_
					  - anInt7243 * -1647892199);
			    for (int i_260_ = -204097239 * anInt7225;
				 i_260_ < i_257_; i_260_++) {
				if (aBoolArrayArray7262[i_258_][i_260_]
				    && !(aClass554_7208.method9181
					 (i_248_, i_259_,
					  (i_260_ + anInt7247 * -525421105
					   - anInt7225 * -204097239))))
				    bools[i_258_][i_260_] = true;
				else
				    bools[i_258_][i_260_] = false;
			    }
			}
		    }
		    aClass161Array7226[i_248_].method2579
			(anInt7214 * 1874840879, 1049621335 * anInt7202,
			 -699511149 * anInt7242, aBoolArrayArray7260, true,
			 i_244_);
		}
	    }
	}
	if (anInt7209 * -1427264645 > 0) {
	    method8981(aClass656_Sub1Array7233, 0,
		       anInt7209 * -1427264645 - 1);
	    for (int i_261_ = 0; i_261_ < -1427264645 * anInt7209; i_261_++)
		method9087(aClass656_Sub1Array7233[i_261_],
			   aClass525_Sub21Array7250);
	}
    }
    
    void method8987(int i, int i_262_, byte i_263_) {
	Class525_Sub16_Sub17 class525_sub16_sub17 = null;
	for (int i_264_ = i; i_264_ < i_262_; i_264_++) {
	    Class161 class161 = aClass161Array7215[i_264_];
	    if (null != class161) {
		for (int i_265_ = 0; i_265_ < 947301287 * anInt7211;
		     i_265_++) {
		    for (int i_266_ = 0; i_266_ < 1761949661 * anInt7210;
			 i_266_++) {
			class525_sub16_sub17
			    = class161.method2597(i_266_, i_265_,
						  class525_sub16_sub17);
			if (class525_sub16_sub17 != null) {
			    int i_267_ = i_266_ << anInt7200 * 1819515263;
			    int i_268_ = i_265_ << anInt7200 * 1819515263;
			    for (int i_269_ = i_264_ - 1; i_269_ >= 0;
				 i_269_--) {
				Class161 class161_270_
				    = aClass161Array7215[i_269_];
				if (class161_270_ != null) {
				    int i_271_
					= (class161.method2577(i_266_, i_265_,
							       (byte) -19)
					   - (class161_270_.method2577
					      (i_266_, i_265_, (byte) 71)));
				    int i_272_
					= (class161.method2577(i_266_ + 1,
							       i_265_,
							       (byte) -46)
					   - (class161_270_.method2577
					      (i_266_ + 1, i_265_,
					       (byte) -3)));
				    int i_273_
					= (class161.method2577(i_266_ + 1,
							       1 + i_265_,
							       (byte) -76)
					   - (class161_270_.method2577
					      (1 + i_266_, i_265_ + 1,
					       (byte) -36)));
				    int i_274_
					= (class161.method2577(i_266_,
							       i_265_ + 1,
							       (byte) -21)
					   - (class161_270_.method2577
					      (i_266_, 1 + i_265_,
					       (byte) -4)));
				    class161_270_.method2586
					(class525_sub16_sub17, i_267_,
					 ((i_273_ + (i_271_ + i_272_) + i_274_)
					  / 4),
					 i_268_, 0, false);
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method8988(Class656_Sub1 class656_sub1, int i, int i_275_,
		    int i_276_) {
	if (i_275_ < anInt7210 * 1761949661) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][1 + i_275_][i_276_];
	    if (class547 != null && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-75950715)) {
		int i_277_
		    = ((aClass161Array7226[i].method2577(1 + i_275_, i_276_,
							 (byte) 21)
			+ aClass161Array7226[i].method2577(i_275_ + 1 + 1,
							   i_276_, (byte) -48)
			+ aClass161Array7226[i]
			      .method2577(1 + i_275_, 1 + i_276_, (byte) -32)
			+ aClass161Array7226[i].method2577(1 + (i_275_ + 1),
							   i_276_ + 1,
							   (byte) -6)) / 4
		       - (aClass161Array7226[i].method2577(i_275_, i_276_,
							   (byte) -81)
			  + aClass161Array7226[i]
				.method2577(i_275_ + 1, i_276_, (byte) -46)
			  + aClass161Array7226[i]
				.method2577(i_275_, 1 + i_276_, (byte) -69)
			  + aClass161Array7226[i].method2577(i_275_ + 1,
							     i_276_ + 1,
							     (byte) 58)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  -466040829 * anInt7221, i_277_, 0,
					  true, 58430971);
	    }
	}
	if (i_276_ < anInt7210 * 1761949661) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_275_][i_276_ + 1];
	    if (class547 != null && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(1413625830)) {
		int i_278_
		    = ((aClass161Array7226[i].method2577(i_275_, i_276_,
							 (byte) 38)
			+ aClass161Array7226[i]
			      .method2577(i_275_ + 1, i_276_ + 1, (byte) 18)
			+ aClass161Array7226[i]
			      .method2577(i_275_, 1 + i_276_ + 1, (byte) -17)
			+ aClass161Array7226[i].method2577(i_275_ + 1,
							   1 + (i_276_ + 1),
							   (byte) 6)) / 4
		       - (aClass161Array7226[i].method2577(i_275_, i_276_,
							   (byte) -34)
			  + aClass161Array7226[i]
				.method2577(i_275_ + 1, i_276_, (byte) -63)
			  + aClass161Array7226[i]
				.method2577(i_275_, 1 + i_276_, (byte) -91)
			  + aClass161Array7226[i].method2577(1 + i_275_,
							     i_276_ + 1,
							     (byte) 27)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264, 0,
					  i_278_, -466040829 * anInt7221, true,
					  82609791);
	    }
	}
	if (i_275_ < anInt7210 * 1761949661
	    && i_276_ < 947301287 * anInt7211) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_275_ + 1][1 + i_276_];
	    if (null != class547 && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(112310760)) {
		int i_279_
		    = ((aClass161Array7226[i].method2577(1 + i_275_,
							 1 + i_276_, (byte) 29)
			+ aClass161Array7226[i].method2577(i_275_ + 1 + 1,
							   1 + i_276_,
							   (byte) -14)
			+ aClass161Array7226[i].method2577(i_275_ + 1,
							   1 + (1 + i_276_),
							   (byte) -94)
			+ aClass161Array7226[i].method2577(1 + (1 + i_275_),
							   i_276_ + 1 + 1,
							   (byte) 73)) / 4
		       - (aClass161Array7226[i].method2577(i_275_, i_276_,
							   (byte) 71)
			  + aClass161Array7226[i]
				.method2577(1 + i_275_, i_276_, (byte) -68)
			  + aClass161Array7226[i]
				.method2577(i_275_, 1 + i_276_, (byte) -85)
			  + aClass161Array7226[i].method2577(i_275_ + 1,
							     i_276_ + 1,
							     (byte) -59)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  anInt7221 * -466040829, i_279_,
					  -466040829 * anInt7221, true,
					  -1706867577);
	    }
	}
	if (i_275_ < anInt7210 * 1761949661 && i_276_ > 0) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_275_ + 1][i_276_ - 1];
	    if (class547 != null && null != class547.aClass656_Sub1_Sub1_7264
		&& class547.aClass656_Sub1_Sub1_7264.method16912(743260014)) {
		int i_280_
		    = ((aClass161Array7226[i]
			    .method2577(1 + i_275_, i_276_ - 1, (byte) -47)
			+ aClass161Array7226[i].method2577(1 + i_275_ + 1,
							   i_276_ - 1,
							   (byte) -4)
			+ aClass161Array7226[i].method2577(1 + i_275_,
							   1 + i_276_ - 1,
							   (byte) -22)
			+ aClass161Array7226[i].method2577(1 + i_275_ + 1,
							   i_276_ + 1 - 1,
							   (byte) -27)) / 4
		       - (aClass161Array7226[i].method2577(i_275_, i_276_,
							   (byte) -34)
			  + aClass161Array7226[i].method2577(i_275_ + 1,
							     i_276_, (byte) 35)
			  + aClass161Array7226[i]
				.method2577(i_275_, 1 + i_276_, (byte) -111)
			  + aClass161Array7226[i].method2577(i_275_ + 1,
							     i_276_ + 1,
							     (byte) 18)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  -466040829 * anInt7221, i_280_,
					  -(anInt7221 * -466040829), true,
					  -1997328315);
	    }
	}
    }
    
    public Class560 method8989(int i, int i_281_, int i_282_, int i_283_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_281_][i_282_];
	if (null == class547)
	    return null;
	return class547.aClass560_7272;
    }
    
    public void method8990(byte i) {
	for (int i_284_ = 0; i_284_ < 1999654737 * anInt7253; i_284_++) {
	    if (!aBoolArray7256[i_284_]) {
		Class564 class564 = aClass564Array7255[i_284_];
		Class525_Sub21 class525_sub21 = class564.aClass525_Sub21_7595;
		int i_285_ = class564.anInt7578 * -2032095817;
		int i_286_ = (class525_sub21.method16332(1637351074)
			      - -576707309 * anInt7240);
		int i_287_ = (2 * i_286_ >> 1819515263 * anInt7200) + 1;
		int i_288_ = 0;
		int[] is = new int[i_287_ * i_287_];
		int i_289_ = (class525_sub21.method16314(1430633703) - i_286_
			      >> 1819515263 * anInt7200);
		int i_290_ = (class525_sub21.method16301((byte) 6) - i_286_
			      >> 1819515263 * anInt7200);
		int i_291_ = (class525_sub21.method16301((byte) 6) + i_286_
			      >> 1819515263 * anInt7200);
		if (i_290_ < 0) {
		    i_288_ -= i_290_;
		    i_290_ = 0;
		}
		if (i_291_ >= anInt7211 * 947301287)
		    i_291_ = anInt7211 * 947301287 - 1;
		for (int i_292_ = i_290_; i_292_ <= i_291_; i_292_++) {
		    int i_293_ = class564.aShortArray7579[i_288_];
		    int i_294_ = i_293_ >>> 8;
		    int i_295_ = i_288_ * i_287_ + i_294_;
		    int i_296_ = i_289_ + (i_293_ >>> 8);
		    int i_297_ = (i_293_ & 0xff) + i_296_ - 1;
		    if (i_296_ < 0) {
			i_295_ -= i_296_;
			i_296_ = 0;
		    }
		    if (i_297_ >= 1761949661 * anInt7210)
			i_297_ = 1761949661 * anInt7210 - 1;
		    for (int i_298_ = i_296_; i_298_ <= i_297_; i_298_++) {
			int i_299_ = 1;
			Class656_Sub1_Sub3 class656_sub1_sub3
			    = method8972(i_285_, i_298_, i_292_, null,
					 332483378);
			if (class656_sub1_sub3 != null
			    && 0 != class656_sub1_sub3.aByte11928) {
			    if (class656_sub1_sub3.aByte11928 == 1) {
				boolean bool = i_298_ - 1 >= i_296_;
				boolean bool_300_ = 1 + i_298_ <= i_297_;
				if (!bool && 1 + i_292_ <= i_291_) {
				    int i_301_
					= class564.aShortArray7579[1 + i_288_];
				    int i_302_ = (i_301_ >>> 8) + i_289_;
				    int i_303_ = (i_301_ & 0xff) + i_302_;
				    bool = i_298_ > i_302_ && i_298_ < i_303_;
				}
				if (!bool_300_ && i_292_ - 1 >= i_290_) {
				    int i_304_
					= class564.aShortArray7579[i_288_ - 1];
				    int i_305_ = i_289_ + (i_304_ >>> 8);
				    int i_306_ = i_305_ + (i_304_ & 0xff);
				    bool_300_
					= i_298_ > i_305_ && i_298_ < i_306_;
				}
				if (bool && !bool_300_)
				    i_299_ = 4;
				else if (bool_300_ && !bool)
				    i_299_ = 2;
			    } else {
				boolean bool = i_298_ - 1 >= i_296_;
				boolean bool_307_ = i_298_ + 1 <= i_297_;
				if (!bool && i_292_ - 1 >= i_290_) {
				    int i_308_
					= class564.aShortArray7579[i_288_ - 1];
				    int i_309_ = i_289_ + (i_308_ >>> 8);
				    int i_310_ = i_309_ + (i_308_ & 0xff);
				    bool = i_298_ > i_309_ && i_298_ < i_310_;
				}
				if (!bool_307_ && 1 + i_292_ <= i_291_) {
				    int i_311_
					= class564.aShortArray7579[1 + i_288_];
				    int i_312_ = (i_311_ >>> 8) + i_289_;
				    int i_313_ = (i_311_ & 0xff) + i_312_;
				    bool_307_
					= i_298_ > i_312_ && i_298_ < i_313_;
				}
				if (bool && !bool_307_)
				    i_299_ = 3;
				else if (bool_307_ && !bool)
				    i_299_ = 5;
			    }
			}
			is[i_295_++] = i_299_;
		    }
		    i_288_++;
		}
		aBoolArray7256[i_284_] = true;
		if (aBool7232)
		    aClass161Array7226[i_285_].method2589(class525_sub21, is);
	    }
	}
    }
    
    public void method8991(int i, int i_314_, int i_315_, int i_316_) {
	List list = (List) aHashMap7257.get(Integer.valueOf(i));
	if (list != null) {
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class564 class564 = (Class564) iterator.next();
		class564.aClass525_Sub21_7595.method16302(i_314_, i_315_,
							  -2135739173);
	    }
	}
    }
    
    public Class656_Sub1_Sub2 method8992(int i, int i_317_, int i_318_,
					 byte i_319_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_317_][i_318_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub2_7275;
    }
    
    public void method8993(HashMap hashmap, int i) {
	aHashMap7258 = hashmap;
    }
    
    public int method8994(int i, int i_320_) {
	return (aByteArrayArray7222 != null
		? aByteArrayArray7222[i][i_320_] & 0xff : 0);
    }
    
    public void method8995(int i) {
	/* empty */
    }
    
    public void method8996(int i) {
	method8987(1, 230317859 * anInt7241, (byte) 91);
    }
    
    public void method8997
	(int i, int i_321_, int i_322_, Class656_Sub1_Sub5 class656_sub1_sub5,
	 Class656_Sub1_Sub5 class656_sub1_sub5_323_, int i_324_) {
	Class547 class547 = method9088(i, i_321_, i_322_, (byte) 14);
	if (class547 != null) {
	    class547.aClass656_Sub1_Sub5_7266 = class656_sub1_sub5;
	    class547.aClass656_Sub1_Sub5_7267 = class656_sub1_sub5_323_;
	    int i_325_ = aClass161Array7226 == aClass161Array7249 ? 1 : 0;
	    if (class656_sub1_sub5.method16913(1040451145)) {
		if (class656_sub1_sub5.method16914(-1954607159)) {
		    class656_sub1_sub5.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_325_];
		    aClass656_Sub1Array7229[i_325_] = class656_sub1_sub5;
		} else {
		    class656_sub1_sub5.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_325_];
		    aClass656_Sub1Array7228[i_325_] = class656_sub1_sub5;
		}
	    } else {
		class656_sub1_sub5.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_325_];
		aClass656_Sub1Array7230[i_325_] = class656_sub1_sub5;
	    }
	    if (null != class656_sub1_sub5_323_) {
		if (class656_sub1_sub5_323_.method16913(1040451145)) {
		    if (class656_sub1_sub5_323_.method16914(-2107510690)) {
			class656_sub1_sub5_323_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7229[i_325_];
			aClass656_Sub1Array7229[i_325_]
			    = class656_sub1_sub5_323_;
		    } else {
			class656_sub1_sub5_323_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7228[i_325_];
			aClass656_Sub1Array7228[i_325_]
			    = class656_sub1_sub5_323_;
		    }
		} else {
		    class656_sub1_sub5_323_.aClass656_Sub1_10868
			= aClass656_Sub1Array7230[i_325_];
		    aClass656_Sub1Array7230[i_325_] = class656_sub1_sub5_323_;
		}
	    }
	}
    }
    
    public void method8998(Class175 class175) {
	/* empty */
    }
    
    public void method8999() {
	for (int i = 0; i < 1761949661 * anInt7210; i++) {
	    for (int i_326_ = 0; i_326_ < 947301287 * anInt7211; i_326_++) {
		if (aClass547ArrayArrayArray7263[0][i][i_326_] == null)
		    aClass547ArrayArrayArray7263[0][i][i_326_]
			= new Class547(0);
	    }
	}
    }
    
    public boolean method9000(Class656_Sub1_Sub3 class656_sub1_sub3,
			      boolean bool) {
	boolean bool_327_ = aClass161Array7226 == aClass161Array7249;
	int i = 0;
	short i_328_ = 0;
	byte i_329_ = 0;
	class656_sub1_sub3.method18557(-1610335443);
	short i_330_ = 0;
	int i_331_ = Math.min(anInt7210 * 1761949661 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11923));
	int i_332_ = Math.min(1761949661 * anInt7210 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11924));
	int i_333_ = Math.min(947301287 * anInt7211 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11925));
	int i_334_ = Math.min(947301287 * anInt7211 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11930));
	for (int i_335_ = i_331_; i_335_ <= i_332_; i_335_++) {
	    for (int i_336_ = i_333_; i_336_ <= i_334_; i_336_++) {
		Class547 class547 = method8942(class656_sub1_sub3.aByte10867,
					       i_335_, i_336_, (short) 26294);
		if (class547 != null) {
		    Class560 class560
			= Class233.method4398(class656_sub1_sub3, -207484275);
		    Class560 class560_337_ = class547.aClass560_7272;
		    if (class560_337_ == null)
			class547.aClass560_7272 = class560;
		    else {
			for (/**/; null != class560_337_.aClass560_7546;
			     class560_337_ = class560_337_.aClass560_7546) {
			    /* empty */
			}
			class560_337_.aClass560_7546 = class560;
		    }
		    if (bool_327_ && 0 != (anIntArrayArray7217[i_335_][i_336_]
					   & ~0xffffff)) {
			i = anIntArrayArray7217[i_335_][i_336_];
			i_328_ = aShortArrayArray7219[i_335_][i_336_];
			i_329_ = aByteArrayArray7259[i_335_][i_336_];
		    }
		    if (!bool && class547.aClass656_Sub1_Sub1_7264 != null
			&& (class547.aClass656_Sub1_Sub1_7264.aShort11836
			    > i_330_))
			i_330_ = class547.aClass656_Sub1_Sub1_7264.aShort11836;
		}
	    }
	}
	if (bool_327_ && 0 != (i & ~0xffffff)) {
	    for (int i_338_ = i_331_; i_338_ <= i_332_; i_338_++) {
		for (int i_339_ = i_333_; i_339_ <= i_334_; i_339_++) {
		    if ((anIntArrayArray7217[i_338_][i_339_] & ~0xffffff)
			== 0) {
			anIntArrayArray7217[i_338_][i_339_] = i;
			aShortArrayArray7219[i_338_][i_339_] = i_328_;
			aByteArrayArray7259[i_338_][i_339_] = i_329_;
		    }
		}
	    }
	}
	if (bool) {
	    aClass656_Sub1_Sub3Array7235
		[(anInt7224 += 1972563987) * -1849796069 - 1]
		= class656_sub1_sub3;
	    class656_sub1_sub3.aClass546_10872 = this;
	} else {
	    int i_340_ = aClass161Array7226 == aClass161Array7249 ? 1 : 0;
	    if (class656_sub1_sub3.method16913(1040451145)) {
		if (class656_sub1_sub3.method16914(-1976030270)) {
		    class656_sub1_sub3.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_340_];
		    aClass656_Sub1Array7229[i_340_] = class656_sub1_sub3;
		} else {
		    class656_sub1_sub3.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_340_];
		    aClass656_Sub1Array7228[i_340_] = class656_sub1_sub3;
		}
	    } else {
		class656_sub1_sub3.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_340_];
		aClass656_Sub1Array7230[i_340_] = class656_sub1_sub3;
	    }
	}
	if (bool) {
	    Class446 class446
		= Class446.method7209(class656_sub1_sub3.method10818()
				      .aClass446_4807);
	    class446.aFloat4896 -= (float) i_330_;
	    class656_sub1_sub3.method10823(class446);
	    class446.method7260();
	}
	return true;
    }
    
    public Class560 method9001(int i, int i_341_, int i_342_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_341_][i_342_];
	if (null == class547)
	    return null;
	return class547.aClass560_7272;
    }
    
    Class547 method9002(int i, int i_343_, int i_344_) {
	if (null == aClass547ArrayArrayArray7263[i][i_343_][i_344_]) {
	    boolean bool
		= (aClass547ArrayArrayArray7263[0][i_343_][i_344_] != null
		   && null != (aClass547ArrayArrayArray7263[0][i_343_][i_344_]
			       .aClass547_7269));
	    if (bool && i >= anInt7241 * 230317859 - 1)
		return null;
	    method9063(i, i_343_, i_344_, -1724297888);
	}
	return aClass547ArrayArrayArray7263[i][i_343_][i_344_];
    }
    
    Class547 method9003(int i, int i_345_, int i_346_) {
	return method9088(i,
			  Math.min(1761949661 * anInt7210 - 1,
				   Math.max(0, i_345_)),
			  Math.min(947301287 * anInt7211 - 1,
				   Math.max(0, i_346_)),
			  (byte) 14);
    }
    
    Class547 method9004(int i, int i_347_, int i_348_) {
	return method9088(i,
			  Math.min(1761949661 * anInt7210 - 1,
				   Math.max(0, i_347_)),
			  Math.min(947301287 * anInt7211 - 1,
				   Math.max(0, i_348_)),
			  (byte) 14);
    }
    
    public void method9005(int i, int i_349_, int i_350_) {
	boolean bool = (aClass547ArrayArrayArray7263[0][i_349_][i_350_] != null
			&& (aClass547ArrayArrayArray7263[0][i_349_][i_350_]
			    .aClass547_7269) != null);
	for (int i_351_ = i; i_351_ >= 0; i_351_--) {
	    if (aClass547ArrayArrayArray7263[i_351_][i_349_][i_350_] == null) {
		Class547 class547
		    = (aClass547ArrayArrayArray7263[i_351_][i_349_][i_350_]
		       = new Class547(i_351_));
		if (bool)
		    class547.aByte7271++;
	    }
	}
    }
    
    public void method9006(int i, int i_352_, int i_353_) {
	boolean bool = (aClass547ArrayArrayArray7263[0][i_352_][i_353_] != null
			&& (aClass547ArrayArrayArray7263[0][i_352_][i_353_]
			    .aClass547_7269) != null);
	for (int i_354_ = i; i_354_ >= 0; i_354_--) {
	    if (aClass547ArrayArrayArray7263[i_354_][i_352_][i_353_] == null) {
		Class547 class547
		    = (aClass547ArrayArrayArray7263[i_354_][i_352_][i_353_]
		       = new Class547(i_354_));
		if (bool)
		    class547.aByte7271++;
	    }
	}
    }
    
    public void method9007(int i, Class161 class161) {
	aClass161Array7226[i] = class161;
    }
    
    public void method9008(int i, Class161 class161) {
	aClass161Array7226[i] = class161;
    }
    
    public void method9009(int i, Class161 class161) {
	aClass161Array7226[i] = class161;
    }
    
    public int method9010(int i, int i_355_) {
	return (aShortArrayArray7219 != null
		? aShortArrayArray7219[i][i_355_] & 0xffff : 0);
    }
    
    public int method9011(int i, int i_356_) {
	return (anIntArrayArray7217 != null
		? anIntArrayArray7217[i][i_356_] & 0xffffff : 0);
    }
    
    public int method9012(int i, int i_357_) {
	return (null != aByteArrayArray7259
		? aByteArrayArray7259[i][i_357_] & 0xff : 0);
    }
    
    public Class560 method9013(int i, int i_358_, int i_359_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_358_][i_359_];
	if (null == class547)
	    return null;
	return class547.aClass560_7272;
    }
    
    public HashMap method9014() {
	aHashMap7258.clear();
	Iterator iterator = aHashMap7257.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    aHashMap7258.put(entry.getKey(),
			     (((Class564) ((List) entry.getValue()).get(0))
			      .aClass525_Sub21_7595));
	}
	return aHashMap7258;
    }
    
    public int method9015(int i, int i_360_) {
	return (aByteArrayArray7201 != null
		? aByteArrayArray7201[i][i_360_] & 0xff : 0);
    }
    
    public int method9016(int i, int i_361_) {
	return (aByteArrayArray7222 != null
		? aByteArrayArray7222[i][i_361_] & 0xff : 0);
    }
    
    public Class656_Sub1_Sub4 method9017(int i, int i_362_, int i_363_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_362_][i_363_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub4_7268;
    }
    
    public int method9018(int i, int i_364_) {
	return (aByteArrayArray7212 != null
		? aByteArrayArray7212[i][i_364_] & 0xff : 0);
    }
    
    public int method9019(int i, int i_365_) {
	return (aByteArrayArray7212 != null
		? aByteArrayArray7212[i][i_365_] & 0xff : 0);
    }
    
    public void method9020(int i, int i_366_, int i_367_,
			   Class656_Sub1_Sub1 class656_sub1_sub1) {
	Class547 class547 = method9088(i, i_366_, i_367_, (byte) 14);
	if (class547 != null) {
	    class547.aClass656_Sub1_Sub1_7264 = class656_sub1_sub1;
	    int i_368_ = aClass161Array7249 == aClass161Array7226 ? 1 : 0;
	    if (class656_sub1_sub1.method16913(1040451145)) {
		if (class656_sub1_sub1.method16914(-1998976678)) {
		    class656_sub1_sub1.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_368_];
		    aClass656_Sub1Array7229[i_368_] = class656_sub1_sub1;
		} else {
		    class656_sub1_sub1.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_368_];
		    aClass656_Sub1Array7228[i_368_] = class656_sub1_sub1;
		}
	    } else {
		class656_sub1_sub1.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_368_];
		aClass656_Sub1Array7230[i_368_] = class656_sub1_sub1;
	    }
	}
    }
    
    public void method9021(int i, int i_369_, int i_370_, int i_371_,
			   Class656_Sub1_Sub2 class656_sub1_sub2) {
	Class547 class547 = method9088(i, i_369_, i_370_, (byte) 14);
	if (null != class547) {
	    class656_sub1_sub2.method10823
		(new Class446((float) (-576707309 * anInt7240
				       + (i_369_ << anInt7200 * 1819515263)),
			      (float) i_371_,
			      (float) ((i_370_ << anInt7200 * 1819515263)
				       + -576707309 * anInt7240)));
	    class547.aClass656_Sub1_Sub2_7275 = class656_sub1_sub2;
	    int i_372_ = aClass161Array7249 == aClass161Array7226 ? 1 : 0;
	    if (class656_sub1_sub2.method16913(1040451145)) {
		if (class656_sub1_sub2.method16914(-1939210466)) {
		    class656_sub1_sub2.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_372_];
		    aClass656_Sub1Array7229[i_372_] = class656_sub1_sub2;
		} else {
		    class656_sub1_sub2.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_372_];
		    aClass656_Sub1Array7228[i_372_] = class656_sub1_sub2;
		}
	    } else {
		class656_sub1_sub2.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_372_];
		aClass656_Sub1Array7230[i_372_] = class656_sub1_sub2;
	    }
	}
    }
    
    public void method9022(int i, int i_373_, int i_374_, int i_375_,
			   Class656_Sub1_Sub2 class656_sub1_sub2) {
	Class547 class547 = method9088(i, i_373_, i_374_, (byte) 14);
	if (null != class547) {
	    class656_sub1_sub2.method10823
		(new Class446((float) (-576707309 * anInt7240
				       + (i_373_ << anInt7200 * 1819515263)),
			      (float) i_375_,
			      (float) ((i_374_ << anInt7200 * 1819515263)
				       + -576707309 * anInt7240)));
	    class547.aClass656_Sub1_Sub2_7275 = class656_sub1_sub2;
	    int i_376_ = aClass161Array7249 == aClass161Array7226 ? 1 : 0;
	    if (class656_sub1_sub2.method16913(1040451145)) {
		if (class656_sub1_sub2.method16914(-1997055834)) {
		    class656_sub1_sub2.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_376_];
		    aClass656_Sub1Array7229[i_376_] = class656_sub1_sub2;
		} else {
		    class656_sub1_sub2.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_376_];
		    aClass656_Sub1Array7228[i_376_] = class656_sub1_sub2;
		}
	    } else {
		class656_sub1_sub2.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_376_];
		aClass656_Sub1Array7230[i_376_] = class656_sub1_sub2;
	    }
	}
    }
    
    public void method9023(int i, int i_377_, int i_378_, int i_379_,
			   Class656_Sub1_Sub2 class656_sub1_sub2) {
	Class547 class547 = method9088(i, i_377_, i_378_, (byte) 14);
	if (null != class547) {
	    class656_sub1_sub2.method10823
		(new Class446((float) (-576707309 * anInt7240
				       + (i_377_ << anInt7200 * 1819515263)),
			      (float) i_379_,
			      (float) ((i_378_ << anInt7200 * 1819515263)
				       + -576707309 * anInt7240)));
	    class547.aClass656_Sub1_Sub2_7275 = class656_sub1_sub2;
	    int i_380_ = aClass161Array7249 == aClass161Array7226 ? 1 : 0;
	    if (class656_sub1_sub2.method16913(1040451145)) {
		if (class656_sub1_sub2.method16914(-1996553226)) {
		    class656_sub1_sub2.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_380_];
		    aClass656_Sub1Array7229[i_380_] = class656_sub1_sub2;
		} else {
		    class656_sub1_sub2.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_380_];
		    aClass656_Sub1Array7228[i_380_] = class656_sub1_sub2;
		}
	    } else {
		class656_sub1_sub2.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_380_];
		aClass656_Sub1Array7230[i_380_] = class656_sub1_sub2;
	    }
	}
    }
    
    void method9024(Class656_Sub1 class656_sub1, int i, int i_381_, int i_382_,
		    int i_383_, int i_384_) {
	boolean bool = true;
	int i_385_ = i_381_;
	int i_386_ = i_383_ + i_381_;
	int i_387_ = i_382_ - 1;
	int i_388_ = i_384_ + i_382_;
	for (int i_389_ = i; i_389_ <= i + 1; i_389_++) {
	    if (i_389_ != anInt7241 * 230317859) {
		for (int i_390_ = i_385_; i_390_ <= i_386_; i_390_++) {
		    if (i_390_ >= 0 && i_390_ < 1761949661 * anInt7210) {
			for (int i_391_ = i_387_; i_391_ <= i_388_; i_391_++) {
			    if (i_391_ >= 0 && i_391_ < anInt7211 * 947301287
				&& (!bool || i_390_ >= i_386_
				    || i_391_ >= i_388_
				    || i_391_ < i_382_ && i_390_ != i_381_)) {
				Class547 class547
				    = (aClass547ArrayArrayArray7263[i_389_]
				       [i_390_][i_391_]);
				if (class547 != null) {
				    int i_392_
					= (((aClass161Array7226[i_389_]
						 .method2577
					     (i_390_, i_391_, (byte) -23))
					    + (aClass161Array7226[i_389_]
						   .method2577
					       (1 + i_390_, i_391_, (byte) 30))
					    + (aClass161Array7226[i_389_]
						   .method2577
					       (i_390_, 1 + i_391_, (byte) -2))
					    + (aClass161Array7226[i_389_]
						   .method2577
					       (i_390_ + 1, i_391_ + 1,
						(byte) 13))) / 4
					   - ((aClass161Array7226[i].method2577
					       (i_381_, i_382_, (byte) -8))
					      + (aClass161Array7226[i]
						     .method2577
						 (1 + i_381_, i_382_,
						  (byte) -68))
					      + (aClass161Array7226[i]
						     .method2577
						 (i_381_, i_382_ + 1,
						  (byte) -29))
					      + (aClass161Array7226[i]
						     .method2577
						 (i_381_ + 1, 1 + i_382_,
						  (byte) -51))) / 4);
				    Class656_Sub1_Sub5 class656_sub1_sub5
					= class547.aClass656_Sub1_Sub5_7266;
				    Class656_Sub1_Sub5 class656_sub1_sub5_393_
					= class547.aClass656_Sub1_Sub5_7267;
				    if (class656_sub1_sub5 != null
					&& class656_sub1_sub5
					       .method16912(380693166))
					class656_sub1.method16915
					    (aClass182_7204,
					     class656_sub1_sub5,
					     ((-466040829 * anInt7221
					       * (i_390_ - i_381_))
					      + (1 - i_383_) * (anInt7240
								* -576707309)),
					     i_392_,
					     ((-466040829 * anInt7221
					       * (i_391_ - i_382_))
					      + (1 - i_384_) * (-576707309
								* anInt7240)),
					     bool, -899477454);
				    if (class656_sub1_sub5_393_ != null
					&& class656_sub1_sub5_393_
					       .method16912(1284611678))
					class656_sub1.method16915
					    (aClass182_7204,
					     class656_sub1_sub5_393_,
					     ((i_390_ - i_381_) * (-466040829
								   * anInt7221)
					      + (-576707309 * anInt7240
						 * (1 - i_383_))),
					     i_392_,
					     ((-576707309 * anInt7240
					       * (1 - i_384_))
					      + (-466040829 * anInt7221
						 * (i_391_ - i_382_))),
					     bool, 1519529446);
				    for (Class560 class560
					     = class547.aClass560_7272;
					 null != class560;
					 class560 = class560.aClass560_7546) {
					Class656_Sub1_Sub3 class656_sub1_sub3
					    = (class560
					       .aClass656_Sub1_Sub3_7547);
					if (class656_sub1_sub3 != null
					    && class656_sub1_sub3
						   .method16912(1459968787)
					    && ((class656_sub1_sub3.aShort11923
						 == i_390_)
						|| i_390_ == i_385_)
					    && (i_391_ == (class656_sub1_sub3
							   .aShort11925)
						|| i_387_ == i_391_)) {
					    int i_394_ = ((class656_sub1_sub3
							   .aShort11924)
							  - (class656_sub1_sub3
							     .aShort11923)
							  + 1);
					    int i_395_ = ((class656_sub1_sub3
							   .aShort11930)
							  - (class656_sub1_sub3
							     .aShort11925)
							  + 1);
					    class656_sub1.method16915
						(aClass182_7204,
						 class656_sub1_sub3,
						 ((anInt7221 * -466040829
						   * ((class656_sub1_sub3
						       .aShort11923)
						      - i_381_))
						  + (-576707309 * anInt7240
						     * (i_394_ - i_383_))),
						 i_392_,
						 ((-466040829 * anInt7221
						   * ((class656_sub1_sub3
						       .aShort11925)
						      - i_382_))
						  + (anInt7240 * -576707309
						     * (i_395_ - i_384_))),
						 bool, -1569851686);
					}
				    }
				}
			    }
			}
		    }
		}
		i_385_--;
		bool = false;
	    }
	}
    }
    
    public void method9025(int i, int i_396_, int i_397_,
			   Class656_Sub1_Sub4 class656_sub1_sub4,
			   Class656_Sub1_Sub4 class656_sub1_sub4_398_) {
	Class547 class547 = method9088(i, i_396_, i_397_, (byte) 14);
	if (class547 != null) {
	    class547.aClass656_Sub1_Sub4_7268 = class656_sub1_sub4;
	    class547.aClass656_Sub1_Sub4_7276 = class656_sub1_sub4_398_;
	    int i_399_ = aClass161Array7249 == aClass161Array7226 ? 1 : 0;
	    if (class656_sub1_sub4.method16913(1040451145)) {
		if (class656_sub1_sub4.method16914(-2011542441)) {
		    class656_sub1_sub4.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_399_];
		    aClass656_Sub1Array7229[i_399_] = class656_sub1_sub4;
		} else {
		    class656_sub1_sub4.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_399_];
		    aClass656_Sub1Array7228[i_399_] = class656_sub1_sub4;
		}
	    } else {
		class656_sub1_sub4.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_399_];
		aClass656_Sub1Array7230[i_399_] = class656_sub1_sub4;
	    }
	    if (class656_sub1_sub4_398_ != null) {
		if (class656_sub1_sub4_398_.method16913(1040451145)) {
		    if (class656_sub1_sub4_398_.method16914(-2139875908)) {
			class656_sub1_sub4_398_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7229[i_399_];
			aClass656_Sub1Array7229[i_399_]
			    = class656_sub1_sub4_398_;
		    } else {
			class656_sub1_sub4_398_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7228[i_399_];
			aClass656_Sub1Array7228[i_399_]
			    = class656_sub1_sub4_398_;
		    }
		} else {
		    class656_sub1_sub4_398_.aClass656_Sub1_10868
			= aClass656_Sub1Array7230[i_399_];
		    aClass656_Sub1Array7230[i_399_] = class656_sub1_sub4_398_;
		}
	    }
	}
    }
    
    void method9026(Class656_Sub1 class656_sub1, int i, int i_400_, int i_401_,
		    int i_402_, int i_403_) {
	boolean bool = true;
	int i_404_ = i_400_;
	int i_405_ = i_402_ + i_400_;
	int i_406_ = i_401_ - 1;
	int i_407_ = i_403_ + i_401_;
	for (int i_408_ = i; i_408_ <= i + 1; i_408_++) {
	    if (i_408_ != anInt7241 * 230317859) {
		for (int i_409_ = i_404_; i_409_ <= i_405_; i_409_++) {
		    if (i_409_ >= 0 && i_409_ < 1761949661 * anInt7210) {
			for (int i_410_ = i_406_; i_410_ <= i_407_; i_410_++) {
			    if (i_410_ >= 0 && i_410_ < anInt7211 * 947301287
				&& (!bool || i_409_ >= i_405_
				    || i_410_ >= i_407_
				    || i_410_ < i_401_ && i_409_ != i_400_)) {
				Class547 class547
				    = (aClass547ArrayArrayArray7263[i_408_]
				       [i_409_][i_410_]);
				if (class547 != null) {
				    int i_411_
					= (((aClass161Array7226[i_408_]
						 .method2577
					     (i_409_, i_410_, (byte) 9))
					    + (aClass161Array7226[i_408_]
						   .method2577
					       (1 + i_409_, i_410_, (byte) 94))
					    + (aClass161Array7226[i_408_]
						   .method2577
					       (i_409_, 1 + i_410_, (byte) 1))
					    + (aClass161Array7226[i_408_]
						   .method2577
					       (i_409_ + 1, i_410_ + 1,
						(byte) -16))) / 4
					   - ((aClass161Array7226[i].method2577
					       (i_400_, i_401_, (byte) 49))
					      + (aClass161Array7226[i]
						     .method2577
						 (1 + i_400_, i_401_,
						  (byte) -30))
					      + (aClass161Array7226[i]
						     .method2577
						 (i_400_, i_401_ + 1,
						  (byte) 73))
					      + (aClass161Array7226[i]
						     .method2577
						 (i_400_ + 1, 1 + i_401_,
						  (byte) -2))) / 4);
				    Class656_Sub1_Sub5 class656_sub1_sub5
					= class547.aClass656_Sub1_Sub5_7266;
				    Class656_Sub1_Sub5 class656_sub1_sub5_412_
					= class547.aClass656_Sub1_Sub5_7267;
				    if (class656_sub1_sub5 != null
					&& class656_sub1_sub5
					       .method16912(-428447673))
					class656_sub1.method16915
					    (aClass182_7204,
					     class656_sub1_sub5,
					     ((-466040829 * anInt7221
					       * (i_409_ - i_400_))
					      + (1 - i_402_) * (anInt7240
								* -576707309)),
					     i_411_,
					     ((-466040829 * anInt7221
					       * (i_410_ - i_401_))
					      + (1 - i_403_) * (-576707309
								* anInt7240)),
					     bool, 527478018);
				    if (class656_sub1_sub5_412_ != null
					&& class656_sub1_sub5_412_
					       .method16912(-506058959))
					class656_sub1.method16915
					    (aClass182_7204,
					     class656_sub1_sub5_412_,
					     ((i_409_ - i_400_) * (-466040829
								   * anInt7221)
					      + (-576707309 * anInt7240
						 * (1 - i_402_))),
					     i_411_,
					     ((-576707309 * anInt7240
					       * (1 - i_403_))
					      + (-466040829 * anInt7221
						 * (i_410_ - i_401_))),
					     bool, -320164274);
				    for (Class560 class560
					     = class547.aClass560_7272;
					 null != class560;
					 class560 = class560.aClass560_7546) {
					Class656_Sub1_Sub3 class656_sub1_sub3
					    = (class560
					       .aClass656_Sub1_Sub3_7547);
					if (class656_sub1_sub3 != null
					    && class656_sub1_sub3
						   .method16912(-70198594)
					    && ((class656_sub1_sub3.aShort11923
						 == i_409_)
						|| i_409_ == i_404_)
					    && (i_410_ == (class656_sub1_sub3
							   .aShort11925)
						|| i_406_ == i_410_)) {
					    int i_413_ = ((class656_sub1_sub3
							   .aShort11924)
							  - (class656_sub1_sub3
							     .aShort11923)
							  + 1);
					    int i_414_ = ((class656_sub1_sub3
							   .aShort11930)
							  - (class656_sub1_sub3
							     .aShort11925)
							  + 1);
					    class656_sub1.method16915
						(aClass182_7204,
						 class656_sub1_sub3,
						 ((anInt7221 * -466040829
						   * ((class656_sub1_sub3
						       .aShort11923)
						      - i_400_))
						  + (-576707309 * anInt7240
						     * (i_413_ - i_402_))),
						 i_411_,
						 ((-466040829 * anInt7221
						   * ((class656_sub1_sub3
						       .aShort11925)
						      - i_401_))
						  + (anInt7240 * -576707309
						     * (i_414_ - i_403_))),
						 bool, 1041670767);
					}
				    }
				}
			    }
			}
		    }
		}
		i_404_--;
		bool = false;
	    }
	}
    }
    
    public void method9027(int i, int i_415_, int i_416_,
			   Class656_Sub1_Sub4 class656_sub1_sub4,
			   Class656_Sub1_Sub4 class656_sub1_sub4_417_) {
	Class547 class547 = method9088(i, i_415_, i_416_, (byte) 14);
	if (class547 != null) {
	    class547.aClass656_Sub1_Sub4_7268 = class656_sub1_sub4;
	    class547.aClass656_Sub1_Sub4_7276 = class656_sub1_sub4_417_;
	    int i_418_ = aClass161Array7249 == aClass161Array7226 ? 1 : 0;
	    if (class656_sub1_sub4.method16913(1040451145)) {
		if (class656_sub1_sub4.method16914(-1847663524)) {
		    class656_sub1_sub4.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_418_];
		    aClass656_Sub1Array7229[i_418_] = class656_sub1_sub4;
		} else {
		    class656_sub1_sub4.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_418_];
		    aClass656_Sub1Array7228[i_418_] = class656_sub1_sub4;
		}
	    } else {
		class656_sub1_sub4.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_418_];
		aClass656_Sub1Array7230[i_418_] = class656_sub1_sub4;
	    }
	    if (class656_sub1_sub4_417_ != null) {
		if (class656_sub1_sub4_417_.method16913(1040451145)) {
		    if (class656_sub1_sub4_417_.method16914(-1944397203)) {
			class656_sub1_sub4_417_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7229[i_418_];
			aClass656_Sub1Array7229[i_418_]
			    = class656_sub1_sub4_417_;
		    } else {
			class656_sub1_sub4_417_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7228[i_418_];
			aClass656_Sub1Array7228[i_418_]
			    = class656_sub1_sub4_417_;
		    }
		} else {
		    class656_sub1_sub4_417_.aClass656_Sub1_10868
			= aClass656_Sub1Array7230[i_418_];
		    aClass656_Sub1Array7230[i_418_] = class656_sub1_sub4_417_;
		}
	    }
	}
    }
    
    public boolean method9028(Class656_Sub1_Sub3 class656_sub1_sub3,
			      boolean bool) {
	boolean bool_419_ = aClass161Array7226 == aClass161Array7249;
	int i = 0;
	short i_420_ = 0;
	byte i_421_ = 0;
	class656_sub1_sub3.method18557(-1543352883);
	short i_422_ = 0;
	int i_423_ = Math.min(anInt7210 * 1761949661 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11923));
	int i_424_ = Math.min(1761949661 * anInt7210 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11924));
	int i_425_ = Math.min(947301287 * anInt7211 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11925));
	int i_426_ = Math.min(947301287 * anInt7211 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11930));
	for (int i_427_ = i_423_; i_427_ <= i_424_; i_427_++) {
	    for (int i_428_ = i_425_; i_428_ <= i_426_; i_428_++) {
		Class547 class547 = method8942(class656_sub1_sub3.aByte10867,
					       i_427_, i_428_, (short) 32109);
		if (class547 != null) {
		    Class560 class560
			= Class233.method4398(class656_sub1_sub3, -207484275);
		    Class560 class560_429_ = class547.aClass560_7272;
		    if (class560_429_ == null)
			class547.aClass560_7272 = class560;
		    else {
			for (/**/; null != class560_429_.aClass560_7546;
			     class560_429_ = class560_429_.aClass560_7546) {
			    /* empty */
			}
			class560_429_.aClass560_7546 = class560;
		    }
		    if (bool_419_ && 0 != (anIntArrayArray7217[i_427_][i_428_]
					   & ~0xffffff)) {
			i = anIntArrayArray7217[i_427_][i_428_];
			i_420_ = aShortArrayArray7219[i_427_][i_428_];
			i_421_ = aByteArrayArray7259[i_427_][i_428_];
		    }
		    if (!bool && class547.aClass656_Sub1_Sub1_7264 != null
			&& (class547.aClass656_Sub1_Sub1_7264.aShort11836
			    > i_422_))
			i_422_ = class547.aClass656_Sub1_Sub1_7264.aShort11836;
		}
	    }
	}
	if (bool_419_ && 0 != (i & ~0xffffff)) {
	    for (int i_430_ = i_423_; i_430_ <= i_424_; i_430_++) {
		for (int i_431_ = i_425_; i_431_ <= i_426_; i_431_++) {
		    if ((anIntArrayArray7217[i_430_][i_431_] & ~0xffffff)
			== 0) {
			anIntArrayArray7217[i_430_][i_431_] = i;
			aShortArrayArray7219[i_430_][i_431_] = i_420_;
			aByteArrayArray7259[i_430_][i_431_] = i_421_;
		    }
		}
	    }
	}
	if (bool) {
	    aClass656_Sub1_Sub3Array7235
		[(anInt7224 += 1972563987) * -1849796069 - 1]
		= class656_sub1_sub3;
	    class656_sub1_sub3.aClass546_10872 = this;
	} else {
	    int i_432_ = aClass161Array7226 == aClass161Array7249 ? 1 : 0;
	    if (class656_sub1_sub3.method16913(1040451145)) {
		if (class656_sub1_sub3.method16914(-1900385798)) {
		    class656_sub1_sub3.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_432_];
		    aClass656_Sub1Array7229[i_432_] = class656_sub1_sub3;
		} else {
		    class656_sub1_sub3.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_432_];
		    aClass656_Sub1Array7228[i_432_] = class656_sub1_sub3;
		}
	    } else {
		class656_sub1_sub3.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_432_];
		aClass656_Sub1Array7230[i_432_] = class656_sub1_sub3;
	    }
	}
	if (bool) {
	    Class446 class446
		= Class446.method7209(class656_sub1_sub3.method10818()
				      .aClass446_4807);
	    class446.aFloat4896 -= (float) i_422_;
	    class656_sub1_sub3.method10823(class446);
	    class446.method7260();
	}
	return true;
    }
    
    public void method9029(HashMap hashmap) {
	aHashMap7258 = hashmap;
    }
    
    public void method9030(int i, int i_433_, int i_434_, int i_435_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_433_][i_434_];
	if (class547 != null) {
	    Class656_Sub1_Sub4 class656_sub1_sub4
		= class547.aClass656_Sub1_Sub4_7268;
	    Class656_Sub1_Sub4 class656_sub1_sub4_436_
		= class547.aClass656_Sub1_Sub4_7276;
	    if (null != class656_sub1_sub4) {
		class656_sub1_sub4.aShort11942
		    = (short) (class656_sub1_sub4.aShort11942 * i_435_
			       / (16 << 1819515263 * anInt7200 - 7));
		class656_sub1_sub4.aShort11939
		    = (short) (i_435_ * class656_sub1_sub4.aShort11939
			       / (16 << 1819515263 * anInt7200 - 7));
	    }
	    if (null != class656_sub1_sub4_436_) {
		class656_sub1_sub4_436_.aShort11942
		    = (short) (i_435_ * class656_sub1_sub4_436_.aShort11942
			       / (16 << anInt7200 * 1819515263 - 7));
		class656_sub1_sub4_436_.aShort11939
		    = (short) (i_435_ * class656_sub1_sub4_436_.aShort11939
			       / (16 << 1819515263 * anInt7200 - 7));
	    }
	}
    }
    
    public void method9031() {
	for (int i = 0; i < -1849796069 * anInt7224; i++) {
	    Class656_Sub1_Sub3 class656_sub1_sub3
		= aClass656_Sub1_Sub3Array7235[i];
	    method8966(class656_sub1_sub3, true, (byte) -70);
	    aClass656_Sub1_Sub3Array7235[i] = null;
	}
	anInt7224 = 0;
    }
    
    public void method9032(Class175 class175) {
	/* empty */
    }
    
    public Class656_Sub1_Sub5 method9033(int i, int i_437_, int i_438_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_437_][i_438_];
	if (null != class547) {
	    method8967(class547.aClass656_Sub1_Sub5_7266, -1938121569);
	    if (null != class547.aClass656_Sub1_Sub5_7266) {
		Class656_Sub1_Sub5 class656_sub1_sub5
		    = class547.aClass656_Sub1_Sub5_7266;
		class547.aClass656_Sub1_Sub5_7266 = null;
		return class656_sub1_sub5;
	    }
	}
	return null;
    }
    
    void method9034(Class656_Sub1 class656_sub1) {
	if (null != class656_sub1) {
	    class656_sub1.method10828();
	    for (int i = 0; i < 2; i++) {
		Class656_Sub1 class656_sub1_439_ = null;
		for (Class656_Sub1 class656_sub1_440_
			 = aClass656_Sub1Array7228[i];
		     class656_sub1_440_ != null;
		     class656_sub1_440_
			 = class656_sub1_440_.aClass656_Sub1_10868) {
		    if (class656_sub1_440_ == class656_sub1) {
			if (null != class656_sub1_439_)
			    class656_sub1_439_.aClass656_Sub1_10868
				= class656_sub1_440_.aClass656_Sub1_10868;
			else
			    aClass656_Sub1Array7228[i]
				= class656_sub1_440_.aClass656_Sub1_10868;
			return;
		    }
		    class656_sub1_439_ = class656_sub1_440_;
		}
		class656_sub1_439_ = null;
		for (Class656_Sub1 class656_sub1_441_
			 = aClass656_Sub1Array7229[i];
		     class656_sub1_441_ != null;
		     class656_sub1_441_
			 = class656_sub1_441_.aClass656_Sub1_10868) {
		    if (class656_sub1 == class656_sub1_441_) {
			if (null != class656_sub1_439_)
			    class656_sub1_439_.aClass656_Sub1_10868
				= class656_sub1_441_.aClass656_Sub1_10868;
			else
			    aClass656_Sub1Array7229[i]
				= class656_sub1_441_.aClass656_Sub1_10868;
			return;
		    }
		    class656_sub1_439_ = class656_sub1_441_;
		}
		class656_sub1_439_ = null;
		for (Class656_Sub1 class656_sub1_442_
			 = aClass656_Sub1Array7230[i];
		     null != class656_sub1_442_;
		     class656_sub1_442_
			 = class656_sub1_442_.aClass656_Sub1_10868) {
		    if (class656_sub1 == class656_sub1_442_) {
			if (null != class656_sub1_439_)
			    class656_sub1_439_.aClass656_Sub1_10868
				= class656_sub1_442_.aClass656_Sub1_10868;
			else
			    aClass656_Sub1Array7230[i]
				= class656_sub1_442_.aClass656_Sub1_10868;
			return;
		    }
		    class656_sub1_439_ = class656_sub1_442_;
		}
	    }
	}
    }
    
    public int method9035(int i, int i_443_, int i_444_) {
	return (anIntArrayArray7217 != null
		? anIntArrayArray7217[i][i_443_] & 0xffffff : 0);
    }
    
    public Class656_Sub1_Sub4 method9036(int i, int i_445_, int i_446_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_445_][i_446_];
	if (null != class547) {
	    method8967(class547.aClass656_Sub1_Sub4_7276, -48903167);
	    if (null != class547.aClass656_Sub1_Sub4_7276) {
		Class656_Sub1_Sub4 class656_sub1_sub4
		    = class547.aClass656_Sub1_Sub4_7276;
		class547.aClass656_Sub1_Sub4_7276 = null;
		return class656_sub1_sub4;
	    }
	}
	return null;
    }
    
    public Class656_Sub1_Sub1 method9037(int i, int i_447_, int i_448_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_447_][i_448_];
	if (null == class547)
	    return null;
	method8967(class547.aClass656_Sub1_Sub1_7264, 841708779);
	if (class547.aClass656_Sub1_Sub1_7264 != null) {
	    Class656_Sub1_Sub1 class656_sub1_sub1
		= class547.aClass656_Sub1_Sub1_7264;
	    class547.aClass656_Sub1_Sub1_7264 = null;
	    return class656_sub1_sub1;
	}
	return null;
    }
    
    public void method9038(Class564 class564, int i) {
	if (anInt7253 * 1999654737 < 65005) {
	    Class525_Sub21 class525_sub21 = class564.aClass525_Sub21_7595;
	    aClass564Array7255[1999654737 * anInt7253] = class564;
	    aBoolArray7256[1999654737 * anInt7253] = false;
	    anInt7253 += 640047537;
	    int i_449_ = -2032095817 * class564.anInt7578;
	    if (class564.aBool7587)
		i_449_ = 0;
	    int i_450_ = class564.anInt7578 * -2032095817;
	    if (class564.aBool7586)
		i_450_ = 230317859 * anInt7241 - 1;
	    for (int i_451_ = i_449_; i_451_ <= i_450_; i_451_++) {
		int i_452_ = 0;
		int i_453_ = ((class525_sub21.method16301((byte) 6)
			       - class525_sub21.method16332(1629057432)
			       + -576707309 * anInt7240)
			      >> anInt7200 * 1819515263);
		if (i_453_ < 0) {
		    i_452_ -= i_453_;
		    i_453_ = 0;
		}
		int i_454_ = ((class525_sub21.method16301((byte) 6)
			       + class525_sub21.method16332(2075072653)
			       - -576707309 * anInt7240)
			      >> 1819515263 * anInt7200);
		if (i_454_ >= 947301287 * anInt7211)
		    i_454_ = anInt7211 * 947301287 - 1;
		for (int i_455_ = i_453_; i_455_ <= i_454_; i_455_++) {
		    int i_456_ = class564.aShortArray7579[i_452_++];
		    int i_457_ = (((class525_sub21.method16314(1148276999)
				    - class525_sub21.method16332(1675554523)
				    + anInt7240 * -576707309)
				   >> anInt7200 * 1819515263)
				  + (i_456_ >>> 8));
		    int i_458_ = (i_456_ & 0xff) + i_457_ - 1;
		    if (i_457_ < 0)
			i_457_ = 0;
		    if (i_458_ >= anInt7210 * 1761949661)
			i_458_ = anInt7210 * 1761949661 - 1;
		    for (int i_459_ = i_457_; i_459_ <= i_458_; i_459_++) {
			long l
			    = aLongArrayArrayArray7254[i_451_][i_459_][i_455_];
			if (0L == (l & 0xffffL))
			    aLongArrayArrayArray7254[i_451_][i_459_][i_455_]
				= l | (long) (1999654737 * anInt7253);
			else if (0L == (l & 0xffff0000L))
			    aLongArrayArrayArray7254[i_451_][i_459_][i_455_]
				= l | (long) (anInt7253 * 1999654737) << 16;
			else if ((l & 0xffff00000000L) == 0L)
			    aLongArrayArrayArray7254[i_451_][i_459_][i_455_]
				= l | (long) (1999654737 * anInt7253) << 32;
			else if (0L == (l & ~0xffffffffffffL))
			    aLongArrayArrayArray7254[i_451_][i_459_][i_455_]
				= l | (long) (1999654737 * anInt7253) << 48;
		    }
		}
	    }
	    if (-1 != class564.anInt7596 * -749332275) {
		List list
		    = ((List)
		       aHashMap7257.get(Integer.valueOf(class564.anInt7596
							* -749332275)));
		if (list == null) {
		    list = new ArrayList();
		    aHashMap7257.put(Integer.valueOf(class564.anInt7596
						     * -749332275),
				     list);
		}
		list.add(class564);
		Class525_Sub21 class525_sub21_460_
		    = ((Class525_Sub21)
		       aHashMap7258.get(Integer.valueOf(class564.anInt7596
							* -749332275)));
		if (class525_sub21_460_ != null) {
		    class564.aClass525_Sub21_7595.method16309
			(class525_sub21_460_.method16298(-1284970456),
			 99304590);
		    class564.aClass525_Sub21_7595.method16302
			(class525_sub21_460_.method16307(-450990622),
			 class525_sub21_460_.method16308((byte) 123),
			 -2126195817);
		}
	    }
	}
    }
    
    public void method9039(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_461_, int i_462_, boolean[] bools,
			   int i_463_) {
	if (aClass161Array7226 != aClass161Array7249) {
	    int i_464_
		= aClass161Array7215[i].method2619(i_461_, i_462_, -694368093);
	    for (int i_465_ = 0; i_465_ <= i; i_465_++) {
		if (bools == null || bools[i_465_]) {
		    Class161 class161 = aClass161Array7215[i_465_];
		    if (null != class161)
			class161.method2575(class525_sub16_sub17, i_461_,
					    (i_464_
					     - class161.method2619(i_461_,
								   i_462_,
								   608862040)),
					    i_462_, 0, false);
		}
	    }
	}
    }
    
    void method9040(Class656_Sub1 class656_sub1, int i, int i_466_, int i_467_,
		    int i_468_, int i_469_) {
	boolean bool = true;
	int i_470_ = i_466_;
	int i_471_ = i_468_ + i_466_;
	int i_472_ = i_467_ - 1;
	int i_473_ = i_469_ + i_467_;
	for (int i_474_ = i; i_474_ <= i + 1; i_474_++) {
	    if (i_474_ != anInt7241 * 230317859) {
		for (int i_475_ = i_470_; i_475_ <= i_471_; i_475_++) {
		    if (i_475_ >= 0 && i_475_ < 1761949661 * anInt7210) {
			for (int i_476_ = i_472_; i_476_ <= i_473_; i_476_++) {
			    if (i_476_ >= 0 && i_476_ < anInt7211 * 947301287
				&& (!bool || i_475_ >= i_471_
				    || i_476_ >= i_473_
				    || i_476_ < i_467_ && i_475_ != i_466_)) {
				Class547 class547
				    = (aClass547ArrayArrayArray7263[i_474_]
				       [i_475_][i_476_]);
				if (class547 != null) {
				    int i_477_
					= (((aClass161Array7226[i_474_]
						 .method2577
					     (i_475_, i_476_, (byte) 1))
					    + (aClass161Array7226[i_474_]
						   .method2577
					       (1 + i_475_, i_476_,
						(byte) -16))
					    + (aClass161Array7226[i_474_]
						   .method2577
					       (i_475_, 1 + i_476_, (byte) 27))
					    + (aClass161Array7226[i_474_]
						   .method2577
					       (i_475_ + 1, i_476_ + 1,
						(byte) 41))) / 4
					   - ((aClass161Array7226[i].method2577
					       (i_466_, i_467_, (byte) -49))
					      + (aClass161Array7226[i]
						     .method2577
						 (1 + i_466_, i_467_,
						  (byte) -49))
					      + (aClass161Array7226[i]
						     .method2577
						 (i_466_, i_467_ + 1,
						  (byte) 29))
					      + (aClass161Array7226[i]
						     .method2577
						 (i_466_ + 1, 1 + i_467_,
						  (byte) -14))) / 4);
				    Class656_Sub1_Sub5 class656_sub1_sub5
					= class547.aClass656_Sub1_Sub5_7266;
				    Class656_Sub1_Sub5 class656_sub1_sub5_478_
					= class547.aClass656_Sub1_Sub5_7267;
				    if (class656_sub1_sub5 != null
					&& class656_sub1_sub5
					       .method16912(-659516199))
					class656_sub1.method16915
					    (aClass182_7204,
					     class656_sub1_sub5,
					     ((-466040829 * anInt7221
					       * (i_475_ - i_466_))
					      + (1 - i_468_) * (anInt7240
								* -576707309)),
					     i_477_,
					     ((-466040829 * anInt7221
					       * (i_476_ - i_467_))
					      + (1 - i_469_) * (-576707309
								* anInt7240)),
					     bool, -343394152);
				    if (class656_sub1_sub5_478_ != null
					&& class656_sub1_sub5_478_
					       .method16912(522062316))
					class656_sub1.method16915
					    (aClass182_7204,
					     class656_sub1_sub5_478_,
					     ((i_475_ - i_466_) * (-466040829
								   * anInt7221)
					      + (-576707309 * anInt7240
						 * (1 - i_468_))),
					     i_477_,
					     ((-576707309 * anInt7240
					       * (1 - i_469_))
					      + (-466040829 * anInt7221
						 * (i_476_ - i_467_))),
					     bool, -2130375491);
				    for (Class560 class560
					     = class547.aClass560_7272;
					 null != class560;
					 class560 = class560.aClass560_7546) {
					Class656_Sub1_Sub3 class656_sub1_sub3
					    = (class560
					       .aClass656_Sub1_Sub3_7547);
					if (class656_sub1_sub3 != null
					    && class656_sub1_sub3
						   .method16912(-16785042)
					    && ((class656_sub1_sub3.aShort11923
						 == i_475_)
						|| i_475_ == i_470_)
					    && (i_476_ == (class656_sub1_sub3
							   .aShort11925)
						|| i_472_ == i_476_)) {
					    int i_479_ = ((class656_sub1_sub3
							   .aShort11924)
							  - (class656_sub1_sub3
							     .aShort11923)
							  + 1);
					    int i_480_ = ((class656_sub1_sub3
							   .aShort11930)
							  - (class656_sub1_sub3
							     .aShort11925)
							  + 1);
					    class656_sub1.method16915
						(aClass182_7204,
						 class656_sub1_sub3,
						 ((anInt7221 * -466040829
						   * ((class656_sub1_sub3
						       .aShort11923)
						      - i_466_))
						  + (-576707309 * anInt7240
						     * (i_479_ - i_468_))),
						 i_477_,
						 ((-466040829 * anInt7221
						   * ((class656_sub1_sub3
						       .aShort11925)
						      - i_467_))
						  + (anInt7240 * -576707309
						     * (i_480_ - i_469_))),
						 bool, -43362094);
					}
				    }
				}
			    }
			}
		    }
		}
		i_470_--;
		bool = false;
	    }
	}
    }
    
    void method9041(Class656_Sub1 class656_sub1, int i, int i_481_,
		    int i_482_) {
	if (i_481_ < anInt7210 * 1761949661) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][1 + i_481_][i_482_];
	    if (class547 != null && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-315164961)) {
		int i_483_
		    = ((aClass161Array7226[i].method2577(1 + i_481_, i_482_,
							 (byte) 57)
			+ aClass161Array7226[i].method2577(i_481_ + 1 + 1,
							   i_482_, (byte) 68)
			+ aClass161Array7226[i]
			      .method2577(1 + i_481_, 1 + i_482_, (byte) 40)
			+ aClass161Array7226[i].method2577(1 + (i_481_ + 1),
							   i_482_ + 1,
							   (byte) -36)) / 4
		       - (aClass161Array7226[i].method2577(i_481_, i_482_,
							   (byte) 43)
			  + aClass161Array7226[i]
				.method2577(i_481_ + 1, i_482_, (byte) -14)
			  + aClass161Array7226[i]
				.method2577(i_481_, 1 + i_482_, (byte) -16)
			  + aClass161Array7226[i].method2577(i_481_ + 1,
							     i_482_ + 1,
							     (byte) -65)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  -466040829 * anInt7221, i_483_, 0,
					  true, -318016444);
	    }
	}
	if (i_482_ < anInt7210 * 1761949661) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_481_][i_482_ + 1];
	    if (class547 != null && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-392141070)) {
		int i_484_
		    = ((aClass161Array7226[i].method2577(i_481_, i_482_,
							 (byte) -100)
			+ aClass161Array7226[i]
			      .method2577(i_481_ + 1, i_482_ + 1, (byte) -8)
			+ aClass161Array7226[i]
			      .method2577(i_481_, 1 + i_482_ + 1, (byte) -93)
			+ aClass161Array7226[i].method2577(i_481_ + 1,
							   1 + (i_482_ + 1),
							   (byte) -72)) / 4
		       - (aClass161Array7226[i].method2577(i_481_, i_482_,
							   (byte) -21)
			  + aClass161Array7226[i].method2577(i_481_ + 1,
							     i_482_, (byte) 11)
			  + aClass161Array7226[i]
				.method2577(i_481_, 1 + i_482_, (byte) -20)
			  + aClass161Array7226[i].method2577(1 + i_481_,
							     i_482_ + 1,
							     (byte) -86)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264, 0,
					  i_484_, -466040829 * anInt7221, true,
					  2009508968);
	    }
	}
	if (i_481_ < anInt7210 * 1761949661
	    && i_482_ < 947301287 * anInt7211) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_481_ + 1][1 + i_482_];
	    if (null != class547 && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-497073170)) {
		int i_485_
		    = ((aClass161Array7226[i]
			    .method2577(1 + i_481_, 1 + i_482_, (byte) -34)
			+ aClass161Array7226[i].method2577(i_481_ + 1 + 1,
							   1 + i_482_,
							   (byte) -58)
			+ aClass161Array7226[i].method2577(i_481_ + 1,
							   1 + (1 + i_482_),
							   (byte) 9)
			+ aClass161Array7226[i].method2577(1 + (1 + i_481_),
							   i_482_ + 1 + 1,
							   (byte) -94)) / 4
		       - (aClass161Array7226[i].method2577(i_481_, i_482_,
							   (byte) 14)
			  + aClass161Array7226[i].method2577(1 + i_481_,
							     i_482_, (byte) 10)
			  + aClass161Array7226[i]
				.method2577(i_481_, 1 + i_482_, (byte) -56)
			  + aClass161Array7226[i].method2577(i_481_ + 1,
							     i_482_ + 1,
							     (byte) -10)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  anInt7221 * -466040829, i_485_,
					  -466040829 * anInt7221, true,
					  -1356043744);
	    }
	}
	if (i_481_ < anInt7210 * 1761949661 && i_482_ > 0) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_481_ + 1][i_482_ - 1];
	    if (class547 != null && null != class547.aClass656_Sub1_Sub1_7264
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-676123787)) {
		int i_486_
		    = ((aClass161Array7226[i]
			    .method2577(1 + i_481_, i_482_ - 1, (byte) -48)
			+ aClass161Array7226[i].method2577(1 + i_481_ + 1,
							   i_482_ - 1,
							   (byte) -23)
			+ aClass161Array7226[i].method2577(1 + i_481_,
							   1 + i_482_ - 1,
							   (byte) -85)
			+ aClass161Array7226[i].method2577(1 + i_481_ + 1,
							   i_482_ + 1 - 1,
							   (byte) 44)) / 4
		       - (aClass161Array7226[i].method2577(i_481_, i_482_,
							   (byte) -51)
			  + aClass161Array7226[i]
				.method2577(i_481_ + 1, i_482_, (byte) -80)
			  + aClass161Array7226[i]
				.method2577(i_481_, 1 + i_482_, (byte) -26)
			  + aClass161Array7226[i].method2577(i_481_ + 1,
							     i_482_ + 1,
							     (byte) 54)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  -466040829 * anInt7221, i_486_,
					  -(anInt7221 * -466040829), true,
					  -735413516);
	    }
	}
    }
    
    public int method9042(int i, int i_487_) {
	return (aByteArrayArray7201 != null
		? aByteArrayArray7201[i][i_487_] & 0xff : 0);
    }
    
    void method9043(Class656_Sub1_Sub3 class656_sub1_sub3, boolean bool) {
	int i = Math.min(1761949661 * anInt7210 - 1,
			 Math.max(0, class656_sub1_sub3.aShort11923));
	int i_488_ = Math.min(anInt7210 * 1761949661 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11924));
	int i_489_ = Math.min(947301287 * anInt7211 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11925));
	int i_490_ = Math.min(anInt7211 * 947301287 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11930));
	for (int i_491_ = i; i_491_ <= i_488_; i_491_++) {
	    for (int i_492_ = i_489_; i_492_ <= i_490_; i_492_++) {
		Class547 class547
		    = (aClass547ArrayArrayArray7263
		       [class656_sub1_sub3.aByte10867][i_491_][i_492_]);
		if (null != class547) {
		    Class560 class560 = class547.aClass560_7272;
		    Class560 class560_493_ = null;
		    for (/**/; null != class560;
			 class560 = class560.aClass560_7546) {
			if (class560.aClass656_Sub1_Sub3_7547
			    == class656_sub1_sub3) {
			    if (null != class560_493_)
				class560_493_.aClass560_7546
				    = class560.aClass560_7546;
			    else
				class547.aClass560_7272
				    = class560.aClass560_7546;
			    class560.method9403(-1735533430);
			    break;
			}
			class560_493_ = class560;
		    }
		}
	    }
	}
	if (!bool)
	    method8967(class656_sub1_sub3, -1906205581);
    }
    
    public void method9044(int i, int i_494_, int i_495_,
			   Class656_Sub1_Sub5 class656_sub1_sub5,
			   Class656_Sub1_Sub5 class656_sub1_sub5_496_) {
	Class547 class547 = method9088(i, i_494_, i_495_, (byte) 14);
	if (class547 != null) {
	    class547.aClass656_Sub1_Sub5_7266 = class656_sub1_sub5;
	    class547.aClass656_Sub1_Sub5_7267 = class656_sub1_sub5_496_;
	    int i_497_ = aClass161Array7226 == aClass161Array7249 ? 1 : 0;
	    if (class656_sub1_sub5.method16913(1040451145)) {
		if (class656_sub1_sub5.method16914(-2039540978)) {
		    class656_sub1_sub5.aClass656_Sub1_10868
			= aClass656_Sub1Array7229[i_497_];
		    aClass656_Sub1Array7229[i_497_] = class656_sub1_sub5;
		} else {
		    class656_sub1_sub5.aClass656_Sub1_10868
			= aClass656_Sub1Array7228[i_497_];
		    aClass656_Sub1Array7228[i_497_] = class656_sub1_sub5;
		}
	    } else {
		class656_sub1_sub5.aClass656_Sub1_10868
		    = aClass656_Sub1Array7230[i_497_];
		aClass656_Sub1Array7230[i_497_] = class656_sub1_sub5;
	    }
	    if (null != class656_sub1_sub5_496_) {
		if (class656_sub1_sub5_496_.method16913(1040451145)) {
		    if (class656_sub1_sub5_496_.method16914(-1836724590)) {
			class656_sub1_sub5_496_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7229[i_497_];
			aClass656_Sub1Array7229[i_497_]
			    = class656_sub1_sub5_496_;
		    } else {
			class656_sub1_sub5_496_.aClass656_Sub1_10868
			    = aClass656_Sub1Array7228[i_497_];
			aClass656_Sub1Array7228[i_497_]
			    = class656_sub1_sub5_496_;
		    }
		} else {
		    class656_sub1_sub5_496_.aClass656_Sub1_10868
			= aClass656_Sub1Array7230[i_497_];
		    aClass656_Sub1Array7230[i_497_] = class656_sub1_sub5_496_;
		}
	    }
	}
    }
    
    public Class656_Sub1_Sub5 method9045(int i, int i_498_, int i_499_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_498_][i_499_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub5_7266;
    }
    
    public Class656_Sub1_Sub5 method9046(int i, int i_500_, int i_501_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_500_][i_501_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub5_7266;
    }
    
    public HashMap method9047(int i) {
	aHashMap7258.clear();
	Iterator iterator = aHashMap7257.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    aHashMap7258.put(entry.getKey(),
			     (((Class564) ((List) entry.getValue()).get(0))
			      .aClass525_Sub21_7595));
	}
	return aHashMap7258;
    }
    
    public void method9048(int i, int i_502_, int i_503_) {
	List list = (List) aHashMap7257.get(Integer.valueOf(i));
	if (list != null) {
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class564 class564 = (Class564) iterator.next();
		class564.aClass525_Sub21_7595.method16302(i_502_, i_503_,
							  -2119409535);
	    }
	}
    }
    
    public Class656_Sub1_Sub5 method9049(int i, int i_504_, int i_505_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_504_][i_505_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub5_7266;
    }
    
    public Class656_Sub1_Sub4 method9050(int i, int i_506_, int i_507_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_506_][i_507_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub4_7268;
    }
    
    public void method9051(Class564 class564) {
	if (anInt7253 * 1999654737 < 65005) {
	    Class525_Sub21 class525_sub21 = class564.aClass525_Sub21_7595;
	    aClass564Array7255[1999654737 * anInt7253] = class564;
	    aBoolArray7256[1999654737 * anInt7253] = false;
	    anInt7253 += 640047537;
	    int i = -2032095817 * class564.anInt7578;
	    if (class564.aBool7587)
		i = 0;
	    int i_508_ = class564.anInt7578 * -2032095817;
	    if (class564.aBool7586)
		i_508_ = 230317859 * anInt7241 - 1;
	    for (int i_509_ = i; i_509_ <= i_508_; i_509_++) {
		int i_510_ = 0;
		int i_511_ = ((class525_sub21.method16301((byte) 6)
			       - class525_sub21.method16332(1791200074)
			       + -576707309 * anInt7240)
			      >> anInt7200 * 1819515263);
		if (i_511_ < 0) {
		    i_510_ -= i_511_;
		    i_511_ = 0;
		}
		int i_512_ = ((class525_sub21.method16301((byte) 6)
			       + class525_sub21.method16332(1768197667)
			       - -576707309 * anInt7240)
			      >> 1819515263 * anInt7200);
		if (i_512_ >= 947301287 * anInt7211)
		    i_512_ = anInt7211 * 947301287 - 1;
		for (int i_513_ = i_511_; i_513_ <= i_512_; i_513_++) {
		    int i_514_ = class564.aShortArray7579[i_510_++];
		    int i_515_ = (((class525_sub21.method16314(301395838)
				    - class525_sub21.method16332(1609736705)
				    + anInt7240 * -576707309)
				   >> anInt7200 * 1819515263)
				  + (i_514_ >>> 8));
		    int i_516_ = (i_514_ & 0xff) + i_515_ - 1;
		    if (i_515_ < 0)
			i_515_ = 0;
		    if (i_516_ >= anInt7210 * 1761949661)
			i_516_ = anInt7210 * 1761949661 - 1;
		    for (int i_517_ = i_515_; i_517_ <= i_516_; i_517_++) {
			long l
			    = aLongArrayArrayArray7254[i_509_][i_517_][i_513_];
			if (0L == (l & 0xffffL))
			    aLongArrayArrayArray7254[i_509_][i_517_][i_513_]
				= l | (long) (1999654737 * anInt7253);
			else if (0L == (l & 0xffff0000L))
			    aLongArrayArrayArray7254[i_509_][i_517_][i_513_]
				= l | (long) (anInt7253 * 1999654737) << 16;
			else if ((l & 0xffff00000000L) == 0L)
			    aLongArrayArrayArray7254[i_509_][i_517_][i_513_]
				= l | (long) (1999654737 * anInt7253) << 32;
			else if (0L == (l & ~0xffffffffffffL))
			    aLongArrayArrayArray7254[i_509_][i_517_][i_513_]
				= l | (long) (1999654737 * anInt7253) << 48;
		    }
		}
	    }
	    if (-1 != class564.anInt7596 * -749332275) {
		List list
		    = ((List)
		       aHashMap7257.get(Integer.valueOf(class564.anInt7596
							* -749332275)));
		if (list == null) {
		    list = new ArrayList();
		    aHashMap7257.put(Integer.valueOf(class564.anInt7596
						     * -749332275),
				     list);
		}
		list.add(class564);
		Class525_Sub21 class525_sub21_518_
		    = ((Class525_Sub21)
		       aHashMap7258.get(Integer.valueOf(class564.anInt7596
							* -749332275)));
		if (class525_sub21_518_ != null) {
		    class564.aClass525_Sub21_7595.method16309
			(class525_sub21_518_.method16298(-2079195903),
			 1754910042);
		    class564.aClass525_Sub21_7595.method16302
			(class525_sub21_518_.method16307(8733089),
			 class525_sub21_518_.method16308((byte) 49),
			 -2145937346);
		}
	    }
	}
    }
    
    public Class656_Sub1_Sub4 method9052(int i, int i_519_, int i_520_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_519_][i_520_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub4_7268;
    }
    
    public void method9053(int i) {
	/* empty */
    }
    
    public Class656_Sub1_Sub3 method9054(int i, int i_521_, int i_522_,
					 Interface63 interface63) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_521_][i_522_];
	if (null == class547)
	    return null;
	for (Class560 class560 = class547.aClass560_7272; null != class560;
	     class560 = class560.aClass560_7546) {
	    Class656_Sub1_Sub3 class656_sub1_sub3
		= class560.aClass656_Sub1_Sub3_7547;
	    if ((interface63 == null
		 || interface63.method414(class656_sub1_sub3, 1292256124))
		&& class656_sub1_sub3.aShort11923 == i_521_
		&& class656_sub1_sub3.aShort11925 == i_522_)
		return class656_sub1_sub3;
	}
	return null;
    }
    
    public Class656_Sub1_Sub3 method9055(int i, int i_523_, int i_524_,
					 Interface63 interface63) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_523_][i_524_];
	if (null == class547)
	    return null;
	for (Class560 class560 = class547.aClass560_7272; null != class560;
	     class560 = class560.aClass560_7546) {
	    Class656_Sub1_Sub3 class656_sub1_sub3
		= class560.aClass656_Sub1_Sub3_7547;
	    if ((interface63 == null
		 || interface63.method414(class656_sub1_sub3, -429311259))
		&& class656_sub1_sub3.aShort11923 == i_523_
		&& class656_sub1_sub3.aShort11925 == i_524_)
		return class656_sub1_sub3;
	}
	return null;
    }
    
    public Class560 method9056(int i, int i_525_, int i_526_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_525_][i_526_];
	if (null == class547)
	    return null;
	return class547.aClass560_7272;
    }
    
    void method9057(Class656_Sub1 class656_sub1,
		    Class525_Sub21[] class525_sub21s) {
	if (aBool7213) {
	    int i = class656_sub1.method16920(class525_sub21s, -1250832101);
	    aClass182_7204.method3244(i, class525_sub21s);
	}
	if (aClass161Array7226 == aClass161Array7249) {
	    boolean bool = false;
	    boolean bool_527_ = false;
	    Class446 class446 = class656_sub1.method10818().aClass446_4807;
	    int i;
	    int i_528_;
	    if (class656_sub1 instanceof Class656_Sub1_Sub3) {
		i = ((Class656_Sub1_Sub3) class656_sub1).aShort11923;
		i_528_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11925;
	    } else {
		i = (int) class446.aFloat4895 >> 1819515263 * anInt7200;
		i_528_ = (int) class446.aFloat4897 >> anInt7200 * 1819515263;
	    }
	    i = Math.min(anInt7210 * 1761949661 - 1, Math.max(0, i));
	    i_528_ = Math.min(947301287 * anInt7211 - 1, Math.max(0, i_528_));
	    Class176 class176 = new Class176();
	    class176.anInt1877
		= method9035(i, i_528_, -483598254) * -455052721;
	    class176.anInt1879 = method8945(i, i_528_, 889283761) * 616962313;
	    class176.anInt1883
		= method8947(i, i_528_, -2122460352) * 575868967;
	    class176.anInt1881
		= method8948(i, i_528_, -1334640927) * -1237930075;
	    class176.anInt1882 = method8949(i, i_528_, 1510832302) * 506197425;
	    class176.anInt1878 = method8950(i, i_528_, -932381380) * 86130037;
	    aClass182_7204.method3262
		(aClass161Array7215[0].method2619((int) class446.aFloat4895,
						  (int) class446.aFloat4897,
						  -1498349970),
		 class176);
	}
	Class567 class567
	    = class656_sub1.method16917(aClass182_7204, -1316484210);
	if (class567 != null) {
	    if (class567.aBool7608) {
		class567.aClass656_Sub1_7606 = class656_sub1;
		aClass557_7207.method9360(class567, (short) -8508);
	    } else
		Class168.method2718(class567, -1989963801);
	}
    }
    
    public Class656_Sub1_Sub2 method9058(int i, int i_529_, int i_530_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_529_][i_530_];
	if (null == class547)
	    return null;
	Class656_Sub1_Sub2 class656_sub1_sub2
	    = class547.aClass656_Sub1_Sub2_7275;
	class547.aClass656_Sub1_Sub2_7275 = null;
	method8967(class656_sub1_sub2, 891661953);
	return class656_sub1_sub2;
    }
    
    public HashMap method9059() {
	aHashMap7258.clear();
	Iterator iterator = aHashMap7257.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    aHashMap7258.put(entry.getKey(),
			     (((Class564) ((List) entry.getValue()).get(0))
			      .aClass525_Sub21_7595));
	}
	return aHashMap7258;
    }
    
    public Class656_Sub1_Sub1 method9060(int i, int i_531_, int i_532_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_531_][i_532_];
	if (class547 == null || null == class547.aClass656_Sub1_Sub1_7264)
	    return null;
	return class547.aClass656_Sub1_Sub1_7264;
    }
    
    public void method9061() {
	for (int i = 0; i < 230317859 * anInt7241; i++) {
	    for (int i_533_ = 0; i_533_ < 1761949661 * anInt7210; i_533_++) {
		for (int i_534_ = 0; i_534_ < anInt7211 * 947301287;
		     i_534_++) {
		    Class547 class547
			= aClass547ArrayArrayArray7263[i][i_533_][i_534_];
		    if (class547 != null) {
			Class656_Sub1_Sub5 class656_sub1_sub5
			    = class547.aClass656_Sub1_Sub5_7266;
			Class656_Sub1_Sub5 class656_sub1_sub5_535_
			    = class547.aClass656_Sub1_Sub5_7267;
			if (null != class656_sub1_sub5
			    && class656_sub1_sub5.method16912(1884346623)) {
			    method9024(class656_sub1_sub5, i, i_533_, i_534_,
				       1, 1);
			    if (null != class656_sub1_sub5_535_
				&& class656_sub1_sub5_535_
				       .method16912(915617579)) {
				method9024(class656_sub1_sub5_535_, i, i_533_,
					   i_534_, 1, 1);
				class656_sub1_sub5_535_.method16915
				    (aClass182_7204, class656_sub1_sub5, 0, 0,
				     0, false, 1230912310);
				class656_sub1_sub5_535_
				    .method16916(1889637457);
			    }
			    class656_sub1_sub5.method16916(1639280923);
			}
			for (Class560 class560 = class547.aClass560_7272;
			     class560 != null;
			     class560 = class560.aClass560_7546) {
			    Class656_Sub1_Sub3 class656_sub1_sub3
				= class560.aClass656_Sub1_Sub3_7547;
			    if (class656_sub1_sub3 != null
				&& class656_sub1_sub3
				       .method16912(1305408061)) {
				method9024(class656_sub1_sub3, i, i_533_,
					   i_534_,
					   (class656_sub1_sub3.aShort11924
					    - class656_sub1_sub3.aShort11923
					    + 1),
					   1 + (class656_sub1_sub3.aShort11930
						- (class656_sub1_sub3
						   .aShort11925)));
				class656_sub1_sub3.method16916(768481969);
			    }
			}
			Class656_Sub1_Sub1 class656_sub1_sub1
			    = class547.aClass656_Sub1_Sub1_7264;
			if (null != class656_sub1_sub1
			    && class656_sub1_sub1.method16912(1992731473)) {
			    method8976(class656_sub1_sub1, i, i_533_, i_534_,
				       -764164205);
			    class656_sub1_sub1.method16916(1167574336);
			}
		    }
		}
	    }
	}
    }
    
    void method9062(Class656_Sub1 class656_sub1, int i, int i_536_,
		    int i_537_) {
	if (i_536_ < anInt7210 * 1761949661) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][1 + i_536_][i_537_];
	    if (class547 != null && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-345356245)) {
		int i_538_
		    = ((aClass161Array7226[i].method2577(1 + i_536_, i_537_,
							 (byte) -10)
			+ aClass161Array7226[i].method2577(i_536_ + 1 + 1,
							   i_537_, (byte) 1)
			+ aClass161Array7226[i]
			      .method2577(1 + i_536_, 1 + i_537_, (byte) -8)
			+ aClass161Array7226[i].method2577(1 + (i_536_ + 1),
							   i_537_ + 1,
							   (byte) -84)) / 4
		       - (aClass161Array7226[i].method2577(i_536_, i_537_,
							   (byte) 35)
			  + aClass161Array7226[i].method2577(i_536_ + 1,
							     i_537_, (byte) 11)
			  + aClass161Array7226[i]
				.method2577(i_536_, 1 + i_537_, (byte) 24)
			  + aClass161Array7226[i].method2577(i_536_ + 1,
							     i_537_ + 1,
							     (byte) -5)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  -466040829 * anInt7221, i_538_, 0,
					  true, 1933863777);
	    }
	}
	if (i_537_ < anInt7210 * 1761949661) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_536_][i_537_ + 1];
	    if (class547 != null && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(1483923025)) {
		int i_539_
		    = ((aClass161Array7226[i].method2577(i_536_, i_537_,
							 (byte) -54)
			+ aClass161Array7226[i]
			      .method2577(i_536_ + 1, i_537_ + 1, (byte) 8)
			+ aClass161Array7226[i]
			      .method2577(i_536_, 1 + i_537_ + 1, (byte) -61)
			+ aClass161Array7226[i].method2577(i_536_ + 1,
							   1 + (i_537_ + 1),
							   (byte) -50)) / 4
		       - (aClass161Array7226[i].method2577(i_536_, i_537_,
							   (byte) -69)
			  + aClass161Array7226[i].method2577(i_536_ + 1,
							     i_537_, (byte) 27)
			  + aClass161Array7226[i]
				.method2577(i_536_, 1 + i_537_, (byte) -45)
			  + aClass161Array7226[i].method2577(1 + i_536_,
							     i_537_ + 1,
							     (byte) -73)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264, 0,
					  i_539_, -466040829 * anInt7221, true,
					  1965285701);
	    }
	}
	if (i_536_ < anInt7210 * 1761949661
	    && i_537_ < 947301287 * anInt7211) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_536_ + 1][1 + i_537_];
	    if (null != class547 && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(1990342524)) {
		int i_540_
		    = ((aClass161Array7226[i]
			    .method2577(1 + i_536_, 1 + i_537_, (byte) -12)
			+ aClass161Array7226[i].method2577(i_536_ + 1 + 1,
							   1 + i_537_,
							   (byte) -66)
			+ aClass161Array7226[i].method2577(i_536_ + 1,
							   1 + (1 + i_537_),
							   (byte) 38)
			+ aClass161Array7226[i].method2577(1 + (1 + i_536_),
							   i_537_ + 1 + 1,
							   (byte) 76)) / 4
		       - (aClass161Array7226[i].method2577(i_536_, i_537_,
							   (byte) -31)
			  + aClass161Array7226[i].method2577(1 + i_536_,
							     i_537_, (byte) -9)
			  + aClass161Array7226[i]
				.method2577(i_536_, 1 + i_537_, (byte) -12)
			  + aClass161Array7226[i].method2577(i_536_ + 1,
							     i_537_ + 1,
							     (byte) 99)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  anInt7221 * -466040829, i_540_,
					  -466040829 * anInt7221, true,
					  -2146749241);
	    }
	}
	if (i_536_ < anInt7210 * 1761949661 && i_537_ > 0) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_536_ + 1][i_537_ - 1];
	    if (class547 != null && null != class547.aClass656_Sub1_Sub1_7264
		&& class547.aClass656_Sub1_Sub1_7264.method16912(717872557)) {
		int i_541_
		    = ((aClass161Array7226[i]
			    .method2577(1 + i_536_, i_537_ - 1, (byte) -25)
			+ aClass161Array7226[i].method2577(1 + i_536_ + 1,
							   i_537_ - 1,
							   (byte) -94)
			+ aClass161Array7226[i].method2577(1 + i_536_,
							   1 + i_537_ - 1,
							   (byte) 18)
			+ aClass161Array7226[i].method2577(1 + i_536_ + 1,
							   i_537_ + 1 - 1,
							   (byte) 58)) / 4
		       - (aClass161Array7226[i].method2577(i_536_, i_537_,
							   (byte) 23)
			  + aClass161Array7226[i].method2577(i_536_ + 1,
							     i_537_, (byte) 26)
			  + aClass161Array7226[i]
				.method2577(i_536_, 1 + i_537_, (byte) -1)
			  + aClass161Array7226[i].method2577(i_536_ + 1,
							     i_537_ + 1,
							     (byte) 35)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  -466040829 * anInt7221, i_541_,
					  -(anInt7221 * -466040829), true,
					  -610121237);
	    }
	}
    }
    
    public void method9063(int i, int i_542_, int i_543_, int i_544_) {
	boolean bool = (aClass547ArrayArrayArray7263[0][i_542_][i_543_] != null
			&& (aClass547ArrayArrayArray7263[0][i_542_][i_543_]
			    .aClass547_7269) != null);
	for (int i_545_ = i; i_545_ >= 0; i_545_--) {
	    if (aClass547ArrayArrayArray7263[i_545_][i_542_][i_543_] == null) {
		Class547 class547
		    = (aClass547ArrayArrayArray7263[i_545_][i_542_][i_543_]
		       = new Class547(i_545_));
		if (bool)
		    class547.aByte7271++;
	    }
	}
    }
    
    void method9064(Class656_Sub1 class656_sub1, int i, int i_546_,
		    int i_547_) {
	if (i_546_ < anInt7210 * 1761949661) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][1 + i_546_][i_547_];
	    if (class547 != null && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-729926480)) {
		int i_548_
		    = ((aClass161Array7226[i].method2577(1 + i_546_, i_547_,
							 (byte) 35)
			+ aClass161Array7226[i].method2577(i_546_ + 1 + 1,
							   i_547_, (byte) -9)
			+ aClass161Array7226[i]
			      .method2577(1 + i_546_, 1 + i_547_, (byte) -68)
			+ aClass161Array7226[i].method2577(1 + (i_546_ + 1),
							   i_547_ + 1,
							   (byte) 13)) / 4
		       - (aClass161Array7226[i].method2577(i_546_, i_547_,
							   (byte) -48)
			  + aClass161Array7226[i]
				.method2577(i_546_ + 1, i_547_, (byte) -45)
			  + aClass161Array7226[i]
				.method2577(i_546_, 1 + i_547_, (byte) -13)
			  + aClass161Array7226[i].method2577(i_546_ + 1,
							     i_547_ + 1,
							     (byte) -44)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  -466040829 * anInt7221, i_548_, 0,
					  true, -1394332804);
	    }
	}
	if (i_547_ < anInt7210 * 1761949661) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_546_][i_547_ + 1];
	    if (class547 != null && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-780675827)) {
		int i_549_
		    = ((aClass161Array7226[i].method2577(i_546_, i_547_,
							 (byte) 17)
			+ aClass161Array7226[i]
			      .method2577(i_546_ + 1, i_547_ + 1, (byte) -99)
			+ aClass161Array7226[i]
			      .method2577(i_546_, 1 + i_547_ + 1, (byte) 53)
			+ aClass161Array7226[i].method2577(i_546_ + 1,
							   1 + (i_547_ + 1),
							   (byte) -13)) / 4
		       - (aClass161Array7226[i].method2577(i_546_, i_547_,
							   (byte) 105)
			  + aClass161Array7226[i]
				.method2577(i_546_ + 1, i_547_, (byte) -41)
			  + aClass161Array7226[i]
				.method2577(i_546_, 1 + i_547_, (byte) 103)
			  + aClass161Array7226[i].method2577(1 + i_546_,
							     i_547_ + 1,
							     (byte) 12)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264, 0,
					  i_549_, -466040829 * anInt7221, true,
					  1082301941);
	    }
	}
	if (i_546_ < anInt7210 * 1761949661
	    && i_547_ < 947301287 * anInt7211) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_546_ + 1][1 + i_547_];
	    if (null != class547 && class547.aClass656_Sub1_Sub1_7264 != null
		&& class547.aClass656_Sub1_Sub1_7264.method16912(-318338791)) {
		int i_550_
		    = ((aClass161Array7226[i]
			    .method2577(1 + i_546_, 1 + i_547_, (byte) -55)
			+ aClass161Array7226[i].method2577(i_546_ + 1 + 1,
							   1 + i_547_,
							   (byte) 43)
			+ aClass161Array7226[i].method2577(i_546_ + 1,
							   1 + (1 + i_547_),
							   (byte) -40)
			+ aClass161Array7226[i].method2577(1 + (1 + i_546_),
							   i_547_ + 1 + 1,
							   (byte) 37)) / 4
		       - (aClass161Array7226[i].method2577(i_546_, i_547_,
							   (byte) -34)
			  + aClass161Array7226[i].method2577(1 + i_546_,
							     i_547_, (byte) 99)
			  + aClass161Array7226[i]
				.method2577(i_546_, 1 + i_547_, (byte) -21)
			  + aClass161Array7226[i].method2577(i_546_ + 1,
							     i_547_ + 1,
							     (byte) 10)) / 4);
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  anInt7221 * -466040829, i_550_,
					  -466040829 * anInt7221, true,
					  322564223);
	    }
	}
	if (i_546_ < anInt7210 * 1761949661 && i_547_ > 0) {
	    Class547 class547
		= aClass547ArrayArrayArray7263[i][i_546_ + 1][i_547_ - 1];
	    if (class547 != null && null != class547.aClass656_Sub1_Sub1_7264
		&& class547.aClass656_Sub1_Sub1_7264.method16912(912503039)) {
		int i_551_
		    = ((aClass161Array7226[i]
			    .method2577(1 + i_546_, i_547_ - 1, (byte) -31)
			+ aClass161Array7226[i].method2577(1 + i_546_ + 1,
							   i_547_ - 1,
							   (byte) 23)
			+ aClass161Array7226[i].method2577(1 + i_546_,
							   1 + i_547_ - 1,
							   (byte) -23)
			+ aClass161Array7226[i].method2577(1 + i_546_ + 1,
							   i_547_ + 1 - 1,
							   (byte) 15)) / 4
		       - ((aClass161Array7226[i].method2577(i_546_, i_547_,
							    (byte) 17)
			   + aClass161Array7226[i].method2577(i_546_ + 1,
							      i_547_, (byte) 1)
			   + aClass161Array7226[i]
				 .method2577(i_546_, 1 + i_547_, (byte) 68)
			   + aClass161Array7226[i].method2577(i_546_ + 1,
							      i_547_ + 1,
							      (byte) -100))
			  / 4));
		class656_sub1.method16915(aClass182_7204,
					  class547.aClass656_Sub1_Sub1_7264,
					  -466040829 * anInt7221, i_551_,
					  -(anInt7221 * -466040829), true,
					  2073336894);
	    }
	}
    }
    
    public Class656_Sub1_Sub5 method9065(int i, int i_552_, int i_553_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_552_][i_553_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub5_7266;
    }
    
    public void method9066(int i, Class161 class161, int i_554_) {
	aClass161Array7226[i] = class161;
    }
    
    public void method9067(int i, int i_555_) {
	Class547 class547 = aClass547ArrayArrayArray7263[0][i][i_555_];
	for (int i_556_ = 0; i_556_ < 3; i_556_++) {
	    Class547 class547_557_
		= (aClass547ArrayArrayArray7263[i_556_][i][i_555_]
		   = aClass547ArrayArrayArray7263[1 + i_556_][i][i_555_]);
	    if (class547_557_ != null) {
		for (Class560 class560 = class547_557_.aClass560_7272;
		     class560 != null; class560 = class560.aClass560_7546) {
		    Class656_Sub1_Sub3 class656_sub1_sub3
			= class560.aClass656_Sub1_Sub3_7547;
		    if (class656_sub1_sub3.aShort11923 == i
			&& class656_sub1_sub3.aShort11925 == i_555_)
			class656_sub1_sub3.aByte10867--;
		}
		if (class547_557_.aClass656_Sub1_Sub1_7264 != null)
		    class547_557_.aClass656_Sub1_Sub1_7264.aByte10867--;
		if (null != class547_557_.aClass656_Sub1_Sub5_7266)
		    class547_557_.aClass656_Sub1_Sub5_7266.aByte10867--;
		if (null != class547_557_.aClass656_Sub1_Sub5_7267)
		    class547_557_.aClass656_Sub1_Sub5_7267.aByte10867--;
		if (class547_557_.aClass656_Sub1_Sub4_7268 != null)
		    class547_557_.aClass656_Sub1_Sub4_7268.aByte10867--;
		if (null != class547_557_.aClass656_Sub1_Sub4_7276)
		    class547_557_.aClass656_Sub1_Sub4_7276.aByte10867--;
	    }
	}
	if (aClass547ArrayArrayArray7263[0][i][i_555_] == null) {
	    aClass547ArrayArrayArray7263[0][i][i_555_] = new Class547(0);
	    aClass547ArrayArrayArray7263[0][i][i_555_].aByte7271 = (byte) 1;
	}
	aClass547ArrayArrayArray7263[0][i][i_555_].aClass547_7269 = class547;
	aClass547ArrayArrayArray7263[3][i][i_555_] = null;
    }
    
    void method9068(Class656_Sub1 class656_sub1, int i, int i_558_, int i_559_,
		    int i_560_, int i_561_) {
	boolean bool = true;
	int i_562_ = i_558_;
	int i_563_ = i_560_ + i_558_;
	int i_564_ = i_559_ - 1;
	int i_565_ = i_561_ + i_559_;
	for (int i_566_ = i; i_566_ <= i + 1; i_566_++) {
	    if (i_566_ != anInt7241 * 230317859) {
		for (int i_567_ = i_562_; i_567_ <= i_563_; i_567_++) {
		    if (i_567_ >= 0 && i_567_ < 1761949661 * anInt7210) {
			for (int i_568_ = i_564_; i_568_ <= i_565_; i_568_++) {
			    if (i_568_ >= 0 && i_568_ < anInt7211 * 947301287
				&& (!bool || i_567_ >= i_563_
				    || i_568_ >= i_565_
				    || i_568_ < i_559_ && i_567_ != i_558_)) {
				Class547 class547
				    = (aClass547ArrayArrayArray7263[i_566_]
				       [i_567_][i_568_]);
				if (class547 != null) {
				    int i_569_
					= (((aClass161Array7226[i_566_]
						 .method2577
					     (i_567_, i_568_, (byte) -78))
					    + (aClass161Array7226[i_566_]
						   .method2577
					       (1 + i_567_, i_568_,
						(byte) -67))
					    + (aClass161Array7226[i_566_]
						   .method2577
					       (i_567_, 1 + i_568_, (byte) 16))
					    + (aClass161Array7226[i_566_]
						   .method2577
					       (i_567_ + 1, i_568_ + 1,
						(byte) 26))) / 4
					   - ((aClass161Array7226[i].method2577
					       (i_558_, i_559_, (byte) 40))
					      + (aClass161Array7226[i]
						     .method2577
						 (1 + i_558_, i_559_,
						  (byte) -63))
					      + (aClass161Array7226[i]
						     .method2577
						 (i_558_, i_559_ + 1,
						  (byte) 57))
					      + (aClass161Array7226[i]
						     .method2577
						 (i_558_ + 1, 1 + i_559_,
						  (byte) 63))) / 4);
				    Class656_Sub1_Sub5 class656_sub1_sub5
					= class547.aClass656_Sub1_Sub5_7266;
				    Class656_Sub1_Sub5 class656_sub1_sub5_570_
					= class547.aClass656_Sub1_Sub5_7267;
				    if (class656_sub1_sub5 != null
					&& class656_sub1_sub5
					       .method16912(1577256588))
					class656_sub1.method16915
					    (aClass182_7204,
					     class656_sub1_sub5,
					     ((-466040829 * anInt7221
					       * (i_567_ - i_558_))
					      + (1 - i_560_) * (anInt7240
								* -576707309)),
					     i_569_,
					     ((-466040829 * anInt7221
					       * (i_568_ - i_559_))
					      + (1 - i_561_) * (-576707309
								* anInt7240)),
					     bool, 1392454975);
				    if (class656_sub1_sub5_570_ != null
					&& class656_sub1_sub5_570_
					       .method16912(31537748))
					class656_sub1.method16915
					    (aClass182_7204,
					     class656_sub1_sub5_570_,
					     ((i_567_ - i_558_) * (-466040829
								   * anInt7221)
					      + (-576707309 * anInt7240
						 * (1 - i_560_))),
					     i_569_,
					     ((-576707309 * anInt7240
					       * (1 - i_561_))
					      + (-466040829 * anInt7221
						 * (i_568_ - i_559_))),
					     bool, 1427252655);
				    for (Class560 class560
					     = class547.aClass560_7272;
					 null != class560;
					 class560 = class560.aClass560_7546) {
					Class656_Sub1_Sub3 class656_sub1_sub3
					    = (class560
					       .aClass656_Sub1_Sub3_7547);
					if (class656_sub1_sub3 != null
					    && class656_sub1_sub3
						   .method16912(-35503261)
					    && ((class656_sub1_sub3.aShort11923
						 == i_567_)
						|| i_567_ == i_562_)
					    && (i_568_ == (class656_sub1_sub3
							   .aShort11925)
						|| i_564_ == i_568_)) {
					    int i_571_ = ((class656_sub1_sub3
							   .aShort11924)
							  - (class656_sub1_sub3
							     .aShort11923)
							  + 1);
					    int i_572_ = ((class656_sub1_sub3
							   .aShort11930)
							  - (class656_sub1_sub3
							     .aShort11925)
							  + 1);
					    class656_sub1.method16915
						(aClass182_7204,
						 class656_sub1_sub3,
						 ((anInt7221 * -466040829
						   * ((class656_sub1_sub3
						       .aShort11923)
						      - i_558_))
						  + (-576707309 * anInt7240
						     * (i_571_ - i_560_))),
						 i_569_,
						 ((-466040829 * anInt7221
						   * ((class656_sub1_sub3
						       .aShort11925)
						      - i_559_))
						  + (anInt7240 * -576707309
						     * (i_572_ - i_561_))),
						 bool, 468214848);
					}
				    }
				}
			    }
			}
		    }
		}
		i_562_--;
		bool = false;
	    }
	}
    }
    
    void method9069(Class656_Sub1 class656_sub1, int i, int i_573_, int i_574_,
		    int i_575_, int i_576_) {
	boolean bool = true;
	int i_577_ = i_573_;
	int i_578_ = i_575_ + i_573_;
	int i_579_ = i_574_ - 1;
	int i_580_ = i_576_ + i_574_;
	for (int i_581_ = i; i_581_ <= i + 1; i_581_++) {
	    if (i_581_ != anInt7241 * 230317859) {
		for (int i_582_ = i_577_; i_582_ <= i_578_; i_582_++) {
		    if (i_582_ >= 0 && i_582_ < 1761949661 * anInt7210) {
			for (int i_583_ = i_579_; i_583_ <= i_580_; i_583_++) {
			    if (i_583_ >= 0 && i_583_ < anInt7211 * 947301287
				&& (!bool || i_582_ >= i_578_
				    || i_583_ >= i_580_
				    || i_583_ < i_574_ && i_582_ != i_573_)) {
				Class547 class547
				    = (aClass547ArrayArrayArray7263[i_581_]
				       [i_582_][i_583_]);
				if (class547 != null) {
				    int i_584_
					= (((aClass161Array7226[i_581_]
						 .method2577
					     (i_582_, i_583_, (byte) 13))
					    + (aClass161Array7226[i_581_]
						   .method2577
					       (1 + i_582_, i_583_, (byte) 52))
					    + (aClass161Array7226[i_581_]
						   .method2577
					       (i_582_, 1 + i_583_, (byte) 13))
					    + (aClass161Array7226[i_581_]
						   .method2577
					       (i_582_ + 1, i_583_ + 1,
						(byte) 4))) / 4
					   - ((aClass161Array7226[i].method2577
					       (i_573_, i_574_, (byte) 2))
					      + (aClass161Array7226[i]
						     .method2577
						 (1 + i_573_, i_574_,
						  (byte) 70))
					      + (aClass161Array7226[i]
						     .method2577
						 (i_573_, i_574_ + 1,
						  (byte) 54))
					      + (aClass161Array7226[i]
						     .method2577
						 (i_573_ + 1, 1 + i_574_,
						  (byte) 2))) / 4);
				    Class656_Sub1_Sub5 class656_sub1_sub5
					= class547.aClass656_Sub1_Sub5_7266;
				    Class656_Sub1_Sub5 class656_sub1_sub5_585_
					= class547.aClass656_Sub1_Sub5_7267;
				    if (class656_sub1_sub5 != null
					&& class656_sub1_sub5
					       .method16912(-249821453))
					class656_sub1.method16915
					    (aClass182_7204,
					     class656_sub1_sub5,
					     ((-466040829 * anInt7221
					       * (i_582_ - i_573_))
					      + (1 - i_575_) * (anInt7240
								* -576707309)),
					     i_584_,
					     ((-466040829 * anInt7221
					       * (i_583_ - i_574_))
					      + (1 - i_576_) * (-576707309
								* anInt7240)),
					     bool, 407042657);
				    if (class656_sub1_sub5_585_ != null
					&& class656_sub1_sub5_585_
					       .method16912(499592571))
					class656_sub1.method16915
					    (aClass182_7204,
					     class656_sub1_sub5_585_,
					     ((i_582_ - i_573_) * (-466040829
								   * anInt7221)
					      + (-576707309 * anInt7240
						 * (1 - i_575_))),
					     i_584_,
					     ((-576707309 * anInt7240
					       * (1 - i_576_))
					      + (-466040829 * anInt7221
						 * (i_583_ - i_574_))),
					     bool, 861866829);
				    for (Class560 class560
					     = class547.aClass560_7272;
					 null != class560;
					 class560 = class560.aClass560_7546) {
					Class656_Sub1_Sub3 class656_sub1_sub3
					    = (class560
					       .aClass656_Sub1_Sub3_7547);
					if (class656_sub1_sub3 != null
					    && class656_sub1_sub3
						   .method16912(-703678093)
					    && ((class656_sub1_sub3.aShort11923
						 == i_582_)
						|| i_582_ == i_577_)
					    && (i_583_ == (class656_sub1_sub3
							   .aShort11925)
						|| i_579_ == i_583_)) {
					    int i_586_ = ((class656_sub1_sub3
							   .aShort11924)
							  - (class656_sub1_sub3
							     .aShort11923)
							  + 1);
					    int i_587_ = ((class656_sub1_sub3
							   .aShort11930)
							  - (class656_sub1_sub3
							     .aShort11925)
							  + 1);
					    class656_sub1.method16915
						(aClass182_7204,
						 class656_sub1_sub3,
						 ((anInt7221 * -466040829
						   * ((class656_sub1_sub3
						       .aShort11923)
						      - i_573_))
						  + (-576707309 * anInt7240
						     * (i_586_ - i_575_))),
						 i_584_,
						 ((-466040829 * anInt7221
						   * ((class656_sub1_sub3
						       .aShort11925)
						      - i_574_))
						  + (anInt7240 * -576707309
						     * (i_587_ - i_576_))),
						 bool, 202187112);
					}
				    }
				}
			    }
			}
		    }
		}
		i_577_--;
		bool = false;
	    }
	}
    }
    
    public void method9070
	(int i, int i_588_, int i_589_, int i_590_, byte[][][] is,
	 int[] is_591_, int[] is_592_, int[] is_593_, int[] is_594_,
	 int[] is_595_, int i_596_, byte i_597_, int i_598_, int i_599_,
	 boolean bool, boolean bool_600_, int i_601_, boolean bool_602_) {
	aClass554_7208.aBool7421 = true;
	aBool7218 = bool_600_;
	anInt7214 = -533161521 * (i_588_ >> anInt7200 * 1819515263);
	anInt7202 = (i_590_ >> 1819515263 * anInt7200) * -868439961;
	anInt7238 = 462881393 * i_588_;
	anInt7239 = i_590_ * -1804477433;
	anInt7244 = -251673233 * i_589_;
	anInt7245 = -1411374655 * anInt7214 - anInt7242 * 372885149;
	if (anInt7245 * 979290863 < 0) {
	    anInt7243 = -(anInt7245 * -1118753465);
	    anInt7245 = 0;
	} else
	    anInt7243 = 0;
	anInt7247 = anInt7202 * 1612796921 - anInt7242 * 1745522685;
	if (anInt7247 * -525421105 < 0) {
	    anInt7225 = -(1158430263 * anInt7247);
	    anInt7247 = 0;
	} else
	    anInt7225 = 0;
	anInt7246 = anInt7214 * 1831485429 + 1836053889 * anInt7242;
	if (anInt7246 * -2031741421 > 1761949661 * anInt7210)
	    anInt7246 = anInt7210 * -1357449137;
	anInt7248 = -866304157 * anInt7242 + 1621561319 * anInt7202;
	if (573592337 * anInt7248 > 947301287 * anInt7211)
	    anInt7248 = 102867767 * anInt7211;
	boolean[][] bools = aBoolArrayArray7262;
	boolean[][] bools_603_ = aBoolArrayArray7260;
	if (aBool7218) {
	    for (int i_604_ = 0;
		 i_604_ < -699511149 * anInt7242 + -699511149 * anInt7242 + 2;
		 i_604_++) {
		int i_605_ = 0;
		int i_606_ = 0;
		for (int i_607_ = 0;
		     (i_607_
		      < -699511149 * anInt7242 + anInt7242 * -699511149 + 2);
		     i_607_++) {
		    if (i_607_ > 1)
			anIntArray7236[i_607_ - 2] = i_605_;
		    i_605_ = i_606_;
		    int i_608_ = i_604_ + (1874840879 * anInt7214
					   - -699511149 * anInt7242);
		    int i_609_ = i_607_ + (anInt7202 * 1049621335
					   - anInt7242 * -699511149);
		    if (i_608_ >= 0 && i_609_ >= 0
			&& i_608_ < anInt7210 * 1761949661
			&& i_609_ < anInt7211 * 947301287) {
			int i_610_ = i_608_ << 1819515263 * anInt7200;
			int i_611_ = i_609_ << 1819515263 * anInt7200;
			int i_612_
			    = (aClass161Array7215
				   [aClass161Array7215.length - 1]
				   .method2577(i_608_, i_609_, (byte) -18)
			       - (1000 << anInt7200 * 1819515263 - 7));
			int i_613_
			    = ((null != aClass161Array7249
				? (aClass161Array7249[0]
				       .method2577(i_608_, i_609_, (byte) -2)
				   + -466040829 * anInt7221)
				: (aClass161Array7215[0]
				       .method2577(i_608_, i_609_, (byte) -79)
				   + -466040829 * anInt7221))
			       + (1000 << anInt7200 * 1819515263 - 7));
			i_606_ = aClass182_7204.method3206(i_610_, i_612_,
							   i_611_, i_610_,
							   i_613_, i_611_);
			aBoolArrayArray7260[i_604_][i_607_] = 0 == i_606_;
		    } else {
			i_606_ = -1;
			aBoolArrayArray7260[i_604_][i_607_] = false;
		    }
		    if (i_604_ > 0 && i_607_ > 0) {
			int i_614_
			    = (anIntArray7236[i_607_ - 1]
			       & anIntArray7236[i_607_] & i_605_ & i_606_);
			aBoolArrayArray7262[i_604_ - 1][i_607_ - 1]
			    = 0 == i_614_;
		    }
		}
		anIntArray7236[-699511149 * anInt7242 + anInt7242 * -699511149]
		    = i_605_;
		anIntArray7236[(anInt7242 * -699511149 + -699511149 * anInt7242
				+ 1)]
		    = i_606_;
	    }
	    if (!bool_602_)
		aClass554_7208.aBool7421 = false;
	    else {
		aClass554_7208.anIntArray7450 = is_591_;
		aClass554_7208.anIntArray7441 = is_592_;
		aClass554_7208.anIntArray7440 = is_593_;
		aClass554_7208.anIntArray7443 = is_594_;
		aClass554_7208.anIntArray7444 = is_595_;
		aClass554_7208.method9190(aClass182_7204, i_596_);
	    }
	} else {
	    if (null == aBoolArrayArray7199)
		aBoolArrayArray7199
		    = (new boolean
		       [anInt7242 * -699511149 + anInt7242 * -699511149 + 2]
		       [-699511149 * anInt7242 + -699511149 * anInt7242 + 2]);
	    for (int i_615_ = 0; i_615_ < aBoolArrayArray7199.length;
		 i_615_++) {
		for (int i_616_ = 0; i_616_ < aBoolArrayArray7199[0].length;
		     i_616_++)
		    aBoolArrayArray7199[i_615_][i_616_] = true;
	    }
	    aBoolArrayArray7260 = aBoolArrayArray7199;
	    aBoolArrayArray7262 = aBoolArrayArray7199;
	    anInt7245 = 0;
	    anInt7247 = 0;
	    anInt7246 = anInt7210 * -1357449137;
	    anInt7248 = 102867767 * anInt7211;
	    aClass554_7208.aBool7421 = false;
	}
	Class272.method5020(this, aClass182_7204, -2028431656);
	if (!aClass557_7207.aBool7533) {
	    Iterator iterator = aClass557_7207.aList7534.iterator();
	    while (iterator.hasNext()) {
		Class567 class567 = (Class567) iterator.next();
		iterator.remove();
		Class168.method2718(class567, -1984670451);
	    }
	}
	if (aBool7213) {
	    for (int i_617_ = 0; i_617_ < anInt7253 * 1999654737; i_617_++)
		aClass564Array7255[i_617_].method9439(i, bool, 1466271888);
	}
	if (aClass547ArrayArrayArray7216 != null) {
	    method8946(true, 1726762655);
	    aClass182_7204.method3261(-1, new Class176(1583160, 40, 127, 63, 0,
						       0, 0));
	    method8979(true, is, i_596_, i_597_, i_601_);
	    aClass182_7204.method3263();
	    method8946(false, 2075315454);
	}
	method8979(false, is, i_596_, i_597_, i_601_);
	if (!aBool7218) {
	    aBoolArrayArray7262 = bools;
	    aBoolArrayArray7260 = bools_603_;
	}
    }
    
    public void method9071
	(int i, int i_618_, int i_619_, int i_620_, byte[][][] is,
	 int[] is_621_, int[] is_622_, int[] is_623_, int[] is_624_,
	 int[] is_625_, int i_626_, byte i_627_, int i_628_, int i_629_,
	 boolean bool, boolean bool_630_, int i_631_, boolean bool_632_) {
	aClass554_7208.aBool7421 = true;
	aBool7218 = bool_630_;
	anInt7214 = -533161521 * (i_618_ >> anInt7200 * 1819515263);
	anInt7202 = (i_620_ >> 1819515263 * anInt7200) * -868439961;
	anInt7238 = 462881393 * i_618_;
	anInt7239 = i_620_ * -1804477433;
	anInt7244 = -251673233 * i_619_;
	anInt7245 = -1411374655 * anInt7214 - anInt7242 * 372885149;
	if (anInt7245 * 979290863 < 0) {
	    anInt7243 = -(anInt7245 * -1118753465);
	    anInt7245 = 0;
	} else
	    anInt7243 = 0;
	anInt7247 = anInt7202 * 1612796921 - anInt7242 * 1745522685;
	if (anInt7247 * -525421105 < 0) {
	    anInt7225 = -(1158430263 * anInt7247);
	    anInt7247 = 0;
	} else
	    anInt7225 = 0;
	anInt7246 = anInt7214 * 1831485429 + 1836053889 * anInt7242;
	if (anInt7246 * -2031741421 > 1761949661 * anInt7210)
	    anInt7246 = anInt7210 * -1357449137;
	anInt7248 = -866304157 * anInt7242 + 1621561319 * anInt7202;
	if (573592337 * anInt7248 > 947301287 * anInt7211)
	    anInt7248 = 102867767 * anInt7211;
	boolean[][] bools = aBoolArrayArray7262;
	boolean[][] bools_633_ = aBoolArrayArray7260;
	if (aBool7218) {
	    for (int i_634_ = 0;
		 i_634_ < -699511149 * anInt7242 + -699511149 * anInt7242 + 2;
		 i_634_++) {
		int i_635_ = 0;
		int i_636_ = 0;
		for (int i_637_ = 0;
		     (i_637_
		      < -699511149 * anInt7242 + anInt7242 * -699511149 + 2);
		     i_637_++) {
		    if (i_637_ > 1)
			anIntArray7236[i_637_ - 2] = i_635_;
		    i_635_ = i_636_;
		    int i_638_ = i_634_ + (1874840879 * anInt7214
					   - -699511149 * anInt7242);
		    int i_639_ = i_637_ + (anInt7202 * 1049621335
					   - anInt7242 * -699511149);
		    if (i_638_ >= 0 && i_639_ >= 0
			&& i_638_ < anInt7210 * 1761949661
			&& i_639_ < anInt7211 * 947301287) {
			int i_640_ = i_638_ << 1819515263 * anInt7200;
			int i_641_ = i_639_ << 1819515263 * anInt7200;
			int i_642_
			    = (aClass161Array7215
				   [aClass161Array7215.length - 1]
				   .method2577(i_638_, i_639_, (byte) -66)
			       - (1000 << anInt7200 * 1819515263 - 7));
			int i_643_
			    = ((null != aClass161Array7249
				? (aClass161Array7249[0]
				       .method2577(i_638_, i_639_, (byte) 98)
				   + -466040829 * anInt7221)
				: (aClass161Array7215[0]
				       .method2577(i_638_, i_639_, (byte) 25)
				   + -466040829 * anInt7221))
			       + (1000 << anInt7200 * 1819515263 - 7));
			i_636_ = aClass182_7204.method3206(i_640_, i_642_,
							   i_641_, i_640_,
							   i_643_, i_641_);
			aBoolArrayArray7260[i_634_][i_637_] = 0 == i_636_;
		    } else {
			i_636_ = -1;
			aBoolArrayArray7260[i_634_][i_637_] = false;
		    }
		    if (i_634_ > 0 && i_637_ > 0) {
			int i_644_
			    = (anIntArray7236[i_637_ - 1]
			       & anIntArray7236[i_637_] & i_635_ & i_636_);
			aBoolArrayArray7262[i_634_ - 1][i_637_ - 1]
			    = 0 == i_644_;
		    }
		}
		anIntArray7236[-699511149 * anInt7242 + anInt7242 * -699511149]
		    = i_635_;
		anIntArray7236[(anInt7242 * -699511149 + -699511149 * anInt7242
				+ 1)]
		    = i_636_;
	    }
	    if (!bool_632_)
		aClass554_7208.aBool7421 = false;
	    else {
		aClass554_7208.anIntArray7450 = is_621_;
		aClass554_7208.anIntArray7441 = is_622_;
		aClass554_7208.anIntArray7440 = is_623_;
		aClass554_7208.anIntArray7443 = is_624_;
		aClass554_7208.anIntArray7444 = is_625_;
		aClass554_7208.method9190(aClass182_7204, i_626_);
	    }
	} else {
	    if (null == aBoolArrayArray7199)
		aBoolArrayArray7199
		    = (new boolean
		       [anInt7242 * -699511149 + anInt7242 * -699511149 + 2]
		       [-699511149 * anInt7242 + -699511149 * anInt7242 + 2]);
	    for (int i_645_ = 0; i_645_ < aBoolArrayArray7199.length;
		 i_645_++) {
		for (int i_646_ = 0; i_646_ < aBoolArrayArray7199[0].length;
		     i_646_++)
		    aBoolArrayArray7199[i_645_][i_646_] = true;
	    }
	    aBoolArrayArray7260 = aBoolArrayArray7199;
	    aBoolArrayArray7262 = aBoolArrayArray7199;
	    anInt7245 = 0;
	    anInt7247 = 0;
	    anInt7246 = anInt7210 * -1357449137;
	    anInt7248 = 102867767 * anInt7211;
	    aClass554_7208.aBool7421 = false;
	}
	Class272.method5020(this, aClass182_7204, 635451718);
	if (!aClass557_7207.aBool7533) {
	    Iterator iterator = aClass557_7207.aList7534.iterator();
	    while (iterator.hasNext()) {
		Class567 class567 = (Class567) iterator.next();
		iterator.remove();
		Class168.method2718(class567, -1936061511);
	    }
	}
	if (aBool7213) {
	    for (int i_647_ = 0; i_647_ < anInt7253 * 1999654737; i_647_++)
		aClass564Array7255[i_647_].method9439(i, bool, 1914035049);
	}
	if (aClass547ArrayArrayArray7216 != null) {
	    method8946(true, 1646099437);
	    aClass182_7204.method3261(-1, new Class176(1583160, 40, 127, 63, 0,
						       0, 0));
	    method8979(true, is, i_626_, i_627_, i_631_);
	    aClass182_7204.method3263();
	    method8946(false, 21203816);
	}
	method8979(false, is, i_626_, i_627_, i_631_);
	if (!aBool7218) {
	    aBoolArrayArray7262 = bools;
	    aBoolArrayArray7260 = bools_633_;
	}
    }
    
    boolean method9072(Class656_Sub1 class656_sub1, boolean bool,
		       byte[][][] is, int i, byte i_648_) {
	if (!aBool7218)
	    return false;
	if (class656_sub1 instanceof Class656_Sub1_Sub3) {
	    int i_649_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11924;
	    int i_650_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11930;
	    int i_651_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11923;
	    int i_652_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11925;
	    for (int i_653_ = i_651_; i_653_ <= i_649_; i_653_++) {
		for (int i_654_ = i_652_; i_654_ <= i_650_; i_654_++) {
		    if (class656_sub1.aByte10870 < 230317859 * anInt7241
			&& i_653_ >= 979290863 * anInt7245
			&& i_653_ < anInt7246 * -2031741421
			&& i_654_ >= anInt7247 * -525421105
			&& i_654_ < anInt7248 * 573592337) {
			if ((is != null && class656_sub1.aByte10867 >= i
			     && (is[class656_sub1.aByte10867][i_653_][i_654_]
				 == i_648_))
			    || !class656_sub1.method16922(1767771805)
			    || class656_sub1.method16942(aClass182_7204,
							 1570218303)) {
			    if (!bool && i_653_ >= 1874840879 * anInt7214 - 16
				&& i_653_ <= 16 + anInt7214 * 1874840879
				&& i_654_ >= anInt7202 * 1049621335 - 16
				&& i_654_ <= 16 + 1049621335 * anInt7202)
				class656_sub1.method16918(aClass182_7204,
							  344918769);
			    return true;
			}
			return false;
		    }
		}
	    }
	    return true;
	}
	Class446 class446 = class656_sub1.method10818().aClass446_4807;
	int i_655_ = (int) class446.aFloat4895 >> 1819515263 * anInt7200;
	int i_656_ = (int) class446.aFloat4897 >> 1819515263 * anInt7200;
	if (class656_sub1.aByte10870 < anInt7241 * 230317859
	    && i_655_ >= anInt7245 * 979290863
	    && i_655_ < -2031741421 * anInt7246
	    && i_656_ >= anInt7247 * -525421105
	    && i_656_ < 573592337 * anInt7248) {
	    if ((null != is && class656_sub1.aByte10867 >= i
		 && is[class656_sub1.aByte10867][i_655_][i_656_] == i_648_)
		|| !class656_sub1.method16922(234396318)
		|| class656_sub1.method16942(aClass182_7204, 1570218303)) {
		if (!bool && i_655_ >= 1874840879 * anInt7214 - 16
		    && i_655_ <= 16 + anInt7214 * 1874840879
		    && i_656_ >= 1049621335 * anInt7202 - 16
		    && i_656_ <= 16 + anInt7202 * 1049621335)
		    class656_sub1.method16918(aClass182_7204, 1232857597);
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    public void method9073() {
	method8987(1, 230317859 * anInt7241, (byte) 56);
    }
    
    void method9074(Class656_Sub1 class656_sub1) {
	Class446 class446 = class656_sub1.method10818().aClass446_4807;
	aClass182_7204.method3360((float) (int) class446.aFloat4895,
				  (float) ((int) class446.aFloat4896
					   + (class656_sub1
						  .method16909((byte) 124)
					      >> 1)),
				  (float) (int) class446.aFloat4897,
				  aFloatArray7206);
	class656_sub1.anInt10871 = 1082082373 * (int) aFloatArray7206[2];
    }
    
    void method9075(Class656_Sub1[] class656_sub1s, int i, int i_657_) {
	if (i < i_657_) {
	    int i_658_ = (i_657_ + i) / 2;
	    int i_659_ = i;
	    Class656_Sub1 class656_sub1 = class656_sub1s[i_658_];
	    class656_sub1s[i_658_] = class656_sub1s[i_657_];
	    class656_sub1s[i_657_] = class656_sub1;
	    int i_660_ = class656_sub1.anInt10871 * 46608013;
	    for (int i_661_ = i; i_661_ < i_657_; i_661_++) {
		if (class656_sub1s[i_661_].anInt10871 * 46608013
		    > (i_661_ & 0x1) + i_660_) {
		    Class656_Sub1 class656_sub1_662_ = class656_sub1s[i_661_];
		    class656_sub1s[i_661_] = class656_sub1s[i_659_];
		    class656_sub1s[i_659_++] = class656_sub1_662_;
		}
	    }
	    class656_sub1s[i_657_] = class656_sub1s[i_659_];
	    class656_sub1s[i_659_] = class656_sub1;
	    method8981(class656_sub1s, i, i_659_ - 1);
	    method8981(class656_sub1s, i_659_ + 1, i_657_);
	}
    }
    
    void method9076(Class656_Sub1[] class656_sub1s, int i, int i_663_) {
	if (i < i_663_) {
	    int i_664_ = (i_663_ + i) / 2;
	    int i_665_ = i;
	    Class656_Sub1 class656_sub1 = class656_sub1s[i_664_];
	    class656_sub1s[i_664_] = class656_sub1s[i_663_];
	    class656_sub1s[i_663_] = class656_sub1;
	    int i_666_ = 46608013 * class656_sub1.anInt10871;
	    for (int i_667_ = i; i_667_ < i_663_; i_667_++) {
		if (46608013 * class656_sub1s[i_667_].anInt10871
		    < i_666_ + (i_667_ & 0x1)) {
		    Class656_Sub1 class656_sub1_668_ = class656_sub1s[i_667_];
		    class656_sub1s[i_667_] = class656_sub1s[i_665_];
		    class656_sub1s[i_665_++] = class656_sub1_668_;
		}
	    }
	    class656_sub1s[i_663_] = class656_sub1s[i_665_];
	    class656_sub1s[i_665_] = class656_sub1;
	    method8969(class656_sub1s, i, i_665_ - 1);
	    method8969(class656_sub1s, i_665_ + 1, i_663_);
	}
    }
    
    void method9077(Class656_Sub1_Sub3 class656_sub1_sub3, boolean bool) {
	int i = Math.min(1761949661 * anInt7210 - 1,
			 Math.max(0, class656_sub1_sub3.aShort11923));
	int i_669_ = Math.min(anInt7210 * 1761949661 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11924));
	int i_670_ = Math.min(947301287 * anInt7211 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11925));
	int i_671_ = Math.min(anInt7211 * 947301287 - 1,
			      Math.max(0, class656_sub1_sub3.aShort11930));
	for (int i_672_ = i; i_672_ <= i_669_; i_672_++) {
	    for (int i_673_ = i_670_; i_673_ <= i_671_; i_673_++) {
		Class547 class547
		    = (aClass547ArrayArrayArray7263
		       [class656_sub1_sub3.aByte10867][i_672_][i_673_]);
		if (null != class547) {
		    Class560 class560 = class547.aClass560_7272;
		    Class560 class560_674_ = null;
		    for (/**/; null != class560;
			 class560 = class560.aClass560_7546) {
			if (class560.aClass656_Sub1_Sub3_7547
			    == class656_sub1_sub3) {
			    if (null != class560_674_)
				class560_674_.aClass560_7546
				    = class560.aClass560_7546;
			    else
				class547.aClass560_7272
				    = class560.aClass560_7546;
			    class560.method9403(-1735533430);
			    break;
			}
			class560_674_ = class560;
		    }
		}
	    }
	}
	if (!bool)
	    method8967(class656_sub1_sub3, -2082971607);
    }
    
    void method9078(int i, int i_675_) {
	Class525_Sub16_Sub17 class525_sub16_sub17 = null;
	for (int i_676_ = i; i_676_ < i_675_; i_676_++) {
	    Class161 class161 = aClass161Array7215[i_676_];
	    if (null != class161) {
		for (int i_677_ = 0; i_677_ < 947301287 * anInt7211;
		     i_677_++) {
		    for (int i_678_ = 0; i_678_ < 1761949661 * anInt7210;
			 i_678_++) {
			class525_sub16_sub17
			    = class161.method2597(i_678_, i_677_,
						  class525_sub16_sub17);
			if (class525_sub16_sub17 != null) {
			    int i_679_ = i_678_ << anInt7200 * 1819515263;
			    int i_680_ = i_677_ << anInt7200 * 1819515263;
			    for (int i_681_ = i_676_ - 1; i_681_ >= 0;
				 i_681_--) {
				Class161 class161_682_
				    = aClass161Array7215[i_681_];
				if (class161_682_ != null) {
				    int i_683_
					= (class161.method2577(i_678_, i_677_,
							       (byte) -62)
					   - (class161_682_.method2577
					      (i_678_, i_677_, (byte) -47)));
				    int i_684_
					= (class161.method2577(i_678_ + 1,
							       i_677_,
							       (byte) -66)
					   - (class161_682_.method2577
					      (i_678_ + 1, i_677_,
					       (byte) -46)));
				    int i_685_
					= (class161.method2577(i_678_ + 1,
							       1 + i_677_,
							       (byte) -80)
					   - (class161_682_.method2577
					      (1 + i_678_, i_677_ + 1,
					       (byte) 44)));
				    int i_686_
					= (class161.method2577(i_678_,
							       i_677_ + 1,
							       (byte) -93)
					   - (class161_682_.method2577
					      (i_678_, 1 + i_677_,
					       (byte) 52)));
				    class161_682_.method2586
					(class525_sub16_sub17, i_679_,
					 ((i_685_ + (i_683_ + i_684_) + i_686_)
					  / 4),
					 i_680_, 0, false);
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    boolean method9079(Class656_Sub1 class656_sub1, boolean bool,
		       byte[][][] is, int i, byte i_687_) {
	if (!aBool7218)
	    return false;
	if (class656_sub1 instanceof Class656_Sub1_Sub3) {
	    int i_688_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11924;
	    int i_689_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11930;
	    int i_690_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11923;
	    int i_691_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11925;
	    for (int i_692_ = i_690_; i_692_ <= i_688_; i_692_++) {
		for (int i_693_ = i_691_; i_693_ <= i_689_; i_693_++) {
		    if (class656_sub1.aByte10870 < 230317859 * anInt7241
			&& i_692_ >= 979290863 * anInt7245
			&& i_692_ < anInt7246 * -2031741421
			&& i_693_ >= anInt7247 * -525421105
			&& i_693_ < anInt7248 * 573592337) {
			if ((is != null && class656_sub1.aByte10867 >= i
			     && (is[class656_sub1.aByte10867][i_692_][i_693_]
				 == i_687_))
			    || !class656_sub1.method16922(173300178)
			    || class656_sub1.method16942(aClass182_7204,
							 1570218303)) {
			    if (!bool && i_692_ >= 1874840879 * anInt7214 - 16
				&& i_692_ <= 16 + anInt7214 * 1874840879
				&& i_693_ >= anInt7202 * 1049621335 - 16
				&& i_693_ <= 16 + 1049621335 * anInt7202)
				class656_sub1.method16918(aClass182_7204,
							  -386292463);
			    return true;
			}
			return false;
		    }
		}
	    }
	    return true;
	}
	Class446 class446 = class656_sub1.method10818().aClass446_4807;
	int i_694_ = (int) class446.aFloat4895 >> 1819515263 * anInt7200;
	int i_695_ = (int) class446.aFloat4897 >> 1819515263 * anInt7200;
	if (class656_sub1.aByte10870 < anInt7241 * 230317859
	    && i_694_ >= anInt7245 * 979290863
	    && i_694_ < -2031741421 * anInt7246
	    && i_695_ >= anInt7247 * -525421105
	    && i_695_ < 573592337 * anInt7248) {
	    if ((null != is && class656_sub1.aByte10867 >= i
		 && is[class656_sub1.aByte10867][i_694_][i_695_] == i_687_)
		|| !class656_sub1.method16922(1432077997)
		|| class656_sub1.method16942(aClass182_7204, 1570218303)) {
		if (!bool && i_694_ >= 1874840879 * anInt7214 - 16
		    && i_694_ <= 16 + anInt7214 * 1874840879
		    && i_695_ >= 1049621335 * anInt7202 - 16
		    && i_695_ <= 16 + anInt7202 * 1049621335)
		    class656_sub1.method16918(aClass182_7204, -1384377312);
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    public Class656_Sub1_Sub5 method9080(int i, int i_696_, int i_697_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_696_][i_697_];
	if (null != class547) {
	    method8967(class547.aClass656_Sub1_Sub5_7266, -1228679902);
	    if (null != class547.aClass656_Sub1_Sub5_7266) {
		Class656_Sub1_Sub5 class656_sub1_sub5
		    = class547.aClass656_Sub1_Sub5_7266;
		class547.aClass656_Sub1_Sub5_7266 = null;
		return class656_sub1_sub5;
	    }
	}
	return null;
    }
    
    void method9081(Class656_Sub1 class656_sub1,
		    Class525_Sub21[] class525_sub21s) {
	if (aBool7213) {
	    int i = class656_sub1.method16920(class525_sub21s, -1299747068);
	    aClass182_7204.method3244(i, class525_sub21s);
	}
	if (aClass161Array7226 == aClass161Array7249) {
	    boolean bool = false;
	    boolean bool_698_ = false;
	    Class446 class446 = class656_sub1.method10818().aClass446_4807;
	    int i;
	    int i_699_;
	    if (class656_sub1 instanceof Class656_Sub1_Sub3) {
		i = ((Class656_Sub1_Sub3) class656_sub1).aShort11923;
		i_699_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11925;
	    } else {
		i = (int) class446.aFloat4895 >> 1819515263 * anInt7200;
		i_699_ = (int) class446.aFloat4897 >> anInt7200 * 1819515263;
	    }
	    i = Math.min(anInt7210 * 1761949661 - 1, Math.max(0, i));
	    i_699_ = Math.min(947301287 * anInt7211 - 1, Math.max(0, i_699_));
	    Class176 class176 = new Class176();
	    class176.anInt1877
		= method9035(i, i_699_, -689089471) * -455052721;
	    class176.anInt1879 = method8945(i, i_699_, 889283761) * 616962313;
	    class176.anInt1883
		= method8947(i, i_699_, -1711590529) * 575868967;
	    class176.anInt1881
		= method8948(i, i_699_, -1334640927) * -1237930075;
	    class176.anInt1882 = method8949(i, i_699_, 751485013) * 506197425;
	    class176.anInt1878 = method8950(i, i_699_, -932381380) * 86130037;
	    aClass182_7204.method3262
		(aClass161Array7215[0].method2619((int) class446.aFloat4895,
						  (int) class446.aFloat4897,
						  -1922408285),
		 class176);
	}
	Class567 class567
	    = class656_sub1.method16917(aClass182_7204, -1810369387);
	if (class567 != null) {
	    if (class567.aBool7608) {
		class567.aClass656_Sub1_7606 = class656_sub1;
		aClass557_7207.method9360(class567, (short) -24698);
	    } else
		Class168.method2718(class567, -1915928965);
	}
    }
    
    public boolean method9082(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_700_, int i_701_, boolean[] bools) {
	boolean bool = false;
	if (aClass161Array7249 != aClass161Array7226) {
	    int i_702_ = aClass161Array7215[i].method2619(i_700_, i_701_,
							  -1650544237);
	    int i_703_ = 0;
	    for (/**/; i_703_ <= i; i_703_++) {
		Class161 class161 = aClass161Array7215[i_703_];
		if (class161 != null) {
		    int i_704_ = i_702_ - class161.method2619(i_700_, i_701_,
							      314348491);
		    if (bools != null) {
			bools[i_703_]
			    = class161.method2615(class525_sub16_sub17, i_700_,
						  i_704_, i_701_, 0, false);
			if (!bools[i_703_])
			    continue;
		    }
		    class161.method2586(class525_sub16_sub17, i_700_, i_704_,
					i_701_, 0, false);
		    bool = true;
		}
	    }
	}
	return bool;
    }
    
    public Class546(Class182 class182, int i, int i_705_, int i_706_,
		    int i_707_, int i_708_, boolean bool, boolean bool_709_) {
	anInt7223 = 5024;
	anInt7237 = 5023;
	aFloatArray7206 = new float[3];
	aClass525_Sub21Array7250 = new Class525_Sub21[8];
	anInt7251 = 65005;
	aHashMap7257 = new HashMap();
	aHashMap7258 = new HashMap();
	aClass182_7204 = class182;
	aBool7213 = aClass182_7204.method3242() > 0;
	anInt7200 = -652073345 * i;
	anInt7221 = (1 << anInt7200 * 1819515263) * -1680465237;
	anInt7240 = (anInt7221 * -466040829 >> 1) * 801205531;
	anInt7241 = i_705_ * 902416523;
	anInt7210 = i_706_ * -315107211;
	anInt7211 = -759739369 * i_707_;
	anInt7242 = 1772552091 * i_708_;
	aClass51_7205 = new Class51();
	aClass554_7208 = new Class554(this);
	aClass547ArrayArrayArray7220
	    = (new Class547[i_705_][1761949661 * anInt7210]
	       [anInt7211 * 947301287]);
	aClass161Array7215 = new Class161[i_705_];
	if (bool) {
	    anIntArrayArray7217
		= new int[1761949661 * anInt7210][947301287 * anInt7211];
	    aByteArrayArray7259
		= new byte[1761949661 * anInt7210][947301287 * anInt7211];
	    aShortArrayArray7219
		= new short[anInt7210 * 1761949661][947301287 * anInt7211];
	    aByteArrayArray7201
		= new byte[anInt7210 * 1761949661][947301287 * anInt7211];
	    aByteArrayArray7222
		= new byte[1761949661 * anInt7210][947301287 * anInt7211];
	    aByteArrayArray7212
		= new byte[1761949661 * anInt7210][947301287 * anInt7211];
	    aClass547ArrayArrayArray7216
		= (new Class547[1][1761949661 * anInt7210]
		   [anInt7211 * 947301287]);
	    aClass161Array7249 = new Class161[1];
	}
	if (bool_709_) {
	    aLongArrayArrayArray7254 = new long[i_705_][i_706_][i_707_];
	    aClass564Array7255 = new Class564[65005];
	    aBoolArray7256 = new boolean[65005];
	    anInt7253 = 0;
	}
	method8946(false, -723634971);
	aClass656_Sub1Array7228 = new Class656_Sub1[2];
	aClass656_Sub1Array7229 = new Class656_Sub1[2];
	aClass656_Sub1Array7230 = new Class656_Sub1[2];
	aClass656_Sub1Array7234 = new Class656_Sub1[10089];
	anInt7231 = 0;
	aClass656_Sub1Array7233 = new Class656_Sub1[5024];
	anInt7209 = 0;
	aClass656_Sub1_Sub3Array7235 = new Class656_Sub1_Sub3[5023];
	anInt7224 = 0;
	aBoolArrayArray7262
	    = (new boolean
	       [1 + (anInt7242 * -699511149 + -699511149 * anInt7242)]
	       [1 + (-699511149 * anInt7242 + -699511149 * anInt7242)]);
	aBoolArrayArray7260
	    = (new boolean[-699511149 * anInt7242 + -699511149 * anInt7242 + 2]
	       [2 + (-699511149 * anInt7242 + anInt7242 * -699511149)]);
	anIntArray7236
	    = new int[anInt7242 * -699511149 + anInt7242 * -699511149 + 2];
	aClass557_7207 = new Class557(false);
    }
    
    public void method9083(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_710_, int i_711_, boolean[] bools) {
	if (aClass161Array7226 != aClass161Array7249) {
	    int i_712_
		= aClass161Array7215[i].method2619(i_710_, i_711_, -237471294);
	    for (int i_713_ = 0; i_713_ <= i; i_713_++) {
		if (bools == null || bools[i_713_]) {
		    Class161 class161 = aClass161Array7215[i_713_];
		    if (null != class161)
			class161.method2575
			    (class525_sub16_sub17, i_710_,
			     i_712_ - class161.method2619(i_710_, i_711_,
							  1965763748),
			     i_711_, 0, false);
		}
	    }
	}
    }
    
    Class547 method9084(int i, int i_714_, int i_715_) {
	if (null == aClass547ArrayArrayArray7263[i][i_714_][i_715_]) {
	    boolean bool
		= (aClass547ArrayArrayArray7263[0][i_714_][i_715_] != null
		   && null != (aClass547ArrayArrayArray7263[0][i_714_][i_715_]
			       .aClass547_7269));
	    if (bool && i >= anInt7241 * 230317859 - 1)
		return null;
	    method9063(i, i_714_, i_715_, -1268732740);
	}
	return aClass547ArrayArrayArray7263[i][i_714_][i_715_];
    }
    
    void method9085(int i, int i_716_) {
	Class525_Sub16_Sub17 class525_sub16_sub17 = null;
	for (int i_717_ = i; i_717_ < i_716_; i_717_++) {
	    Class161 class161 = aClass161Array7215[i_717_];
	    if (null != class161) {
		for (int i_718_ = 0; i_718_ < 947301287 * anInt7211;
		     i_718_++) {
		    for (int i_719_ = 0; i_719_ < 1761949661 * anInt7210;
			 i_719_++) {
			class525_sub16_sub17
			    = class161.method2597(i_719_, i_718_,
						  class525_sub16_sub17);
			if (class525_sub16_sub17 != null) {
			    int i_720_ = i_719_ << anInt7200 * 1819515263;
			    int i_721_ = i_718_ << anInt7200 * 1819515263;
			    for (int i_722_ = i_717_ - 1; i_722_ >= 0;
				 i_722_--) {
				Class161 class161_723_
				    = aClass161Array7215[i_722_];
				if (class161_723_ != null) {
				    int i_724_
					= (class161.method2577(i_719_, i_718_,
							       (byte) -99)
					   - (class161_723_.method2577
					      (i_719_, i_718_, (byte) 10)));
				    int i_725_
					= (class161.method2577(i_719_ + 1,
							       i_718_,
							       (byte) 84)
					   - (class161_723_.method2577
					      (i_719_ + 1, i_718_,
					       (byte) 38)));
				    int i_726_
					= (class161.method2577(i_719_ + 1,
							       1 + i_718_,
							       (byte) 96)
					   - (class161_723_.method2577
					      (1 + i_719_, i_718_ + 1,
					       (byte) 29)));
				    int i_727_
					= (class161.method2577(i_719_,
							       i_718_ + 1,
							       (byte) -18)
					   - (class161_723_.method2577
					      (i_719_, 1 + i_718_,
					       (byte) 27)));
				    class161_723_.method2586
					(class525_sub16_sub17, i_720_,
					 ((i_726_ + (i_724_ + i_725_) + i_727_)
					  / 4),
					 i_721_, 0, false);
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method9086() {
	method8987(1, 230317859 * anInt7241, (byte) 54);
    }
    
    void method9087(Class656_Sub1 class656_sub1,
		    Class525_Sub21[] class525_sub21s) {
	if (aBool7213) {
	    int i = class656_sub1.method16920(class525_sub21s, 1172549368);
	    aClass182_7204.method3244(i, class525_sub21s);
	}
	if (aClass161Array7226 == aClass161Array7249) {
	    boolean bool = false;
	    boolean bool_728_ = false;
	    Class446 class446 = class656_sub1.method10818().aClass446_4807;
	    int i;
	    int i_729_;
	    if (class656_sub1 instanceof Class656_Sub1_Sub3) {
		i = ((Class656_Sub1_Sub3) class656_sub1).aShort11923;
		i_729_ = ((Class656_Sub1_Sub3) class656_sub1).aShort11925;
	    } else {
		i = (int) class446.aFloat4895 >> 1819515263 * anInt7200;
		i_729_ = (int) class446.aFloat4897 >> anInt7200 * 1819515263;
	    }
	    i = Math.min(anInt7210 * 1761949661 - 1, Math.max(0, i));
	    i_729_ = Math.min(947301287 * anInt7211 - 1, Math.max(0, i_729_));
	    Class176 class176 = new Class176();
	    class176.anInt1877
		= method9035(i, i_729_, -376446289) * -455052721;
	    class176.anInt1879 = method8945(i, i_729_, 889283761) * 616962313;
	    class176.anInt1883
		= method8947(i, i_729_, -1978080244) * 575868967;
	    class176.anInt1881
		= method8948(i, i_729_, -1334640927) * -1237930075;
	    class176.anInt1882 = method8949(i, i_729_, 1253218592) * 506197425;
	    class176.anInt1878 = method8950(i, i_729_, -932381380) * 86130037;
	    aClass182_7204.method3262
		(aClass161Array7215[0].method2619((int) class446.aFloat4895,
						  (int) class446.aFloat4897,
						  -1026123534),
		 class176);
	}
	Class567 class567
	    = class656_sub1.method16917(aClass182_7204, -1894348600);
	if (class567 != null) {
	    if (class567.aBool7608) {
		class567.aClass656_Sub1_7606 = class656_sub1;
		aClass557_7207.method9360(class567, (short) -14513);
	    } else
		Class168.method2718(class567, -1957019012);
	}
    }
    
    Class547 method9088(int i, int i_730_, int i_731_, byte i_732_) {
	if (null == aClass547ArrayArrayArray7263[i][i_730_][i_731_]) {
	    boolean bool
		= (aClass547ArrayArrayArray7263[0][i_730_][i_731_] != null
		   && null != (aClass547ArrayArrayArray7263[0][i_730_][i_731_]
			       .aClass547_7269));
	    if (bool && i >= anInt7241 * 230317859 - 1)
		return null;
	    method9063(i, i_730_, i_731_, -1637999611);
	}
	return aClass547ArrayArrayArray7263[i][i_730_][i_731_];
    }
    
    public void method9089() {
	for (int i = 0; i < 1999654737 * anInt7253; i++) {
	    if (!aBoolArray7256[i]) {
		Class564 class564 = aClass564Array7255[i];
		Class525_Sub21 class525_sub21 = class564.aClass525_Sub21_7595;
		int i_733_ = class564.anInt7578 * -2032095817;
		int i_734_ = (class525_sub21.method16332(1531036078)
			      - -576707309 * anInt7240);
		int i_735_ = (2 * i_734_ >> 1819515263 * anInt7200) + 1;
		int i_736_ = 0;
		int[] is = new int[i_735_ * i_735_];
		int i_737_ = (class525_sub21.method16314(1587247937) - i_734_
			      >> 1819515263 * anInt7200);
		int i_738_ = (class525_sub21.method16301((byte) 6) - i_734_
			      >> 1819515263 * anInt7200);
		int i_739_ = (class525_sub21.method16301((byte) 6) + i_734_
			      >> 1819515263 * anInt7200);
		if (i_738_ < 0) {
		    i_736_ -= i_738_;
		    i_738_ = 0;
		}
		if (i_739_ >= anInt7211 * 947301287)
		    i_739_ = anInt7211 * 947301287 - 1;
		for (int i_740_ = i_738_; i_740_ <= i_739_; i_740_++) {
		    int i_741_ = class564.aShortArray7579[i_736_];
		    int i_742_ = i_741_ >>> 8;
		    int i_743_ = i_736_ * i_735_ + i_742_;
		    int i_744_ = i_737_ + (i_741_ >>> 8);
		    int i_745_ = (i_741_ & 0xff) + i_744_ - 1;
		    if (i_744_ < 0) {
			i_743_ -= i_744_;
			i_744_ = 0;
		    }
		    if (i_745_ >= 1761949661 * anInt7210)
			i_745_ = 1761949661 * anInt7210 - 1;
		    for (int i_746_ = i_744_; i_746_ <= i_745_; i_746_++) {
			int i_747_ = 1;
			Class656_Sub1_Sub3 class656_sub1_sub3
			    = method8972(i_733_, i_746_, i_740_, null,
					 332483378);
			if (class656_sub1_sub3 != null
			    && 0 != class656_sub1_sub3.aByte11928) {
			    if (class656_sub1_sub3.aByte11928 == 1) {
				boolean bool = i_746_ - 1 >= i_744_;
				boolean bool_748_ = 1 + i_746_ <= i_745_;
				if (!bool && 1 + i_740_ <= i_739_) {
				    int i_749_
					= class564.aShortArray7579[1 + i_736_];
				    int i_750_ = (i_749_ >>> 8) + i_737_;
				    int i_751_ = (i_749_ & 0xff) + i_750_;
				    bool = i_746_ > i_750_ && i_746_ < i_751_;
				}
				if (!bool_748_ && i_740_ - 1 >= i_738_) {
				    int i_752_
					= class564.aShortArray7579[i_736_ - 1];
				    int i_753_ = i_737_ + (i_752_ >>> 8);
				    int i_754_ = i_753_ + (i_752_ & 0xff);
				    bool_748_
					= i_746_ > i_753_ && i_746_ < i_754_;
				}
				if (bool && !bool_748_)
				    i_747_ = 4;
				else if (bool_748_ && !bool)
				    i_747_ = 2;
			    } else {
				boolean bool = i_746_ - 1 >= i_744_;
				boolean bool_755_ = i_746_ + 1 <= i_745_;
				if (!bool && i_740_ - 1 >= i_738_) {
				    int i_756_
					= class564.aShortArray7579[i_736_ - 1];
				    int i_757_ = i_737_ + (i_756_ >>> 8);
				    int i_758_ = i_757_ + (i_756_ & 0xff);
				    bool = i_746_ > i_757_ && i_746_ < i_758_;
				}
				if (!bool_755_ && 1 + i_740_ <= i_739_) {
				    int i_759_
					= class564.aShortArray7579[1 + i_736_];
				    int i_760_ = (i_759_ >>> 8) + i_737_;
				    int i_761_ = (i_759_ & 0xff) + i_760_;
				    bool_755_
					= i_746_ > i_760_ && i_746_ < i_761_;
				}
				if (bool && !bool_755_)
				    i_747_ = 3;
				else if (bool_755_ && !bool)
				    i_747_ = 5;
			    }
			}
			is[i_743_++] = i_747_;
		    }
		    i_736_++;
		}
		aBoolArray7256[i] = true;
		if (aBool7232)
		    aClass161Array7226[i_733_].method2589(class525_sub21, is);
	    }
	}
    }
    
    public void method9090(int i, int i_762_, int i_763_) {
	List list = (List) aHashMap7257.get(Integer.valueOf(i));
	if (list != null) {
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class564 class564 = (Class564) iterator.next();
		class564.aClass525_Sub21_7595.method16302(i_762_, i_763_,
							  -2112022884);
	    }
	}
    }
    
    public Class656_Sub1_Sub5 method9091(int i, int i_764_, int i_765_,
					 byte i_766_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_764_][i_765_];
	if (null == class547)
	    return null;
	return class547.aClass656_Sub1_Sub5_7267;
    }
    
    void method9092(Class656_Sub1[] class656_sub1s, int i, int i_767_) {
	if (i < i_767_) {
	    int i_768_ = (i_767_ + i) / 2;
	    int i_769_ = i;
	    Class656_Sub1 class656_sub1 = class656_sub1s[i_768_];
	    class656_sub1s[i_768_] = class656_sub1s[i_767_];
	    class656_sub1s[i_767_] = class656_sub1;
	    int i_770_ = 46608013 * class656_sub1.anInt10871;
	    for (int i_771_ = i; i_771_ < i_767_; i_771_++) {
		if (46608013 * class656_sub1s[i_771_].anInt10871
		    < i_770_ + (i_771_ & 0x1)) {
		    Class656_Sub1 class656_sub1_772_ = class656_sub1s[i_771_];
		    class656_sub1s[i_771_] = class656_sub1s[i_769_];
		    class656_sub1s[i_769_++] = class656_sub1_772_;
		}
	    }
	    class656_sub1s[i_767_] = class656_sub1s[i_769_];
	    class656_sub1s[i_769_] = class656_sub1;
	    method8969(class656_sub1s, i, i_769_ - 1);
	    method8969(class656_sub1s, i_769_ + 1, i_767_);
	}
    }
    
    public HashMap method9093() {
	aHashMap7258.clear();
	Iterator iterator = aHashMap7257.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    aHashMap7258.put(entry.getKey(),
			     (((Class564) ((List) entry.getValue()).get(0))
			      .aClass525_Sub21_7595));
	}
	return aHashMap7258;
    }
    
    public HashMap method9094() {
	aHashMap7258.clear();
	Iterator iterator = aHashMap7257.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    aHashMap7258.put(entry.getKey(),
			     (((Class564) ((List) entry.getValue()).get(0))
			      .aClass525_Sub21_7595));
	}
	return aHashMap7258;
    }
    
    public Class656_Sub1_Sub4 method9095(int i, int i_773_, int i_774_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_773_][i_774_];
	if (null != class547) {
	    method8967(class547.aClass656_Sub1_Sub4_7276, 911536748);
	    if (null != class547.aClass656_Sub1_Sub4_7276) {
		Class656_Sub1_Sub4 class656_sub1_sub4
		    = class547.aClass656_Sub1_Sub4_7276;
		class547.aClass656_Sub1_Sub4_7276 = null;
		return class656_sub1_sub4;
	    }
	}
	return null;
    }
    
    public Class656_Sub1_Sub5 method9096(int i, int i_775_, int i_776_) {
	Class547 class547 = aClass547ArrayArrayArray7263[i][i_775_][i_776_];
	if (null != class547) {
	    method8967(class547.aClass656_Sub1_Sub5_7266, 716410880);
	    if (null != class547.aClass656_Sub1_Sub5_7266) {
		Class656_Sub1_Sub5 class656_sub1_sub5
		    = class547.aClass656_Sub1_Sub5_7266;
		class547.aClass656_Sub1_Sub5_7266 = null;
		return class656_sub1_sub5;
	    }
	}
	return null;
    }
    
    public void method9097(int i, int i_777_, int i_778_, int i_779_,
			   int i_780_, int i_781_, int i_782_, int i_783_,
			   int i_784_) {
	if (anIntArrayArray7217 != null)
	    anIntArrayArray7217[i][i_777_] = ~0xffffff | i_778_;
	if (null != aShortArrayArray7219)
	    aShortArrayArray7219[i][i_777_] = (short) i_779_;
	if (aByteArrayArray7259 != null)
	    aByteArrayArray7259[i][i_777_] = (byte) i_780_;
	if (aByteArrayArray7201 != null)
	    aByteArrayArray7201[i][i_777_] = (byte) i_781_;
	if (null != aByteArrayArray7222)
	    aByteArrayArray7222[i][i_777_] = (byte) i_782_;
	if (null != aByteArrayArray7212)
	    aByteArrayArray7212[i][i_777_] = (byte) i_783_;
    }
    
    static final void method9098(Class683 class683, byte i) {
	Class40_Sub20.aClass217_11050.method4022(501271953);
    }
    
    public static void method9099(int[] is, int[] is_785_, int i, int i_786_,
				  int i_787_) {
	if (i < i_786_) {
	    int i_788_ = (i_786_ + i) / 2;
	    int i_789_ = i;
	    int i_790_ = is[i_788_];
	    is[i_788_] = is[i_786_];
	    is[i_786_] = i_790_;
	    int i_791_ = is_785_[i_788_];
	    is_785_[i_788_] = is_785_[i_786_];
	    is_785_[i_786_] = i_791_;
	    int i_792_ = 2147483647 == i_790_ ? 0 : 1;
	    for (int i_793_ = i; i_793_ < i_786_; i_793_++) {
		if (is[i_793_] < (i_793_ & i_792_) + i_790_) {
		    int i_794_ = is[i_793_];
		    is[i_793_] = is[i_789_];
		    is[i_789_] = i_794_;
		    int i_795_ = is_785_[i_793_];
		    is_785_[i_793_] = is_785_[i_789_];
		    is_785_[i_789_++] = i_795_;
		}
	    }
	    is[i_786_] = is[i_789_];
	    is[i_789_] = i_790_;
	    is_785_[i_786_] = is_785_[i_789_];
	    is_785_[i_789_] = i_791_;
	    method9099(is, is_785_, i, i_789_ - 1, 1782313374);
	    method9099(is, is_785_, 1 + i_789_, i_786_, 1782313374);
	}
    }
    
    static void method9100(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class525_Sub42.method16883((byte) 18);
    }
}
