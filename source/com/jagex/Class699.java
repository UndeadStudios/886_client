/* Class699 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class699 implements Iterator
{
    Class525 aClass525_8771;
    Class709 aClass709_8772;
    Class525 aClass525_8773 = null;
    public static Class99[] aClass99Array8774;
    public static int[] anIntArray8775;
    
    public void method14225(Class709 class709) {
	aClass709_8772 = class709;
	aClass525_8771 = aClass709_8772.aClass525_8821.aClass525_7112;
	aClass525_8773 = null;
    }
    
    public boolean method14226() {
	return aClass525_8771 != aClass709_8772.aClass525_8821;
    }
    
    void method14227(byte i) {
	aClass525_8771 = aClass709_8772.aClass525_8821.aClass525_7112;
	aClass525_8773 = null;
    }
    
    void method14228() {
	aClass525_8771 = aClass709_8772.aClass525_8821.aClass525_7112;
	aClass525_8773 = null;
    }
    
    public Object next() {
	Class525 class525 = aClass525_8771;
	if (aClass709_8772.aClass525_8821 == class525) {
	    class525 = null;
	    aClass525_8771 = null;
	} else
	    aClass525_8771 = class525.aClass525_7112;
	aClass525_8773 = class525;
	return class525;
    }
    
    public void method14229(Class709 class709, int i) {
	aClass709_8772 = class709;
	aClass525_8771 = aClass709_8772.aClass525_8821.aClass525_7112;
	aClass525_8773 = null;
    }
    
    public void remove() {
	if (aClass525_8773 == null)
	    throw new IllegalStateException();
	aClass525_8773.method8755(-1933461091);
	aClass525_8773 = null;
    }
    
    public Class699(Class709 class709) {
	aClass709_8772 = class709;
	aClass525_8771 = aClass709_8772.aClass525_8821.aClass525_7112;
	aClass525_8773 = null;
    }
    
    public Object method14230() {
	Class525 class525 = aClass525_8771;
	if (aClass709_8772.aClass525_8821 == class525) {
	    class525 = null;
	    aClass525_8771 = null;
	} else
	    aClass525_8771 = class525.aClass525_7112;
	aClass525_8773 = class525;
	return class525;
    }
    
    public boolean method14231() {
	return aClass525_8771 != aClass709_8772.aClass525_8821;
    }
    
    public Object method14232() {
	Class525 class525 = aClass525_8771;
	if (aClass709_8772.aClass525_8821 == class525) {
	    class525 = null;
	    aClass525_8771 = null;
	} else
	    aClass525_8771 = class525.aClass525_7112;
	aClass525_8773 = class525;
	return class525;
    }
    
    public void method14233() {
	if (aClass525_8773 == null)
	    throw new IllegalStateException();
	aClass525_8773.method8755(-1933461091);
	aClass525_8773 = null;
    }
    
    public Object method14234() {
	Class525 class525 = aClass525_8771;
	if (aClass709_8772.aClass525_8821 == class525) {
	    class525 = null;
	    aClass525_8771 = null;
	} else
	    aClass525_8771 = class525.aClass525_7112;
	aClass525_8773 = class525;
	return class525;
    }
    
    public Class525 method14235(int i) {
	method14227((byte) 1);
	return (Class525) next();
    }
    
    public boolean method14236() {
	return aClass525_8771 != aClass709_8772.aClass525_8821;
    }
    
    public boolean hasNext() {
	return aClass525_8771 != aClass709_8772.aClass525_8821;
    }
    
    static final void method14237(Class525_Sub12 class525_sub12, boolean bool,
				  int i) {
	if (class525_sub12.aBool10524) {
	    if (1293980647 * class525_sub12.anInt10516 < 0
		|| Class198.method3767(client.aClass507_11137
					   .method8362((byte) -1),
				       1293980647 * class525_sub12.anInt10516,
				       -759310977 * class525_sub12.anInt10518,
				       (byte) 2)) {
		if (!bool)
		    Class442.method7125
			(1334650435 * class525_sub12.anInt10527,
			 class525_sub12.anInt10513 * -833422411,
			 class525_sub12.anInt10514 * -1168021715,
			 class525_sub12.anInt10512 * -1370300329,
			 class525_sub12.anInt10516 * 1293980647,
			 -1902379651 * class525_sub12.anInt10517,
			 -759310977 * class525_sub12.anInt10518, -1, 0,
			 1164167591);
		else
		    Class50.method1131(class525_sub12.anInt10527 * 1334650435,
				       -833422411 * class525_sub12.anInt10513,
				       -1168021715 * class525_sub12.anInt10514,
				       class525_sub12.anInt10512 * -1370300329,
				       null, (byte) -34);
		class525_sub12.method8755(-1933461091);
	    }
	} else if (class525_sub12.aBool10515
		   && -1168021715 * class525_sub12.anInt10514 >= 1
		   && class525_sub12.anInt10512 * -1370300329 >= 1
		   && (-1168021715 * class525_sub12.anInt10514
		       <= client.aClass507_11137.method8412(472790647) - 2)
		   && (-1370300329 * class525_sub12.anInt10512
		       <= client.aClass507_11137.method8352((byte) -75) - 2)
		   && (class525_sub12.anInt10519 * -1427028605 < 0
		       || Class198.method3767(client.aClass507_11137
						  .method8362((byte) -1),
					      (-1427028605
					       * class525_sub12.anInt10519),
					      (class525_sub12.anInt10521
					       * -582357193),
					      (byte) 2))) {
	    if (!bool)
		Class442.method7125(1334650435 * class525_sub12.anInt10527,
				    class525_sub12.anInt10513 * -833422411,
				    class525_sub12.anInt10514 * -1168021715,
				    -1370300329 * class525_sub12.anInt10512,
				    class525_sub12.anInt10519 * -1427028605,
				    class525_sub12.anInt10520 * 471577503,
				    -582357193 * class525_sub12.anInt10521, -1,
				    0, 1164167591);
	    else
		Class50.method1131(class525_sub12.anInt10527 * 1334650435,
				   -833422411 * class525_sub12.anInt10513,
				   class525_sub12.anInt10514 * -1168021715,
				   -1370300329 * class525_sub12.anInt10512,
				   class525_sub12.aClass604_10522, (byte) -58);
	    class525_sub12.aBool10515 = false;
	    if (!bool
		&& (class525_sub12.anInt10519 * -1427028605
		    == class525_sub12.anInt10516 * 1293980647)
		&& class525_sub12.anInt10516 * 1293980647 == -1)
		class525_sub12.method8755(-1933461091);
	    else if (!bool
		     && (class525_sub12.anInt10519 * -1427028605
			 == class525_sub12.anInt10516 * 1293980647)
		     && (class525_sub12.anInt10517 * -1902379651
			 == 471577503 * class525_sub12.anInt10520)
		     && (class525_sub12.anInt10518 * -759310977
			 == -582357193 * class525_sub12.anInt10521))
		class525_sub12.method8755(-1933461091);
	}
    }
}
