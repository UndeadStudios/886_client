/* Class331_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class331_Sub1 extends Class331
{
    int anInt10045 = 0;
    
    public void method212(boolean bool, byte i) {
	int i_0_
	    = (aClass399_3593.aClass395_4126.method6521(aClass157_3594
							    .method12(),
							(-1202561691
							 * client.anInt11223),
							(byte) -58)
	       + aClass399_3593.anInt4128 * -2069204943);
	int i_1_ = (aClass399_3593.aClass396_4129.method6529(aClass157_3594
								 .method2472(),
							     (client.anInt11224
							      * -1167554197),
							     (byte) 100)
		    + 1167061423 * aClass399_3593.anInt4125);
	aClass157_3594.method2487((float) (i_0_
					   + aClass157_3594.method12() / 2),
				  (float) (i_1_
					   + aClass157_3594.method2472() / 2),
				  4096, anInt10045 * 1281320189);
	anInt10045 += 1152824243 * ((Class399_Sub1) aClass399_3593).anInt10230;
    }
    
    Class331_Sub1(Class458 class458, Class399_Sub1 class399_sub1) {
	super(class458, (Class399) class399_sub1);
    }
    
    public void method209(boolean bool) {
	int i
	    = (aClass399_3593.aClass395_4126.method6521(aClass157_3594
							    .method12(),
							(-1202561691
							 * client.anInt11223),
							(byte) -34)
	       + aClass399_3593.anInt4128 * -2069204943);
	int i_2_ = (aClass399_3593.aClass396_4129.method6529(aClass157_3594
								 .method2472(),
							     (client.anInt11224
							      * -1167554197),
							     (byte) 100)
		    + 1167061423 * aClass399_3593.anInt4125);
	aClass157_3594.method2487((float) (i + aClass157_3594.method12() / 2),
				  (float) (i_2_
					   + aClass157_3594.method2472() / 2),
				  4096, anInt10045 * 1281320189);
	anInt10045 += 1152824243 * ((Class399_Sub1) aClass399_3593).anInt10230;
    }
    
    static final void method15693(String string, int i) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class531_Sub1.method15919(string, "%0a", "\n",
							  1017261925))
			       .toString());
    }
}
