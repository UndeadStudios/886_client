/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class57
{
    static final int anInt614 = 2;
    static final String aString615 = "services";
    static final String aString616 = "passwordchoice.ws";
    static final String aString617 = "m=accountappeal/login.ws";
    static BigInteger aBigInteger618
	= (new BigInteger
	   ("80782894952180643741752986186714059433953886149239752893425047584684715842049"));
    static BigInteger aBigInteger619
	= (new BigInteger
	   ("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"));
    static final int anInt620 = 1000;
    static final int anInt621 = 3;
    static final int anInt622 = 4;
    public static final int anInt623 = 5;
    static final int anInt624 = 6;
    static final int anInt625 = 7;
    static final int anInt626 = 2;
    
    static boolean method1205(String string) {
	if (string == null)
	    return false;
	try {
	    new URL(string);
	} catch (MalformedURLException malformedurlexception) {
	    return false;
	}
	return true;
    }
    
    public static long method1206() {
	long l;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class620.method10183("services", false,
							1768352629))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setRequestProperty("connection", "close");
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write("data1=req");
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    RSBuffer class525_sub38 = new RSBuffer(new byte[1000]);
	    for (;;) {
		int i
		    = inputstream.read(class525_sub38.buffer,
				       class525_sub38.index * -1133521593,
				       1000 - (class525_sub38.index
					       * -1133521593));
		if (-1 == i)
		    break;
		class525_sub38.index += 339428471 * i;
		if (-1133521593 * class525_sub38.index >= 1000)
		    return 0L;
	    }
	    class525_sub38.index = 0;
	    long l_0_ = class525_sub38.method16603(-1744828740);
	    l = l_0_;
	} catch (Exception exception) {
	    return 0L;
	}
	return l;
    }
    
    public static final int method1207(long l, String string) {
	Random random = new Random();
	RSBuffer class525_sub38 = new RSBuffer(128);
	RSBuffer class525_sub38_1_ = new RSBuffer(128);
	int[] is = new int[4];
	is[0] = random.nextInt();
	is[1] = random.nextInt();
	is[2] = (int) (l >> 32);
	is[3] = (int) l;
	class525_sub38.method16735(10, -2114699229);
	for (int i = 0; i < 4; i++)
	    class525_sub38.method16605(random.nextInt(), -1184867730);
	class525_sub38.method16605(is[0], -1386718351);
	class525_sub38.method16605(is[1], -1884284041);
	class525_sub38.method16609(l);
	class525_sub38.method16609(0L);
	for (int i = 0; i < 4; i++)
	    class525_sub38.method16605(random.nextInt(), -456738001);
	class525_sub38.method16671(aBigInteger618, aBigInteger619,
				   (short) 26271);
	class525_sub38_1_.method16735(10, -200529608);
	for (int i = 0; i < 3; i++)
	    class525_sub38_1_.method16605(random.nextInt(), -2138258420);
	class525_sub38_1_.method16609(random.nextLong());
	class525_sub38_1_.method16601(random.nextLong());
	Class236.method4408(class525_sub38_1_, (byte) 89);
	class525_sub38_1_.method16609(random.nextLong());
	class525_sub38_1_.method16671(aBigInteger618, aBigInteger619,
				      (short) 24682);
	int i = Class161.method2628(string, -752847760);
	if (i % 8 != 0)
	    i += 8 - i % 8;
	RSBuffer class525_sub38_2_ = new RSBuffer(i);
	class525_sub38_2_.method16700(string, 734367931);
	class525_sub38_2_.index = 339428471 * i;
	class525_sub38_2_.method16726(is, (byte) 36);
	RSBuffer class525_sub38_3_
	    = new RSBuffer(-1133521593 * class525_sub38_2_.index
				 + (class525_sub38_1_.index * -1133521593
				    + (class525_sub38.index * -1133521593
				       + 5)));
	class525_sub38_3_.method16735(2, -2054197535);
	class525_sub38_3_.method16735(class525_sub38.index * -1133521593,
				      -919270738);
	class525_sub38_3_.method16614(class525_sub38.buffer, 0,
				      class525_sub38.index * -1133521593,
				      517474468);
	class525_sub38_3_.method16735((-1133521593
				       * class525_sub38_1_.index),
				      -498240369);
	class525_sub38_3_.method16614(class525_sub38_1_.buffer, 0,
				      (-1133521593
				       * class525_sub38_1_.index),
				      1218528380);
	class525_sub38_3_.method16602((-1133521593
				       * class525_sub38_2_.index),
				      1365955965);
	class525_sub38_3_.method16614(class525_sub38_2_.buffer, 0,
				      (class525_sub38_2_.index
				       * -1133521593),
				      1224837398);
	String string_4_
	    = Class564.method9452(class525_sub38_3_.buffer,
				  1871568545);
	int i_5_;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class620.method10183("services", false,
							-1767679575))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write(new StringBuilder().append("data2=")
					 .append
					 (Class3.method529(string_4_,
							   1552651121))
					 .append
					 ("&dest=").append
					 (Class3.method529("passwordchoice.ws",
							   1552651121))
					 .toString());
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    class525_sub38_3_ = new RSBuffer(new byte[1000]);
	    for (;;) {
		int i_6_
		    = inputstream.read(class525_sub38_3_.buffer,
				       (-1133521593
					* class525_sub38_3_.index),
				       1000 - (class525_sub38_3_.index
					       * -1133521593));
		if (i_6_ == -1)
		    break;
		class525_sub38_3_.index += i_6_ * 339428471;
		if (-1133521593 * class525_sub38_3_.index >= 1000)
		    return 5;
	    }
	    outputstreamwriter.close();
	    inputstream.close();
	    String string_7_ = new String(class525_sub38_3_.buffer);
	    if (string_7_.startsWith("OFFLINE"))
		return 4;
	    if (string_7_.startsWith("WRONG"))
		return 7;
	    if (string_7_.startsWith("RELOAD"))
		return 3;
	    if (string_7_
		    .startsWith("Not permitted for social network accounts."))
		return 6;
	    class525_sub38_3_.method16752(is, -2093736709);
	    for (/**/;
		 (-1133521593 * class525_sub38_3_.index > 0
		  && (class525_sub38_3_.buffer
		      [-1133521593 * class525_sub38_3_.index - 1]) == 0);
		 class525_sub38_3_.index -= 339428471) {
		/* empty */
	    }
	    string_7_ = new String(class525_sub38_3_.buffer, 0,
				   -1133521593 * class525_sub38_3_.index);
	    if (Class213.method3941(string_7_, (byte) 1)) {
		NPCDefinitions.method5393(string_7_, true, client.aBool11241,
				    -1932567123);
		return 2;
	    }
	    i_5_ = 5;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return 5;
	}
	return i_5_;
    }
    
    static boolean method1208(String string) {
	if (string == null)
	    return false;
	try {
	    new URL(string);
	} catch (MalformedURLException malformedurlexception) {
	    return false;
	}
	return true;
    }
    
    public static final int method1209(long l, String string) {
	Random random = new Random();
	RSBuffer class525_sub38 = new RSBuffer(128);
	RSBuffer class525_sub38_8_ = new RSBuffer(128);
	int[] is = new int[4];
	is[0] = random.nextInt();
	is[1] = random.nextInt();
	is[2] = (int) (l >> 32);
	is[3] = (int) l;
	class525_sub38.method16735(10, -1438305343);
	for (int i = 0; i < 4; i++)
	    class525_sub38.method16605(random.nextInt(), -157600235);
	class525_sub38.method16605(is[0], -1192316019);
	class525_sub38.method16605(is[1], -2032570479);
	class525_sub38.method16609(l);
	class525_sub38.method16609(0L);
	for (int i = 0; i < 4; i++)
	    class525_sub38.method16605(random.nextInt(), -1433897240);
	class525_sub38.method16671(aBigInteger618, aBigInteger619,
				   (short) 28137);
	class525_sub38_8_.method16735(10, -563903928);
	for (int i = 0; i < 3; i++)
	    class525_sub38_8_.method16605(random.nextInt(), -1759282646);
	class525_sub38_8_.method16609(random.nextLong());
	class525_sub38_8_.method16601(random.nextLong());
	Class236.method4408(class525_sub38_8_, (byte) 89);
	class525_sub38_8_.method16609(random.nextLong());
	class525_sub38_8_.method16671(aBigInteger618, aBigInteger619,
				      (short) 2300);
	int i = Class161.method2628(string, -1782014710);
	if (i % 8 != 0)
	    i += 8 - i % 8;
	RSBuffer class525_sub38_9_ = new RSBuffer(i);
	class525_sub38_9_.method16700(string, 1636408956);
	class525_sub38_9_.index = 339428471 * i;
	class525_sub38_9_.method16726(is, (byte) 26);
	RSBuffer class525_sub38_10_
	    = new RSBuffer(-1133521593 * class525_sub38_9_.index
				 + (class525_sub38_8_.index * -1133521593
				    + (class525_sub38.index * -1133521593
				       + 5)));
	class525_sub38_10_.method16735(2, -829484012);
	class525_sub38_10_.method16735(class525_sub38.index * -1133521593,
				       -1713708685);
	class525_sub38_10_.method16614(class525_sub38.buffer, 0,
				       class525_sub38.index * -1133521593,
				       87136030);
	class525_sub38_10_.method16735((-1133521593
					* class525_sub38_8_.index),
				       -1188968770);
	class525_sub38_10_.method16614(class525_sub38_8_.buffer, 0,
				       (-1133521593
					* class525_sub38_8_.index),
				       998962221);
	class525_sub38_10_.method16602((-1133521593
					* class525_sub38_9_.index),
				       2028479668);
	class525_sub38_10_.method16614(class525_sub38_9_.buffer, 0,
				       (class525_sub38_9_.index
					* -1133521593),
				       -393285349);
	String string_11_
	    = Class564.method9452(class525_sub38_10_.buffer,
				  -433252151);
	int i_12_;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class620.method10183("services", false,
							1097791720))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write(new StringBuilder().append("data2=")
					 .append
					 (Class3.method529(string_11_,
							   1552651121))
					 .append
					 ("&dest=").append
					 (Class3.method529("passwordchoice.ws",
							   1552651121))
					 .toString());
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    class525_sub38_10_ = new RSBuffer(new byte[1000]);
	    for (;;) {
		int i_13_
		    = inputstream.read(class525_sub38_10_.buffer,
				       (-1133521593
					* class525_sub38_10_.index),
				       1000 - (class525_sub38_10_.index
					       * -1133521593));
		if (i_13_ == -1)
		    break;
		class525_sub38_10_.index += i_13_ * 339428471;
		if (-1133521593 * class525_sub38_10_.index >= 1000)
		    return 5;
	    }
	    outputstreamwriter.close();
	    inputstream.close();
	    String string_14_ = new String(class525_sub38_10_.buffer);
	    if (string_14_.startsWith("OFFLINE"))
		return 4;
	    if (string_14_.startsWith("WRONG"))
		return 7;
	    if (string_14_.startsWith("RELOAD"))
		return 3;
	    if (string_14_
		    .startsWith("Not permitted for social network accounts."))
		return 6;
	    class525_sub38_10_.method16752(is, -2093736709);
	    for (/**/;
		 (-1133521593 * class525_sub38_10_.index > 0
		  && (class525_sub38_10_.buffer
		      [-1133521593 * class525_sub38_10_.index - 1]) == 0);
		 class525_sub38_10_.index -= 339428471) {
		/* empty */
	    }
	    string_14_
		= new String(class525_sub38_10_.buffer, 0,
			     -1133521593 * class525_sub38_10_.index);
	    if (Class213.method3941(string_14_, (byte) 1)) {
		NPCDefinitions.method5393(string_14_, true, client.aBool11241,
				    830844482);
		return 2;
	    }
	    i_12_ = 5;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return 5;
	}
	return i_12_;
    }
    
    Class57() throws Throwable {
	throw new Error();
    }
    
    public static void method1210(int i, int i_15_) {
	if (client.anInt11075 * 1777895575 == 9) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4374,
				    client.aClass96_11361.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(i,
								  -607359397);
	    client.aClass96_11361.method1794(class525_sub15, (short) 9239);
	}
    }
    
    static final void method1211(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2636 * -106078709;
    }
    
    static final void method1212(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method1213(Class683 class683, int i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]),
	     (byte) -8);
	client.aClass507_11137.method8375((byte) 25);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
    
    public static final int method1214(int i, int i_16_, int i_17_,
				       int i_18_) {
	if (i_17_ > 243)
	    i_16_ >>= 4;
	else if (i_17_ > 217)
	    i_16_ >>= 3;
	else if (i_17_ > 192)
	    i_16_ >>= 2;
	else if (i_17_ > 179)
	    i_16_ >>= 1;
	return ((i & 0xff) >> 2 << 10) + (i_16_ >> 5 << 7) + (i_17_ >> 1);
    }
    
    static final boolean method1215(char c, int i) {
	if (Character.isISOControl(c))
	    return false;
	if (Class560.method9410(c, 467123259))
	    return true;
	char[] cs = Class80.aCharArray845;
	for (int i_19_ = 0; i_19_ < cs.length; i_19_++) {
	    char c_20_ = cs[i_19_];
	    if (c_20_ == c)
		return true;
	}
	cs = Class80.aCharArray842;
	for (int i_21_ = 0; i_21_ < cs.length; i_21_++) {
	    char c_22_ = cs[i_21_];
	    if (c_22_ == c)
		return true;
	}
	return false;
    }
}
