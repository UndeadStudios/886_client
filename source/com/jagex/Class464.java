/* Class464 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Comparator;

class Class464 implements Comparator
{
    Class479 this$0;
    
    public int method7648(Object object, Object object_0_) {
	return method7650((Class462) object, (Class462) object_0_, 595798521);
    }
    
    public boolean method7649(Object object) {
	return super.equals(object);
    }
    
    public int compare(Object object, Object object_1_) {
	return method7650((Class462) object, (Class462) object_1_, 595798521);
    }
    
    int method7650(Class462 class462, Class462 class462_2_, int i) {
	if (class462.aLong5092 * 8772797108211683043L
	    > 8772797108211683043L * class462_2_.aLong5092)
	    return 1;
	if (8772797108211683043L * class462.aLong5092
	    < class462_2_.aLong5092 * 8772797108211683043L)
	    return -1;
	return 0;
    }
    
    public int method7651(Object object, Object object_3_) {
	return method7650((Class462) object, (Class462) object_3_, 595798521);
    }
    
    public int method7652(Object object, Object object_4_) {
	return method7650((Class462) object, (Class462) object_4_, 595798521);
    }
    
    Class464(Class479 class479) {
	this$0 = class479;
    }
    
    public boolean method7653(Object object) {
	return super.equals(object);
    }
    
    public boolean method7654(Object object) {
	return super.equals(object);
    }
    
    public boolean method7655(Object object) {
	return super.equals(object);
    }
    
    public boolean method7656(Object object) {
	return super.equals(object);
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    int method7657(Class462 class462, Class462 class462_5_) {
	if (class462.aLong5092 * 8772797108211683043L
	    > 8772797108211683043L * class462_5_.aLong5092)
	    return 1;
	if (8772797108211683043L * class462.aLong5092
	    < class462_5_.aLong5092 * 8772797108211683043L)
	    return -1;
	return 0;
    }
    
    static final void method7658(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method7659(Class683 class683, short i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static boolean method7660(int i) {
	if (Class512.aString5685.startsWith("win")) {
	    String string = "msvcr110.dll";
	    String string_6_ = "msvcp110.dll";
	    String[] strings = { string, string_6_ };
	    String string_7_ = System.getenv("WINDIR");
	    if (string_7_ == "")
		return false;
	    for (int i_8_ = 0; i_8_ < strings.length; i_8_++) {
		File file
		    = new File(new StringBuilder().append(string_7_).append
				   ("\\system32\\").append
				   (strings[i_8_]).toString());
		if (!file.exists() || file.isDirectory())
		    return false;
	    }
	    return true;
	}
	if (Class512.aString5685.startsWith("mac")) {
	    boolean bool;
	    try {
		Process process = Runtime.getRuntime().exec("ps -few");
		BufferedReader bufferedreader
		    = (new BufferedReader
		       (new InputStreamReader(process.getInputStream())));
		do {
		    boolean bool_9_;
		    try {
			int i_10_ = process.waitFor();
			if (i_10_ == 0)
			    break;
			bool_9_ = false;
		    } catch (InterruptedException interruptedexception) {
			return false;
		    }
		    return bool_9_;
		} while (false);
		boolean bool_11_ = false;
	    while_109_:
		do {
		    String string;
		    do {
			if ((string = bufferedreader.readLine()) == null)
			    break while_109_;
		    } while (string.toLowerCase().indexOf("soundflowerbed")
			     == -1);
		    bool_11_ = true;
		} while (false);
		bufferedreader.close();
		bool = bool_11_;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	return false;
    }
}
