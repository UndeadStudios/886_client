/* Class709 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Collection;
import java.util.Iterator;

public class Class709 implements Iterable, Collection
{
    Class525 aClass525_8820;
    public Class525 aClass525_8821 = new Class525();
    public static int anInt8822;
    
    Class525 method14343(Class525 class525, byte i) {
	Class525 class525_0_;
	if (null == class525)
	    class525_0_ = aClass525_8821.aClass525_7112;
	else
	    class525_0_ = class525;
	if (class525_0_ == aClass525_8821) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525_0_.aClass525_7112;
	return class525_0_;
    }
    
    public void method14344(int i) {
	while (aClass525_8821.aClass525_7112 != aClass525_8821)
	    aClass525_8821.aClass525_7112.method8755(-1933461091);
    }
    
    public void method14345(Class525 class525, byte i) {
	if (class525.aClass525_7111 != null)
	    class525.method8755(-1933461091);
	class525.aClass525_7111 = aClass525_8821.aClass525_7111;
	class525.aClass525_7112 = aClass525_8821;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
    }
    
    public int method14346() {
	return super.hashCode();
    }
    
    void method14347(Class709 class709_1_, Class525 class525, short i) {
	Class525 class525_2_ = aClass525_8821.aClass525_7111;
	aClass525_8821.aClass525_7111 = class525.aClass525_7111;
	class525.aClass525_7111.aClass525_7112 = aClass525_8821;
	if (aClass525_8821 != class525) {
	    class525.aClass525_7111
		= class709_1_.aClass525_8821.aClass525_7111;
	    class525.aClass525_7111.aClass525_7112 = class525;
	    class525_2_.aClass525_7112 = class709_1_.aClass525_8821;
	    class709_1_.aClass525_8821.aClass525_7111 = class525_2_;
	}
    }
    
    public void method14348(Class709 class709_3_, int i) {
	if (aClass525_8821.aClass525_7112 != aClass525_8821)
	    method14347(class709_3_, aClass525_8821.aClass525_7112,
			(short) 1020);
    }
    
    boolean method14349(Class525 class525) {
	method14345(class525, (byte) 0);
	return true;
    }
    
    public boolean method14350(Collection collection) {
	throw new RuntimeException();
    }
    
    public Class525 method14351(int i) {
	return method14352(null, (byte) 25);
    }
    
    Class525 method14352(Class525 class525, byte i) {
	Class525 class525_4_;
	if (class525 == null)
	    class525_4_ = aClass525_8821.aClass525_7111;
	else
	    class525_4_ = class525;
	if (aClass525_8821 == class525_4_) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525_4_.aClass525_7111;
	return class525_4_;
    }
    
    public Class525 method14353(int i) {
	Class525 class525 = aClass525_8820;
	if (aClass525_8821 == class525) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525.aClass525_7112;
	return class525;
    }
    
    public Class525 method14354(int i) {
	Class525 class525 = aClass525_8820;
	if (aClass525_8821 == class525) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525.aClass525_7111;
	return class525;
    }
    
    public void method14355() {
	method14344(-438730101);
    }
    
    public boolean method14356(Object object) {
	return super.equals(object);
    }
    
    Class525[] method14357(int i) {
	Class525[] class525s = new Class525[method14410((short) 8192)];
	int i_5_ = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    class525s[i_5_++] = class525;
	return class525s;
    }
    
    Class525[] method14358() {
	Class525[] class525s = new Class525[method14410((short) 8192)];
	int i = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    class525s[i++] = class525;
	return class525s;
    }
    
    public int size() {
	return method14410((short) 8192);
    }
    
    public boolean method14359() {
	return method14363(1226476883);
    }
    
    public int method14360() {
	return method14410((short) 8192);
    }
    
    public Object[] toArray() {
	return method14357(-565625100);
    }
    
    public Object[] toArray(Object[] objects) {
	int i = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    objects[i++] = class525;
	return objects;
    }
    
    boolean method14361(Class525 class525, int i) {
	method14345(class525, (byte) 0);
	return true;
    }
    
    public Iterator method14362() {
	return new Class699(this);
    }
    
    public boolean containsAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean addAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean removeAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean method14363(int i) {
	return aClass525_8821.aClass525_7112 == aClass525_8821;
    }
    
    public void clear() {
	method14344(1763414451);
    }
    
    public int method14364() {
	return method14410((short) 8192);
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public int method14365() {
	return super.hashCode();
    }
    
    public boolean method14366(Object object) {
	return super.equals(object);
    }
    
    Class525 method14367(Class525 class525) {
	Class525 class525_6_;
	if (null == class525)
	    class525_6_ = aClass525_8821.aClass525_7112;
	else
	    class525_6_ = class525;
	if (class525_6_ == aClass525_8821) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525_6_.aClass525_7112;
	return class525_6_;
    }
    
    public boolean method14368(Object object) {
	return super.equals(object);
    }
    
    public Object[] method14369() {
	return method14357(-1397586783);
    }
    
    public boolean method14370(Object object) {
	return super.equals(object);
    }
    
    public int method14371() {
	return super.hashCode();
    }
    
    public Class525 method14372(short i) {
	return method14343(null, (byte) 0);
    }
    
    public boolean method14373(Collection collection) {
	throw new RuntimeException();
    }
    
    public Class525 method14374() {
	Class525 class525 = aClass525_8820;
	if (aClass525_8821 == class525) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525.aClass525_7111;
	return class525;
    }
    
    public Iterator method14375() {
	return new Class699(this);
    }
    
    public int method14376() {
	return method14410((short) 8192);
    }
    
    public boolean method14377(Collection collection) {
	throw new RuntimeException();
    }
    
    public void method14378(Class709 class709_7_) {
	if (aClass525_8821.aClass525_7112 != aClass525_8821)
	    method14347(class709_7_, aClass525_8821.aClass525_7112,
			(short) 1020);
    }
    
    public boolean method14379(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method14380(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method14381(Object object) {
	throw new RuntimeException();
    }
    
    public void method14382() {
	while (aClass525_8821.aClass525_7112 != aClass525_8821)
	    aClass525_8821.aClass525_7112.method8755(-1933461091);
    }
    
    public void method14383(Class525 class525) {
	if (class525.aClass525_7111 != null)
	    class525.method8755(-1933461091);
	class525.aClass525_7111 = aClass525_8821.aClass525_7111;
	class525.aClass525_7112 = aClass525_8821;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
    }
    
    public void method14384(Class525 class525) {
	if (class525.aClass525_7111 != null)
	    class525.method8755(-1933461091);
	class525.aClass525_7111 = aClass525_8821.aClass525_7111;
	class525.aClass525_7112 = aClass525_8821;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
    }
    
    public void method14385(Class525 class525) {
	if (class525.aClass525_7111 != null)
	    class525.method8755(-1933461091);
	class525.aClass525_7111 = aClass525_8821.aClass525_7111;
	class525.aClass525_7112 = aClass525_8821;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
    }
    
    public void method14386(Class525 class525) {
	if (class525.aClass525_7111 != null)
	    class525.method8755(-1933461091);
	class525.aClass525_7111 = aClass525_8821.aClass525_7111;
	class525.aClass525_7112 = aClass525_8821;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
    }
    
    public static void method14387(Class525 class525, Class525 class525_8_) {
	if (null != class525.aClass525_7111)
	    class525.method8755(-1933461091);
	class525.aClass525_7111 = class525_8_.aClass525_7111;
	class525.aClass525_7112 = class525_8_;
	class525.aClass525_7111.aClass525_7112 = class525;
	class525.aClass525_7112.aClass525_7111 = class525;
    }
    
    public Class525 method14388() {
	Class525 class525 = aClass525_8821.aClass525_7112;
	if (class525 == aClass525_8821)
	    return null;
	class525.method8755(-1933461091);
	return class525;
    }
    
    void method14389(Class709 class709_9_, Class525 class525) {
	Class525 class525_10_ = aClass525_8821.aClass525_7111;
	aClass525_8821.aClass525_7111 = class525.aClass525_7111;
	class525.aClass525_7111.aClass525_7112 = aClass525_8821;
	if (aClass525_8821 != class525) {
	    class525.aClass525_7111
		= class709_9_.aClass525_8821.aClass525_7111;
	    class525.aClass525_7111.aClass525_7112 = class525;
	    class525_10_.aClass525_7112 = class709_9_.aClass525_8821;
	    class709_9_.aClass525_8821.aClass525_7111 = class525_10_;
	}
    }
    
    void method14390(Class709 class709_11_, Class525 class525) {
	Class525 class525_12_ = aClass525_8821.aClass525_7111;
	aClass525_8821.aClass525_7111 = class525.aClass525_7111;
	class525.aClass525_7111.aClass525_7112 = aClass525_8821;
	if (aClass525_8821 != class525) {
	    class525.aClass525_7111
		= class709_11_.aClass525_8821.aClass525_7111;
	    class525.aClass525_7111.aClass525_7112 = class525;
	    class525_12_.aClass525_7112 = class709_11_.aClass525_8821;
	    class709_11_.aClass525_8821.aClass525_7111 = class525_12_;
	}
    }
    
    public boolean retainAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public Class525 method14391() {
	return method14343(null, (byte) 0);
    }
    
    public Class525 method14392() {
	return method14343(null, (byte) 0);
    }
    
    public boolean method14393() {
	return method14363(-873544524);
    }
    
    Class525 method14394(Class525 class525) {
	Class525 class525_13_;
	if (null == class525)
	    class525_13_ = aClass525_8821.aClass525_7112;
	else
	    class525_13_ = class525;
	if (class525_13_ == aClass525_8821) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525_13_.aClass525_7112;
	return class525_13_;
    }
    
    public Class525 method14395() {
	return method14352(null, (byte) 2);
    }
    
    public Class525 method14396() {
	return method14352(null, (byte) 71);
    }
    
    public Class525 method14397() {
	return method14352(null, (byte) 127);
    }
    
    public Class525 method14398() {
	return method14352(null, (byte) 36);
    }
    
    public boolean isEmpty() {
	return method14363(1327646514);
    }
    
    Class525 method14399(Class525 class525) {
	Class525 class525_14_;
	if (class525 == null)
	    class525_14_ = aClass525_8821.aClass525_7111;
	else
	    class525_14_ = class525;
	if (aClass525_8821 == class525_14_) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525_14_.aClass525_7111;
	return class525_14_;
    }
    
    public Class525 method14400() {
	Class525 class525 = aClass525_8820;
	if (aClass525_8821 == class525) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525.aClass525_7112;
	return class525;
    }
    
    public Class525 method14401() {
	Class525 class525 = aClass525_8820;
	if (aClass525_8821 == class525) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525.aClass525_7111;
	return class525;
    }
    
    public boolean remove(Object object) {
	throw new RuntimeException();
    }
    
    public int method14402() {
	int i = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    i++;
	return i;
    }
    
    public int method14403() {
	int i = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    i++;
	return i;
    }
    
    public boolean method14404() {
	return aClass525_8821.aClass525_7112 == aClass525_8821;
    }
    
    Class525[] method14405() {
	Class525[] class525s = new Class525[method14410((short) 8192)];
	int i = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    class525s[i++] = class525;
	return class525s;
    }
    
    public Object[] method14406() {
	return method14357(-26592590);
    }
    
    public boolean method14407(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean contains(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method14408() {
	return method14363(7863243);
    }
    
    public Object[] method14409(Object[] objects) {
	int i = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    objects[i++] = class525;
	return objects;
    }
    
    public Iterator iterator() {
	return new Class699(this);
    }
    
    public int method14410(short i) {
	int i_15_ = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    i_15_++;
	return i_15_;
    }
    
    public Object[] method14411() {
	return method14357(-1525511745);
    }
    
    public boolean method14412(Collection collection) {
	throw new RuntimeException();
    }
    
    public Object[] method14413(Object[] objects) {
	int i = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    objects[i++] = class525;
	return objects;
    }
    
    public Object[] method14414(Object[] objects) {
	int i = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    objects[i++] = class525;
	return objects;
    }
    
    public Object[] method14415(Object[] objects) {
	int i = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    objects[i++] = class525;
	return objects;
    }
    
    public boolean method14416(Object object) {
	return super.equals(object);
    }
    
    public int hashCode() {
	return super.hashCode();
    }
    
    public boolean method14417(Collection collection) {
	throw new RuntimeException();
    }
    
    public Class709() {
	aClass525_8821.aClass525_7112 = aClass525_8821;
	aClass525_8821.aClass525_7111 = aClass525_8821;
    }
    
    public boolean method14418(Collection collection) {
	throw new RuntimeException();
    }
    
    Class525 method14419(Class525 class525) {
	Class525 class525_16_;
	if (class525 == null)
	    class525_16_ = aClass525_8821.aClass525_7111;
	else
	    class525_16_ = class525;
	if (aClass525_8821 == class525_16_) {
	    aClass525_8820 = null;
	    return null;
	}
	aClass525_8820 = class525_16_.aClass525_7111;
	return class525_16_;
    }
    
    public Object[] method14420(Object[] objects) {
	int i = 0;
	for (Class525 class525 = aClass525_8821.aClass525_7112;
	     class525 != aClass525_8821; class525 = class525.aClass525_7112)
	    objects[i++] = class525;
	return objects;
    }
    
    public boolean method14421(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean method14422(Collection collection) {
	throw new RuntimeException();
    }
    
    public Class525 method14423(int i) {
	Class525 class525 = aClass525_8821.aClass525_7112;
	if (class525 == aClass525_8821)
	    return null;
	class525.method8755(-1933461091);
	return class525;
    }
    
    public Object[] method14424() {
	return method14357(-2057368708);
    }
    
    public void method14425() {
	method14344(-908955139);
    }
    
    public boolean add(Object object) {
	return method14361((Class525) object, -1133521593);
    }
    
    public void method14426() {
	method14344(-1472824041);
    }
    
    public boolean method14427(Object object) {
	return method14361((Class525) object, -1133521593);
    }
    
    static final void method14428(int i) {
	for (Class531_Sub4 class531_sub4
		 = ((Class531_Sub4)
		    client.aClass708_11202.method14327(2068906191));
	     class531_sub4 != null;
	     class531_sub4 = ((Class531_Sub4)
			      client.aClass708_11202.method14327(605324618)))
	    Class564.method9453(class531_sub4, 2127095541);
	int i_17_ = 0;
	int i_18_ = 3;
	if (client.anInt11145 * 1874190559 == 4) {
	    for (int i_19_ = i_17_; i_19_ <= i_18_; i_19_++)
		client.method17527(i_19_);
	    client.method17529();
	} else {
	    client.method17524();
	    for (int i_20_ = i_17_; i_20_ <= i_18_; i_20_++) {
		client.method17666();
		client.method17526(i_20_);
		client.method17527(i_20_);
	    }
	    client.method17726();
	    client.method17529();
	}
    }
}
