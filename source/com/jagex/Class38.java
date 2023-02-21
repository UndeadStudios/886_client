/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.math.BigInteger;

public class Class38
{
    static BigInteger aBigInteger324;
    public static BigInteger aBigInteger325;
    static BigInteger aBigInteger326 = new BigInteger("10001", 16);
    public static BigInteger aBigInteger327;
    public static Class40_Sub9 aClass40_Sub9_328;
    
    Class38() throws Throwable {
	throw new Error();
    }
    
    static {
	aBigInteger324
	    = (new BigInteger
	       ("b391d855612cea0dbca3757a7daff4ecd6e60cd847299a46856a7eb1529c2a251d94d3b00f1edb4a870404536f42ca705ba593e28a7edb1fd03aa080b5fb376c999ae2049970af8eb1c9b9a0d3f6cda3276858c72c070e77b5994bc9927d3f14dfab37e13944cb0f6aeef8b8bd7a4fea76415cfb05c3d050657c755d012b4065",
		16));
	aBigInteger325 = new BigInteger("10001", 16);
	aBigInteger327
	    = (new BigInteger
	       ("a948f52e05941a970b6352f3d01cf09b06f996336f9df9d46c882f66afbf010ea9623860561c3fb63b435701bd8e46d532431acb415e64527b99605d986fff2f792e6a5c3acf2f34d71ee278f7f2d4b3fc9db0fa7e2b570e580bbac6cc1f28d5a4cc19dcde670e38a721c962ed0bf51a1282a6f7c1a76f546084cf9c50fdfbb3e1f14f7d7ca4eb1107b52f6bbe3d898c3a1a3da7d9fa667188694645785441ec987499d364b9fa621188626393cb17e553cadcb77b4a836d54b8130f8d432cd90fb520200308bb56eeeba149c1d5c0ee4a4234296aefae3344ac424cea77ee79d0f4405d3f9012907e1977c4501cd64d0b18ea8d8fd1b959546c24652a4cae807a8e3dba660f2d00b34bff747b27a3f384cc4fa83e7a486201cdb3e30dd37c267f23306fba2e1a6946f74f97151aeada1e0b36e4343c7cd6da7e688b2cc43014373ea67c85482091bdd7154628505aec67a45eaac4b92dd4b2632f862567dce2d3e095365bcf6afc21d61ab10ebb8c555fc860e2398f181d36eb65fb87205e827db83f1295ceb374d9a81e3a8f90c45fe7d440cfa183e9806e01cd58217981c6a8dfae72eb6f9587572c022e890cc6db9bed46e76f87739f895780cc8dcd2c1d473f9f9ba29dc054497e063842ecf5185a5ffa8e5263dba733df5b79cc612b3f96efdaa41d606879612f27c47a60de88423578ac188b46ba1d35604c8b45c335",
		16));
	new BigInteger("10001", 16);
	new BigInteger
	    ("8e577968dd1d3fbc7c0d0a0540a5c243820e8492168e1ee02ad00f459c166bfaa5778ec1b398edb661685061cfd70c0d29b35c4c878042987707ad75217c7679",
	     16);
    }
    
    static void method1004(Class683 class683, byte i) {
	class683.anIntArray8661[class683.anInt8662 * 501271953 - 1]
	    = (((Class269)
		Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						      [((501271953
							 * class683.anInt8662)
							- 1)]),
						     -436177858)).anInt2823
	       * 1578208537);
    }
    
    public static final void method1005(byte i) {
	if (!client.aBool11181) {
	    client.aFloat11172 += (24.0F - client.aFloat11172) / 2.0F;
	    client.aBool11364 = true;
	    client.aBool11181 = true;
	}
    }
}
