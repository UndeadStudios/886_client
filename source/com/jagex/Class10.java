/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public final class Class10 implements Iterable
{
    int anInt140;
    Class525[] aClass525Array141;
    long aLong142;
    Class525 aClass525_143;
    Class525 aClass525_144;
    int anInt145 = 0;
    
    public Class525 method683() {
	if (aClass525_143 == null)
	    return null;
	for (Class525 class525
		 = aClass525Array141[(int) (aLong142 * 2405131964707400559L
					    & (long) (anInt140 * -1391706339
						      - 1))];
	     class525 != aClass525_143;
	     aClass525_143 = aClass525_143.aClass525_7112) {
	    if (aLong142 * 2405131964707400559L
		== aClass525_143.aLong7113 * -5126207504388691097L) {
		Class525 class525_0_ = aClass525_143;
		aClass525_143 = aClass525_143.aClass525_7112;
		return class525_0_;
	    }
	}
	aClass525_143 = null;
	return null;
    }
    
    public Class525 method684(long l) {
	aLong142 = -4432147385041333361L * l;
	Class525 class525
	    = (aClass525Array141
	       [(int) (l & (long) (-1391706339 * anInt140 - 1))]);
	for (aClass525_143 = class525.aClass525_7112;
	     class525 != aClass525_143;
	     aClass525_143 = aClass525_143.aClass525_7112) {
	    if (l == aClass525_143.aLong7113 * -5126207504388691097L) {
		Class525 class525_1_ = aClass525_143;
		aClass525_143 = aClass525_143.aClass525_7112;
		return class525_1_;
	    }
	}
	aClass525_143 = null;
	return null;
    }
    
    public Class525 method685() {
	if (anInt145 * -1901445079 > 0
	    && (aClass525_144
		!= aClass525Array141[anInt145 * -1901445079 - 1])) {
	    Class525 class525 = aClass525_144;
	    aClass525_144 = class525.aClass525_7112;
	    return class525;
	}
	while (-1901445079 * anInt145 < anInt140 * -1391706339) {
	    Class525 class525
		= (aClass525Array141[(anInt145 += 904485913) * -1901445079 - 1]
		   .aClass525_7112);
	    if (class525 != aClass525Array141[-1901445079 * anInt145 - 1]) {
		aClass525_144 = class525.aClass525_7112;
		return class525;
	    }
	}
	return null;
    }
    
    public int method686(Class525[] class525s, int i) {
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < -1391706339 * anInt140; i_3_++) {
	    Class525 class525 = aClass525Array141[i_3_];
	    for (Class525 class525_4_ = class525.aClass525_7112;
		 class525 != class525_4_;
		 class525_4_ = class525_4_.aClass525_7112)
		class525s[i_2_++] = class525_4_;
	}
	return i_2_;
    }
    
    public Class10(int i) {
	anInt140 = i * -1519092939;
	aClass525Array141 = new Class525[i];
	for (int i_5_ = 0; i_5_ < i; i_5_++) {
	    Class525 class525 = aClass525Array141[i_5_] = new Class525();
	    class525.aClass525_7112 = class525;
	    class525.aClass525_7111 = class525;
	}
    }
    
    public int method687(int i) {
	int i_6_ = 0;
	for (int i_7_ = 0; i_7_ < -1391706339 * anInt140; i_7_++) {
	    Class525 class525 = aClass525Array141[i_7_];
	    for (Class525 class525_8_ = class525.aClass525_7112;
		 class525_8_ != class525;
		 class525_8_ = class525_8_.aClass525_7112)
		i_6_++;
	}
	return i_6_;
    }
    
    public void method688(short i) {
	for (int i_9_ = 0; i_9_ < anInt140 * -1391706339; i_9_++) {
	    Class525 class525 = aClass525Array141[i_9_];
	    for (;;) {
		Class525 class525_10_ = class525.aClass525_7112;
		if (class525_10_ == class525)
		    break;
		class525_10_.method8755(-1933461091);
	    }
	}
	aClass525_143 = null;
	aClass525_144 = null;
    }
    
    public Class525 method689(int i) {
	anInt145 = 0;
	return method690((byte) 48);
    }
    
    public Class525 method690(byte i) {
	if (anInt145 * -1901445079 > 0
	    && (aClass525_144
		!= aClass525Array141[anInt145 * -1901445079 - 1])) {
	    Class525 class525 = aClass525_144;
	    aClass525_144 = class525.aClass525_7112;
	    return class525;
	}
	while (-1901445079 * anInt145 < anInt140 * -1391706339) {
	    Class525 class525
		= (aClass525Array141[(anInt145 += 904485913) * -1901445079 - 1]
		   .aClass525_7112);
	    if (class525 != aClass525Array141[-1901445079 * anInt145 - 1]) {
		aClass525_144 = class525.aClass525_7112;
		return class525;
	    }
	}
	return null;
    }
    
    public Class525 method691(long l) {
	aLong142 = -4432147385041333361L * l;
	Class525 class525
	    = (aClass525Array141
	       [(int) (l & (long) (-1391706339 * anInt140 - 1))]);
	for (aClass525_143 = class525.aClass525_7112;
	     class525 != aClass525_143;
	     aClass525_143 = aClass525_143.aClass525_7112) {
	    if (l == aClass525_143.aLong7113 * -5126207504388691097L) {
		Class525 class525_11_ = aClass525_143;
		aClass525_143 = aClass525_143.aClass525_7112;
		return class525_11_;
	    }
	}
	aClass525_143 = null;
	return null;
    }
    
    public Iterator method692() {
	return new Class21(this);
    }
    
    public Iterator method693() {
	return new Class21(this);
    }
    
    public Class525 method694(long l) {
	aLong142 = -4432147385041333361L * l;
	Class525 class525
	    = (aClass525Array141
	       [(int) (l & (long) (-1391706339 * anInt140 - 1))]);
	for (aClass525_143 = class525.aClass525_7112;
	     class525 != aClass525_143;
	     aClass525_143 = aClass525_143.aClass525_7112) {
	    if (l == aClass525_143.aLong7113 * -5126207504388691097L) {
		Class525 class525_12_ = aClass525_143;
		aClass525_143 = aClass525_143.aClass525_7112;
		return class525_12_;
	    }
	}
	aClass525_143 = null;
	return null;
    }
    
    public void method695(Class525 class525, long l) {
	if (null != class525.aClass525_7111)
	    class525.method8755(-1933461091);
	Class525 class525_13_
	    = (aClass525Array141
	       [(int) (l & (long) (-1391706339 * anInt140 - 1))]);
	class525.aClass525_7111 = class525_13_.aClass525_7111;
	class525.aClass525_7112 = class525_13_;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
	class525.aLong7113 = 2638983450515767383L * l;
    }
    
    public Class525 method696(int i) {
	if (aClass525_143 == null)
	    return null;
	for (Class525 class525
		 = aClass525Array141[(int) (aLong142 * 2405131964707400559L
					    & (long) (anInt140 * -1391706339
						      - 1))];
	     class525 != aClass525_143;
	     aClass525_143 = aClass525_143.aClass525_7112) {
	    if (aLong142 * 2405131964707400559L
		== aClass525_143.aLong7113 * -5126207504388691097L) {
		Class525 class525_14_ = aClass525_143;
		aClass525_143 = aClass525_143.aClass525_7112;
		return class525_14_;
	    }
	}
	aClass525_143 = null;
	return null;
    }
    
    public int method697(Class525[] class525s) {
	int i = 0;
	for (int i_15_ = 0; i_15_ < -1391706339 * anInt140; i_15_++) {
	    Class525 class525 = aClass525Array141[i_15_];
	    for (Class525 class525_16_ = class525.aClass525_7112;
		 class525 != class525_16_;
		 class525_16_ = class525_16_.aClass525_7112)
		class525s[i++] = class525_16_;
	}
	return i;
    }
    
    public Iterator iterator() {
	return new Class21(this);
    }
    
    public void method698(Class525 class525, long l) {
	if (null != class525.aClass525_7111)
	    class525.method8755(-1933461091);
	Class525 class525_17_
	    = (aClass525Array141
	       [(int) (l & (long) (-1391706339 * anInt140 - 1))]);
	class525.aClass525_7111 = class525_17_.aClass525_7111;
	class525.aClass525_7112 = class525_17_;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
	class525.aLong7113 = 2638983450515767383L * l;
    }
    
    public void method699(Class525 class525, long l) {
	if (null != class525.aClass525_7111)
	    class525.method8755(-1933461091);
	Class525 class525_18_
	    = (aClass525Array141
	       [(int) (l & (long) (-1391706339 * anInt140 - 1))]);
	class525.aClass525_7111 = class525_18_.aClass525_7111;
	class525.aClass525_7112 = class525_18_;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
	class525.aLong7113 = 2638983450515767383L * l;
    }
    
    public void method700(Class525 class525, long l) {
	if (null != class525.aClass525_7111)
	    class525.method8755(-1933461091);
	Class525 class525_19_
	    = (aClass525Array141
	       [(int) (l & (long) (-1391706339 * anInt140 - 1))]);
	class525.aClass525_7111 = class525_19_.aClass525_7111;
	class525.aClass525_7112 = class525_19_;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
	class525.aLong7113 = 2638983450515767383L * l;
    }
    
    public void method701(Class525 class525, long l) {
	if (null != class525.aClass525_7111)
	    class525.method8755(-1933461091);
	Class525 class525_20_
	    = (aClass525Array141
	       [(int) (l & (long) (-1391706339 * anInt140 - 1))]);
	class525.aClass525_7111 = class525_20_.aClass525_7111;
	class525.aClass525_7112 = class525_20_;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
	class525.aLong7113 = 2638983450515767383L * l;
    }
    
    public void method702() {
	for (int i = 0; i < anInt140 * -1391706339; i++) {
	    Class525 class525 = aClass525Array141[i];
	    for (;;) {
		Class525 class525_21_ = class525.aClass525_7112;
		if (class525_21_ == class525)
		    break;
		class525_21_.method8755(-1933461091);
	    }
	}
	aClass525_143 = null;
	aClass525_144 = null;
    }
    
    public Class525 method703() {
	if (anInt145 * -1901445079 > 0
	    && (aClass525_144
		!= aClass525Array141[anInt145 * -1901445079 - 1])) {
	    Class525 class525 = aClass525_144;
	    aClass525_144 = class525.aClass525_7112;
	    return class525;
	}
	while (-1901445079 * anInt145 < anInt140 * -1391706339) {
	    Class525 class525
		= (aClass525Array141[(anInt145 += 904485913) * -1901445079 - 1]
		   .aClass525_7112);
	    if (class525 != aClass525Array141[-1901445079 * anInt145 - 1]) {
		aClass525_144 = class525.aClass525_7112;
		return class525;
	    }
	}
	return null;
    }
    
    public int method704(Class525[] class525s) {
	int i = 0;
	for (int i_22_ = 0; i_22_ < -1391706339 * anInt140; i_22_++) {
	    Class525 class525 = aClass525Array141[i_22_];
	    for (Class525 class525_23_ = class525.aClass525_7112;
		 class525 != class525_23_;
		 class525_23_ = class525_23_.aClass525_7112)
		class525s[i++] = class525_23_;
	}
	return i;
    }
    
    static final void method705(int i) {
	for (Class525_Sub16_Sub13 class525_sub16_sub13
		 = ((Class525_Sub16_Sub13)
		    client.aClass709_11247.method14372((short) -27880));
	     class525_sub16_sub13 != null;
	     class525_sub16_sub13
		 = ((Class525_Sub16_Sub13)
		    client.aClass709_11247.method14353(-1522164252))) {
	    Class656_Sub1_Sub3_Sub5 class656_sub1_sub3_sub5
		= class525_sub16_sub13.aClass656_Sub1_Sub3_Sub5_11838;
	    if (client.anInt11083
		> class656_sub1_sub3_sub5.anInt12174 * -1258016991) {
		class525_sub16_sub13.method8755(-1933461091);
		class656_sub1_sub3_sub5.method18862((byte) -24);
	    } else if (client.anInt11083
		       >= -237642011 * class656_sub1_sub3_sub5.anInt12173) {
		class656_sub1_sub3_sub5.method18858(980602837);
		if (class656_sub1_sub3_sub5.anInt12182 * 325035595 > 0) {
		    if (1874190559 * client.anInt11145 == 4) {
			Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1
			    = Class201.aClass205Array2202
				  [(class656_sub1_sub3_sub5.anInt12182
				    * 325035595) - 1]
				  .method3864(-1267059733);
			if (class656_sub1_sub3_sub1 != null) {
			    Class446 class446
				= (class656_sub1_sub3_sub1.method10818()
				   .aClass446_4807);
			    if ((int) class446.aFloat4895 >= 0
				&& ((int) class446.aFloat4895
				    < client.aClass507_11137
					  .method8412(194221770) * 512)
				&& (int) class446.aFloat4897 >= 0
				&& ((int) class446.aFloat4897
				    < client.aClass507_11137
					  .method8352((byte) -15) * 512))
				class656_sub1_sub3_sub5.method18857
				    ((int) class446.aFloat4895,
				     (int) class446.aFloat4897,
				     ((Class335.method5855
				       ((int) class446.aFloat4895,
					(int) class446.aFloat4897,
					class656_sub1_sub3_sub1.aByte10867,
					2020563229))
				      - -555583789 * (class656_sub1_sub3_sub5
						      .anInt12172)),
				     client.anInt11083, (short) 9900);
			}
		    } else {
			Class525_Sub19 class525_sub19
			    = ((Class525_Sub19)
			       (client.aClass10_11121.method684
				((long) ((325035595
					  * class656_sub1_sub3_sub5.anInt12182)
					 - 1))));
			if (class525_sub19 != null) {
			    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
				= ((Class656_Sub1_Sub3_Sub1_Sub2)
				   class525_sub19.anObject10571);
			    Class446 class446
				= (class656_sub1_sub3_sub1_sub2.method10818()
				   .aClass446_4807);
			    if ((int) class446.aFloat4895 >= 0
				&& ((int) class446.aFloat4895
				    < client.aClass507_11137
					  .method8412(1282784892) * 512)
				&& (int) class446.aFloat4897 >= 0
				&& ((int) class446.aFloat4897
				    < client.aClass507_11137
					  .method8352((byte) -116) * 512))
				class656_sub1_sub3_sub5.method18857
				    ((int) class446.aFloat4895,
				     (int) class446.aFloat4897,
				     ((Class335.method5855
				       ((int) class446.aFloat4895,
					(int) class446.aFloat4897,
					class656_sub1_sub3_sub5.aByte10867,
					2020563229))
				      - (class656_sub1_sub3_sub5.anInt12172
					 * -555583789)),
				     client.anInt11083, (short) -9810);
			}
		    }
		}
		if (325035595 * class656_sub1_sub3_sub5.anInt12182 < 0) {
		    int i_24_
			= (-(class656_sub1_sub3_sub5.anInt12182 * 325035595)
			   - 1);
		    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1;
		    if (client.anInt11053 * 615376671 == i_24_)
			class656_sub1_sub3_sub1_sub1
			    = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705;
		    else
			class656_sub1_sub3_sub1_sub1
			    = (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			       [i_24_]);
		    if (class656_sub1_sub3_sub1_sub1 != null) {
			Class446 class446
			    = (class656_sub1_sub3_sub1_sub1.method10818()
			       .aClass446_4807);
			if ((int) class446.aFloat4895 >= 0
			    && ((int) class446.aFloat4895
				< client.aClass507_11137
				      .method8412(1988597939) * 512)
			    && (int) class446.aFloat4897 >= 0
			    && ((int) class446.aFloat4897
				< client.aClass507_11137
				      .method8352((byte) -105) * 512))
			    class656_sub1_sub3_sub5.method18857
				((int) class446.aFloat4895,
				 (int) class446.aFloat4897,
				 (Class335.method5855((int) (class446
							     .aFloat4895),
						      (int) (class446
							     .aFloat4897),
						      (class656_sub1_sub3_sub5
						       .aByte10867),
						      2020563229)
				  - (-555583789
				     * class656_sub1_sub3_sub5.anInt12172)),
				 client.anInt11083, (short) -1260);
		    }
		}
		class656_sub1_sub3_sub5
		    .method18859(70369845 * client.anInt11173, 752754504);
		client.aClass507_11137.method8358((byte) 30)
		    .method8956(class656_sub1_sub3_sub5, true, (byte) 99);
	    }
	}
    }
    
    static final void method706(Class683 class683, byte i) {
	int i_25_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_25_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_25_ >> 16];
	Class457.method7464(class259, class245, class683, (short) 681);
    }
    
    static final void method707(Class683 class683, byte i) {
	int i_26_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class8 class8
	    = ((Class8)
	       Class313_Sub2.aClass40_Sub22_10106.method76(i_26_, -693717535));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 2 == 1051584679 * class8.anInt56 ? 1 : 0;
    }
}
