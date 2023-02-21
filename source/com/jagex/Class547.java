/* Class547 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class547
{
    public Class656_Sub1_Sub1 aClass656_Sub1_Sub1_7264;
    short aShort7265;
    public Class656_Sub1_Sub5 aClass656_Sub1_Sub5_7266;
    public Class656_Sub1_Sub5 aClass656_Sub1_Sub5_7267;
    public Class656_Sub1_Sub4 aClass656_Sub1_Sub4_7268;
    public Class547 aClass547_7269;
    short aShort7270;
    public byte aByte7271;
    public Class560 aClass560_7272;
    short aShort7273;
    short aShort7274;
    Class656_Sub1_Sub2 aClass656_Sub1_Sub2_7275;
    public Class656_Sub1_Sub4 aClass656_Sub1_Sub4_7276;
    
    public Class547(int i) {
	aByte7271 = (byte) i;
    }
    
    static final void method9101(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static void method9102(String string, int i, byte i_0_) {
	if (null == Class15.aClass1_177)
	    Class15.aClass1_177 = new Class1();
	Class15.aClass1_177.aString10 = string;
	Class15.aClass1_177.anInt11 = 172198755 * (i + 1099);
	Class15.aClass1_177.anInt12
	    = Class198_Sub3.method15609(Class176.aClass685_1884,
					Class675.aClass675_8612,
					(Class15.aClass1_177.anInt11
					 * -559264181),
					742041011) * -1194767071;
	Class15.aClass1_177.anInt9
	    = Class46.method1094(Class176.aClass685_1884,
				 Class675.aClass675_8612,
				 Class15.aClass1_177.anInt11 * -559264181,
				 (byte) 16) * -686040367;
    }
    
    public static void method9103(boolean bool, byte[] is, int i) {
	if (Class619.aClass525_Sub38_8084 == null)
	    Class619.aClass525_Sub38_8084 = new RSBuffer(20000);
	Class619.aClass525_Sub38_8084.method16614(is, 0, is.length,
						  1328425986);
	if (bool) {
	    Class203.method3855(Class619.aClass525_Sub38_8084.buffer,
				-1958947899);
	    Class15.aClass603_Sub1Array175
		= new Class603_Sub1[Class617.anInt8062 * -1524093609];
	    int i_1_ = 0;
	    for (int i_2_ = -1122711783 * Class478.anInt5201;
		 i_2_ <= Class617.anInt8063 * -192862351; i_2_++) {
		Class603_Sub1 class603_sub1
		    = Class525_Sub28.method16401(i_2_, 1471842634);
		if (class603_sub1 != null)
		    Class15.aClass603_Sub1Array175[i_1_++] = class603_sub1;
	    }
	    Class15.aBool176 = false;
	    Class697.aLong8767
		= Class251.method4508((byte) 8) * 5736024217643482401L;
	    Class619.aClass525_Sub38_8084 = null;
	}
    }
    
    static final void method9104(Class683 class683, int i) {
	if (client.aString11337 != null)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= Class248.method4494(client.aString11337, -1878601079);
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
    }
}
