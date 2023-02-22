/* Class198_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class198_Sub16 extends Class198
{
    String aString9977;
    int anInt9978;
    public static int anInt9979;
    
    public void method3753(int i) {
	if (1278550387 * client.anInt11280 != -1)
	    Class326.method5741(client.anInt11280 * 1278550387, aString9977,
				anInt9978 * -1755956873, 2080559538);
    }
    
    public void method3756() {
	if (1278550387 * client.anInt11280 != -1)
	    Class326.method5741(client.anInt11280 * 1278550387, aString9977,
				anInt9978 * -1755956873, 1422333478);
    }
    
    public void method3754() {
	if (1278550387 * client.anInt11280 != -1)
	    Class326.method5741(client.anInt11280 * 1278550387, aString9977,
				anInt9978 * -1755956873, 1724615092);
    }
    
    public void method3757() {
	if (1278550387 * client.anInt11280 != -1)
	    Class326.method5741(client.anInt11280 * 1278550387, aString9977,
				anInt9978 * -1755956873, 1574665444);
    }
    
    Class198_Sub16(RSBuffer class525_sub38) {
	super(class525_sub38);
	aString9977 = class525_sub38.readString((byte) 118);
	anInt9978 = class525_sub38.readUnsignedShort((byte) 2) * 2115924039;
    }
    
    static final void method15657(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	JS5.method7570(class259, class245, class683, 302379219);
    }
}
