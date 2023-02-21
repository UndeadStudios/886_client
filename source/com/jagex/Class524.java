/* Class524 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class524
{
    int anInt7106;
    int anInt7107;
    int anInt7108;
    String aString7109;
    int anInt7110;
    
    public int method8733() {
	return 6861737 * anInt7107;
    }
    
    public String method8734(int i) {
	return aString7109;
    }
    
    public int method8735(byte i) {
	return 6861737 * anInt7107;
    }
    
    public int method8736() {
	return anInt7106 * 228880153;
    }
    
    public int method8737(int i) {
	return anInt7106 * 228880153;
    }
    
    public int method8738() {
	return anInt7106 * 228880153;
    }
    
    public int method8739() {
	return 6861737 * anInt7107;
    }
    
    public int method8740(int i) {
	return anInt7108 * -954881191;
    }
    
    public int method8741(int i) {
	return -1549654565 * anInt7110;
    }
    
    public int method8742() {
	return 6861737 * anInt7107;
    }
    
    public int method8743() {
	return anInt7108 * -954881191;
    }
    
    public int method8744() {
	return 6861737 * anInt7107;
    }
    
    public int method8745() {
	return anInt7106 * 228880153;
    }
    
    Class524() {
	/* empty */
    }
    
    public int method8746() {
	return -1549654565 * anInt7110;
    }
    
    static final void method8747(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (i_0_ != Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub36_10699.method17294(2091276119)) {
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub36_10699,
		 i_0_, (byte) -101);
	    Class650.method10715(-1758466106);
	    client.aBool11084 = false;
	    client.aClass507_11137.method8375((byte) 41);
	}
    }
    
    static final void method8748(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method8749(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aClass637_12246
	    != null)
	    Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aClass637_12246
		.method10485(i_1_, i_2_, (byte) 39);
    }
    
    static final void method8750(Class683 class683, int i) {
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = Class556.method9249(i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff);
	if (null == class525_sub16_sub6)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class525_sub16_sub6.anInt11777 * 2044380983;
    }
    
    static final void method8751(Class683 class683, byte i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) (Class77.method1565(i_4_, (byte) 41) / 60000L);
    }
    
    static final void method8752(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	boolean bool = ((class683.anIntArray8661
			 [(class683.anInt8662 -= 1552651121) * 501271953])
			== 1);
	Class601.method9901(class259, class245, class683,
			    (bool ? Class238.aClass238_2396
			     : Class238.aClass238_2400),
			    (byte) 9);
    }
    
    public static int method8753(String string, short i) {
	return Class285.aTwitchTV3143
		   .SetStreamTitle(string, client.aClass668_11090.aString8583);
    }
}
