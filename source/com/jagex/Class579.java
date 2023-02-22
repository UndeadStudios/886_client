/* Class579 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Point;

public class Class579 implements Interface68
{
    String aString7673;
    Class30 aClass30_7674;
    int anInt7675;
    String aString7676;
    
    public void method285() {
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4288,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	int i = ((class525_sub15.aClass525_Sub38_Sub2_10546.index
		  += 339428471)
		 * -1133521593);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16735(aClass30_7674.method80(), -822529735);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(aString7673,
							      -1209772912);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16602(anInt7675 * 2062157925, 1313770727);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16700(Class512.aString5684, 2109449911);
	if (aString7676 != null) {
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(1,
								  -165237057);
	    String string = aString7676;
	    if (string.length() > 100)
		string = string.substring(0, 100);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
								  1651368884);
	} else
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(0,
								  -1777845638);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16617
	    ((class525_sub15.aClass525_Sub38_Sub2_10546.index
	      * -1133521593) - i,
	     (byte) 7);
	client.aClass96_11085.method1794(class525_sub15, (short) 15898);
    }
    
    public void method211(int i) {
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4288,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	int i_0_ = ((class525_sub15.aClass525_Sub38_Sub2_10546.index
		     += 339428471)
		    * -1133521593);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16735(aClass30_7674.method80(), -360825373);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(aString7673,
							      -1376332067);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16602(anInt7675 * 2062157925, 1130538344);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16700(Class512.aString5684, -534780825);
	if (aString7676 != null) {
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(1,
								  -1275699998);
	    String string = aString7676;
	    if (string.length() > 100)
		string = string.substring(0, 100);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
								  1598600209);
	} else
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(0,
								  -555200122);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16617
	    ((class525_sub15.aClass525_Sub38_Sub2_10546.index
	      * -1133521593) - i_0_,
	     (byte) 7);
	client.aClass96_11085.method1794(class525_sub15, (short) 8723);
    }
    
    Class579(Class30 class30, String string, int i, Throwable throwable) {
	aClass30_7674 = class30;
	aString7673 = string;
	anInt7675 = i * 808806765;
	aString7676 = null != throwable ? throwable.getMessage() : null;
    }
    
    public void method127() {
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4288,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	int i = ((class525_sub15.aClass525_Sub38_Sub2_10546.index
		  += 339428471)
		 * -1133521593);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16735(aClass30_7674.method80(), -1387514940);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(aString7673,
							      1444284640);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16602(anInt7675 * 2062157925, 1006514242);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16700(Class512.aString5684, 1770665284);
	if (aString7676 != null) {
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(1,
								  -295079314);
	    String string = aString7676;
	    if (string.length() > 100)
		string = string.substring(0, 100);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
								  1336947180);
	} else
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(0,
								  -1531340924);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16617
	    ((class525_sub15.aClass525_Sub38_Sub2_10546.index
	      * -1133521593) - i,
	     (byte) 7);
	client.aClass96_11085.method1794(class525_sub15, (short) 16608);
    }
    
    public static boolean method9584(int i, int i_1_) {
	return (i >= Class608.aClass608_7992.anInt7995 * -1214990409
		&& i <= -1214990409 * Class608.aClass608_7977.anInt7995);
    }
    
    static void method9585(short i) {
	synchronized (Class654.aQueue8395) {
	    Point point;
	    if (Class532.aCanvas7169.isShowing())
		point = Class532.aCanvas7169.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class525_Sub41_Sub2 class525_sub41_sub2
		    = (Class525_Sub41_Sub2) Class654.aQueue8395.poll();
		if (null == class525_sub41_sub2)
		    break;
		if (point == null || !Class532.aCanvas7169.isShowing()
		    || !Class280.aBool3001)
		    class525_sub41_sub2.method16861(-290218273);
		else {
		    class525_sub41_sub2.method18524(point, -814261677);
		    if (!class525_sub41_sub2.method18528((byte) 19)
			&& (class525_sub41_sub2.method16870((byte) -71)
			    < -1445589163 * Class434.anInt4827)
			&& (class525_sub41_sub2.method16858((byte) 106)
			    < -1883654023 * Class696_Sub47.anInt11032)
			&& class525_sub41_sub2.method16870((byte) -96) >= 0
			&& class525_sub41_sub2.method16858((byte) 90) >= 0) {
			int i_2_ = class525_sub41_sub2.method16857(2140684663);
			if (class525_sub41_sub2.method16857(2144866155) == -1)
			    Class654.aClass652_Sub1_8399
				.method10749(class525_sub41_sub2, (byte) 74);
			else if (Class525_Sub16_Sub1.method17994(i_2_,
								 (byte) -75))
			    Class654.aClass652_Sub1_8399
				.method17001(class525_sub41_sub2, (byte) 125);
		    }
		}
	    }
	}
    }
    
    static final void method9586(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.aBool2692
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) == 1;
	Class649.method10708(class259, (byte) 0);
    }
    
    static void method9587(Class444 class444, Class435 class435, int i,
			   int i_3_, short i_4_) {
	if (Class61.aClass435_663 == null)
	    Class61.aClass435_663 = new Class435(class435);
	else
	    Class61.aClass435_663.method6947(class435);
	Class61.aClass444_685.method7154(class444);
	Class61.anInt667 = i * -908739733;
	Class61.anInt672 = i_3_ * -1010858303;
    }
}
