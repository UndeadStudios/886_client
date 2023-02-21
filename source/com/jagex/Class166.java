/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class166
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
    public int anInt1808;
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
    public static Class180 aClass180_1835;
    static int anInt1836;
    
    Class166() {
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
    
    void method2669(int i, RSBuffer class525_sub38, byte i_0_) {
	anInt1800 = -522172775 * i;
	class525_sub38.readUnsignedByte(915151769);
	int i_1_ = class525_sub38.readUnsignedByte(799056204);
	if (0 == i_1_)
	    anInt1808 = 990382400;
	else if (i_1_ == 1)
	    anInt1808 = 1980764800;
	else if (i_1_ == 2)
	    anInt1808 = -333437696;
	else if (3 == i_1_)
	    anInt1808 = -666875392;
	else if (i_1_ == 4)
	    anInt1808 = -1333750784;
	int i_2_ = class525_sub38.readInt(1196153614);
	aBool1801 = (i_2_ & 0x1) != 0;
	aBool1802 = 0 != (i_2_ & 0x2);
	aBool1803 = 0 != (i_2_ & 0x10);
	int i_3_ = (byte) class525_sub38.readUnsignedByte(808796162);
	aByte1810 = (byte) (i_3_ & 0x7);
	aByte1811 = (byte) (i_3_ >> 3 & 0x7);
	int i_4_ = class525_sub38.readInt(849572371);
	if ((i_4_ & 0x10) != 0) {
	    class525_sub38.method16634(378990083);
	    class525_sub38.method16634(-691382271);
	}
	if (aBool1802)
	    class525_sub38.method16634(-1531386681);
	if ((i_4_ & 0x20) != 0)
	    class525_sub38.readInt(1981007949);
	if ((i_4_ & 0x40) != 0)
	    class525_sub38.readInt(1714802397);
	if (0 != (i_4_ & 0x80))
	    class525_sub38.readInt(1463554689);
	if (0 != (i_4_ & 0x100))
	    class525_sub38.readInt(1704454716);
	if (0 != (i_4_ & 0x200))
	    class525_sub38.readInt(1048543779);
	aBool1815 = class525_sub38.readUnsignedByte(1656689993) == 1;
	Class539.method8888(Class27.method905(1693354457),
			    class525_sub38.readUnsignedByte(1949058233),
			    2079874055);
	Class539.method8888(Class441.method7116((byte) -23),
			    class525_sub38.readUnsignedByte(753514044), -694416950);
	aClass597_1807
	    = ((Class597)
	       Class539.method8888(Class220.method4205(1552651121),
				   class525_sub38.readUnsignedByte(853727586),
				   -2021041730));
	if (aClass597_1807 == Class597.aClass597_7843)
	    aByte1830 = (byte) class525_sub38.readUnsignedByte(1597086251);
	int i_5_ = class525_sub38.readUnsignedByte(1314219407);
	if (0 != (i_5_ & 0x1))
	    aByte1805 = (byte) class525_sub38.readUnsignedByte(2085546389);
	if ((i_5_ & 0x2) != 0)
	    aByte1806 = (byte) class525_sub38.readUnsignedByte(1636040261);
	if (class525_sub38.readUnsignedByte(2065058297) == 1) {
	    aByte1825 = (byte) class525_sub38.readUnsignedByte(603754259);
	    aByte1826 = (byte) class525_sub38.readUnsignedByte(21801439);
	    anInt1793 = class525_sub38.readInt(2072490391) * -681616263;
	    aByte1823 = (byte) class525_sub38.readUnsignedByte(1160539621);
	    class525_sub38.readUnsignedByte(1752939804);
	    aByte1809 = (byte) class525_sub38.readUnsignedByte(1222779090);
	    aBool1829 = class525_sub38.readUnsignedByte(1157489370) == 1;
	    aBool1819 = class525_sub38.readUnsignedByte(794027708) == 1;
	    aByte1831 = (byte) class525_sub38.readUnsignedByte(1399775805);
	    aByte1785 = (byte) class525_sub38.readUnsignedByte(285789267);
	    aShort1834 = (short) class525_sub38.readUnsignedShort((byte) 79);
	}
    }
    
    void method2670(int i, RSBuffer class525_sub38) {
	anInt1800 = -522172775 * i;
	class525_sub38.readUnsignedByte(1409423749);
	int i_6_ = class525_sub38.readUnsignedByte(371248736);
	if (0 == i_6_)
	    anInt1808 = 990382400;
	else if (i_6_ == 1)
	    anInt1808 = 1980764800;
	else if (i_6_ == 2)
	    anInt1808 = -333437696;
	else if (3 == i_6_)
	    anInt1808 = -666875392;
	else if (i_6_ == 4)
	    anInt1808 = -1333750784;
	int i_7_ = class525_sub38.readInt(1780599659);
	aBool1801 = (i_7_ & 0x1) != 0;
	aBool1802 = 0 != (i_7_ & 0x2);
	aBool1803 = 0 != (i_7_ & 0x10);
	int i_8_ = (byte) class525_sub38.readUnsignedByte(1811018417);
	aByte1810 = (byte) (i_8_ & 0x7);
	aByte1811 = (byte) (i_8_ >> 3 & 0x7);
	int i_9_ = class525_sub38.readInt(1769415982);
	if ((i_9_ & 0x10) != 0) {
	    class525_sub38.method16634(-54987592);
	    class525_sub38.method16634(449719482);
	}
	if (aBool1802)
	    class525_sub38.method16634(-1170014728);
	if ((i_9_ & 0x20) != 0)
	    class525_sub38.readInt(1443867702);
	if ((i_9_ & 0x40) != 0)
	    class525_sub38.readInt(1376116738);
	if (0 != (i_9_ & 0x80))
	    class525_sub38.readInt(1648020530);
	if (0 != (i_9_ & 0x100))
	    class525_sub38.readInt(1616886653);
	if (0 != (i_9_ & 0x200))
	    class525_sub38.readInt(1172277198);
	aBool1815 = class525_sub38.readUnsignedByte(954373211) == 1;
	Class539.method8888(Class27.method905(1070546949),
			    class525_sub38.readUnsignedByte(6247059), -1007995633);
	Class539.method8888(Class441.method7116((byte) -128),
			    class525_sub38.readUnsignedByte(242382236), 99134829);
	aClass597_1807
	    = ((Class597)
	       Class539.method8888(Class220.method4205(1552651121),
				   class525_sub38.readUnsignedByte(1537281249),
				   -1134512803));
	if (aClass597_1807 == Class597.aClass597_7843)
	    aByte1830 = (byte) class525_sub38.readUnsignedByte(449532725);
	int i_10_ = class525_sub38.readUnsignedByte(1116892779);
	if (0 != (i_10_ & 0x1))
	    aByte1805 = (byte) class525_sub38.readUnsignedByte(898258589);
	if ((i_10_ & 0x2) != 0)
	    aByte1806 = (byte) class525_sub38.readUnsignedByte(413294916);
	if (class525_sub38.readUnsignedByte(1219751678) == 1) {
	    aByte1825 = (byte) class525_sub38.readUnsignedByte(1246999797);
	    aByte1826 = (byte) class525_sub38.readUnsignedByte(674199793);
	    anInt1793 = class525_sub38.readInt(1953397869) * -681616263;
	    aByte1823 = (byte) class525_sub38.readUnsignedByte(1464117936);
	    class525_sub38.readUnsignedByte(667258587);
	    aByte1809 = (byte) class525_sub38.readUnsignedByte(1725036236);
	    aBool1829 = class525_sub38.readUnsignedByte(1425247404) == 1;
	    aBool1819 = class525_sub38.readUnsignedByte(867464462) == 1;
	    aByte1831 = (byte) class525_sub38.readUnsignedByte(459404721);
	    aByte1785 = (byte) class525_sub38.readUnsignedByte(401837172);
	    aShort1834 = (short) class525_sub38.readUnsignedShort((byte) 56);
	}
    }
    
    void method2671(int i, RSBuffer class525_sub38) {
	anInt1800 = -522172775 * i;
	class525_sub38.readUnsignedByte(2074493938);
	int i_11_ = class525_sub38.readUnsignedByte(467092960);
	if (0 == i_11_)
	    anInt1808 = 990382400;
	else if (i_11_ == 1)
	    anInt1808 = 1980764800;
	else if (i_11_ == 2)
	    anInt1808 = -333437696;
	else if (3 == i_11_)
	    anInt1808 = -666875392;
	else if (i_11_ == 4)
	    anInt1808 = -1333750784;
	int i_12_ = class525_sub38.readInt(1498252874);
	aBool1801 = (i_12_ & 0x1) != 0;
	aBool1802 = 0 != (i_12_ & 0x2);
	aBool1803 = 0 != (i_12_ & 0x10);
	int i_13_ = (byte) class525_sub38.readUnsignedByte(559335876);
	aByte1810 = (byte) (i_13_ & 0x7);
	aByte1811 = (byte) (i_13_ >> 3 & 0x7);
	int i_14_ = class525_sub38.readInt(1206479861);
	if ((i_14_ & 0x10) != 0) {
	    class525_sub38.method16634(-1513488298);
	    class525_sub38.method16634(140853987);
	}
	if (aBool1802)
	    class525_sub38.method16634(-1003995341);
	if ((i_14_ & 0x20) != 0)
	    class525_sub38.readInt(1787604431);
	if ((i_14_ & 0x40) != 0)
	    class525_sub38.readInt(1227960936);
	if (0 != (i_14_ & 0x80))
	    class525_sub38.readInt(1449082390);
	if (0 != (i_14_ & 0x100))
	    class525_sub38.readInt(1774526945);
	if (0 != (i_14_ & 0x200))
	    class525_sub38.readInt(955083942);
	aBool1815 = class525_sub38.readUnsignedByte(1247788983) == 1;
	Class539.method8888(Class27.method905(1487537328),
			    class525_sub38.readUnsignedByte(807400018), 839622592);
	Class539.method8888(Class441.method7116((byte) -33),
			    class525_sub38.readUnsignedByte(1152360364),
			    -1331428791);
	aClass597_1807
	    = ((Class597)
	       Class539.method8888(Class220.method4205(1552651121),
				   class525_sub38.readUnsignedByte(1848852902),
				   -227274888));
	if (aClass597_1807 == Class597.aClass597_7843)
	    aByte1830 = (byte) class525_sub38.readUnsignedByte(1953953799);
	int i_15_ = class525_sub38.readUnsignedByte(71540115);
	if (0 != (i_15_ & 0x1))
	    aByte1805 = (byte) class525_sub38.readUnsignedByte(1976924990);
	if ((i_15_ & 0x2) != 0)
	    aByte1806 = (byte) class525_sub38.readUnsignedByte(1126258194);
	if (class525_sub38.readUnsignedByte(15721008) == 1) {
	    aByte1825 = (byte) class525_sub38.readUnsignedByte(909937043);
	    aByte1826 = (byte) class525_sub38.readUnsignedByte(1401567886);
	    anInt1793 = class525_sub38.readInt(1237426624) * -681616263;
	    aByte1823 = (byte) class525_sub38.readUnsignedByte(599947661);
	    class525_sub38.readUnsignedByte(951429549);
	    aByte1809 = (byte) class525_sub38.readUnsignedByte(1800371420);
	    aBool1829 = class525_sub38.readUnsignedByte(1050678848) == 1;
	    aBool1819 = class525_sub38.readUnsignedByte(-7332869) == 1;
	    aByte1831 = (byte) class525_sub38.readUnsignedByte(2025697321);
	    aByte1785 = (byte) class525_sub38.readUnsignedByte(2111032616);
	    aShort1834 = (short) class525_sub38.readUnsignedShort((byte) 80);
	}
    }
    
    void method2672(int i, RSBuffer class525_sub38) {
	anInt1800 = -522172775 * i;
	class525_sub38.readUnsignedByte(1312398560);
	int i_16_ = class525_sub38.readUnsignedByte(541943839);
	if (0 == i_16_)
	    anInt1808 = 990382400;
	else if (i_16_ == 1)
	    anInt1808 = 1980764800;
	else if (i_16_ == 2)
	    anInt1808 = -333437696;
	else if (3 == i_16_)
	    anInt1808 = -666875392;
	else if (i_16_ == 4)
	    anInt1808 = -1333750784;
	int i_17_ = class525_sub38.readInt(1699002658);
	aBool1801 = (i_17_ & 0x1) != 0;
	aBool1802 = 0 != (i_17_ & 0x2);
	aBool1803 = 0 != (i_17_ & 0x10);
	int i_18_ = (byte) class525_sub38.readUnsignedByte(17974457);
	aByte1810 = (byte) (i_18_ & 0x7);
	aByte1811 = (byte) (i_18_ >> 3 & 0x7);
	int i_19_ = class525_sub38.readInt(2111342819);
	if ((i_19_ & 0x10) != 0) {
	    class525_sub38.method16634(-524665032);
	    class525_sub38.method16634(-830627550);
	}
	if (aBool1802)
	    class525_sub38.method16634(633794988);
	if ((i_19_ & 0x20) != 0)
	    class525_sub38.readInt(1559812955);
	if ((i_19_ & 0x40) != 0)
	    class525_sub38.readInt(1035251712);
	if (0 != (i_19_ & 0x80))
	    class525_sub38.readInt(1730776635);
	if (0 != (i_19_ & 0x100))
	    class525_sub38.readInt(1719989157);
	if (0 != (i_19_ & 0x200))
	    class525_sub38.readInt(1918553767);
	aBool1815 = class525_sub38.readUnsignedByte(1232998387) == 1;
	Class539.method8888(Class27.method905(1054752606),
			    class525_sub38.readUnsignedByte(1707110328),
			    1229135274);
	Class539.method8888(Class441.method7116((byte) -90),
			    class525_sub38.readUnsignedByte(1715639230), 687413763);
	aClass597_1807
	    = ((Class597)
	       Class539.method8888(Class220.method4205(1552651121),
				   class525_sub38.readUnsignedByte(902498467),
				   -325757273));
	if (aClass597_1807 == Class597.aClass597_7843)
	    aByte1830 = (byte) class525_sub38.readUnsignedByte(867316573);
	int i_20_ = class525_sub38.readUnsignedByte(1539518381);
	if (0 != (i_20_ & 0x1))
	    aByte1805 = (byte) class525_sub38.readUnsignedByte(1423064526);
	if ((i_20_ & 0x2) != 0)
	    aByte1806 = (byte) class525_sub38.readUnsignedByte(306614186);
	if (class525_sub38.readUnsignedByte(1463846288) == 1) {
	    aByte1825 = (byte) class525_sub38.readUnsignedByte(624332598);
	    aByte1826 = (byte) class525_sub38.readUnsignedByte(-150248);
	    anInt1793 = class525_sub38.readInt(1127113644) * -681616263;
	    aByte1823 = (byte) class525_sub38.readUnsignedByte(1685384331);
	    class525_sub38.readUnsignedByte(1442241117);
	    aByte1809 = (byte) class525_sub38.readUnsignedByte(2056249333);
	    aBool1829 = class525_sub38.readUnsignedByte(512145445) == 1;
	    aBool1819 = class525_sub38.readUnsignedByte(586154799) == 1;
	    aByte1831 = (byte) class525_sub38.readUnsignedByte(1207455256);
	    aByte1785 = (byte) class525_sub38.readUnsignedByte(1788115525);
	    aShort1834 = (short) class525_sub38.readUnsignedShort((byte) 74);
	}
    }
    
    void method2673(int i, RSBuffer class525_sub38) {
	anInt1800 = -522172775 * i;
	class525_sub38.readUnsignedByte(1609440393);
	int i_21_ = class525_sub38.readUnsignedByte(492850470);
	if (0 == i_21_)
	    anInt1808 = 990382400;
	else if (i_21_ == 1)
	    anInt1808 = 1980764800;
	else if (i_21_ == 2)
	    anInt1808 = -333437696;
	else if (3 == i_21_)
	    anInt1808 = -666875392;
	else if (i_21_ == 4)
	    anInt1808 = -1333750784;
	int i_22_ = class525_sub38.readInt(1308474908);
	aBool1801 = (i_22_ & 0x1) != 0;
	aBool1802 = 0 != (i_22_ & 0x2);
	aBool1803 = 0 != (i_22_ & 0x10);
	int i_23_ = (byte) class525_sub38.readUnsignedByte(396281457);
	aByte1810 = (byte) (i_23_ & 0x7);
	aByte1811 = (byte) (i_23_ >> 3 & 0x7);
	int i_24_ = class525_sub38.readInt(1807805255);
	if ((i_24_ & 0x10) != 0) {
	    class525_sub38.method16634(-263749150);
	    class525_sub38.method16634(279344376);
	}
	if (aBool1802)
	    class525_sub38.method16634(372637205);
	if ((i_24_ & 0x20) != 0)
	    class525_sub38.readInt(1221639147);
	if ((i_24_ & 0x40) != 0)
	    class525_sub38.readInt(1765596842);
	if (0 != (i_24_ & 0x80))
	    class525_sub38.readInt(1395477351);
	if (0 != (i_24_ & 0x100))
	    class525_sub38.readInt(1426952605);
	if (0 != (i_24_ & 0x200))
	    class525_sub38.readInt(1759185239);
	aBool1815 = class525_sub38.readUnsignedByte(1815326122) == 1;
	Class539.method8888(Class27.method905(1157847337),
			    class525_sub38.readUnsignedByte(740305315), 1583856903);
	Class539.method8888(Class441.method7116((byte) -12),
			    class525_sub38.readUnsignedByte(280636236), 1072508360);
	aClass597_1807
	    = ((Class597)
	       Class539.method8888(Class220.method4205(1552651121),
				   class525_sub38.readUnsignedByte(1652734529),
				   2028077297));
	if (aClass597_1807 == Class597.aClass597_7843)
	    aByte1830 = (byte) class525_sub38.readUnsignedByte(1842732884);
	int i_25_ = class525_sub38.readUnsignedByte(181646639);
	if (0 != (i_25_ & 0x1))
	    aByte1805 = (byte) class525_sub38.readUnsignedByte(299424277);
	if ((i_25_ & 0x2) != 0)
	    aByte1806 = (byte) class525_sub38.readUnsignedByte(253469177);
	if (class525_sub38.readUnsignedByte(257970103) == 1) {
	    aByte1825 = (byte) class525_sub38.readUnsignedByte(869651175);
	    aByte1826 = (byte) class525_sub38.readUnsignedByte(660732875);
	    anInt1793 = class525_sub38.readInt(1697656005) * -681616263;
	    aByte1823 = (byte) class525_sub38.readUnsignedByte(1730041612);
	    class525_sub38.readUnsignedByte(1005157518);
	    aByte1809 = (byte) class525_sub38.readUnsignedByte(1076215648);
	    aBool1829 = class525_sub38.readUnsignedByte(1090269484) == 1;
	    aBool1819 = class525_sub38.readUnsignedByte(1215715868) == 1;
	    aByte1831 = (byte) class525_sub38.readUnsignedByte(1760558720);
	    aByte1785 = (byte) class525_sub38.readUnsignedByte(2081512606);
	    aShort1834 = (short) class525_sub38.readUnsignedShort((byte) 81);
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
	byte[] is = Class112.aClass458_1386.method7476(i, 0, 2111920475);
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
		= ((Class194)
		   Class685.aClass40_Sub8_8691.method76(i_31_, -2098950000))
		      .method3728(i_32_, class88.aString892, (byte) 94);
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (((Class194)
		    Class685.aClass40_Sub8_8691.method76(i_31_, 1696489736))
		       .method3722
		   (i_32_, class88.anInt893 * 2053564367, (byte) 28));
    }
}
