/* Class402 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class402 implements Interface48
{
    JS5 aClass458_4135;
    Class200 aClass200_4136 = new Class200(64);
    
    public synchronized Class382 method341(int i) {
	Class382 class382 = (Class382) aClass200_4136.method3785((long) i);
	if (class382 != null)
	    return class382;
	byte[] is = aClass458_4135.getFile(0, i, 1068363001);
	class382 = new Class382();
	if (null != is)
	    class382.method6416(new RSBuffer(is), -1232153577);
	class382.method6418((byte) 49);
	aClass200_4136.method3788(class382, (long) i);
	return class382;
    }
    
    public synchronized Class382 method340(int i, int i_0_) {
	Class382 class382 = (Class382) aClass200_4136.method3785((long) i);
	if (class382 != null)
	    return class382;
	byte[] is = aClass458_4135.getFile(0, i, 887220360);
	class382 = new Class382();
	if (null != is)
	    class382.method6416(new RSBuffer(is), 753278669);
	class382.method6418((byte) 74);
	aClass200_4136.method3788(class382, (long) i);
	return class382;
    }
    
    public void method6558(int i) {
	aClass200_4136.method3791((byte) 33);
    }
    
    public synchronized Class382 method339(int i) {
	Class382 class382 = (Class382) aClass200_4136.method3785((long) i);
	if (class382 != null)
	    return class382;
	byte[] is = aClass458_4135.getFile(0, i, 1519606372);
	class382 = new Class382();
	if (null != is)
	    class382.method6416(new RSBuffer(is), -85275822);
	class382.method6418((byte) 6);
	aClass200_4136.method3788(class382, (long) i);
	return class382;
    }
    
    public Class402(JS5 class458) {
	aClass458_4135 = class458;
    }
    
    public void method6559() {
	aClass200_4136.method3791((byte) -25);
    }
    
    public void method6560() {
	aClass200_4136.method3791((byte) -69);
    }
    
    public void method6561() {
	aClass200_4136.method3791((byte) -28);
    }
    
    public void method6562() {
	aClass200_4136.method3791((byte) 111);
    }
    
    static void method6563(String[] strings, int[] is, int i, int i_1_,
			   int i_2_) {
	if (i < i_1_) {
	    int i_3_ = (i + i_1_) / 2;
	    int i_4_ = i;
	    String string = strings[i_3_];
	    strings[i_3_] = strings[i_1_];
	    strings[i_1_] = string;
	    int i_5_ = is[i_3_];
	    is[i_3_] = is[i_1_];
	    is[i_1_] = i_5_;
	    for (int i_6_ = i; i_6_ < i_1_; i_6_++) {
		if (null == string
		    || (null != strings[i_6_]
			&& strings[i_6_].compareTo(string) < (i_6_ & 0x1))) {
		    String string_7_ = strings[i_6_];
		    strings[i_6_] = strings[i_4_];
		    strings[i_4_] = string_7_;
		    int i_8_ = is[i_6_];
		    is[i_6_] = is[i_4_];
		    is[i_4_++] = i_8_;
		}
	    }
	    strings[i_1_] = strings[i_4_];
	    strings[i_4_] = string;
	    is[i_1_] = is[i_4_];
	    is[i_4_] = i_5_;
	    method6563(strings, is, i, i_4_ - 1, 1673379381);
	    method6563(strings, is, i_4_ + 1, i_1_, 1673379381);
	}
    }
    
    static final void method6564(Class683 class683, int i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (((ItemDefinitions)
		Class313_Sub2.aClass40_Sub22_10106.method76(i_9_, -1563991103))
	       .anInt99) * 2044569101;
    }
    
    static final void method6565(Class683 class683, int i) {
	int i_10_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (client.anInt11362 * 1819257147 == 2
	    && i_10_ < -883281325 * client.anInt11204)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 163601069 * client.aClass66Array11356[i_10_].anInt706;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method6566(Class683 class683, byte i) {
	class683.anInt8644 -= 1285561025;
	class683.anInt8662 -= 362986067;
	String string
	    = ((String)
	       class683.anObjectArray8636[class683.anInt8644 * 1373599041]);
	boolean bool
	    = class683.anIntArray8661[class683.anInt8662 * 501271953] == 1;
	boolean bool_11_
	    = 1 == class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	boolean bool_12_
	    = 1 == class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4303,
				client.aClass96_11361.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16602
	    (Class161.method2628(string, 1448142467) + 1, 1964633324);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
							      390789076);
	int i_13_ = 0;
	if (bool)
	    i_13_ |= 0x1;
	if (bool_11_)
	    i_13_ |= 0x2;
	if (bool_12_)
	    i_13_ |= 0x4;
	class525_sub15.aClass525_Sub38_Sub2_10546.method16735(i_13_,
							      -571674783);
	client.aClass96_11361.method1794(class525_sub15, (short) 30937);
    }
    
    static final void method6567(byte i) {
	Class486.method7856(650110653);
	client.aClass507_11137.method8405(2080112058);
	for (int i_14_ = 0; i_14_ < client.aClass109Array11089.length; i_14_++)
	    client.aClass109Array11089[i_14_] = null;
	for (int i_15_ = 0; i_15_ < client.aClass523Array11183.length; i_15_++)
	    client.aClass523Array11183[i_15_] = null;
	Class575.method9552(-818520247);
	for (int i_16_ = 0; i_16_ < 2048; i_16_++)
	    client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_16_] = null;
	client.anInt11216 = 0;
	client.aClass10_11121.method688((short) 696);
	client.anInt11276 = 0;
	client.aClass10_11246.method688((short) 4908);
	Class202.method3853(Class152_Sub1.method14533(-740990975), (byte) 32);
	client.anInt11134 = 0;
	Class532.aClass111_7170.aClass614_1374.method10062(1429253007);
	Class193.aClass353_2150 = null;
	Class473.aClass353_5161 = null;
	Class303.aClass525_Sub25_3406 = null;
	Class404.aClass525_Sub25_4148 = null;
	Class182_Sub2.aClass228_9503 = null;
	client.aBool11376 = true;
	Class69.aClass646_736 = null;
	Class629.aLong8161 = 0L;
	Class219.method4200((byte) -52);
	Class272.method5024((byte) 76);
    }
    
    static final void method6568(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub30_10696
		  .method17246((byte) 1) ? 1 : 0;
    }
    
    static final void method6569(Class683 class683, int i) {
	int i_17_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_17_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_17_ >> 16];
	Class651.method10740(class259, class245, class683, -507161998);
    }
    
    static final void method6570(Class683 class683, byte i) {
	int i_18_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_18_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_18_ >> 16];
	Class199.method3779(class259, class245, class683, (byte) -39);
    }
}
