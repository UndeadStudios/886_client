/* Class332_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class332_Sub3 extends Class332
{
    Class157 aClass157_10147;
    
    Class332_Sub3(Class458 class458, Class458 class458_0_,
		  Class390_Sub2 class390_sub2) {
	super(class458, class458_0_, (Class390) class390_sub2);
    }
    
    public void method211(int i) {
	super.method211(857072231);
	aClass157_10147
	    = Class108.method1933(aClass458_3597,
				  (((Class390_Sub2) aClass390_3598).anInt10226
				   * 21992135),
				  65280);
    }
    
    public boolean method210() {
	if (!super.method213(2061547021))
	    return false;
	return aClass458_3597.method7506((((Class390_Sub2) aClass390_3598)
					  .anInt10226) * 21992135,
					 634002772);
    }
    
    void method5810(boolean bool, int i, int i_1_, int i_2_) {
	Class501.aClass182_5564.method3195
	    (i - 2, i_1_, aClass390_3598.anInt4065 * 1827301945 + 4,
	     aClass390_3598.anInt4066 * -797820993 + 2,
	     -120089231 * ((Class390_Sub2) aClass390_3598).anInt10227, 0);
	Class501.aClass182_5564.method3195
	    (i - 1, 1 + i_1_, 2 + aClass390_3598.anInt4065 * 1827301945,
	     aClass390_3598.anInt4066 * -797820993, 0, 0);
    }
    
    public boolean method213(int i) {
	if (!super.method213(2061547021))
	    return false;
	return aClass458_3597.method7506((((Class390_Sub2) aClass390_3598)
					  .anInt10226) * 21992135,
					 -2124078485);
    }
    
    public void method70() {
	super.method211(857072231);
	aClass157_10147
	    = Class108.method1933(aClass458_3597,
				  (((Class390_Sub2) aClass390_3598).anInt10226
				   * 21992135),
				  65280);
    }
    
    void method5811(boolean bool, int i, int i_3_, int i_4_) {
	int i_5_ = (method5815((byte) -11)
		    * (1827301945 * aClass390_3598.anInt4065) / 10000);
	int[] is = new int[4];
	Class501.aClass182_5564.method3187(is);
	Class501.aClass182_5564.method3184(i, i_3_ + 2, i_5_ + i,
					   -797820993 * (aClass390_3598
							 .anInt4066) + i_3_);
	aClass157_10147.method2478(i, 2 + i_3_,
				   1827301945 * aClass390_3598.anInt4065,
				   -797820993 * aClass390_3598.anInt4066);
	Class501.aClass182_5564.method3184(is[0], is[1], is[2], is[3]);
    }
    
    void method5818(boolean bool, int i, int i_6_) {
	int i_7_ = (method5815((byte) -127)
		    * (1827301945 * aClass390_3598.anInt4065) / 10000);
	int[] is = new int[4];
	Class501.aClass182_5564.method3187(is);
	Class501.aClass182_5564.method3184(i, i_6_ + 2, i_7_ + i,
					   -797820993 * (aClass390_3598
							 .anInt4066) + i_6_);
	aClass157_10147.method2478(i, 2 + i_6_,
				   1827301945 * aClass390_3598.anInt4065,
				   -797820993 * aClass390_3598.anInt4066);
	Class501.aClass182_5564.method3184(is[0], is[1], is[2], is[3]);
    }
    
    void method5814(boolean bool, int i, int i_8_) {
	Class501.aClass182_5564.method3195
	    (i - 2, i_8_, aClass390_3598.anInt4065 * 1827301945 + 4,
	     aClass390_3598.anInt4066 * -797820993 + 2,
	     -120089231 * ((Class390_Sub2) aClass390_3598).anInt10227, 0);
	Class501.aClass182_5564.method3195
	    (i - 1, 1 + i_8_, 2 + aClass390_3598.anInt4065 * 1827301945,
	     aClass390_3598.anInt4066 * -797820993, 0, 0);
    }
    
    void method5813(boolean bool, int i, int i_9_) {
	Class501.aClass182_5564.method3195
	    (i - 2, i_9_, aClass390_3598.anInt4065 * 1827301945 + 4,
	     aClass390_3598.anInt4066 * -797820993 + 2,
	     -120089231 * ((Class390_Sub2) aClass390_3598).anInt10227, 0);
	Class501.aClass182_5564.method3195
	    (i - 1, 1 + i_9_, 2 + aClass390_3598.anInt4065 * 1827301945,
	     aClass390_3598.anInt4066 * -797820993, 0, 0);
    }
    
    void method5812(boolean bool, int i, int i_10_) {
	Class501.aClass182_5564.method3195
	    (i - 2, i_10_, aClass390_3598.anInt4065 * 1827301945 + 4,
	     aClass390_3598.anInt4066 * -797820993 + 2,
	     -120089231 * ((Class390_Sub2) aClass390_3598).anInt10227, 0);
	Class501.aClass182_5564.method3195
	    (i - 1, 1 + i_10_, 2 + aClass390_3598.anInt4065 * 1827301945,
	     aClass390_3598.anInt4066 * -797820993, 0, 0);
    }
    
    static final boolean method15764(Class96 class96, int i) {
	boolean bool;
	try {
	    bool = Class491.method7987(class96, -518727654);
	} catch (IOException ioexception) {
	    if (17 == client.anInt11075 * 1777895575) {
		class96.method1798((byte) 0);
		return false;
	    }
	    Class196.method3742((byte) -48);
	    return true;
	} catch (Exception exception) {
	    Class600 class600 = client.aClass507_11137.method8350(1014531516);
	    String string
		= new StringBuilder().append
		      (class96.aClass416_1172 != null
		       ? class96.aClass416_1172.anInt4611 * 1810141731 : -1)
		      .append
		      (Class55.aString560).append
		      (null != class96.aClass416_1165
		       ? class96.aClass416_1165.anInt4611 * 1810141731 : -1)
		      .append
		      (Class55.aString560).append
		      (class96.aClass416_1183 != null
		       ? 1810141731 * class96.aClass416_1183.anInt4611 : -1)
		      .append
		      (" ").append
		      (-1101265009 * class96.anInt1173).append
		      (Class55.aString560).append
		      ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			.anIntArray12014[0])
		       + -1227002079 * class600.anInt7858)
		      .append
		      (Class55.aString560).append
		      (1429253007 * class600.anInt7860
		       + (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			  .anIntArray12017[0]))
		      .append
		      (" ").toString();
	    for (int i_11_ = 0;
		 i_11_ < class96.anInt1173 * -1101265009 && i_11_ < 50;
		 i_11_++)
		string = new StringBuilder().append(string).append
			     (class96.aClass525_Sub38_Sub2_1168.buffer
			      [i_11_])
			     .append
			     (Class55.aString560).toString();
	    Class525_Sub16_Sub13.method18448(string, exception, (byte) 126);
	    Class156.method2465(false, -1165092379);
	    return true;
	}
	return bool;
    }
}
