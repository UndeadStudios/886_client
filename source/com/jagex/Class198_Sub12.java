/* Class198_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class198_Sub12 extends Class198
{
    int anInt9970;
    int anInt9971;
    
    Class198_Sub12(RSBuffer class525_sub38) {
	super(class525_sub38);
	anInt9970 = class525_sub38.readUnsignedShort((byte) 104) * -715056201;
	anInt9971 = class525_sub38.readUnsignedShort((byte) 122) * 680705451;
    }
    
    public void method3753(int i) {
	Class201.aClass205Array2202[-1182420473 * anInt9970].method3864
	    (-1966087563).method18597(anInt9971 * 1307202819, true, (byte) 1);
    }
    
    public void method3754() {
	Class201.aClass205Array2202[-1182420473 * anInt9970].method3864
	    (487215557).method18597(anInt9971 * 1307202819, true, (byte) 1);
    }
    
    public void method3757() {
	Class201.aClass205Array2202[-1182420473 * anInt9970].method3864
	    (239754468).method18597(anInt9971 * 1307202819, true, (byte) 1);
    }
    
    public void method3756() {
	Class201.aClass205Array2202[-1182420473 * anInt9970].method3864
	    (-1167371920).method18597(anInt9971 * 1307202819, true, (byte) 1);
    }
    
    static final void method15650(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (0 != 1819257147 * client.anInt11362
	    && i_0_ < -651611127 * client.anInt11366) {
	    Class31 class31 = client.aClass31Array11368[i_0_];
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class31.aString300;
	    if (class31.aString301 != null)
		class683.anObjectArray8636
		    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		    = class31.aString301;
	    else
		class683.anObjectArray8636
		    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		    = "";
	} else {
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	}
    }
}
