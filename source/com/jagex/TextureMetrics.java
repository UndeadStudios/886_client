/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class TextureMetrics
{
    public static final int anInt1782 = 11;
    static final int anInt1783 = 1;
    static final int anInt1784 = 2;
    public byte aByte1785;
    static final int anInt1786 = 3;
    static final int anInt1787 = 1;
    static final int anInt1788 = 128;
    static final int anInt1789 = 16;
    static final int anInt1790 = 4;
    static final int anInt1791 = 32;
    static final int anInt1792 = 64;
    public int anInt1793;
    static final int anInt1794 = 256;
    static final int anInt1795 = 512;
    public static final byte aByte1796 = 0;
    public static final byte aByte1797 = 1;
    static final int anInt1798 = 1;
    static final int anInt1799 = 2;
    public int anInt1800;
    public boolean aBool1801 = false;
    boolean aBool1802 = false;
    public boolean aBool1803 = false;
    public static final int anInt1804 = 5;
    public byte aByte1805 = 0;
    public byte aByte1806 = 0;
    public Class597 aClass597_1807;
    public int bitLoad;
    public byte aByte1809;
    public byte aByte1810;
    public byte aByte1811;
    public static final int anInt1812 = 0;
    static final int anInt1813 = 16;
    public static final int anInt1814 = 2;
    public boolean aBool1815 = false;
    public static final int anInt1816 = 4;
    public static final int anInt1817 = 7;
    public static final int anInt1818 = 6;
    public boolean aBool1819;
    public static final int anInt1820 = 8;
    public static final int anInt1821 = 3;
    public static final int anInt1822 = 13;
    public byte aByte1823;
    public static final int anInt1824 = 16;
    public byte aByte1825;
    public byte aByte1826;
    public static final int anInt1827 = 1;
    static final int anInt1828 = 0;
    public boolean aBool1829;
    public byte aByte1830;
    public byte aByte1831;
    public static final int anInt1832 = 9;
    static final int anInt1833 = 2;
    public short aShort1834;
    public static Textures aClass180_1835;
    static int anInt1836;
    
    TextureMetrics() {
	aClass597_1807 = Class597.aClass597_7842;
	aByte1830 = (byte) -1;
	aByte1810 = (byte) 0;
	aByte1811 = (byte) 0;
	aByte1825 = (byte) 0;
	aByte1826 = (byte) 0;
	anInt1793 = 0;
	aByte1809 = (byte) 0;
	aBool1829 = false;
	aBool1819 = false;
	aByte1831 = (byte) 0;
	aByte1785 = (byte) -1;
	aByte1823 = (byte) 0;
	aShort1834 = (short) 0;
    }
    
    void method2669(int i, RSBuffer buffer, byte i_0_) {
	anInt1800 = -522172775 * i;
	buffer.readUnsignedByte(915151769);
	int i_1_ = buffer.readUnsignedByte(799056204);
	if (0 == i_1_)
		bitLoad = 990382400;
	else if (i_1_ == 1)
	    bitLoad = 1980764800;
	else if (i_1_ == 2)
	    bitLoad = -333437696;
	else if (3 == i_1_)
	    bitLoad = -666875392;
	else if (i_1_ == 4)
	    bitLoad = -1333750784;
	int i_2_ = buffer.readInt(1196153614);
	aBool1801 = (i_2_ & 0x1) != 0;
	aBool1802 = 0 != (i_2_ & 0x2);
	aBool1803 = 0 != (i_2_ & 0x10);
	int i_3_ = (byte) buffer.readUnsignedByte(808796162);
	aByte1810 = (byte) (i_3_ & 0x7);
	aByte1811 = (byte) (i_3_ >> 3 & 0x7);
	int i_4_ = buffer.readInt(849572371);
	if ((i_4_ & 0x10) != 0) {
	    buffer.method16634(378990083);
	    buffer.method16634(-691382271);
	}
	if (aBool1802)
	    buffer.method16634(-1531386681);
	if ((i_4_ & 0x20) != 0)
	    buffer.readInt(1981007949);
	if ((i_4_ & 0x40) != 0)
	    buffer.readInt(1714802397);
	if (0 != (i_4_ & 0x80))
	    buffer.readInt(1463554689);
	if (0 != (i_4_ & 0x100))
	    buffer.readInt(1704454716);
	if (0 != (i_4_ & 0x200))
	    buffer.readInt(1048543779);
	aBool1815 = buffer.readUnsignedByte(1656689993) == 1;
	Class539.method8888(Class27.method905(1693354457),
			    buffer.readUnsignedByte(1949058233),
			    2079874055);
	Class539.method8888(Class441.method7116((byte) -23),
			    buffer.readUnsignedByte(753514044), -694416950);
	aClass597_1807
	    = ((Class597)
	       Class539.method8888(Class220.method4205(1552651121),
				   buffer.readUnsignedByte(853727586),
				   -2021041730));
	if (aClass597_1807 == Class597.aClass597_7843)
	    aByte1830 = (byte) buffer.readUnsignedByte(1597086251);
	int i_5_ = buffer.readUnsignedByte(1314219407);
	if (0 != (i_5_ & 0x1))
	    aByte1805 = (byte) buffer.readUnsignedByte(2085546389);
	if ((i_5_ & 0x2) != 0)
	    aByte1806 = (byte) buffer.readUnsignedByte(1636040261);
	if (buffer.readUnsignedByte(2065058297) == 1) {
	    aByte1825 = (byte) buffer.readUnsignedByte(603754259);
	    aByte1826 = (byte) buffer.readUnsignedByte(21801439);
	    anInt1793 = buffer.readInt(2072490391) * -681616263;
	    aByte1823 = (byte) buffer.readUnsignedByte(1160539621);
	    buffer.readUnsignedByte(1752939804);
	    aByte1809 = (byte) buffer.readUnsignedByte(1222779090);
	    aBool1829 = buffer.readUnsignedByte(1157489370) == 1;
	    aBool1819 = buffer.readUnsignedByte(794027708) == 1;
	    aByte1831 = (byte) buffer.readUnsignedByte(1399775805);
	    aByte1785 = (byte) buffer.readUnsignedByte(285789267);
	    aShort1834 = (short) buffer.readUnsignedShort((byte) 79);
	}
    }

	static void method2674(int i, byte i_26_) {
	if (-1 != i && !Class593.aBoolArray7832[i]) {
	    Class172.aClass458_1861.method7489(i, -483766619);
	    Class162.aClass245Array1764[i] = null;
	}
    }
    
    static Class525_Sub16_Sub4 method2675(int i, byte i_27_) {
	Class525_Sub16_Sub4 class525_sub16_sub4
	    = ((Class525_Sub16_Sub4)
	       Class644.aClass199_8336.method3769((long) i));
	if (class525_sub16_sub4 != null)
	    return class525_sub16_sub4;
	byte[] is = Class112.idx_12.getFile(i, 0, 2111920475);
	if (null == is || is.length <= 1)
	    return null;
	try {
	    class525_sub16_sub4 = Class483.method7834(is, -1699670172);
	} catch (Exception exception) {
	    throw new RuntimeException(new StringBuilder().append
					   (exception.getMessage()).append
					   (" ").append
					   (i).toString());
	}
	Class644.aClass199_8336.method3775(class525_sub16_sub4, (long) i);
	return class525_sub16_sub4;
    }
    
    static final void method2676(Class683 class683, byte i) {
	Class522_Sub1.method16052(Class47.method1101((byte) -4), class683,
				  (byte) 2);
    }
    
    static void method2677(Class683 class683, int i) {
	int i_28_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 - 3];
	int i_29_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 - 2];
	int i_30_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 - 1];
	class683.anInt8662 -= 362986067;
	if (i_28_ > class683.anIntArray8639[i_29_])
	    throw new RuntimeException();
	if (i_28_ > class683.anIntArray8639[i_30_])
	    throw new RuntimeException();
	if (i_30_ == i_29_)
	    throw new RuntimeException();
	Class546.method9099(class683.anIntArrayArray8641[i_29_],
			    class683.anIntArrayArray8641[i_30_], 0, i_28_ - 1,
			    1782313374);
    }
    
    static final void method2678(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_31_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_32_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	Class88 class88
	    = ((Class88)
	       client.aClass40_Sub16_11201.method76(i_32_, 1172485433));
	if (class88.method1661(850971987))
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= ((AnimationDefinition)
		   Class685.aClass40_Sub8_8691.method76(i_31_, -2098950000))
		      .method3728(i_32_, class88.aString892, (byte) 94);
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (((AnimationDefinition)
		    Class685.aClass40_Sub8_8691.method76(i_31_, 1696489736))
		       .method3722
		   (i_32_, class88.anInt893 * 2053564367, (byte) 28));
    }
}
