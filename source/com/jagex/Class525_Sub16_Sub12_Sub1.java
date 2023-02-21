/* Class525_Sub16_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub16_Sub12_Sub1 extends Class525_Sub16_Sub12
{
    byte aByte12192;
    RSBuffer aClass525_Sub38_12193;
    
    byte[] method18446() {
	if (aBool11832
	    || (aClass525_Sub38_12193.pos * -1133521593
		< aClass525_Sub38_12193.buffer.length - aByte12192))
	    throw new RuntimeException();
	return aClass525_Sub38_12193.buffer;
    }
    
    byte[] method18447(int i) {
	if (aBool11832
	    || (aClass525_Sub38_12193.pos * -1133521593
		< aClass525_Sub38_12193.buffer.length - aByte12192))
	    throw new RuntimeException();
	return aClass525_Sub38_12193.buffer;
    }
    
    int method18445(int i) {
	if (aClass525_Sub38_12193 == null)
	    return 0;
	return (aClass525_Sub38_12193.pos * -1683009604
		/ (aClass525_Sub38_12193.buffer.length - aByte12192));
    }
    
    Class525_Sub16_Sub12_Sub1() {
	/* empty */
    }
    
    int method18444() {
	if (aClass525_Sub38_12193 == null)
	    return 0;
	return (aClass525_Sub38_12193.pos * -1683009604
		/ (aClass525_Sub38_12193.buffer.length - aByte12192));
    }
}
