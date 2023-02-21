/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;

public class Class221
{
    long aLong2332;
    Interface27 anInterface27_2333;
    LinkedList aLinkedList2334;
    int anInt2335 = -1964443771;
    static Class693 aClass693_2336;
    
    public Class221(RSBuffer class525_sub38, Interface27 interface27) {
	aLinkedList2334 = new LinkedList();
	anInterface27_2333 = interface27;
	aLong2332
	    = class525_sub38.method16603(361051818) * -6966826626226396061L;
	anInt2335 = class525_sub38.readInt(1763709696) * 1964443771;
	for (int i = class525_sub38.readUnsignedByte(68353092); 0 != i;
		 i = class525_sub38.readUnsignedByte(1857095324)) {
	    Class236 class236
		= ((Class236)
		   Class539.method8888(Class236.method4405((byte) -29), i,
				       -155291944));
	    Interface28 interface28;
	    switch (class236.anInt2389 * -1645394613) {
	    case 6:
		interface28 = new Class216(this);
		break;
	    case 11:
		interface28 = new Class225(this, class525_sub38);
		break;
	    case 9:
		interface28 = new Class248(this, class525_sub38);
		break;
	    case 5:
		interface28 = new Class252(this, class525_sub38);
		break;
	    case 7:
		interface28 = new Class234(this, class525_sub38);
		break;
	    case 4:
		interface28 = new Class233(this, class525_sub38);
		break;
	    case 8:
		interface28 = new Class224(this, class525_sub38);
		break;
	    case 1:
		interface28 = new Class231(this, class525_sub38);
		break;
	    case 2:
		interface28 = new Class212(this, class525_sub38);
		break;
	    default:
		throw new IllegalStateException("");
	    case 12:
		interface28 = new Class219(this, class525_sub38);
		break;
	    case 10:
		interface28 = new Class227(this, class525_sub38);
		break;
	    case 13:
		interface28 = new Class240(this);
		break;
	    case 0:
		interface28 = new Class232(this, class525_sub38);
		break;
	    case 3:
		interface28 = new Class237(this, class525_sub38);
	    }
	    aLinkedList2334.add(interface28);
	}
    }
    
    public void method4209(Class228 class228, int i) {
	if ((aLong2332 * 2905729653910453579L
	     != 4573397280263845675L * class228.aLong2354)
	    || class228.method4266((byte) -1) != anInt2335 * 381130419)
	    throw new IllegalStateException("");
	Iterator iterator = aLinkedList2334.iterator();
	while (iterator.hasNext()) {
	    Interface28 interface28 = (Interface28) iterator.next();
	    interface28.method163(class228, 2131965359);
	}
	class228.method4267((byte) 95);
    }
    
    public void method4210(Class228 class228) {
	if ((aLong2332 * 2905729653910453579L
	     != 4573397280263845675L * class228.aLong2354)
	    || class228.method4266((byte) 66) != anInt2335 * 381130419)
	    throw new IllegalStateException("");
	Iterator iterator = aLinkedList2334.iterator();
	while (iterator.hasNext()) {
	    Interface28 interface28 = (Interface28) iterator.next();
	    interface28.method163(class228, 1706944064);
	}
	class228.method4267((byte) 64);
    }
    
    public void method4211(Class228 class228) {
	if ((aLong2332 * 2905729653910453579L
	     != 4573397280263845675L * class228.aLong2354)
	    || class228.method4266((byte) -85) != anInt2335 * 381130419)
	    throw new IllegalStateException("");
	Iterator iterator = aLinkedList2334.iterator();
	while (iterator.hasNext()) {
	    Interface28 interface28 = (Interface28) iterator.next();
	    interface28.method163(class228, 461255228);
	}
	class228.method4267((byte) 76);
    }
    
    static final void method4212(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class532.aClass111_7170.method498(i_0_, (short) -4045);
    }
    
    static final void method4213(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static int method4214(CharSequence charsequence, int i) {
	int i_1_ = charsequence.length();
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
	    i_2_ = ((i_2_ << 5) - i_2_
		    + Class28.method908(charsequence.charAt(i_3_),
					-2099340796));
	return i_2_;
    }
    
    static final void method4215(Class683 class683, byte i) {
	client.aBool11110 = true;
	Class401.method6556((byte) 12);
    }
    
    static void method4216(Class525_Sub2 class525_sub2, int i, int i_4_,
			   int i_5_, int i_6_, byte i_7_) {
	if (-1 != -1235567057 * class525_sub2.anInt10434
	    || class525_sub2.anIntArray10426 != null) {
	    int i_8_ = -14900385 * class525_sub2.anInt10422;
	    if (198092829 * class525_sub2.anInt10421 == 0
		|| Class198_Sub13.aClass525_Sub30_9973
		       .aClass696_Sub45_10726.method17416(2054912998) == 0
		|| i != -1116430801 * class525_sub2.anInt10430) {
		if (null != class525_sub2.aClass488_10435) {
		    class525_sub2.aClass488_10435.method7916(100, (byte) -124);
		    Class40_Sub20.aClass217_11050
			.method4026(class525_sub2.aClass488_10435, -172962125);
		    class525_sub2.aClass488_10435 = null;
		}
	    } else {
		if (null != class525_sub2.aClass488_10435
		    && ((class525_sub2.aClass488_10435.method7879((byte) 109)
			 == Class482.aClass482_5224)
			|| (class525_sub2.aClass488_10435
				.method7879((byte) 116)
			    == Class482.aClass482_5229))) {
		    Class40_Sub20.aClass217_11050
			.method4026(class525_sub2.aClass488_10435, 952216953);
		    class525_sub2.aClass488_10435 = null;
		}
		if (class525_sub2.aClass488_10435 == null) {
		    if (class525_sub2.anInt10434 * -1235567057 >= 0) {
			int i_9_ = 256;
			int i_10_
			    = (int) ((float) (-1434804169
					      * class525_sub2.anInt10413)
				     + (0.5F
					* (float) ((-865187879
						    * class525_sub2.anInt10416)
						   - (-1434804169
						      * (class525_sub2
							 .anInt10413)))));
			int i_11_
			    = (int) ((float) (778074015
					      * class525_sub2.anInt10415)
				     + (0.5F
					* (float) ((class525_sub2.anInt10428
						    * -1839157267)
						   - (class525_sub2.anInt10415
						      * 778074015))));
			class525_sub2.aClass446_10418.aFloat4895
			    = (float) i_10_;
			class525_sub2.aClass446_10418.aFloat4897
			    = (float) i_11_;
			class525_sub2.aClass488_10435
			    = (Class40_Sub20.aClass217_11050.method4046
			       (Class204.aClass204_2225, class525_sub2,
				-1235567057 * class525_sub2.anInt10434, -1, 0,
				Class208.aClass208_2254
				    .method3907((short) -13682),
				Class195.aClass195_2180,
				(float) (class525_sub2.anInt10420
					 * -312955735),
				(float) (198092829 * class525_sub2.anInt10421),
				class525_sub2.aClass446_10418, 0, i_9_, false,
				1195973299));
			if (class525_sub2.aClass488_10435 != null) {
			    float f = (float) i_8_ / 255.0F;
			    class525_sub2.aClass488_10435
				.method7957(f, 150, (byte) -29);
			    class525_sub2.aClass488_10435
				.method7928(-1454129374);
			}
		    }
		} else {
		    int i_12_
			= (int) ((float) (-1434804169
					  * class525_sub2.anInt10413)
				 + 0.5F * (float) ((class525_sub2.anInt10416
						    * -865187879)
						   - (-1434804169
						      * (class525_sub2
							 .anInt10413))));
		    int i_13_
			= (int) ((float) ((class525_sub2.anInt10428
					   * -1839157267)
					  - 778074015 * (class525_sub2
							 .anInt10415)) * 0.5F
				 + (float) (778074015
					    * class525_sub2.anInt10415));
		    class525_sub2.aClass446_10418.aFloat4895 = (float) i_12_;
		    class525_sub2.aClass446_10418.aFloat4897 = (float) i_13_;
		}
		if (class525_sub2.aClass488_10436 == null) {
		    if (null != class525_sub2.anIntArray10426
			&& ((class525_sub2.anInt10440 -= -1781681283 * i_6_)
			    * 1455332821) <= 0) {
			int i_14_
			    = ((256 == 1049036215 * class525_sub2.anInt10433
				&& (256
				    == class525_sub2.anInt10432 * -920530439))
			       ? 256
			       : ((int) (Math.random()
					 * (double) ((class525_sub2.anInt10433
						      * 1049036215)
						     - (-920530439
							* (class525_sub2
							   .anInt10432))))
				  + class525_sub2.anInt10432 * -920530439));
			int i_15_
			    = (int) (Math.random()
				     * (double) (class525_sub2
						 .anIntArray10426).length);
			int i_16_
			    = (int) (((float) ((class525_sub2.anInt10416
						* -865187879)
					       - (-1434804169
						  * class525_sub2.anInt10413))
				      * 0.5F)
				     + (float) (class525_sub2.anInt10413
						* -1434804169));
			int i_17_
			    = (int) (((float) ((-1839157267
						* class525_sub2.anInt10428)
					       - (778074015
						  * class525_sub2.anInt10415))
				      * 0.5F)
				     + (float) (class525_sub2.anInt10415
						* 778074015));
			class525_sub2.aClass446_10419.aFloat4895
			    = (float) i_16_;
			class525_sub2.aClass446_10419.aFloat4897
			    = (float) i_17_;
			class525_sub2.aClass488_10436
			    = (Class40_Sub20.aClass217_11050.method4046
			       (Class204.aClass204_2232, class525_sub2,
				class525_sub2.anIntArray10426[i_15_], 0, i_8_,
				Class208.aClass208_2259
				    .method3907((short) -4682),
				Class195.aClass195_2180,
				(float) (-312955735
					 * class525_sub2.anInt10420),
				(float) (-312955735 * class525_sub2.anInt10420
					 + (198092829
					    * class525_sub2.anInt10421)),
				class525_sub2.aClass446_10419, 0, i_14_, false,
				4465632));
			if (null != class525_sub2.aClass488_10436)
			    class525_sub2.aClass488_10436
				.method7928(-1222896084);
			class525_sub2.anInt10440
			    = ((-713609855 * class525_sub2.anInt10437
				+ (int) (Math.random()
					 * (double) ((class525_sub2.anInt10438
						      * -1316809477)
						     - (-713609855
							* (class525_sub2
							   .anInt10437)))))
			       * -1781681283);
		    }
		} else {
		    int i_18_
			= (int) (0.5F * (float) ((class525_sub2.anInt10416
						  * -865187879)
						 - (class525_sub2.anInt10413
						    * -1434804169))
				 + (float) (-1434804169
					    * class525_sub2.anInt10413));
		    int i_19_ = (int) ((float) ((-1839157267
						 * class525_sub2.anInt10428)
						- (class525_sub2.anInt10415
						   * 778074015)) * 0.5F
				       + (float) (class525_sub2.anInt10415
						  * 778074015));
		    class525_sub2.aClass446_10419.aFloat4895 = (float) i_18_;
		    class525_sub2.aClass446_10419.aFloat4897 = (float) i_19_;
		    if ((class525_sub2.aClass488_10436.method7879((byte) 72)
			 == Class482.aClass482_5224)
			|| (class525_sub2.aClass488_10436.method7879((byte) 20)
			    == Class482.aClass482_5229)) {
			Class40_Sub20.aClass217_11050.method4026
			    (class525_sub2.aClass488_10436, 1425131134);
			class525_sub2.aClass488_10436 = null;
		    }
		}
	    }
	}
    }
    
    static final void method4217(Class683 class683, byte i) {
	int i_20_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (null != client.aString11337
	    && i_20_ < -218000115 * Class110.anInt1371)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= Class699.aClass99Array8774[i_20_].anInt1210 * 82498617;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method4218(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 2074436441 * Class70.anInt740;
    }
}
