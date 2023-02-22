/* Class533 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class533
{
    short[] aShortArray7171;
    Class535 this$1;
    
    byte method8840(Class334 class334, byte i) throws IOException {
	int i_0_ = 1;
	do {
	    int i_1_ = i >> 7 & 0x1;
	    i <<= 1;
	    int i_2_ = class334.method5829(aShortArray7171,
					   (i_1_ + 1 << 8) + i_0_, (byte) 71);
	    i_0_ = i_0_ << 1 | i_2_;
	    if (i_1_ != i_2_) {
		for (/**/; i_0_ < 256;
		     i_0_ = i_0_ << 1 | class334.method5829(aShortArray7171,
							    i_0_, (byte) 13)) {
		    /* empty */
		}
		break;
	    }
	} while (i_0_ < 256);
	return (byte) i_0_;
    }
    
    void method8841(short i) {
	Class28.method906(aShortArray7171, 2080592148);
    }
    
    Class533(Class535 class535) {
	this$1 = class535;
	aShortArray7171 = new short[768];
    }
    
    byte method8842(Class334 class334) throws IOException {
	int i = 1;
	do
	    i = i << 1 | class334.method5829(aShortArray7171, i, (byte) 12);
	while (i < 256);
	return (byte) i;
    }
    
    void method8843() {
	Class28.method906(aShortArray7171, 2030995430);
    }
    
    byte method8844(Class334 class334) throws IOException {
	int i = 1;
	do
	    i = i << 1 | class334.method5829(aShortArray7171, i, (byte) -8);
	while (i < 256);
	return (byte) i;
    }
    
    byte method8845(Class334 class334, short i) throws IOException {
	int i_3_ = 1;
	do
	    i_3_ = i_3_ << 1 | class334.method5829(aShortArray7171, i_3_,
						   (byte) -57);
	while (i_3_ < 256);
	return (byte) i_3_;
    }
    
    byte method8846(Class334 class334) throws IOException {
	int i = 1;
	do
	    i = i << 1 | class334.method5829(aShortArray7171, i, (byte) 24);
	while (i < 256);
	return (byte) i;
    }
    
    byte method8847(Class334 class334, byte i) throws IOException {
	int i_4_ = 1;
	do {
	    int i_5_ = i >> 7 & 0x1;
	    i <<= 1;
	    int i_6_ = class334.method5829(aShortArray7171,
					   (i_5_ + 1 << 8) + i_4_, (byte) 34);
	    i_4_ = i_4_ << 1 | i_6_;
	    if (i_5_ != i_6_) {
		for (/**/; i_4_ < 256;
		     i_4_ = i_4_ << 1 | class334.method5829(aShortArray7171,
							    i_4_,
							    (byte) -109)) {
		    /* empty */
		}
		break;
	    }
	} while (i_4_ < 256);
	return (byte) i_4_;
    }
    
    byte method8848(Class334 class334, byte i, int i_7_) throws IOException {
	int i_8_ = 1;
	do {
	    int i_9_ = i >> 7 & 0x1;
	    i <<= 1;
	    int i_10_ = class334.method5829(aShortArray7171,
					    (i_9_ + 1 << 8) + i_8_, (byte) 8);
	    i_8_ = i_8_ << 1 | i_10_;
	    if (i_9_ != i_10_) {
		for (/**/; i_8_ < 256;
		     i_8_
			 = i_8_ << 1 | class334.method5829(aShortArray7171,
							   i_8_, (byte) -30)) {
		    /* empty */
		}
		break;
	    }
	} while (i_8_ < 256);
	return (byte) i_8_;
    }
    
    static final void method8849(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2698
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1029742150);
	class259.aBool2695 = true;
    }
    
    static final void method8850(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (307215955 * class259.anInt2630 == 1
	       ? -961419549 * class259.anInt2631 : -1);
    }
    
    static final void method8851(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_11_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_12_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class88.method1665(i_11_, i_12_, false, (byte) -61);
    }
    
    static int method8852
	(Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2, int i) {
	NPCDefinitions class299 = class656_sub1_sub3_sub1_sub2.aClass299_12255;
	if (null != class299.anIntArray3323) {
	    class299
		= class299.method5386(Class532.aClass111_7170,
				      Class532.aClass111_7170, 2131462863);
	    if (null == class299)
		return -1;
	}
	int i_13_ = 766686113 * class299.anInt3357;
	Class586 class586
	    = class656_sub1_sub3_sub1_sub2.method18633((byte) -88);
	int i_14_ = class656_sub1_sub3_sub1_sub2.aClass689_Sub1_11986
			.method14048(-1089981427);
	if (i_14_ == -1
	    || class656_sub1_sub3_sub1_sub2.aClass689_Sub1_11986.aBool11017)
	    i_13_ = class299.anInt3354 * -1559975795;
	else if (class586.anInt7737 * 1543647097 == i_14_
		 || 1757568299 * class586.anInt7738 == i_14_
		 || i_14_ == 847346181 * class586.anInt7740
		 || i_14_ == -323002495 * class586.anInt7749)
	    i_13_ = -1876270485 * class299.anInt3321;
	else if (323075315 * class586.anInt7741 == i_14_
		 || i_14_ == -1270065645 * class586.anInt7742
		 || i_14_ == class586.anInt7744 * -880993293
		 || i_14_ == -1559403155 * class586.anInt7762)
	    i_13_ = class299.anInt3339 * 1541231227;
	return i_13_;
    }
    
    public static RuntimeException_Sub4 method8853(Throwable throwable,
						   String string) {
	RuntimeException_Sub4 runtimeexception_sub4;
	if (throwable instanceof RuntimeException_Sub4) {
	    runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub4 runtimeexception_sub4_15_
		= runtimeexception_sub4;
	    runtimeexception_sub4_15_.aString12144
		= stringbuilder.append
		      (runtimeexception_sub4_15_.aString12144).append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub4
		= new RuntimeException_Sub4(throwable, string);
	return runtimeexception_sub4;
    }
}
