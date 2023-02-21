/* Class445 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class445
{
    public float[] aFloatArray4891 = new float[9];
    
    public Class429 method7202() {
	Class429 class429 = new Class429();
	double d = (double) (1.0F + aFloatArray4891[0] + aFloatArray4891[4]
			     + aFloatArray4891[8]);
	if (d > 1.0E-8) {
	    float f = (float) (Math.sqrt(d) * 2.0);
	    class429.aFloat4812
		= (aFloatArray4891[7] - aFloatArray4891[5]) / f;
	    class429.aFloat4811
		= (aFloatArray4891[2] - aFloatArray4891[6]) / f;
	    class429.aFloat4813
		= (aFloatArray4891[3] - aFloatArray4891[1]) / f;
	    class429.aFloat4815 = 0.25F * f;
	} else if (aFloatArray4891[0] > aFloatArray4891[4]
		   && aFloatArray4891[0] > aFloatArray4891[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4891[0]
						   - aFloatArray4891[4]
						   - aFloatArray4891[8]))
			       * 2.0);
	    class429.aFloat4812 = 0.25F * f;
	    class429.aFloat4811
		= (aFloatArray4891[3] + aFloatArray4891[1]) / f;
	    class429.aFloat4813
		= (aFloatArray4891[2] + aFloatArray4891[6]) / f;
	    class429.aFloat4815
		= (aFloatArray4891[7] - aFloatArray4891[5]) / f;
	} else if (aFloatArray4891[4] > aFloatArray4891[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4891[4]
						   - aFloatArray4891[0]
						   - aFloatArray4891[8]))
			       * 2.0);
	    class429.aFloat4812
		= (aFloatArray4891[3] + aFloatArray4891[1]) / f;
	    class429.aFloat4811 = 0.25F * f;
	    class429.aFloat4813
		= (aFloatArray4891[7] + aFloatArray4891[5]) / f;
	    class429.aFloat4815
		= (aFloatArray4891[2] - aFloatArray4891[6]) / f;
	} else {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4891[8]
						   - aFloatArray4891[0]
						   - aFloatArray4891[4]))
			       * 2.0);
	    class429.aFloat4812
		= (aFloatArray4891[2] + aFloatArray4891[6]) / f;
	    class429.aFloat4811
		= (aFloatArray4891[7] + aFloatArray4891[5]) / f;
	    class429.aFloat4813 = 0.25F * f;
	    class429.aFloat4815
		= (aFloatArray4891[3] - aFloatArray4891[1]) / f;
	}
	return class429;
    }
    
    void method7203() {
	aFloatArray4891[0] = 1.0F;
	aFloatArray4891[1] = 0.0F;
	aFloatArray4891[2] = 0.0F;
	aFloatArray4891[3] = 0.0F;
	aFloatArray4891[4] = 1.0F;
	aFloatArray4891[5] = 0.0F;
	aFloatArray4891[6] = 0.0F;
	aFloatArray4891[7] = 0.0F;
	aFloatArray4891[8] = 1.0F;
    }
    
    public Class445() {
	method7203();
    }
    
    public Class429 method7204() {
	Class429 class429 = new Class429();
	double d = (double) (1.0F + aFloatArray4891[0] + aFloatArray4891[4]
			     + aFloatArray4891[8]);
	if (d > 1.0E-8) {
	    float f = (float) (Math.sqrt(d) * 2.0);
	    class429.aFloat4812
		= (aFloatArray4891[7] - aFloatArray4891[5]) / f;
	    class429.aFloat4811
		= (aFloatArray4891[2] - aFloatArray4891[6]) / f;
	    class429.aFloat4813
		= (aFloatArray4891[3] - aFloatArray4891[1]) / f;
	    class429.aFloat4815 = 0.25F * f;
	} else if (aFloatArray4891[0] > aFloatArray4891[4]
		   && aFloatArray4891[0] > aFloatArray4891[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4891[0]
						   - aFloatArray4891[4]
						   - aFloatArray4891[8]))
			       * 2.0);
	    class429.aFloat4812 = 0.25F * f;
	    class429.aFloat4811
		= (aFloatArray4891[3] + aFloatArray4891[1]) / f;
	    class429.aFloat4813
		= (aFloatArray4891[2] + aFloatArray4891[6]) / f;
	    class429.aFloat4815
		= (aFloatArray4891[7] - aFloatArray4891[5]) / f;
	} else if (aFloatArray4891[4] > aFloatArray4891[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4891[4]
						   - aFloatArray4891[0]
						   - aFloatArray4891[8]))
			       * 2.0);
	    class429.aFloat4812
		= (aFloatArray4891[3] + aFloatArray4891[1]) / f;
	    class429.aFloat4811 = 0.25F * f;
	    class429.aFloat4813
		= (aFloatArray4891[7] + aFloatArray4891[5]) / f;
	    class429.aFloat4815
		= (aFloatArray4891[2] - aFloatArray4891[6]) / f;
	} else {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4891[8]
						   - aFloatArray4891[0]
						   - aFloatArray4891[4]))
			       * 2.0);
	    class429.aFloat4812
		= (aFloatArray4891[2] + aFloatArray4891[6]) / f;
	    class429.aFloat4811
		= (aFloatArray4891[7] + aFloatArray4891[5]) / f;
	    class429.aFloat4813 = 0.25F * f;
	    class429.aFloat4815
		= (aFloatArray4891[3] - aFloatArray4891[1]) / f;
	}
	return class429;
    }
    
    void method7205() {
	aFloatArray4891[0] = 1.0F;
	aFloatArray4891[1] = 0.0F;
	aFloatArray4891[2] = 0.0F;
	aFloatArray4891[3] = 0.0F;
	aFloatArray4891[4] = 1.0F;
	aFloatArray4891[5] = 0.0F;
	aFloatArray4891[6] = 0.0F;
	aFloatArray4891[7] = 0.0F;
	aFloatArray4891[8] = 1.0F;
    }
}
