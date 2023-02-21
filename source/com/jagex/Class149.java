/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class149
{
    int anInt1701;
    Class168_Sub2_Sub2 aClass168_Sub2_Sub2_1702;
    Class168_Sub2_Sub2 aClass168_Sub2_Sub2_1703;
    Class168_Sub2_Sub2 aClass168_Sub2_Sub2_1704;
    int anInt1705 = 0;
    int anInt1706 = 0;
    Class136_Sub2[] aClass136_Sub2Array1707;
    Class136_Sub2 aClass136_Sub2_1708;
    Class525_Sub16_Sub2 aClass525_Sub16_Sub2_1709;
    Class709 aClass709_1710;
    boolean aBool1711;
    boolean aBool1712;
    boolean aBool1713;
    boolean aBool1714;
    Class182_Sub3 aClass182_Sub3_1715;
    Class525_Sub16_Sub2 aClass525_Sub16_Sub2_1716;
    int anInt1717;
    int anInt1718 = 1;
    boolean aBool1719;
    boolean aBool1720;
    Class178 aClass178_1721;
    
    boolean method2392() {
	return aClass168_Sub2_Sub2_1704 != null;
    }
    
    void method2393() {
	aClass168_Sub2_Sub2_1702 = null;
	aClass168_Sub2_Sub2_1703 = null;
	aClass168_Sub2_Sub2_1704 = null;
	aClass525_Sub16_Sub2_1709 = null;
	aClass136_Sub2_1708 = null;
	aClass136_Sub2Array1707 = null;
	aClass525_Sub16_Sub2_1716 = null;
	if (!aClass709_1710.method14363(1146926558)) {
	    for (Class525 class525
		     = aClass709_1710.method14372((short) -12036);
		 class525 != aClass709_1710.aClass525_8821;
		 class525 = class525.aClass525_7112)
		((Class525_Sub11) class525).method16203();
	}
	anInt1701 = 1;
	anInt1718 = 1;
    }
    
    void method2394(Class525_Sub11 class525_sub11) {
	class525_sub11.aBool10510 = false;
	class525_sub11.method16203();
	class525_sub11.method8755(-1933461091);
	method2418();
    }
    
    boolean method2395() {
	return aBool1720;
    }
    
    boolean method2396() {
	for (Class525_Sub11 class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14372((short) -5580);
	     class525_sub11 != null;
	     class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14353(-1660851974)) {
	    if (!class525_sub11.method16209())
		return false;
	}
	return true;
    }
    
    boolean method2397() {
	if (aBool1712) {
	    if (aClass525_Sub16_Sub2_1709 != null) {
		aClass525_Sub16_Sub2_1709.method127();
		aClass525_Sub16_Sub2_1709 = null;
	    }
	    if (aClass136_Sub2_1708 != null) {
		aClass136_Sub2_1708.method2310();
		aClass136_Sub2_1708 = null;
	    }
	}
	if (aBool1711) {
	    if (aClass525_Sub16_Sub2_1716 != null) {
		aClass525_Sub16_Sub2_1716.method127();
		aClass525_Sub16_Sub2_1716 = null;
	    }
	    if (aClass136_Sub2Array1707[0] != null) {
		aClass136_Sub2Array1707[0].method2310();
		aClass136_Sub2Array1707[0] = null;
	    }
	    if (aClass136_Sub2Array1707[1] != null) {
		aClass136_Sub2Array1707[1].method2310();
		aClass136_Sub2Array1707[1] = null;
	    }
	}
	if (aBool1712) {
	    if (aClass168_Sub2_Sub2_1703 != null)
		aClass525_Sub16_Sub2_1709
		    = new Class525_Sub16_Sub2(aClass182_Sub3_1715,
					      Class165.aClass165_1774,
					      Class178.aClass178_1913,
					      anInt1718, anInt1701,
					      aClass182_Sub3_1715.anInt9718);
	    if (aBool1719)
		aClass136_Sub2_1708
		    = new Class136_Sub2(aClass182_Sub3_1715, 34037,
					Class165.aClass165_1774,
					Class178.aClass178_1913, anInt1718,
					anInt1701);
	    else if (aClass525_Sub16_Sub2_1709 == null)
		aClass525_Sub16_Sub2_1709
		    = new Class525_Sub16_Sub2(aClass182_Sub3_1715,
					      Class165.aClass165_1774,
					      Class178.aClass178_1913,
					      anInt1718, anInt1701);
	    aBool1712 = false;
	    aBool1713 = true;
	    aBool1714 = true;
	}
	if (aBool1711) {
	    if (aClass168_Sub2_Sub2_1703 != null)
		aClass525_Sub16_Sub2_1716
		    = new Class525_Sub16_Sub2(aClass182_Sub3_1715,
					      Class165.aClass165_1771,
					      aClass178_1721, anInt1718,
					      anInt1701,
					      aClass182_Sub3_1715.anInt9718);
	    aClass136_Sub2Array1707[0]
		= new Class136_Sub2(aClass182_Sub3_1715, 34037,
				    Class165.aClass165_1771, aClass178_1721,
				    anInt1718, anInt1701);
	    aClass136_Sub2Array1707[1]
		= anInt1717 > 1 ? new Class136_Sub2(aClass182_Sub3_1715, 34037,
						    Class165.aClass165_1771,
						    aClass178_1721, anInt1718,
						    anInt1701) : null;
	    aBool1711 = false;
	    aBool1713 = true;
	    aBool1714 = true;
	}
	if (aBool1713) {
	    if (aClass168_Sub2_Sub2_1703 != null) {
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1702,
					       -1166817212);
		aClass168_Sub2_Sub2_1702.method15584(null);
		aClass168_Sub2_Sub2_1702.method15585(0, null);
		aClass168_Sub2_Sub2_1702.method15585(1, null);
		aClass168_Sub2_Sub2_1702
		    .method15585(0, aClass136_Sub2Array1707[0].method14472(0));
		aClass168_Sub2_Sub2_1702.method15585(1,
						     (anInt1717 > 1
						      ? aClass136_Sub2Array1707
							    [1].method14472(0)
						      : null));
		if (aBool1719)
		    aClass168_Sub2_Sub2_1702
			.method15584(aClass136_Sub2_1708.method14478(0));
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1702,
					       -1876999470);
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1703,
					       -1166817212);
		aClass168_Sub2_Sub2_1703.method15584(null);
		aClass168_Sub2_Sub2_1703.method15585(0, null);
		aClass168_Sub2_Sub2_1703
		    .method15585(0, aClass525_Sub16_Sub2_1716);
		aClass168_Sub2_Sub2_1703
		    .method15584(aClass525_Sub16_Sub2_1709);
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1703,
					       -1876999470);
	    } else {
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1702,
					       -1166817212);
		aClass168_Sub2_Sub2_1702.method15584(null);
		aClass168_Sub2_Sub2_1702.method15585(0, null);
		aClass168_Sub2_Sub2_1702.method15585(1, null);
		aClass168_Sub2_Sub2_1702
		    .method15585(0, aClass136_Sub2Array1707[0].method14472(0));
		aClass168_Sub2_Sub2_1702.method15585(1,
						     (anInt1717 > 1
						      ? aClass136_Sub2Array1707
							    [1].method14472(0)
						      : null));
		if (aBool1719)
		    aClass168_Sub2_Sub2_1702
			.method15584(aClass136_Sub2_1708.method14478(0));
		else
		    aClass168_Sub2_Sub2_1702
			.method15584(aClass525_Sub16_Sub2_1709);
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1702,
					       -1876999470);
	    }
	    aBool1713 = false;
	    aBool1714 = true;
	}
	if (aBool1714) {
	    aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1704,
					   -1166817212);
	    aBool1714 = !aClass168_Sub2_Sub2_1704.method15588();
	    aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1704,
					   -1876999470);
	}
	return !aBool1714;
    }
    
    boolean method2398(int i, int i_0_, int i_1_, int i_2_) {
	if (aClass168_Sub2_Sub2_1704 == null
	    || aClass709_1710.method14363(-1505265444) || method2396())
	    return false;
	if (anInt1718 != i_1_ || anInt1701 != i_2_) {
	    anInt1718 = i_1_;
	    anInt1701 = i_2_;
	    for (Class525 class525
		     = aClass709_1710.method14372((short) -11487);
		 class525 != aClass709_1710.aClass525_8821;
		 class525 = class525.aClass525_7112)
		((Class525_Sub11) class525).method16201(anInt1718, anInt1701);
	    aBool1711 = true;
	    aBool1712 = true;
	    aBool1713 = true;
	}
	if (method2397()) {
	    anInt1705 = i;
	    anInt1706 = i_0_;
	    aBool1720 = true;
	    aClass182_Sub3_1715.method15352(-anInt1705,
					    (anInt1701 + anInt1706
					     - aClass182_Sub3_1715.method3566
						   (-1785786902)
						   .method2711()));
	    aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1704,
					   -1166817212);
	    aClass168_Sub2_Sub2_1704.method18155(0);
	    aClass182_Sub3_1715.method3188(3, 0);
	    return true;
	}
	return false;
    }
    
    void method2399(int i, int i_3_) {
	if (aBool1720) {
	    if (aClass168_Sub2_Sub2_1703 != null) {
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1703,
					       -1876999470);
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1702,
					       -1166817212);
		aClass168_Sub2_Sub2_1702.method18155(0);
		aClass168_Sub2_Sub2_1703.method15596(0, 0, anInt1718,
						     anInt1701, 0, 0, true,
						     aBool1719);
	    }
	    aClass182_Sub3_1715.method15388();
	    aClass182_Sub3_1715.method15409(0);
	    aClass182_Sub3_1715.method15396(1);
	    aClass182_Sub3_1715.method3480();
	    int i_4_ = 0;
	    int i_5_ = 1;
	    int i_6_ = 0;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    Object object = null;
	    for (Class525_Sub11 class525_sub11
		     = ((Class525_Sub11)
			aClass709_1710.method14372((short) -5822));
		 class525_sub11 != null;
		 class525_sub11 = ((Class525_Sub11)
				   aClass709_1710.method14353(-1331116506))) {
		if (!class525_sub11.method16209())
		    i_7_++;
	    }
	    Class525_Sub11[] class525_sub11s = new Class525_Sub11[i_7_];
	    i_7_ = 0;
	    for (Class525_Sub11 class525_sub11
		     = ((Class525_Sub11)
			aClass709_1710.method14372((short) -23707));
		 class525_sub11 != null;
		 class525_sub11 = ((Class525_Sub11)
				   aClass709_1710.method14353(-1891944356))) {
		if (!class525_sub11.method16209())
		    class525_sub11s[i_7_++] = class525_sub11;
	    }
	    while (i_6_ < i_7_) {
		for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
		    Class525_Sub11 class525_sub11 = class525_sub11s[i_9_];
		    if (class525_sub11.method16199() == i_8_) {
			int i_10_ = class525_sub11.method16204();
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
			    aClass182_Sub3_1715.method15352(0, 0);
			    class525_sub11.method16200(i_11_,
						       (aClass136_Sub2Array1707
							[i_4_]),
						       aClass136_Sub2_1708,
						       i_3_, i);
			    if (i_11_ == i_10_ - 1 && i_6_ == i_7_ - 1) {
				aClass182_Sub3_1715.method3159
				    (aClass168_Sub2_Sub2_1702, -1876999470);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (0 + anInt1701));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(anInt1705, anInt1706);
				OpenGL.glTexCoord2f(0.0F, (float) (anInt1701
								   - i_3_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(anInt1705, anInt1706 + i_3_);
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (anInt1701
							     - i_3_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(anInt1705 + i,
						  anInt1706 + i_3_);
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (0 + anInt1701));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(anInt1705 + i, anInt1706);
				OpenGL.glEnd();
			    } else {
				aClass168_Sub2_Sub2_1702.method18155(i_5_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (float) anInt1701);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F, (float) (anInt1701
								   - i_3_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0, i_3_);
				OpenGL.glTexCoord2f((float) i,
						    (float) (anInt1701
							     - i_3_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(i, i_3_);
				OpenGL.glTexCoord2f((float) i,
						    (float) anInt1701);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(i, 0);
				OpenGL.glEnd();
			    }
			    class525_sub11.method16210(i_11_);
			    i_5_ = i_5_ + 1 & 0x1;
			    i_4_ = i_4_ + 1 & 0x1;
			}
			i_6_++;
		    }
		}
		i_8_++;
	    }
	    aBool1720 = false;
	    object = null;
	}
    }
    
    boolean method2400(Class525_Sub11 class525_sub11) {
	if (aClass168_Sub2_Sub2_1704 != null) {
	    if (class525_sub11.method16198() || class525_sub11.method16219()) {
		aClass709_1710.method14345(class525_sub11, (byte) 0);
		method2418();
		if (class525_sub11.method16199() >= 0 && method2397()) {
		    if (anInt1718 != -1 && anInt1701 != -1)
			class525_sub11.method16201(anInt1718, anInt1701);
		    class525_sub11.aBool10510 = true;
		    return true;
		}
	    }
	    method2406(class525_sub11);
	}
	return false;
    }
    
    boolean method2401() {
	if (aBool1712) {
	    if (aClass525_Sub16_Sub2_1709 != null) {
		aClass525_Sub16_Sub2_1709.method127();
		aClass525_Sub16_Sub2_1709 = null;
	    }
	    if (aClass136_Sub2_1708 != null) {
		aClass136_Sub2_1708.method2310();
		aClass136_Sub2_1708 = null;
	    }
	}
	if (aBool1711) {
	    if (aClass525_Sub16_Sub2_1716 != null) {
		aClass525_Sub16_Sub2_1716.method127();
		aClass525_Sub16_Sub2_1716 = null;
	    }
	    if (aClass136_Sub2Array1707[0] != null) {
		aClass136_Sub2Array1707[0].method2310();
		aClass136_Sub2Array1707[0] = null;
	    }
	    if (aClass136_Sub2Array1707[1] != null) {
		aClass136_Sub2Array1707[1].method2310();
		aClass136_Sub2Array1707[1] = null;
	    }
	}
	if (aBool1712) {
	    if (aClass168_Sub2_Sub2_1703 != null)
		aClass525_Sub16_Sub2_1709
		    = new Class525_Sub16_Sub2(aClass182_Sub3_1715,
					      Class165.aClass165_1774,
					      Class178.aClass178_1913,
					      anInt1718, anInt1701,
					      aClass182_Sub3_1715.anInt9718);
	    if (aBool1719)
		aClass136_Sub2_1708
		    = new Class136_Sub2(aClass182_Sub3_1715, 34037,
					Class165.aClass165_1774,
					Class178.aClass178_1913, anInt1718,
					anInt1701);
	    else if (aClass525_Sub16_Sub2_1709 == null)
		aClass525_Sub16_Sub2_1709
		    = new Class525_Sub16_Sub2(aClass182_Sub3_1715,
					      Class165.aClass165_1774,
					      Class178.aClass178_1913,
					      anInt1718, anInt1701);
	    aBool1712 = false;
	    aBool1713 = true;
	    aBool1714 = true;
	}
	if (aBool1711) {
	    if (aClass168_Sub2_Sub2_1703 != null)
		aClass525_Sub16_Sub2_1716
		    = new Class525_Sub16_Sub2(aClass182_Sub3_1715,
					      Class165.aClass165_1771,
					      aClass178_1721, anInt1718,
					      anInt1701,
					      aClass182_Sub3_1715.anInt9718);
	    aClass136_Sub2Array1707[0]
		= new Class136_Sub2(aClass182_Sub3_1715, 34037,
				    Class165.aClass165_1771, aClass178_1721,
				    anInt1718, anInt1701);
	    aClass136_Sub2Array1707[1]
		= anInt1717 > 1 ? new Class136_Sub2(aClass182_Sub3_1715, 34037,
						    Class165.aClass165_1771,
						    aClass178_1721, anInt1718,
						    anInt1701) : null;
	    aBool1711 = false;
	    aBool1713 = true;
	    aBool1714 = true;
	}
	if (aBool1713) {
	    if (aClass168_Sub2_Sub2_1703 != null) {
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1702,
					       -1166817212);
		aClass168_Sub2_Sub2_1702.method15584(null);
		aClass168_Sub2_Sub2_1702.method15585(0, null);
		aClass168_Sub2_Sub2_1702.method15585(1, null);
		aClass168_Sub2_Sub2_1702
		    .method15585(0, aClass136_Sub2Array1707[0].method14472(0));
		aClass168_Sub2_Sub2_1702.method15585(1,
						     (anInt1717 > 1
						      ? aClass136_Sub2Array1707
							    [1].method14472(0)
						      : null));
		if (aBool1719)
		    aClass168_Sub2_Sub2_1702
			.method15584(aClass136_Sub2_1708.method14478(0));
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1702,
					       -1876999470);
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1703,
					       -1166817212);
		aClass168_Sub2_Sub2_1703.method15584(null);
		aClass168_Sub2_Sub2_1703.method15585(0, null);
		aClass168_Sub2_Sub2_1703
		    .method15585(0, aClass525_Sub16_Sub2_1716);
		aClass168_Sub2_Sub2_1703
		    .method15584(aClass525_Sub16_Sub2_1709);
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1703,
					       -1876999470);
	    } else {
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1702,
					       -1166817212);
		aClass168_Sub2_Sub2_1702.method15584(null);
		aClass168_Sub2_Sub2_1702.method15585(0, null);
		aClass168_Sub2_Sub2_1702.method15585(1, null);
		aClass168_Sub2_Sub2_1702
		    .method15585(0, aClass136_Sub2Array1707[0].method14472(0));
		aClass168_Sub2_Sub2_1702.method15585(1,
						     (anInt1717 > 1
						      ? aClass136_Sub2Array1707
							    [1].method14472(0)
						      : null));
		if (aBool1719)
		    aClass168_Sub2_Sub2_1702
			.method15584(aClass136_Sub2_1708.method14478(0));
		else
		    aClass168_Sub2_Sub2_1702
			.method15584(aClass525_Sub16_Sub2_1709);
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1702,
					       -1876999470);
	    }
	    aBool1713 = false;
	    aBool1714 = true;
	}
	if (aBool1714) {
	    aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1704,
					   -1166817212);
	    aBool1714 = !aClass168_Sub2_Sub2_1704.method15588();
	    aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1704,
					   -1876999470);
	}
	return !aBool1714;
    }
    
    boolean method2402() {
	return aClass168_Sub2_Sub2_1704 != null;
    }
    
    void method2403() {
	aClass168_Sub2_Sub2_1702 = null;
	aClass168_Sub2_Sub2_1703 = null;
	aClass168_Sub2_Sub2_1704 = null;
	aClass525_Sub16_Sub2_1709 = null;
	aClass136_Sub2_1708 = null;
	aClass136_Sub2Array1707 = null;
	aClass525_Sub16_Sub2_1716 = null;
	if (!aClass709_1710.method14363(-1269279504)) {
	    for (Class525 class525
		     = aClass709_1710.method14372((short) -15047);
		 class525 != aClass709_1710.aClass525_8821;
		 class525 = class525.aClass525_7112)
		((Class525_Sub11) class525).method16203();
	}
	anInt1701 = 1;
	anInt1718 = 1;
    }
    
    void method2404() {
	aClass168_Sub2_Sub2_1702 = null;
	aClass168_Sub2_Sub2_1703 = null;
	aClass168_Sub2_Sub2_1704 = null;
	aClass525_Sub16_Sub2_1709 = null;
	aClass136_Sub2_1708 = null;
	aClass136_Sub2Array1707 = null;
	aClass525_Sub16_Sub2_1716 = null;
	if (!aClass709_1710.method14363(1297002398)) {
	    for (Class525 class525 = aClass709_1710.method14372((short) -5453);
		 class525 != aClass709_1710.aClass525_8821;
		 class525 = class525.aClass525_7112)
		((Class525_Sub11) class525).method16203();
	}
	anInt1701 = 1;
	anInt1718 = 1;
    }
    
    void method2405() {
	aClass168_Sub2_Sub2_1702 = null;
	aClass168_Sub2_Sub2_1703 = null;
	aClass168_Sub2_Sub2_1704 = null;
	aClass525_Sub16_Sub2_1709 = null;
	aClass136_Sub2_1708 = null;
	aClass136_Sub2Array1707 = null;
	aClass525_Sub16_Sub2_1716 = null;
	if (!aClass709_1710.method14363(-1656350963)) {
	    for (Class525 class525
		     = aClass709_1710.method14372((short) -11843);
		 class525 != aClass709_1710.aClass525_8821;
		 class525 = class525.aClass525_7112)
		((Class525_Sub11) class525).method16203();
	}
	anInt1701 = 1;
	anInt1718 = 1;
    }
    
    void method2406(Class525_Sub11 class525_sub11) {
	class525_sub11.aBool10510 = false;
	class525_sub11.method16203();
	class525_sub11.method8755(-1933461091);
	method2418();
    }
    
    boolean method2407() {
	return aClass168_Sub2_Sub2_1704 != null;
    }
    
    boolean method2408(Class525_Sub11 class525_sub11) {
	if (aClass168_Sub2_Sub2_1704 != null) {
	    if (class525_sub11.method16198() || class525_sub11.method16219()) {
		aClass709_1710.method14345(class525_sub11, (byte) 0);
		method2418();
		if (class525_sub11.method16199() >= 0 && method2397()) {
		    if (anInt1718 != -1 && anInt1701 != -1)
			class525_sub11.method16201(anInt1718, anInt1701);
		    class525_sub11.aBool10510 = true;
		    return true;
		}
	    }
	    method2406(class525_sub11);
	}
	return false;
    }
    
    boolean method2409() {
	return aClass168_Sub2_Sub2_1704 != null;
    }
    
    boolean method2410() {
	for (Class525_Sub11 class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14372((short) -9424);
	     class525_sub11 != null;
	     class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14353(-2146895310)) {
	    if (!class525_sub11.method16209())
		return false;
	}
	return true;
    }
    
    Class149(Class182_Sub3 class182_sub3) {
	anInt1701 = 1;
	aClass709_1710 = new Class709();
	aBool1711 = true;
	aBool1712 = true;
	aBool1713 = true;
	aBool1714 = true;
	aClass136_Sub2Array1707 = new Class136_Sub2[2];
	aBool1719 = false;
	anInt1717 = 0;
	aClass178_1721 = Class178.aClass178_1905;
	aClass182_Sub3_1715 = class182_sub3;
	if (aClass182_Sub3_1715.aBool9797 && aClass182_Sub3_1715.aBool9750) {
	    aClass168_Sub2_Sub2_1704 = aClass168_Sub2_Sub2_1702
		= new Class168_Sub2_Sub2(aClass182_Sub3_1715);
	    if (aClass182_Sub3_1715.anInt9718 > 1
		&& aClass182_Sub3_1715.aBool9798
		&& aClass182_Sub3_1715.aBool9682)
		aClass168_Sub2_Sub2_1704 = aClass168_Sub2_Sub2_1703
		    = new Class168_Sub2_Sub2(aClass182_Sub3_1715);
	}
    }
    
    boolean method2411() {
	for (Class525_Sub11 class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14372((short) -22733);
	     class525_sub11 != null;
	     class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14353(-1879082592)) {
	    if (!class525_sub11.method16209())
		return false;
	}
	return true;
    }
    
    void method2412(int i, int i_12_) {
	if (aBool1720) {
	    if (aClass168_Sub2_Sub2_1703 != null) {
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1703,
					       -1876999470);
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1702,
					       -1166817212);
		aClass168_Sub2_Sub2_1702.method18155(0);
		aClass168_Sub2_Sub2_1703.method15596(0, 0, anInt1718,
						     anInt1701, 0, 0, true,
						     aBool1719);
	    }
	    aClass182_Sub3_1715.method15388();
	    aClass182_Sub3_1715.method15409(0);
	    aClass182_Sub3_1715.method15396(1);
	    aClass182_Sub3_1715.method3480();
	    int i_13_ = 0;
	    int i_14_ = 1;
	    int i_15_ = 0;
	    int i_16_ = 0;
	    int i_17_ = 0;
	    Object object = null;
	    for (Class525_Sub11 class525_sub11
		     = ((Class525_Sub11)
			aClass709_1710.method14372((short) -19985));
		 class525_sub11 != null;
		 class525_sub11 = ((Class525_Sub11)
				   aClass709_1710.method14353(-1607070055))) {
		if (!class525_sub11.method16209())
		    i_16_++;
	    }
	    Class525_Sub11[] class525_sub11s = new Class525_Sub11[i_16_];
	    i_16_ = 0;
	    for (Class525_Sub11 class525_sub11
		     = ((Class525_Sub11)
			aClass709_1710.method14372((short) -4777));
		 class525_sub11 != null;
		 class525_sub11 = ((Class525_Sub11)
				   aClass709_1710.method14353(-1142260651))) {
		if (!class525_sub11.method16209())
		    class525_sub11s[i_16_++] = class525_sub11;
	    }
	    while (i_15_ < i_16_) {
		for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
		    Class525_Sub11 class525_sub11 = class525_sub11s[i_18_];
		    if (class525_sub11.method16199() == i_17_) {
			int i_19_ = class525_sub11.method16204();
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
			    aClass182_Sub3_1715.method15352(0, 0);
			    class525_sub11.method16200(i_20_,
						       (aClass136_Sub2Array1707
							[i_13_]),
						       aClass136_Sub2_1708,
						       i_12_, i);
			    if (i_20_ == i_19_ - 1 && i_15_ == i_16_ - 1) {
				aClass182_Sub3_1715.method3159
				    (aClass168_Sub2_Sub2_1702, -1876999470);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (0 + anInt1701));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(anInt1705, anInt1706);
				OpenGL.glTexCoord2f(0.0F, (float) (anInt1701
								   - i_12_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(anInt1705,
						  anInt1706 + i_12_);
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (anInt1701
							     - i_12_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(anInt1705 + i,
						  anInt1706 + i_12_);
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (0 + anInt1701));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(anInt1705 + i, anInt1706);
				OpenGL.glEnd();
			    } else {
				aClass168_Sub2_Sub2_1702.method18155(i_14_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (float) anInt1701);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F, (float) (anInt1701
								   - i_12_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0, i_12_);
				OpenGL.glTexCoord2f((float) i,
						    (float) (anInt1701
							     - i_12_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(i, i_12_);
				OpenGL.glTexCoord2f((float) i,
						    (float) anInt1701);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(i, 0);
				OpenGL.glEnd();
			    }
			    class525_sub11.method16210(i_20_);
			    i_14_ = i_14_ + 1 & 0x1;
			    i_13_ = i_13_ + 1 & 0x1;
			}
			i_15_++;
		    }
		}
		i_17_++;
	    }
	    aBool1720 = false;
	    object = null;
	}
    }
    
    boolean method2413() {
	for (Class525_Sub11 class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14372((short) -23661);
	     class525_sub11 != null;
	     class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14353(-2044490146)) {
	    if (!class525_sub11.method16209())
		return false;
	}
	return true;
    }
    
    boolean method2414() {
	if (aBool1712) {
	    if (aClass525_Sub16_Sub2_1709 != null) {
		aClass525_Sub16_Sub2_1709.method127();
		aClass525_Sub16_Sub2_1709 = null;
	    }
	    if (aClass136_Sub2_1708 != null) {
		aClass136_Sub2_1708.method2310();
		aClass136_Sub2_1708 = null;
	    }
	}
	if (aBool1711) {
	    if (aClass525_Sub16_Sub2_1716 != null) {
		aClass525_Sub16_Sub2_1716.method127();
		aClass525_Sub16_Sub2_1716 = null;
	    }
	    if (aClass136_Sub2Array1707[0] != null) {
		aClass136_Sub2Array1707[0].method2310();
		aClass136_Sub2Array1707[0] = null;
	    }
	    if (aClass136_Sub2Array1707[1] != null) {
		aClass136_Sub2Array1707[1].method2310();
		aClass136_Sub2Array1707[1] = null;
	    }
	}
	if (aBool1712) {
	    if (aClass168_Sub2_Sub2_1703 != null)
		aClass525_Sub16_Sub2_1709
		    = new Class525_Sub16_Sub2(aClass182_Sub3_1715,
					      Class165.aClass165_1774,
					      Class178.aClass178_1913,
					      anInt1718, anInt1701,
					      aClass182_Sub3_1715.anInt9718);
	    if (aBool1719)
		aClass136_Sub2_1708
		    = new Class136_Sub2(aClass182_Sub3_1715, 34037,
					Class165.aClass165_1774,
					Class178.aClass178_1913, anInt1718,
					anInt1701);
	    else if (aClass525_Sub16_Sub2_1709 == null)
		aClass525_Sub16_Sub2_1709
		    = new Class525_Sub16_Sub2(aClass182_Sub3_1715,
					      Class165.aClass165_1774,
					      Class178.aClass178_1913,
					      anInt1718, anInt1701);
	    aBool1712 = false;
	    aBool1713 = true;
	    aBool1714 = true;
	}
	if (aBool1711) {
	    if (aClass168_Sub2_Sub2_1703 != null)
		aClass525_Sub16_Sub2_1716
		    = new Class525_Sub16_Sub2(aClass182_Sub3_1715,
					      Class165.aClass165_1771,
					      aClass178_1721, anInt1718,
					      anInt1701,
					      aClass182_Sub3_1715.anInt9718);
	    aClass136_Sub2Array1707[0]
		= new Class136_Sub2(aClass182_Sub3_1715, 34037,
				    Class165.aClass165_1771, aClass178_1721,
				    anInt1718, anInt1701);
	    aClass136_Sub2Array1707[1]
		= anInt1717 > 1 ? new Class136_Sub2(aClass182_Sub3_1715, 34037,
						    Class165.aClass165_1771,
						    aClass178_1721, anInt1718,
						    anInt1701) : null;
	    aBool1711 = false;
	    aBool1713 = true;
	    aBool1714 = true;
	}
	if (aBool1713) {
	    if (aClass168_Sub2_Sub2_1703 != null) {
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1702,
					       -1166817212);
		aClass168_Sub2_Sub2_1702.method15584(null);
		aClass168_Sub2_Sub2_1702.method15585(0, null);
		aClass168_Sub2_Sub2_1702.method15585(1, null);
		aClass168_Sub2_Sub2_1702
		    .method15585(0, aClass136_Sub2Array1707[0].method14472(0));
		aClass168_Sub2_Sub2_1702.method15585(1,
						     (anInt1717 > 1
						      ? aClass136_Sub2Array1707
							    [1].method14472(0)
						      : null));
		if (aBool1719)
		    aClass168_Sub2_Sub2_1702
			.method15584(aClass136_Sub2_1708.method14478(0));
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1702,
					       -1876999470);
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1703,
					       -1166817212);
		aClass168_Sub2_Sub2_1703.method15584(null);
		aClass168_Sub2_Sub2_1703.method15585(0, null);
		aClass168_Sub2_Sub2_1703
		    .method15585(0, aClass525_Sub16_Sub2_1716);
		aClass168_Sub2_Sub2_1703
		    .method15584(aClass525_Sub16_Sub2_1709);
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1703,
					       -1876999470);
	    } else {
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1702,
					       -1166817212);
		aClass168_Sub2_Sub2_1702.method15584(null);
		aClass168_Sub2_Sub2_1702.method15585(0, null);
		aClass168_Sub2_Sub2_1702.method15585(1, null);
		aClass168_Sub2_Sub2_1702
		    .method15585(0, aClass136_Sub2Array1707[0].method14472(0));
		aClass168_Sub2_Sub2_1702.method15585(1,
						     (anInt1717 > 1
						      ? aClass136_Sub2Array1707
							    [1].method14472(0)
						      : null));
		if (aBool1719)
		    aClass168_Sub2_Sub2_1702
			.method15584(aClass136_Sub2_1708.method14478(0));
		else
		    aClass168_Sub2_Sub2_1702
			.method15584(aClass525_Sub16_Sub2_1709);
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1702,
					       -1876999470);
	    }
	    aBool1713 = false;
	    aBool1714 = true;
	}
	if (aBool1714) {
	    aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1704,
					   -1166817212);
	    aBool1714 = !aClass168_Sub2_Sub2_1704.method15588();
	    aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1704,
					   -1876999470);
	}
	return !aBool1714;
    }
    
    void method2415(int i, int i_21_) {
	if (aBool1720) {
	    if (aClass168_Sub2_Sub2_1703 != null) {
		aClass182_Sub3_1715.method3159(aClass168_Sub2_Sub2_1703,
					       -1876999470);
		aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1702,
					       -1166817212);
		aClass168_Sub2_Sub2_1702.method18155(0);
		aClass168_Sub2_Sub2_1703.method15596(0, 0, anInt1718,
						     anInt1701, 0, 0, true,
						     aBool1719);
	    }
	    aClass182_Sub3_1715.method15388();
	    aClass182_Sub3_1715.method15409(0);
	    aClass182_Sub3_1715.method15396(1);
	    aClass182_Sub3_1715.method3480();
	    int i_22_ = 0;
	    int i_23_ = 1;
	    int i_24_ = 0;
	    int i_25_ = 0;
	    int i_26_ = 0;
	    Object object = null;
	    for (Class525_Sub11 class525_sub11
		     = ((Class525_Sub11)
			aClass709_1710.method14372((short) -8958));
		 class525_sub11 != null;
		 class525_sub11 = ((Class525_Sub11)
				   aClass709_1710.method14353(-1687474014))) {
		if (!class525_sub11.method16209())
		    i_25_++;
	    }
	    Class525_Sub11[] class525_sub11s = new Class525_Sub11[i_25_];
	    i_25_ = 0;
	    for (Class525_Sub11 class525_sub11
		     = ((Class525_Sub11)
			aClass709_1710.method14372((short) -16893));
		 class525_sub11 != null;
		 class525_sub11 = ((Class525_Sub11)
				   aClass709_1710.method14353(-1235358163))) {
		if (!class525_sub11.method16209())
		    class525_sub11s[i_25_++] = class525_sub11;
	    }
	    while (i_24_ < i_25_) {
		for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
		    Class525_Sub11 class525_sub11 = class525_sub11s[i_27_];
		    if (class525_sub11.method16199() == i_26_) {
			int i_28_ = class525_sub11.method16204();
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
			    aClass182_Sub3_1715.method15352(0, 0);
			    class525_sub11.method16200(i_29_,
						       (aClass136_Sub2Array1707
							[i_22_]),
						       aClass136_Sub2_1708,
						       i_21_, i);
			    if (i_29_ == i_28_ - 1 && i_24_ == i_25_ - 1) {
				aClass182_Sub3_1715.method3159
				    (aClass168_Sub2_Sub2_1702, -1876999470);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (0 + anInt1701));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(anInt1705, anInt1706);
				OpenGL.glTexCoord2f(0.0F, (float) (anInt1701
								   - i_21_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(anInt1705,
						  anInt1706 + i_21_);
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (anInt1701
							     - i_21_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(anInt1705 + i,
						  anInt1706 + i_21_);
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (0 + anInt1701));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(anInt1705 + i, anInt1706);
				OpenGL.glEnd();
			    } else {
				aClass168_Sub2_Sub2_1702.method18155(i_23_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (float) anInt1701);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F, (float) (anInt1701
								   - i_21_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0, i_21_);
				OpenGL.glTexCoord2f((float) i,
						    (float) (anInt1701
							     - i_21_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(i, i_21_);
				OpenGL.glTexCoord2f((float) i,
						    (float) anInt1701);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(i, 0);
				OpenGL.glEnd();
			    }
			    class525_sub11.method16210(i_29_);
			    i_23_ = i_23_ + 1 & 0x1;
			    i_22_ = i_22_ + 1 & 0x1;
			}
			i_24_++;
		    }
		}
		i_26_++;
	    }
	    aBool1720 = false;
	    object = null;
	}
    }
    
    boolean method2416(int i, int i_30_, int i_31_, int i_32_) {
	if (aClass168_Sub2_Sub2_1704 == null
	    || aClass709_1710.method14363(2076694492) || method2396())
	    return false;
	if (anInt1718 != i_31_ || anInt1701 != i_32_) {
	    anInt1718 = i_31_;
	    anInt1701 = i_32_;
	    for (Class525 class525 = aClass709_1710.method14372((short) -5915);
		 class525 != aClass709_1710.aClass525_8821;
		 class525 = class525.aClass525_7112)
		((Class525_Sub11) class525).method16201(anInt1718, anInt1701);
	    aBool1711 = true;
	    aBool1712 = true;
	    aBool1713 = true;
	}
	if (method2397()) {
	    anInt1705 = i;
	    anInt1706 = i_30_;
	    aBool1720 = true;
	    aClass182_Sub3_1715.method15352(-anInt1705,
					    (anInt1701 + anInt1706
					     - aClass182_Sub3_1715.method3566
						   (-186878231).method2711()));
	    aClass182_Sub3_1715.method3158(aClass168_Sub2_Sub2_1704,
					   -1166817212);
	    aClass168_Sub2_Sub2_1704.method18155(0);
	    aClass182_Sub3_1715.method3188(3, 0);
	    return true;
	}
	return false;
    }
    
    boolean method2417(Class525_Sub11 class525_sub11) {
	if (aClass168_Sub2_Sub2_1704 != null) {
	    if (class525_sub11.method16198() || class525_sub11.method16219()) {
		aClass709_1710.method14345(class525_sub11, (byte) 0);
		method2418();
		if (class525_sub11.method16199() >= 0 && method2397()) {
		    if (anInt1718 != -1 && anInt1701 != -1)
			class525_sub11.method16201(anInt1718, anInt1701);
		    class525_sub11.aBool10510 = true;
		    return true;
		}
	    }
	    method2406(class525_sub11);
	}
	return false;
    }
    
    void method2418() {
	int i = 0;
	boolean bool = false;
	Class178 class178 = Class178.aClass178_1905;
	for (Class525_Sub11 class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14372((short) -19377);
	     class525_sub11 != null;
	     class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14353(-1644991992)) {
	    Class178 class178_33_ = class525_sub11.method16228();
	    if (class178_33_.anInt1915 * -103623665
		> class178.anInt1915 * -103623665)
		class178 = class178_33_;
	    bool |= class525_sub11.method16206();
	    i += class525_sub11.method16204();
	}
	if (class178 != aClass178_1721) {
	    aClass178_1721 = class178;
	    aBool1711 = true;
	}
	int i_34_ = anInt1717 > 2 ? 2 : anInt1717;
	int i_35_ = i > 2 ? 2 : i;
	if (i_34_ != i_35_) {
	    aBool1711 = true;
	    aBool1713 = true;
	}
	if (bool != aBool1719) {
	    aBool1719 = bool;
	    aBool1712 = true;
	}
	anInt1717 = i;
    }
    
    void method2419(Class525_Sub11 class525_sub11) {
	class525_sub11.aBool10510 = false;
	class525_sub11.method16203();
	class525_sub11.method8755(-1933461091);
	method2418();
    }
    
    void method2420() {
	aClass168_Sub2_Sub2_1702 = null;
	aClass168_Sub2_Sub2_1703 = null;
	aClass168_Sub2_Sub2_1704 = null;
	aClass525_Sub16_Sub2_1709 = null;
	aClass136_Sub2_1708 = null;
	aClass136_Sub2Array1707 = null;
	aClass525_Sub16_Sub2_1716 = null;
	if (!aClass709_1710.method14363(1422071931)) {
	    for (Class525 class525
		     = aClass709_1710.method14372((short) -21853);
		 class525 != aClass709_1710.aClass525_8821;
		 class525 = class525.aClass525_7112)
		((Class525_Sub11) class525).method16203();
	}
	anInt1701 = 1;
	anInt1718 = 1;
    }
    
    void method2421() {
	int i = 0;
	boolean bool = false;
	Class178 class178 = Class178.aClass178_1905;
	for (Class525_Sub11 class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14372((short) -3861);
	     class525_sub11 != null;
	     class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14353(-1841862640)) {
	    Class178 class178_36_ = class525_sub11.method16228();
	    if (class178_36_.anInt1915 * -103623665
		> class178.anInt1915 * -103623665)
		class178 = class178_36_;
	    bool |= class525_sub11.method16206();
	    i += class525_sub11.method16204();
	}
	if (class178 != aClass178_1721) {
	    aClass178_1721 = class178;
	    aBool1711 = true;
	}
	int i_37_ = anInt1717 > 2 ? 2 : anInt1717;
	int i_38_ = i > 2 ? 2 : i;
	if (i_37_ != i_38_) {
	    aBool1711 = true;
	    aBool1713 = true;
	}
	if (bool != aBool1719) {
	    aBool1719 = bool;
	    aBool1712 = true;
	}
	anInt1717 = i;
    }
    
    void method2422() {
	int i = 0;
	boolean bool = false;
	Class178 class178 = Class178.aClass178_1905;
	for (Class525_Sub11 class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14372((short) -9210);
	     class525_sub11 != null;
	     class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14353(-1737420523)) {
	    Class178 class178_39_ = class525_sub11.method16228();
	    if (class178_39_.anInt1915 * -103623665
		> class178.anInt1915 * -103623665)
		class178 = class178_39_;
	    bool |= class525_sub11.method16206();
	    i += class525_sub11.method16204();
	}
	if (class178 != aClass178_1721) {
	    aClass178_1721 = class178;
	    aBool1711 = true;
	}
	int i_40_ = anInt1717 > 2 ? 2 : anInt1717;
	int i_41_ = i > 2 ? 2 : i;
	if (i_40_ != i_41_) {
	    aBool1711 = true;
	    aBool1713 = true;
	}
	if (bool != aBool1719) {
	    aBool1719 = bool;
	    aBool1712 = true;
	}
	anInt1717 = i;
    }
    
    void method2423() {
	int i = 0;
	boolean bool = false;
	Class178 class178 = Class178.aClass178_1905;
	for (Class525_Sub11 class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14372((short) -24837);
	     class525_sub11 != null;
	     class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14353(-1770411497)) {
	    Class178 class178_42_ = class525_sub11.method16228();
	    if (class178_42_.anInt1915 * -103623665
		> class178.anInt1915 * -103623665)
		class178 = class178_42_;
	    bool |= class525_sub11.method16206();
	    i += class525_sub11.method16204();
	}
	if (class178 != aClass178_1721) {
	    aClass178_1721 = class178;
	    aBool1711 = true;
	}
	int i_43_ = anInt1717 > 2 ? 2 : anInt1717;
	int i_44_ = i > 2 ? 2 : i;
	if (i_43_ != i_44_) {
	    aBool1711 = true;
	    aBool1713 = true;
	}
	if (bool != aBool1719) {
	    aBool1719 = bool;
	    aBool1712 = true;
	}
	anInt1717 = i;
    }
    
    void method2424() {
	int i = 0;
	boolean bool = false;
	Class178 class178 = Class178.aClass178_1905;
	for (Class525_Sub11 class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14372((short) -17584);
	     class525_sub11 != null;
	     class525_sub11
		 = (Class525_Sub11) aClass709_1710.method14353(-2062483457)) {
	    Class178 class178_45_ = class525_sub11.method16228();
	    if (class178_45_.anInt1915 * -103623665
		> class178.anInt1915 * -103623665)
		class178 = class178_45_;
	    bool |= class525_sub11.method16206();
	    i += class525_sub11.method16204();
	}
	if (class178 != aClass178_1721) {
	    aClass178_1721 = class178;
	    aBool1711 = true;
	}
	int i_46_ = anInt1717 > 2 ? 2 : anInt1717;
	int i_47_ = i > 2 ? 2 : i;
	if (i_46_ != i_47_) {
	    aBool1711 = true;
	    aBool1713 = true;
	}
	if (bool != aBool1719) {
	    aBool1719 = bool;
	    aBool1712 = true;
	}
	anInt1717 = i;
    }
}
