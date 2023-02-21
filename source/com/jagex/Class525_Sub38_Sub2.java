/* Class525_Sub38_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub38_Sub2 extends RSBuffer
{
    static int[] anIntArray11875
	= { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191,
	    16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151,
	    4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
	    268435455, 536870911, 1073741823, 2147483647, -1 };
    int anInt11876;
    Class6 aClass6_11877;
    
    public void method18489(byte[] is, int i, int i_0_, int i_1_) {
	for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
	    is[i_2_ + i]
		= (byte) ((buffer
			   [(pos += 339428471) * -1133521593 - 1])
			  - aClass6_11877.method544(904141364));
    }
    
    public int method18490(int i) {
	int i_3_
	    = ((buffer[(pos += 339428471) * -1133521593 - 1]
		- aClass6_11877.method544(904141364))
	       & 0xff);
	if (i_3_ < 128)
	    return i_3_;
	return ((i_3_ - 128 << 8)
		+ (buffer[((pos += 339428471) * -1133521593
				    - 1)] - aClass6_11877.method544(904141364)
		   & 0xff));
    }
    
    public void method18491(int i, int i_4_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i + aClass6_11877.method544(904141364));
    }
    
    public Class525_Sub38_Sub2(int i) {
	super(i);
    }
    
    public boolean method18492(int i) {
	int i_5_ = ((buffer[-1133521593 * pos]
		     - aClass6_11877.method545((byte) -77))
		    & 0xff);
	if (i_5_ < 128)
	    return false;
	return true;
    }
    
    public int method18493() {
	int i = ((buffer[(pos += 339428471) * -1133521593 - 1]
		  - aClass6_11877.method544(904141364))
		 & 0xff);
	if (i < 128)
	    return i;
	return ((i - 128 << 8)
		+ (buffer[((pos += 339428471) * -1133521593
				    - 1)] - aClass6_11877.method544(904141364)
		   & 0xff));
    }
    
    public int method18494(int i) {
	return 8 * i - anInt11876 * 1085032257;
    }
    
    public void method18495(int i) {
	anInt11876 = pos * -423750600;
    }
    
    public int method18496(int i, int i_6_) {
	int i_7_ = 1085032257 * anInt11876 >> 3;
	int i_8_ = 8 - (1085032257 * anInt11876 & 0x7);
	int i_9_ = 0;
	anInt11876 += i * -116111167;
	for (/**/; i > i_8_; i_8_ = 8) {
	    i_9_ += ((buffer[i_7_++] & anIntArray11875[i_8_])
		     << i - i_8_);
	    i -= i_8_;
	}
	if (i_8_ == i)
	    i_9_ += buffer[i_7_] & anIntArray11875[i_8_];
	else
	    i_9_ += buffer[i_7_] >> i_8_ - i & anIntArray11875[i];
	return i_9_;
    }
    
    public void method18497(int i) {
	pos = 339428471 * ((anInt11876 * 1085032257 + 7) / 8);
    }
    
    public int method18498() {
	int i = ((buffer[(pos += 339428471) * -1133521593 - 1]
		  - aClass6_11877.method544(904141364))
		 & 0xff);
	if (i < 128)
	    return i;
	return ((i - 128 << 8)
		+ (buffer[((pos += 339428471) * -1133521593
				    - 1)] - aClass6_11877.method544(904141364)
		   & 0xff));
    }
    
    public void method18499(Class6 class6) {
	aClass6_11877 = class6;
    }
    
    public void method18500(Class6 class6) {
	aClass6_11877 = class6;
    }
    
    public void method18501(Class6 class6) {
	aClass6_11877 = class6;
    }
    
    public void method18502(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i + aClass6_11877.method544(904141364));
    }
    
    public void method18503(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i + aClass6_11877.method544(904141364));
    }
    
    public boolean method18504() {
	int i = ((buffer[-1133521593 * pos]
		  - aClass6_11877.method545((byte) -38))
		 & 0xff);
	if (i < 128)
	    return false;
	return true;
    }
    
    public int method18505() {
	return ((buffer[(pos += 339428471) * -1133521593 - 1]
		 - aClass6_11877.method544(904141364))
		& 0xff);
    }
    
    public int method18506(int i, int i_10_) {
	return 8 * i - anInt11876 * 1085032257;
    }
    
    public int method18507() {
	return ((buffer[(pos += 339428471) * -1133521593 - 1]
		 - aClass6_11877.method544(904141364))
		& 0xff);
    }
    
    public int method18508(int i) {
	return ((buffer[(pos += 339428471) * -1133521593 - 1]
		 - aClass6_11877.method544(904141364))
		& 0xff);
    }
    
    public int method18509() {
	int i = ((buffer[(pos += 339428471) * -1133521593 - 1]
		  - aClass6_11877.method544(904141364))
		 & 0xff);
	if (i < 128)
	    return i;
	return ((i - 128 << 8)
		+ (buffer[((pos += 339428471) * -1133521593
				    - 1)] - aClass6_11877.method544(904141364)
		   & 0xff));
    }
    
    public void method18510(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i + aClass6_11877.method544(904141364));
    }
    
    public int method18511() {
	int i = ((buffer[(pos += 339428471) * -1133521593 - 1]
		  - aClass6_11877.method544(904141364))
		 & 0xff);
	if (i < 128)
	    return i;
	return ((i - 128 << 8)
		+ (buffer[((pos += 339428471) * -1133521593
				    - 1)] - aClass6_11877.method544(904141364)
		   & 0xff));
    }
    
    public void method18512(byte[] is, int i, int i_11_) {
	for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
	    is[i_12_ + i]
		= (byte) ((buffer
			   [(pos += 339428471) * -1133521593 - 1])
			  - aClass6_11877.method544(904141364));
    }
    
    public void method18513() {
	anInt11876 = pos * -423750600;
    }
    
    public void method18514() {
	anInt11876 = pos * -423750600;
    }
    
    public void method18515() {
	anInt11876 = pos * -423750600;
    }
    
    public int method18516(int i) {
	int i_13_ = 1085032257 * anInt11876 >> 3;
	int i_14_ = 8 - (1085032257 * anInt11876 & 0x7);
	int i_15_ = 0;
	anInt11876 += i * -116111167;
	for (/**/; i > i_14_; i_14_ = 8) {
	    i_15_ += ((buffer[i_13_++] & anIntArray11875[i_14_])
		      << i - i_14_);
	    i -= i_14_;
	}
	if (i_14_ == i)
	    i_15_ += buffer[i_13_] & anIntArray11875[i_14_];
	else
	    i_15_ += buffer[i_13_] >> i_14_ - i & anIntArray11875[i];
	return i_15_;
    }
    
    public void method18517() {
	pos = 339428471 * ((anInt11876 * 1085032257 + 7) / 8);
    }
    
    public void method18518() {
	pos = 339428471 * ((anInt11876 * 1085032257 + 7) / 8);
    }
    
    public int method18519(int i) {
	return 8 * i - anInt11876 * 1085032257;
    }
    
    public void method18520(Class6 class6, int i) {
	aClass6_11877 = class6;
    }
    
    static final void method18521(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class609.method10012(class259, class245, class683, 78586228);
    }
}
