/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class301 implements Interface12, Interface7
{
    public int anInt3364;
    public int anInt3365;
    public int anInt3366;
    public int anInt3367 = 628140248;
    public int anInt3368;
    public boolean aBool3369;
    public int anInt3370;
    public int anInt3371;
    public int anInt3372;
    public int anInt3373;
    public int anInt3374 = -287985119;
    
    public void method53(int i) {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(311469746);
	    if (i_0_ == 0)
		break;
	    method5400(class525_sub38, i_0_, 1811588942);
	}
    }
    
    void method5400(RSBuffer class525_sub38, int i, int i_1_) {
	if (1 == i)
	    anInt3367 = class525_sub38.readUnsignedShort((byte) 23) * 615388443;
	else if (i == 2)
	    aBool3369 = true;
	else if (3 == i) {
	    anInt3370 = class525_sub38.method16625((byte) 19) * 1159244991;
	    anInt3364 = class525_sub38.method16625((byte) 72) * 533453001;
	    anInt3368 = class525_sub38.method16625((byte) 72) * 1064179037;
	} else if (4 == i)
	    anInt3365 = class525_sub38.readUnsignedByte(1682528293) * -1785915209;
	else if (i == 5)
	    anInt3371 = class525_sub38.readBigSmart(-2043778683) * -1448956551;
	else if (6 == i)
	    anInt3374 = class525_sub38.method16834(-1994884458) * -265663009;
	else if (7 == i) {
	    anInt3372 = class525_sub38.method16625((byte) 12) * -232113955;
	    anInt3373 = class525_sub38.method16625((byte) -41) * 507611605;
	    anInt3366 = class525_sub38.method16625((byte) 38) * -665832423;
	}
    }
    
    public void method54(int i, byte i_2_) {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(2039184822);
	    if (i == 0)
		break;
	    method5400(class525_sub38, i, 1811588942);
	}
    }
    
    public void method69() {
	/* empty */
    }
    
    Class301() {
	/* empty */
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    void method5401(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    anInt3367 = class525_sub38.readUnsignedShort((byte) 111) * 615388443;
	else if (i == 2)
	    aBool3369 = true;
	else if (3 == i) {
	    anInt3370 = class525_sub38.method16625((byte) -11) * 1159244991;
	    anInt3364 = class525_sub38.method16625((byte) -89) * 533453001;
	    anInt3368 = class525_sub38.method16625((byte) -32) * 1064179037;
	} else if (4 == i)
	    anInt3365 = class525_sub38.readUnsignedByte(440233112) * -1785915209;
	else if (i == 5)
	    anInt3371 = class525_sub38.readBigSmart(-2043778683) * -1448956551;
	else if (6 == i)
	    anInt3374 = class525_sub38.method16834(-1994884458) * -265663009;
	else if (7 == i) {
	    anInt3372 = class525_sub38.method16625((byte) -42) * -232113955;
	    anInt3373 = class525_sub38.method16625((byte) -10) * 507611605;
	    anInt3366 = class525_sub38.method16625((byte) 64) * -665832423;
	}
    }
    
    public static int method5402(CharSequence charsequence, int i) {
	int i_3_ = charsequence.length();
	int i_4_ = 0;
	for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
	    char c = charsequence.charAt(i_5_);
	    if (c <= '\u007f')
		i_4_++;
	    else if (c <= '\u07ff')
		i_4_ += 2;
	    else
		i_4_ += 3;
	}
	return i_4_;
    }
    
    static final void method5403(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1496264193 * client.anInt11254;
    }
    
    static final void method5404(int i, int i_6_, int i_7_) {
	Class98.anInt1200 = -1046245019 * i;
	Class98.anInt1201 = -671956915 * i_6_;
	Class98.aBool1202 = false;
	Class73.method1541(899428791);
    }
    
    public static final int method5405(long l, String string, byte i) {
	Random random = new Random();
	RSBuffer class525_sub38 = new RSBuffer(128);
	RSBuffer class525_sub38_8_ = new RSBuffer(128);
	int[] is = new int[4];
	is[0] = random.nextInt();
	is[1] = random.nextInt();
	is[2] = (int) (l >> 32);
	is[3] = (int) l;
	class525_sub38.method16735(10, -372736547);
	for (int i_9_ = 0; i_9_ < 4; i_9_++)
	    class525_sub38.method16605(random.nextInt(), -531770570);
	class525_sub38.method16605(is[0], -1002890214);
	class525_sub38.method16605(is[1], -1892753422);
	class525_sub38.method16609(l);
	class525_sub38.method16609(0L);
	for (int i_10_ = 0; i_10_ < 4; i_10_++)
	    class525_sub38.method16605(random.nextInt(), -770195501);
	class525_sub38.method16671(Class57.aBigInteger618,
				   Class57.aBigInteger619, (short) 12078);
	class525_sub38_8_.method16735(10, -938092349);
	for (int i_11_ = 0; i_11_ < 3; i_11_++)
	    class525_sub38_8_.method16605(random.nextInt(), -370488998);
	class525_sub38_8_.method16609(random.nextLong());
	class525_sub38_8_.method16601(random.nextLong());
	Class236.method4408(class525_sub38_8_, (byte) 89);
	class525_sub38_8_.method16609(random.nextLong());
	class525_sub38_8_.method16671(Class57.aBigInteger618,
				      Class57.aBigInteger619, (short) 13736);
	int i_12_ = Class161.method2628(string, 119075416);
	if (i_12_ % 8 != 0)
	    i_12_ += 8 - i_12_ % 8;
	RSBuffer class525_sub38_13_ = new RSBuffer(i_12_);
	class525_sub38_13_.method16700(string, 1114504721);
	class525_sub38_13_.pos = 339428471 * i_12_;
	class525_sub38_13_.method16726(is, (byte) -22);
	RSBuffer class525_sub38_14_
	    = new RSBuffer(-1133521593 * class525_sub38_13_.pos
				 + (class525_sub38_8_.pos * -1133521593
				    + (class525_sub38.pos * -1133521593
				       + 5)));
	class525_sub38_14_.method16735(2, -2063979628);
	class525_sub38_14_.method16735(class525_sub38.pos * -1133521593,
				       -1872570121);
	class525_sub38_14_.method16614(class525_sub38.buffer, 0,
				       class525_sub38.pos * -1133521593,
				       1261217782);
	class525_sub38_14_.method16735((-1133521593
					* class525_sub38_8_.pos),
				       -193415980);
	class525_sub38_14_.method16614(class525_sub38_8_.buffer, 0,
				       (-1133521593
					* class525_sub38_8_.pos),
				       -1134847209);
	class525_sub38_14_.method16602((-1133521593
					* class525_sub38_13_.pos),
				       1006905657);
	class525_sub38_14_.method16614(class525_sub38_13_.buffer, 0,
				       (class525_sub38_13_.pos
					* -1133521593),
				       1080485909);
	String string_15_
	    = Class564.method9452(class525_sub38_14_.buffer,
				  -325548399);
	int i_16_;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class620.method10183("services", false,
							-1472492750))
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
					 (Class3.method529(string_15_,
							   1552651121))
					 .append
					 ("&dest=").append
					 (Class3.method529("passwordchoice.ws",
							   1552651121))
					 .toString());
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    class525_sub38_14_ = new RSBuffer(new byte[1000]);
	    for (;;) {
		int i_17_
		    = inputstream.read(class525_sub38_14_.buffer,
				       (-1133521593
					* class525_sub38_14_.pos),
				       1000 - (class525_sub38_14_.pos
					       * -1133521593));
		if (i_17_ == -1)
		    break;
		class525_sub38_14_.pos += i_17_ * 339428471;
		if (-1133521593 * class525_sub38_14_.pos >= 1000)
		    return 5;
	    }
	    outputstreamwriter.close();
	    inputstream.close();
	    String string_18_ = new String(class525_sub38_14_.buffer);
	    if (string_18_.startsWith("OFFLINE"))
		return 4;
	    if (string_18_.startsWith("WRONG"))
		return 7;
	    if (string_18_.startsWith("RELOAD"))
		return 3;
	    if (string_18_
		    .startsWith("Not permitted for social network accounts."))
		return 6;
	    class525_sub38_14_.method16752(is, -2093736709);
	    for (/**/;
		 (-1133521593 * class525_sub38_14_.pos > 0
		  && (class525_sub38_14_.buffer
		      [-1133521593 * class525_sub38_14_.pos - 1]) == 0);
		 class525_sub38_14_.pos -= 339428471) {
		/* empty */
	    }
	    string_18_
		= new String(class525_sub38_14_.buffer, 0,
			     -1133521593 * class525_sub38_14_.pos);
	    if (Class213.method3941(string_18_, (byte) 1)) {
		Class299.method5393(string_18_, true, client.aBool11241,
				    -124741860);
		return 2;
	    }
	    i_16_ = 5;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return 5;
	}
	return i_16_;
    }
}
