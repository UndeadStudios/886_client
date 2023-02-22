/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Class255 implements Interface41
{
    int anInt2478;
    int anInt2479;
    int anInt2480;
    int anInt2481;
    int anInt2482;
    boolean aBool2483;
    List aList2484 = new ArrayList();
    Class376 aClass376_2485 = Class376.aClass376_3900;
    int anInt2486;
    Class391 aClass391_2487;
    RSBuffer aClass525_Sub38_2488;
    Class250 aClass250_2489;
    int anInt2490;
    float aFloat2491;
    Class397 aClass397_2492;
    int anInt2493;
    Class258[] aClass258Array2494;
    Class254[] aClass254Array2495;
    Class253[] aClass253Array2496;
    Class244[] aClass244Array2497;
    boolean[] aBoolArray2498;
    int[] anIntArray2499;
    Class250[] aClass250Array2500;
    int anInt2501;
    int anInt2502;
    boolean[] aBoolArray2503;
    Class250[] aClass250Array2504;
    List aList2505;
    Class250 aClass250_2506;
    Class250 aClass250_2507;
    int anInt2508;
    Class250 aClass250_2509;
    Interface46 anInterface46_2510;
    int[] anIntArray2511;
    int[] anIntArray2512;
    boolean aBool2513;
    List aList2514 = new ArrayList();
    boolean aBool2515;
    Class250 aClass250_2516;
    int anInt2517;
    List aList2518;
    int anInt2519;
    boolean aBool2520;
    boolean aBool2521;
    int anInt2522;
    int anInt2523;
    int anInt2524;
    int anInt2525;
    Class250 aClass250_2526;
    boolean[] aBoolArray2527;
    int anInt2528;
    boolean aBool2529;
    int anInt2530;
    int anInt2531;
    int anInt2532;
    int anInt2533;
    AtomicReference anAtomicReference2534;
    List aList2535;
    int anInt2536;
    Class250[] aClass250Array2537;
    int anInt2538;
    int anInt2539;
    int anInt2540;
    static Class200 aClass200_2541;
    byte[] aByteArray2542;
    int anInt2543;
    static List aList2544 = new ArrayList();
    boolean[] aBoolArray2545;
    int anInt2546;
    boolean[] aBoolArray2547;
    
    int method4550(int i) {
	int i_0_ = 0;
	int i_1_ = 0;
	int i_2_;
	for (/**/; i >= 8 - anInt2530; i -= i_2_) {
	    i_2_ = 8 - anInt2530;
	    int i_3_ = (1 << i_2_) - 1;
	    i_0_ += (aByteArray2542[anInt2531] >> anInt2530 & i_3_) << i_1_;
	    anInt2530 = 0;
	    anInt2531++;
	    i_1_ += i_2_;
	}
	if (i > 0) {
	    i_2_ = (1 << i) - 1;
	    i_0_ += (aByteArray2542[anInt2531] >> anInt2530 & i_2_) << i_1_;
	    anInt2530 += i;
	}
	return i_0_;
    }
    
    public Class376 method281() {
	return aClass376_2485;
    }
    
    public void method285() {
	if (method281() != Class376.aClass376_3896) {
	    method4634(false);
	    method4552(Class376.aClass376_3900);
	} else {
	    method4634(false);
	    method4552(Class376.aClass376_3898);
	}
    }
    
    void method4551() {
	int i = method4550(8) + 1;
	Iterator iterator = aList2544.iterator();
	while (iterator.hasNext()) {
	    Class247 class247 = (Class247) iterator.next();
	    if (class247.anInt2437 == 0 && class247.anInt2438 == 0) {
		if (class247.aClass258Array2440.length == i
		    && class247.anInt2436 == anInt2479
		    && class247.anInt2439 == anInt2486
		    && class247.anInt2435 == anInt2481) {
		    aClass258Array2494 = class247.aClass258Array2440;
		    for (int i_4_ = 0; i_4_ < aClass258Array2494.length;
			 i_4_++)
			aClass258Array2494[i_4_].method4665(this);
		    return;
		}
	    }
	}
	aClass258Array2494 = new Class258[i];
	for (int i_5_ = 0; i_5_ < i; i_5_++) {
	    if (aClass258Array2494[i_5_] == null)
		aClass258Array2494[i_5_] = new Class258();
	    aClass258Array2494[i_5_].method4675(this);
	}
	Class247 class247
	    = new Class247(anInt2479, anInt2486, anInt2480, anInt2482,
			   anInt2481, aClass258Array2494);
	aList2544.add(class247);
    }
    
    void method4552(Class376 class376) {
	aClass376_2485 = class376;
    }
    
    public void method298() {
	if (method281() == Class376.aClass376_3898
	    || method281() == Class376.aClass376_3900
	    || method281() == Class376.aClass376_3897) {
	    method4552(Class376.aClass376_3896);
	    method4637();
	}
    }
    
    public void method56(RSBuffer class525_sub38) {
	if (method281() == Class376.aClass376_3902
	    || method281() == Class376.aClass376_3901) {
	    if (class525_sub38 != null)
		class525_sub38.method16627(-2029780956);
	} else if (class525_sub38 == null) {
	    boolean bool = aBool2483 && (anInt2508 > 0 && anInt2519 < anInt2508
					 || anInt2508 < 0);
	    if (aList2518.isEmpty()) {
		if (!bool) {
		    method4572();
		    method4552(Class376.aClass376_3901);
		}
	    } else if (!bool) {
		method4572();
		method4552(Class376.aClass376_3902);
	    }
	    if (bool)
		method4634(true);
	} else
	    method4590(class525_sub38);
    }
    
    int method4553(int i) {
	int i_6_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_6_++;
	return i_6_;
    }
    
    public RSBuffer method286(int i) {
	RSBuffer class525_sub38 = method4558(i);
	return class525_sub38;
    }
    
    public int method77() {
	return method4588();
    }
    
    public int method190(int i) {
	return i / (method290().anInt4107 * -1339941795 / 8);
    }
    
    public int method283(int i) {
	return i * (method290().anInt4107 * -1339941795 / 8);
    }
    
    int method4554() {
	if (method289())
	    return anInt2486;
	throw new RuntimeException("");
    }
    
    public Class397 method290() {
	return aClass397_2492;
    }
    
    public Class391 method313() {
	return aClass391_2487;
    }
    
    public void method309() {
	if (method281() != Class376.aClass376_3896) {
	    method4634(false);
	    method4552(Class376.aClass376_3900);
	} else {
	    method4634(false);
	    method4552(Class376.aClass376_3898);
	}
    }
    
    int method4555() {
	int i = aByteArray2542[anInt2531] >> anInt2530 & 0x1;
	anInt2530++;
	anInt2531 += anInt2530 >> 3;
	anInt2530 &= 0x7;
	return i;
    }
    
    int method4556() {
	if (aBool2520)
	    return anInt2479;
	throw new RuntimeException("");
    }
    
    public int method224() {
	if (aBool2520)
	    return method4556() < anInt2543 ? anInt2543 : method4556();
	throw new RuntimeException("");
    }
    
    public synchronized boolean method289() {
	return aBool2521;
    }
    
    synchronized void method4557(boolean bool) {
	aBool2521 = bool;
    }
    
    RSBuffer method4558(int i) {
	RSBuffer class525_sub38 = method4635(method283(i));
	int i_7_ = i;
	synchronized (aList2518) {
	    while (!aList2518.isEmpty()) {
		RSBuffer class525_sub38_8_
		    = (RSBuffer) aList2518.remove(0);
		anInt2539
		    -= (method190(class525_sub38_8_.index * -1133521593)
			/ method224());
		int i_9_ = method283(i_7_);
		int i_10_
		    = (class525_sub38_8_.index * -1133521593 < i_9_
		       ? class525_sub38_8_.index * -1133521593 : i_9_);
		class525_sub38.method16614(class525_sub38_8_.buffer,
					   0, i_10_, -64988134);
		i_7_ -= method190(i_10_);
		int i_11_ = class525_sub38_8_.index * -1133521593 - i_10_;
		if (i_11_ != 0) {
		    System.arraycopy(class525_sub38_8_.buffer, i_10_,
				     class525_sub38_8_.buffer, 0,
				     i_11_);
		    class525_sub38_8_.index = i_11_ * 339428471;
		    anInt2539 += method190(i_11_) / method224();
		    aList2518.add(0, class525_sub38_8_);
		} else
		    class525_sub38_8_.method16627(214501125);
		if (i_7_ <= 0)
		    break;
	    }
	    if (aList2518.isEmpty() && method281() == Class376.aClass376_3902)
		method4552(Class376.aClass376_3901);
	}
	return class525_sub38;
    }
    
    Class250 method4559(int i) {
	synchronized (aClass200_2541) {
	    Object object = null;
	    Class250 class250
		= (Class250) aClass200_2541.method3796(-1874350152);
	    Class250 class250_12_ = null;
	    int i_13_ = i;
	    for (/**/; class250 != null;
		 class250
		     = (Class250) aClass200_2541.method3818(-1124897171)) {
		if (class250.aFloatArray2449.length > i && !class250.aBool2447
		    && (class250_12_ == null
			|| class250.aFloatArray2449.length < i_13_)) {
		    class250_12_ = class250;
		    i_13_ = class250_12_.aFloatArray2449.length;
		}
		if (class250.aFloatArray2449.length == i
		    && !class250.aBool2447)
		    break;
	    }
	    if (class250 == null)
		class250 = class250_12_;
	    if (class250 == null) {
		class250 = new Class250(this);
		int i_14_ = 0;
		boolean bool = false;
		while (!bool && i_14_ < 1000) {
		    if (aClass200_2541.method3785((long) i_14_) != null)
			i_14_++;
		    else
			bool = true;
		}
		class250.anInt2450 = i_14_;
		float[] fs = new float[i];
		class250.aFloatArray2449 = fs;
		class250.aBool2447 = true;
		class250.anInt2448 = i;
		if (aClass200_2541.method3793(-466532251) >= i * 4) {
		    /* empty */
		}
		aClass200_2541.method3789(class250, (long) class250.anInt2450,
					  fs.length * 4, (byte) -85);
	    } else {
		for (int i_15_ = 0; i_15_ < class250.aFloatArray2449.length;
		     i_15_++)
		    class250.aFloatArray2449[i_15_] = 0.0F;
		class250.anInt2448 = i;
	    }
	    class250.aBool2447 = true;
	    Class250 class250_16_ = class250;
	    return class250_16_;
	}
    }
    
    synchronized void method4560() {
	int i = (aClass525_Sub38_2488 != null
		 ? aClass525_Sub38_2488.index * -1133521593 : 0);
	int i_17_ = 0;
	Iterator iterator = aList2514.iterator();
	while (iterator.hasNext()) {
	    RSBuffer class525_sub38 = (RSBuffer) iterator.next();
	    i_17_ += class525_sub38.index * -1133521593;
	}
	if (aClass525_Sub38_2488 != null) {
	    if ((aClass525_Sub38_2488.buffer.length
		 - aClass525_Sub38_2488.index * -1133521593)
		< i_17_) {
		RSBuffer class525_sub38 = method4635(i_17_ + anInt2533);
		class525_sub38.method16614((aClass525_Sub38_2488
					    .buffer),
					   (aClass525_Sub38_2488.index
					    * -1133521593) - anInt2517,
					   anInt2533, -473702377);
		aClass525_Sub38_2488.method16627(538892312);
		aClass525_Sub38_2488 = class525_sub38;
		i = anInt2517;
	    }
	} else {
	    aClass525_Sub38_2488 = method4635(i_17_);
	    anInt2533 = 0;
	    i = 0;
	}
	iterator = aList2514.iterator();
	while (iterator.hasNext()) {
	    RSBuffer class525_sub38 = (RSBuffer) iterator.next();
	    aClass525_Sub38_2488.method16614(class525_sub38.buffer, 0,
					     (class525_sub38.index
					      * -1133521593),
					     1907983644);
	    anInt2533 += class525_sub38.index * -1133521593;
	    class525_sub38.method16627(-679496242);
	}
	aClass525_Sub38_2488.index = (i - anInt2517) * 339428471;
	anInt2517 = 0;
	aList2514.clear();
	while (aBool2513) {
	    if (aClass525_Sub38_2488.index * -1133521593
		>= aClass525_Sub38_2488.buffer.length) {
		aBool2513 = false;
		break;
	    }
	    if (aBool2521 && (float) (anInt2539 / method4554()) > aFloat2491)
		break;
	    if (aClass525_Sub38_2488 == null || anInt2533 < 27) {
		if (aClass525_Sub38_2488 != null) {
		    anInt2517 = anInt2533;
		    aClass525_Sub38_2488.index += anInt2533 * 339428471;
		}
		aBool2513 = false;
		break;
	    }
	    int i_18_ = aClass525_Sub38_2488.index * -1133521593;
	    int i_19_ = 0;
	    int i_20_ = 0;
	    if (!method4564(aClass525_Sub38_2488))
		break;
	    anInt2546++;
	    if (anInt2528 < 0)
		anInt2540++;
	    aList2505.clear();
	    aList2535.clear();
	    aClass525_Sub38_2488.readUnsignedByte(1478267978);
	    int i_21_ = aClass525_Sub38_2488.readUnsignedByte(1911083485);
	    int i_22_
		= (aClass525_Sub38_2488.readUnsignedByte(1076237007) & 0xff
		   | (aClass525_Sub38_2488.readUnsignedByte(516313583) & 0xff) << 8
		   | ((aClass525_Sub38_2488.readUnsignedByte(1159911688) & 0xff)
		      << 16)
		   | aClass525_Sub38_2488.readUnsignedByte(88253144) << 24);
	    i_19_ = i_22_ - i_19_;
	    aClass525_Sub38_2488.index += 1135888240;
	    int i_23_ = aClass525_Sub38_2488.readUnsignedByte(1302512158);
	    int i_24_ = aClass525_Sub38_2488.index * -1133521593;
	    int i_25_ = i_24_ + i_23_;
	    if (i_25_ > i_18_ + anInt2533) {
		aClass525_Sub38_2488.index
		    = (i_18_ + anInt2533) * 339428471;
		anInt2517
		    = aClass525_Sub38_2488.index * -1133521593 - i_18_;
		aBool2513 = false;
	    }
	    int i_26_ = i_25_;
	    int i_27_ = 0;
	    if (aBool2513) {
		for (int i_28_ = 0; i_28_ < i_23_; i_28_++) {
		    int i_29_
			= aClass525_Sub38_2488.buffer[i_24_++] & 0xff;
		    i_25_ += i_29_;
		    i_27_ += i_29_;
		    if (i_25_ > i_18_ + anInt2533) {
			aClass525_Sub38_2488.index
			    = (i_18_ + anInt2533) * 339428471;
			anInt2517
			    = (aClass525_Sub38_2488.index * -1133521593
			       - i_18_);
			aBool2513 = false;
			break;
		    }
		    if (i_29_ < 255) {
			aList2505.add(Integer.valueOf(i_26_));
			aList2535.add(Integer.valueOf(i_27_));
			i_26_ = i_25_;
			i_27_ = 0;
		    }
		}
	    }
	    if (aBool2513) {
		int i_30_ = i_25_;
		int i_31_ = -1;
		Iterator iterator_32_ = aList2505.iterator();
		Iterator iterator_33_ = aList2535.iterator();
		boolean bool = false;
		anInt2536 = 0;
		while (iterator_32_.hasNext()) {
		    Integer integer = (Integer) iterator_32_.next();
		    Integer integer_34_ = (Integer) iterator_33_.next();
		    i_31_++;
		    if (method289() && aBool2529 == true
			&& anInt2546 < anInt2540 && i_31_ < anInt2528) {
			Class255 class255_35_ = this;
			class255_35_.anInt2522
			    = class255_35_.anInt2522 + (bool ? 0 : i_19_);
			bool = true;
		    } else {
			anAtomicReference2534.set(null);
			boolean bool_36_
			    = method4576(aClass525_Sub38_2488.buffer,
					 integer.intValue(),
					 integer_34_.intValue(),
					 anAtomicReference2534);
			Class250[] class250s
			    = (Class250[]) anAtomicReference2534.get();
			if (bool_36_
			    && (aBool2529 != true || anInt2546 >= anInt2540
				|| i_31_ >= anInt2528)) {
			    if (class250s != null) {
				int i_37_ = class250s[0].anInt2448;
				anInt2532 += i_37_;
				if (anInt2532 > i_22_ && i_21_ == 4) {
				    anInt2536 = anInt2532 - i_22_ - anInt2536;
				    i_37_ -= anInt2536;
				    if (anInt2536 > class250s[0].anInt2448)
					anInt2536 = class250s[0].anInt2448;
				    if (i_37_ < 0)
					i_37_ = 0;
				}
				int i_38_ = 0;
				int i_39_
				    = method283(i_37_) * class250s.length;
				if (aBool2529 == true
				    && anInt2522 < anInt2538) {
				    int i_40_ = i_39_;
				    i_39_ -= method283(anInt2538 - anInt2522);
				    if (i_39_ <= 0) {
					anInt2522 += method190(i_40_);
					method4645(class250s);
					Object object = null;
					continue;
				    }
				    i_38_ += anInt2538 - anInt2522;
				}
				if (anInt2522 + i_37_ > anInt2490
				    && (anInt2519 < anInt2508 || anInt2508 < 0)
				    && aBool2483) {
				    i_39_ -= method283(anInt2522 + i_37_
						       - anInt2490 - 1);
				    if (i_39_ <= 0) {
					method4645(class250s);
					Object object = null;
					continue;
				    }
				}
				int i_41_ = method224();
				if (method4556() < method224()) {
				    int i_42_ = method224() - method4556();
				    i_39_ += i_39_ / method4556() * i_42_;
				}
				RSBuffer class525_sub38
				    = method4635(i_39_);
				for (int i_43_ = i_38_; i_43_ < i_37_;
				     i_43_++) {
				    boolean bool_44_ = aBool2529;
				    if (anInt2508 != 0) {
					if (anInt2522 == anInt2538) {
					    if (anInt2523 < 0) {
						anInt2523 = anInt2525;
						anInt2528 = i_31_;
					    }
					    aBool2529 = false;
					}
					if (anInt2522 == anInt2490
					    && anInt2524 < 0)
					    anInt2524 = anInt2525;
					if (anInt2522 > anInt2490
					    && (anInt2519 < anInt2508
						|| anInt2508 < 0)
					    && aBool2483)
					    bool_44_ = true;
				    }
				    if (bool_44_
					&& (anInt2522 < anInt2538
					    || anInt2522 > anInt2490)) {
					anInt2522++;
					if (++i_20_ > i_19_)
					    throw new RuntimeException();
				    } else {
					for (int i_45_ = 0; i_45_ < i_41_;
					     i_45_++) {
					    float f;
					    if (i_45_ < class250s.length)
						f = (class250s[i_45_]
						     .aFloatArray2449[i_43_]);
					    else
						f = (class250s
						     [i_45_ % method4556()]
						     .aFloatArray2449[i_43_]);
					    if (aClass397_2492
						== Class397.aClass397_4112) {
						int i_46_ = method4578(f);
						if (aClass391_2487
						    == Class391.aClass391_4070)
						    class525_sub38.method16840
							(i_46_, 241387851);
						else
						    class525_sub38.method16602
							(i_46_, 941273534);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4108)) {
						int i_47_ = method4579(f);
						if (aClass391_2487
						    == Class391.aClass391_4070)
						    class525_sub38.method16840
							(i_47_, 241387851);
						else
						    class525_sub38.method16602
							(i_47_, 2106586475);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4109)) {
						int i_48_ = method4621(f);
						class525_sub38.method16735
						    (i_48_, -1232531928);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4111)) {
						int i_49_ = method4581(f);
						class525_sub38.method16735
						    (i_49_, -1125958120);
					    }
					}
					anInt2522++;
					i_20_++;
				    }
				}
				synchronized (aList2518) {
				    anInt2539
					+= (method190(class525_sub38.index
						      * -1133521593)
					    / method224());
				    aList2518.add(class525_sub38);
				}
			    }
			} else if (method289()) {
			    anInt2501 = 0;
			    if (aClass250Array2500 == null
				|| (aClass250Array2500 != null
				    && (aClass250Array2500.length != anInt2479
					|| (aClass250Array2500[0].anInt2448
					    != anInt2493)))) {
				if (aClass250Array2500 != null)
				    method4645(aClass250Array2500);
				aClass250Array2500
				    = method4641(anInt2479, anInt2493);
			    }
			}
			method4645(class250s);
			Object object = null;
		    }
		}
		aClass525_Sub38_2488.index = i_30_ * 339428471;
		anInt2533 -= i_30_ - i_18_;
	    }
	}
    }
    
    int method4561(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    public Class255(float f) {
	aClass525_Sub38_2488 = null;
	anInt2533 = 0;
	anInt2517 = 0;
	aList2518 = new ArrayList();
	aList2505 = new ArrayList();
	aList2535 = new ArrayList();
	anAtomicReference2534 = new AtomicReference(null);
	anInt2536 = 0;
	aBool2483 = false;
	anInt2539 = 0;
	aBoolArray2545 = null;
	aBoolArray2527 = null;
	aBoolArray2547 = null;
	aFloat2491 = f;
	aClass397_2492 = Class397.aClass397_4112;
	aClass391_2487 = Class391.aClass391_4070;
	method4634(false);
    }
    
    public void method288(boolean bool, int i, int i_50_, int i_51_) {
	aBool2483 = bool;
	anInt2508 = i;
	anInt2538 = i_50_;
	anInt2490 = i_51_;
    }
    
    void method4562(RSBuffer class525_sub38) {
	aList2514.add(class525_sub38);
    }
    
    boolean method4563() {
	return aBool2513;
    }
    
    boolean method4564(RSBuffer class525_sub38) {
	if (class525_sub38.readUnsignedByte(1852912565) != 79
	    || class525_sub38.readUnsignedByte(1122057403) != 103
	    || class525_sub38.readUnsignedByte(1785846142) != 103
	    || class525_sub38.readUnsignedByte(78061713) != 83)
	    return false;
	return true;
    }
    
    boolean method4565(byte[] is, int i, int i_52_) {
	if (is[i] != i_52_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    void method4566(Class250 class250) {
	if (class250 != null) {
	    synchronized (aClass200_2541) {
		class250.aBool2447 = false;
	    }
	}
    }
    
    int method4567() {
	return anInt2531;
    }
    
    int method4568() {
	return anInt2530;
    }
    
    void method4569(byte[] is, int i) {
	aByteArray2542 = is;
	anInt2531 = i;
	anInt2530 = 0;
    }
    
    int method4570() {
	int i = aByteArray2542[anInt2531] >> anInt2530 & 0x1;
	anInt2530++;
	anInt2531 += anInt2530 >> 3;
	anInt2530 &= 0x7;
	return i;
    }
    
    void method4571() {
	if (method281() != Class376.aClass376_3898
	    && method281() != Class376.aClass376_3899
	    && (!aBool2521
		|| !((float) (anInt2539 / method4554()) > aFloat2491))) {
	    if (!method4563()) {
		RSBuffer class525_sub38
		    = ((RSBuffer)
		       (aList2484 != null && !aList2484.isEmpty()
			? aList2484.get(0) : null));
		if (class525_sub38 == null) {
		    if (!aBool2515) {
			method4552(Class376.aClass376_3899);
			anInterface46_2510.method211(-676296246);
			aBool2515 = true;
		    }
		    return;
		}
		aBool2515 = false;
		aBool2513 = true;
		aList2484.remove(0);
		method4562(class525_sub38);
	    }
	    method4647();
	}
    }
    
    void method4572() {
	aByteArray2542 = null;
    }
    
    void method4573() {
	int i = method4550(8) + 1;
	Iterator iterator = aList2544.iterator();
	while (iterator.hasNext()) {
	    Class247 class247 = (Class247) iterator.next();
	    if (class247.anInt2437 == 0 && class247.anInt2438 == 0) {
		if (class247.aClass258Array2440.length == i
		    && class247.anInt2436 == anInt2479
		    && class247.anInt2439 == anInt2486
		    && class247.anInt2435 == anInt2481) {
		    aClass258Array2494 = class247.aClass258Array2440;
		    for (int i_53_ = 0; i_53_ < aClass258Array2494.length;
			 i_53_++)
			aClass258Array2494[i_53_].method4665(this);
		    return;
		}
	    }
	}
	aClass258Array2494 = new Class258[i];
	for (int i_54_ = 0; i_54_ < i; i_54_++) {
	    if (aClass258Array2494[i_54_] == null)
		aClass258Array2494[i_54_] = new Class258();
	    aClass258Array2494[i_54_].method4675(this);
	}
	Class247 class247
	    = new Class247(anInt2479, anInt2486, anInt2480, anInt2482,
			   anInt2481, aClass258Array2494);
	aList2544.add(class247);
    }
    
    void method4574(byte[] is, int i) {
	anInt2532 = 0;
	if (!method289()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_55_ = 0;
	    if (method4565(is, i, 1))
		i_55_ = 1;
	    else if (method4565(is, i, 3))
		i_55_ = 3;
	    else if (method4565(is, i, 5))
		i_55_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_55_).toString());
	    if (i_55_ == 1) {
		method4569(is, i + 7);
		int i_56_ = method4550(32);
		anInt2479 = method4550(8);
		anInt2486 = method4550(32);
		anInt2480 = method4550(32);
		anInt2481 = method4550(32);
		anInt2482 = method4550(32);
		anInt2478 = 1 << method4550(4);
		anInt2493 = 1 << method4550(4);
		int i_57_ = 1 << method4550(1);
		if (i_56_ != 0 || i_57_ == 0)
		    throw new RuntimeException("");
		aBool2520 = true;
		anInt2525++;
	    } else if (i_55_ != 3 && i_55_ == 5) {
		if (!method4565(is, i, 5))
		    throw new RuntimeException("");
		method4569(is, i + 7);
		if (aClass250Array2504 != null) {
		    method4645(aClass250Array2504);
		    aClass250Array2504 = null;
		}
		aClass250Array2504 = method4641(anInt2479, anInt2493);
		for (int i_58_ = 0; i_58_ < 2; i_58_++) {
		    int i_59_ = i_58_ != 0 ? anInt2493 : anInt2478;
		    int i_60_ = i_59_ >> 1;
		    int i_61_ = i_59_ >> 2;
		    int i_62_ = i_59_ >> 3;
		    Class250 class250 = method4559(i_60_);
		    for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
			class250.aFloatArray2449[2 * i_63_]
			    = (float) Math.cos((double) (4 * i_63_)
					       * 3.141592653589793
					       / (double) i_59_);
			class250.aFloatArray2449[2 * i_63_ + 1]
			    = -(float) Math.sin((double) (4 * i_63_)
						* 3.141592653589793
						/ (double) i_59_);
		    }
		    Class250 class250_64_ = method4559(i_60_);
		    for (int i_65_ = 0; i_65_ < i_61_; i_65_++) {
			class250_64_.aFloatArray2449[2 * i_65_]
			    = (float) Math.cos((double) (2 * i_65_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_59_));
			class250_64_.aFloatArray2449[2 * i_65_ + 1]
			    = (float) Math.sin((double) (2 * i_65_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_59_));
		    }
		    Class250 class250_66_ = method4559(i_61_);
		    for (int i_67_ = 0; i_67_ < i_62_; i_67_++) {
			class250_66_.aFloatArray2449[2 * i_67_]
			    = (float) Math.cos((double) (4 * i_67_ + 2)
					       * 3.141592653589793
					       / (double) i_59_);
			class250_66_.aFloatArray2449[2 * i_67_ + 1]
			    = -(float) Math.sin((double) (4 * i_67_ + 2)
						* 3.141592653589793
						/ (double) i_59_);
		    }
		    int[] is_68_ = new int[i_62_];
		    int i_69_ = Class180.method3120(i_62_ - 1, (byte) -55);
		    for (int i_70_ = 0; i_70_ < i_62_; i_70_++)
			is_68_[i_70_]
			    = Class320.method5715(i_70_, i_69_, 2054657417);
		    if (i_58_ != 0) {
			aClass250_2516 = class250;
			aClass250_2489 = class250_64_;
			aClass250_2509 = class250_66_;
			anIntArray2512 = is_68_;
		    } else {
			aClass250_2526 = class250;
			aClass250_2506 = class250_64_;
			aClass250_2507 = class250_66_;
			anIntArray2511 = is_68_;
		    }
		}
		method4573();
		int i_71_ = method4550(6) + 1;
		for (int i_72_ = 0; i_72_ < i_71_; i_72_++)
		    method4550(16);
		i_71_ = method4550(6) + 1;
		if (aClass254Array2495 == null
		    || aClass254Array2495.length != i_71_)
		    aClass254Array2495 = new Class254[i_71_];
		for (int i_73_ = 0; i_73_ < i_71_; i_73_++) {
		    if (aClass254Array2495[i_73_] == null)
			aClass254Array2495[i_73_] = new Class254();
		    aClass254Array2495[i_73_].method4528(this, anInt2479);
		}
		int i_74_ = method4550(6) + 1;
		if (aClass253Array2496 == null
		    || aClass253Array2496.length != i_74_)
		    aClass253Array2496 = new Class253[i_74_];
		for (int i_75_ = 0; i_75_ < i_74_; i_75_++) {
		    if (aClass253Array2496[i_75_] == null)
			aClass253Array2496[i_75_] = new Class253();
		    aClass253Array2496[i_75_].method4520(this);
		}
		int i_76_ = method4550(6) + 1;
		if (aClass244Array2497 == null
		    || aClass244Array2497.length != i_76_)
		    aClass244Array2497 = new Class244[i_76_];
		for (int i_77_ = 0; i_77_ < i_76_; i_77_++) {
		    if (aClass244Array2497[i_77_] == null)
			aClass244Array2497[i_77_] = new Class244();
		    aClass244Array2497[i_77_].method4462(this);
		}
		int i_78_ = method4550(6) + 1;
		aBoolArray2498 = new boolean[i_78_];
		anIntArray2499 = new int[i_78_];
		for (int i_79_ = 0; i_79_ < i_78_; i_79_++) {
		    aBoolArray2498[i_79_] = method4570() != 0;
		    method4550(16);
		    method4550(16);
		    anIntArray2499[i_79_] = method4550(8);
		}
		method4557(true);
	    }
	}
    }
    
    boolean method4575(byte[] is, int i, int i_80_) {
	if (is[i] != i_80_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    boolean method4576(byte[] is, int i, int i_81_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_81_ > is.length)
	    return false;
	method4569(is, i);
	int i_82_ = method4570();
	if (i_82_ != 0) {
	    method4574(is, i);
	    return false;
	}
	if (!method289())
	    throw new RuntimeException();
	int i_83_ = method4550(method4593(anIntArray2499.length - 1));
	boolean bool = aBoolArray2498[i_83_];
	int i_84_ = bool ? anInt2493 : anInt2478;
	boolean bool_85_ = false;
	boolean bool_86_ = false;
	if (bool) {
	    bool_85_ = method4570() != 0;
	    bool_86_ = method4570() != 0;
	}
	int i_87_ = i_84_ >> 1;
	int i_88_;
	int i_89_;
	int i_90_;
	if (bool && !bool_85_) {
	    i_88_ = (i_84_ >> 2) - (anInt2478 >> 2);
	    i_89_ = (i_84_ >> 2) + (anInt2478 >> 2);
	    i_90_ = anInt2478 >> 1;
	} else {
	    i_88_ = 0;
	    i_89_ = i_87_;
	    i_90_ = i_84_ >> 1;
	}
	int i_91_;
	int i_92_;
	int i_93_;
	if (bool && !bool_86_) {
	    i_91_ = i_84_ - (i_84_ >> 2) - (anInt2478 >> 2);
	    i_92_ = i_84_ - (i_84_ >> 2) + (anInt2478 >> 2);
	    i_93_ = anInt2478 >> 1;
	} else {
	    i_91_ = i_87_;
	    i_92_ = i_84_;
	    i_93_ = i_84_ >> 1;
	}
	Class244 class244 = aClass244Array2497[anIntArray2499[i_83_]];
	if (aBoolArray2545 == null || aBoolArray2545.length != anInt2479) {
	    aBoolArray2545 = new boolean[anInt2479];
	    aBoolArray2527 = new boolean[anInt2479];
	}
	for (int i_94_ = 0; i_94_ < anInt2479; i_94_++) {
	    int i_95_ = (class244.anIntArray2419 != null
			 ? class244.anIntArray2419[i_94_] : 0);
	    int i_96_ = i_95_;
	    int i_97_ = class244.anIntArray2420[i_96_];
	    aBoolArray2545[i_94_]
		= !aClass254Array2495[i_97_].method4532(i_94_);
	    aBoolArray2527[i_94_] = aBoolArray2545[i_94_];
	}
	for (int i_98_ = 0; i_98_ < class244.anInt2418; i_98_++) {
	    if (!aBoolArray2545[class244.anIntArray2424[i_98_]]
		|| !aBoolArray2545[class244.anIntArray2425[i_98_]]) {
		aBoolArray2545[class244.anIntArray2424[i_98_]] = false;
		aBoolArray2545[class244.anIntArray2425[i_98_]] = false;
	    }
	}
	if (aBoolArray2547 == null || aBoolArray2547.length != anInt2479)
	    aBoolArray2547 = new boolean[anInt2479];
	for (int i_99_ = 0; i_99_ < class244.anInt2421; i_99_++) {
	    int i_100_ = 0;
	    for (int i_101_ = 0; i_101_ < anInt2479; i_101_++) {
		int i_102_ = (class244.anIntArray2419 != null
			      ? class244.anIntArray2419[i_101_] : i_99_);
		if (i_102_ == i_99_)
		    aBoolArray2547[i_100_++] = aBoolArray2545[i_101_];
	    }
	    Class253 class253
		= aClass253Array2496[class244.anIntArray2422[i_99_]];
	    Object object = null;
	    Class250[] class250s;
	    if (class253.anInt2455 == 2) {
		Class250[] class250s_103_ = method4641(1, anInt2479 * i_84_);
		for (int i_104_ = 0; i_104_ < i_84_; i_104_++) {
		    for (int i_105_ = 0; i_105_ < anInt2479; i_105_++) {
			try {
			    class250s_103_[0].aFloatArray2449
				[i_104_ * anInt2479 + i_105_]
				= (aClass250Array2504[i_105_].aFloatArray2449
				   [i_104_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class250s_103_
		    = class253.method4522(class250s_103_, i_84_ >> 1,
					  aBoolArray2547);
		class250s = aClass250Array2504;
		for (int i_106_ = 0; i_106_ < i_84_; i_106_++) {
		    for (int i_107_ = 0; i_107_ < anInt2479; i_107_++) {
			try {
			    class250s[i_107_].aFloatArray2449[i_106_]
				= (class250s_103_[0].aFloatArray2449
				   [anInt2479 * i_106_ + i_107_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method4645(class250s_103_);
		Object object_108_ = null;
	    } else
		class250s = class253.method4522(aClass250Array2504, i_84_ >> 1,
						aBoolArray2547);
	    if (class244.anIntArray2419 != null) {
		i_100_ = 0;
		for (int i_109_ = 0; i_109_ < anInt2479; i_109_++) {
		    int i_110_ = class244.anIntArray2419[i_109_];
		    if (i_110_ == i_99_)
			aClass250Array2504[i_109_] = class250s[i_100_++];
		}
	    } else {
		if (aClass250Array2504 != class250s)
		    method4645(aClass250Array2504);
		aClass250Array2504 = class250s;
	    }
	}
	for (int i_111_ = class244.anInt2418 - 1; i_111_ >= 0; i_111_--) {
	    Class250 class250
		= aClass250Array2504[class244.anIntArray2424[i_111_]];
	    Class250 class250_112_
		= aClass250Array2504[class244.anIntArray2425[i_111_]];
	    for (int i_113_ = 0; i_113_ < class250.anInt2448; i_113_++) {
		float f = class250.aFloatArray2449[i_113_];
		float f_114_ = class250_112_.aFloatArray2449[i_113_];
		float f_115_ = f;
		float f_116_ = f_114_;
		if (f > 0.0F) {
		    if (f_114_ > 0.0F) {
			f_115_ = f;
			f_116_ = f - f_114_;
		    } else {
			f_116_ = f;
			f_115_ = f + f_114_;
		    }
		} else if (f_114_ > 0.0F) {
		    f_115_ = f;
		    f_116_ = f + f_114_;
		} else {
		    f_116_ = f;
		    f_115_ = f - f_114_;
		}
		class250.aFloatArray2449[i_113_] = f_115_;
		class250_112_.aFloatArray2449[i_113_] = f_116_;
	    }
	}
	for (int i_117_ = 0; i_117_ < aBoolArray2545.length; i_117_++)
	    aBoolArray2545[i_117_] = aBoolArray2527[i_117_];
	for (int i_118_ = 0; i_118_ < anInt2479; i_118_++) {
	    if (!aBoolArray2545[i_118_]) {
		int i_119_ = (class244.anIntArray2419 != null
			      ? class244.anIntArray2419[i_118_] : 0);
		int i_120_ = i_119_;
		int i_121_ = class244.anIntArray2420[i_120_];
		aClass254Array2495[i_121_].method4544(i_118_);
		aClass254Array2495[i_121_].method4548((aClass250Array2504
						       [i_118_]),
						      i_84_ >> 1, i_118_);
	    }
	}
	for (int i_122_ = 0; i_122_ < anInt2479; i_122_++) {
	    if (aBoolArray2545[i_122_]) {
		for (int i_123_ = i_84_ >> 1; i_123_ < i_84_; i_123_++)
		    aClass250Array2504[i_122_].aFloatArray2449[i_123_] = 0.0F;
	    } else {
		int i_124_ = i_84_ >> 1;
		int i_125_ = i_84_ >> 2;
		int i_126_ = i_84_ >> 3;
		Class250 class250 = aClass250Array2504[i_122_];
		for (int i_127_ = 0; i_127_ < i_124_; i_127_++)
		    class250.aFloatArray2449[i_127_] *= 0.5F;
		for (int i_128_ = i_124_; i_128_ < i_84_; i_128_++)
		    class250.aFloatArray2449[i_128_]
			= -class250.aFloatArray2449[i_84_ - i_128_ - 1];
		Class250 class250_129_
		    = bool ? aClass250_2516 : aClass250_2526;
		Class250 class250_130_
		    = bool ? aClass250_2489 : aClass250_2506;
		Class250 class250_131_
		    = bool ? aClass250_2509 : aClass250_2507;
		int[] is_132_ = bool ? anIntArray2512 : anIntArray2511;
		for (int i_133_ = 0; i_133_ < i_125_; i_133_++) {
		    float f
			= (class250.aFloatArray2449[4 * i_133_]
			   - class250.aFloatArray2449[i_84_ - 4 * i_133_ - 1]);
		    float f_134_
			= (class250.aFloatArray2449[4 * i_133_ + 2]
			   - class250.aFloatArray2449[i_84_ - 4 * i_133_ - 3]);
		    float f_135_ = class250_129_.aFloatArray2449[2 * i_133_];
		    float f_136_
			= class250_129_.aFloatArray2449[2 * i_133_ + 1];
		    class250.aFloatArray2449[i_84_ - 4 * i_133_ - 1]
			= f * f_135_ - f_134_ * f_136_;
		    class250.aFloatArray2449[i_84_ - 4 * i_133_ - 3]
			= f * f_136_ + f_134_ * f_135_;
		}
		for (int i_137_ = 0; i_137_ < i_126_; i_137_++) {
		    float f
			= class250.aFloatArray2449[i_124_ + 3 + 4 * i_137_];
		    float f_138_
			= class250.aFloatArray2449[i_124_ + 1 + 4 * i_137_];
		    float f_139_ = class250.aFloatArray2449[4 * i_137_ + 3];
		    float f_140_ = class250.aFloatArray2449[4 * i_137_ + 1];
		    class250.aFloatArray2449[i_124_ + 3 + 4 * i_137_]
			= f + f_139_;
		    class250.aFloatArray2449[i_124_ + 1 + 4 * i_137_]
			= f_138_ + f_140_;
		    float f_141_ = (class250_129_.aFloatArray2449
				    [i_124_ - 4 - 4 * i_137_]);
		    float f_142_ = (class250_129_.aFloatArray2449
				    [i_124_ - 3 - 4 * i_137_]);
		    class250.aFloatArray2449[4 * i_137_ + 3]
			= (f - f_139_) * f_141_ - (f_138_ - f_140_) * f_142_;
		    class250.aFloatArray2449[4 * i_137_ + 1]
			= (f_138_ - f_140_) * f_141_ + (f - f_139_) * f_142_;
		}
		int i_143_ = Class180.method3120(i_84_ - 1, (byte) -67);
		for (int i_144_ = 0; i_144_ < i_143_ - 3; i_144_++) {
		    int i_145_ = i_84_ >> i_144_ + 2;
		    int i_146_ = 8 << i_144_;
		    for (int i_147_ = 0; i_147_ < 2 << i_144_; i_147_++) {
			int i_148_ = i_84_ - i_145_ * 2 * i_147_;
			int i_149_ = i_84_ - i_145_ * (2 * i_147_ + 1);
			for (int i_150_ = 0; i_150_ < i_84_ >> i_144_ + 4;
			     i_150_++) {
			    int i_151_ = 4 * i_150_;
			    float f = (class250.aFloatArray2449
				       [i_148_ - 1 - i_151_]);
			    float f_152_ = (class250.aFloatArray2449
					    [i_148_ - 3 - i_151_]);
			    float f_153_ = (class250.aFloatArray2449
					    [i_149_ - 1 - i_151_]);
			    float f_154_ = (class250.aFloatArray2449
					    [i_149_ - 3 - i_151_]);
			    class250.aFloatArray2449[i_148_ - 1 - i_151_]
				= f + f_153_;
			    class250.aFloatArray2449[i_148_ - 3 - i_151_]
				= f_152_ + f_154_;
			    float f_155_ = (class250_129_.aFloatArray2449
					    [i_150_ * i_146_]);
			    float f_156_ = (class250_129_.aFloatArray2449
					    [i_150_ * i_146_ + 1]);
			    class250.aFloatArray2449[i_149_ - 1 - i_151_]
				= ((f - f_153_) * f_155_
				   - (f_152_ - f_154_) * f_156_);
			    class250.aFloatArray2449[i_149_ - 3 - i_151_]
				= ((f_152_ - f_154_) * f_155_
				   + (f - f_153_) * f_156_);
			}
		    }
		}
		for (int i_157_ = 1; i_157_ < i_126_ - 1; i_157_++) {
		    int i_158_ = is_132_[i_157_];
		    if (i_157_ < i_158_) {
			int i_159_ = 8 * i_157_;
			int i_160_ = 8 * i_158_;
			float f = class250.aFloatArray2449[i_159_ + 1];
			class250.aFloatArray2449[i_159_ + 1]
			    = class250.aFloatArray2449[i_160_ + 1];
			class250.aFloatArray2449[i_160_ + 1] = f;
			f = class250.aFloatArray2449[i_159_ + 3];
			class250.aFloatArray2449[i_159_ + 3]
			    = class250.aFloatArray2449[i_160_ + 3];
			class250.aFloatArray2449[i_160_ + 3] = f;
			f = class250.aFloatArray2449[i_159_ + 5];
			class250.aFloatArray2449[i_159_ + 5]
			    = class250.aFloatArray2449[i_160_ + 5];
			class250.aFloatArray2449[i_160_ + 5] = f;
			f = class250.aFloatArray2449[i_159_ + 7];
			class250.aFloatArray2449[i_159_ + 7]
			    = class250.aFloatArray2449[i_160_ + 7];
			class250.aFloatArray2449[i_160_ + 7] = f;
		    }
		}
		for (int i_161_ = 0; i_161_ < i_124_; i_161_++)
		    class250.aFloatArray2449[i_161_]
			= class250.aFloatArray2449[2 * i_161_ + 1];
		for (int i_162_ = 0; i_162_ < i_126_; i_162_++) {
		    class250.aFloatArray2449[i_84_ - 1 - 2 * i_162_]
			= class250.aFloatArray2449[4 * i_162_];
		    class250.aFloatArray2449[i_84_ - 2 - 2 * i_162_]
			= class250.aFloatArray2449[4 * i_162_ + 1];
		    class250.aFloatArray2449[i_84_ - i_125_ - 1 - 2 * i_162_]
			= class250.aFloatArray2449[4 * i_162_ + 2];
		    class250.aFloatArray2449[i_84_ - i_125_ - 2 - 2 * i_162_]
			= class250.aFloatArray2449[4 * i_162_ + 3];
		}
		for (int i_163_ = 0; i_163_ < i_126_; i_163_++) {
		    float f = class250_131_.aFloatArray2449[2 * i_163_];
		    float f_164_
			= class250_131_.aFloatArray2449[2 * i_163_ + 1];
		    float f_165_
			= class250.aFloatArray2449[i_124_ + 2 * i_163_];
		    float f_166_
			= class250.aFloatArray2449[i_124_ + 2 * i_163_ + 1];
		    float f_167_
			= class250.aFloatArray2449[i_84_ - 2 - 2 * i_163_];
		    float f_168_
			= class250.aFloatArray2449[i_84_ - 1 - 2 * i_163_];
		    float f_169_
			= f_164_ * (f_165_ - f_167_) + f * (f_166_ + f_168_);
		    class250.aFloatArray2449[i_124_ + 2 * i_163_]
			= (f_165_ + f_167_ + f_169_) * 0.5F;
		    class250.aFloatArray2449[i_84_ - 2 - 2 * i_163_]
			= (f_165_ + f_167_ - f_169_) * 0.5F;
		    f_169_
			= f_164_ * (f_166_ + f_168_) - f * (f_165_ - f_167_);
		    class250.aFloatArray2449[i_124_ + 2 * i_163_ + 1]
			= (f_166_ - f_168_ + f_169_) * 0.5F;
		    class250.aFloatArray2449[i_84_ - 1 - 2 * i_163_]
			= (-f_166_ + f_168_ + f_169_) * 0.5F;
		}
		for (int i_170_ = 0; i_170_ < i_125_; i_170_++) {
		    class250.aFloatArray2449[i_170_]
			= ((class250.aFloatArray2449[2 * i_170_ + i_124_]
			    * class250_130_.aFloatArray2449[2 * i_170_])
			   + (class250.aFloatArray2449[2 * i_170_ + 1 + i_124_]
			      * (class250_130_.aFloatArray2449
				 [2 * i_170_ + 1])));
		    class250.aFloatArray2449[i_124_ - 1 - i_170_]
			= ((class250.aFloatArray2449[2 * i_170_ + i_124_]
			    * class250_130_.aFloatArray2449[2 * i_170_ + 1])
			   - (class250.aFloatArray2449[2 * i_170_ + 1 + i_124_]
			      * class250_130_.aFloatArray2449[2 * i_170_]));
		}
		for (int i_171_ = 0; i_171_ < i_125_; i_171_++)
		    class250.aFloatArray2449[i_84_ - i_125_ + i_171_]
			= -class250.aFloatArray2449[i_171_];
		for (int i_172_ = 0; i_172_ < i_125_; i_172_++)
		    class250.aFloatArray2449[i_172_]
			= class250.aFloatArray2449[i_125_ + i_172_];
		for (int i_173_ = 0; i_173_ < i_125_; i_173_++)
		    class250.aFloatArray2449[i_125_ + i_173_]
			= -class250.aFloatArray2449[i_125_ - i_173_ - 1];
		for (int i_174_ = 0; i_174_ < i_125_; i_174_++)
		    class250.aFloatArray2449[i_124_ + i_174_]
			= class250.aFloatArray2449[i_84_ - i_174_ - 1];
		for (int i_175_ = i_88_; i_175_ < i_89_; i_175_++) {
		    float f
			= (float) Math.sin(((double) (i_175_ - i_88_) + 0.5)
					   / (double) i_90_ * 0.5
					   * 3.141592653589793);
		    aClass250Array2504[i_122_].aFloatArray2449[i_175_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_176_ = i_91_; i_176_ < i_92_; i_176_++) {
		    float f
			= (float) Math.sin((((double) (i_176_ - i_91_) + 0.5)
					    / (double) i_93_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    aClass250Array2504[i_122_].aFloatArray2449[i_176_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class250[] class250s = null;
	if (anInt2501 > 0) {
	    int i_177_ = anInt2501 + i_84_ >> 2;
	    class250s = method4641(anInt2479, i_177_);
	    for (int i_178_ = 0; i_178_ < anInt2479; i_178_++) {
		if (!aBoolArray2503[i_178_]) {
		    for (int i_179_ = 0; i_179_ < anInt2502; i_179_++) {
			int i_180_ = (anInt2501 >> 1) + i_179_;
			class250s[i_178_].aFloatArray2449[i_179_]
			    += (aClass250Array2500[i_178_].aFloatArray2449
				[i_180_]);
		    }
		}
		if (!aBoolArray2545[i_178_]) {
		    for (int i_181_ = i_88_; i_181_ < i_84_ >> 1; i_181_++) {
			int i_182_ = (class250s[i_178_].anInt2448
				      - (i_84_ >> 1) + i_181_);
			class250s[i_178_].aFloatArray2449[i_182_]
			    += (aClass250Array2504[i_178_].aFloatArray2449
				[i_181_]);
		    }
		}
	    }
	}
	Class250[] class250s_183_ = aClass250Array2500;
	aClass250Array2500 = aClass250Array2504;
	aClass250Array2504 = class250s_183_;
	anInt2501 = i_84_;
	anInt2502 = i_92_ - (i_84_ >> 1);
	aBoolArray2503 = aBoolArray2545;
	atomicreference.set(class250s);
	return true;
    }
    
    void method4577() {
	if (method281() != Class376.aClass376_3898
	    && method281() != Class376.aClass376_3899
	    && (!aBool2521
		|| !((float) (anInt2539 / method4554()) > aFloat2491))) {
	    if (!method4563()) {
		RSBuffer class525_sub38
		    = ((RSBuffer)
		       (aList2484 != null && !aList2484.isEmpty()
			? aList2484.get(0) : null));
		if (class525_sub38 == null) {
		    if (!aBool2515) {
			method4552(Class376.aClass376_3899);
			anInterface46_2510.method211(191180309);
			aBool2515 = true;
		    }
		    return;
		}
		aBool2515 = false;
		aBool2513 = true;
		aList2484.remove(0);
		method4562(class525_sub38);
	    }
	    method4647();
	}
    }
    
    public void method316(Interface46 interface46) {
	anInterface46_2510 = interface46;
    }
    
    public void method282() {
	if (method281() == Class376.aClass376_3898
	    || method281() == Class376.aClass376_3900
	    || method281() == Class376.aClass376_3897) {
	    method4552(Class376.aClass376_3896);
	    method4637();
	}
    }
    
    int method4578(float f) {
	int i = (int) (f * 32767.0F);
	if (i > 32767)
	    return 32767;
	if (i < -32768)
	    return -32768;
	return i;
    }
    
    int method4579(float f) {
	int i = (int) (f * 32767.0F + 32768.0F);
	if (i > 65535)
	    return 65535;
	if (i < 0)
	    return 0;
	return i;
    }
    
    void method4580() {
	int i = method4550(8) + 1;
	Iterator iterator = aList2544.iterator();
	while (iterator.hasNext()) {
	    Class247 class247 = (Class247) iterator.next();
	    if (class247.anInt2437 == 0 && class247.anInt2438 == 0) {
		if (class247.aClass258Array2440.length == i
		    && class247.anInt2436 == anInt2479
		    && class247.anInt2439 == anInt2486
		    && class247.anInt2435 == anInt2481) {
		    aClass258Array2494 = class247.aClass258Array2440;
		    for (int i_184_ = 0; i_184_ < aClass258Array2494.length;
			 i_184_++)
			aClass258Array2494[i_184_].method4665(this);
		    return;
		}
	    }
	}
	aClass258Array2494 = new Class258[i];
	for (int i_185_ = 0; i_185_ < i; i_185_++) {
	    if (aClass258Array2494[i_185_] == null)
		aClass258Array2494[i_185_] = new Class258();
	    aClass258Array2494[i_185_].method4675(this);
	}
	Class247 class247
	    = new Class247(anInt2479, anInt2486, anInt2480, anInt2482,
			   anInt2481, aClass258Array2494);
	aList2544.add(class247);
    }
    
    int method4581(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    int method4582(int i) {
	int i_186_ = 0;
	int i_187_ = 0;
	int i_188_;
	for (/**/; i >= 8 - anInt2530; i -= i_188_) {
	    i_188_ = 8 - anInt2530;
	    int i_189_ = (1 << i_188_) - 1;
	    i_186_
		+= (aByteArray2542[anInt2531] >> anInt2530 & i_189_) << i_187_;
	    anInt2530 = 0;
	    anInt2531++;
	    i_187_ += i_188_;
	}
	if (i > 0) {
	    i_188_ = (1 << i) - 1;
	    i_186_
		+= (aByteArray2542[anInt2531] >> anInt2530 & i_188_) << i_187_;
	    anInt2530 += i;
	}
	return i_186_;
    }
    
    void method4583(Class250[] class250s) {
	if (class250s != null) {
	    for (int i = 0; i < class250s.length; i++)
		method4625(class250s[i]);
	}
    }
    
    public void method318(boolean bool) {
	if (!bool)
	    method285();
	else if (method281() == Class376.aClass376_3901) {
	    method4634(true);
	    method4552(Class376.aClass376_3897);
	}
    }
    
    public void method291(boolean bool, int i, int i_190_, int i_191_) {
	aBool2483 = bool;
	anInt2508 = i;
	anInt2538 = i_190_;
	anInt2490 = i_191_;
    }
    
    boolean method4584(RSBuffer class525_sub38) {
	if (class525_sub38.readUnsignedByte(497642125) != 79
	    || class525_sub38.readUnsignedByte(134887350) != 103
	    || class525_sub38.readUnsignedByte(384847177) != 103
	    || class525_sub38.readUnsignedByte(1634096280) != 83)
	    return false;
	return true;
    }
    
    public Class376 method292() {
	return aClass376_2485;
    }
    
    void method4585(Class376 class376) {
	aClass376_2485 = class376;
    }
    
    boolean method4586(int i, Class397 class397, Class391 class391) {
	if (class397 == Class397.aClass397_4112)
	    return true;
	if (class397 == Class397.aClass397_4109)
	    return true;
	if (class397 == Class397.aClass397_4108)
	    return true;
	if (class397 == Class397.aClass397_4111)
	    return true;
	return false;
    }
    
    int method4587(int i) {
	int i_192_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_192_++;
	return i_192_;
    }
    
    public void method295(Interface46 interface46) {
	anInterface46_2510 = interface46;
    }
    
    public void method303(RSBuffer class525_sub38) {
	if (method281() == Class376.aClass376_3902
	    || method281() == Class376.aClass376_3901) {
	    if (class525_sub38 != null)
		class525_sub38.method16627(472459835);
	} else if (class525_sub38 == null) {
	    boolean bool = aBool2483 && (anInt2508 > 0 && anInt2519 < anInt2508
					 || anInt2508 < 0);
	    if (aList2518.isEmpty()) {
		if (!bool) {
		    method4572();
		    method4552(Class376.aClass376_3901);
		}
	    } else if (!bool) {
		method4572();
		method4552(Class376.aClass376_3902);
	    }
	    if (bool)
		method4634(true);
	} else
	    method4590(class525_sub38);
    }
    
    public void method297(RSBuffer class525_sub38) {
	if (method281() == Class376.aClass376_3902
	    || method281() == Class376.aClass376_3901) {
	    if (class525_sub38 != null)
		class525_sub38.method16627(-611629004);
	} else if (class525_sub38 == null) {
	    boolean bool = aBool2483 && (anInt2508 > 0 && anInt2519 < anInt2508
					 || anInt2508 < 0);
	    if (aList2518.isEmpty()) {
		if (!bool) {
		    method4572();
		    method4552(Class376.aClass376_3901);
		}
	    } else if (!bool) {
		method4572();
		method4552(Class376.aClass376_3902);
	    }
	    if (bool)
		method4634(true);
	} else
	    method4590(class525_sub38);
    }
    
    int method4588() {
	return anInt2539;
    }
    
    public RSBuffer method299(int i) {
	RSBuffer class525_sub38 = method4558(i);
	return class525_sub38;
    }
    
    public int method300() {
	return method4588();
    }
    
    public int method279(int i) {
	return i / (method290().anInt4107 * -1339941795 / 8);
    }
    
    public int method302(int i) {
	return i / (method290().anInt4107 * -1339941795 / 8);
    }
    
    public int method310(int i) {
	return i * (method290().anInt4107 * -1339941795 / 8);
    }
    
    int method4589(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    public Class391 method304() {
	return aClass391_2487;
    }
    
    public void method305(int i, Class397 class397, Class391 class391,
			  int i_193_) {
	anInt2543 = i_193_;
	if (method4586(i, class397, class391)) {
	    aClass397_2492 = class397;
	    aClass391_2487 = class391;
	} else
	    throw new RuntimeException("");
    }
    
    synchronized void method4590(RSBuffer class525_sub38) {
	aList2484.add(class525_sub38);
	method4552(Class376.aClass376_3897);
    }
    
    int method4591() {
	if (aBool2520)
	    return anInt2479;
	throw new RuntimeException("");
    }
    
    public int method284() {
	if (aBool2520)
	    return method4556() < anInt2543 ? anInt2543 : method4556();
	throw new RuntimeException("");
    }
    
    public synchronized boolean method308() {
	return aBool2521;
    }
    
    Class250[] method4592(int i, int i_194_) {
	Class250[] class250s = new Class250[i];
	for (int i_195_ = 0; i_195_ < class250s.length; i_195_++)
	    class250s[i_195_] = method4559(i_194_);
	return class250s;
    }
    
    int method4593(int i) {
	int i_196_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_196_++;
	return i_196_;
    }
    
    synchronized void method4594() {
	int i = (aClass525_Sub38_2488 != null
		 ? aClass525_Sub38_2488.index * -1133521593 : 0);
	int i_197_ = 0;
	Iterator iterator = aList2514.iterator();
	while (iterator.hasNext()) {
	    RSBuffer class525_sub38 = (RSBuffer) iterator.next();
	    i_197_ += class525_sub38.index * -1133521593;
	}
	if (aClass525_Sub38_2488 != null) {
	    if ((aClass525_Sub38_2488.buffer.length
		 - aClass525_Sub38_2488.index * -1133521593)
		< i_197_) {
		RSBuffer class525_sub38 = method4635(i_197_ + anInt2533);
		class525_sub38.method16614((aClass525_Sub38_2488
					    .buffer),
					   (aClass525_Sub38_2488.index
					    * -1133521593) - anInt2517,
					   anInt2533, 2044347396);
		aClass525_Sub38_2488.method16627(1629042252);
		aClass525_Sub38_2488 = class525_sub38;
		i = anInt2517;
	    }
	} else {
	    aClass525_Sub38_2488 = method4635(i_197_);
	    anInt2533 = 0;
	    i = 0;
	}
	iterator = aList2514.iterator();
	while (iterator.hasNext()) {
	    RSBuffer class525_sub38 = (RSBuffer) iterator.next();
	    aClass525_Sub38_2488.method16614(class525_sub38.buffer, 0,
					     (class525_sub38.index
					      * -1133521593),
					     1560755527);
	    anInt2533 += class525_sub38.index * -1133521593;
	    class525_sub38.method16627(-183716293);
	}
	aClass525_Sub38_2488.index = (i - anInt2517) * 339428471;
	anInt2517 = 0;
	aList2514.clear();
	while (aBool2513) {
	    if (aClass525_Sub38_2488.index * -1133521593
		>= aClass525_Sub38_2488.buffer.length) {
		aBool2513 = false;
		break;
	    }
	    if (aBool2521 && (float) (anInt2539 / method4554()) > aFloat2491)
		break;
	    if (aClass525_Sub38_2488 == null || anInt2533 < 27) {
		if (aClass525_Sub38_2488 != null) {
		    anInt2517 = anInt2533;
		    aClass525_Sub38_2488.index += anInt2533 * 339428471;
		}
		aBool2513 = false;
		break;
	    }
	    int i_198_ = aClass525_Sub38_2488.index * -1133521593;
	    int i_199_ = 0;
	    int i_200_ = 0;
	    if (!method4564(aClass525_Sub38_2488))
		break;
	    anInt2546++;
	    if (anInt2528 < 0)
		anInt2540++;
	    aList2505.clear();
	    aList2535.clear();
	    aClass525_Sub38_2488.readUnsignedByte(491526687);
	    int i_201_ = aClass525_Sub38_2488.readUnsignedByte(831095387);
	    int i_202_
		= (aClass525_Sub38_2488.readUnsignedByte(1062686603) & 0xff
		   | (aClass525_Sub38_2488.readUnsignedByte(360661682) & 0xff) << 8
		   | (aClass525_Sub38_2488.readUnsignedByte(232461125) & 0xff) << 16
		   | aClass525_Sub38_2488.readUnsignedByte(878460582) << 24);
	    i_199_ = i_202_ - i_199_;
	    aClass525_Sub38_2488.index += 1135888240;
	    int i_203_ = aClass525_Sub38_2488.readUnsignedByte(1408272149);
	    int i_204_ = aClass525_Sub38_2488.index * -1133521593;
	    int i_205_ = i_204_ + i_203_;
	    if (i_205_ > i_198_ + anInt2533) {
		aClass525_Sub38_2488.index
		    = (i_198_ + anInt2533) * 339428471;
		anInt2517
		    = aClass525_Sub38_2488.index * -1133521593 - i_198_;
		aBool2513 = false;
	    }
	    int i_206_ = i_205_;
	    int i_207_ = 0;
	    if (aBool2513) {
		for (int i_208_ = 0; i_208_ < i_203_; i_208_++) {
		    int i_209_
			= (aClass525_Sub38_2488.buffer[i_204_++]
			   & 0xff);
		    i_205_ += i_209_;
		    i_207_ += i_209_;
		    if (i_205_ > i_198_ + anInt2533) {
			aClass525_Sub38_2488.index
			    = (i_198_ + anInt2533) * 339428471;
			anInt2517
			    = (aClass525_Sub38_2488.index * -1133521593
			       - i_198_);
			aBool2513 = false;
			break;
		    }
		    if (i_209_ < 255) {
			aList2505.add(Integer.valueOf(i_206_));
			aList2535.add(Integer.valueOf(i_207_));
			i_206_ = i_205_;
			i_207_ = 0;
		    }
		}
	    }
	    if (aBool2513) {
		int i_210_ = i_205_;
		int i_211_ = -1;
		Iterator iterator_212_ = aList2505.iterator();
		Iterator iterator_213_ = aList2535.iterator();
		boolean bool = false;
		anInt2536 = 0;
		while (iterator_212_.hasNext()) {
		    Integer integer = (Integer) iterator_212_.next();
		    Integer integer_214_ = (Integer) iterator_213_.next();
		    i_211_++;
		    if (method289() && aBool2529 == true
			&& anInt2546 < anInt2540 && i_211_ < anInt2528) {
			Class255 class255_215_ = this;
			class255_215_.anInt2522
			    = class255_215_.anInt2522 + (bool ? 0 : i_199_);
			bool = true;
		    } else {
			anAtomicReference2534.set(null);
			boolean bool_216_
			    = method4576(aClass525_Sub38_2488.buffer,
					 integer.intValue(),
					 integer_214_.intValue(),
					 anAtomicReference2534);
			Class250[] class250s
			    = (Class250[]) anAtomicReference2534.get();
			if (bool_216_
			    && (aBool2529 != true || anInt2546 >= anInt2540
				|| i_211_ >= anInt2528)) {
			    if (class250s != null) {
				int i_217_ = class250s[0].anInt2448;
				anInt2532 += i_217_;
				if (anInt2532 > i_202_ && i_201_ == 4) {
				    anInt2536 = anInt2532 - i_202_ - anInt2536;
				    i_217_ -= anInt2536;
				    if (anInt2536 > class250s[0].anInt2448)
					anInt2536 = class250s[0].anInt2448;
				    if (i_217_ < 0)
					i_217_ = 0;
				}
				int i_218_ = 0;
				int i_219_
				    = method283(i_217_) * class250s.length;
				if (aBool2529 == true
				    && anInt2522 < anInt2538) {
				    int i_220_ = i_219_;
				    i_219_ -= method283(anInt2538 - anInt2522);
				    if (i_219_ <= 0) {
					anInt2522 += method190(i_220_);
					method4645(class250s);
					Object object = null;
					continue;
				    }
				    i_218_ += anInt2538 - anInt2522;
				}
				if (anInt2522 + i_217_ > anInt2490
				    && (anInt2519 < anInt2508 || anInt2508 < 0)
				    && aBool2483) {
				    i_219_ -= method283(anInt2522 + i_217_
							- anInt2490 - 1);
				    if (i_219_ <= 0) {
					method4645(class250s);
					Object object = null;
					continue;
				    }
				}
				int i_221_ = method224();
				if (method4556() < method224()) {
				    int i_222_ = method224() - method4556();
				    i_219_ += i_219_ / method4556() * i_222_;
				}
				RSBuffer class525_sub38
				    = method4635(i_219_);
				for (int i_223_ = i_218_; i_223_ < i_217_;
				     i_223_++) {
				    boolean bool_224_ = aBool2529;
				    if (anInt2508 != 0) {
					if (anInt2522 == anInt2538) {
					    if (anInt2523 < 0) {
						anInt2523 = anInt2525;
						anInt2528 = i_211_;
					    }
					    aBool2529 = false;
					}
					if (anInt2522 == anInt2490
					    && anInt2524 < 0)
					    anInt2524 = anInt2525;
					if (anInt2522 > anInt2490
					    && (anInt2519 < anInt2508
						|| anInt2508 < 0)
					    && aBool2483)
					    bool_224_ = true;
				    }
				    if (bool_224_
					&& (anInt2522 < anInt2538
					    || anInt2522 > anInt2490)) {
					anInt2522++;
					if (++i_200_ > i_199_)
					    throw new RuntimeException();
				    } else {
					for (int i_225_ = 0; i_225_ < i_221_;
					     i_225_++) {
					    float f;
					    if (i_225_ < class250s.length)
						f = (class250s[i_225_]
						     .aFloatArray2449[i_223_]);
					    else
						f = (class250s
						     [i_225_ % method4556()]
						     .aFloatArray2449[i_223_]);
					    if (aClass397_2492
						== Class397.aClass397_4112) {
						int i_226_ = method4578(f);
						if (aClass391_2487
						    == Class391.aClass391_4070)
						    class525_sub38.method16840
							(i_226_, 241387851);
						else
						    class525_sub38.method16602
							(i_226_, 1270513025);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4108)) {
						int i_227_ = method4579(f);
						if (aClass391_2487
						    == Class391.aClass391_4070)
						    class525_sub38.method16840
							(i_227_, 241387851);
						else
						    class525_sub38.method16602
							(i_227_, 1051032041);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4109)) {
						int i_228_ = method4621(f);
						class525_sub38.method16735
						    (i_228_, -1807988443);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4111)) {
						int i_229_ = method4581(f);
						class525_sub38.method16735
						    (i_229_, -461989691);
					    }
					}
					anInt2522++;
					i_200_++;
				    }
				}
				synchronized (aList2518) {
				    anInt2539
					+= (method190(class525_sub38.index
						      * -1133521593)
					    / method224());
				    aList2518.add(class525_sub38);
				}
			    }
			} else if (method289()) {
			    anInt2501 = 0;
			    if (aClass250Array2500 == null
				|| (aClass250Array2500 != null
				    && (aClass250Array2500.length != anInt2479
					|| (aClass250Array2500[0].anInt2448
					    != anInt2493)))) {
				if (aClass250Array2500 != null)
				    method4645(aClass250Array2500);
				aClass250Array2500
				    = method4641(anInt2479, anInt2493);
			    }
			}
			method4645(class250s);
			Object object = null;
		    }
		}
		aClass525_Sub38_2488.index = i_210_ * 339428471;
		anInt2533 -= i_210_ - i_198_;
	    }
	}
    }
    
    int method4595(int i) {
	int i_230_ = 0;
	int i_231_ = 0;
	int i_232_;
	for (/**/; i >= 8 - anInt2530; i -= i_232_) {
	    i_232_ = 8 - anInt2530;
	    int i_233_ = (1 << i_232_) - 1;
	    i_230_
		+= (aByteArray2542[anInt2531] >> anInt2530 & i_233_) << i_231_;
	    anInt2530 = 0;
	    anInt2531++;
	    i_231_ += i_232_;
	}
	if (i > 0) {
	    i_232_ = (1 << i) - 1;
	    i_230_
		+= (aByteArray2542[anInt2531] >> anInt2530 & i_232_) << i_231_;
	    anInt2530 += i;
	}
	return i_230_;
    }
    
    void method4596(Class250[] class250s) {
	if (class250s != null) {
	    for (int i = 0; i < class250s.length; i++)
		method4625(class250s[i]);
	}
    }
    
    void method4597(Class250[] class250s) {
	if (class250s != null) {
	    for (int i = 0; i < class250s.length; i++)
		method4625(class250s[i]);
	}
    }
    
    synchronized void method4598(boolean bool) {
	if (!bool) {
	    anInt2478 = 0;
	    anInt2493 = 0;
	    aBoolArray2498 = null;
	    anIntArray2499 = null;
	    method4645(aClass250Array2537);
	    aClass250Array2537 = null;
	    method4645(aClass250Array2500);
	    aClass250Array2500 = null;
	    anInt2501 = 0;
	    anInt2502 = 0;
	    aBoolArray2503 = null;
	    method4645(aClass250Array2504);
	    aClass250Array2504 = null;
	    method4625(aClass250_2526);
	    method4625(aClass250_2506);
	    method4625(aClass250_2507);
	    method4625(aClass250_2516);
	    method4625(aClass250_2489);
	    method4625(aClass250_2509);
	    aClass250_2526 = null;
	    aClass250_2506 = null;
	    aClass250_2507 = null;
	    aClass250_2516 = null;
	    aClass250_2489 = null;
	    aClass250_2509 = null;
	    anIntArray2511 = null;
	    anIntArray2512 = null;
	}
	anInt2532 = 0;
	Iterator iterator = aList2514.iterator();
	while (iterator.hasNext()) {
	    RSBuffer class525_sub38 = (RSBuffer) iterator.next();
	    class525_sub38.method16627(389717072);
	}
	aList2514.clear();
	aBool2513 = false;
	if (aClass525_Sub38_2488 != null) {
	    synchronized (aClass525_Sub38_2488) {
		aClass525_Sub38_2488.method16627(466021256);
		aClass525_Sub38_2488 = null;
	    }
	}
	anInt2533 = 0;
	anInt2517 = 0;
	if (!bool) {
	    synchronized (aList2518) {
		Iterator iterator_234_ = aList2518.iterator();
		while (iterator_234_.hasNext()) {
		    RSBuffer class525_sub38
			= (RSBuffer) iterator_234_.next();
		    class525_sub38.method16627(1792711658);
		}
		aList2518.clear();
	    }
	    anInt2539 = 0;
	}
	synchronized (aList2484) {
	    Iterator iterator_235_ = aList2484.iterator();
	    while (iterator_235_.hasNext()) {
		RSBuffer class525_sub38
		    = (RSBuffer) iterator_235_.next();
		class525_sub38.method16627(673494707);
	    }
	    aList2484.clear();
	}
	aBool2515 = false;
	anInt2522 = 0;
	anInt2525 = -1;
	anInt2546 = -1;
	if (!bool) {
	    method4557(false);
	    aBool2520 = false;
	    anInt2538 = -1;
	    anInt2490 = -1;
	    anInt2508 = 0;
	    anInt2519 = 0;
	    anInt2523 = -1;
	    anInt2524 = -1;
	    anInt2540 = -1;
	    anInt2528 = -1;
	    aBool2529 = false;
	    aBool2483 = false;
	} else {
	    anInt2519++;
	    aBool2529 = true;
	}
    }
    
    void method4599() {
	if (method281() != Class376.aClass376_3902) {
	    method4577();
	    if (method281() == Class376.aClass376_3896)
		method4552(Class376.aClass376_3897);
	}
    }
    
    void method4600() {
	if (method281() != Class376.aClass376_3902) {
	    method4577();
	    if (method281() == Class376.aClass376_3896)
		method4552(Class376.aClass376_3897);
	}
    }
    
    void method4601() {
	if (method281() != Class376.aClass376_3902) {
	    method4577();
	    if (method281() == Class376.aClass376_3896)
		method4552(Class376.aClass376_3897);
	}
    }
    
    void method4602(RSBuffer class525_sub38) {
	aList2514.add(class525_sub38);
    }
    
    boolean method4603() {
	return aBool2513;
    }
    
    boolean method4604() {
	return aBool2513;
    }
    
    int method4605() {
	if (method289())
	    return anInt2486;
	throw new RuntimeException("");
    }
    
    boolean method4606(RSBuffer class525_sub38) {
	if (class525_sub38.readUnsignedByte(716982358) != 79
	    || class525_sub38.readUnsignedByte(921689933) != 103
	    || class525_sub38.readUnsignedByte(1710272405) != 103
	    || class525_sub38.readUnsignedByte(1764175930) != 83)
	    return false;
	return true;
    }
    
    int method4607(int i) {
	int i_236_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_236_++;
	return i_236_;
    }
    
    boolean method4608(byte[] is, int i, int i_237_) {
	if (is[i] != i_237_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    boolean method4609(byte[] is, int i, int i_238_) {
	if (is[i] != i_238_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    boolean method4610(byte[] is, int i, int i_239_) {
	if (is[i] != i_239_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    float method4611(int i) {
	int i_240_ = i & 0x1fffff;
	int i_241_ = i & ~0x7fffffff;
	int i_242_ = (i & 0x7fe00000) >> 21;
	if (i_241_ != 0)
	    i_240_ = -i_240_;
	return (float) ((double) i_240_
			* Math.pow(2.0, (double) (i_242_ - 788)));
    }
    
    public void method307(boolean bool) {
	if (!bool)
	    method285();
	else if (method281() == Class376.aClass376_3901) {
	    method4634(true);
	    method4552(Class376.aClass376_3897);
	}
    }
    
    float method4612(int i) {
	int i_243_ = i & 0x1fffff;
	int i_244_ = i & ~0x7fffffff;
	int i_245_ = (i & 0x7fe00000) >> 21;
	if (i_244_ != 0)
	    i_243_ = -i_243_;
	return (float) ((double) i_243_
			* Math.pow(2.0, (double) (i_245_ - 788)));
    }
    
    float method4613(int i) {
	int i_246_ = i & 0x1fffff;
	int i_247_ = i & ~0x7fffffff;
	int i_248_ = (i & 0x7fe00000) >> 21;
	if (i_247_ != 0)
	    i_246_ = -i_246_;
	return (float) ((double) i_246_
			* Math.pow(2.0, (double) (i_248_ - 788)));
    }
    
    int method4614() {
	return anInt2531;
    }
    
    int method4615() {
	return anInt2531;
    }
    
    int method4616() {
	return anInt2530;
    }
    
    int method4617(int i) {
	int i_249_ = 0;
	int i_250_ = 0;
	int i_251_;
	for (/**/; i >= 8 - anInt2530; i -= i_251_) {
	    i_251_ = 8 - anInt2530;
	    int i_252_ = (1 << i_251_) - 1;
	    i_249_
		+= (aByteArray2542[anInt2531] >> anInt2530 & i_252_) << i_250_;
	    anInt2530 = 0;
	    anInt2531++;
	    i_250_ += i_251_;
	}
	if (i > 0) {
	    i_251_ = (1 << i) - 1;
	    i_249_
		+= (aByteArray2542[anInt2531] >> anInt2530 & i_251_) << i_250_;
	    anInt2530 += i;
	}
	return i_249_;
    }
    
    int method4618() {
	int i = aByteArray2542[anInt2531] >> anInt2530 & 0x1;
	anInt2530++;
	anInt2531 += anInt2530 >> 3;
	anInt2530 &= 0x7;
	return i;
    }
    
    synchronized void method4619(RSBuffer class525_sub38) {
	aList2484.add(class525_sub38);
	method4552(Class376.aClass376_3897);
    }
    
    public void method311(boolean bool, int i, int i_253_, int i_254_) {
	aBool2483 = bool;
	anInt2508 = i;
	anInt2538 = i_253_;
	anInt2490 = i_254_;
    }
    
    int method4620() {
	int i = aByteArray2542[anInt2531] >> anInt2530 & 0x1;
	anInt2530++;
	anInt2531 += anInt2530 >> 3;
	anInt2530 &= 0x7;
	return i;
    }
    
    int method4621(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    int method4622(int i) {
	int i_255_ = 0;
	int i_256_ = 0;
	int i_257_;
	for (/**/; i >= 8 - anInt2530; i -= i_257_) {
	    i_257_ = 8 - anInt2530;
	    int i_258_ = (1 << i_257_) - 1;
	    i_255_
		+= (aByteArray2542[anInt2531] >> anInt2530 & i_258_) << i_256_;
	    anInt2530 = 0;
	    anInt2531++;
	    i_256_ += i_257_;
	}
	if (i > 0) {
	    i_257_ = (1 << i) - 1;
	    i_255_
		+= (aByteArray2542[anInt2531] >> anInt2530 & i_257_) << i_256_;
	    anInt2530 += i;
	}
	return i_255_;
    }
    
    void method4623(byte[] is, int i) {
	anInt2532 = 0;
	if (!method289()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_259_ = 0;
	    if (method4565(is, i, 1))
		i_259_ = 1;
	    else if (method4565(is, i, 3))
		i_259_ = 3;
	    else if (method4565(is, i, 5))
		i_259_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_259_).toString());
	    if (i_259_ == 1) {
		method4569(is, i + 7);
		int i_260_ = method4550(32);
		anInt2479 = method4550(8);
		anInt2486 = method4550(32);
		anInt2480 = method4550(32);
		anInt2481 = method4550(32);
		anInt2482 = method4550(32);
		anInt2478 = 1 << method4550(4);
		anInt2493 = 1 << method4550(4);
		int i_261_ = 1 << method4550(1);
		if (i_260_ != 0 || i_261_ == 0)
		    throw new RuntimeException("");
		aBool2520 = true;
		anInt2525++;
	    } else if (i_259_ != 3 && i_259_ == 5) {
		if (!method4565(is, i, 5))
		    throw new RuntimeException("");
		method4569(is, i + 7);
		if (aClass250Array2504 != null) {
		    method4645(aClass250Array2504);
		    aClass250Array2504 = null;
		}
		aClass250Array2504 = method4641(anInt2479, anInt2493);
		for (int i_262_ = 0; i_262_ < 2; i_262_++) {
		    int i_263_ = i_262_ != 0 ? anInt2493 : anInt2478;
		    int i_264_ = i_263_ >> 1;
		    int i_265_ = i_263_ >> 2;
		    int i_266_ = i_263_ >> 3;
		    Class250 class250 = method4559(i_264_);
		    for (int i_267_ = 0; i_267_ < i_265_; i_267_++) {
			class250.aFloatArray2449[2 * i_267_]
			    = (float) Math.cos((double) (4 * i_267_)
					       * 3.141592653589793
					       / (double) i_263_);
			class250.aFloatArray2449[2 * i_267_ + 1]
			    = -(float) Math.sin((double) (4 * i_267_)
						* 3.141592653589793
						/ (double) i_263_);
		    }
		    Class250 class250_268_ = method4559(i_264_);
		    for (int i_269_ = 0; i_269_ < i_265_; i_269_++) {
			class250_268_.aFloatArray2449[2 * i_269_]
			    = (float) Math.cos((double) (2 * i_269_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_263_));
			class250_268_.aFloatArray2449[2 * i_269_ + 1]
			    = (float) Math.sin((double) (2 * i_269_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_263_));
		    }
		    Class250 class250_270_ = method4559(i_265_);
		    for (int i_271_ = 0; i_271_ < i_266_; i_271_++) {
			class250_270_.aFloatArray2449[2 * i_271_]
			    = (float) Math.cos((double) (4 * i_271_ + 2)
					       * 3.141592653589793
					       / (double) i_263_);
			class250_270_.aFloatArray2449[2 * i_271_ + 1]
			    = -(float) Math.sin((double) (4 * i_271_ + 2)
						* 3.141592653589793
						/ (double) i_263_);
		    }
		    int[] is_272_ = new int[i_266_];
		    int i_273_ = Class180.method3120(i_266_ - 1, (byte) 42);
		    for (int i_274_ = 0; i_274_ < i_266_; i_274_++)
			is_272_[i_274_]
			    = Class320.method5715(i_274_, i_273_, 1738870955);
		    if (i_262_ != 0) {
			aClass250_2516 = class250;
			aClass250_2489 = class250_268_;
			aClass250_2509 = class250_270_;
			anIntArray2512 = is_272_;
		    } else {
			aClass250_2526 = class250;
			aClass250_2506 = class250_268_;
			aClass250_2507 = class250_270_;
			anIntArray2511 = is_272_;
		    }
		}
		method4573();
		int i_275_ = method4550(6) + 1;
		for (int i_276_ = 0; i_276_ < i_275_; i_276_++)
		    method4550(16);
		i_275_ = method4550(6) + 1;
		if (aClass254Array2495 == null
		    || aClass254Array2495.length != i_275_)
		    aClass254Array2495 = new Class254[i_275_];
		for (int i_277_ = 0; i_277_ < i_275_; i_277_++) {
		    if (aClass254Array2495[i_277_] == null)
			aClass254Array2495[i_277_] = new Class254();
		    aClass254Array2495[i_277_].method4528(this, anInt2479);
		}
		int i_278_ = method4550(6) + 1;
		if (aClass253Array2496 == null
		    || aClass253Array2496.length != i_278_)
		    aClass253Array2496 = new Class253[i_278_];
		for (int i_279_ = 0; i_279_ < i_278_; i_279_++) {
		    if (aClass253Array2496[i_279_] == null)
			aClass253Array2496[i_279_] = new Class253();
		    aClass253Array2496[i_279_].method4520(this);
		}
		int i_280_ = method4550(6) + 1;
		if (aClass244Array2497 == null
		    || aClass244Array2497.length != i_280_)
		    aClass244Array2497 = new Class244[i_280_];
		for (int i_281_ = 0; i_281_ < i_280_; i_281_++) {
		    if (aClass244Array2497[i_281_] == null)
			aClass244Array2497[i_281_] = new Class244();
		    aClass244Array2497[i_281_].method4462(this);
		}
		int i_282_ = method4550(6) + 1;
		aBoolArray2498 = new boolean[i_282_];
		anIntArray2499 = new int[i_282_];
		for (int i_283_ = 0; i_283_ < i_282_; i_283_++) {
		    aBoolArray2498[i_283_] = method4570() != 0;
		    method4550(16);
		    method4550(16);
		    anIntArray2499[i_283_] = method4550(8);
		}
		method4557(true);
	    }
	}
    }
    
    int method4624(float f) {
	int i = (int) (f * 32767.0F);
	if (i > 32767)
	    return 32767;
	if (i < -32768)
	    return -32768;
	return i;
    }
    
    static {
	aClass200_2541 = new Class200(524288, 1024);
    }
    
    void method4625(Class250 class250) {
	if (class250 != null) {
	    synchronized (aClass200_2541) {
		class250.aBool2447 = false;
	    }
	}
    }
    
    void method4626(byte[] is, int i) {
	anInt2532 = 0;
	if (!method289()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_284_ = 0;
	    if (method4565(is, i, 1))
		i_284_ = 1;
	    else if (method4565(is, i, 3))
		i_284_ = 3;
	    else if (method4565(is, i, 5))
		i_284_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_284_).toString());
	    if (i_284_ == 1) {
		method4569(is, i + 7);
		int i_285_ = method4550(32);
		anInt2479 = method4550(8);
		anInt2486 = method4550(32);
		anInt2480 = method4550(32);
		anInt2481 = method4550(32);
		anInt2482 = method4550(32);
		anInt2478 = 1 << method4550(4);
		anInt2493 = 1 << method4550(4);
		int i_286_ = 1 << method4550(1);
		if (i_285_ != 0 || i_286_ == 0)
		    throw new RuntimeException("");
		aBool2520 = true;
		anInt2525++;
	    } else if (i_284_ != 3 && i_284_ == 5) {
		if (!method4565(is, i, 5))
		    throw new RuntimeException("");
		method4569(is, i + 7);
		if (aClass250Array2504 != null) {
		    method4645(aClass250Array2504);
		    aClass250Array2504 = null;
		}
		aClass250Array2504 = method4641(anInt2479, anInt2493);
		for (int i_287_ = 0; i_287_ < 2; i_287_++) {
		    int i_288_ = i_287_ != 0 ? anInt2493 : anInt2478;
		    int i_289_ = i_288_ >> 1;
		    int i_290_ = i_288_ >> 2;
		    int i_291_ = i_288_ >> 3;
		    Class250 class250 = method4559(i_289_);
		    for (int i_292_ = 0; i_292_ < i_290_; i_292_++) {
			class250.aFloatArray2449[2 * i_292_]
			    = (float) Math.cos((double) (4 * i_292_)
					       * 3.141592653589793
					       / (double) i_288_);
			class250.aFloatArray2449[2 * i_292_ + 1]
			    = -(float) Math.sin((double) (4 * i_292_)
						* 3.141592653589793
						/ (double) i_288_);
		    }
		    Class250 class250_293_ = method4559(i_289_);
		    for (int i_294_ = 0; i_294_ < i_290_; i_294_++) {
			class250_293_.aFloatArray2449[2 * i_294_]
			    = (float) Math.cos((double) (2 * i_294_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_288_));
			class250_293_.aFloatArray2449[2 * i_294_ + 1]
			    = (float) Math.sin((double) (2 * i_294_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_288_));
		    }
		    Class250 class250_295_ = method4559(i_290_);
		    for (int i_296_ = 0; i_296_ < i_291_; i_296_++) {
			class250_295_.aFloatArray2449[2 * i_296_]
			    = (float) Math.cos((double) (4 * i_296_ + 2)
					       * 3.141592653589793
					       / (double) i_288_);
			class250_295_.aFloatArray2449[2 * i_296_ + 1]
			    = -(float) Math.sin((double) (4 * i_296_ + 2)
						* 3.141592653589793
						/ (double) i_288_);
		    }
		    int[] is_297_ = new int[i_291_];
		    int i_298_ = Class180.method3120(i_291_ - 1, (byte) 79);
		    for (int i_299_ = 0; i_299_ < i_291_; i_299_++)
			is_297_[i_299_]
			    = Class320.method5715(i_299_, i_298_, 532709636);
		    if (i_287_ != 0) {
			aClass250_2516 = class250;
			aClass250_2489 = class250_293_;
			aClass250_2509 = class250_295_;
			anIntArray2512 = is_297_;
		    } else {
			aClass250_2526 = class250;
			aClass250_2506 = class250_293_;
			aClass250_2507 = class250_295_;
			anIntArray2511 = is_297_;
		    }
		}
		method4573();
		int i_300_ = method4550(6) + 1;
		for (int i_301_ = 0; i_301_ < i_300_; i_301_++)
		    method4550(16);
		i_300_ = method4550(6) + 1;
		if (aClass254Array2495 == null
		    || aClass254Array2495.length != i_300_)
		    aClass254Array2495 = new Class254[i_300_];
		for (int i_302_ = 0; i_302_ < i_300_; i_302_++) {
		    if (aClass254Array2495[i_302_] == null)
			aClass254Array2495[i_302_] = new Class254();
		    aClass254Array2495[i_302_].method4528(this, anInt2479);
		}
		int i_303_ = method4550(6) + 1;
		if (aClass253Array2496 == null
		    || aClass253Array2496.length != i_303_)
		    aClass253Array2496 = new Class253[i_303_];
		for (int i_304_ = 0; i_304_ < i_303_; i_304_++) {
		    if (aClass253Array2496[i_304_] == null)
			aClass253Array2496[i_304_] = new Class253();
		    aClass253Array2496[i_304_].method4520(this);
		}
		int i_305_ = method4550(6) + 1;
		if (aClass244Array2497 == null
		    || aClass244Array2497.length != i_305_)
		    aClass244Array2497 = new Class244[i_305_];
		for (int i_306_ = 0; i_306_ < i_305_; i_306_++) {
		    if (aClass244Array2497[i_306_] == null)
			aClass244Array2497[i_306_] = new Class244();
		    aClass244Array2497[i_306_].method4462(this);
		}
		int i_307_ = method4550(6) + 1;
		aBoolArray2498 = new boolean[i_307_];
		anIntArray2499 = new int[i_307_];
		for (int i_308_ = 0; i_308_ < i_307_; i_308_++) {
		    aBoolArray2498[i_308_] = method4570() != 0;
		    method4550(16);
		    method4550(16);
		    anIntArray2499[i_308_] = method4550(8);
		}
		method4557(true);
	    }
	}
    }
    
    void method4627(Class250 class250) {
	if (class250 != null) {
	    synchronized (aClass200_2541) {
		class250.aBool2447 = false;
	    }
	}
    }
    
    public void method306(int i, Class397 class397, Class391 class391,
			  int i_309_) {
	anInt2543 = i_309_;
	if (method4586(i, class397, class391)) {
	    aClass397_2492 = class397;
	    aClass391_2487 = class391;
	} else
	    throw new RuntimeException("");
    }
    
    public void method296(Interface46 interface46) {
	anInterface46_2510 = interface46;
    }
    
    float method4628(int i) {
	int i_310_ = i & 0x1fffff;
	int i_311_ = i & ~0x7fffffff;
	int i_312_ = (i & 0x7fe00000) >> 21;
	if (i_311_ != 0)
	    i_310_ = -i_310_;
	return (float) ((double) i_310_
			* Math.pow(2.0, (double) (i_312_ - 788)));
    }
    
    boolean method4629(byte[] is, int i, int i_313_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_313_ > is.length)
	    return false;
	method4569(is, i);
	int i_314_ = method4570();
	if (i_314_ != 0) {
	    method4574(is, i);
	    return false;
	}
	if (!method289())
	    throw new RuntimeException();
	int i_315_ = method4550(method4593(anIntArray2499.length - 1));
	boolean bool = aBoolArray2498[i_315_];
	int i_316_ = bool ? anInt2493 : anInt2478;
	boolean bool_317_ = false;
	boolean bool_318_ = false;
	if (bool) {
	    bool_317_ = method4570() != 0;
	    bool_318_ = method4570() != 0;
	}
	int i_319_ = i_316_ >> 1;
	int i_320_;
	int i_321_;
	int i_322_;
	if (bool && !bool_317_) {
	    i_320_ = (i_316_ >> 2) - (anInt2478 >> 2);
	    i_321_ = (i_316_ >> 2) + (anInt2478 >> 2);
	    i_322_ = anInt2478 >> 1;
	} else {
	    i_320_ = 0;
	    i_321_ = i_319_;
	    i_322_ = i_316_ >> 1;
	}
	int i_323_;
	int i_324_;
	int i_325_;
	if (bool && !bool_318_) {
	    i_323_ = i_316_ - (i_316_ >> 2) - (anInt2478 >> 2);
	    i_324_ = i_316_ - (i_316_ >> 2) + (anInt2478 >> 2);
	    i_325_ = anInt2478 >> 1;
	} else {
	    i_323_ = i_319_;
	    i_324_ = i_316_;
	    i_325_ = i_316_ >> 1;
	}
	Class244 class244 = aClass244Array2497[anIntArray2499[i_315_]];
	if (aBoolArray2545 == null || aBoolArray2545.length != anInt2479) {
	    aBoolArray2545 = new boolean[anInt2479];
	    aBoolArray2527 = new boolean[anInt2479];
	}
	for (int i_326_ = 0; i_326_ < anInt2479; i_326_++) {
	    int i_327_ = (class244.anIntArray2419 != null
			  ? class244.anIntArray2419[i_326_] : 0);
	    int i_328_ = i_327_;
	    int i_329_ = class244.anIntArray2420[i_328_];
	    aBoolArray2545[i_326_]
		= !aClass254Array2495[i_329_].method4532(i_326_);
	    aBoolArray2527[i_326_] = aBoolArray2545[i_326_];
	}
	for (int i_330_ = 0; i_330_ < class244.anInt2418; i_330_++) {
	    if (!aBoolArray2545[class244.anIntArray2424[i_330_]]
		|| !aBoolArray2545[class244.anIntArray2425[i_330_]]) {
		aBoolArray2545[class244.anIntArray2424[i_330_]] = false;
		aBoolArray2545[class244.anIntArray2425[i_330_]] = false;
	    }
	}
	if (aBoolArray2547 == null || aBoolArray2547.length != anInt2479)
	    aBoolArray2547 = new boolean[anInt2479];
	for (int i_331_ = 0; i_331_ < class244.anInt2421; i_331_++) {
	    int i_332_ = 0;
	    for (int i_333_ = 0; i_333_ < anInt2479; i_333_++) {
		int i_334_ = (class244.anIntArray2419 != null
			      ? class244.anIntArray2419[i_333_] : i_331_);
		if (i_334_ == i_331_)
		    aBoolArray2547[i_332_++] = aBoolArray2545[i_333_];
	    }
	    Class253 class253
		= aClass253Array2496[class244.anIntArray2422[i_331_]];
	    Object object = null;
	    Class250[] class250s;
	    if (class253.anInt2455 == 2) {
		Class250[] class250s_335_ = method4641(1, anInt2479 * i_316_);
		for (int i_336_ = 0; i_336_ < i_316_; i_336_++) {
		    for (int i_337_ = 0; i_337_ < anInt2479; i_337_++) {
			try {
			    class250s_335_[0].aFloatArray2449
				[i_336_ * anInt2479 + i_337_]
				= (aClass250Array2504[i_337_].aFloatArray2449
				   [i_336_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class250s_335_
		    = class253.method4522(class250s_335_, i_316_ >> 1,
					  aBoolArray2547);
		class250s = aClass250Array2504;
		for (int i_338_ = 0; i_338_ < i_316_; i_338_++) {
		    for (int i_339_ = 0; i_339_ < anInt2479; i_339_++) {
			try {
			    class250s[i_339_].aFloatArray2449[i_338_]
				= (class250s_335_[0].aFloatArray2449
				   [anInt2479 * i_338_ + i_339_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method4645(class250s_335_);
		Object object_340_ = null;
	    } else
		class250s = class253.method4522(aClass250Array2504,
						i_316_ >> 1, aBoolArray2547);
	    if (class244.anIntArray2419 != null) {
		i_332_ = 0;
		for (int i_341_ = 0; i_341_ < anInt2479; i_341_++) {
		    int i_342_ = class244.anIntArray2419[i_341_];
		    if (i_342_ == i_331_)
			aClass250Array2504[i_341_] = class250s[i_332_++];
		}
	    } else {
		if (aClass250Array2504 != class250s)
		    method4645(aClass250Array2504);
		aClass250Array2504 = class250s;
	    }
	}
	for (int i_343_ = class244.anInt2418 - 1; i_343_ >= 0; i_343_--) {
	    Class250 class250
		= aClass250Array2504[class244.anIntArray2424[i_343_]];
	    Class250 class250_344_
		= aClass250Array2504[class244.anIntArray2425[i_343_]];
	    for (int i_345_ = 0; i_345_ < class250.anInt2448; i_345_++) {
		float f = class250.aFloatArray2449[i_345_];
		float f_346_ = class250_344_.aFloatArray2449[i_345_];
		float f_347_ = f;
		float f_348_ = f_346_;
		if (f > 0.0F) {
		    if (f_346_ > 0.0F) {
			f_347_ = f;
			f_348_ = f - f_346_;
		    } else {
			f_348_ = f;
			f_347_ = f + f_346_;
		    }
		} else if (f_346_ > 0.0F) {
		    f_347_ = f;
		    f_348_ = f + f_346_;
		} else {
		    f_348_ = f;
		    f_347_ = f - f_346_;
		}
		class250.aFloatArray2449[i_345_] = f_347_;
		class250_344_.aFloatArray2449[i_345_] = f_348_;
	    }
	}
	for (int i_349_ = 0; i_349_ < aBoolArray2545.length; i_349_++)
	    aBoolArray2545[i_349_] = aBoolArray2527[i_349_];
	for (int i_350_ = 0; i_350_ < anInt2479; i_350_++) {
	    if (!aBoolArray2545[i_350_]) {
		int i_351_ = (class244.anIntArray2419 != null
			      ? class244.anIntArray2419[i_350_] : 0);
		int i_352_ = i_351_;
		int i_353_ = class244.anIntArray2420[i_352_];
		aClass254Array2495[i_353_].method4544(i_350_);
		aClass254Array2495[i_353_].method4548((aClass250Array2504
						       [i_350_]),
						      i_316_ >> 1, i_350_);
	    }
	}
	for (int i_354_ = 0; i_354_ < anInt2479; i_354_++) {
	    if (aBoolArray2545[i_354_]) {
		for (int i_355_ = i_316_ >> 1; i_355_ < i_316_; i_355_++)
		    aClass250Array2504[i_354_].aFloatArray2449[i_355_] = 0.0F;
	    } else {
		int i_356_ = i_316_ >> 1;
		int i_357_ = i_316_ >> 2;
		int i_358_ = i_316_ >> 3;
		Class250 class250 = aClass250Array2504[i_354_];
		for (int i_359_ = 0; i_359_ < i_356_; i_359_++)
		    class250.aFloatArray2449[i_359_] *= 0.5F;
		for (int i_360_ = i_356_; i_360_ < i_316_; i_360_++)
		    class250.aFloatArray2449[i_360_]
			= -class250.aFloatArray2449[i_316_ - i_360_ - 1];
		Class250 class250_361_
		    = bool ? aClass250_2516 : aClass250_2526;
		Class250 class250_362_
		    = bool ? aClass250_2489 : aClass250_2506;
		Class250 class250_363_
		    = bool ? aClass250_2509 : aClass250_2507;
		int[] is_364_ = bool ? anIntArray2512 : anIntArray2511;
		for (int i_365_ = 0; i_365_ < i_357_; i_365_++) {
		    float f = (class250.aFloatArray2449[4 * i_365_]
			       - (class250.aFloatArray2449
				  [i_316_ - 4 * i_365_ - 1]));
		    float f_366_ = (class250.aFloatArray2449[4 * i_365_ + 2]
				    - (class250.aFloatArray2449
				       [i_316_ - 4 * i_365_ - 3]));
		    float f_367_ = class250_361_.aFloatArray2449[2 * i_365_];
		    float f_368_
			= class250_361_.aFloatArray2449[2 * i_365_ + 1];
		    class250.aFloatArray2449[i_316_ - 4 * i_365_ - 1]
			= f * f_367_ - f_366_ * f_368_;
		    class250.aFloatArray2449[i_316_ - 4 * i_365_ - 3]
			= f * f_368_ + f_366_ * f_367_;
		}
		for (int i_369_ = 0; i_369_ < i_358_; i_369_++) {
		    float f
			= class250.aFloatArray2449[i_356_ + 3 + 4 * i_369_];
		    float f_370_
			= class250.aFloatArray2449[i_356_ + 1 + 4 * i_369_];
		    float f_371_ = class250.aFloatArray2449[4 * i_369_ + 3];
		    float f_372_ = class250.aFloatArray2449[4 * i_369_ + 1];
		    class250.aFloatArray2449[i_356_ + 3 + 4 * i_369_]
			= f + f_371_;
		    class250.aFloatArray2449[i_356_ + 1 + 4 * i_369_]
			= f_370_ + f_372_;
		    float f_373_ = (class250_361_.aFloatArray2449
				    [i_356_ - 4 - 4 * i_369_]);
		    float f_374_ = (class250_361_.aFloatArray2449
				    [i_356_ - 3 - 4 * i_369_]);
		    class250.aFloatArray2449[4 * i_369_ + 3]
			= (f - f_371_) * f_373_ - (f_370_ - f_372_) * f_374_;
		    class250.aFloatArray2449[4 * i_369_ + 1]
			= (f_370_ - f_372_) * f_373_ + (f - f_371_) * f_374_;
		}
		int i_375_ = Class180.method3120(i_316_ - 1, (byte) -18);
		for (int i_376_ = 0; i_376_ < i_375_ - 3; i_376_++) {
		    int i_377_ = i_316_ >> i_376_ + 2;
		    int i_378_ = 8 << i_376_;
		    for (int i_379_ = 0; i_379_ < 2 << i_376_; i_379_++) {
			int i_380_ = i_316_ - i_377_ * 2 * i_379_;
			int i_381_ = i_316_ - i_377_ * (2 * i_379_ + 1);
			for (int i_382_ = 0; i_382_ < i_316_ >> i_376_ + 4;
			     i_382_++) {
			    int i_383_ = 4 * i_382_;
			    float f = (class250.aFloatArray2449
				       [i_380_ - 1 - i_383_]);
			    float f_384_ = (class250.aFloatArray2449
					    [i_380_ - 3 - i_383_]);
			    float f_385_ = (class250.aFloatArray2449
					    [i_381_ - 1 - i_383_]);
			    float f_386_ = (class250.aFloatArray2449
					    [i_381_ - 3 - i_383_]);
			    class250.aFloatArray2449[i_380_ - 1 - i_383_]
				= f + f_385_;
			    class250.aFloatArray2449[i_380_ - 3 - i_383_]
				= f_384_ + f_386_;
			    float f_387_ = (class250_361_.aFloatArray2449
					    [i_382_ * i_378_]);
			    float f_388_ = (class250_361_.aFloatArray2449
					    [i_382_ * i_378_ + 1]);
			    class250.aFloatArray2449[i_381_ - 1 - i_383_]
				= ((f - f_385_) * f_387_
				   - (f_384_ - f_386_) * f_388_);
			    class250.aFloatArray2449[i_381_ - 3 - i_383_]
				= ((f_384_ - f_386_) * f_387_
				   + (f - f_385_) * f_388_);
			}
		    }
		}
		for (int i_389_ = 1; i_389_ < i_358_ - 1; i_389_++) {
		    int i_390_ = is_364_[i_389_];
		    if (i_389_ < i_390_) {
			int i_391_ = 8 * i_389_;
			int i_392_ = 8 * i_390_;
			float f = class250.aFloatArray2449[i_391_ + 1];
			class250.aFloatArray2449[i_391_ + 1]
			    = class250.aFloatArray2449[i_392_ + 1];
			class250.aFloatArray2449[i_392_ + 1] = f;
			f = class250.aFloatArray2449[i_391_ + 3];
			class250.aFloatArray2449[i_391_ + 3]
			    = class250.aFloatArray2449[i_392_ + 3];
			class250.aFloatArray2449[i_392_ + 3] = f;
			f = class250.aFloatArray2449[i_391_ + 5];
			class250.aFloatArray2449[i_391_ + 5]
			    = class250.aFloatArray2449[i_392_ + 5];
			class250.aFloatArray2449[i_392_ + 5] = f;
			f = class250.aFloatArray2449[i_391_ + 7];
			class250.aFloatArray2449[i_391_ + 7]
			    = class250.aFloatArray2449[i_392_ + 7];
			class250.aFloatArray2449[i_392_ + 7] = f;
		    }
		}
		for (int i_393_ = 0; i_393_ < i_356_; i_393_++)
		    class250.aFloatArray2449[i_393_]
			= class250.aFloatArray2449[2 * i_393_ + 1];
		for (int i_394_ = 0; i_394_ < i_358_; i_394_++) {
		    class250.aFloatArray2449[i_316_ - 1 - 2 * i_394_]
			= class250.aFloatArray2449[4 * i_394_];
		    class250.aFloatArray2449[i_316_ - 2 - 2 * i_394_]
			= class250.aFloatArray2449[4 * i_394_ + 1];
		    class250.aFloatArray2449[i_316_ - i_357_ - 1 - 2 * i_394_]
			= class250.aFloatArray2449[4 * i_394_ + 2];
		    class250.aFloatArray2449[i_316_ - i_357_ - 2 - 2 * i_394_]
			= class250.aFloatArray2449[4 * i_394_ + 3];
		}
		for (int i_395_ = 0; i_395_ < i_358_; i_395_++) {
		    float f = class250_363_.aFloatArray2449[2 * i_395_];
		    float f_396_
			= class250_363_.aFloatArray2449[2 * i_395_ + 1];
		    float f_397_
			= class250.aFloatArray2449[i_356_ + 2 * i_395_];
		    float f_398_
			= class250.aFloatArray2449[i_356_ + 2 * i_395_ + 1];
		    float f_399_
			= class250.aFloatArray2449[i_316_ - 2 - 2 * i_395_];
		    float f_400_
			= class250.aFloatArray2449[i_316_ - 1 - 2 * i_395_];
		    float f_401_
			= f_396_ * (f_397_ - f_399_) + f * (f_398_ + f_400_);
		    class250.aFloatArray2449[i_356_ + 2 * i_395_]
			= (f_397_ + f_399_ + f_401_) * 0.5F;
		    class250.aFloatArray2449[i_316_ - 2 - 2 * i_395_]
			= (f_397_ + f_399_ - f_401_) * 0.5F;
		    f_401_
			= f_396_ * (f_398_ + f_400_) - f * (f_397_ - f_399_);
		    class250.aFloatArray2449[i_356_ + 2 * i_395_ + 1]
			= (f_398_ - f_400_ + f_401_) * 0.5F;
		    class250.aFloatArray2449[i_316_ - 1 - 2 * i_395_]
			= (-f_398_ + f_400_ + f_401_) * 0.5F;
		}
		for (int i_402_ = 0; i_402_ < i_357_; i_402_++) {
		    class250.aFloatArray2449[i_402_]
			= ((class250.aFloatArray2449[2 * i_402_ + i_356_]
			    * class250_362_.aFloatArray2449[2 * i_402_])
			   + (class250.aFloatArray2449[2 * i_402_ + 1 + i_356_]
			      * (class250_362_.aFloatArray2449
				 [2 * i_402_ + 1])));
		    class250.aFloatArray2449[i_356_ - 1 - i_402_]
			= ((class250.aFloatArray2449[2 * i_402_ + i_356_]
			    * class250_362_.aFloatArray2449[2 * i_402_ + 1])
			   - (class250.aFloatArray2449[2 * i_402_ + 1 + i_356_]
			      * class250_362_.aFloatArray2449[2 * i_402_]));
		}
		for (int i_403_ = 0; i_403_ < i_357_; i_403_++)
		    class250.aFloatArray2449[i_316_ - i_357_ + i_403_]
			= -class250.aFloatArray2449[i_403_];
		for (int i_404_ = 0; i_404_ < i_357_; i_404_++)
		    class250.aFloatArray2449[i_404_]
			= class250.aFloatArray2449[i_357_ + i_404_];
		for (int i_405_ = 0; i_405_ < i_357_; i_405_++)
		    class250.aFloatArray2449[i_357_ + i_405_]
			= -class250.aFloatArray2449[i_357_ - i_405_ - 1];
		for (int i_406_ = 0; i_406_ < i_357_; i_406_++)
		    class250.aFloatArray2449[i_356_ + i_406_]
			= class250.aFloatArray2449[i_316_ - i_406_ - 1];
		for (int i_407_ = i_320_; i_407_ < i_321_; i_407_++) {
		    float f
			= (float) Math.sin(((double) (i_407_ - i_320_) + 0.5)
					   / (double) i_322_ * 0.5
					   * 3.141592653589793);
		    aClass250Array2504[i_354_].aFloatArray2449[i_407_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_408_ = i_323_; i_408_ < i_324_; i_408_++) {
		    float f
			= (float) Math.sin((((double) (i_408_ - i_323_) + 0.5)
					    / (double) i_325_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    aClass250Array2504[i_354_].aFloatArray2449[i_408_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class250[] class250s = null;
	if (anInt2501 > 0) {
	    int i_409_ = anInt2501 + i_316_ >> 2;
	    class250s = method4641(anInt2479, i_409_);
	    for (int i_410_ = 0; i_410_ < anInt2479; i_410_++) {
		if (!aBoolArray2503[i_410_]) {
		    for (int i_411_ = 0; i_411_ < anInt2502; i_411_++) {
			int i_412_ = (anInt2501 >> 1) + i_411_;
			class250s[i_410_].aFloatArray2449[i_411_]
			    += (aClass250Array2500[i_410_].aFloatArray2449
				[i_412_]);
		    }
		}
		if (!aBoolArray2545[i_410_]) {
		    for (int i_413_ = i_320_; i_413_ < i_316_ >> 1; i_413_++) {
			int i_414_ = (class250s[i_410_].anInt2448
				      - (i_316_ >> 1) + i_413_);
			class250s[i_410_].aFloatArray2449[i_414_]
			    += (aClass250Array2504[i_410_].aFloatArray2449
				[i_413_]);
		    }
		}
	    }
	}
	Class250[] class250s_415_ = aClass250Array2500;
	aClass250Array2500 = aClass250Array2504;
	aClass250Array2504 = class250s_415_;
	anInt2501 = i_316_;
	anInt2502 = i_324_ - (i_316_ >> 1);
	aBoolArray2503 = aBoolArray2545;
	atomicreference.set(class250s);
	return true;
    }
    
    boolean method4630(byte[] is, int i, int i_416_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_416_ > is.length)
	    return false;
	method4569(is, i);
	int i_417_ = method4570();
	if (i_417_ != 0) {
	    method4574(is, i);
	    return false;
	}
	if (!method289())
	    throw new RuntimeException();
	int i_418_ = method4550(method4593(anIntArray2499.length - 1));
	boolean bool = aBoolArray2498[i_418_];
	int i_419_ = bool ? anInt2493 : anInt2478;
	boolean bool_420_ = false;
	boolean bool_421_ = false;
	if (bool) {
	    bool_420_ = method4570() != 0;
	    bool_421_ = method4570() != 0;
	}
	int i_422_ = i_419_ >> 1;
	int i_423_;
	int i_424_;
	int i_425_;
	if (bool && !bool_420_) {
	    i_423_ = (i_419_ >> 2) - (anInt2478 >> 2);
	    i_424_ = (i_419_ >> 2) + (anInt2478 >> 2);
	    i_425_ = anInt2478 >> 1;
	} else {
	    i_423_ = 0;
	    i_424_ = i_422_;
	    i_425_ = i_419_ >> 1;
	}
	int i_426_;
	int i_427_;
	int i_428_;
	if (bool && !bool_421_) {
	    i_426_ = i_419_ - (i_419_ >> 2) - (anInt2478 >> 2);
	    i_427_ = i_419_ - (i_419_ >> 2) + (anInt2478 >> 2);
	    i_428_ = anInt2478 >> 1;
	} else {
	    i_426_ = i_422_;
	    i_427_ = i_419_;
	    i_428_ = i_419_ >> 1;
	}
	Class244 class244 = aClass244Array2497[anIntArray2499[i_418_]];
	if (aBoolArray2545 == null || aBoolArray2545.length != anInt2479) {
	    aBoolArray2545 = new boolean[anInt2479];
	    aBoolArray2527 = new boolean[anInt2479];
	}
	for (int i_429_ = 0; i_429_ < anInt2479; i_429_++) {
	    int i_430_ = (class244.anIntArray2419 != null
			  ? class244.anIntArray2419[i_429_] : 0);
	    int i_431_ = i_430_;
	    int i_432_ = class244.anIntArray2420[i_431_];
	    aBoolArray2545[i_429_]
		= !aClass254Array2495[i_432_].method4532(i_429_);
	    aBoolArray2527[i_429_] = aBoolArray2545[i_429_];
	}
	for (int i_433_ = 0; i_433_ < class244.anInt2418; i_433_++) {
	    if (!aBoolArray2545[class244.anIntArray2424[i_433_]]
		|| !aBoolArray2545[class244.anIntArray2425[i_433_]]) {
		aBoolArray2545[class244.anIntArray2424[i_433_]] = false;
		aBoolArray2545[class244.anIntArray2425[i_433_]] = false;
	    }
	}
	if (aBoolArray2547 == null || aBoolArray2547.length != anInt2479)
	    aBoolArray2547 = new boolean[anInt2479];
	for (int i_434_ = 0; i_434_ < class244.anInt2421; i_434_++) {
	    int i_435_ = 0;
	    for (int i_436_ = 0; i_436_ < anInt2479; i_436_++) {
		int i_437_ = (class244.anIntArray2419 != null
			      ? class244.anIntArray2419[i_436_] : i_434_);
		if (i_437_ == i_434_)
		    aBoolArray2547[i_435_++] = aBoolArray2545[i_436_];
	    }
	    Class253 class253
		= aClass253Array2496[class244.anIntArray2422[i_434_]];
	    Object object = null;
	    Class250[] class250s;
	    if (class253.anInt2455 == 2) {
		Class250[] class250s_438_ = method4641(1, anInt2479 * i_419_);
		for (int i_439_ = 0; i_439_ < i_419_; i_439_++) {
		    for (int i_440_ = 0; i_440_ < anInt2479; i_440_++) {
			try {
			    class250s_438_[0].aFloatArray2449
				[i_439_ * anInt2479 + i_440_]
				= (aClass250Array2504[i_440_].aFloatArray2449
				   [i_439_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class250s_438_
		    = class253.method4522(class250s_438_, i_419_ >> 1,
					  aBoolArray2547);
		class250s = aClass250Array2504;
		for (int i_441_ = 0; i_441_ < i_419_; i_441_++) {
		    for (int i_442_ = 0; i_442_ < anInt2479; i_442_++) {
			try {
			    class250s[i_442_].aFloatArray2449[i_441_]
				= (class250s_438_[0].aFloatArray2449
				   [anInt2479 * i_441_ + i_442_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method4645(class250s_438_);
		Object object_443_ = null;
	    } else
		class250s = class253.method4522(aClass250Array2504,
						i_419_ >> 1, aBoolArray2547);
	    if (class244.anIntArray2419 != null) {
		i_435_ = 0;
		for (int i_444_ = 0; i_444_ < anInt2479; i_444_++) {
		    int i_445_ = class244.anIntArray2419[i_444_];
		    if (i_445_ == i_434_)
			aClass250Array2504[i_444_] = class250s[i_435_++];
		}
	    } else {
		if (aClass250Array2504 != class250s)
		    method4645(aClass250Array2504);
		aClass250Array2504 = class250s;
	    }
	}
	for (int i_446_ = class244.anInt2418 - 1; i_446_ >= 0; i_446_--) {
	    Class250 class250
		= aClass250Array2504[class244.anIntArray2424[i_446_]];
	    Class250 class250_447_
		= aClass250Array2504[class244.anIntArray2425[i_446_]];
	    for (int i_448_ = 0; i_448_ < class250.anInt2448; i_448_++) {
		float f = class250.aFloatArray2449[i_448_];
		float f_449_ = class250_447_.aFloatArray2449[i_448_];
		float f_450_ = f;
		float f_451_ = f_449_;
		if (f > 0.0F) {
		    if (f_449_ > 0.0F) {
			f_450_ = f;
			f_451_ = f - f_449_;
		    } else {
			f_451_ = f;
			f_450_ = f + f_449_;
		    }
		} else if (f_449_ > 0.0F) {
		    f_450_ = f;
		    f_451_ = f + f_449_;
		} else {
		    f_451_ = f;
		    f_450_ = f - f_449_;
		}
		class250.aFloatArray2449[i_448_] = f_450_;
		class250_447_.aFloatArray2449[i_448_] = f_451_;
	    }
	}
	for (int i_452_ = 0; i_452_ < aBoolArray2545.length; i_452_++)
	    aBoolArray2545[i_452_] = aBoolArray2527[i_452_];
	for (int i_453_ = 0; i_453_ < anInt2479; i_453_++) {
	    if (!aBoolArray2545[i_453_]) {
		int i_454_ = (class244.anIntArray2419 != null
			      ? class244.anIntArray2419[i_453_] : 0);
		int i_455_ = i_454_;
		int i_456_ = class244.anIntArray2420[i_455_];
		aClass254Array2495[i_456_].method4544(i_453_);
		aClass254Array2495[i_456_].method4548((aClass250Array2504
						       [i_453_]),
						      i_419_ >> 1, i_453_);
	    }
	}
	for (int i_457_ = 0; i_457_ < anInt2479; i_457_++) {
	    if (aBoolArray2545[i_457_]) {
		for (int i_458_ = i_419_ >> 1; i_458_ < i_419_; i_458_++)
		    aClass250Array2504[i_457_].aFloatArray2449[i_458_] = 0.0F;
	    } else {
		int i_459_ = i_419_ >> 1;
		int i_460_ = i_419_ >> 2;
		int i_461_ = i_419_ >> 3;
		Class250 class250 = aClass250Array2504[i_457_];
		for (int i_462_ = 0; i_462_ < i_459_; i_462_++)
		    class250.aFloatArray2449[i_462_] *= 0.5F;
		for (int i_463_ = i_459_; i_463_ < i_419_; i_463_++)
		    class250.aFloatArray2449[i_463_]
			= -class250.aFloatArray2449[i_419_ - i_463_ - 1];
		Class250 class250_464_
		    = bool ? aClass250_2516 : aClass250_2526;
		Class250 class250_465_
		    = bool ? aClass250_2489 : aClass250_2506;
		Class250 class250_466_
		    = bool ? aClass250_2509 : aClass250_2507;
		int[] is_467_ = bool ? anIntArray2512 : anIntArray2511;
		for (int i_468_ = 0; i_468_ < i_460_; i_468_++) {
		    float f = (class250.aFloatArray2449[4 * i_468_]
			       - (class250.aFloatArray2449
				  [i_419_ - 4 * i_468_ - 1]));
		    float f_469_ = (class250.aFloatArray2449[4 * i_468_ + 2]
				    - (class250.aFloatArray2449
				       [i_419_ - 4 * i_468_ - 3]));
		    float f_470_ = class250_464_.aFloatArray2449[2 * i_468_];
		    float f_471_
			= class250_464_.aFloatArray2449[2 * i_468_ + 1];
		    class250.aFloatArray2449[i_419_ - 4 * i_468_ - 1]
			= f * f_470_ - f_469_ * f_471_;
		    class250.aFloatArray2449[i_419_ - 4 * i_468_ - 3]
			= f * f_471_ + f_469_ * f_470_;
		}
		for (int i_472_ = 0; i_472_ < i_461_; i_472_++) {
		    float f
			= class250.aFloatArray2449[i_459_ + 3 + 4 * i_472_];
		    float f_473_
			= class250.aFloatArray2449[i_459_ + 1 + 4 * i_472_];
		    float f_474_ = class250.aFloatArray2449[4 * i_472_ + 3];
		    float f_475_ = class250.aFloatArray2449[4 * i_472_ + 1];
		    class250.aFloatArray2449[i_459_ + 3 + 4 * i_472_]
			= f + f_474_;
		    class250.aFloatArray2449[i_459_ + 1 + 4 * i_472_]
			= f_473_ + f_475_;
		    float f_476_ = (class250_464_.aFloatArray2449
				    [i_459_ - 4 - 4 * i_472_]);
		    float f_477_ = (class250_464_.aFloatArray2449
				    [i_459_ - 3 - 4 * i_472_]);
		    class250.aFloatArray2449[4 * i_472_ + 3]
			= (f - f_474_) * f_476_ - (f_473_ - f_475_) * f_477_;
		    class250.aFloatArray2449[4 * i_472_ + 1]
			= (f_473_ - f_475_) * f_476_ + (f - f_474_) * f_477_;
		}
		int i_478_ = Class180.method3120(i_419_ - 1, (byte) -7);
		for (int i_479_ = 0; i_479_ < i_478_ - 3; i_479_++) {
		    int i_480_ = i_419_ >> i_479_ + 2;
		    int i_481_ = 8 << i_479_;
		    for (int i_482_ = 0; i_482_ < 2 << i_479_; i_482_++) {
			int i_483_ = i_419_ - i_480_ * 2 * i_482_;
			int i_484_ = i_419_ - i_480_ * (2 * i_482_ + 1);
			for (int i_485_ = 0; i_485_ < i_419_ >> i_479_ + 4;
			     i_485_++) {
			    int i_486_ = 4 * i_485_;
			    float f = (class250.aFloatArray2449
				       [i_483_ - 1 - i_486_]);
			    float f_487_ = (class250.aFloatArray2449
					    [i_483_ - 3 - i_486_]);
			    float f_488_ = (class250.aFloatArray2449
					    [i_484_ - 1 - i_486_]);
			    float f_489_ = (class250.aFloatArray2449
					    [i_484_ - 3 - i_486_]);
			    class250.aFloatArray2449[i_483_ - 1 - i_486_]
				= f + f_488_;
			    class250.aFloatArray2449[i_483_ - 3 - i_486_]
				= f_487_ + f_489_;
			    float f_490_ = (class250_464_.aFloatArray2449
					    [i_485_ * i_481_]);
			    float f_491_ = (class250_464_.aFloatArray2449
					    [i_485_ * i_481_ + 1]);
			    class250.aFloatArray2449[i_484_ - 1 - i_486_]
				= ((f - f_488_) * f_490_
				   - (f_487_ - f_489_) * f_491_);
			    class250.aFloatArray2449[i_484_ - 3 - i_486_]
				= ((f_487_ - f_489_) * f_490_
				   + (f - f_488_) * f_491_);
			}
		    }
		}
		for (int i_492_ = 1; i_492_ < i_461_ - 1; i_492_++) {
		    int i_493_ = is_467_[i_492_];
		    if (i_492_ < i_493_) {
			int i_494_ = 8 * i_492_;
			int i_495_ = 8 * i_493_;
			float f = class250.aFloatArray2449[i_494_ + 1];
			class250.aFloatArray2449[i_494_ + 1]
			    = class250.aFloatArray2449[i_495_ + 1];
			class250.aFloatArray2449[i_495_ + 1] = f;
			f = class250.aFloatArray2449[i_494_ + 3];
			class250.aFloatArray2449[i_494_ + 3]
			    = class250.aFloatArray2449[i_495_ + 3];
			class250.aFloatArray2449[i_495_ + 3] = f;
			f = class250.aFloatArray2449[i_494_ + 5];
			class250.aFloatArray2449[i_494_ + 5]
			    = class250.aFloatArray2449[i_495_ + 5];
			class250.aFloatArray2449[i_495_ + 5] = f;
			f = class250.aFloatArray2449[i_494_ + 7];
			class250.aFloatArray2449[i_494_ + 7]
			    = class250.aFloatArray2449[i_495_ + 7];
			class250.aFloatArray2449[i_495_ + 7] = f;
		    }
		}
		for (int i_496_ = 0; i_496_ < i_459_; i_496_++)
		    class250.aFloatArray2449[i_496_]
			= class250.aFloatArray2449[2 * i_496_ + 1];
		for (int i_497_ = 0; i_497_ < i_461_; i_497_++) {
		    class250.aFloatArray2449[i_419_ - 1 - 2 * i_497_]
			= class250.aFloatArray2449[4 * i_497_];
		    class250.aFloatArray2449[i_419_ - 2 - 2 * i_497_]
			= class250.aFloatArray2449[4 * i_497_ + 1];
		    class250.aFloatArray2449[i_419_ - i_460_ - 1 - 2 * i_497_]
			= class250.aFloatArray2449[4 * i_497_ + 2];
		    class250.aFloatArray2449[i_419_ - i_460_ - 2 - 2 * i_497_]
			= class250.aFloatArray2449[4 * i_497_ + 3];
		}
		for (int i_498_ = 0; i_498_ < i_461_; i_498_++) {
		    float f = class250_466_.aFloatArray2449[2 * i_498_];
		    float f_499_
			= class250_466_.aFloatArray2449[2 * i_498_ + 1];
		    float f_500_
			= class250.aFloatArray2449[i_459_ + 2 * i_498_];
		    float f_501_
			= class250.aFloatArray2449[i_459_ + 2 * i_498_ + 1];
		    float f_502_
			= class250.aFloatArray2449[i_419_ - 2 - 2 * i_498_];
		    float f_503_
			= class250.aFloatArray2449[i_419_ - 1 - 2 * i_498_];
		    float f_504_
			= f_499_ * (f_500_ - f_502_) + f * (f_501_ + f_503_);
		    class250.aFloatArray2449[i_459_ + 2 * i_498_]
			= (f_500_ + f_502_ + f_504_) * 0.5F;
		    class250.aFloatArray2449[i_419_ - 2 - 2 * i_498_]
			= (f_500_ + f_502_ - f_504_) * 0.5F;
		    f_504_
			= f_499_ * (f_501_ + f_503_) - f * (f_500_ - f_502_);
		    class250.aFloatArray2449[i_459_ + 2 * i_498_ + 1]
			= (f_501_ - f_503_ + f_504_) * 0.5F;
		    class250.aFloatArray2449[i_419_ - 1 - 2 * i_498_]
			= (-f_501_ + f_503_ + f_504_) * 0.5F;
		}
		for (int i_505_ = 0; i_505_ < i_460_; i_505_++) {
		    class250.aFloatArray2449[i_505_]
			= ((class250.aFloatArray2449[2 * i_505_ + i_459_]
			    * class250_465_.aFloatArray2449[2 * i_505_])
			   + (class250.aFloatArray2449[2 * i_505_ + 1 + i_459_]
			      * (class250_465_.aFloatArray2449
				 [2 * i_505_ + 1])));
		    class250.aFloatArray2449[i_459_ - 1 - i_505_]
			= ((class250.aFloatArray2449[2 * i_505_ + i_459_]
			    * class250_465_.aFloatArray2449[2 * i_505_ + 1])
			   - (class250.aFloatArray2449[2 * i_505_ + 1 + i_459_]
			      * class250_465_.aFloatArray2449[2 * i_505_]));
		}
		for (int i_506_ = 0; i_506_ < i_460_; i_506_++)
		    class250.aFloatArray2449[i_419_ - i_460_ + i_506_]
			= -class250.aFloatArray2449[i_506_];
		for (int i_507_ = 0; i_507_ < i_460_; i_507_++)
		    class250.aFloatArray2449[i_507_]
			= class250.aFloatArray2449[i_460_ + i_507_];
		for (int i_508_ = 0; i_508_ < i_460_; i_508_++)
		    class250.aFloatArray2449[i_460_ + i_508_]
			= -class250.aFloatArray2449[i_460_ - i_508_ - 1];
		for (int i_509_ = 0; i_509_ < i_460_; i_509_++)
		    class250.aFloatArray2449[i_459_ + i_509_]
			= class250.aFloatArray2449[i_419_ - i_509_ - 1];
		for (int i_510_ = i_423_; i_510_ < i_424_; i_510_++) {
		    float f
			= (float) Math.sin(((double) (i_510_ - i_423_) + 0.5)
					   / (double) i_425_ * 0.5
					   * 3.141592653589793);
		    aClass250Array2504[i_457_].aFloatArray2449[i_510_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_511_ = i_426_; i_511_ < i_427_; i_511_++) {
		    float f
			= (float) Math.sin((((double) (i_511_ - i_426_) + 0.5)
					    / (double) i_428_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    aClass250Array2504[i_457_].aFloatArray2449[i_511_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class250[] class250s = null;
	if (anInt2501 > 0) {
	    int i_512_ = anInt2501 + i_419_ >> 2;
	    class250s = method4641(anInt2479, i_512_);
	    for (int i_513_ = 0; i_513_ < anInt2479; i_513_++) {
		if (!aBoolArray2503[i_513_]) {
		    for (int i_514_ = 0; i_514_ < anInt2502; i_514_++) {
			int i_515_ = (anInt2501 >> 1) + i_514_;
			class250s[i_513_].aFloatArray2449[i_514_]
			    += (aClass250Array2500[i_513_].aFloatArray2449
				[i_515_]);
		    }
		}
		if (!aBoolArray2545[i_513_]) {
		    for (int i_516_ = i_423_; i_516_ < i_419_ >> 1; i_516_++) {
			int i_517_ = (class250s[i_513_].anInt2448
				      - (i_419_ >> 1) + i_516_);
			class250s[i_513_].aFloatArray2449[i_517_]
			    += (aClass250Array2504[i_513_].aFloatArray2449
				[i_516_]);
		    }
		}
	    }
	}
	Class250[] class250s_518_ = aClass250Array2500;
	aClass250Array2500 = aClass250Array2504;
	aClass250Array2504 = class250s_518_;
	anInt2501 = i_419_;
	anInt2502 = i_427_ - (i_419_ >> 1);
	aBoolArray2503 = aBoolArray2545;
	atomicreference.set(class250s);
	return true;
    }
    
    boolean method4631(byte[] is, int i, int i_519_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_519_ > is.length)
	    return false;
	method4569(is, i);
	int i_520_ = method4570();
	if (i_520_ != 0) {
	    method4574(is, i);
	    return false;
	}
	if (!method289())
	    throw new RuntimeException();
	int i_521_ = method4550(method4593(anIntArray2499.length - 1));
	boolean bool = aBoolArray2498[i_521_];
	int i_522_ = bool ? anInt2493 : anInt2478;
	boolean bool_523_ = false;
	boolean bool_524_ = false;
	if (bool) {
	    bool_523_ = method4570() != 0;
	    bool_524_ = method4570() != 0;
	}
	int i_525_ = i_522_ >> 1;
	int i_526_;
	int i_527_;
	int i_528_;
	if (bool && !bool_523_) {
	    i_526_ = (i_522_ >> 2) - (anInt2478 >> 2);
	    i_527_ = (i_522_ >> 2) + (anInt2478 >> 2);
	    i_528_ = anInt2478 >> 1;
	} else {
	    i_526_ = 0;
	    i_527_ = i_525_;
	    i_528_ = i_522_ >> 1;
	}
	int i_529_;
	int i_530_;
	int i_531_;
	if (bool && !bool_524_) {
	    i_529_ = i_522_ - (i_522_ >> 2) - (anInt2478 >> 2);
	    i_530_ = i_522_ - (i_522_ >> 2) + (anInt2478 >> 2);
	    i_531_ = anInt2478 >> 1;
	} else {
	    i_529_ = i_525_;
	    i_530_ = i_522_;
	    i_531_ = i_522_ >> 1;
	}
	Class244 class244 = aClass244Array2497[anIntArray2499[i_521_]];
	if (aBoolArray2545 == null || aBoolArray2545.length != anInt2479) {
	    aBoolArray2545 = new boolean[anInt2479];
	    aBoolArray2527 = new boolean[anInt2479];
	}
	for (int i_532_ = 0; i_532_ < anInt2479; i_532_++) {
	    int i_533_ = (class244.anIntArray2419 != null
			  ? class244.anIntArray2419[i_532_] : 0);
	    int i_534_ = i_533_;
	    int i_535_ = class244.anIntArray2420[i_534_];
	    aBoolArray2545[i_532_]
		= !aClass254Array2495[i_535_].method4532(i_532_);
	    aBoolArray2527[i_532_] = aBoolArray2545[i_532_];
	}
	for (int i_536_ = 0; i_536_ < class244.anInt2418; i_536_++) {
	    if (!aBoolArray2545[class244.anIntArray2424[i_536_]]
		|| !aBoolArray2545[class244.anIntArray2425[i_536_]]) {
		aBoolArray2545[class244.anIntArray2424[i_536_]] = false;
		aBoolArray2545[class244.anIntArray2425[i_536_]] = false;
	    }
	}
	if (aBoolArray2547 == null || aBoolArray2547.length != anInt2479)
	    aBoolArray2547 = new boolean[anInt2479];
	for (int i_537_ = 0; i_537_ < class244.anInt2421; i_537_++) {
	    int i_538_ = 0;
	    for (int i_539_ = 0; i_539_ < anInt2479; i_539_++) {
		int i_540_ = (class244.anIntArray2419 != null
			      ? class244.anIntArray2419[i_539_] : i_537_);
		if (i_540_ == i_537_)
		    aBoolArray2547[i_538_++] = aBoolArray2545[i_539_];
	    }
	    Class253 class253
		= aClass253Array2496[class244.anIntArray2422[i_537_]];
	    Object object = null;
	    Class250[] class250s;
	    if (class253.anInt2455 == 2) {
		Class250[] class250s_541_ = method4641(1, anInt2479 * i_522_);
		for (int i_542_ = 0; i_542_ < i_522_; i_542_++) {
		    for (int i_543_ = 0; i_543_ < anInt2479; i_543_++) {
			try {
			    class250s_541_[0].aFloatArray2449
				[i_542_ * anInt2479 + i_543_]
				= (aClass250Array2504[i_543_].aFloatArray2449
				   [i_542_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class250s_541_
		    = class253.method4522(class250s_541_, i_522_ >> 1,
					  aBoolArray2547);
		class250s = aClass250Array2504;
		for (int i_544_ = 0; i_544_ < i_522_; i_544_++) {
		    for (int i_545_ = 0; i_545_ < anInt2479; i_545_++) {
			try {
			    class250s[i_545_].aFloatArray2449[i_544_]
				= (class250s_541_[0].aFloatArray2449
				   [anInt2479 * i_544_ + i_545_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method4645(class250s_541_);
		Object object_546_ = null;
	    } else
		class250s = class253.method4522(aClass250Array2504,
						i_522_ >> 1, aBoolArray2547);
	    if (class244.anIntArray2419 != null) {
		i_538_ = 0;
		for (int i_547_ = 0; i_547_ < anInt2479; i_547_++) {
		    int i_548_ = class244.anIntArray2419[i_547_];
		    if (i_548_ == i_537_)
			aClass250Array2504[i_547_] = class250s[i_538_++];
		}
	    } else {
		if (aClass250Array2504 != class250s)
		    method4645(aClass250Array2504);
		aClass250Array2504 = class250s;
	    }
	}
	for (int i_549_ = class244.anInt2418 - 1; i_549_ >= 0; i_549_--) {
	    Class250 class250
		= aClass250Array2504[class244.anIntArray2424[i_549_]];
	    Class250 class250_550_
		= aClass250Array2504[class244.anIntArray2425[i_549_]];
	    for (int i_551_ = 0; i_551_ < class250.anInt2448; i_551_++) {
		float f = class250.aFloatArray2449[i_551_];
		float f_552_ = class250_550_.aFloatArray2449[i_551_];
		float f_553_ = f;
		float f_554_ = f_552_;
		if (f > 0.0F) {
		    if (f_552_ > 0.0F) {
			f_553_ = f;
			f_554_ = f - f_552_;
		    } else {
			f_554_ = f;
			f_553_ = f + f_552_;
		    }
		} else if (f_552_ > 0.0F) {
		    f_553_ = f;
		    f_554_ = f + f_552_;
		} else {
		    f_554_ = f;
		    f_553_ = f - f_552_;
		}
		class250.aFloatArray2449[i_551_] = f_553_;
		class250_550_.aFloatArray2449[i_551_] = f_554_;
	    }
	}
	for (int i_555_ = 0; i_555_ < aBoolArray2545.length; i_555_++)
	    aBoolArray2545[i_555_] = aBoolArray2527[i_555_];
	for (int i_556_ = 0; i_556_ < anInt2479; i_556_++) {
	    if (!aBoolArray2545[i_556_]) {
		int i_557_ = (class244.anIntArray2419 != null
			      ? class244.anIntArray2419[i_556_] : 0);
		int i_558_ = i_557_;
		int i_559_ = class244.anIntArray2420[i_558_];
		aClass254Array2495[i_559_].method4544(i_556_);
		aClass254Array2495[i_559_].method4548((aClass250Array2504
						       [i_556_]),
						      i_522_ >> 1, i_556_);
	    }
	}
	for (int i_560_ = 0; i_560_ < anInt2479; i_560_++) {
	    if (aBoolArray2545[i_560_]) {
		for (int i_561_ = i_522_ >> 1; i_561_ < i_522_; i_561_++)
		    aClass250Array2504[i_560_].aFloatArray2449[i_561_] = 0.0F;
	    } else {
		int i_562_ = i_522_ >> 1;
		int i_563_ = i_522_ >> 2;
		int i_564_ = i_522_ >> 3;
		Class250 class250 = aClass250Array2504[i_560_];
		for (int i_565_ = 0; i_565_ < i_562_; i_565_++)
		    class250.aFloatArray2449[i_565_] *= 0.5F;
		for (int i_566_ = i_562_; i_566_ < i_522_; i_566_++)
		    class250.aFloatArray2449[i_566_]
			= -class250.aFloatArray2449[i_522_ - i_566_ - 1];
		Class250 class250_567_
		    = bool ? aClass250_2516 : aClass250_2526;
		Class250 class250_568_
		    = bool ? aClass250_2489 : aClass250_2506;
		Class250 class250_569_
		    = bool ? aClass250_2509 : aClass250_2507;
		int[] is_570_ = bool ? anIntArray2512 : anIntArray2511;
		for (int i_571_ = 0; i_571_ < i_563_; i_571_++) {
		    float f = (class250.aFloatArray2449[4 * i_571_]
			       - (class250.aFloatArray2449
				  [i_522_ - 4 * i_571_ - 1]));
		    float f_572_ = (class250.aFloatArray2449[4 * i_571_ + 2]
				    - (class250.aFloatArray2449
				       [i_522_ - 4 * i_571_ - 3]));
		    float f_573_ = class250_567_.aFloatArray2449[2 * i_571_];
		    float f_574_
			= class250_567_.aFloatArray2449[2 * i_571_ + 1];
		    class250.aFloatArray2449[i_522_ - 4 * i_571_ - 1]
			= f * f_573_ - f_572_ * f_574_;
		    class250.aFloatArray2449[i_522_ - 4 * i_571_ - 3]
			= f * f_574_ + f_572_ * f_573_;
		}
		for (int i_575_ = 0; i_575_ < i_564_; i_575_++) {
		    float f
			= class250.aFloatArray2449[i_562_ + 3 + 4 * i_575_];
		    float f_576_
			= class250.aFloatArray2449[i_562_ + 1 + 4 * i_575_];
		    float f_577_ = class250.aFloatArray2449[4 * i_575_ + 3];
		    float f_578_ = class250.aFloatArray2449[4 * i_575_ + 1];
		    class250.aFloatArray2449[i_562_ + 3 + 4 * i_575_]
			= f + f_577_;
		    class250.aFloatArray2449[i_562_ + 1 + 4 * i_575_]
			= f_576_ + f_578_;
		    float f_579_ = (class250_567_.aFloatArray2449
				    [i_562_ - 4 - 4 * i_575_]);
		    float f_580_ = (class250_567_.aFloatArray2449
				    [i_562_ - 3 - 4 * i_575_]);
		    class250.aFloatArray2449[4 * i_575_ + 3]
			= (f - f_577_) * f_579_ - (f_576_ - f_578_) * f_580_;
		    class250.aFloatArray2449[4 * i_575_ + 1]
			= (f_576_ - f_578_) * f_579_ + (f - f_577_) * f_580_;
		}
		int i_581_ = Class180.method3120(i_522_ - 1, (byte) 26);
		for (int i_582_ = 0; i_582_ < i_581_ - 3; i_582_++) {
		    int i_583_ = i_522_ >> i_582_ + 2;
		    int i_584_ = 8 << i_582_;
		    for (int i_585_ = 0; i_585_ < 2 << i_582_; i_585_++) {
			int i_586_ = i_522_ - i_583_ * 2 * i_585_;
			int i_587_ = i_522_ - i_583_ * (2 * i_585_ + 1);
			for (int i_588_ = 0; i_588_ < i_522_ >> i_582_ + 4;
			     i_588_++) {
			    int i_589_ = 4 * i_588_;
			    float f = (class250.aFloatArray2449
				       [i_586_ - 1 - i_589_]);
			    float f_590_ = (class250.aFloatArray2449
					    [i_586_ - 3 - i_589_]);
			    float f_591_ = (class250.aFloatArray2449
					    [i_587_ - 1 - i_589_]);
			    float f_592_ = (class250.aFloatArray2449
					    [i_587_ - 3 - i_589_]);
			    class250.aFloatArray2449[i_586_ - 1 - i_589_]
				= f + f_591_;
			    class250.aFloatArray2449[i_586_ - 3 - i_589_]
				= f_590_ + f_592_;
			    float f_593_ = (class250_567_.aFloatArray2449
					    [i_588_ * i_584_]);
			    float f_594_ = (class250_567_.aFloatArray2449
					    [i_588_ * i_584_ + 1]);
			    class250.aFloatArray2449[i_587_ - 1 - i_589_]
				= ((f - f_591_) * f_593_
				   - (f_590_ - f_592_) * f_594_);
			    class250.aFloatArray2449[i_587_ - 3 - i_589_]
				= ((f_590_ - f_592_) * f_593_
				   + (f - f_591_) * f_594_);
			}
		    }
		}
		for (int i_595_ = 1; i_595_ < i_564_ - 1; i_595_++) {
		    int i_596_ = is_570_[i_595_];
		    if (i_595_ < i_596_) {
			int i_597_ = 8 * i_595_;
			int i_598_ = 8 * i_596_;
			float f = class250.aFloatArray2449[i_597_ + 1];
			class250.aFloatArray2449[i_597_ + 1]
			    = class250.aFloatArray2449[i_598_ + 1];
			class250.aFloatArray2449[i_598_ + 1] = f;
			f = class250.aFloatArray2449[i_597_ + 3];
			class250.aFloatArray2449[i_597_ + 3]
			    = class250.aFloatArray2449[i_598_ + 3];
			class250.aFloatArray2449[i_598_ + 3] = f;
			f = class250.aFloatArray2449[i_597_ + 5];
			class250.aFloatArray2449[i_597_ + 5]
			    = class250.aFloatArray2449[i_598_ + 5];
			class250.aFloatArray2449[i_598_ + 5] = f;
			f = class250.aFloatArray2449[i_597_ + 7];
			class250.aFloatArray2449[i_597_ + 7]
			    = class250.aFloatArray2449[i_598_ + 7];
			class250.aFloatArray2449[i_598_ + 7] = f;
		    }
		}
		for (int i_599_ = 0; i_599_ < i_562_; i_599_++)
		    class250.aFloatArray2449[i_599_]
			= class250.aFloatArray2449[2 * i_599_ + 1];
		for (int i_600_ = 0; i_600_ < i_564_; i_600_++) {
		    class250.aFloatArray2449[i_522_ - 1 - 2 * i_600_]
			= class250.aFloatArray2449[4 * i_600_];
		    class250.aFloatArray2449[i_522_ - 2 - 2 * i_600_]
			= class250.aFloatArray2449[4 * i_600_ + 1];
		    class250.aFloatArray2449[i_522_ - i_563_ - 1 - 2 * i_600_]
			= class250.aFloatArray2449[4 * i_600_ + 2];
		    class250.aFloatArray2449[i_522_ - i_563_ - 2 - 2 * i_600_]
			= class250.aFloatArray2449[4 * i_600_ + 3];
		}
		for (int i_601_ = 0; i_601_ < i_564_; i_601_++) {
		    float f = class250_569_.aFloatArray2449[2 * i_601_];
		    float f_602_
			= class250_569_.aFloatArray2449[2 * i_601_ + 1];
		    float f_603_
			= class250.aFloatArray2449[i_562_ + 2 * i_601_];
		    float f_604_
			= class250.aFloatArray2449[i_562_ + 2 * i_601_ + 1];
		    float f_605_
			= class250.aFloatArray2449[i_522_ - 2 - 2 * i_601_];
		    float f_606_
			= class250.aFloatArray2449[i_522_ - 1 - 2 * i_601_];
		    float f_607_
			= f_602_ * (f_603_ - f_605_) + f * (f_604_ + f_606_);
		    class250.aFloatArray2449[i_562_ + 2 * i_601_]
			= (f_603_ + f_605_ + f_607_) * 0.5F;
		    class250.aFloatArray2449[i_522_ - 2 - 2 * i_601_]
			= (f_603_ + f_605_ - f_607_) * 0.5F;
		    f_607_
			= f_602_ * (f_604_ + f_606_) - f * (f_603_ - f_605_);
		    class250.aFloatArray2449[i_562_ + 2 * i_601_ + 1]
			= (f_604_ - f_606_ + f_607_) * 0.5F;
		    class250.aFloatArray2449[i_522_ - 1 - 2 * i_601_]
			= (-f_604_ + f_606_ + f_607_) * 0.5F;
		}
		for (int i_608_ = 0; i_608_ < i_563_; i_608_++) {
		    class250.aFloatArray2449[i_608_]
			= ((class250.aFloatArray2449[2 * i_608_ + i_562_]
			    * class250_568_.aFloatArray2449[2 * i_608_])
			   + (class250.aFloatArray2449[2 * i_608_ + 1 + i_562_]
			      * (class250_568_.aFloatArray2449
				 [2 * i_608_ + 1])));
		    class250.aFloatArray2449[i_562_ - 1 - i_608_]
			= ((class250.aFloatArray2449[2 * i_608_ + i_562_]
			    * class250_568_.aFloatArray2449[2 * i_608_ + 1])
			   - (class250.aFloatArray2449[2 * i_608_ + 1 + i_562_]
			      * class250_568_.aFloatArray2449[2 * i_608_]));
		}
		for (int i_609_ = 0; i_609_ < i_563_; i_609_++)
		    class250.aFloatArray2449[i_522_ - i_563_ + i_609_]
			= -class250.aFloatArray2449[i_609_];
		for (int i_610_ = 0; i_610_ < i_563_; i_610_++)
		    class250.aFloatArray2449[i_610_]
			= class250.aFloatArray2449[i_563_ + i_610_];
		for (int i_611_ = 0; i_611_ < i_563_; i_611_++)
		    class250.aFloatArray2449[i_563_ + i_611_]
			= -class250.aFloatArray2449[i_563_ - i_611_ - 1];
		for (int i_612_ = 0; i_612_ < i_563_; i_612_++)
		    class250.aFloatArray2449[i_562_ + i_612_]
			= class250.aFloatArray2449[i_522_ - i_612_ - 1];
		for (int i_613_ = i_526_; i_613_ < i_527_; i_613_++) {
		    float f
			= (float) Math.sin(((double) (i_613_ - i_526_) + 0.5)
					   / (double) i_528_ * 0.5
					   * 3.141592653589793);
		    aClass250Array2504[i_560_].aFloatArray2449[i_613_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_614_ = i_529_; i_614_ < i_530_; i_614_++) {
		    float f
			= (float) Math.sin((((double) (i_614_ - i_529_) + 0.5)
					    / (double) i_531_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    aClass250Array2504[i_560_].aFloatArray2449[i_614_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class250[] class250s = null;
	if (anInt2501 > 0) {
	    int i_615_ = anInt2501 + i_522_ >> 2;
	    class250s = method4641(anInt2479, i_615_);
	    for (int i_616_ = 0; i_616_ < anInt2479; i_616_++) {
		if (!aBoolArray2503[i_616_]) {
		    for (int i_617_ = 0; i_617_ < anInt2502; i_617_++) {
			int i_618_ = (anInt2501 >> 1) + i_617_;
			class250s[i_616_].aFloatArray2449[i_617_]
			    += (aClass250Array2500[i_616_].aFloatArray2449
				[i_618_]);
		    }
		}
		if (!aBoolArray2545[i_616_]) {
		    for (int i_619_ = i_526_; i_619_ < i_522_ >> 1; i_619_++) {
			int i_620_ = (class250s[i_616_].anInt2448
				      - (i_522_ >> 1) + i_619_);
			class250s[i_616_].aFloatArray2449[i_620_]
			    += (aClass250Array2504[i_616_].aFloatArray2449
				[i_619_]);
		    }
		}
	    }
	}
	Class250[] class250s_621_ = aClass250Array2500;
	aClass250Array2500 = aClass250Array2504;
	aClass250Array2504 = class250s_621_;
	anInt2501 = i_522_;
	anInt2502 = i_530_ - (i_522_ >> 1);
	aBoolArray2503 = aBoolArray2545;
	atomicreference.set(class250s);
	return true;
    }
    
    public void method314(int i, Class397 class397, Class391 class391,
			  int i_622_) {
	anInt2543 = i_622_;
	if (method4586(i, class397, class391)) {
	    aClass397_2492 = class397;
	    aClass391_2487 = class391;
	} else
	    throw new RuntimeException("");
    }
    
    void method4632() {
	if (method281() != Class376.aClass376_3898
	    && method281() != Class376.aClass376_3899
	    && (!aBool2521
		|| !((float) (anInt2539 / method4554()) > aFloat2491))) {
	    if (!method4563()) {
		RSBuffer class525_sub38
		    = ((RSBuffer)
		       (aList2484 != null && !aList2484.isEmpty()
			? aList2484.get(0) : null));
		if (class525_sub38 == null) {
		    if (!aBool2515) {
			method4552(Class376.aClass376_3899);
			anInterface46_2510.method211(-1368302210);
			aBool2515 = true;
		    }
		    return;
		}
		aBool2515 = false;
		aBool2513 = true;
		aList2484.remove(0);
		method4562(class525_sub38);
	    }
	    method4647();
	}
    }
    
    float method4633(int i) {
	int i_623_ = i & 0x1fffff;
	int i_624_ = i & ~0x7fffffff;
	int i_625_ = (i & 0x7fe00000) >> 21;
	if (i_624_ != 0)
	    i_623_ = -i_623_;
	return (float) ((double) i_623_
			* Math.pow(2.0, (double) (i_625_ - 788)));
    }
    
    synchronized void method4634(boolean bool) {
	if (!bool) {
	    anInt2478 = 0;
	    anInt2493 = 0;
	    aBoolArray2498 = null;
	    anIntArray2499 = null;
	    method4645(aClass250Array2537);
	    aClass250Array2537 = null;
	    method4645(aClass250Array2500);
	    aClass250Array2500 = null;
	    anInt2501 = 0;
	    anInt2502 = 0;
	    aBoolArray2503 = null;
	    method4645(aClass250Array2504);
	    aClass250Array2504 = null;
	    method4625(aClass250_2526);
	    method4625(aClass250_2506);
	    method4625(aClass250_2507);
	    method4625(aClass250_2516);
	    method4625(aClass250_2489);
	    method4625(aClass250_2509);
	    aClass250_2526 = null;
	    aClass250_2506 = null;
	    aClass250_2507 = null;
	    aClass250_2516 = null;
	    aClass250_2489 = null;
	    aClass250_2509 = null;
	    anIntArray2511 = null;
	    anIntArray2512 = null;
	}
	anInt2532 = 0;
	Iterator iterator = aList2514.iterator();
	while (iterator.hasNext()) {
	    RSBuffer class525_sub38 = (RSBuffer) iterator.next();
	    class525_sub38.method16627(-1391416506);
	}
	aList2514.clear();
	aBool2513 = false;
	if (aClass525_Sub38_2488 != null) {
	    synchronized (aClass525_Sub38_2488) {
		aClass525_Sub38_2488.method16627(-704726551);
		aClass525_Sub38_2488 = null;
	    }
	}
	anInt2533 = 0;
	anInt2517 = 0;
	if (!bool) {
	    synchronized (aList2518) {
		Iterator iterator_626_ = aList2518.iterator();
		while (iterator_626_.hasNext()) {
		    RSBuffer class525_sub38
			= (RSBuffer) iterator_626_.next();
		    class525_sub38.method16627(-1245177964);
		}
		aList2518.clear();
	    }
	    anInt2539 = 0;
	}
	synchronized (aList2484) {
	    Iterator iterator_627_ = aList2484.iterator();
	    while (iterator_627_.hasNext()) {
		RSBuffer class525_sub38
		    = (RSBuffer) iterator_627_.next();
		class525_sub38.method16627(-395154294);
	    }
	    aList2484.clear();
	}
	aBool2515 = false;
	anInt2522 = 0;
	anInt2525 = -1;
	anInt2546 = -1;
	if (!bool) {
	    method4557(false);
	    aBool2520 = false;
	    anInt2538 = -1;
	    anInt2490 = -1;
	    anInt2508 = 0;
	    anInt2519 = 0;
	    anInt2523 = -1;
	    anInt2524 = -1;
	    anInt2540 = -1;
	    anInt2528 = -1;
	    aBool2529 = false;
	    aBool2483 = false;
	} else {
	    anInt2519++;
	    aBool2529 = true;
	}
    }
    
    RSBuffer method4635(int i) {
	return new RSBuffer(i, true);
    }
    
    synchronized void method4636() {
	int i = (aClass525_Sub38_2488 != null
		 ? aClass525_Sub38_2488.index * -1133521593 : 0);
	int i_628_ = 0;
	Iterator iterator = aList2514.iterator();
	while (iterator.hasNext()) {
	    RSBuffer class525_sub38 = (RSBuffer) iterator.next();
	    i_628_ += class525_sub38.index * -1133521593;
	}
	if (aClass525_Sub38_2488 != null) {
	    if ((aClass525_Sub38_2488.buffer.length
		 - aClass525_Sub38_2488.index * -1133521593)
		< i_628_) {
		RSBuffer class525_sub38 = method4635(i_628_ + anInt2533);
		class525_sub38.method16614((aClass525_Sub38_2488
					    .buffer),
					   (aClass525_Sub38_2488.index
					    * -1133521593) - anInt2517,
					   anInt2533, -550759186);
		aClass525_Sub38_2488.method16627(370263577);
		aClass525_Sub38_2488 = class525_sub38;
		i = anInt2517;
	    }
	} else {
	    aClass525_Sub38_2488 = method4635(i_628_);
	    anInt2533 = 0;
	    i = 0;
	}
	iterator = aList2514.iterator();
	while (iterator.hasNext()) {
	    RSBuffer class525_sub38 = (RSBuffer) iterator.next();
	    aClass525_Sub38_2488.method16614(class525_sub38.buffer, 0,
					     (class525_sub38.index
					      * -1133521593),
					     -12073188);
	    anInt2533 += class525_sub38.index * -1133521593;
	    class525_sub38.method16627(1257106828);
	}
	aClass525_Sub38_2488.index = (i - anInt2517) * 339428471;
	anInt2517 = 0;
	aList2514.clear();
	while (aBool2513) {
	    if (aClass525_Sub38_2488.index * -1133521593
		>= aClass525_Sub38_2488.buffer.length) {
		aBool2513 = false;
		break;
	    }
	    if (aBool2521 && (float) (anInt2539 / method4554()) > aFloat2491)
		break;
	    if (aClass525_Sub38_2488 == null || anInt2533 < 27) {
		if (aClass525_Sub38_2488 != null) {
		    anInt2517 = anInt2533;
		    aClass525_Sub38_2488.index += anInt2533 * 339428471;
		}
		aBool2513 = false;
		break;
	    }
	    int i_629_ = aClass525_Sub38_2488.index * -1133521593;
	    int i_630_ = 0;
	    int i_631_ = 0;
	    if (!method4564(aClass525_Sub38_2488))
		break;
	    anInt2546++;
	    if (anInt2528 < 0)
		anInt2540++;
	    aList2505.clear();
	    aList2535.clear();
	    aClass525_Sub38_2488.readUnsignedByte(1688407220);
	    int i_632_ = aClass525_Sub38_2488.readUnsignedByte(676436998);
	    int i_633_
		= (aClass525_Sub38_2488.readUnsignedByte(715565111) & 0xff
		   | (aClass525_Sub38_2488.readUnsignedByte(425417770) & 0xff) << 8
		   | (aClass525_Sub38_2488.readUnsignedByte(182517124) & 0xff) << 16
		   | aClass525_Sub38_2488.readUnsignedByte(1493861857) << 24);
	    i_630_ = i_633_ - i_630_;
	    aClass525_Sub38_2488.index += 1135888240;
	    int i_634_ = aClass525_Sub38_2488.readUnsignedByte(793149575);
	    int i_635_ = aClass525_Sub38_2488.index * -1133521593;
	    int i_636_ = i_635_ + i_634_;
	    if (i_636_ > i_629_ + anInt2533) {
		aClass525_Sub38_2488.index
		    = (i_629_ + anInt2533) * 339428471;
		anInt2517
		    = aClass525_Sub38_2488.index * -1133521593 - i_629_;
		aBool2513 = false;
	    }
	    int i_637_ = i_636_;
	    int i_638_ = 0;
	    if (aBool2513) {
		for (int i_639_ = 0; i_639_ < i_634_; i_639_++) {
		    int i_640_
			= (aClass525_Sub38_2488.buffer[i_635_++]
			   & 0xff);
		    i_636_ += i_640_;
		    i_638_ += i_640_;
		    if (i_636_ > i_629_ + anInt2533) {
			aClass525_Sub38_2488.index
			    = (i_629_ + anInt2533) * 339428471;
			anInt2517
			    = (aClass525_Sub38_2488.index * -1133521593
			       - i_629_);
			aBool2513 = false;
			break;
		    }
		    if (i_640_ < 255) {
			aList2505.add(Integer.valueOf(i_637_));
			aList2535.add(Integer.valueOf(i_638_));
			i_637_ = i_636_;
			i_638_ = 0;
		    }
		}
	    }
	    if (aBool2513) {
		int i_641_ = i_636_;
		int i_642_ = -1;
		Iterator iterator_643_ = aList2505.iterator();
		Iterator iterator_644_ = aList2535.iterator();
		boolean bool = false;
		anInt2536 = 0;
		while (iterator_643_.hasNext()) {
		    Integer integer = (Integer) iterator_643_.next();
		    Integer integer_645_ = (Integer) iterator_644_.next();
		    i_642_++;
		    if (method289() && aBool2529 == true
			&& anInt2546 < anInt2540 && i_642_ < anInt2528) {
			Class255 class255_646_ = this;
			class255_646_.anInt2522
			    = class255_646_.anInt2522 + (bool ? 0 : i_630_);
			bool = true;
		    } else {
			anAtomicReference2534.set(null);
			boolean bool_647_
			    = method4576(aClass525_Sub38_2488.buffer,
					 integer.intValue(),
					 integer_645_.intValue(),
					 anAtomicReference2534);
			Class250[] class250s
			    = (Class250[]) anAtomicReference2534.get();
			if (bool_647_
			    && (aBool2529 != true || anInt2546 >= anInt2540
				|| i_642_ >= anInt2528)) {
			    if (class250s != null) {
				int i_648_ = class250s[0].anInt2448;
				anInt2532 += i_648_;
				if (anInt2532 > i_633_ && i_632_ == 4) {
				    anInt2536 = anInt2532 - i_633_ - anInt2536;
				    i_648_ -= anInt2536;
				    if (anInt2536 > class250s[0].anInt2448)
					anInt2536 = class250s[0].anInt2448;
				    if (i_648_ < 0)
					i_648_ = 0;
				}
				int i_649_ = 0;
				int i_650_
				    = method283(i_648_) * class250s.length;
				if (aBool2529 == true
				    && anInt2522 < anInt2538) {
				    int i_651_ = i_650_;
				    i_650_ -= method283(anInt2538 - anInt2522);
				    if (i_650_ <= 0) {
					anInt2522 += method190(i_651_);
					method4645(class250s);
					Object object = null;
					continue;
				    }
				    i_649_ += anInt2538 - anInt2522;
				}
				if (anInt2522 + i_648_ > anInt2490
				    && (anInt2519 < anInt2508 || anInt2508 < 0)
				    && aBool2483) {
				    i_650_ -= method283(anInt2522 + i_648_
							- anInt2490 - 1);
				    if (i_650_ <= 0) {
					method4645(class250s);
					Object object = null;
					continue;
				    }
				}
				int i_652_ = method224();
				if (method4556() < method224()) {
				    int i_653_ = method224() - method4556();
				    i_650_ += i_650_ / method4556() * i_653_;
				}
				RSBuffer class525_sub38
				    = method4635(i_650_);
				for (int i_654_ = i_649_; i_654_ < i_648_;
				     i_654_++) {
				    boolean bool_655_ = aBool2529;
				    if (anInt2508 != 0) {
					if (anInt2522 == anInt2538) {
					    if (anInt2523 < 0) {
						anInt2523 = anInt2525;
						anInt2528 = i_642_;
					    }
					    aBool2529 = false;
					}
					if (anInt2522 == anInt2490
					    && anInt2524 < 0)
					    anInt2524 = anInt2525;
					if (anInt2522 > anInt2490
					    && (anInt2519 < anInt2508
						|| anInt2508 < 0)
					    && aBool2483)
					    bool_655_ = true;
				    }
				    if (bool_655_
					&& (anInt2522 < anInt2538
					    || anInt2522 > anInt2490)) {
					anInt2522++;
					if (++i_631_ > i_630_)
					    throw new RuntimeException();
				    } else {
					for (int i_656_ = 0; i_656_ < i_652_;
					     i_656_++) {
					    float f;
					    if (i_656_ < class250s.length)
						f = (class250s[i_656_]
						     .aFloatArray2449[i_654_]);
					    else
						f = (class250s
						     [i_656_ % method4556()]
						     .aFloatArray2449[i_654_]);
					    if (aClass397_2492
						== Class397.aClass397_4112) {
						int i_657_ = method4578(f);
						if (aClass391_2487
						    == Class391.aClass391_4070)
						    class525_sub38.method16840
							(i_657_, 241387851);
						else
						    class525_sub38.method16602
							(i_657_, 973371685);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4108)) {
						int i_658_ = method4579(f);
						if (aClass391_2487
						    == Class391.aClass391_4070)
						    class525_sub38.method16840
							(i_658_, 241387851);
						else
						    class525_sub38.method16602
							(i_658_, 800051405);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4109)) {
						int i_659_ = method4621(f);
						class525_sub38.method16735
						    (i_659_, -767637338);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4111)) {
						int i_660_ = method4581(f);
						class525_sub38.method16735
						    (i_660_, -878321759);
					    }
					}
					anInt2522++;
					i_631_++;
				    }
				}
				synchronized (aList2518) {
				    anInt2539
					+= (method190(class525_sub38.index
						      * -1133521593)
					    / method224());
				    aList2518.add(class525_sub38);
				}
			    }
			} else if (method289()) {
			    anInt2501 = 0;
			    if (aClass250Array2500 == null
				|| (aClass250Array2500 != null
				    && (aClass250Array2500.length != anInt2479
					|| (aClass250Array2500[0].anInt2448
					    != anInt2493)))) {
				if (aClass250Array2500 != null)
				    method4645(aClass250Array2500);
				aClass250Array2500
				    = method4641(anInt2479, anInt2493);
			    }
			}
			method4645(class250s);
			Object object = null;
		    }
		}
		aClass525_Sub38_2488.index = i_641_ * 339428471;
		anInt2533 -= i_641_ - i_629_;
	    }
	}
    }
    
    void method4637() {
	if (method281() != Class376.aClass376_3902) {
	    method4577();
	    if (method281() == Class376.aClass376_3896)
		method4552(Class376.aClass376_3897);
	}
    }
    
    int method4638(float f) {
	int i = (int) (f * 32767.0F);
	if (i > 32767)
	    return 32767;
	if (i < -32768)
	    return -32768;
	return i;
    }
    
    int method4639(float f) {
	int i = (int) (f * 32767.0F + 32768.0F);
	if (i > 65535)
	    return 65535;
	if (i < 0)
	    return 0;
	return i;
    }
    
    void method4640(byte[] is, int i) {
	aByteArray2542 = is;
	anInt2531 = i;
	anInt2530 = 0;
    }
    
    Class250[] method4641(int i, int i_661_) {
	Class250[] class250s = new Class250[i];
	for (int i_662_ = 0; i_662_ < class250s.length; i_662_++)
	    class250s[i_662_] = method4559(i_661_);
	return class250s;
    }
    
    int method4642(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    int method4643(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    RSBuffer method4644(int i) {
	return new RSBuffer(i, true);
    }
    
    public void method294(Interface46 interface46) {
	anInterface46_2510 = interface46;
    }
    
    void method4645(Class250[] class250s) {
	if (class250s != null) {
	    for (int i = 0; i < class250s.length; i++)
		method4625(class250s[i]);
	}
    }
    
    void method4646(byte[] is, int i) {
	anInt2532 = 0;
	if (!method289()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_663_ = 0;
	    if (method4565(is, i, 1))
		i_663_ = 1;
	    else if (method4565(is, i, 3))
		i_663_ = 3;
	    else if (method4565(is, i, 5))
		i_663_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_663_).toString());
	    if (i_663_ == 1) {
		method4569(is, i + 7);
		int i_664_ = method4550(32);
		anInt2479 = method4550(8);
		anInt2486 = method4550(32);
		anInt2480 = method4550(32);
		anInt2481 = method4550(32);
		anInt2482 = method4550(32);
		anInt2478 = 1 << method4550(4);
		anInt2493 = 1 << method4550(4);
		int i_665_ = 1 << method4550(1);
		if (i_664_ != 0 || i_665_ == 0)
		    throw new RuntimeException("");
		aBool2520 = true;
		anInt2525++;
	    } else if (i_663_ != 3 && i_663_ == 5) {
		if (!method4565(is, i, 5))
		    throw new RuntimeException("");
		method4569(is, i + 7);
		if (aClass250Array2504 != null) {
		    method4645(aClass250Array2504);
		    aClass250Array2504 = null;
		}
		aClass250Array2504 = method4641(anInt2479, anInt2493);
		for (int i_666_ = 0; i_666_ < 2; i_666_++) {
		    int i_667_ = i_666_ != 0 ? anInt2493 : anInt2478;
		    int i_668_ = i_667_ >> 1;
		    int i_669_ = i_667_ >> 2;
		    int i_670_ = i_667_ >> 3;
		    Class250 class250 = method4559(i_668_);
		    for (int i_671_ = 0; i_671_ < i_669_; i_671_++) {
			class250.aFloatArray2449[2 * i_671_]
			    = (float) Math.cos((double) (4 * i_671_)
					       * 3.141592653589793
					       / (double) i_667_);
			class250.aFloatArray2449[2 * i_671_ + 1]
			    = -(float) Math.sin((double) (4 * i_671_)
						* 3.141592653589793
						/ (double) i_667_);
		    }
		    Class250 class250_672_ = method4559(i_668_);
		    for (int i_673_ = 0; i_673_ < i_669_; i_673_++) {
			class250_672_.aFloatArray2449[2 * i_673_]
			    = (float) Math.cos((double) (2 * i_673_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_667_));
			class250_672_.aFloatArray2449[2 * i_673_ + 1]
			    = (float) Math.sin((double) (2 * i_673_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_667_));
		    }
		    Class250 class250_674_ = method4559(i_669_);
		    for (int i_675_ = 0; i_675_ < i_670_; i_675_++) {
			class250_674_.aFloatArray2449[2 * i_675_]
			    = (float) Math.cos((double) (4 * i_675_ + 2)
					       * 3.141592653589793
					       / (double) i_667_);
			class250_674_.aFloatArray2449[2 * i_675_ + 1]
			    = -(float) Math.sin((double) (4 * i_675_ + 2)
						* 3.141592653589793
						/ (double) i_667_);
		    }
		    int[] is_676_ = new int[i_670_];
		    int i_677_ = Class180.method3120(i_670_ - 1, (byte) -8);
		    for (int i_678_ = 0; i_678_ < i_670_; i_678_++)
			is_676_[i_678_]
			    = Class320.method5715(i_678_, i_677_, 671172182);
		    if (i_666_ != 0) {
			aClass250_2516 = class250;
			aClass250_2489 = class250_672_;
			aClass250_2509 = class250_674_;
			anIntArray2512 = is_676_;
		    } else {
			aClass250_2526 = class250;
			aClass250_2506 = class250_672_;
			aClass250_2507 = class250_674_;
			anIntArray2511 = is_676_;
		    }
		}
		method4573();
		int i_679_ = method4550(6) + 1;
		for (int i_680_ = 0; i_680_ < i_679_; i_680_++)
		    method4550(16);
		i_679_ = method4550(6) + 1;
		if (aClass254Array2495 == null
		    || aClass254Array2495.length != i_679_)
		    aClass254Array2495 = new Class254[i_679_];
		for (int i_681_ = 0; i_681_ < i_679_; i_681_++) {
		    if (aClass254Array2495[i_681_] == null)
			aClass254Array2495[i_681_] = new Class254();
		    aClass254Array2495[i_681_].method4528(this, anInt2479);
		}
		int i_682_ = method4550(6) + 1;
		if (aClass253Array2496 == null
		    || aClass253Array2496.length != i_682_)
		    aClass253Array2496 = new Class253[i_682_];
		for (int i_683_ = 0; i_683_ < i_682_; i_683_++) {
		    if (aClass253Array2496[i_683_] == null)
			aClass253Array2496[i_683_] = new Class253();
		    aClass253Array2496[i_683_].method4520(this);
		}
		int i_684_ = method4550(6) + 1;
		if (aClass244Array2497 == null
		    || aClass244Array2497.length != i_684_)
		    aClass244Array2497 = new Class244[i_684_];
		for (int i_685_ = 0; i_685_ < i_684_; i_685_++) {
		    if (aClass244Array2497[i_685_] == null)
			aClass244Array2497[i_685_] = new Class244();
		    aClass244Array2497[i_685_].method4462(this);
		}
		int i_686_ = method4550(6) + 1;
		aBoolArray2498 = new boolean[i_686_];
		anIntArray2499 = new int[i_686_];
		for (int i_687_ = 0; i_687_ < i_686_; i_687_++) {
		    aBoolArray2498[i_687_] = method4570() != 0;
		    method4550(16);
		    method4550(16);
		    anIntArray2499[i_687_] = method4550(8);
		}
		method4557(true);
	    }
	}
    }
    
    public void method312(boolean bool, int i, int i_688_, int i_689_) {
	aBool2483 = bool;
	anInt2508 = i;
	anInt2538 = i_688_;
	anInt2490 = i_689_;
    }
    
    public Class397 method287() {
	return aClass397_2492;
    }
    
    public Class397 method280() {
	return aClass397_2492;
    }
    
    public void method315() {
	if (method281() != Class376.aClass376_3896) {
	    method4634(false);
	    method4552(Class376.aClass376_3900);
	} else {
	    method4634(false);
	    method4552(Class376.aClass376_3898);
	}
    }
    
    public void method293(boolean bool, int i, int i_690_, int i_691_) {
	aBool2483 = bool;
	anInt2508 = i;
	anInt2538 = i_690_;
	anInt2490 = i_691_;
    }
    
    public void method317(boolean bool) {
	if (!bool)
	    method285();
	else if (method281() == Class376.aClass376_3901) {
	    method4634(true);
	    method4552(Class376.aClass376_3897);
	}
    }
    
    synchronized void method4647() {
	int i = (aClass525_Sub38_2488 != null
		 ? aClass525_Sub38_2488.index * -1133521593 : 0);
	int i_692_ = 0;
	Iterator iterator = aList2514.iterator();
	while (iterator.hasNext()) {
	    RSBuffer class525_sub38 = (RSBuffer) iterator.next();
	    i_692_ += class525_sub38.index * -1133521593;
	}
	if (aClass525_Sub38_2488 != null) {
	    if ((aClass525_Sub38_2488.buffer.length
		 - aClass525_Sub38_2488.index * -1133521593)
		< i_692_) {
		RSBuffer class525_sub38 = method4635(i_692_ + anInt2533);
		class525_sub38.method16614((aClass525_Sub38_2488
					    .buffer),
					   (aClass525_Sub38_2488.index
					    * -1133521593) - anInt2517,
					   anInt2533, -323064323);
		aClass525_Sub38_2488.method16627(-863955507);
		aClass525_Sub38_2488 = class525_sub38;
		i = anInt2517;
	    }
	} else {
	    aClass525_Sub38_2488 = method4635(i_692_);
	    anInt2533 = 0;
	    i = 0;
	}
	iterator = aList2514.iterator();
	while (iterator.hasNext()) {
	    RSBuffer class525_sub38 = (RSBuffer) iterator.next();
	    aClass525_Sub38_2488.method16614(class525_sub38.buffer, 0,
					     (class525_sub38.index
					      * -1133521593),
					     656952789);
	    anInt2533 += class525_sub38.index * -1133521593;
	    class525_sub38.method16627(-1156314121);
	}
	aClass525_Sub38_2488.index = (i - anInt2517) * 339428471;
	anInt2517 = 0;
	aList2514.clear();
	while (aBool2513) {
	    if (aClass525_Sub38_2488.index * -1133521593
		>= aClass525_Sub38_2488.buffer.length) {
		aBool2513 = false;
		break;
	    }
	    if (aBool2521 && (float) (anInt2539 / method4554()) > aFloat2491)
		break;
	    if (aClass525_Sub38_2488 == null || anInt2533 < 27) {
		if (aClass525_Sub38_2488 != null) {
		    anInt2517 = anInt2533;
		    aClass525_Sub38_2488.index += anInt2533 * 339428471;
		}
		aBool2513 = false;
		break;
	    }
	    int i_693_ = aClass525_Sub38_2488.index * -1133521593;
	    int i_694_ = 0;
	    int i_695_ = 0;
	    if (!method4564(aClass525_Sub38_2488))
		break;
	    anInt2546++;
	    if (anInt2528 < 0)
		anInt2540++;
	    aList2505.clear();
	    aList2535.clear();
	    aClass525_Sub38_2488.readUnsignedByte(592970227);
	    int i_696_ = aClass525_Sub38_2488.readUnsignedByte(1397609184);
	    int i_697_
		= (aClass525_Sub38_2488.readUnsignedByte(902632201) & 0xff
		   | (aClass525_Sub38_2488.readUnsignedByte(780469529) & 0xff) << 8
		   | ((aClass525_Sub38_2488.readUnsignedByte(1477300509) & 0xff)
		      << 16)
		   | aClass525_Sub38_2488.readUnsignedByte(1240328257) << 24);
	    i_694_ = i_697_ - i_694_;
	    aClass525_Sub38_2488.index += 1135888240;
	    int i_698_ = aClass525_Sub38_2488.readUnsignedByte(1401435813);
	    int i_699_ = aClass525_Sub38_2488.index * -1133521593;
	    int i_700_ = i_699_ + i_698_;
	    if (i_700_ > i_693_ + anInt2533) {
		aClass525_Sub38_2488.index
		    = (i_693_ + anInt2533) * 339428471;
		anInt2517
		    = aClass525_Sub38_2488.index * -1133521593 - i_693_;
		aBool2513 = false;
	    }
	    int i_701_ = i_700_;
	    int i_702_ = 0;
	    if (aBool2513) {
		for (int i_703_ = 0; i_703_ < i_698_; i_703_++) {
		    int i_704_
			= (aClass525_Sub38_2488.buffer[i_699_++]
			   & 0xff);
		    i_700_ += i_704_;
		    i_702_ += i_704_;
		    if (i_700_ > i_693_ + anInt2533) {
			aClass525_Sub38_2488.index
			    = (i_693_ + anInt2533) * 339428471;
			anInt2517
			    = (aClass525_Sub38_2488.index * -1133521593
			       - i_693_);
			aBool2513 = false;
			break;
		    }
		    if (i_704_ < 255) {
			aList2505.add(Integer.valueOf(i_701_));
			aList2535.add(Integer.valueOf(i_702_));
			i_701_ = i_700_;
			i_702_ = 0;
		    }
		}
	    }
	    if (aBool2513) {
		int i_705_ = i_700_;
		int i_706_ = -1;
		Iterator iterator_707_ = aList2505.iterator();
		Iterator iterator_708_ = aList2535.iterator();
		boolean bool = false;
		anInt2536 = 0;
		while (iterator_707_.hasNext()) {
		    Integer integer = (Integer) iterator_707_.next();
		    Integer integer_709_ = (Integer) iterator_708_.next();
		    i_706_++;
		    if (method289() && aBool2529 == true
			&& anInt2546 < anInt2540 && i_706_ < anInt2528) {
			Class255 class255_710_ = this;
			class255_710_.anInt2522
			    = class255_710_.anInt2522 + (bool ? 0 : i_694_);
			bool = true;
		    } else {
			anAtomicReference2534.set(null);
			boolean bool_711_
			    = method4576(aClass525_Sub38_2488.buffer,
					 integer.intValue(),
					 integer_709_.intValue(),
					 anAtomicReference2534);
			Class250[] class250s
			    = (Class250[]) anAtomicReference2534.get();
			if (bool_711_
			    && (aBool2529 != true || anInt2546 >= anInt2540
				|| i_706_ >= anInt2528)) {
			    if (class250s != null) {
				int i_712_ = class250s[0].anInt2448;
				anInt2532 += i_712_;
				if (anInt2532 > i_697_ && i_696_ == 4) {
				    anInt2536 = anInt2532 - i_697_ - anInt2536;
				    i_712_ -= anInt2536;
				    if (anInt2536 > class250s[0].anInt2448)
					anInt2536 = class250s[0].anInt2448;
				    if (i_712_ < 0)
					i_712_ = 0;
				}
				int i_713_ = 0;
				int i_714_
				    = method283(i_712_) * class250s.length;
				if (aBool2529 == true
				    && anInt2522 < anInt2538) {
				    int i_715_ = i_714_;
				    i_714_ -= method283(anInt2538 - anInt2522);
				    if (i_714_ <= 0) {
					anInt2522 += method190(i_715_);
					method4645(class250s);
					Object object = null;
					continue;
				    }
				    i_713_ += anInt2538 - anInt2522;
				}
				if (anInt2522 + i_712_ > anInt2490
				    && (anInt2519 < anInt2508 || anInt2508 < 0)
				    && aBool2483) {
				    i_714_ -= method283(anInt2522 + i_712_
							- anInt2490 - 1);
				    if (i_714_ <= 0) {
					method4645(class250s);
					Object object = null;
					continue;
				    }
				}
				int i_716_ = method224();
				if (method4556() < method224()) {
				    int i_717_ = method224() - method4556();
				    i_714_ += i_714_ / method4556() * i_717_;
				}
				RSBuffer class525_sub38
				    = method4635(i_714_);
				for (int i_718_ = i_713_; i_718_ < i_712_;
				     i_718_++) {
				    boolean bool_719_ = aBool2529;
				    if (anInt2508 != 0) {
					if (anInt2522 == anInt2538) {
					    if (anInt2523 < 0) {
						anInt2523 = anInt2525;
						anInt2528 = i_706_;
					    }
					    aBool2529 = false;
					}
					if (anInt2522 == anInt2490
					    && anInt2524 < 0)
					    anInt2524 = anInt2525;
					if (anInt2522 > anInt2490
					    && (anInt2519 < anInt2508
						|| anInt2508 < 0)
					    && aBool2483)
					    bool_719_ = true;
				    }
				    if (bool_719_
					&& (anInt2522 < anInt2538
					    || anInt2522 > anInt2490)) {
					anInt2522++;
					if (++i_695_ > i_694_)
					    throw new RuntimeException();
				    } else {
					for (int i_720_ = 0; i_720_ < i_716_;
					     i_720_++) {
					    float f;
					    if (i_720_ < class250s.length)
						f = (class250s[i_720_]
						     .aFloatArray2449[i_718_]);
					    else
						f = (class250s
						     [i_720_ % method4556()]
						     .aFloatArray2449[i_718_]);
					    if (aClass397_2492
						== Class397.aClass397_4112) {
						int i_721_ = method4578(f);
						if (aClass391_2487
						    == Class391.aClass391_4070)
						    class525_sub38.method16840
							(i_721_, 241387851);
						else
						    class525_sub38.method16602
							(i_721_, 1608968060);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4108)) {
						int i_722_ = method4579(f);
						if (aClass391_2487
						    == Class391.aClass391_4070)
						    class525_sub38.method16840
							(i_722_, 241387851);
						else
						    class525_sub38.method16602
							(i_722_, 1428232476);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4109)) {
						int i_723_ = method4621(f);
						class525_sub38.method16735
						    (i_723_, -1463373111);
					    } else if (aClass397_2492
						       == (Class397
							   .aClass397_4111)) {
						int i_724_ = method4581(f);
						class525_sub38.method16735
						    (i_724_, -1284755240);
					    }
					}
					anInt2522++;
					i_695_++;
				    }
				}
				synchronized (aList2518) {
				    anInt2539
					+= (method190(class525_sub38.index
						      * -1133521593)
					    / method224());
				    aList2518.add(class525_sub38);
				}
			    }
			} else if (method289()) {
			    anInt2501 = 0;
			    if (aClass250Array2500 == null
				|| (aClass250Array2500 != null
				    && (aClass250Array2500.length != anInt2479
					|| (aClass250Array2500[0].anInt2448
					    != anInt2493)))) {
				if (aClass250Array2500 != null)
				    method4645(aClass250Array2500);
				aClass250Array2500
				    = method4641(anInt2479, anInt2493);
			    }
			}
			method4645(class250s);
			Object object = null;
		    }
		}
		aClass525_Sub38_2488.index = i_705_ * 339428471;
		anInt2533 -= i_705_ - i_693_;
	    }
	}
    }
    
    public void method301(boolean bool) {
	if (!bool)
	    method285();
	else if (method281() == Class376.aClass376_3901) {
	    method4634(true);
	    method4552(Class376.aClass376_3897);
	}
    }
}
