/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Container;
import java.awt.Insets;

public class Class97 implements Interface21
{
    int anInt1187;
    int anInt1188;
    int[] anIntArray1189;
    
    public int method80() {
	return -468435167 * anInt1187;
    }
    
    Class97(int i, int i_0_, int[] is) {
	anInt1188 = i * 1554287873;
	anInt1187 = i_0_ * 708314337;
	anIntArray1189 = is;
    }
    
    public int method1() {
	return -2080083199 * anInt1188;
    }
    
    public void method127() {
	/* empty */
    }
    
    public void method125() {
	/* empty */
    }
    
    public int method12() {
	return -2080083199 * anInt1188;
    }
    
    public int method57() {
	return -2080083199 * anInt1188;
    }
    
    public int method75() {
	return -468435167 * anInt1187;
    }
    
    public int method7() {
	return -468435167 * anInt1187;
    }
    
    public void method126() {
	/* empty */
    }
    
    Class97(int i, int i_1_) {
	this(i, i_1_, new int[i_1_ * i]);
    }
    
    static final void method1819(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub45_10710
		  .method17416(1310063534);
    }
    
    static void method1820(int i) {
	synchronized (Class327.aclient3575) {
	    if (null != Class96.aFrame1186) {
		/* empty */
	    } else {
		Container container = Class203.method3854(1955349051);
		if (container == null) {
		    /* empty */
		} else {
		    OutputStream_Sub1.anInt11049
			= container.getSize().width * 1023287415;
		    Class696_Sub9.anInt10903
			= container.getSize().height * -1847648899;
		    if (container == Class198_Sub7.aFrame9932) {
			Insets insets = Class198_Sub7.aFrame9932.getInsets();
			OutputStream_Sub1.anInt11049
			    -= (insets.right + insets.left) * 1023287415;
			Class696_Sub9.anInt10903
			    -= (insets.bottom + insets.top) * -1847648899;
		    }
		    if (-349587129 * OutputStream_Sub1.anInt11049 <= 0)
			OutputStream_Sub1.anInt11049 = 1023287415;
		    if (Class696_Sub9.anInt10903 * 1666450389 <= 0)
			Class696_Sub9.anInt10903 = -1847648899;
		    if (Class441.method7120((byte) -99) != 1)
			Class656_Sub1_Sub5_Sub1.method18728(341480293);
		    else {
			Class434.anInt4827 = -1051298351 * client.anInt11223;
			client.anInt5572
			    = (-2099836857
			       * ((OutputStream_Sub1.anInt11049 * -349587129
				   - client.anInt11223 * -1202561691)
				  / 2));
			Class696_Sub47.anInt11032
			    = -822190077 * client.anInt11224;
			client.anInt5573 = 0;
		    }
		    if (Class685.aClass685_8686 != Class176.aClass685_1884
			&& Class434.anInt4827 * -1445589163 < 1024
			&& Class696_Sub47.anInt11032 * -1883654023 >= 768) {
			/* empty */
		    }
		    Class532.aCanvas7169.setSize((Class434.anInt4827
						  * -1445589163),
						 (Class696_Sub47.anInt11032
						  * -1883654023));
		    if (Class501.aClass182_5564 != null) {
			Class501.aClass182_5564.method3157
			    (Class532.aCanvas7169,
			     Class434.anInt4827 * -1445589163,
			     -1883654023 * Class696_Sub47.anInt11032,
			     (byte) 11);
			Class262.method4774(Class501.aClass182_5564,
					    Class251.method4508((byte) 8));
		    }
		    if (container == Class198_Sub7.aFrame9932) {
			Insets insets = Class198_Sub7.aFrame9932.getInsets();
			Class532.aCanvas7169.setLocation
			    (client.anInt5572 * 288760183 + insets.left,
			     -1061711907 * client.anInt5573 + insets.top);
		    } else
			Class532.aCanvas7169.setLocation((288760183
							  * client.anInt5572),
							 (-1061711907
							  * client.anInt5573));
		    Class416.method6719((byte) -69);
		    if (-750203937 * client.anInt11260 != -1)
			Class198_Sub14.method15652(true, -502724722);
		    Class275.method5104((byte) -65);
		}
	    }
	}
    }
    
    static void method1821(int i) {
	if (null != Class328.aClass303_3583) {
	    Class159.aClass295_1755 = new Class295();
	    Class159.aClass295_1755.method5341
		(-4466893964599619831L * Class328.aLong3582,
		 Class328.aClass303_3583.aClass53_3391
		     .method1169(Class21.aClass666_213, 1552651121),
		 Class328.aClass303_3583.aClass53_3391
		     .method1169(Class21.aClass666_213, 1552651121),
		 Class328.aClass303_3583.anInt3385 * 1474421939,
		 Class328.aClass303_3583, -80136654);
	    Class328.aThread3581 = new Thread(Class159.aClass295_1755, "");
	    Class328.aThread3581.start();
	}
    }
}
