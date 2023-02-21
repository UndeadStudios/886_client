/* Class586 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;
import java.util.Iterator;

public class Class586 implements Interface7, Interface12
{
    public boolean aBool7727;
    public int[][] anIntArrayArray7728;
    public int[] anIntArray7729;
    int anInt7730;
    public int anInt7731;
    public int[] anIntArray7732;
    public int anInt7733;
    public int anInt7734;
    public int anInt7735;
    public int anInt7736;
    public int anInt7737;
    public int anInt7738;
    public int anInt7739;
    public int anInt7740;
    public int anInt7741;
    public int anInt7742;
    public int anInt7743;
    public int anInt7744;
    public int anInt7745;
    public int anInt7746;
    public int anInt7747;
    public int anInt7748;
    public int anInt7749;
    public int anInt7750;
    public int anInt7751;
    public int anInt7752;
    public int anInt7753;
    public int anInt7754;
    public int[][] anIntArrayArray7755;
    public int anInt7756;
    Class444[] aClass444Array7757;
    public int[] anIntArray7758;
    public int[] anIntArray7759;
    public int anInt7760;
    public int anInt7761;
    public int anInt7762;
    public int anInt7763;
    public int anInt7764;
    public int anInt7765;
    public int anInt7766;
    public int anInt7767;
    public int anInt7768 = 884391859;
    public int anInt7769;
    public int anInt7770;
    static Class175 aClass175_7771;
    
    public void method67(int i) {
	/* empty */
    }
    
    Class586(int i) {
	anIntArray7732 = null;
	anIntArray7729 = null;
	anInt7730 = 0;
	anInt7731 = -234385981;
	anInt7756 = 40259883;
	anInt7733 = -1562984613;
	anInt7734 = 1867423875;
	anInt7735 = -2095997355;
	anInt7736 = 2127439839;
	anInt7737 = 1369568567;
	anInt7738 = 855410301;
	anInt7749 = -1073799297;
	anInt7740 = 1540603187;
	anInt7741 = 1135756229;
	anInt7742 = 724638693;
	anInt7762 = 310285211;
	anInt7744 = -699004219;
	anInt7745 = 244329757;
	anInt7746 = -1804424375;
	anInt7747 = 639760989;
	anInt7770 = -957870867;
	anInt7750 = 1664395891;
	anInt7739 = -1416662611;
	anInt7751 = 0;
	anInt7752 = 0;
	anInt7753 = 0;
	anInt7754 = 0;
	anInt7743 = 0;
	anInt7761 = 0;
	anInt7760 = 0;
	anInt7763 = 0;
	anInt7748 = 0;
	anInt7764 = 0;
	anInt7766 = 0;
	anInt7767 = 0;
	anInt7765 = -647835199;
	anInt7769 = -1795064297;
	aBool7727 = true;
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(1271690432);
	    if (i_0_ == 0)
		break;
	    method9664(class525_sub38, i_0_, -2138348557);
	}
    }
    
    void method9664(RSBuffer class525_sub38, int i, int i_1_) {
	if (i == 1) {
	    anInt7768 = class525_sub38.readBigSmart(-2043778683) * -884391859;
	    anInt7733 = class525_sub38.readBigSmart(-2043778683) * 1562984613;
	} else if (2 == i)
	    anInt7741 = class525_sub38.readBigSmart(-2043778683) * -1135756229;
	else if (3 == i)
	    anInt7742 = class525_sub38.readBigSmart(-2043778683) * -724638693;
	else if (i == 4)
	    anInt7762 = class525_sub38.readBigSmart(-2043778683) * -310285211;
	else if (5 == i)
	    anInt7744 = class525_sub38.readBigSmart(-2043778683) * 699004219;
	else if (6 == i)
	    anInt7737 = class525_sub38.readBigSmart(-2043778683) * -1369568567;
	else if (7 == i)
	    anInt7738 = class525_sub38.readBigSmart(-2043778683) * -855410301;
	else if (i == 8)
	    anInt7749 = class525_sub38.readBigSmart(-2043778683) * 1073799297;
	else if (9 == i)
	    anInt7740 = class525_sub38.readBigSmart(-2043778683) * -1540603187;
	else if (26 == i) {
	    anInt7751 = ((short) (class525_sub38.readUnsignedByte(1625035494) * 4)
			 * 1309237159);
	    anInt7752 = ((short) (class525_sub38.readUnsignedByte(290424305) * 4)
			 * -254795329);
	} else if (27 == i) {
	    int i_2_ = class525_sub38.readUnsignedByte(971538615);
	    if (null == anIntArrayArray7755)
		anIntArrayArray7755 = new int[i_2_ + 1][];
	    else if (i_2_ >= anIntArrayArray7755.length)
		anIntArrayArray7755
		    = (int[][]) Arrays.copyOf(anIntArrayArray7755, i_2_ + 1);
	    anIntArrayArray7755[i_2_] = new int[6];
	    for (int i_3_ = 0; i_3_ < 6; i_3_++)
		anIntArrayArray7755[i_2_][i_3_]
		    = class525_sub38.method16625((byte) 61);
	} else if (i == 28) {
	    int i_4_ = class525_sub38.readUnsignedByte(1840431734);
	    anIntArray7759 = new int[i_4_];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		anIntArray7759[i_5_] = class525_sub38.readUnsignedByte(1528448824);
		if (255 == anIntArray7759[i_5_])
		    anIntArray7759[i_5_] = -1;
	    }
	} else if (i == 29)
	    anInt7743 = class525_sub38.readUnsignedByte(1137438851) * -1014455935;
	else if (i == 30)
	    anInt7761 = class525_sub38.readUnsignedShort((byte) 55) * -1052623633;
	else if (i == 31)
	    anInt7760 = class525_sub38.readUnsignedByte(372408784) * 1191659921;
	else if (32 == i)
	    anInt7763 = class525_sub38.readUnsignedShort((byte) 7) * 64866045;
	else if (i == 33)
	    anInt7748 = class525_sub38.method16625((byte) -93) * 2135471725;
	else if (i == 34)
	    anInt7764 = class525_sub38.readUnsignedByte(1060396148) * 1939266325;
	else if (i == 35)
	    anInt7766 = class525_sub38.readUnsignedShort((byte) 27) * -1167146635;
	else if (i == 36)
	    anInt7767 = class525_sub38.method16625((byte) 43) * -308088815;
	else if (i == 37)
	    anInt7765 = class525_sub38.readUnsignedByte(998771161) * 647835199;
	else if (i == 38)
	    anInt7731 = class525_sub38.readBigSmart(-2043778683) * 234385981;
	else if (39 == i)
	    anInt7756 = class525_sub38.readBigSmart(-2043778683) * -40259883;
	else if (i == 40)
	    anInt7734 = class525_sub38.readBigSmart(-2043778683) * -1867423875;
	else if (i == 41)
	    anInt7735 = class525_sub38.readBigSmart(-2043778683) * 2095997355;
	else if (i == 42)
	    anInt7736 = class525_sub38.readBigSmart(-2043778683) * -2127439839;
	else if (i == 43)
	    class525_sub38.readUnsignedShort((byte) 77);
	else if (44 == i)
	    class525_sub38.readUnsignedShort((byte) 108);
	else if (45 == i)
	    anInt7769 = class525_sub38.readUnsignedShort((byte) 49) * 1795064297;
	else if (46 == i)
	    anInt7745 = class525_sub38.readBigSmart(-2043778683) * -244329757;
	else if (i == 47)
	    anInt7746 = class525_sub38.readBigSmart(-2043778683) * 1804424375;
	else if (i == 48)
	    anInt7747 = class525_sub38.readBigSmart(-2043778683) * -639760989;
	else if (49 == i)
	    anInt7770 = class525_sub38.readBigSmart(-2043778683) * 957870867;
	else if (i == 50)
	    anInt7750 = class525_sub38.readBigSmart(-2043778683) * -1664395891;
	else if (i == 51)
	    anInt7739 = class525_sub38.readBigSmart(-2043778683) * 1416662611;
	else if (52 == i) {
	    int i_6_ = class525_sub38.readUnsignedByte(1274016400);
	    anIntArray7732 = new int[i_6_];
	    anIntArray7729 = new int[i_6_];
	    for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
		anIntArray7732[i_7_] = class525_sub38.readBigSmart(-2043778683);
		int i_8_ = class525_sub38.readUnsignedByte(2074286328);
		anIntArray7729[i_7_] = i_8_;
		anInt7730 += i_8_ * 1002656149;
	    }
	} else if (i == 53)
	    aBool7727 = false;
	else if (i == 54) {
	    anInt7753
		= (class525_sub38.readUnsignedByte(1337332726) << 6) * 249662571;
	    anInt7754
		= (class525_sub38.readUnsignedByte(1684657243) << 6) * -1982001687;
	} else if (55 == i) {
	    int i_9_ = class525_sub38.readUnsignedByte(1849500600);
	    if (null == anIntArray7758)
		anIntArray7758 = new int[i_9_ + 1];
	    else if (i_9_ >= anIntArray7758.length)
		anIntArray7758 = Arrays.copyOf(anIntArray7758, i_9_ + 1);
	    anIntArray7758[i_9_] = class525_sub38.readUnsignedShort((byte) 77);
	} else if (56 == i) {
	    int i_10_ = class525_sub38.readUnsignedByte(119444646);
	    if (anIntArrayArray7728 == null)
		anIntArrayArray7728 = new int[1 + i_10_][];
	    else if (i_10_ >= anIntArrayArray7728.length)
		anIntArrayArray7728
		    = (int[][]) Arrays.copyOf(anIntArrayArray7728, 1 + i_10_);
	    anIntArrayArray7728[i_10_] = new int[3];
	    for (int i_11_ = 0; i_11_ < 3; i_11_++)
		anIntArrayArray7728[i_10_][i_11_]
		    = class525_sub38.method16625((byte) -11);
	}
    }
    
    Class586() {
	anIntArray7732 = null;
	anIntArray7729 = null;
	anInt7730 = 0;
	anInt7731 = -234385981;
	anInt7756 = 40259883;
	anInt7733 = -1562984613;
	anInt7734 = 1867423875;
	anInt7735 = -2095997355;
	anInt7736 = 2127439839;
	anInt7737 = 1369568567;
	anInt7738 = 855410301;
	anInt7749 = -1073799297;
	anInt7740 = 1540603187;
	anInt7741 = 1135756229;
	anInt7742 = 724638693;
	anInt7762 = 310285211;
	anInt7744 = -699004219;
	anInt7745 = 244329757;
	anInt7746 = -1804424375;
	anInt7747 = 639760989;
	anInt7770 = -957870867;
	anInt7750 = 1664395891;
	anInt7739 = -1416662611;
	anInt7751 = 0;
	anInt7752 = 0;
	anInt7753 = 0;
	anInt7754 = 0;
	anInt7743 = 0;
	anInt7761 = 0;
	anInt7760 = 0;
	anInt7763 = 0;
	anInt7748 = 0;
	anInt7764 = 0;
	anInt7766 = 0;
	anInt7767 = 0;
	anInt7765 = -647835199;
	anInt7769 = -1795064297;
	aBool7727 = true;
    }
    
    public int method9665(byte i) {
	if (anInt7768 * 985921669 != -1)
	    return anInt7768 * 985921669;
	if (anIntArray7732 != null) {
	    int i_12_
		= (int) (Math.random() * (double) (anInt7730 * -2078117443));
	    int i_13_;
	    for (i_13_ = 0; i_12_ >= anIntArray7729[i_13_]; i_13_++)
		i_12_ -= anIntArray7729[i_13_];
	    return anIntArray7732[i_13_];
	}
	return -1;
    }
    
    public boolean method9666(int i, int i_14_) {
	if (i == -1)
	    return false;
	if (985921669 * anInt7768 == i)
	    return true;
	if (null != anIntArray7732) {
	    for (int i_15_ = 0; i_15_ < anIntArray7732.length; i_15_++) {
		if (anIntArray7732[i_15_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    public Class444[] method9667(byte i) {
	if (null != aClass444Array7757)
	    return aClass444Array7757;
	if (null == anIntArrayArray7755)
	    return null;
	aClass444Array7757 = new Class444[anIntArrayArray7755.length];
	for (int i_16_ = 0; i_16_ < anIntArrayArray7755.length; i_16_++) {
	    int i_17_ = 0;
	    int i_18_ = 0;
	    int i_19_ = 0;
	    int i_20_ = 0;
	    int i_21_ = 0;
	    int i_22_ = 0;
	    if (anIntArrayArray7755[i_16_] != null) {
		i_17_ = anIntArrayArray7755[i_16_][0];
		i_18_ = anIntArrayArray7755[i_16_][1];
		i_19_ = anIntArrayArray7755[i_16_][2];
		i_20_ = anIntArrayArray7755[i_16_][3] << 3;
		i_21_ = anIntArrayArray7755[i_16_][4] << 3;
		i_22_ = anIntArrayArray7755[i_16_][5] << 3;
	    }
	    if (i_17_ != 0 || 0 != i_18_ || i_19_ != 0 || 0 != i_20_
		|| i_21_ != 0 || 0 != i_22_) {
		Class444 class444 = aClass444Array7757[i_16_] = new Class444();
		if (0 != i_22_)
		    class444.method7142(0.0F, 0.0F, 1.0F,
					Class436.method7071(i_22_));
		if (0 != i_20_)
		    class444.method7142(1.0F, 0.0F, 0.0F,
					Class436.method7071(i_20_));
		if (i_21_ != 0)
		    class444.method7142(0.0F, 1.0F, 0.0F,
					Class436.method7071(i_21_));
		class444.method7147((float) i_17_, (float) i_18_,
				    (float) i_19_);
	    }
	}
	return aClass444Array7757;
    }
    
    public boolean method9668(int i) {
	if (i == -1)
	    return false;
	if (985921669 * anInt7768 == i)
	    return true;
	if (null != anIntArray7732) {
	    for (int i_23_ = 0; i_23_ < anIntArray7732.length; i_23_++) {
		if (anIntArray7732[i_23_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    public void method54(int i, byte i_24_) {
	/* empty */
    }
    
    static final void method9669(int i, Class10 class10) {
	if (-1 != i && class10.method684((long) i) == null)
	    class10.method695(new Class525(), (long) i);
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(461859912);
	    if (i == 0)
		break;
	    method9664(class525_sub38, i, -2141857379);
	}
    }
    
    public void method53(int i) {
	/* empty */
    }
    
    public int method9670() {
	if (anInt7768 * 985921669 != -1)
	    return anInt7768 * 985921669;
	if (anIntArray7732 != null) {
	    int i = (int) (Math.random() * (double) (anInt7730 * -2078117443));
	    int i_25_;
	    for (i_25_ = 0; i >= anIntArray7729[i_25_]; i_25_++)
		i -= anIntArray7729[i_25_];
	    return anIntArray7732[i_25_];
	}
	return -1;
    }
    
    void method9671(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    anInt7768 = class525_sub38.readBigSmart(-2043778683) * -884391859;
	    anInt7733 = class525_sub38.readBigSmart(-2043778683) * 1562984613;
	} else if (2 == i)
	    anInt7741 = class525_sub38.readBigSmart(-2043778683) * -1135756229;
	else if (3 == i)
	    anInt7742 = class525_sub38.readBigSmart(-2043778683) * -724638693;
	else if (i == 4)
	    anInt7762 = class525_sub38.readBigSmart(-2043778683) * -310285211;
	else if (5 == i)
	    anInt7744 = class525_sub38.readBigSmart(-2043778683) * 699004219;
	else if (6 == i)
	    anInt7737 = class525_sub38.readBigSmart(-2043778683) * -1369568567;
	else if (7 == i)
	    anInt7738 = class525_sub38.readBigSmart(-2043778683) * -855410301;
	else if (i == 8)
	    anInt7749 = class525_sub38.readBigSmart(-2043778683) * 1073799297;
	else if (9 == i)
	    anInt7740 = class525_sub38.readBigSmart(-2043778683) * -1540603187;
	else if (26 == i) {
	    anInt7751 = ((short) (class525_sub38.readUnsignedByte(2115082367) * 4)
			 * 1309237159);
	    anInt7752 = ((short) (class525_sub38.readUnsignedByte(395209371) * 4)
			 * -254795329);
	} else if (27 == i) {
	    int i_26_ = class525_sub38.readUnsignedByte(1699321585);
	    if (null == anIntArrayArray7755)
		anIntArrayArray7755 = new int[i_26_ + 1][];
	    else if (i_26_ >= anIntArrayArray7755.length)
		anIntArrayArray7755
		    = (int[][]) Arrays.copyOf(anIntArrayArray7755, i_26_ + 1);
	    anIntArrayArray7755[i_26_] = new int[6];
	    for (int i_27_ = 0; i_27_ < 6; i_27_++)
		anIntArrayArray7755[i_26_][i_27_]
		    = class525_sub38.method16625((byte) 90);
	} else if (i == 28) {
	    int i_28_ = class525_sub38.readUnsignedByte(1328977384);
	    anIntArray7759 = new int[i_28_];
	    for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
		anIntArray7759[i_29_] = class525_sub38.readUnsignedByte(1065725396);
		if (255 == anIntArray7759[i_29_])
		    anIntArray7759[i_29_] = -1;
	    }
	} else if (i == 29)
	    anInt7743 = class525_sub38.readUnsignedByte(717718053) * -1014455935;
	else if (i == 30)
	    anInt7761 = class525_sub38.readUnsignedShort((byte) 84) * -1052623633;
	else if (i == 31)
	    anInt7760 = class525_sub38.readUnsignedByte(2106041418) * 1191659921;
	else if (32 == i)
	    anInt7763 = class525_sub38.readUnsignedShort((byte) 14) * 64866045;
	else if (i == 33)
	    anInt7748 = class525_sub38.method16625((byte) -9) * 2135471725;
	else if (i == 34)
	    anInt7764 = class525_sub38.readUnsignedByte(594586212) * 1939266325;
	else if (i == 35)
	    anInt7766 = class525_sub38.readUnsignedShort((byte) 96) * -1167146635;
	else if (i == 36)
	    anInt7767 = class525_sub38.method16625((byte) -41) * -308088815;
	else if (i == 37)
	    anInt7765 = class525_sub38.readUnsignedByte(979570898) * 647835199;
	else if (i == 38)
	    anInt7731 = class525_sub38.readBigSmart(-2043778683) * 234385981;
	else if (39 == i)
	    anInt7756 = class525_sub38.readBigSmart(-2043778683) * -40259883;
	else if (i == 40)
	    anInt7734 = class525_sub38.readBigSmart(-2043778683) * -1867423875;
	else if (i == 41)
	    anInt7735 = class525_sub38.readBigSmart(-2043778683) * 2095997355;
	else if (i == 42)
	    anInt7736 = class525_sub38.readBigSmart(-2043778683) * -2127439839;
	else if (i == 43)
	    class525_sub38.readUnsignedShort((byte) 39);
	else if (44 == i)
	    class525_sub38.readUnsignedShort((byte) 70);
	else if (45 == i)
	    anInt7769 = class525_sub38.readUnsignedShort((byte) 99) * 1795064297;
	else if (46 == i)
	    anInt7745 = class525_sub38.readBigSmart(-2043778683) * -244329757;
	else if (i == 47)
	    anInt7746 = class525_sub38.readBigSmart(-2043778683) * 1804424375;
	else if (i == 48)
	    anInt7747 = class525_sub38.readBigSmart(-2043778683) * -639760989;
	else if (49 == i)
	    anInt7770 = class525_sub38.readBigSmart(-2043778683) * 957870867;
	else if (i == 50)
	    anInt7750 = class525_sub38.readBigSmart(-2043778683) * -1664395891;
	else if (i == 51)
	    anInt7739 = class525_sub38.readBigSmart(-2043778683) * 1416662611;
	else if (52 == i) {
	    int i_30_ = class525_sub38.readUnsignedByte(2012714305);
	    anIntArray7732 = new int[i_30_];
	    anIntArray7729 = new int[i_30_];
	    for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
		anIntArray7732[i_31_]
		    = class525_sub38.readBigSmart(-2043778683);
		int i_32_ = class525_sub38.readUnsignedByte(604735868);
		anIntArray7729[i_31_] = i_32_;
		anInt7730 += i_32_ * 1002656149;
	    }
	} else if (i == 53)
	    aBool7727 = false;
	else if (i == 54) {
	    anInt7753
		= (class525_sub38.readUnsignedByte(2135735294) << 6) * 249662571;
	    anInt7754
		= (class525_sub38.readUnsignedByte(251016130) << 6) * -1982001687;
	} else if (55 == i) {
	    int i_33_ = class525_sub38.readUnsignedByte(1989243958);
	    if (null == anIntArray7758)
		anIntArray7758 = new int[i_33_ + 1];
	    else if (i_33_ >= anIntArray7758.length)
		anIntArray7758 = Arrays.copyOf(anIntArray7758, i_33_ + 1);
	    anIntArray7758[i_33_] = class525_sub38.readUnsignedShort((byte) 103);
	} else if (56 == i) {
	    int i_34_ = class525_sub38.readUnsignedByte(1587779537);
	    if (anIntArrayArray7728 == null)
		anIntArrayArray7728 = new int[1 + i_34_][];
	    else if (i_34_ >= anIntArrayArray7728.length)
		anIntArrayArray7728
		    = (int[][]) Arrays.copyOf(anIntArrayArray7728, 1 + i_34_);
	    anIntArrayArray7728[i_34_] = new int[3];
	    for (int i_35_ = 0; i_35_ < 3; i_35_++)
		anIntArrayArray7728[i_34_][i_35_]
		    = class525_sub38.method16625((byte) 20);
	}
    }
    
    void method9672(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    anInt7768 = class525_sub38.readBigSmart(-2043778683) * -884391859;
	    anInt7733 = class525_sub38.readBigSmart(-2043778683) * 1562984613;
	} else if (2 == i)
	    anInt7741 = class525_sub38.readBigSmart(-2043778683) * -1135756229;
	else if (3 == i)
	    anInt7742 = class525_sub38.readBigSmart(-2043778683) * -724638693;
	else if (i == 4)
	    anInt7762 = class525_sub38.readBigSmart(-2043778683) * -310285211;
	else if (5 == i)
	    anInt7744 = class525_sub38.readBigSmart(-2043778683) * 699004219;
	else if (6 == i)
	    anInt7737 = class525_sub38.readBigSmart(-2043778683) * -1369568567;
	else if (7 == i)
	    anInt7738 = class525_sub38.readBigSmart(-2043778683) * -855410301;
	else if (i == 8)
	    anInt7749 = class525_sub38.readBigSmart(-2043778683) * 1073799297;
	else if (9 == i)
	    anInt7740 = class525_sub38.readBigSmart(-2043778683) * -1540603187;
	else if (26 == i) {
	    anInt7751 = ((short) (class525_sub38.readUnsignedByte(960048768) * 4)
			 * 1309237159);
	    anInt7752 = ((short) (class525_sub38.readUnsignedByte(1638978855) * 4)
			 * -254795329);
	} else if (27 == i) {
	    int i_36_ = class525_sub38.readUnsignedByte(1184048629);
	    if (null == anIntArrayArray7755)
		anIntArrayArray7755 = new int[i_36_ + 1][];
	    else if (i_36_ >= anIntArrayArray7755.length)
		anIntArrayArray7755
		    = (int[][]) Arrays.copyOf(anIntArrayArray7755, i_36_ + 1);
	    anIntArrayArray7755[i_36_] = new int[6];
	    for (int i_37_ = 0; i_37_ < 6; i_37_++)
		anIntArrayArray7755[i_36_][i_37_]
		    = class525_sub38.method16625((byte) -54);
	} else if (i == 28) {
	    int i_38_ = class525_sub38.readUnsignedByte(1888407690);
	    anIntArray7759 = new int[i_38_];
	    for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
		anIntArray7759[i_39_] = class525_sub38.readUnsignedByte(1574836000);
		if (255 == anIntArray7759[i_39_])
		    anIntArray7759[i_39_] = -1;
	    }
	} else if (i == 29)
	    anInt7743 = class525_sub38.readUnsignedByte(1128447533) * -1014455935;
	else if (i == 30)
	    anInt7761 = class525_sub38.readUnsignedShort((byte) 19) * -1052623633;
	else if (i == 31)
	    anInt7760 = class525_sub38.readUnsignedByte(197335564) * 1191659921;
	else if (32 == i)
	    anInt7763 = class525_sub38.readUnsignedShort((byte) 75) * 64866045;
	else if (i == 33)
	    anInt7748 = class525_sub38.method16625((byte) -86) * 2135471725;
	else if (i == 34)
	    anInt7764 = class525_sub38.readUnsignedByte(127914578) * 1939266325;
	else if (i == 35)
	    anInt7766 = class525_sub38.readUnsignedShort((byte) 118) * -1167146635;
	else if (i == 36)
	    anInt7767 = class525_sub38.method16625((byte) 47) * -308088815;
	else if (i == 37)
	    anInt7765 = class525_sub38.readUnsignedByte(1387038510) * 647835199;
	else if (i == 38)
	    anInt7731 = class525_sub38.readBigSmart(-2043778683) * 234385981;
	else if (39 == i)
	    anInt7756 = class525_sub38.readBigSmart(-2043778683) * -40259883;
	else if (i == 40)
	    anInt7734 = class525_sub38.readBigSmart(-2043778683) * -1867423875;
	else if (i == 41)
	    anInt7735 = class525_sub38.readBigSmart(-2043778683) * 2095997355;
	else if (i == 42)
	    anInt7736 = class525_sub38.readBigSmart(-2043778683) * -2127439839;
	else if (i == 43)
	    class525_sub38.readUnsignedShort((byte) 42);
	else if (44 == i)
	    class525_sub38.readUnsignedShort((byte) 48);
	else if (45 == i)
	    anInt7769 = class525_sub38.readUnsignedShort((byte) 3) * 1795064297;
	else if (46 == i)
	    anInt7745 = class525_sub38.readBigSmart(-2043778683) * -244329757;
	else if (i == 47)
	    anInt7746 = class525_sub38.readBigSmart(-2043778683) * 1804424375;
	else if (i == 48)
	    anInt7747 = class525_sub38.readBigSmart(-2043778683) * -639760989;
	else if (49 == i)
	    anInt7770 = class525_sub38.readBigSmart(-2043778683) * 957870867;
	else if (i == 50)
	    anInt7750 = class525_sub38.readBigSmart(-2043778683) * -1664395891;
	else if (i == 51)
	    anInt7739 = class525_sub38.readBigSmart(-2043778683) * 1416662611;
	else if (52 == i) {
	    int i_40_ = class525_sub38.readUnsignedByte(723970525);
	    anIntArray7732 = new int[i_40_];
	    anIntArray7729 = new int[i_40_];
	    for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
		anIntArray7732[i_41_]
		    = class525_sub38.readBigSmart(-2043778683);
		int i_42_ = class525_sub38.readUnsignedByte(1980926717);
		anIntArray7729[i_41_] = i_42_;
		anInt7730 += i_42_ * 1002656149;
	    }
	} else if (i == 53)
	    aBool7727 = false;
	else if (i == 54) {
	    anInt7753
		= (class525_sub38.readUnsignedByte(1293070513) << 6) * 249662571;
	    anInt7754
		= (class525_sub38.readUnsignedByte(1353598850) << 6) * -1982001687;
	} else if (55 == i) {
	    int i_43_ = class525_sub38.readUnsignedByte(725299330);
	    if (null == anIntArray7758)
		anIntArray7758 = new int[i_43_ + 1];
	    else if (i_43_ >= anIntArray7758.length)
		anIntArray7758 = Arrays.copyOf(anIntArray7758, i_43_ + 1);
	    anIntArray7758[i_43_] = class525_sub38.readUnsignedShort((byte) 69);
	} else if (56 == i) {
	    int i_44_ = class525_sub38.readUnsignedByte(519679698);
	    if (anIntArrayArray7728 == null)
		anIntArrayArray7728 = new int[1 + i_44_][];
	    else if (i_44_ >= anIntArrayArray7728.length)
		anIntArrayArray7728
		    = (int[][]) Arrays.copyOf(anIntArrayArray7728, 1 + i_44_);
	    anIntArrayArray7728[i_44_] = new int[3];
	    for (int i_45_ = 0; i_45_ < 3; i_45_++)
		anIntArrayArray7728[i_44_][i_45_]
		    = class525_sub38.method16625((byte) 16);
	}
    }
    
    public int method9673() {
	if (anInt7768 * 985921669 != -1)
	    return anInt7768 * 985921669;
	if (anIntArray7732 != null) {
	    int i = (int) (Math.random() * (double) (anInt7730 * -2078117443));
	    int i_46_;
	    for (i_46_ = 0; i >= anIntArray7729[i_46_]; i_46_++)
		i -= anIntArray7729[i_46_];
	    return anIntArray7732[i_46_];
	}
	return -1;
    }
    
    public void method70() {
	/* empty */
    }
    
    public boolean method9674(int i) {
	if (i == -1)
	    return false;
	if (985921669 * anInt7768 == i)
	    return true;
	if (null != anIntArray7732) {
	    for (int i_47_ = 0; i_47_ < anIntArray7732.length; i_47_++) {
		if (anIntArray7732[i_47_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    public int[] method9675(int i) {
	Class10 class10 = new Class10(16);
	Class585.method9658(anInt7768 * 985921669, class10, 147667423);
	if (anIntArray7732 != null) {
	    int[] is = anIntArray7732;
	    for (int i_48_ = 0; i_48_ < is.length; i_48_++) {
		int i_49_ = is[i_48_];
		Class585.method9658(i_49_, class10, 888369443);
	    }
	}
	Class585.method9658(509097237 * anInt7731, class10, 433581550);
	Class585.method9658(anInt7756 * -1318839683, class10, -69152567);
	Class585.method9658(-1543198931 * anInt7733, class10, -113644856);
	Class585.method9658(anInt7734 * -233221675, class10, -286929190);
	Class585.method9658(anInt7735 * 514429187, class10, -1192277957);
	Class585.method9658(anInt7736 * -244077599, class10, 1407326215);
	Class585.method9658(anInt7737 * 1543647097, class10, 596013396);
	Class585.method9658(1757568299 * anInt7738, class10, -992125043);
	Class585.method9658(-323002495 * anInt7749, class10, 1003932772);
	Class585.method9658(anInt7740 * 847346181, class10, -997982723);
	Class585.method9658(323075315 * anInt7741, class10, -1058017982);
	Class585.method9658(anInt7742 * -1270065645, class10, 607157203);
	Class585.method9658(anInt7762 * -1559403155, class10, -861432481);
	Class585.method9658(-880993293 * anInt7744, class10, -1000780235);
	Class585.method9658(1241121483 * anInt7745, class10, -61119207);
	Class585.method9658(anInt7746 * 2086258951, class10, 119646204);
	Class585.method9658(1262179851 * anInt7747, class10, -54769442);
	Class585.method9658(anInt7770 * 805293851, class10, 471450387);
	Class585.method9658(1142617413 * anInt7750, class10, -935037685);
	Class585.method9658(-1321015845 * anInt7739, class10, 392980605);
	int[] is = new int[class10.method687(1208600197)];
	int i_50_ = 0;
	Iterator iterator = class10.iterator();
	while (iterator.hasNext()) {
	    Class525 class525 = (Class525) iterator.next();
	    is[i_50_++] = (int) (-5126207504388691097L * class525.aLong7113);
	}
	return is;
    }
    
    public boolean method9676(int i) {
	if (i == -1)
	    return false;
	if (985921669 * anInt7768 == i)
	    return true;
	if (null != anIntArray7732) {
	    for (int i_51_ = 0; i_51_ < anIntArray7732.length; i_51_++) {
		if (anIntArray7732[i_51_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    public Class444[] method9677() {
	if (null != aClass444Array7757)
	    return aClass444Array7757;
	if (null == anIntArrayArray7755)
	    return null;
	aClass444Array7757 = new Class444[anIntArrayArray7755.length];
	for (int i = 0; i < anIntArrayArray7755.length; i++) {
	    int i_52_ = 0;
	    int i_53_ = 0;
	    int i_54_ = 0;
	    int i_55_ = 0;
	    int i_56_ = 0;
	    int i_57_ = 0;
	    if (anIntArrayArray7755[i] != null) {
		i_52_ = anIntArrayArray7755[i][0];
		i_53_ = anIntArrayArray7755[i][1];
		i_54_ = anIntArrayArray7755[i][2];
		i_55_ = anIntArrayArray7755[i][3] << 3;
		i_56_ = anIntArrayArray7755[i][4] << 3;
		i_57_ = anIntArrayArray7755[i][5] << 3;
	    }
	    if (i_52_ != 0 || 0 != i_53_ || i_54_ != 0 || 0 != i_55_
		|| i_56_ != 0 || 0 != i_57_) {
		Class444 class444 = aClass444Array7757[i] = new Class444();
		if (0 != i_57_)
		    class444.method7142(0.0F, 0.0F, 1.0F,
					Class436.method7071(i_57_));
		if (0 != i_55_)
		    class444.method7142(1.0F, 0.0F, 0.0F,
					Class436.method7071(i_55_));
		if (i_56_ != 0)
		    class444.method7142(0.0F, 1.0F, 0.0F,
					Class436.method7071(i_56_));
		class444.method7147((float) i_52_, (float) i_53_,
				    (float) i_54_);
	    }
	}
	return aClass444Array7757;
    }
    
    void method9678(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    anInt7768 = class525_sub38.readBigSmart(-2043778683) * -884391859;
	    anInt7733 = class525_sub38.readBigSmart(-2043778683) * 1562984613;
	} else if (2 == i)
	    anInt7741 = class525_sub38.readBigSmart(-2043778683) * -1135756229;
	else if (3 == i)
	    anInt7742 = class525_sub38.readBigSmart(-2043778683) * -724638693;
	else if (i == 4)
	    anInt7762 = class525_sub38.readBigSmart(-2043778683) * -310285211;
	else if (5 == i)
	    anInt7744 = class525_sub38.readBigSmart(-2043778683) * 699004219;
	else if (6 == i)
	    anInt7737 = class525_sub38.readBigSmart(-2043778683) * -1369568567;
	else if (7 == i)
	    anInt7738 = class525_sub38.readBigSmart(-2043778683) * -855410301;
	else if (i == 8)
	    anInt7749 = class525_sub38.readBigSmart(-2043778683) * 1073799297;
	else if (9 == i)
	    anInt7740 = class525_sub38.readBigSmart(-2043778683) * -1540603187;
	else if (26 == i) {
	    anInt7751 = ((short) (class525_sub38.readUnsignedByte(1565723532) * 4)
			 * 1309237159);
	    anInt7752 = ((short) (class525_sub38.readUnsignedByte(870544821) * 4)
			 * -254795329);
	} else if (27 == i) {
	    int i_58_ = class525_sub38.readUnsignedByte(839807112);
	    if (null == anIntArrayArray7755)
		anIntArrayArray7755 = new int[i_58_ + 1][];
	    else if (i_58_ >= anIntArrayArray7755.length)
		anIntArrayArray7755
		    = (int[][]) Arrays.copyOf(anIntArrayArray7755, i_58_ + 1);
	    anIntArrayArray7755[i_58_] = new int[6];
	    for (int i_59_ = 0; i_59_ < 6; i_59_++)
		anIntArrayArray7755[i_58_][i_59_]
		    = class525_sub38.method16625((byte) 14);
	} else if (i == 28) {
	    int i_60_ = class525_sub38.readUnsignedByte(454036819);
	    anIntArray7759 = new int[i_60_];
	    for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
		anIntArray7759[i_61_] = class525_sub38.readUnsignedByte(704755772);
		if (255 == anIntArray7759[i_61_])
		    anIntArray7759[i_61_] = -1;
	    }
	} else if (i == 29)
	    anInt7743 = class525_sub38.readUnsignedByte(1328132925) * -1014455935;
	else if (i == 30)
	    anInt7761 = class525_sub38.readUnsignedShort((byte) 14) * -1052623633;
	else if (i == 31)
	    anInt7760 = class525_sub38.readUnsignedByte(1311188552) * 1191659921;
	else if (32 == i)
	    anInt7763 = class525_sub38.readUnsignedShort((byte) 80) * 64866045;
	else if (i == 33)
	    anInt7748 = class525_sub38.method16625((byte) -59) * 2135471725;
	else if (i == 34)
	    anInt7764 = class525_sub38.readUnsignedByte(293580141) * 1939266325;
	else if (i == 35)
	    anInt7766 = class525_sub38.readUnsignedShort((byte) 111) * -1167146635;
	else if (i == 36)
	    anInt7767 = class525_sub38.method16625((byte) 11) * -308088815;
	else if (i == 37)
	    anInt7765 = class525_sub38.readUnsignedByte(1640290915) * 647835199;
	else if (i == 38)
	    anInt7731 = class525_sub38.readBigSmart(-2043778683) * 234385981;
	else if (39 == i)
	    anInt7756 = class525_sub38.readBigSmart(-2043778683) * -40259883;
	else if (i == 40)
	    anInt7734 = class525_sub38.readBigSmart(-2043778683) * -1867423875;
	else if (i == 41)
	    anInt7735 = class525_sub38.readBigSmart(-2043778683) * 2095997355;
	else if (i == 42)
	    anInt7736 = class525_sub38.readBigSmart(-2043778683) * -2127439839;
	else if (i == 43)
	    class525_sub38.readUnsignedShort((byte) 24);
	else if (44 == i)
	    class525_sub38.readUnsignedShort((byte) 60);
	else if (45 == i)
	    anInt7769 = class525_sub38.readUnsignedShort((byte) 97) * 1795064297;
	else if (46 == i)
	    anInt7745 = class525_sub38.readBigSmart(-2043778683) * -244329757;
	else if (i == 47)
	    anInt7746 = class525_sub38.readBigSmart(-2043778683) * 1804424375;
	else if (i == 48)
	    anInt7747 = class525_sub38.readBigSmart(-2043778683) * -639760989;
	else if (49 == i)
	    anInt7770 = class525_sub38.readBigSmart(-2043778683) * 957870867;
	else if (i == 50)
	    anInt7750 = class525_sub38.readBigSmart(-2043778683) * -1664395891;
	else if (i == 51)
	    anInt7739 = class525_sub38.readBigSmart(-2043778683) * 1416662611;
	else if (52 == i) {
	    int i_62_ = class525_sub38.readUnsignedByte(777871827);
	    anIntArray7732 = new int[i_62_];
	    anIntArray7729 = new int[i_62_];
	    for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
		anIntArray7732[i_63_]
		    = class525_sub38.readBigSmart(-2043778683);
		int i_64_ = class525_sub38.readUnsignedByte(1930863356);
		anIntArray7729[i_63_] = i_64_;
		anInt7730 += i_64_ * 1002656149;
	    }
	} else if (i == 53)
	    aBool7727 = false;
	else if (i == 54) {
	    anInt7753
		= (class525_sub38.readUnsignedByte(1025388100) << 6) * 249662571;
	    anInt7754
		= (class525_sub38.readUnsignedByte(740158035) << 6) * -1982001687;
	} else if (55 == i) {
	    int i_65_ = class525_sub38.readUnsignedByte(971767480);
	    if (null == anIntArray7758)
		anIntArray7758 = new int[i_65_ + 1];
	    else if (i_65_ >= anIntArray7758.length)
		anIntArray7758 = Arrays.copyOf(anIntArray7758, i_65_ + 1);
	    anIntArray7758[i_65_] = class525_sub38.readUnsignedShort((byte) 86);
	} else if (56 == i) {
	    int i_66_ = class525_sub38.readUnsignedByte(279014215);
	    if (anIntArrayArray7728 == null)
		anIntArrayArray7728 = new int[1 + i_66_][];
	    else if (i_66_ >= anIntArrayArray7728.length)
		anIntArrayArray7728
		    = (int[][]) Arrays.copyOf(anIntArrayArray7728, 1 + i_66_);
	    anIntArrayArray7728[i_66_] = new int[3];
	    for (int i_67_ = 0; i_67_ < 3; i_67_++)
		anIntArrayArray7728[i_66_][i_67_]
		    = class525_sub38.method16625((byte) -14);
	}
    }
    
    public int[] method9679() {
	Class10 class10 = new Class10(16);
	Class585.method9658(anInt7768 * 985921669, class10, -639178769);
	if (anIntArray7732 != null) {
	    int[] is = anIntArray7732;
	    for (int i = 0; i < is.length; i++) {
		int i_68_ = is[i];
		Class585.method9658(i_68_, class10, -35910849);
	    }
	}
	Class585.method9658(509097237 * anInt7731, class10, 83173984);
	Class585.method9658(anInt7756 * -1318839683, class10, 607651933);
	Class585.method9658(-1543198931 * anInt7733, class10, 478087028);
	Class585.method9658(anInt7734 * -233221675, class10, 508611677);
	Class585.method9658(anInt7735 * 514429187, class10, 2145695409);
	Class585.method9658(anInt7736 * -244077599, class10, -655229504);
	Class585.method9658(anInt7737 * 1543647097, class10, 616534061);
	Class585.method9658(1757568299 * anInt7738, class10, -283571659);
	Class585.method9658(-323002495 * anInt7749, class10, -821776897);
	Class585.method9658(anInt7740 * 847346181, class10, 881537226);
	Class585.method9658(323075315 * anInt7741, class10, 358515896);
	Class585.method9658(anInt7742 * -1270065645, class10, 1230319172);
	Class585.method9658(anInt7762 * -1559403155, class10, -1226468895);
	Class585.method9658(-880993293 * anInt7744, class10, 1820798733);
	Class585.method9658(1241121483 * anInt7745, class10, -841718359);
	Class585.method9658(anInt7746 * 2086258951, class10, -126196113);
	Class585.method9658(1262179851 * anInt7747, class10, -547378033);
	Class585.method9658(anInt7770 * 805293851, class10, 1119809842);
	Class585.method9658(1142617413 * anInt7750, class10, -1489901824);
	Class585.method9658(-1321015845 * anInt7739, class10, -1271838743);
	int[] is = new int[class10.method687(1553951814)];
	int i = 0;
	Iterator iterator = class10.iterator();
	while (iterator.hasNext()) {
	    Class525 class525 = (Class525) iterator.next();
	    is[i++] = (int) (-5126207504388691097L * class525.aLong7113);
	}
	return is;
    }
    
    public int[] method9680() {
	Class10 class10 = new Class10(16);
	Class585.method9658(anInt7768 * 985921669, class10, 773981701);
	if (anIntArray7732 != null) {
	    int[] is = anIntArray7732;
	    for (int i = 0; i < is.length; i++) {
		int i_69_ = is[i];
		Class585.method9658(i_69_, class10, -611631193);
	    }
	}
	Class585.method9658(509097237 * anInt7731, class10, 667144809);
	Class585.method9658(anInt7756 * -1318839683, class10, 127693603);
	Class585.method9658(-1543198931 * anInt7733, class10, -1441041559);
	Class585.method9658(anInt7734 * -233221675, class10, -1191518909);
	Class585.method9658(anInt7735 * 514429187, class10, -390492232);
	Class585.method9658(anInt7736 * -244077599, class10, -375784572);
	Class585.method9658(anInt7737 * 1543647097, class10, 672851988);
	Class585.method9658(1757568299 * anInt7738, class10, -790290434);
	Class585.method9658(-323002495 * anInt7749, class10, 2098330440);
	Class585.method9658(anInt7740 * 847346181, class10, -368548016);
	Class585.method9658(323075315 * anInt7741, class10, 1400007326);
	Class585.method9658(anInt7742 * -1270065645, class10, -1115245486);
	Class585.method9658(anInt7762 * -1559403155, class10, -474580809);
	Class585.method9658(-880993293 * anInt7744, class10, 1921888201);
	Class585.method9658(1241121483 * anInt7745, class10, 408598931);
	Class585.method9658(anInt7746 * 2086258951, class10, 879417460);
	Class585.method9658(1262179851 * anInt7747, class10, 358040688);
	Class585.method9658(anInt7770 * 805293851, class10, 1884815764);
	Class585.method9658(1142617413 * anInt7750, class10, 1408877204);
	Class585.method9658(-1321015845 * anInt7739, class10, -1255950569);
	int[] is = new int[class10.method687(263306082)];
	int i = 0;
	Iterator iterator = class10.iterator();
	while (iterator.hasNext()) {
	    Class525 class525 = (Class525) iterator.next();
	    is[i++] = (int) (-5126207504388691097L * class525.aLong7113);
	}
	return is;
    }
    
    static final void method9681(int i, Class10 class10) {
	if (-1 != i && class10.method684((long) i) == null)
	    class10.method695(new Class525(), (long) i);
    }
    
    static final void method9682(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method9683(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -559264181 * Class15.aClass1_173.anInt11;
    }
    
    static final void method9684(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_70_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_71_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_72_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class4.method540(i_70_, i_71_, i_72_, true, 1221049769);
    }
    
    static final void method9685(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub41_10704
		  .method17337(945701949);
    }
    
    static final void method9686(Class683 class683, int i) {
	int i_73_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_73_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2642 * 1890162443;
    }
}
