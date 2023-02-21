/* Class525_Sub5_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class525_Sub5_Sub1_Sub1 extends Class525_Sub5_Sub1
{
    Class266_Sub2 aClass266_Sub2_12146;
    int[] anIntArray12147 = null;
    int[] anIntArray12148 = null;
    
    public boolean method18230(int i) {
	return true;
    }
    
    Class525_Sub5_Sub1_Sub1(Class266_Sub2 class266_sub2, Class274 class274) {
	super(class274);
	aClass266_Sub2_12146 = class266_sub2;
	anIntArray12147 = class274.anIntArray2857;
	anIntArray12148 = class274.anIntArray2860;
    }
    
    final int method18818() {
	return anIntArray12147[aClass266_Sub2_12146.method4816(-1219475486)];
    }
    
    final int method18819() {
	return anIntArray12148[aClass266_Sub2_12146.method4816(-1077994035)];
    }
    
    public final int method18229(int i) {
	int i_0_ = anIntArray12147[i];
	int i_1_ = anIntArray12148[i];
	if (i_0_ != -1)
	    return i_0_;
	if (i_1_ != -1)
	    return i_1_ | 0x10000;
	return -1;
    }
    
    public final int method18245(int i) {
	int i_2_ = anIntArray12147[i];
	int i_3_ = anIntArray12148[i];
	if (i_2_ != -1)
	    return i_2_;
	if (i_3_ != -1)
	    return i_3_ | 0x10000;
	return -1;
    }
    
    public boolean method18232(int i) {
	return true;
    }
    
    public boolean method18227(int i) {
	return true;
    }
    
    public boolean method18224(int i) {
	return true;
    }
    
    final int method18820() {
	return anIntArray12147[aClass266_Sub2_12146.method4816(-1142880361)];
    }
    
    final int method18821() {
	return anIntArray12148[aClass266_Sub2_12146.method4816(-1075783304)];
    }
}
