/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;

public class Class116
{
    static boolean aBool1409;
    static final String aString1410 = "Success";
    static String[] aStringArray1411;
    static int anInt1412 = 0;
    static int anInt1413 = 0;
    static String aString1414 = "";
    static int anInt1415 = 0;
    static int anInt1416;
    static int anInt1417;
    static final String aString1418 = "\\/.:, _-+[]~@";
    static int anInt1419;
    static int anInt1420 = 0;
    static final int anInt1421 = 350;
    static final String aString1422 = "Failure";
    
    public static void method2017(String string, boolean bool,
				  boolean bool_0_) {
	do {
	    try {
		if (string.equalsIgnoreCase("commands")
		    || string.equalsIgnoreCase("help")) {
		    Class268.method4961("commands - This command", 1624830337);
		    Class268.method4961("cls - Clear console", 1574986299);
		    Class268.method4961
			("displayfps - Toggle FPS and other information",
			 1410249884);
		    Class268.method4961
			("renderer - Print graphics renderer information",
			 1992385173);
		    Class268.method4961("heap - Print java memory information",
					1979062532);
		    Class268.method4961
			("getcamerapos - Print location and direction of camera for use in bug reports",
			 1322186806);
		} else if (string.equalsIgnoreCase("cls")) {
		    anInt1412 = 0;
		    anInt1413 = 0;
		} else if (string.equalsIgnoreCase("displayfps")) {
		    client.aBool11086 = !client.aBool11086;
		    if (client.aBool11086)
			Class268.method4961("FPS on", 1838162325);
		    else
			Class268.method4961("FPS off", 1377816848);
		} else if (string.equals("renderer")) {
		    Class170 class170 = Class501.aClass182_5564.method3130();
		    Class268.method4961(new StringBuilder().append
					    ("Toolkit ID: ").append
					    (Class198_Sub13
						 .aClass525_Sub30_9973
						 .aClass696_Sub20_10708
						 .method17160(468711752))
					    .toString(),
					1643693061);
		    Class268.method4961(new StringBuilder().append
					    ("Vendor: ").append
					    (class170.anInt1850 * -1809895579)
					    .toString(),
					1312792299);
		    Class268.method4961(new StringBuilder().append
					    ("Name: ").append
					    (class170.aString1851).toString(),
					1297104946);
		    Class268.method4961(new StringBuilder().append
					    ("Version: ").append
					    (-118228173 * class170.anInt1852)
					    .toString(),
					1582402445);
		    Class268.method4961(new StringBuilder().append
					    ("Device: ").append
					    (class170.aString1853).toString(),
					1515893724);
		    Class268.method4961(new StringBuilder().append
					    ("Driver Version: ").append
					    (4822213046138725271L
					     * class170.aLong1854)
					    .toString(),
					1340428450);
		    String string_1_ = Class501.aClass182_5564.method3265();
		    if (string_1_.length() > 0)
			Class268.method4961(string_1_, 1353105110);
		} else if (string.equals("heap"))
		    Class268.method4961(new StringBuilder().append
					    ("Heap: ").append
					    (-855455283 * Class503.anInt5590)
					    .append
					    ("MB").toString(),
					1740724756);
		else {
		    if (!string.equalsIgnoreCase("getcamerapos"))
			break;
		    Class600 class600
			= client.aClass507_11137.method8350(633278453);
		    if (5 == -174799205 * Class700.anInt8779) {
			Class446 class446 = Class453_Sub3
						.aClass309_Sub1_10316
						.method5486(-417924704);
			Class446 class446_2_
			    = Class453_Sub3.aClass309_Sub1_10316
				  .method5488(-1980821297);
			Class268.method4961
			    (new StringBuilder().append("Pos: ").append
				 (new Class600
				      ((Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.aByte10867),
				       (int) class446.aFloat4895 >> 9,
				       (int) class446.aFloat4897 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (((int) class446.aFloat4895
				     - (class600.anInt7858 * -1227002079
					<< 9)),
				    ((int) class446.aFloat4897
				     - (class600.anInt7860 * 1429253007 << 9)),
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229)) + (int) class446.aFloat4896)
				 .toString(),
			     2056856236);
			Class268.method4961
			    (new StringBuilder().append("Look: ").append
				 (new Class600
				      ((Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.aByte10867),
				       (int) class446_2_.aFloat4895 >> 9,
				       (int) class446_2_.aFloat4897 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (((int) class446_2_.aFloat4895
				     - (class600.anInt7858 * -1227002079
					<< 9)),
				    ((int) class446.aFloat4897
				     - (1429253007 * class600.anInt7860 << 9)),
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229)) + (int) class446.aFloat4896)
				 .toString(),
			     1425461538);
		    } else {
			Class268.method4961
			    (new StringBuilder().append("Pos: ").append
				 (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				  .aByte10867)
				 .append
				 (",").append
				 ((class600.anInt7858 * -1227002079
				   + (-469853907 * Class477.anInt5200 >> 9))
				  >> 6)
				 .append
				 (",").append
				 (((-1889707729 * Class475.anInt5179 >> 9)
				   + 1429253007 * class600.anInt7860) >> 6)
				 .append
				 (",").append
				 (((-469853907 * Class477.anInt5200 >> 9)
				   + -1227002079 * class600.anInt7858) & 0x3f)
				 .append
				 (",").append
				 ((class600.anInt7860 * 1429253007
				   + (Class475.anInt5179 * -1889707729 >> 9))
				  & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (Class477.anInt5200 * -469853907,
				    -1889707729 * Class475.anInt5179,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229))
				  - Class575.anInt7648 * -142598869)
				 .toString(),
			     1397280525);
			Class268.method4961
			    (new StringBuilder().append("Look: ").append
				 (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				  .aByte10867)
				 .append
				 (",").append
				 ((-1227002079 * class600.anInt7858
				   + Class326.anInt3562 * -130227567) >> 6)
				 .append
				 (",").append
				 ((1105240097 * Class198_Sub16.anInt9979
				   + class600.anInt7860 * 1429253007) >> 6)
				 .append
				 (",").append
				 ((-1227002079 * class600.anInt7858
				   + -130227567 * Class326.anInt3562) & 0x3f)
				 .append
				 (",").append
				 ((class600.anInt7860 * 1429253007
				   + Class198_Sub16.anInt9979 * 1105240097)
				  & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (-130227567 * Class326.anInt3562,
				    Class198_Sub16.anInt9979 * 1105240097,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229))
				  - Class350_Sub2.anInt10225 * -458002533)
				 .toString(),
			     2110969003);
		    }
		}
	    } catch (Exception exception) {
		Class268.method4961
		    (Class53.aClass53_381.method1169(Class21.aClass666_213,
						     1552651121),
		     1897710771);
	    }
	    return;
	} while (false);
	if (Class685.aClass685_8686 != Class176.aClass685_1884
	    || 619753713 * client.anInt11231 >= 2) {
	    try {
		if (string.equalsIgnoreCase("wm1")) {
		    Class332_Sub1.method15672(1, -1, -1, false, (byte) -79);
		    if (Class441.method7120((byte) -38) == 1)
			Class268.method4961("Success", 1958588251);
		    else
			Class268.method4961("Failure", 1768973934);
		    return;
		}
		if (string.equalsIgnoreCase("wm2")) {
		    Class332_Sub1.method15672(2, -1, -1, false, (byte) 17);
		    if (Class441.method7120((byte) -115) == 2)
			Class268.method4961("Success", 2043769170);
		    else
			Class268.method4961("Failure", 1818246471);
		    return;
		}
		if (Class695.aBool8757 && string.equalsIgnoreCase("wm3")) {
		    Class332_Sub1.method15672(3, 1024, 768, false, (byte) 13);
		    if (Class441.method7120((byte) -89) == 3)
			Class268.method4961("Success", 1881709091);
		    else
			Class268.method4961("Failure", 1740701248);
		    return;
		}
		if (string.startsWith("setlobby ")) {
		    if (client.anInt11075 * 1777895575 != 1)
			Class268.method4961("Failure", 2126175589);
		    else {
			int i = -1;
			Object object = null;
			string = string.substring(9);
			int i_3_ = string.indexOf(' ');
			if (i_3_ == -1)
			    Class268.method4961("Failure", 1724595037);
			else {
			    try {
				i = Integer.parseInt(string.substring(0,
								      i_3_));
			    } catch (NumberFormatException numberformatexception) {
				/* empty */
			    }
			    if (i == -1)
				Class268.method4961("Failure", 2094755663);
			    else {
				String string_4_
				    = new StringBuilder().append
					  (string.substring(i_3_ + 1).trim())
					  .append
					  (".runescape.com").toString();
				Class547.method9102(string_4_, i, (byte) 109);
				Class268.method4961("Success", 1365777894);
				return;
			    }
			    return;
			}
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk0")) {
		    Class217.method4146(0, false, (byte) 5);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(-564653119)
			== 0) {
			Class268.method4961("Success", 1925461182);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     0, (byte) -124);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1511558434);
		    return;
		}
		if (string.equalsIgnoreCase("tk1")) {
		    Class217.method4146(1, false, (byte) 35);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(-1230480184)
			== 1) {
			Class268.method4961("Success", 1634937199);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     1, (byte) -115);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1428079484);
		    return;
		}
		if (string.equalsIgnoreCase("tk3")) {
		    Class217.method4146(3, false, (byte) 22);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(1480744155)
			== 3) {
			Class268.method4961("Success", 1777840937);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     3, (byte) -87);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1627554407);
		    return;
		}
		if (string.equalsIgnoreCase("tk5")) {
		    Class217.method4146(5, false, (byte) 116);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(-1724005909)
			== 5) {
			Class268.method4961("Success", 1649321035);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     5, (byte) -121);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1880164512);
		    return;
		}
		if (string.equalsIgnoreCase("clientdrop")) {
		    if (client.anInt11075 * 1777895575 == 7)
			Class196.method3742((byte) -22);
		    else if (client.anInt11075 * 1777895575 == 4)
			client.aClass96_11085.aBool1184 = true;
		    return;
		}
		if (string.equalsIgnoreCase("breakcon")) {
		    Class96[] class96s = client.aClass96Array11133;
		    for (int i = 0; i < class96s.length; i++) {
			Class96 class96 = class96s[i];
			if (class96.method1799((byte) 0) != null)
			    class96.method1799((byte) 0).method9378((byte) 26);
		    }
		    Class94.aClass463_912.method7622(1969737582);
		    return;
		}
		if (string.startsWith("getclientvarpbit")) {
		    int i = Integer.parseInt(string.substring(17));
		    Class268.method4961(new StringBuilder().append
					    ("varpbit=").append
					    (Class532.aClass111_7170.method93
					     (Class532.aClass111_7170
						  .method124(i, -747473723),
					      (byte) 2))
					    .toString(),
					1513391123);
		    return;
		}
		if (string.startsWith("getclientvarp")) {
		    int i = Integer.parseInt(string.substring(14));
		    Class268.method4961(new StringBuilder().append("varp=")
					    .append
					    (Class532.aClass111_7170.method104
					     ((Class532.aClass111_7170
						   .method119
					       (Class453.aClass453_4939, i,
						-1949966509)),
					      623775022))
					    .toString(),
					2017548986);
		    return;
		}
		if (string.startsWith("directlogin")) {
		    String[] strings
			= Class481.method7829(string.substring(12), ' ',
					      -2002987744);
		    if (strings.length == 2 || 3 == strings.length) {
			if (Class198_Sub4.method15613(-492271742))
			    Class280.method5162((byte) 22);
			Class350.method6154(strings[0], strings[1],
					    (strings.length > 2 ? strings[2]
					     : ""),
					    true, (byte) 0);
		    }
		    return;
		}
		if (string.startsWith("snlogin ")) {
		    String[] strings = Class481.method7829(string.substring(8),
							   ' ', 427195275);
		    int i = Integer.parseInt(strings[0]);
		    String string_5_ = strings.length > 1 ? strings[1] : "";
		    Class696_Sub33.method17276(i, string_5_, true, -92821388);
		    return;
		}
		if (string.startsWith("setoutput ")) {
		    File file = new File(string.substring(10));
		    if (file.exists()) {
			file = new File(new StringBuilder().append
					    (string.substring(10)).append
					    (".").append
					    (Class251.method4508((byte) 8))
					    .append
					    (".log").toString());
			if (file.exists()) {
			    Class268.method4961("file already exists!",
						1938876436);
			    return;
			}
		    }
		    if (null != Class525_Sub7_Sub11.aFileOutputStream11721) {
			Class525_Sub7_Sub11.aFileOutputStream11721.close();
			Class525_Sub7_Sub11.aFileOutputStream11721 = null;
		    }
		    try {
			Class525_Sub7_Sub11.aFileOutputStream11721
			    = new FileOutputStream(file);
		    } catch (FileNotFoundException filenotfoundexception) {
			Class268.method4961(new StringBuilder().append
						("Could not create ").append
						(file.getName()).toString(),
					    1494008364);
		    } catch (SecurityException securityexception) {
			Class268.method4961(new StringBuilder().append
						("Cannot write to ").append
						(file.getName()).toString(),
					    1394387262);
		    }
		    return;
		}
		if (string.equals("closeoutput")) {
		    if (Class525_Sub7_Sub11.aFileOutputStream11721 != null)
			Class525_Sub7_Sub11.aFileOutputStream11721.close();
		    Class525_Sub7_Sub11.aFileOutputStream11721 = null;
		    return;
		}
		if (string.startsWith("runscript ")) {
		    File file = new File(string.substring(10));
		    if (!file.exists()) {
			Class268.method4961("No such file", 1855684523);
			return;
		    }
		    byte[] is = Class646.method10692(file, (byte) 63);
		    if (is == null) {
			Class268.method4961("Failed to read file", 1953674784);
			return;
		    }
		    String[] strings = (Class481.method7829
					((Class654.method10800
					  (Class540.method8891(is, -987880224),
					   '\r', "", 1891265544)),
					 '\n', 958095736));
		    Class707.method14322(strings, -72060102);
		}
		if (7 == 1777895575 * client.anInt11075
		    || 1777895575 * client.anInt11075 == 16) {
		    Class96 class96 = Class111.method1979(-1649046588);
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4271,
					    class96.aClass6_1169, 1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(string.length() + 3, -495167776);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(bool ? 1 : 0, -1196778314);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(bool_0_ ? 1 : 0, -361288991);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16700(string, -814602362);
		    class96.method1794(class525_sub15, (short) 2195);
		}
	    } catch (Exception exception) {
		Class268.method4961
		    (Class53.aClass53_381.method1169(Class21.aClass666_213,
						     1552651121),
		     1682482440);
		return;
	    }
	}
	if (7 != 1777895575 * client.anInt11075
	    && 1777895575 * client.anInt11075 != 16)
	    Class268.method4961
		(new StringBuilder().append
		     (Class53.aClass53_466.method1169(Class21.aClass666_213,
						      1552651121))
		     .append
		     (string).toString(),
		 1436070568);
    }
    
    static {
	anInt1417 = 0;
	aBool1409 = false;
	anInt1419 = -1709148145;
    }
    
    public static void method2018(String string) {
	if (null == aStringArray1411)
	    Class206.method3899((short) 25983);
	client.aCalendar11116.setTime(new Date(Class251.method4508((byte) 8)));
	int i = client.aCalendar11116.get(11);
	int i_6_ = client.aCalendar11116.get(12);
	int i_7_ = client.aCalendar11116.get(13);
	String string_8_
	    = new StringBuilder().append(Integer.toString(i / 10)).append
		  (i % 10).append
		  (":").append
		  (i_6_ / 10).append
		  (i_6_ % 10).append
		  (":").append
		  (i_7_ / 10).append
		  (i_7_ % 10).toString();
	String[] strings = Class481.method7829(string, '\n', 1698256040);
	for (int i_9_ = 0; i_9_ < strings.length; i_9_++) {
	    for (int i_10_ = -592886281 * anInt1412; i_10_ > 0; i_10_--)
		aStringArray1411[i_10_] = aStringArray1411[i_10_ - 1];
	    aStringArray1411[0]
		= new StringBuilder().append(string_8_).append(": ").append
		      (strings[i_9_]).toString();
	    if (Class525_Sub7_Sub11.aFileOutputStream11721 != null) {
		try {
		    Class525_Sub7_Sub11.aFileOutputStream11721.write
			(Class225.method4255(new StringBuilder().append
						 (aStringArray1411[0]).append
						 ("\n").toString(),
					     -1301037921));
		} catch (IOException ioexception) {
		    /* empty */
		}
	    }
	    if (-592886281 * anInt1412 < aStringArray1411.length - 1) {
		anInt1412 += -1298199609;
		if (anInt1413 * 545098001 > 0)
		    anInt1413 += 501909489;
	    }
	}
    }
    
    static boolean method2019() {
	if (Class332.method5821(1777895575 * client.anInt11075, (byte) 15))
	    return false;
	return true;
    }
    
    static void method2020() {
	if (Class178.method2915(-278370044)) {
	    if (null == aStringArray1411)
		Class206.method3899((short) 28462);
	    aBool1409 = true;
	    anInt1417 = 0;
	}
    }
    
    static void method2021() {
	if (Class178.method2915(-427500386)) {
	    if (null == aStringArray1411)
		Class206.method3899((short) 18528);
	    aBool1409 = true;
	    anInt1417 = 0;
	}
    }
    
    static void method2022() {
	if (Class178.method2915(-1091609193)) {
	    if (null == aStringArray1411)
		Class206.method3899((short) 13425);
	    aBool1409 = true;
	    anInt1417 = 0;
	}
    }
    
    public static void method2023(String string) {
	if (null == aStringArray1411)
	    Class206.method3899((short) 24746);
	client.aCalendar11116.setTime(new Date(Class251.method4508((byte) 8)));
	int i = client.aCalendar11116.get(11);
	int i_11_ = client.aCalendar11116.get(12);
	int i_12_ = client.aCalendar11116.get(13);
	String string_13_
	    = new StringBuilder().append(Integer.toString(i / 10)).append
		  (i % 10).append
		  (":").append
		  (i_11_ / 10).append
		  (i_11_ % 10).append
		  (":").append
		  (i_12_ / 10).append
		  (i_12_ % 10).toString();
	String[] strings = Class481.method7829(string, '\n', 1761295280);
	for (int i_14_ = 0; i_14_ < strings.length; i_14_++) {
	    for (int i_15_ = -592886281 * anInt1412; i_15_ > 0; i_15_--)
		aStringArray1411[i_15_] = aStringArray1411[i_15_ - 1];
	    aStringArray1411[0]
		= new StringBuilder().append(string_13_).append(": ").append
		      (strings[i_14_]).toString();
	    if (Class525_Sub7_Sub11.aFileOutputStream11721 != null) {
		try {
		    Class525_Sub7_Sub11.aFileOutputStream11721.write
			(Class225.method4255(new StringBuilder().append
						 (aStringArray1411[0]).append
						 ("\n").toString(),
					     1775373578));
		} catch (IOException ioexception) {
		    /* empty */
		}
	    }
	    if (-592886281 * anInt1412 < aStringArray1411.length - 1) {
		anInt1412 += -1298199609;
		if (anInt1413 * 545098001 > 0)
		    anInt1413 += 501909489;
	    }
	}
    }
    
    static void method2024() {
	if (Class178.method2915(-1964748709)) {
	    if (null == aStringArray1411)
		Class206.method3899((short) 4973);
	    aBool1409 = true;
	    anInt1417 = 0;
	}
    }
    
    static boolean method2025() {
	if (Class332.method5821(1777895575 * client.anInt11075, (byte) 113))
	    return false;
	return true;
    }
    
    static void method2026() {
	anInt1416
	    = (Class525_Sub24.aClass7_10595.anInt49 * 665702593
	       + 962137615 * Class525_Sub24.aClass7_10595.anInt51 + 500018954);
	Class226.anInt2342
	    = -489975066 + (Class500.aClass7_5560.anInt49 * 305710039
			    + -826521383 * Class500.aClass7_5560.anInt51);
	aStringArray1411 = new String[500];
	for (int i = 0; i < aStringArray1411.length; i++)
	    aStringArray1411[i] = "";
	Class268.method4961(Class53.aClass53_411
				.method1169(Class21.aClass666_213, 1552651121),
			    1479305954);
    }
    
    static void method2027() {
	if (Class525_Sub7_Sub11.aFileOutputStream11721 != null) {
	    try {
		Class525_Sub7_Sub11.aFileOutputStream11721.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	Class525_Sub7_Sub11.aFileOutputStream11721 = null;
    }
    
    static void method2028() {
	aBool1409 = false;
	Class83.method1604(-2086654395);
    }
    
    static String method2029(String string) {
	String string_16_ = null;
	int i = string.indexOf("--> ");
	if (i >= 0) {
	    string_16_ = string.substring(0, i + 4);
	    string = string.substring(4 + i);
	}
	int i_17_ = -1;
	if (string.startsWith("directlogin "))
	    i_17_ = string.indexOf(" ", "directlogin ".length());
	if (i_17_ >= 0) {
	    int i_18_ = string.length();
	    string
		= new StringBuilder().append(string.substring(0, i_17_)).append
		      (" ").toString();
	    for (int i_19_ = 1 + i_17_; i_19_ < i_18_; i_19_++)
		string = new StringBuilder().append(string).append("*")
			     .toString();
	}
	if (string_16_ != null)
	    return new StringBuilder().append(string_16_).append(string)
		       .toString();
	return string;
    }
    
    static void method2030() {
	aBool1409 = false;
	Class83.method1604(-2060113514);
    }
    
    static boolean method2031() {
	return aBool1409;
    }
    
    public static void method2032(String string, boolean bool,
				  boolean bool_20_) {
	do {
	    try {
		if (string.equalsIgnoreCase("commands")
		    || string.equalsIgnoreCase("help")) {
		    Class268.method4961("commands - This command", 1980744292);
		    Class268.method4961("cls - Clear console", 1992506441);
		    Class268.method4961
			("displayfps - Toggle FPS and other information",
			 1942534012);
		    Class268.method4961
			("renderer - Print graphics renderer information",
			 1325744948);
		    Class268.method4961("heap - Print java memory information",
					2100274359);
		    Class268.method4961
			("getcamerapos - Print location and direction of camera for use in bug reports",
			 1519611962);
		} else if (string.equalsIgnoreCase("cls")) {
		    anInt1412 = 0;
		    anInt1413 = 0;
		} else if (string.equalsIgnoreCase("displayfps")) {
		    client.aBool11086 = !client.aBool11086;
		    if (client.aBool11086)
			Class268.method4961("FPS on", 1932034016);
		    else
			Class268.method4961("FPS off", 1345784342);
		} else if (string.equals("renderer")) {
		    Class170 class170 = Class501.aClass182_5564.method3130();
		    Class268.method4961(new StringBuilder().append
					    ("Toolkit ID: ").append
					    (Class198_Sub13
						 .aClass525_Sub30_9973
						 .aClass696_Sub20_10708
						 .method17160(1108610951))
					    .toString(),
					1430046194);
		    Class268.method4961(new StringBuilder().append
					    ("Vendor: ").append
					    (class170.anInt1850 * -1809895579)
					    .toString(),
					1433457091);
		    Class268.method4961(new StringBuilder().append
					    ("Name: ").append
					    (class170.aString1851).toString(),
					2067578042);
		    Class268.method4961(new StringBuilder().append
					    ("Version: ").append
					    (-118228173 * class170.anInt1852)
					    .toString(),
					1857057447);
		    Class268.method4961(new StringBuilder().append
					    ("Device: ").append
					    (class170.aString1853).toString(),
					1641492572);
		    Class268.method4961(new StringBuilder().append
					    ("Driver Version: ").append
					    (4822213046138725271L
					     * class170.aLong1854)
					    .toString(),
					1715180984);
		    String string_21_ = Class501.aClass182_5564.method3265();
		    if (string_21_.length() > 0)
			Class268.method4961(string_21_, 1689414021);
		} else if (string.equals("heap"))
		    Class268.method4961(new StringBuilder().append
					    ("Heap: ").append
					    (-855455283 * Class503.anInt5590)
					    .append
					    ("MB").toString(),
					1829918414);
		else {
		    if (!string.equalsIgnoreCase("getcamerapos"))
			break;
		    Class600 class600
			= client.aClass507_11137.method8350(-1186428976);
		    if (5 == -174799205 * Class700.anInt8779) {
			Class446 class446 = Class453_Sub3
						.aClass309_Sub1_10316
						.method5486(-2083803724);
			Class446 class446_22_
			    = Class453_Sub3.aClass309_Sub1_10316
				  .method5488(-2000484134);
			Class268.method4961
			    (new StringBuilder().append("Pos: ").append
				 (new Class600
				      ((Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.aByte10867),
				       (int) class446.aFloat4895 >> 9,
				       (int) class446.aFloat4897 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (((int) class446.aFloat4895
				     - (class600.anInt7858 * -1227002079
					<< 9)),
				    ((int) class446.aFloat4897
				     - (class600.anInt7860 * 1429253007 << 9)),
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229)) + (int) class446.aFloat4896)
				 .toString(),
			     2074639922);
			Class268.method4961
			    (new StringBuilder().append("Look: ").append
				 (new Class600
				      ((Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.aByte10867),
				       (int) class446_22_.aFloat4895 >> 9,
				       (int) class446_22_.aFloat4897 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (((int) class446_22_.aFloat4895
				     - (class600.anInt7858 * -1227002079
					<< 9)),
				    ((int) class446.aFloat4897
				     - (1429253007 * class600.anInt7860 << 9)),
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229)) + (int) class446.aFloat4896)
				 .toString(),
			     1399850317);
		    } else {
			Class268.method4961
			    (new StringBuilder().append("Pos: ").append
				 (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				  .aByte10867)
				 .append
				 (",").append
				 ((class600.anInt7858 * -1227002079
				   + (-469853907 * Class477.anInt5200 >> 9))
				  >> 6)
				 .append
				 (",").append
				 (((-1889707729 * Class475.anInt5179 >> 9)
				   + 1429253007 * class600.anInt7860) >> 6)
				 .append
				 (",").append
				 (((-469853907 * Class477.anInt5200 >> 9)
				   + -1227002079 * class600.anInt7858) & 0x3f)
				 .append
				 (",").append
				 ((class600.anInt7860 * 1429253007
				   + (Class475.anInt5179 * -1889707729 >> 9))
				  & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (Class477.anInt5200 * -469853907,
				    -1889707729 * Class475.anInt5179,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229))
				  - Class575.anInt7648 * -142598869)
				 .toString(),
			     1451346815);
			Class268.method4961
			    (new StringBuilder().append("Look: ").append
				 (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				  .aByte10867)
				 .append
				 (",").append
				 ((-1227002079 * class600.anInt7858
				   + Class326.anInt3562 * -130227567) >> 6)
				 .append
				 (",").append
				 ((1105240097 * Class198_Sub16.anInt9979
				   + class600.anInt7860 * 1429253007) >> 6)
				 .append
				 (",").append
				 ((-1227002079 * class600.anInt7858
				   + -130227567 * Class326.anInt3562) & 0x3f)
				 .append
				 (",").append
				 ((class600.anInt7860 * 1429253007
				   + Class198_Sub16.anInt9979 * 1105240097)
				  & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (-130227567 * Class326.anInt3562,
				    Class198_Sub16.anInt9979 * 1105240097,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229))
				  - Class350_Sub2.anInt10225 * -458002533)
				 .toString(),
			     1358726494);
		    }
		}
	    } catch (Exception exception) {
		Class268.method4961
		    (Class53.aClass53_381.method1169(Class21.aClass666_213,
						     1552651121),
		     1525599948);
	    }
	    return;
	} while (false);
	if (Class685.aClass685_8686 != Class176.aClass685_1884
	    || 619753713 * client.anInt11231 >= 2) {
	    try {
		if (string.equalsIgnoreCase("wm1")) {
		    Class332_Sub1.method15672(1, -1, -1, false, (byte) -26);
		    if (Class441.method7120((byte) -4) == 1)
			Class268.method4961("Success", 1408855227);
		    else
			Class268.method4961("Failure", 1645618327);
		    return;
		}
		if (string.equalsIgnoreCase("wm2")) {
		    Class332_Sub1.method15672(2, -1, -1, false, (byte) 7);
		    if (Class441.method7120((byte) -107) == 2)
			Class268.method4961("Success", 2016685925);
		    else
			Class268.method4961("Failure", 1828147429);
		    return;
		}
		if (Class695.aBool8757 && string.equalsIgnoreCase("wm3")) {
		    Class332_Sub1.method15672(3, 1024, 768, false, (byte) -10);
		    if (Class441.method7120((byte) -47) == 3)
			Class268.method4961("Success", 2059776958);
		    else
			Class268.method4961("Failure", 1803864094);
		    return;
		}
		if (string.startsWith("setlobby ")) {
		    if (client.anInt11075 * 1777895575 != 1)
			Class268.method4961("Failure", 2131419304);
		    else {
			int i = -1;
			Object object = null;
			string = string.substring(9);
			int i_23_ = string.indexOf(' ');
			if (i_23_ == -1)
			    Class268.method4961("Failure", 1318321936);
			else {
			    try {
				i = Integer.parseInt(string.substring(0,
								      i_23_));
			    } catch (NumberFormatException numberformatexception) {
				/* empty */
			    }
			    if (i == -1)
				Class268.method4961("Failure", 1600076636);
			    else {
				String string_24_
				    = new StringBuilder().append
					  (string.substring(i_23_ + 1).trim())
					  .append
					  (".runescape.com").toString();
				Class547.method9102(string_24_, i, (byte) 25);
				Class268.method4961("Success", 1396053140);
				return;
			    }
			    return;
			}
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk0")) {
		    Class217.method4146(0, false, (byte) 83);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(-505575096)
			== 0) {
			Class268.method4961("Success", 1588103667);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     0, (byte) -56);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1782439360);
		    return;
		}
		if (string.equalsIgnoreCase("tk1")) {
		    Class217.method4146(1, false, (byte) 97);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(-672814297)
			== 1) {
			Class268.method4961("Success", 1539143150);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     1, (byte) -122);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1496761095);
		    return;
		}
		if (string.equalsIgnoreCase("tk3")) {
		    Class217.method4146(3, false, (byte) 21);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(791919694)
			== 3) {
			Class268.method4961("Success", 2082339178);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     3, (byte) -92);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1943869084);
		    return;
		}
		if (string.equalsIgnoreCase("tk5")) {
		    Class217.method4146(5, false, (byte) -39);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(-507811301)
			== 5) {
			Class268.method4961("Success", 2061128412);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     5, (byte) -85);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1822201902);
		    return;
		}
		if (string.equalsIgnoreCase("clientdrop")) {
		    if (client.anInt11075 * 1777895575 == 7)
			Class196.method3742((byte) -53);
		    else if (client.anInt11075 * 1777895575 == 4)
			client.aClass96_11085.aBool1184 = true;
		    return;
		}
		if (string.equalsIgnoreCase("breakcon")) {
		    Class96[] class96s = client.aClass96Array11133;
		    for (int i = 0; i < class96s.length; i++) {
			Class96 class96 = class96s[i];
			if (class96.method1799((byte) 0) != null)
			    class96.method1799((byte) 0).method9378((byte) 42);
		    }
		    Class94.aClass463_912.method7622(1969737582);
		    return;
		}
		if (string.startsWith("getclientvarpbit")) {
		    int i = Integer.parseInt(string.substring(17));
		    Class268.method4961(new StringBuilder().append
					    ("varpbit=").append
					    (Class532.aClass111_7170.method93
					     (Class532.aClass111_7170
						  .method124(i, -78804914),
					      (byte) 2))
					    .toString(),
					1636911170);
		    return;
		}
		if (string.startsWith("getclientvarp")) {
		    int i = Integer.parseInt(string.substring(14));
		    Class268.method4961(new StringBuilder().append("varp=")
					    .append
					    (Class532.aClass111_7170.method104
					     ((Class532.aClass111_7170
						   .method119
					       (Class453.aClass453_4939, i,
						-1490808133)),
					      623775022))
					    .toString(),
					1450194898);
		    return;
		}
		if (string.startsWith("directlogin")) {
		    String[] strings
			= Class481.method7829(string.substring(12), ' ',
					      408554144);
		    if (strings.length == 2 || 3 == strings.length) {
			if (Class198_Sub4.method15613(-492271742))
			    Class280.method5162((byte) 18);
			Class350.method6154(strings[0], strings[1],
					    (strings.length > 2 ? strings[2]
					     : ""),
					    true, (byte) 0);
		    }
		    return;
		}
		if (string.startsWith("snlogin ")) {
		    String[] strings = Class481.method7829(string.substring(8),
							   ' ', 1939957767);
		    int i = Integer.parseInt(strings[0]);
		    String string_25_ = strings.length > 1 ? strings[1] : "";
		    Class696_Sub33.method17276(i, string_25_, true,
					       -401133723);
		    return;
		}
		if (string.startsWith("setoutput ")) {
		    File file = new File(string.substring(10));
		    if (file.exists()) {
			file = new File(new StringBuilder().append
					    (string.substring(10)).append
					    (".").append
					    (Class251.method4508((byte) 8))
					    .append
					    (".log").toString());
			if (file.exists()) {
			    Class268.method4961("file already exists!",
						1391699051);
			    return;
			}
		    }
		    if (null != Class525_Sub7_Sub11.aFileOutputStream11721) {
			Class525_Sub7_Sub11.aFileOutputStream11721.close();
			Class525_Sub7_Sub11.aFileOutputStream11721 = null;
		    }
		    try {
			Class525_Sub7_Sub11.aFileOutputStream11721
			    = new FileOutputStream(file);
		    } catch (FileNotFoundException filenotfoundexception) {
			Class268.method4961(new StringBuilder().append
						("Could not create ").append
						(file.getName()).toString(),
					    2131391689);
		    } catch (SecurityException securityexception) {
			Class268.method4961(new StringBuilder().append
						("Cannot write to ").append
						(file.getName()).toString(),
					    1720619567);
		    }
		    return;
		}
		if (string.equals("closeoutput")) {
		    if (Class525_Sub7_Sub11.aFileOutputStream11721 != null)
			Class525_Sub7_Sub11.aFileOutputStream11721.close();
		    Class525_Sub7_Sub11.aFileOutputStream11721 = null;
		    return;
		}
		if (string.startsWith("runscript ")) {
		    File file = new File(string.substring(10));
		    if (!file.exists()) {
			Class268.method4961("No such file", 1615237280);
			return;
		    }
		    byte[] is = Class646.method10692(file, (byte) 63);
		    if (is == null) {
			Class268.method4961("Failed to read file", 2059151299);
			return;
		    }
		    String[] strings
			= (Class481.method7829
			   ((Class654.method10800
			     (Class540.method8891(is, -1336760868), '\r', "",
			      2013022058)),
			    '\n', 382224163));
		    Class707.method14322(strings, 957154942);
		}
		if (7 == 1777895575 * client.anInt11075
		    || 1777895575 * client.anInt11075 == 16) {
		    Class96 class96 = Class111.method1979(-609342740);
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4271,
					    class96.aClass6_1169, 1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(string.length() + 3, -1297963902);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(bool ? 1 : 0, -1172613211);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(bool_20_ ? 1 : 0, -2072341933);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16700(string, -845363438);
		    class96.method1794(class525_sub15, (short) 21324);
		}
	    } catch (Exception exception) {
		Class268.method4961
		    (Class53.aClass53_381.method1169(Class21.aClass666_213,
						     1552651121),
		     1344467344);
		return;
	    }
	}
	if (7 != 1777895575 * client.anInt11075
	    && 1777895575 * client.anInt11075 != 16)
	    Class268.method4961
		(new StringBuilder().append
		     (Class53.aClass53_466.method1169(Class21.aClass666_213,
						      1552651121))
		     .append
		     (string).toString(),
		 1574126405);
    }
    
    static void method2033(Class182 class182) {
	if (method2057(-1490595255) && Class318.method5673(1435857492))
	    Class631.method10318(0, 0, Class434.anInt4827 * -1445589163, 350,
				 1957702619);
	class182.method3184(0, 0, -1445589163 * Class434.anInt4827, 350);
	class182.method3151(0, 0, -1445589163 * Class434.anInt4827, 350,
			    anInt1417 * 2052312063 << 24 | 0x332277, 1);
	int i = 350 / (-1255111749 * Class226.anInt2342);
	if (-592886281 * anInt1412 > 0) {
	    int i_26_ = 346 - Class226.anInt2342 * -1255111749 - 4;
	    int i_27_ = i_26_ * i / (i + -592886281 * anInt1412 - 1);
	    int i_28_ = 4;
	    if (-592886281 * anInt1412 > 1)
		i_28_
		    += ((i_26_ - i_27_)
			* (-592886281 * anInt1412 - 1 - anInt1413 * 545098001)
			/ (anInt1412 * -592886281 - 1));
	    class182.method3151(Class434.anInt4827 * -1445589163 - 16, i_28_,
				12, i_27_,
				2052312063 * anInt1417 << 24 | 0x332277, 2);
	    for (int i_29_ = 545098001 * anInt1413;
		 (i_29_ < 545098001 * anInt1413 + i
		  && i_29_ < anInt1412 * -592886281);
		 i_29_++) {
		String[] strings = Class481.method7829(aStringArray1411[i_29_],
						       '\010', -571128417);
		int i_30_ = ((Class434.anInt4827 * -1445589163 - 8 - 16)
			     / strings.length);
		for (int i_31_ = 0; i_31_ < strings.length; i_31_++) {
		    int i_32_ = i_30_ * i_31_ + 8;
		    class182.method3184(i_32_, 0, i_32_ + i_30_ - 8, 350);
		    Class29.aClass175_293.method2851
			(Class196.method3737(strings[i_31_], -1989962038),
			 i_32_,
			 (350 - anInt1416 * 599755085 - 2
			  - Class500.aClass7_5560.anInt51 * 1921008003
			  - (-1255111749 * Class226.anInt2342
			     * (i_29_ - anInt1413 * 545098001))),
			 -1, -16777216, -914452661);
		}
	    }
	}
	Class222.aClass175_2338.method2852("886 1",
					   (Class434.anInt4827 * -1445589163
					    - 25),
					   330, -1, -16777216, 2105778731);
	class182.method3184(0, 0, Class434.anInt4827 * -1445589163, 350);
	class182.method3192(0, 350 - anInt1416 * 599755085,
			    -1445589163 * Class434.anInt4827, -1, -123395004);
	Class29.aClass175_294.method2851
	    (new StringBuilder().append("--> ").append
		 (Class196.method3737(aString1414, -1101872389)).toString(),
	     10, 350 - 1921008003 * Class525_Sub24.aClass7_10595.anInt51 - 1,
	     -1, -16777216, -755949312);
	if (Class280.aBool3001) {
	    int i_33_ = -1;
	    if (client.anInt11083 % 30 > 15)
		i_33_ = 16777215;
	    class182.method3193
		(10 + (Class525_Sub24.aClass7_10595.method561
		       (new StringBuilder().append("--> ").append
			    (Class196.method3737(aString1414, -1396985871)
				 .substring(0, -675240623 * anInt1420))
			    .toString(),
			-1016889216)),
		 350 - Class525_Sub24.aClass7_10595.anInt51 * 1921008003 - 11,
		 12, i_33_, 2077193792);
	}
	class182.method3480();
	Class303.method5411((byte) -96);
    }
    
    static boolean method2034() {
	return aBool1409;
    }
    
    static void method2035() {
	anInt1416
	    = (Class525_Sub24.aClass7_10595.anInt49 * 665702593
	       + 962137615 * Class525_Sub24.aClass7_10595.anInt51 + 500018954);
	Class226.anInt2342
	    = -489975066 + (Class500.aClass7_5560.anInt49 * 305710039
			    + -826521383 * Class500.aClass7_5560.anInt51);
	aStringArray1411 = new String[500];
	for (int i = 0; i < aStringArray1411.length; i++)
	    aStringArray1411[i] = "";
	Class268.method4961(Class53.aClass53_411
				.method1169(Class21.aClass666_213, 1552651121),
			    1417020954);
    }
    
    static void method2036(String[] strings) {
	if (strings.length > 1) {
	    for (int i = 0; i < strings.length; i++) {
		if (strings[i].startsWith("pause")) {
		    int i_34_ = 5;
		    try {
			i_34_ = Integer.parseInt(strings[i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class268.method4961(new StringBuilder().append
					    ("Pausing for ").append
					    (i_34_).append
					    (" seconds...").toString(),
					2037142480);
		    Class95.aStringArray1126 = strings;
		    anInt1419 = 1709148145 * (i + 1);
		    Class41.aLong337
			= (Class251.method4508((byte) 8)
			   + (long) (1000 * i_34_)) * -3188431922941586339L;
		    break;
		}
		aString1414 = strings[i];
		Class655.method10814(false, 1161650867);
	    }
	} else {
	    aString1414 = new StringBuilder().append(aString1414).append
			      (strings[0]).toString();
	    anInt1420 += strings[0].length() * -2087599183;
	}
    }
    
    static void method2037(String[] strings) {
	if (strings.length > 1) {
	    for (int i = 0; i < strings.length; i++) {
		if (strings[i].startsWith("pause")) {
		    int i_35_ = 5;
		    try {
			i_35_ = Integer.parseInt(strings[i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class268.method4961(new StringBuilder().append
					    ("Pausing for ").append
					    (i_35_).append
					    (" seconds...").toString(),
					1964453637);
		    Class95.aStringArray1126 = strings;
		    anInt1419 = 1709148145 * (i + 1);
		    Class41.aLong337
			= (Class251.method4508((byte) 8)
			   + (long) (1000 * i_35_)) * -3188431922941586339L;
		    break;
		}
		aString1414 = strings[i];
		Class655.method10814(false, 1283382067);
	    }
	} else {
	    aString1414 = new StringBuilder().append(aString1414).append
			      (strings[0]).toString();
	    anInt1420 += strings[0].length() * -2087599183;
	}
    }
    
    static void method2038() {
	if (anInt1417 * 2052312063 < 102)
	    anInt1417 += 581515258;
	if (-1 != 183011601 * anInt1419
	    && (-7767321204468129803L * Class41.aLong337
		< Class251.method4508((byte) 8))) {
	    for (int i = 183011601 * anInt1419;
		 i < Class95.aStringArray1126.length; i++) {
		if (Class95.aStringArray1126[i].startsWith("pause")) {
		    int i_36_ = 5;
		    try {
			i_36_ = Integer.parseInt(Class95.aStringArray1126
						     [i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class268.method4961(new StringBuilder().append
					    ("Pausing for ").append
					    (i_36_).append
					    (" seconds...").toString(),
					1612697827);
		    anInt1419 = 1709148145 * (1 + i);
		    Class41.aLong337
			= (Class251.method4508((byte) 8)
			   + (long) (1000 * i_36_)) * -3188431922941586339L;
		    return;
		}
		aString1414 = Class95.aStringArray1126[i];
		Class655.method10814(false, 1928201563);
	    }
	    anInt1419 = -1709148145;
	}
	if (0 != client.anInt11100 * 542098735) {
	    anInt1413 -= 1010045755 * client.anInt11100;
	    if (545098001 * anInt1413 >= anInt1412 * -592886281)
		anInt1413 = -301588857 * anInt1412 - 501909489;
	    if (anInt1413 * 545098001 < 0)
		anInt1413 = 0;
	    client.anInt11100 = 0;
	}
	for (int i = 0; i < client.anInt11102 * 1230768119; i++) {
	    Interface64 interface64 = client.anInterface64Array11103[i];
	    int i_37_ = interface64.method413(1046621011);
	    char c = interface64.method420((byte) 76);
	    int i_38_ = interface64.method427((byte) 85);
	    if (84 == i_37_)
		Class655.method10814(false, 977614548);
	    if (80 == i_37_)
		Class655.method10814(true, 1989263654);
	    else if (i_37_ == 66 && (i_38_ & 0x4) != 0) {
		if (Class661.aClipboard8474 != null) {
		    String string = "";
		    for (int i_39_ = aStringArray1411.length - 1; i_39_ >= 0;
			 i_39_--) {
			if (null != aStringArray1411[i_39_]
			    && aStringArray1411[i_39_].length() > 0)
			    string = new StringBuilder().append(string).append
					 (aStringArray1411[i_39_]).append
					 ('\n').toString();
		    }
		    Class661.aClipboard8474
			.setContents(new StringSelection(string), null);
		}
	    } else if (i_37_ == 67 && 0 != (i_38_ & 0x4)) {
		if (Class661.aClipboard8474 != null) {
		    try {
			Transferable transferable
			    = Class661.aClipboard8474.getContents(null);
			if (transferable != null) {
			    String string
				= (String) (transferable.getTransferData
					    (DataFlavor.stringFlavor));
			    if (string != null) {
				String[] strings
				    = Class481.method7829(string, '\n',
							  1598849985);
				Class707.method14322(strings, -509766112);
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
	    } else if (i_37_ == 85 && -675240623 * anInt1420 > 0) {
		aString1414
		    = new StringBuilder().append
			  (aString1414.substring(0,
						 anInt1420 * -675240623 - 1))
			  .append
			  (aString1414.substring(anInt1420 * -675240623))
			  .toString();
		anInt1420 -= -2087599183;
	    } else if (i_37_ == 101
		       && anInt1420 * -675240623 < aString1414.length())
		aString1414
		    = new StringBuilder().append
			  (aString1414.substring(0, -675240623 * anInt1420))
			  .append
			  (aString1414.substring(1 + -675240623 * anInt1420))
			  .toString();
	    else if (96 == i_37_ && anInt1420 * -675240623 > 0)
		anInt1420 -= -2087599183;
	    else if (97 == i_37_
		     && anInt1420 * -675240623 < aString1414.length())
		anInt1420 += -2087599183;
	    else if (102 == i_37_)
		anInt1420 = 0;
	    else if (i_37_ == 103)
		anInt1420 = aString1414.length() * -2087599183;
	    else if (i_37_ == 104
		     && 1919934461 * anInt1415 < aStringArray1411.length) {
		anInt1415 += -533957291;
		method2058(-1445741774);
		anInt1420 = aString1414.length() * -2087599183;
	    } else if (105 == i_37_ && 1919934461 * anInt1415 > 0) {
		anInt1415 -= -533957291;
		method2058(-469326024);
		anInt1420 = aString1414.length() * -2087599183;
	    } else if (Class560.method9410(c, 430805431)
		       || "\\/.:, _-+[]~@".indexOf(c) != -1) {
		aString1414
		    = new StringBuilder().append
			  (aString1414.substring(0, -675240623 * anInt1420))
			  .append
			  (client.anInterface64Array11103[i]
			       .method420((byte) 81))
			  .append
			  (aString1414.substring(-675240623 * anInt1420))
			  .toString();
		anInt1420 += -2087599183;
	    }
	}
	client.anInt11102 = 0;
	client.anInt11273 = 0;
	Class83.method1604(-1955069452);
    }
    
    static void method2039() {
	if (anInt1417 * 2052312063 < 102)
	    anInt1417 += 581515258;
	if (-1 != 183011601 * anInt1419
	    && (-7767321204468129803L * Class41.aLong337
		< Class251.method4508((byte) 8))) {
	    for (int i = 183011601 * anInt1419;
		 i < Class95.aStringArray1126.length; i++) {
		if (Class95.aStringArray1126[i].startsWith("pause")) {
		    int i_40_ = 5;
		    try {
			i_40_ = Integer.parseInt(Class95.aStringArray1126
						     [i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class268.method4961(new StringBuilder().append
					    ("Pausing for ").append
					    (i_40_).append
					    (" seconds...").toString(),
					1709862627);
		    anInt1419 = 1709148145 * (1 + i);
		    Class41.aLong337
			= (Class251.method4508((byte) 8)
			   + (long) (1000 * i_40_)) * -3188431922941586339L;
		    return;
		}
		aString1414 = Class95.aStringArray1126[i];
		Class655.method10814(false, 597374478);
	    }
	    anInt1419 = -1709148145;
	}
	if (0 != client.anInt11100 * 542098735) {
	    anInt1413 -= 1010045755 * client.anInt11100;
	    if (545098001 * anInt1413 >= anInt1412 * -592886281)
		anInt1413 = -301588857 * anInt1412 - 501909489;
	    if (anInt1413 * 545098001 < 0)
		anInt1413 = 0;
	    client.anInt11100 = 0;
	}
	for (int i = 0; i < client.anInt11102 * 1230768119; i++) {
	    Interface64 interface64 = client.anInterface64Array11103[i];
	    int i_41_ = interface64.method413(-931850087);
	    char c = interface64.method420((byte) 6);
	    int i_42_ = interface64.method427((byte) -19);
	    if (84 == i_41_)
		Class655.method10814(false, 1870793851);
	    if (80 == i_41_)
		Class655.method10814(true, 867901208);
	    else if (i_41_ == 66 && (i_42_ & 0x4) != 0) {
		if (Class661.aClipboard8474 != null) {
		    String string = "";
		    for (int i_43_ = aStringArray1411.length - 1; i_43_ >= 0;
			 i_43_--) {
			if (null != aStringArray1411[i_43_]
			    && aStringArray1411[i_43_].length() > 0)
			    string = new StringBuilder().append(string).append
					 (aStringArray1411[i_43_]).append
					 ('\n').toString();
		    }
		    Class661.aClipboard8474
			.setContents(new StringSelection(string), null);
		}
	    } else if (i_41_ == 67 && 0 != (i_42_ & 0x4)) {
		if (Class661.aClipboard8474 != null) {
		    try {
			Transferable transferable
			    = Class661.aClipboard8474.getContents(null);
			if (transferable != null) {
			    String string
				= (String) (transferable.getTransferData
					    (DataFlavor.stringFlavor));
			    if (string != null) {
				String[] strings
				    = Class481.method7829(string, '\n',
							  -130490804);
				Class707.method14322(strings, 424374262);
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
	    } else if (i_41_ == 85 && -675240623 * anInt1420 > 0) {
		aString1414
		    = new StringBuilder().append
			  (aString1414.substring(0,
						 anInt1420 * -675240623 - 1))
			  .append
			  (aString1414.substring(anInt1420 * -675240623))
			  .toString();
		anInt1420 -= -2087599183;
	    } else if (i_41_ == 101
		       && anInt1420 * -675240623 < aString1414.length())
		aString1414
		    = new StringBuilder().append
			  (aString1414.substring(0, -675240623 * anInt1420))
			  .append
			  (aString1414.substring(1 + -675240623 * anInt1420))
			  .toString();
	    else if (96 == i_41_ && anInt1420 * -675240623 > 0)
		anInt1420 -= -2087599183;
	    else if (97 == i_41_
		     && anInt1420 * -675240623 < aString1414.length())
		anInt1420 += -2087599183;
	    else if (102 == i_41_)
		anInt1420 = 0;
	    else if (i_41_ == 103)
		anInt1420 = aString1414.length() * -2087599183;
	    else if (i_41_ == 104
		     && 1919934461 * anInt1415 < aStringArray1411.length) {
		anInt1415 += -533957291;
		method2058(-1287535207);
		anInt1420 = aString1414.length() * -2087599183;
	    } else if (105 == i_41_ && 1919934461 * anInt1415 > 0) {
		anInt1415 -= -533957291;
		method2058(446090173);
		anInt1420 = aString1414.length() * -2087599183;
	    } else if (Class560.method9410(c, -918001984)
		       || "\\/.:, _-+[]~@".indexOf(c) != -1) {
		aString1414
		    = new StringBuilder().append
			  (aString1414.substring(0, -675240623 * anInt1420))
			  .append
			  (client.anInterface64Array11103[i]
			       .method420((byte) 26))
			  .append
			  (aString1414.substring(-675240623 * anInt1420))
			  .toString();
		anInt1420 += -2087599183;
	    }
	}
	client.anInt11102 = 0;
	client.anInt11273 = 0;
	Class83.method1604(-2018067211);
    }
    
    static void method2040() {
	if (anInt1415 * 1919934461 > 0) {
	    int i = 0;
	    for (int i_44_ = 0; i_44_ < aStringArray1411.length; i_44_++) {
		if (aStringArray1411[i_44_].indexOf("--> ") != -1
		    && ++i == 1919934461 * anInt1415) {
		    aString1414
			= aStringArray1411[i_44_].substring(aStringArray1411
								[i_44_]
								.indexOf('>')
							    + 2);
		    break;
		}
	    }
	} else
	    aString1414 = "";
    }
    
    static void method2041() {
	if (anInt1415 * 1919934461 > 0) {
	    int i = 0;
	    for (int i_45_ = 0; i_45_ < aStringArray1411.length; i_45_++) {
		if (aStringArray1411[i_45_].indexOf("--> ") != -1
		    && ++i == 1919934461 * anInt1415) {
		    aString1414
			= aStringArray1411[i_45_].substring(aStringArray1411
								[i_45_]
								.indexOf('>')
							    + 2);
		    break;
		}
	    }
	} else
	    aString1414 = "";
    }
    
    public static void method2042(String string) {
	aString1414 = string;
	anInt1420 = aString1414.length() * -2087599183;
    }
    
    public static void method2043(String string) {
	aString1414 = string;
	anInt1420 = aString1414.length() * -2087599183;
    }
    
    static void method2044(boolean bool) {
	aString1414 = aString1414.trim();
	anInt1415 = 0;
	if (aString1414.length() == 0)
	    anInt1420 = 0;
	else {
	    Class268.method4961(new StringBuilder().append("--> ").append
				    (aString1414).toString(),
				1548316594);
	    Class410.method6666(aString1414, false, bool, (byte) -28);
	    if (!bool) {
		anInt1420 = 0;
		aString1414 = "";
	    } else
		anInt1420 = aString1414.length() * -2087599183;
	}
    }
    
    Class116() throws Throwable {
	throw new Error();
    }
    
    static void method2045() {
	if (Class525_Sub7_Sub11.aFileOutputStream11721 != null) {
	    try {
		Class525_Sub7_Sub11.aFileOutputStream11721.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	Class525_Sub7_Sub11.aFileOutputStream11721 = null;
    }
    
    static void method2046(Class182 class182) {
	if (method2057(-841716874) && Class318.method5673(1599017071))
	    Class631.method10318(0, 0, Class434.anInt4827 * -1445589163, 350,
				 2095069857);
	class182.method3184(0, 0, -1445589163 * Class434.anInt4827, 350);
	class182.method3151(0, 0, -1445589163 * Class434.anInt4827, 350,
			    anInt1417 * 2052312063 << 24 | 0x332277, 1);
	int i = 350 / (-1255111749 * Class226.anInt2342);
	if (-592886281 * anInt1412 > 0) {
	    int i_46_ = 346 - Class226.anInt2342 * -1255111749 - 4;
	    int i_47_ = i_46_ * i / (i + -592886281 * anInt1412 - 1);
	    int i_48_ = 4;
	    if (-592886281 * anInt1412 > 1)
		i_48_
		    += ((i_46_ - i_47_)
			* (-592886281 * anInt1412 - 1 - anInt1413 * 545098001)
			/ (anInt1412 * -592886281 - 1));
	    class182.method3151(Class434.anInt4827 * -1445589163 - 16, i_48_,
				12, i_47_,
				2052312063 * anInt1417 << 24 | 0x332277, 2);
	    for (int i_49_ = 545098001 * anInt1413;
		 (i_49_ < 545098001 * anInt1413 + i
		  && i_49_ < anInt1412 * -592886281);
		 i_49_++) {
		String[] strings = Class481.method7829(aStringArray1411[i_49_],
						       '\010', -333011992);
		int i_50_ = ((Class434.anInt4827 * -1445589163 - 8 - 16)
			     / strings.length);
		for (int i_51_ = 0; i_51_ < strings.length; i_51_++) {
		    int i_52_ = i_50_ * i_51_ + 8;
		    class182.method3184(i_52_, 0, i_52_ + i_50_ - 8, 350);
		    Class29.aClass175_293.method2851
			(Class196.method3737(strings[i_51_], -1052184171),
			 i_52_,
			 (350 - anInt1416 * 599755085 - 2
			  - Class500.aClass7_5560.anInt51 * 1921008003
			  - (-1255111749 * Class226.anInt2342
			     * (i_49_ - anInt1413 * 545098001))),
			 -1, -16777216, 245712777);
		}
	    }
	}
	Class222.aClass175_2338.method2852("886 1",
					   (Class434.anInt4827 * -1445589163
					    - 25),
					   330, -1, -16777216, 1981507036);
	class182.method3184(0, 0, Class434.anInt4827 * -1445589163, 350);
	class182.method3192(0, 350 - anInt1416 * 599755085,
			    -1445589163 * Class434.anInt4827, -1, 1170120257);
	Class29.aClass175_294.method2851
	    (new StringBuilder().append("--> ").append
		 (Class196.method3737(aString1414, -1034820677)).toString(),
	     10, 350 - 1921008003 * Class525_Sub24.aClass7_10595.anInt51 - 1,
	     -1, -16777216, -1926012602);
	if (Class280.aBool3001) {
	    int i_53_ = -1;
	    if (client.anInt11083 % 30 > 15)
		i_53_ = 16777215;
	    class182.method3193
		(10 + (Class525_Sub24.aClass7_10595.method561
		       (new StringBuilder().append("--> ").append
			    (Class196.method3737(aString1414, -1992772880)
				 .substring(0, -675240623 * anInt1420))
			    .toString(),
			1601577017)),
		 350 - Class525_Sub24.aClass7_10595.anInt51 * 1921008003 - 11,
		 12, i_53_, -1121855699);
	}
	class182.method3480();
	Class303.method5411((byte) 16);
    }
    
    static void method2047() {
	aBool1409 = false;
	Class83.method1604(-1958582768);
    }
    
    static void method2048() {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub25_10723
		.method17208(424135869)
	    == 1)
	    Class45.aClass500_349.method8170(new Class514((Class499
							   .aClass499_5554),
							  null),
					     842328731);
	else {
	    client.aClass507_11137.method8375((byte) -83);
	    Class587.method9690(110022063);
	}
    }
    
    static void method2049() {
	/* empty */
    }
    
    public static void method2050(String string, boolean bool,
				  boolean bool_54_) {
	do {
	    try {
		if (string.equalsIgnoreCase("commands")
		    || string.equalsIgnoreCase("help")) {
		    Class268.method4961("commands - This command", 1757468211);
		    Class268.method4961("cls - Clear console", 2125771053);
		    Class268.method4961
			("displayfps - Toggle FPS and other information",
			 1834329211);
		    Class268.method4961
			("renderer - Print graphics renderer information",
			 1681933337);
		    Class268.method4961("heap - Print java memory information",
					1900277787);
		    Class268.method4961
			("getcamerapos - Print location and direction of camera for use in bug reports",
			 2096251239);
		} else if (string.equalsIgnoreCase("cls")) {
		    anInt1412 = 0;
		    anInt1413 = 0;
		} else if (string.equalsIgnoreCase("displayfps")) {
		    client.aBool11086 = !client.aBool11086;
		    if (client.aBool11086)
			Class268.method4961("FPS on", 1868350275);
		    else
			Class268.method4961("FPS off", 2068731775);
		} else if (string.equals("renderer")) {
		    Class170 class170 = Class501.aClass182_5564.method3130();
		    Class268.method4961(new StringBuilder().append
					    ("Toolkit ID: ").append
					    (Class198_Sub13
						 .aClass525_Sub30_9973
						 .aClass696_Sub20_10708
						 .method17160(600952021))
					    .toString(),
					1672633223);
		    Class268.method4961(new StringBuilder().append
					    ("Vendor: ").append
					    (class170.anInt1850 * -1809895579)
					    .toString(),
					1600370145);
		    Class268.method4961(new StringBuilder().append
					    ("Name: ").append
					    (class170.aString1851).toString(),
					1712960835);
		    Class268.method4961(new StringBuilder().append
					    ("Version: ").append
					    (-118228173 * class170.anInt1852)
					    .toString(),
					1942451090);
		    Class268.method4961(new StringBuilder().append
					    ("Device: ").append
					    (class170.aString1853).toString(),
					1720192506);
		    Class268.method4961(new StringBuilder().append
					    ("Driver Version: ").append
					    (4822213046138725271L
					     * class170.aLong1854)
					    .toString(),
					1546534281);
		    String string_55_ = Class501.aClass182_5564.method3265();
		    if (string_55_.length() > 0)
			Class268.method4961(string_55_, 1767171197);
		} else if (string.equals("heap"))
		    Class268.method4961(new StringBuilder().append
					    ("Heap: ").append
					    (-855455283 * Class503.anInt5590)
					    .append
					    ("MB").toString(),
					1787677192);
		else {
		    if (!string.equalsIgnoreCase("getcamerapos"))
			break;
		    Class600 class600
			= client.aClass507_11137.method8350(1220922034);
		    if (5 == -174799205 * Class700.anInt8779) {
			Class446 class446 = Class453_Sub3
						.aClass309_Sub1_10316
						.method5486(-597186144);
			Class446 class446_56_
			    = Class453_Sub3.aClass309_Sub1_10316
				  .method5488(-2043083178);
			Class268.method4961
			    (new StringBuilder().append("Pos: ").append
				 (new Class600
				      ((Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.aByte10867),
				       (int) class446.aFloat4895 >> 9,
				       (int) class446.aFloat4897 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (((int) class446.aFloat4895
				     - (class600.anInt7858 * -1227002079
					<< 9)),
				    ((int) class446.aFloat4897
				     - (class600.anInt7860 * 1429253007 << 9)),
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229)) + (int) class446.aFloat4896)
				 .toString(),
			     1651492832);
			Class268.method4961
			    (new StringBuilder().append("Look: ").append
				 (new Class600
				      ((Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.aByte10867),
				       (int) class446_56_.aFloat4895 >> 9,
				       (int) class446_56_.aFloat4897 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (((int) class446_56_.aFloat4895
				     - (class600.anInt7858 * -1227002079
					<< 9)),
				    ((int) class446.aFloat4897
				     - (1429253007 * class600.anInt7860 << 9)),
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229)) + (int) class446.aFloat4896)
				 .toString(),
			     1451179374);
		    } else {
			Class268.method4961
			    (new StringBuilder().append("Pos: ").append
				 (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				  .aByte10867)
				 .append
				 (",").append
				 ((class600.anInt7858 * -1227002079
				   + (-469853907 * Class477.anInt5200 >> 9))
				  >> 6)
				 .append
				 (",").append
				 (((-1889707729 * Class475.anInt5179 >> 9)
				   + 1429253007 * class600.anInt7860) >> 6)
				 .append
				 (",").append
				 (((-469853907 * Class477.anInt5200 >> 9)
				   + -1227002079 * class600.anInt7858) & 0x3f)
				 .append
				 (",").append
				 ((class600.anInt7860 * 1429253007
				   + (Class475.anInt5179 * -1889707729 >> 9))
				  & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (Class477.anInt5200 * -469853907,
				    -1889707729 * Class475.anInt5179,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229))
				  - Class575.anInt7648 * -142598869)
				 .toString(),
			     1411665687);
			Class268.method4961
			    (new StringBuilder().append("Look: ").append
				 (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				  .aByte10867)
				 .append
				 (",").append
				 ((-1227002079 * class600.anInt7858
				   + Class326.anInt3562 * -130227567) >> 6)
				 .append
				 (",").append
				 ((1105240097 * Class198_Sub16.anInt9979
				   + class600.anInt7860 * 1429253007) >> 6)
				 .append
				 (",").append
				 ((-1227002079 * class600.anInt7858
				   + -130227567 * Class326.anInt3562) & 0x3f)
				 .append
				 (",").append
				 ((class600.anInt7860 * 1429253007
				   + Class198_Sub16.anInt9979 * 1105240097)
				  & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (-130227567 * Class326.anInt3562,
				    Class198_Sub16.anInt9979 * 1105240097,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229))
				  - Class350_Sub2.anInt10225 * -458002533)
				 .toString(),
			     1644407321);
		    }
		}
	    } catch (Exception exception) {
		Class268.method4961
		    (Class53.aClass53_381.method1169(Class21.aClass666_213,
						     1552651121),
		     2078087433);
	    }
	    return;
	} while (false);
	if (Class685.aClass685_8686 != Class176.aClass685_1884
	    || 619753713 * client.anInt11231 >= 2) {
	    try {
		if (string.equalsIgnoreCase("wm1")) {
		    Class332_Sub1.method15672(1, -1, -1, false, (byte) 32);
		    if (Class441.method7120((byte) -7) == 1)
			Class268.method4961("Success", 1395221674);
		    else
			Class268.method4961("Failure", 1673598666);
		    return;
		}
		if (string.equalsIgnoreCase("wm2")) {
		    Class332_Sub1.method15672(2, -1, -1, false, (byte) 37);
		    if (Class441.method7120((byte) 8) == 2)
			Class268.method4961("Success", 1518844785);
		    else
			Class268.method4961("Failure", 1343357967);
		    return;
		}
		if (Class695.aBool8757 && string.equalsIgnoreCase("wm3")) {
		    Class332_Sub1.method15672(3, 1024, 768, false, (byte) -74);
		    if (Class441.method7120((byte) -88) == 3)
			Class268.method4961("Success", 1875151948);
		    else
			Class268.method4961("Failure", 1892260587);
		    return;
		}
		if (string.startsWith("setlobby ")) {
		    if (client.anInt11075 * 1777895575 != 1)
			Class268.method4961("Failure", 1706630484);
		    else {
			int i = -1;
			Object object = null;
			string = string.substring(9);
			int i_57_ = string.indexOf(' ');
			if (i_57_ == -1)
			    Class268.method4961("Failure", 1803397871);
			else {
			    try {
				i = Integer.parseInt(string.substring(0,
								      i_57_));
			    } catch (NumberFormatException numberformatexception) {
				/* empty */
			    }
			    if (i == -1)
				Class268.method4961("Failure", 1482836105);
			    else {
				String string_58_
				    = new StringBuilder().append
					  (string.substring(i_57_ + 1).trim())
					  .append
					  (".runescape.com").toString();
				Class547.method9102(string_58_, i, (byte) 36);
				Class268.method4961("Success", 1320818518);
				return;
			    }
			    return;
			}
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk0")) {
		    Class217.method4146(0, false, (byte) -6);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(2047808691)
			== 0) {
			Class268.method4961("Success", 1528050835);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     0, (byte) -112);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 2097088547);
		    return;
		}
		if (string.equalsIgnoreCase("tk1")) {
		    Class217.method4146(1, false, (byte) -6);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(201045093)
			== 1) {
			Class268.method4961("Success", 1364739409);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     1, (byte) -14);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1518311337);
		    return;
		}
		if (string.equalsIgnoreCase("tk3")) {
		    Class217.method4146(3, false, (byte) 49);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(319812637)
			== 3) {
			Class268.method4961("Success", 1447807677);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     3, (byte) -114);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 2082885037);
		    return;
		}
		if (string.equalsIgnoreCase("tk5")) {
		    Class217.method4146(5, false, (byte) -6);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(934752713)
			== 5) {
			Class268.method4961("Success", 1427642570);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     5, (byte) -23);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1837847930);
		    return;
		}
		if (string.equalsIgnoreCase("clientdrop")) {
		    if (client.anInt11075 * 1777895575 == 7)
			Class196.method3742((byte) -15);
		    else if (client.anInt11075 * 1777895575 == 4)
			client.aClass96_11085.aBool1184 = true;
		    return;
		}
		if (string.equalsIgnoreCase("breakcon")) {
		    Class96[] class96s = client.aClass96Array11133;
		    for (int i = 0; i < class96s.length; i++) {
			Class96 class96 = class96s[i];
			if (class96.method1799((byte) 0) != null)
			    class96.method1799((byte) 0)
				.method9378((byte) 124);
		    }
		    Class94.aClass463_912.method7622(1969737582);
		    return;
		}
		if (string.startsWith("getclientvarpbit")) {
		    int i = Integer.parseInt(string.substring(17));
		    Class268.method4961(new StringBuilder().append
					    ("varpbit=").append
					    (Class532.aClass111_7170.method93
					     (Class532.aClass111_7170
						  .method124(i, -231397003),
					      (byte) 2))
					    .toString(),
					1940071579);
		    return;
		}
		if (string.startsWith("getclientvarp")) {
		    int i = Integer.parseInt(string.substring(14));
		    Class268.method4961(new StringBuilder().append("varp=")
					    .append
					    (Class532.aClass111_7170.method104
					     ((Class532.aClass111_7170
						   .method119
					       (Class453.aClass453_4939, i,
						-1954193178)),
					      623775022))
					    .toString(),
					1928359514);
		    return;
		}
		if (string.startsWith("directlogin")) {
		    String[] strings
			= Class481.method7829(string.substring(12), ' ',
					      885164656);
		    if (strings.length == 2 || 3 == strings.length) {
			if (Class198_Sub4.method15613(-492271742))
			    Class280.method5162((byte) -111);
			Class350.method6154(strings[0], strings[1],
					    (strings.length > 2 ? strings[2]
					     : ""),
					    true, (byte) 0);
		    }
		    return;
		}
		if (string.startsWith("snlogin ")) {
		    String[] strings = Class481.method7829(string.substring(8),
							   ' ', 477007048);
		    int i = Integer.parseInt(strings[0]);
		    String string_59_ = strings.length > 1 ? strings[1] : "";
		    Class696_Sub33.method17276(i, string_59_, true,
					       -824627302);
		    return;
		}
		if (string.startsWith("setoutput ")) {
		    File file = new File(string.substring(10));
		    if (file.exists()) {
			file = new File(new StringBuilder().append
					    (string.substring(10)).append
					    (".").append
					    (Class251.method4508((byte) 8))
					    .append
					    (".log").toString());
			if (file.exists()) {
			    Class268.method4961("file already exists!",
						1504771751);
			    return;
			}
		    }
		    if (null != Class525_Sub7_Sub11.aFileOutputStream11721) {
			Class525_Sub7_Sub11.aFileOutputStream11721.close();
			Class525_Sub7_Sub11.aFileOutputStream11721 = null;
		    }
		    try {
			Class525_Sub7_Sub11.aFileOutputStream11721
			    = new FileOutputStream(file);
		    } catch (FileNotFoundException filenotfoundexception) {
			Class268.method4961(new StringBuilder().append
						("Could not create ").append
						(file.getName()).toString(),
					    1938446752);
		    } catch (SecurityException securityexception) {
			Class268.method4961(new StringBuilder().append
						("Cannot write to ").append
						(file.getName()).toString(),
					    1968933478);
		    }
		    return;
		}
		if (string.equals("closeoutput")) {
		    if (Class525_Sub7_Sub11.aFileOutputStream11721 != null)
			Class525_Sub7_Sub11.aFileOutputStream11721.close();
		    Class525_Sub7_Sub11.aFileOutputStream11721 = null;
		    return;
		}
		if (string.startsWith("runscript ")) {
		    File file = new File(string.substring(10));
		    if (!file.exists()) {
			Class268.method4961("No such file", 1562973816);
			return;
		    }
		    byte[] is = Class646.method10692(file, (byte) 63);
		    if (is == null) {
			Class268.method4961("Failed to read file", 1453579082);
			return;
		    }
		    String[] strings = (Class481.method7829
					((Class654.method10800
					  (Class540.method8891(is, -526209688),
					   '\r', "", 2053861319)),
					 '\n', 1063528210));
		    Class707.method14322(strings, 1118686580);
		}
		if (7 == 1777895575 * client.anInt11075
		    || 1777895575 * client.anInt11075 == 16) {
		    Class96 class96 = Class111.method1979(912869776);
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4271,
					    class96.aClass6_1169, 1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(string.length() + 3, -1776024189);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(bool ? 1 : 0, -972431368);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(bool_54_ ? 1 : 0, -166814010);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16700(string, 1249135963);
		    class96.method1794(class525_sub15, (short) 13990);
		}
	    } catch (Exception exception) {
		Class268.method4961
		    (Class53.aClass53_381.method1169(Class21.aClass666_213,
						     1552651121),
		     1297600150);
		return;
	    }
	}
	if (7 != 1777895575 * client.anInt11075
	    && 1777895575 * client.anInt11075 != 16)
	    Class268.method4961
		(new StringBuilder().append
		     (Class53.aClass53_466.method1169(Class21.aClass666_213,
						      1552651121))
		     .append
		     (string).toString(),
		 1606548885);
    }
    
    static void method2051() {
	if (Class178.method2915(-1312757053)) {
	    if (null == aStringArray1411)
		Class206.method3899((short) 12694);
	    aBool1409 = true;
	    anInt1417 = 0;
	}
    }
    
    static void method2052() {
	anInt1416
	    = (Class525_Sub24.aClass7_10595.anInt49 * 665702593
	       + 962137615 * Class525_Sub24.aClass7_10595.anInt51 + 500018954);
	Class226.anInt2342
	    = -489975066 + (Class500.aClass7_5560.anInt49 * 305710039
			    + -826521383 * Class500.aClass7_5560.anInt51);
	aStringArray1411 = new String[500];
	for (int i = 0; i < aStringArray1411.length; i++)
	    aStringArray1411[i] = "";
	Class268.method4961(Class53.aClass53_411
				.method1169(Class21.aClass666_213, 1552651121),
			    2085507729);
    }
    
    static void method2053(String[] strings) {
	if (strings.length > 1) {
	    for (int i = 0; i < strings.length; i++) {
		if (strings[i].startsWith("pause")) {
		    int i_60_ = 5;
		    try {
			i_60_ = Integer.parseInt(strings[i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class268.method4961(new StringBuilder().append
					    ("Pausing for ").append
					    (i_60_).append
					    (" seconds...").toString(),
					1982915076);
		    Class95.aStringArray1126 = strings;
		    anInt1419 = 1709148145 * (i + 1);
		    Class41.aLong337
			= (Class251.method4508((byte) 8)
			   + (long) (1000 * i_60_)) * -3188431922941586339L;
		    break;
		}
		aString1414 = strings[i];
		Class655.method10814(false, 1458912130);
	    }
	} else {
	    aString1414 = new StringBuilder().append(aString1414).append
			      (strings[0]).toString();
	    anInt1420 += strings[0].length() * -2087599183;
	}
    }
    
    static void method2054() {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub25_10723
		.method17208(424135869)
	    == 1)
	    Class45.aClass500_349.method8170(new Class514((Class499
							   .aClass499_5554),
							  null),
					     261578035);
	else {
	    client.aClass507_11137.method8375((byte) 82);
	    Class587.method9690(416569636);
	}
    }
    
    static void method2055() {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub25_10723
		.method17208(424135869)
	    == 1)
	    Class45.aClass500_349.method8170(new Class514((Class499
							   .aClass499_5554),
							  null),
					     -283165627);
	else {
	    client.aClass507_11137.method8375((byte) -1);
	    Class587.method9690(-1819397179);
	}
    }
    
    public static void method2056(Class182 class182, long l, int i, int i_61_,
				  int i_62_) {
	do {
	    if (class182.method3167() && class182.method3171() > -1) {
		int i_63_ = class182.method3171();
		Class572 class572 = null;
		if (!Class589.aLinkedList7798.isEmpty())
		    class572 = (Class572) Class589.aLinkedList7798.getFirst();
		if (class572 == null
		    || i_63_ != class572.anInt7642 * 950456133) {
		    class182.method3401();
		    Class589.aLinkedList7798.clear();
		} else {
		    Class589.aLinkedList7798.removeFirst();
		    class182.method3219();
		    boolean bool = false;
		    int i_64_;
		    if (class572.aLinkedList7640.isEmpty()
			&& class182.method3169()) {
			long l_65_ = class182.method3174((Class583.anInt7720
							  * 873750109),
							 (Class451.anInt4934
							  * 57354327));
			i_64_ = (Class285.aTwitchTV3143.SubmitFrame
				 (l_65_, class182.method3170(),
				  Class589.aBool7781, i, i_61_));
			class182.method3552(l_65_);
		    } else {
			class182.method3149(873750109 * Class583.anInt7720,
					    57354327 * Class451.anInt4934,
					    Class621.anIntArray8093,
					    Class42.anIntArray341);
			Class536.method8872(Class621.anIntArray8093,
					    class572.aLinkedList7640,
					    class572.anInt7638 * 1074585717,
					    class572.anInt7639 * 2054428499,
					    class572.aFloat7641, -1797227778);
			i_64_ = (Class285.aTwitchTV3143.SubmitFrameRaw
				 (Class621.anIntArray8093, Class589.aBool7781,
				  i, i_61_));
		    }
		    class182.method3161();
		    if (i_64_ == 2072)
			Class589.aLong7796 = 7427304025077989303L * l;
		    else if (23 == i_64_)
			Class589.aLong7777 = -8774771765122825275L * l;
		    else if (-995 == i_64_ || 0 != i_64_)
			break;
		}
	    }
	} while (false);
	if (Class589.aBool7799) {
	    if (Class621.anIntArray8093 == null) {
		Class621.anIntArray8093
		    = new int[(Class589.aBool7781 ? i_61_ * i
			       : (873750109 * Class583.anInt7720
				  * (57354327 * Class451.anInt4934)))];
		Class42.anIntArray341
		    = new int[(Class589.aBool7781 ? i_61_ * i
			       : (Class583.anInt7720 * 873750109
				  * (Class451.anInt4934 * 57354327)))];
	    }
	    if (!class182.method3167()) {
		class182.method3219();
		class182.method3149(Class583.anInt7720 * 873750109,
				    57354327 * Class451.anInt4934,
				    Class621.anIntArray8093,
				    Class42.anIntArray341);
		Class536.method8872(Class621.anIntArray8093,
				    Class589.aLinkedList7802,
				    1000431205 * class182.anInt1958,
				    1482704485 * class182.anInt1964,
				    class182.aFloat1968, -817996460);
		int i_66_
		    = Class285.aTwitchTV3143.SubmitFrameRaw((Class621
							     .anIntArray8093),
							    Class589.aBool7781,
							    i, i_61_);
		class182.method3161();
		Class589.aLinkedList7802.clear();
		do {
		    if (2072 == i_66_)
			Class589.aLong7796 = l * 7427304025077989303L;
		    else if (23 == i_66_)
			Class589.aLong7777 = l * -8774771765122825275L;
		    else if (-995 == i_66_ || i_66_ != 0)
			break;
		} while (false);
	    } else {
		class182.method3173(client.anInt11083,
				    873750109 * Class583.anInt7720,
				    57354327 * Class451.anInt4934);
		Class589.aLinkedList7798.add
		    (new Class572(client.anInt11083, Class589.aLinkedList7802,
				  class182.anInt1958 * 1000431205,
				  class182.anInt1964 * 1482704485,
				  class182.aFloat1968));
		Class589.aLinkedList7802 = new LinkedList();
	    }
	    Class589.aBool7799 = false;
	}
    }
    
    public static boolean method2057(int i) {
	return (null != Class285.aTwitchTV3143
		&& Class285.aTwitchTV3143.IsStreaming());
    }
    
    static void method2058(int i) {
	if (anInt1415 * 1919934461 > 0) {
	    int i_67_ = 0;
	    for (int i_68_ = 0; i_68_ < aStringArray1411.length; i_68_++) {
		if (aStringArray1411[i_68_].indexOf("--> ") != -1
		    && ++i_67_ == 1919934461 * anInt1415) {
		    aString1414
			= aStringArray1411[i_68_].substring(aStringArray1411
								[i_68_]
								.indexOf('>')
							    + 2);
		    break;
		}
	    }
	} else
	    aString1414 = "";
    }
    
    static final void method2059(Class683 class683, int i) {
	int i_69_ = class683.anIntArray8647[class683.anInt8663 * 1931825055];
	class683.anInt8644 -= 1285561025 * i_69_;
	String string = Class499.method8167(class683.anObjectArray8636,
					    1373599041 * class683.anInt8644,
					    i_69_, -480277551);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = string;
    }
    
    static final void method2060(Class683 class683, int i) {
	int i_70_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_70_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_70_ >> 16];
	Class183.method3600(class259, class245, true, 1, class683, 676890749);
    }
    
    static final void method2061(Class683 class683, int i) {
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = Class647.method10695(1511112661);
	if (null != class525_sub16_sub6) {
	    boolean bool
		= (class525_sub16_sub6.method18273
		   (1318111247 * Class144_Sub1.anInt9141 + Class556.anInt7483,
		    (Class696_Sub13.anInt10912 * 1586604897
		     + Class556.anInt7484),
		    Class686.anIntArray8699, 1936283541));
	    if (bool) {
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = Class686.anIntArray8699[1];
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = Class686.anIntArray8699[2];
	    } else {
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = -1;
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = -1;
	    }
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	}
    }
    
    static final void method2062(Class683 class683, byte i) {
	Class619.method10169(Class556_Sub1.anInt10623 * -915724175,
			     -672439486);
    }
    
    public static Class416[] method2063(byte i) {
	return (new Class416[]
		{ Class416.aClass416_4521, Class416.aClass416_4423,
		  Class416.aClass416_4424, Class416.aClass416_4564,
		  Class416.aClass416_4566, Class416.aClass416_4561,
		  Class416.aClass416_4428, Class416.aClass416_4429,
		  Class416.aClass416_4430, Class416.aClass416_4572,
		  Class416.aClass416_4432, Class416.aClass416_4433,
		  Class416.aClass416_4563, Class416.aClass416_4435,
		  Class416.aClass416_4509, Class416.aClass416_4437,
		  Class416.aClass416_4438, Class416.aClass416_4461,
		  Class416.aClass416_4440, Class416.aClass416_4471,
		  Class416.aClass416_4466, Class416.aClass416_4552,
		  Class416.aClass416_4444, Class416.aClass416_4445,
		  Class416.aClass416_4446, Class416.aClass416_4447,
		  Class416.aClass416_4448, Class416.aClass416_4449,
		  Class416.aClass416_4450, Class416.aClass416_4451,
		  Class416.aClass416_4452, Class416.aClass416_4453,
		  Class416.aClass416_4454, Class416.aClass416_4455,
		  Class416.aClass416_4510, Class416.aClass416_4439,
		  Class416.aClass416_4508, Class416.aClass416_4426,
		  Class416.aClass416_4460, Class416.aClass416_4532,
		  Class416.aClass416_4462, Class416.aClass416_4605,
		  Class416.aClass416_4464, Class416.aClass416_4465,
		  Class416.aClass416_4431, Class416.aClass416_4467,
		  Class416.aClass416_4468, Class416.aClass416_4469,
		  Class416.aClass416_4470, Class416.aClass416_4442,
		  Class416.aClass416_4472, Class416.aClass416_4514,
		  Class416.aClass416_4607, Class416.aClass416_4475,
		  Class416.aClass416_4476, Class416.aClass416_4477,
		  Class416.aClass416_4478, Class416.aClass416_4479,
		  Class416.aClass416_4480, Class416.aClass416_4481,
		  Class416.aClass416_4482, Class416.aClass416_4483,
		  Class416.aClass416_4484, Class416.aClass416_4542,
		  Class416.aClass416_4486, Class416.aClass416_4487,
		  Class416.aClass416_4434, Class416.aClass416_4489,
		  Class416.aClass416_4571, Class416.aClass416_4491,
		  Class416.aClass416_4473, Class416.aClass416_4502,
		  Class416.aClass416_4474, Class416.aClass416_4495,
		  Class416.aClass416_4496, Class416.aClass416_4497,
		  Class416.aClass416_4587, Class416.aClass416_4499,
		  Class416.aClass416_4500, Class416.aClass416_4501,
		  Class416.aClass416_4585, Class416.aClass416_4591,
		  Class416.aClass416_4538, Class416.aClass416_4505,
		  Class416.aClass416_4456, Class416.aClass416_4507,
		  Class416.aClass416_4436, Class416.aClass416_4613,
		  Class416.aClass416_4592, Class416.aClass416_4539,
		  Class416.aClass416_4581, Class416.aClass416_4458,
		  Class416.aClass416_4490, Class416.aClass416_4515,
		  Class416.aClass416_4516, Class416.aClass416_4517,
		  Class416.aClass416_4518, Class416.aClass416_4519,
		  Class416.aClass416_4520, Class416.aClass416_4574,
		  Class416.aClass416_4522, Class416.aClass416_4523,
		  Class416.aClass416_4485, Class416.aClass416_4524,
		  Class416.aClass416_4526, Class416.aClass416_4488,
		  Class416.aClass416_4528, Class416.aClass416_4529,
		  Class416.aClass416_4594, Class416.aClass416_4531,
		  Class416.aClass416_4494, Class416.aClass416_4556,
		  Class416.aClass416_4534, Class416.aClass416_4535,
		  Class416.aClass416_4536, Class416.aClass416_4537,
		  Class416.aClass416_4492, Class416.aClass416_4601,
		  Class416.aClass416_4540, Class416.aClass416_4541,
		  Class416.aClass416_4463, Class416.aClass416_4543,
		  Class416.aClass416_4544, Class416.aClass416_4545,
		  Class416.aClass416_4546, Class416.aClass416_4547,
		  Class416.aClass416_4548, Class416.aClass416_4549,
		  Class416.aClass416_4425, Class416.aClass416_4551,
		  Class416.aClass416_4443, Class416.aClass416_4553,
		  Class416.aClass416_4554, Class416.aClass416_4609,
		  Class416.aClass416_4457, Class416.aClass416_4427,
		  Class416.aClass416_4558, Class416.aClass416_4559,
		  Class416.aClass416_4560, Class416.aClass416_4555,
		  Class416.aClass416_4562, Class416.aClass416_4577,
		  Class416.aClass416_4533, Class416.aClass416_4565,
		  Class416.aClass416_4527, Class416.aClass416_4567,
		  Class416.aClass416_4568, Class416.aClass416_4569,
		  Class416.aClass416_4570, Class416.aClass416_4511,
		  Class416.aClass416_4422, Class416.aClass416_4573,
		  Class416.aClass416_4512, Class416.aClass416_4575,
		  Class416.aClass416_4576, Class416.aClass416_4606,
		  Class416.aClass416_4578, Class416.aClass416_4579,
		  Class416.aClass416_4580, Class416.aClass416_4616,
		  Class416.aClass416_4600, Class416.aClass416_4583,
		  Class416.aClass416_4584, Class416.aClass416_4582,
		  Class416.aClass416_4586, Class416.aClass416_4550,
		  Class416.aClass416_4588, Class416.aClass416_4589,
		  Class416.aClass416_4590, Class416.aClass416_4506,
		  Class416.aClass416_4530, Class416.aClass416_4593,
		  Class416.aClass416_4504, Class416.aClass416_4595,
		  Class416.aClass416_4596, Class416.aClass416_4597,
		  Class416.aClass416_4598, Class416.aClass416_4599,
		  Class416.aClass416_4525, Class416.aClass416_4557,
		  Class416.aClass416_4602, Class416.aClass416_4603,
		  Class416.aClass416_4604, Class416.aClass416_4493,
		  Class416.aClass416_4441, Class416.aClass416_4459,
		  Class416.aClass416_4513, Class416.aClass416_4498,
		  Class416.aClass416_4610, Class416.aClass416_4608,
		  Class416.aClass416_4612, Class416.aClass416_4503,
		  Class416.aClass416_4614, Class416.aClass416_4615 });
    }
    
    static void method2064(int i, int i_71_, int i_72_) {
	if (Class138.aClass631_1641.aBool8202
	    || (-628070459 * Class61.anInt658 != 1
		&& (!Class623.aBool8123 || Class61.anInt658 * -628070459 != 2
		    || !(Class659.aClass525_Sub16_Sub16_8459.aString11858
			     .equals
			 (Class53.aClass53_514.method1169((Class21
							   .aClass666_213),
							  1552651121)))))) {
	    Class7 class7 = Class328.method5797((byte) -23);
	    int i_73_ = class7.method561((Class53.aClass53_511.method1169
					  (Class21.aClass666_213, 1552651121)),
					 -1651693808);
	    int i_74_;
	    if (!Class61.aBool652) {
		for (Class525_Sub16_Sub16 class525_sub16_sub16
			 = ((Class525_Sub16_Sub16)
			    Class61.aClass709_660.method14372((short) -27965));
		     null != class525_sub16_sub16;
		     class525_sub16_sub16
			 = ((Class525_Sub16_Sub16)
			    Class61.aClass709_660.method14353(-1832772211))) {
		    int i_75_ = Class305.method5426(class525_sub16_sub16,
						    class7, -1761231196);
		    if (i_75_ > i_73_)
			i_73_ = i_75_;
		}
		i_73_ += 8;
		i_74_ = 21 + (Class61.anInt658 * -628070459
			      * (-632680525 * Class61.anInt648));
		Class515.anInt5722
		    = 990142767 * ((Class61.aBool645 ? 26 : 22)
				   + (-632680525 * Class61.anInt648
				      * (Class61.anInt658 * -628070459)));
	    } else {
		for (Class525_Sub16_Sub7 class525_sub16_sub7
			 = ((Class525_Sub16_Sub7)
			    Class61.aClass697_656.method14186((byte) -14));
		     null != class525_sub16_sub7;
		     class525_sub16_sub7
			 = ((Class525_Sub16_Sub7)
			    Class61.aClass697_656.method14201((byte) -1))) {
		    int i_76_;
		    if (1 == class525_sub16_sub7.anInt11780 * 1624285615)
			i_76_ = Class305.method5426(((Class525_Sub16_Sub16)
						     (class525_sub16_sub7
						      .aClass697_11778
						      .aClass525_Sub16_8766
						      .aClass525_Sub16_10554)),
						    class7, -2063761442);
		    else
			i_76_ = Class18.method793(class525_sub16_sub7, class7,
						  -826678987);
		    if (i_76_ > i_73_)
			i_73_ = i_76_;
		}
		i_73_ += 8;
		i_74_ = Class61.anInt659 * 1607854389 * (Class61.anInt648
							 * -632680525) + 21;
		Class515.anInt5722
		    = (1607854389 * Class61.anInt659 * (-632680525
							* Class61.anInt648)
		       + (Class61.aBool645 ? 26 : 22)) * 990142767;
	    }
	    i_73_ += 10;
	    int i_77_ = i - i_73_ / 2;
	    if (i_77_ + i_73_ > -1445589163 * Class434.anInt4827)
		i_77_ = -1445589163 * Class434.anInt4827 - i_73_;
	    if (i_77_ < 0)
		i_77_ = 0;
	    int i_78_ = i_71_;
	    if (i_74_ + i_78_ > Class696_Sub47.anInt11032 * -1883654023)
		i_78_ = -1883654023 * Class696_Sub47.anInt11032 - i_74_;
	    if (i_78_ < 0)
		i_78_ = 0;
	    Class50.anInt374 = 619302101 * i_77_;
	    Exception_Sub2.anInt11420 = i_78_ * -1145163961;
	    Class49.anInt373 = i_73_ * -910956721;
	    Class61.anInt680 = (int) (Math.random() * 24.0) * 810339213;
	    Class61.aBool670 = true;
	}
    }
    
    static final void method2065(Class683 class683, int i) {
	int i_79_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_79_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_79_ >> 16];
	Class102.method1886(class259, class245, class683, -155412562);
    }
}
