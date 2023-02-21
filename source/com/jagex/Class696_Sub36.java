/* Class696_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class696_Sub36 extends Class696
{
    public static final int anInt10977 = 1;
    public static final int anInt10978 = 0;
    
    public boolean method17292(int i) {
	return true;
    }
    
    public Class696_Sub36(int i, Class525_Sub30 class525_sub30) {
	super(i, class525_sub30);
    }
    
    public void method17293(int i) {
	if (anInt8760 * -1757849351 != 1 && -1757849351 * anInt8760 != 0)
	    anInt8760 = method14168(-298975594) * 1908664649;
    }
    
    public Class696_Sub36(Class525_Sub30 class525_sub30) {
	super(class525_sub30);
    }
    
    public int method17294(int i) {
	return anInt8760 * -1757849351;
    }
    
    public int method14167(int i, byte i_0_) {
	return 1;
    }
    
    void method14169(int i, int i_1_) {
	anInt8760 = 1908664649 * i;
    }
    
    int method14168(int i) {
	return 1;
    }
    
    int method14175() {
	return 1;
    }
    
    public boolean method17295() {
	return true;
    }
    
    void method14173(int i) {
	anInt8760 = 1908664649 * i;
    }
    
    void method14174(int i) {
	anInt8760 = 1908664649 * i;
    }
    
    public void method17296() {
	if (anInt8760 * -1757849351 != 1 && -1757849351 * anInt8760 != 0)
	    anInt8760 = method14168(-617293466) * 1908664649;
    }
    
    public void method17297() {
	if (anInt8760 * -1757849351 != 1 && -1757849351 * anInt8760 != 0)
	    anInt8760 = method14168(262928324) * 1908664649;
    }
    
    public int method14172(int i) {
	return 1;
    }
    
    public void method17298() {
	if (anInt8760 * -1757849351 != 1 && -1757849351 * anInt8760 != 0)
	    anInt8760 = method14168(1898101787) * 1908664649;
    }
    
    public int method17299() {
	return anInt8760 * -1757849351;
    }
    
    public int method17300() {
	return anInt8760 * -1757849351;
    }
    
    public static long method17301(int i) {
	long l;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class620.method10183("services", false,
							1910233736))
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
		int i_2_
		    = inputstream.read(class525_sub38.buffer,
				       class525_sub38.pos * -1133521593,
				       1000 - (class525_sub38.pos
					       * -1133521593));
		if (-1 == i_2_)
		    break;
		class525_sub38.pos += 339428471 * i_2_;
		if (-1133521593 * class525_sub38.pos >= 1000)
		    return 0L;
	    }
	    class525_sub38.pos = 0;
	    long l_3_ = class525_sub38.method16603(-1861208696);
	    l = l_3_;
	} catch (Exception exception) {
	    return 0L;
	}
	return l;
    }
}
