/* Class633 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class633
{
    List aList8221;
    boolean aBool8222;
    Class531_Sub5_Sub1_Sub1[] aClass531_Sub5_Sub1_Sub1Array8223;
    long aLong8224;
    long aLong8225;
    int anInt8226;
    boolean aBool8227;
    int anInt8228;
    static boolean[] aBoolArray8229 = new boolean[64];
    int anInt8230;
    Class185 aClass185_8231;
    boolean aBool8232;
    int anInt8233;
    public boolean aBool8234 = false;
    List aList8235;
    static boolean[] aBoolArray8236 = new boolean[16];
    
    public void method10328(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	anInt8233 = i;
    }
    
    Class633(int i, boolean bool) {
	aBool8222 = false;
	anInt8228 = 0;
	aList8235 = new LinkedList();
	anInt8226 = 0;
	aList8221 = new LinkedList();
	anInt8230 = 0;
	aBool8227 = false;
	aBool8232 = false;
	aClass185_8231 = new Class185();
	aClass531_Sub5_Sub1_Sub1Array8223 = new Class531_Sub5_Sub1_Sub1[8192];
	method10332(i, bool);
    }
    
    public Class185 method10329() {
	aClass185_8231.aClass698_2081.method14211((byte) 31);
	for (int i = 0; i < aClass531_Sub5_Sub1_Sub1Array8223.length; i++) {
	    if (aClass531_Sub5_Sub1_Sub1Array8223[i] != null
		&& (aClass531_Sub5_Sub1_Sub1Array8223[i].aClass625_12112
		    != null))
		aClass185_8231.aClass698_2081.method14208
		    (aClass531_Sub5_Sub1_Sub1Array8223[i], (byte) 48);
	}
	return aClass185_8231;
    }
    
    public void method10330() {
	aBool8227 = true;
    }
    
    void method10331() {
	aBool8234 = true;
	Iterator iterator = aList8221.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class525_sub29.aClass388_10652.anInt4047 * -1444855139 == 1)
		class525_sub29.method8755(-1933461091);
	}
	for (int i = 0; i < aClass531_Sub5_Sub1_Sub1Array8223.length; i++) {
	    if (aClass531_Sub5_Sub1_Sub1Array8223[i] != null) {
		aClass531_Sub5_Sub1_Sub1Array8223[i].method18784();
		aClass531_Sub5_Sub1_Sub1Array8223[i] = null;
	    }
	}
	anInt8228 = 0;
	aList8235 = new LinkedList();
	anInt8226 = 0;
	aList8221 = new LinkedList();
	anInt8230 = 0;
    }
    
    void method10332(int i, boolean bool) {
	Class616.aList8050.add(this);
	aLong8224 = (long) i;
	aLong8225 = (long) i;
	aBool8227 = true;
	aBool8232 = bool;
    }
    
    void method10333(int i, boolean bool) {
	Class616.aList8050.add(this);
	aLong8224 = (long) i;
	aLong8225 = (long) i;
	aBool8227 = true;
	aBool8232 = bool;
    }
    
    void method10334(MagnetConfig[] class154s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray8236[i] = false;
	Iterator iterator = aList8221.iterator();
    while_92_:
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class154s != null) {
		for (int i = 0; i < class154s.length; i++) {
		    if (class525_sub29.aClass154_10654 == class154s[i]
			|| (class525_sub29.aClass154_10654
			    == class154s[i].aClass154_1728)) {
			aBoolArray8236[i] = true;
			class525_sub29.method16486(-1522224331);
			continue while_92_;
		    }
		}
	    }
	    if (!bool) {
		class525_sub29.method8755(-1933461091);
		anInt8230--;
		if (class525_sub29.method8756(-1565420425)) {
		    class525_sub29.method8755(-1933461091);
		    Class616.anInt8054 -= 39243455;
		}
	    }
	}
	if (class154s != null) {
	    for (int i = 0; i < class154s.length && i != 16 && anInt8230 != 16;
		 i++) {
		if (!aBoolArray8236[i]) {
		    Class525_Sub29 class525_sub29 = null;
		    if (((class154s[i].method2443
			  (Class616.anInterface49_8049, 1063556347).anInt4047)
			 * -1444855139) == 1
			&& Class616.anInt8054 * 262381887 < 32) {
			class525_sub29
			    = new Class525_Sub29(class154s[i], this);
			Class616.aClass10_8053.method695
			    (class525_sub29,
			     (long) (class154s[i].anInt1733 * -1220882097));
			Class616.anInt8054 += 39243455;
		    }
		    if (class525_sub29 == null)
			class525_sub29
			    = new Class525_Sub29(class154s[i], this);
		    aList8221.add(class525_sub29);
		    anInt8230++;
		    aBoolArray8236[i] = true;
		}
	    }
	}
    }
    
    public void method10335(long l) {
	aLong8224 = l;
    }
    
    public void method10336(Class182 class182, long l, Class184[] class184s,
                            MagnetConfig[] class154s, boolean bool) {
	if (!aBool8234) {
	    method10367(class182, class184s, bool);
	    method10338(class154s, bool);
	    aLong8224 = l;
	}
    }
    
    public void method10337(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
	anInt8233 = i;
    }
    
    void method10338(MagnetConfig[] class154s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray8236[i] = false;
	Iterator iterator = aList8221.iterator();
    while_93_:
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class154s != null) {
		for (int i = 0; i < class154s.length; i++) {
		    if (class525_sub29.aClass154_10654 == class154s[i]
			|| (class525_sub29.aClass154_10654
			    == class154s[i].aClass154_1728)) {
			aBoolArray8236[i] = true;
			class525_sub29.method16486(1983331396);
			continue while_93_;
		    }
		}
	    }
	    if (!bool) {
		class525_sub29.method8755(-1933461091);
		anInt8230--;
		if (class525_sub29.method8756(1586865463)) {
		    class525_sub29.method8755(-1933461091);
		    Class616.anInt8054 -= 39243455;
		}
	    }
	}
	if (class154s != null) {
	    for (int i = 0; i < class154s.length && i != 16 && anInt8230 != 16;
		 i++) {
		if (!aBoolArray8236[i]) {
		    Class525_Sub29 class525_sub29 = null;
		    if (((class154s[i].method2443
			  (Class616.anInterface49_8049, 1261306243).anInt4047)
			 * -1444855139) == 1
			&& Class616.anInt8054 * 262381887 < 32) {
			class525_sub29
			    = new Class525_Sub29(class154s[i], this);
			Class616.aClass10_8053.method695
			    (class525_sub29,
			     (long) (class154s[i].anInt1733 * -1220882097));
			Class616.anInt8054 += 39243455;
		    }
		    if (class525_sub29 == null)
			class525_sub29
			    = new Class525_Sub29(class154s[i], this);
		    aList8221.add(class525_sub29);
		    anInt8230++;
		    aBoolArray8236[i] = true;
		}
	    }
	}
    }
    
    void method10339() {
	aBool8234 = true;
	Iterator iterator = aList8221.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class525_sub29.aClass388_10652.anInt4047 * -1444855139 == 1)
		class525_sub29.method8755(-1933461091);
	}
	for (int i = 0; i < aClass531_Sub5_Sub1_Sub1Array8223.length; i++) {
	    if (aClass531_Sub5_Sub1_Sub1Array8223[i] != null) {
		aClass531_Sub5_Sub1_Sub1Array8223[i].method18784();
		aClass531_Sub5_Sub1_Sub1Array8223[i] = null;
	    }
	}
	anInt8228 = 0;
	aList8235 = new LinkedList();
	anInt8226 = 0;
	aList8221 = new LinkedList();
	anInt8230 = 0;
    }
    
    void method10340(Class546 class546, Class182 class182) {
	aClass185_8231.aClass698_2081.method14211((byte) 96);
	Iterator iterator = aList8235.iterator();
	while (iterator.hasNext()) {
	    Class625 class625 = (Class625) iterator.next();
	    class625.method10242(class546, class182, aLong8225);
	}
    }
    
    public void method10341(int i, int i_8_, int i_9_, int i_10_, int i_11_) {
	anInt8233 = i;
    }
    
    public void method10342() {
	aBool8227 = true;
    }
    
    public static Class633 method10343(int i, boolean bool) {
	if (Class616.anInt8046 * 1593133783
	    != Class616.anInt8045 * -353918167) {
	    Class633 class633
		= Class329.aClass633Array3589[Class616.anInt8045 * -353918167];
	    Class616.anInt8045
		= ((Class616.anInt8045 * -353918167 + 1
		    & Class181.anIntArray1922[Class616.anInt8047 * 1206403205])
		   * 2008262937);
	    class633.method10332(i, bool);
	    return class633;
	}
	return new Class633(i, bool);
    }
    
    public static Class633 method10344(int i, boolean bool) {
	if (Class616.anInt8046 * 1593133783
	    != Class616.anInt8045 * -353918167) {
	    Class633 class633
		= Class329.aClass633Array3589[Class616.anInt8045 * -353918167];
	    Class616.anInt8045
		= ((Class616.anInt8045 * -353918167 + 1
		    & Class181.anIntArray1922[Class616.anInt8047 * 1206403205])
		   * 2008262937);
	    class633.method10332(i, bool);
	    return class633;
	}
	return new Class633(i, bool);
    }
    
    public static Class633 method10345(int i, boolean bool) {
	if (Class616.anInt8046 * 1593133783
	    != Class616.anInt8045 * -353918167) {
	    Class633 class633
		= Class329.aClass633Array3589[Class616.anInt8045 * -353918167];
	    Class616.anInt8045
		= ((Class616.anInt8045 * -353918167 + 1
		    & Class181.anIntArray1922[Class616.anInt8047 * 1206403205])
		   * 2008262937);
	    class633.method10332(i, bool);
	    return class633;
	}
	return new Class633(i, bool);
    }
    
    public static Class633 method10346(int i, boolean bool) {
	if (Class616.anInt8046 * 1593133783
	    != Class616.anInt8045 * -353918167) {
	    Class633 class633
		= Class329.aClass633Array3589[Class616.anInt8045 * -353918167];
	    Class616.anInt8045
		= ((Class616.anInt8045 * -353918167 + 1
		    & Class181.anIntArray1922[Class616.anInt8047 * 1206403205])
		   * 2008262937);
	    class633.method10332(i, bool);
	    return class633;
	}
	return new Class633(i, bool);
    }
    
    public void method10347() {
	aBool8227 = true;
    }
    
    public static Class633 method10348(int i, boolean bool) {
	if (Class616.anInt8046 * 1593133783
	    != Class616.anInt8045 * -353918167) {
	    Class633 class633
		= Class329.aClass633Array3589[Class616.anInt8045 * -353918167];
	    Class616.anInt8045
		= ((Class616.anInt8045 * -353918167 + 1
		    & Class181.anIntArray1922[Class616.anInt8047 * 1206403205])
		   * 2008262937);
	    class633.method10332(i, bool);
	    return class633;
	}
	return new Class633(i, bool);
    }
    
    boolean method10349(Class182 class182, long l) {
	if (aLong8224 != aLong8225)
	    method10373();
	else
	    method10358();
	if (l - aLong8224 > 750L) {
	    method10331();
	    return false;
	}
	int i = (int) (l - aLong8225);
	if (aBool8227) {
	    Iterator iterator = aList8235.iterator();
	    while (iterator.hasNext()) {
		Class625 class625 = (Class625) iterator.next();
		for (int i_12_ = 0;
		     i_12_ < class625.aClass382_8131.anInt3966 * -409126285;
		     i_12_++)
		    class625.method10243(class182, l, 1, !aBool8222,
					 -65518760);
	    }
	    aBool8227 = false;
	}
	Iterator iterator = aList8235.iterator();
	while (iterator.hasNext()) {
	    Class625 class625 = (Class625) iterator.next();
	    class625.method10243(class182, l, i, !aBool8222, 1312392655);
	}
	aLong8225 = l;
	return true;
    }
    
    public Class185 method10350() {
	return aClass185_8231;
    }
    
    void method10351() {
	aBool8234 = true;
	Iterator iterator = aList8221.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class525_sub29.aClass388_10652.anInt4047 * -1444855139 == 1)
		class525_sub29.method8755(-1933461091);
	}
	for (int i = 0; i < aClass531_Sub5_Sub1_Sub1Array8223.length; i++) {
	    if (aClass531_Sub5_Sub1_Sub1Array8223[i] != null) {
		aClass531_Sub5_Sub1_Sub1Array8223[i].method18784();
		aClass531_Sub5_Sub1_Sub1Array8223[i] = null;
	    }
	}
	anInt8228 = 0;
	aList8235 = new LinkedList();
	anInt8226 = 0;
	aList8221 = new LinkedList();
	anInt8230 = 0;
    }
    
    void method10352() {
	aBool8234 = true;
	Iterator iterator = aList8221.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class525_sub29.aClass388_10652.anInt4047 * -1444855139 == 1)
		class525_sub29.method8755(-1933461091);
	}
	for (int i = 0; i < aClass531_Sub5_Sub1_Sub1Array8223.length; i++) {
	    if (aClass531_Sub5_Sub1_Sub1Array8223[i] != null) {
		aClass531_Sub5_Sub1_Sub1Array8223[i].method18784();
		aClass531_Sub5_Sub1_Sub1Array8223[i] = null;
	    }
	}
	anInt8228 = 0;
	aList8235 = new LinkedList();
	anInt8226 = 0;
	aList8221 = new LinkedList();
	anInt8230 = 0;
    }
    
    void method10353() {
	aBool8234 = true;
	Iterator iterator = aList8221.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class525_sub29.aClass388_10652.anInt4047 * -1444855139 == 1)
		class525_sub29.method8755(-1933461091);
	}
	for (int i = 0; i < aClass531_Sub5_Sub1_Sub1Array8223.length; i++) {
	    if (aClass531_Sub5_Sub1_Sub1Array8223[i] != null) {
		aClass531_Sub5_Sub1_Sub1Array8223[i].method18784();
		aClass531_Sub5_Sub1_Sub1Array8223[i] = null;
	    }
	}
	anInt8228 = 0;
	aList8235 = new LinkedList();
	anInt8226 = 0;
	aList8221 = new LinkedList();
	anInt8230 = 0;
    }
    
    void method10354() {
	aBool8234 = true;
	Iterator iterator = aList8221.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class525_sub29.aClass388_10652.anInt4047 * -1444855139 == 1)
		class525_sub29.method8755(-1933461091);
	}
	for (int i = 0; i < aClass531_Sub5_Sub1_Sub1Array8223.length; i++) {
	    if (aClass531_Sub5_Sub1_Sub1Array8223[i] != null) {
		aClass531_Sub5_Sub1_Sub1Array8223[i].method18784();
		aClass531_Sub5_Sub1_Sub1Array8223[i] = null;
	    }
	}
	anInt8228 = 0;
	aList8235 = new LinkedList();
	anInt8226 = 0;
	aList8221 = new LinkedList();
	anInt8230 = 0;
    }
    
    public void method10355(long l) {
	aLong8224 = l;
    }
    
    void method10356() {
	aBool8234 = true;
	Iterator iterator = aList8221.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class525_sub29.aClass388_10652.anInt4047 * -1444855139 == 1)
		class525_sub29.method8755(-1933461091);
	}
	for (int i = 0; i < aClass531_Sub5_Sub1_Sub1Array8223.length; i++) {
	    if (aClass531_Sub5_Sub1_Sub1Array8223[i] != null) {
		aClass531_Sub5_Sub1_Sub1Array8223[i].method18784();
		aClass531_Sub5_Sub1_Sub1Array8223[i] = null;
	    }
	}
	anInt8228 = 0;
	aList8235 = new LinkedList();
	anInt8226 = 0;
	aList8221 = new LinkedList();
	anInt8230 = 0;
    }
    
    void method10357(Class546 class546, Class182 class182) {
	aClass185_8231.aClass698_2081.method14211((byte) 105);
	Iterator iterator = aList8235.iterator();
	while (iterator.hasNext()) {
	    Class625 class625 = (Class625) iterator.next();
	    class625.method10242(class546, class182, aLong8225);
	}
    }
    
    void method10358() {
	aBool8222 = false;
    }
    
    public void method10359() {
	aBool8227 = true;
    }
    
    public void method10360(long l) {
	aLong8224 = l;
    }
    
    public void method10361(long l) {
	aLong8224 = l;
    }
    
    void method10362(MagnetConfig[] class154s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray8236[i] = false;
	Iterator iterator = aList8221.iterator();
    while_94_:
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class154s != null) {
		for (int i = 0; i < class154s.length; i++) {
		    if (class525_sub29.aClass154_10654 == class154s[i]
			|| (class525_sub29.aClass154_10654
			    == class154s[i].aClass154_1728)) {
			aBoolArray8236[i] = true;
			class525_sub29.method16486(-1000588271);
			continue while_94_;
		    }
		}
	    }
	    if (!bool) {
		class525_sub29.method8755(-1933461091);
		anInt8230--;
		if (class525_sub29.method8756(-1170298512)) {
		    class525_sub29.method8755(-1933461091);
		    Class616.anInt8054 -= 39243455;
		}
	    }
	}
	if (class154s != null) {
	    for (int i = 0; i < class154s.length && i != 16 && anInt8230 != 16;
		 i++) {
		if (!aBoolArray8236[i]) {
		    Class525_Sub29 class525_sub29 = null;
		    if (((class154s[i].method2443
			  (Class616.anInterface49_8049, 948937562).anInt4047)
			 * -1444855139) == 1
			&& Class616.anInt8054 * 262381887 < 32) {
			class525_sub29
			    = new Class525_Sub29(class154s[i], this);
			Class616.aClass10_8053.method695
			    (class525_sub29,
			     (long) (class154s[i].anInt1733 * -1220882097));
			Class616.anInt8054 += 39243455;
		    }
		    if (class525_sub29 == null)
			class525_sub29
			    = new Class525_Sub29(class154s[i], this);
		    aList8221.add(class525_sub29);
		    anInt8230++;
		    aBoolArray8236[i] = true;
		}
	    }
	}
    }
    
    void method10363(MagnetConfig[] class154s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray8236[i] = false;
	Iterator iterator = aList8221.iterator();
    while_95_:
	while (iterator.hasNext()) {
	    Class525_Sub29 class525_sub29 = (Class525_Sub29) iterator.next();
	    if (class154s != null) {
		for (int i = 0; i < class154s.length; i++) {
		    if (class525_sub29.aClass154_10654 == class154s[i]
			|| (class525_sub29.aClass154_10654
			    == class154s[i].aClass154_1728)) {
			aBoolArray8236[i] = true;
			class525_sub29.method16486(-704436728);
			continue while_95_;
		    }
		}
	    }
	    if (!bool) {
		class525_sub29.method8755(-1933461091);
		anInt8230--;
		if (class525_sub29.method8756(1289077563)) {
		    class525_sub29.method8755(-1933461091);
		    Class616.anInt8054 -= 39243455;
		}
	    }
	}
	if (class154s != null) {
	    for (int i = 0; i < class154s.length && i != 16 && anInt8230 != 16;
		 i++) {
		if (!aBoolArray8236[i]) {
		    Class525_Sub29 class525_sub29 = null;
		    if (((class154s[i].method2443
			  (Class616.anInterface49_8049, 1402032036).anInt4047)
			 * -1444855139) == 1
			&& Class616.anInt8054 * 262381887 < 32) {
			class525_sub29
			    = new Class525_Sub29(class154s[i], this);
			Class616.aClass10_8053.method695
			    (class525_sub29,
			     (long) (class154s[i].anInt1733 * -1220882097));
			Class616.anInt8054 += 39243455;
		    }
		    if (class525_sub29 == null)
			class525_sub29
			    = new Class525_Sub29(class154s[i], this);
		    aList8221.add(class525_sub29);
		    anInt8230++;
		    aBoolArray8236[i] = true;
		}
	    }
	}
    }
    
    boolean method10364(Class182 class182, long l) {
	if (aLong8224 != aLong8225)
	    method10373();
	else
	    method10358();
	if (l - aLong8224 > 750L) {
	    method10331();
	    return false;
	}
	int i = (int) (l - aLong8225);
	if (aBool8227) {
	    Iterator iterator = aList8235.iterator();
	    while (iterator.hasNext()) {
		Class625 class625 = (Class625) iterator.next();
		for (int i_13_ = 0;
		     i_13_ < class625.aClass382_8131.anInt3966 * -409126285;
		     i_13_++)
		    class625.method10243(class182, l, 1, !aBool8222,
					 -1102984546);
	    }
	    aBool8227 = false;
	}
	Iterator iterator = aList8235.iterator();
	while (iterator.hasNext()) {
	    Class625 class625 = (Class625) iterator.next();
	    class625.method10243(class182, l, i, !aBool8222, -74134807);
	}
	aLong8225 = l;
	return true;
    }
    
    public Class185 method10365() {
	aClass185_8231.aClass698_2081.method14211((byte) 71);
	for (int i = 0; i < aClass531_Sub5_Sub1_Sub1Array8223.length; i++) {
	    if (aClass531_Sub5_Sub1_Sub1Array8223[i] != null
		&& (aClass531_Sub5_Sub1_Sub1Array8223[i].aClass625_12112
		    != null))
		aClass185_8231.aClass698_2081.method14208
		    (aClass531_Sub5_Sub1_Sub1Array8223[i], (byte) 52);
	}
	return aClass185_8231;
    }
    
    public Class185 method10366() {
	aClass185_8231.aClass698_2081.method14211((byte) 11);
	for (int i = 0; i < aClass531_Sub5_Sub1_Sub1Array8223.length; i++) {
	    if (aClass531_Sub5_Sub1_Sub1Array8223[i] != null
		&& (aClass531_Sub5_Sub1_Sub1Array8223[i].aClass625_12112
		    != null))
		aClass185_8231.aClass698_2081.method14208
		    (aClass531_Sub5_Sub1_Sub1Array8223[i], (byte) 79);
	}
	return aClass185_8231;
    }
    
    void method10367(Class182 class182, Class184[] class184s, boolean bool) {
	for (int i = 0; i < 64; i++)
	    aBoolArray8229[i] = false;
	Iterator iterator = aList8235.iterator();
    while_96_:
	while (iterator.hasNext()) {
	    Class625 class625 = (Class625) iterator.next();
	    if (class184s != null) {
		for (int i = 0; i < class184s.length && i != 64; i++) {
		    if (class625.aClass184_8145 == class184s[i]
			|| (class625.aClass184_8145
			    == class184s[i].aClass184_2070)) {
			aBoolArray8229[i] = true;
			class625.method10252(-1850440091);
			class625.aBool8137 = false;
			continue while_96_;
		    }
		}
	    }
	    if (!bool) {
		if (class625.anInt8135 * 525323507 == 0) {
		    iterator.remove();
		    anInt8226--;
		} else
		    class625.aBool8137 = true;
	    }
	}
	if (class184s != null) {
	    for (int i = 0; i < class184s.length && i != 64 && anInt8226 != 64;
		 i++) {
		if (!aBoolArray8229[i]) {
		    Class625 class625 = new Class625(class182, class184s[i],
						     this, aLong8224);
		    aList8235.add(class625);
		    anInt8226++;
		    aBoolArray8229[i] = true;
		}
	    }
	}
    }
    
    public void method10368(int i, int i_14_, int i_15_, int i_16_,
			    int i_17_) {
	anInt8233 = i;
    }
    
    public void method10369(int i, int i_18_, int i_19_, int i_20_,
			    int i_21_) {
	anInt8233 = i;
    }
    
    public void method10370(int i, int i_22_, int i_23_, int i_24_,
			    int i_25_) {
	anInt8233 = i;
    }
    
    boolean method10371(Class182 class182, long l) {
	if (aLong8224 != aLong8225)
	    method10373();
	else
	    method10358();
	if (l - aLong8224 > 750L) {
	    method10331();
	    return false;
	}
	int i = (int) (l - aLong8225);
	if (aBool8227) {
	    Iterator iterator = aList8235.iterator();
	    while (iterator.hasNext()) {
		Class625 class625 = (Class625) iterator.next();
		for (int i_26_ = 0;
		     i_26_ < class625.aClass382_8131.anInt3966 * -409126285;
		     i_26_++)
		    class625.method10243(class182, l, 1, !aBool8222,
					 -16241561);
	    }
	    aBool8227 = false;
	}
	Iterator iterator = aList8235.iterator();
	while (iterator.hasNext()) {
	    Class625 class625 = (Class625) iterator.next();
	    class625.method10243(class182, l, i, !aBool8222, -1482544587);
	}
	aLong8225 = l;
	return true;
    }
    
    void method10372(Class546 class546, Class182 class182) {
	aClass185_8231.aClass698_2081.method14211((byte) 112);
	Iterator iterator = aList8235.iterator();
	while (iterator.hasNext()) {
	    Class625 class625 = (Class625) iterator.next();
	    class625.method10242(class546, class182, aLong8225);
	}
    }
    
    public void method10373() {
	aBool8222 = true;
    }
    
    public Class185 method10374() {
	return aClass185_8231;
    }
}
