/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class SunDefinition implements Interface5 {
    public static int anInt3426;
    Class668 aClass668_3419;
    String[] aStringArray3420;
    JS5 aClass458_3421;
    Class200 aClass200_3422 = new Class200(50);
    Class200 aClass200_3423 = new Class200(5);
    int anInt3424;
    boolean aBool3425;

    SunDefinition(boolean bool, JS5 class458, Class666 class666,
                  Class668 class668) {
        aBool3425 = bool;
        aClass458_3421 = class458;
        aClass668_3419 = class668;
        if (Class668.aClass668_8576 == aClass668_3419)
            aStringArray3420
                    = new String[]{null, null, null, null, null,
                    Class53.aClass53_509.method1169(class666,
                            1552651121)};
        else
            aStringArray3420
                    = new String[]{null, null, null, null, null, null};
    }

    static int method5447(byte i) {
        if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722
                .method17240(-214580989)
                == 0) {
            for (int i_2_ = 0; i_2_ < 1230768119 * client.anInt11102; i_2_++) {
                if ((client.anInterface64Array11103[i_2_].method420((byte) 47)
                        == 's')
                        || client.anInterface64Array11103[i_2_]
                        .method420((byte) 83) == 'S') {
                    Class198_Sub13.aClass525_Sub30_9973.method16502
                            ((Class198_Sub13.aClass525_Sub30_9973
                                            .aClass696_Sub29_10722),
                                    1, (byte) -5);
                    client.aBool11333 = true;
                    Class217.method4141(Class68.aClass68_732, -2112986696);
                    break;
                }
            }
        }
        if (Class328.aClass303_3583 == Class303.aClass303_3386) {
            if (Class442.aClass459_4866 == null)
                Class442.aClass459_4866
                        = new Class459(Class94.aClass463_912,
                        Class198_Sub17.aClass470_9982,
                        Class526.aClass466_7131,
                        Class38.aBigInteger325,
                        Class38.aBigInteger327);
            if (!Class442.aClass459_4866.method7572((byte) 114))
                return 0;
            Class6.method557(0, null, true, (short) -15777);
            Class302.aBool3380 = !Class696_Sub38.method17317((byte) -81);
            Class328.aClass458_3577 = Class600.method9890((Class302.aBool3380 ? Class56.idx_34 : Class56.idx_32), false, 1, true, true, (byte) 1);
            Class653.aClass458_8393 = Class600.method9890(Class56.idx_33, false, 1, true, true, (byte) 1);
            Class276.aClass458_2875 = Class600.method9890(Class56.idx_13, false, 1, true, true, (byte) 1);
            Class18.idx_28 = Class600.method9890(Class56.idx_28, true, 1, true, true, (byte) 1);
        }
        if (Class303.aClass303_3382 == Class328.aClass303_3583) {
            boolean bool = Class653.aClass458_8393.method7481((short) 6401);
            boolean bool_3_ = Class18.idx_28.method7481((short) -19065);
            int i_4_ = Class652_Sub2.aClass454_Sub1Array10916
                    [Class56.idx_33.method1202(1643556766)]
                    .method16000((byte) 1);
            i_4_ = i_4_ + Class652_Sub2.aClass454_Sub1Array10916
                    [(Class302.aBool3380
                    ? Class56.idx_34.method1202(1111801225)
                    : Class56.idx_32.method1202(1332863881))]
                    .method16000((byte) 1);
            i_4_ += Class652_Sub2.aClass454_Sub1Array10916
                    [Class56.idx_13.method1202(119761101)]
                    .method16000((byte) 1);
            i_4_ = i_4_ + (bool_3_ ? 100
                    : Class18.idx_28.method7483((byte) 46));
            i_4_ = i_4_ + (bool ? 100
                    : Class653.aClass458_8393.method7483((byte) 37));
            if (i_4_ != 500)
                return i_4_ / 5;
            HashTable.aClass631_1641 = new Class631(Class18.idx_28);
            Class287.method5259(HashTable.aClass631_1641, 532428604);
            int i_5_ = Class198_Sub13.aClass525_Sub30_9973
                    .aClass696_Sub38_10721.method17314(1077572393);
            Class328.aClass91_3579
                    = new Class91(client.gametype, Class21.aClass666_213,
                    Class653.aClass458_8393);
            Class73[] class73s
                    = Class328.aClass91_3579.method1692(i_5_, 1413841153);
            if (0 == class73s.length)
                class73s = Class328.aClass91_3579.method1692(0, 1297755492);
            Class315 class315 = new Class315(Class328.aClass458_3577,
                    Class276.aClass458_2875);
            if (class73s.length > 0) {
                Class328.anInterface32Array3585
                        = new Interface32[class73s.length];
                for (int i_6_ = 0;
                     i_6_ < Class328.anInterface32Array3585.length; i_6_++)
                    Class328.anInterface32Array3585[i_6_]
                            = new Class293((Class328.aClass91_3579.method1690
                            (class73s[i_6_].anInt819 * -51016315,
                                    304193221)),
                            class73s[i_6_].anInt817 * 1859675235,
                            -189436045 * class73s[i_6_].anInt818,
                            class315);
            }
        }
        if (Class328.aClass303_3583 == Class303.aClass303_3383)
            Class7.aClass404_53
                    = new Class404(Class501.aClass182_5564,
                    Class328.aClass458_3577,
                    Class276.aClass458_2875,
                    Class525_Sub42.method16882((short) 1210));
        if (Class303.aClass303_3393 == Class328.aClass303_3583) {
            int i_7_ = Class7.aClass404_53.method6602(248115685);
            int i_8_ = Class7.aClass404_53.method6595(-1591047126);
            if (i_7_ < i_8_)
                return i_7_ * 100 / i_8_;
        }
        if (Class328.aClass303_3583 == Class303.aClass303_3398) {
            if (null != Class328.anInterface32Array3585
                    && Class328.anInterface32Array3585.length > 0) {
                if (Class328.anInterface32Array3585[0].method202(-1318175184)
                        < 100)
                    return 0;
                if (Class328.anInterface32Array3585.length > 1
                        && Class328.aClass91_3579.method1695(-527910033)
                        && Class328.anInterface32Array3585[1]
                        .method202(-1318175184) < 100)
                    return 0;
            }
            Class7.aClass404_53.method6581(client.anInterface50_11252,
                    (byte) 67);
            Class495.method8130(Class501.aClass182_5564, 534531211);
            Class441.method7119(5, 1033529003);
        }
        if (Class328.aClass303_3583 == Class303.aClass303_3402) {
            Class462.idx_8 = Class600.method9890(Class56.idx_8, false, 1, false, true, (byte) 1);
            Class163_Sub2.idx_0 = Class600.method9890(Class56.idx_0, false, 1, false, true, (byte) 1);
            Class629.idx_1 = Class600.method9890(Class56.idx_1, false, 1, false, true, (byte) 1);
            Class316.idx_2 = Class600.method9890(Class56.idx_2, false, 1, true, true, (byte) 1);
            Class555.idx_49 = Class600.method9890(Class56.idx_49, false, 1, true, true, (byte) 1);
            Class175_Sub4.idx_3 = Class600.method9890(Class56.idx_3, false, 1, true, true, (byte) 1);
            Class322.idx_5 = Class600.method9890(Class56.idx_5, true, 1, false, true, (byte) 1);
			WorldTile.idx_7 = Class600.method9890(Class56.idx_7, false, 1, false, true, (byte) 1);
            Class198_Sub19.idx_43 = Class600.method9890(Class56.idx_43, true, 1, false, true, (byte) 1);
            Class113.idx_44 = Class600.method9890(Class56.idx_44, true, 1, false, true, (byte) 1);
            Class110.idx_10 = Class600.method9890(Class56.idx_10, false, 1, false, true, (byte) 1);
            Class112.idx_12 = Class600.method9890(Class56.idx_12, false, 1, true, true, (byte) 1);
            Class307.idx_14 = Class600.method9890(Class56.idx_14, true, 1, false, false, (byte) 1);
            Class263.idx_40 = Class600.method9890(Class56.idx_40, true, 1, false, false, (byte) 1);
            Class27.idx_16 = Class600.method9890(Class56.idx_16, false, 1, true, true, (byte) 1);
            HashTable.idx_17 = Class600.method9890(Class56.idx_17, false, 1, true, true, (byte) 1);
            Class47.idx_18 = Class600.method9890(Class56.idx_18, false, 1, true, true, (byte) 1);
            Class198_Sub2.idx_19 = Class600.method9890(Class56.idx_19, false, 1, true, true, (byte) 1);
            Class297.idx_20 = Class600.method9890(Class56.idx_20, false, 1, true, true, (byte) 1);
            Class220.idx_21 = Class600.method9890(Class56.idx_21, false, 1, true, true, (byte) 1);
            Class350_Sub2.idx_22 = Class600.method9890(Class56.idx_22, false, 1, true, true, (byte) 1);
            ItemDefinitions.idx_23 = Class600.method9890(Class56.idx_23, true, 1, false, false, (byte) 1);
            Class597.idx_41 = Class600.method9890(Class56.idx_41, true, 1, false, true, (byte) 1);
            Class174.idx_24 = Class600.method9890(Class56.idx_24, false, 1, true, true, (byte) 1);
            Class427.idx_25 = Class600.method9890(Class56.idx_25, false, 1, true, true, (byte) 1);
            Class40_Sub22.idx_26 = Class600.method9890(Class56.idx_26, true, 1, true, true, (byte) 1);
            Class504.idx_27 = Class600.method9890(Class56.idx_27, false, 1, true, true, (byte) 1);
            Class198_Sub15.idx_29 = Class600.method9890(Class56.idx_29, false, 1, true, true, (byte) 1);
            Class656_Sub1_Sub3_Sub3.idx_35 = Class600.method9890(Class56.idx_35, true, 1, false, true, (byte) 1);
            Class566.idx_30 = Class600.method9890(Class56.idx_30, true, 1, false, true, (byte) 1);
            Class17_Sub1.idx_31 = Class600.method9890(Class56.idx_31, true, 1, true, true, (byte) 1);
        }
        if (Class328.aClass303_3583 == Class303.aClass303_3387) {
            int i_9_ = 0;
            int i_10_ = 0;
            for (int i_11_ = 0;
                 i_11_ < Class652_Sub2.aClass454_Sub1Array10916.length;
                 i_11_++) {
                if (null != Class652_Sub2.aClass454_Sub1Array10916[i_11_]) {
                    i_9_ += Class652_Sub2.aClass454_Sub1Array10916[i_11_]
                            .method16000((byte) 1);
                    i_10_++;
                }
            }
            if (i_10_ > 0)
                i_9_ /= i_10_;
            if (100 != i_9_) {
                if (Class328.anInt3586 * 1817240471 < 0)
                    Class328.anInt3586 = 509070375 * i_9_;
                return ((i_9_ - Class328.anInt3586 * 1817240471) * 100
                        / (100 - Class328.anInt3586 * 1817240471));
            }
            Class632.method10322(HashTable.aClass631_1641, (byte) 96);
            Class7.aClass404_53
                    = new Class404(Class501.aClass182_5564,
                    Class462.idx_8,
                    Class276.aClass458_2875,
                    Class525_Sub42.method16882((short) -15623));
        }
        if (Class328.aClass303_3583 == Class303.aClass303_3381) {
            byte[] is
                    = Class18.idx_28.getTextureData((Class638.aClass638_8309
                            .anInt8316) * 2028004077,
                    1541992473);
            if (is == null)
                return 0;
            Class40_Sub20.aClass217_11050 = new Class217();
            Class40_Sub20.aClass217_11050.method4027(50, 7340032, (byte) 94);
            Class704_Sub2.method17395(is, (byte) 15);
            Class441.method7119(19, 391827101);
        }
        if (Class303.aClass303_3389 == Class328.aClass303_3583
                && null == BillBoardConfig.aClass544_10064) {
            BillBoardConfig.aClass544_10064
                    = new Class544(Class566.idx_30);
            Class603.method9980(BillBoardConfig.aClass544_10064, (short) -29288);
        }
        if (Class328.aClass303_3583 == Class303.aClass303_3390) {
            int i_12_ = Class313.method5643(1298049481);
            if (i_12_ < 100)
                return i_12_;
            Class601.method9900
                    (Class18.idx_28.getTextureData(2028004077 * (Class638
                                    .aClass638_8308
                                    .anInt8316),
                            1403502772),
                            -1545204928);
            Class198_Sub18.aShortArrayArray9988
                    = HashTable.aClass631_1641.aShortArrayArray8182;
            Class525_Sub6.aShortArrayArrayArray10485
                    = HashTable.aClass631_1641.aShortArrayArrayArray8183;
            Class477.aShortArrayArray5199
                    = HashTable.aClass631_1641.aShortArrayArray8184;
            Class522_Sub1.aShortArrayArrayArray10395
                    = HashTable.aClass631_1641.aShortArrayArrayArray8186;
            if (-1085475287 * HashTable.aClass631_1641.anInt8190 != -1
                    && -1 != HashTable.aClass631_1641.anInt8209 * -1544174753) {
                client.anInt11223
                        = HashTable.aClass631_1641.anInt8190 * -1267057803;
                client.anInt11224
                        = -1878792483 * HashTable.aClass631_1641.anInt8209;
            }
            Class664.aClass634_8557 = new Class634(Class18.idx_28);
            Class91.aClass629_903 = new Class629(Class18.idx_28);
            Class525_Sub22_Sub1.aClass632_11646
                    = new Class632(Class18.idx_28);
            Class685.aClass630_8692 = new Class630(Class18.idx_28);
            Class556.aClass623_7468 = new Class623(Class18.idx_28);
        }
        if (Class303.aClass303_3384 == Class328.aClass303_3583) {
            if (1728284569 * HashTable.aClass631_1641.anInt8175 != -1 && !WorldTile.idx_7.method7478((HashTable.aClass631_1641.anInt8175) * 1728284569, 0, (short) 11968))
                return 99;
            TextureMetrics.aClass180_1835 = new Textures(Class40_Sub22.idx_26);
            Class411.anInterface24_4255 = new Class172_Sub1(Class198_Sub19.idx_43, Class113.idx_44);
            client.aClass40_Sub16_11201 = new Class40_Sub16(client.gametype, Class21.aClass666_213, Class316.idx_2);
            Class227.aClass40_Sub1_2345 = new Class40_Sub1(client.gametype, Class21.aClass666_213, Class316.idx_2);
            Class635.aClass40_Sub6_8274 = new Class40_Sub6(client.gametype, Class21.aClass666_213, Class316.idx_2, Class462.idx_8);
            Class486.aClass40_5240 = new Class40(client.gametype, Class21.aClass666_213, Class316.idx_2, Class663.aClass663_8516, 64, new Class45(com.jagex.Class14.class));
            Class685.aClass40_8690 = new Class40(client.gametype, Class21.aClass666_213, Class316.idx_2, Class663.aClass663_8515, 16, new Class45(com.jagex.Class82.class));
            Class525_Sub22.aClass40_Sub15_10585 = new Class40_Sub15(client.gametype, Class21.aClass666_213, HashTable.idx_17);
            Class232.aClass40_Sub18_2368 = new Class40_Sub18(client.gametype, Class21.aClass666_213, Class316.idx_2);
            Class198_Sub17.aClass40_Sub14_9981 = new Class40_Sub14(client.gametype, Class21.aClass666_213, Class316.idx_2);
            Class83.aClass40_Sub12_852 = new Class40_Sub12(client.gametype, Class21.aClass666_213, Class316.idx_2, Class462.idx_8);
            Class566.aClass40_Sub5_7605 = new Class40_Sub5(client.gametype, Class21.aClass666_213, Class316.idx_2, Class462.idx_8);
            Class38.aClass40_Sub9_328 = new Class40_Sub9(client.gametype, Class21.aClass666_213, Class316.idx_2, WorldTile.idx_7);
            Class612.aClass40_Sub19_8026 = new Class40_Sub19(client.gametype, Class21.aClass666_213, Class316.idx_2);
            client.aClass40_Sub21_11118 = new Class40_Sub21(client.gametype, Class21.aClass666_213, Class316.idx_2);
            Class642.aClass40_Sub11_8327 = new Class40_Sub11(client.gametype, Class21.aClass666_213, true, Class27.idx_16, WorldTile.idx_7);
            client.aClass507_11137.method8398(Class642.aClass40_Sub11_8327, 1804784598);
            Class45.aClass500_349.method8178(new Class40_Sub11(client.gametype, Class21.aClass666_213, true, Class27.idx_16, WorldTile.idx_7), 1934898791);
            Class698.aClass40_Sub2_8770 = new Class40_Sub2(client.gametype, Class21.aClass666_213, Class316.idx_2, Class462.idx_8);
            Class568.aClass40_Sub17_7627 = new Class40_Sub17(client.gametype, Class21.aClass666_213, Class316.idx_2, Class462.idx_8);
            Class168_Sub1.aClass40_Sub7_9112 = new Class40_Sub7(client.gametype, Class21.aClass666_213, true, Class47.idx_18, WorldTile.idx_7);
            Class313_Sub2.aClass40_Sub22_10106 = new Class40_Sub22(client.gametype, Class21.aClass666_213, true, client.aClass40_Sub16_11201, Class198_Sub2.idx_19, WorldTile.idx_7);
            Class249.aClass47_Sub1_2445 = new Class47_Sub1(client.gametype, Class21.aClass666_213, Class316.idx_2, true);
            Class163_Sub2.aClass40_Sub13_8989 = new Class40_Sub13(client.gametype, Class21.aClass666_213, Class316.idx_2);
            Class685.aClass40_Sub8_8691 = new Class40_Sub8(client.gametype, Class21.aClass666_213, Class297.idx_20, Class163_Sub2.idx_0, Class629.idx_1, Class163_Sub2.aClass40_Sub13_8989);
            Class658.aClass40_Sub3_8457 = new Class40_Sub3(client.gametype, Class21.aClass666_213, Class316.idx_2);
            Class539.aClass40_Sub4_7181 = new Class40_Sub4(client.gametype, Class21.aClass666_213, Class316.idx_2);
            Class574.aClass40_Sub20_7645 = new Class40_Sub20(client.gametype, Class21.aClass666_213, Class220.idx_21, WorldTile.idx_7);
            Class397.aClass47_Sub2_4113 = new Class47_Sub2(client.gametype, Class21.aClass666_213, Class350_Sub2.idx_22, true);
            Class198_Sub4.aClass106_Sub1_Sub2_9917 = new Class106_Sub1_Sub2(client.gametype, Class453.aClass453_4940, Class21.aClass666_213, Class316.idx_2);
            Class109.aClass106_Sub1_Sub1_1323 = new Class106_Sub1_Sub1(client.gametype, Class453.aClass453_4939, Class21.aClass666_213, Class316.idx_2);
            Class293.aClass106_Sub1_Sub2_3239 = new Class106_Sub1_Sub2(client.gametype, Class453.aClass453_4943, Class21.aClass666_213, Class316.idx_2);
            Class711.aClass106_Sub1_Sub2_8869 = new Class106_Sub1_Sub2(client.gametype, Class453.aClass453_4944, Class21.aClass666_213, Class316.idx_2);
            Class535.aClass106_Sub1_Sub2_7176 = new Class106_Sub1_Sub2(client.gametype, Class453.aClass453_4945, Class21.aClass666_213, Class316.idx_2);
            Class198_Sub20.aClass106_Sub1_Sub2_9998 = new Class106_Sub1_Sub2(client.gametype, Class453.aClass453_4947, Class21.aClass666_213, Class316.idx_2);
            Class234.aClass106_Sub1_Sub2_2373 = new Class106_Sub1_Sub2(client.gametype, Class453.aClass453_4948, Class21.aClass666_213, Class316.idx_2);
            Class144_Sub1.aMap9140 = Class390.method6474((new Class106_Sub1[]{(Class198_Sub4.aClass106_Sub1_Sub2_9917), Class109.aClass106_Sub1_Sub1_1323, Class293.aClass106_Sub1_Sub2_3239, Class711.aClass106_Sub1_Sub2_8869, Class535.aClass106_Sub1_Sub2_7176, (Class198_Sub20.aClass106_Sub1_Sub2_9998), Class234.aClass106_Sub1_Sub2_2373}), 2127167035);
            Class575.aClass40_Sub10_7647 = new Class40_Sub10(client.gametype, Class21.aClass666_213, Class316.idx_2, Class144_Sub1.aMap9140);
            Class607.anInterface20_7975 = new Class306();
            Class648.method10704(Class175_Sub4.idx_3, WorldTile.idx_7, Class462.idx_8, Class276.aClass458_2875, 1172833940);
            Class628.aClass385_8157 = new Class385(Class198_Sub15.idx_29);
            Class450.aClass400_4926 = new Class400(Class504.idx_27);
            Class263.aClass402_2799 = new Class402(Class504.idx_27);
            Class562.aClass471_7557 = new Class471(Class21.aClass666_213, Class174.idx_24, Class427.idx_25);
            Class215.aClass58_2283 = new ConfigEntry(Class21.aClass666_213, Class174.idx_24, Class427.idx_25, new Class386());
            Class532.aClass111_7170 = new Class111(Class109.aClass106_Sub1_Sub1_1323, Class575.aClass40_Sub10_7647, Class91.aClass629_903.method10288(102642758));
            Class424.method6769(-1852050786);
            Class46.method1093(Class685.aClass40_Sub8_8691, 65535);
            Class198_Sub14.method15653(Class263.aClass402_2799, Class450.aClass400_4926, -1573360652);
            Class164.method2664(WorldTile.idx_7, TextureMetrics.aClass180_1835, Class411.anInterface24_4255, (byte) 6);
            Class279 class279 = new Class279(Class110.idx_10.method7495("huffman", "", 427054033));
            Class493.method7998(class279, 1600987365);
            Class19.aClass511_206 = Class567.method9490(-28415824);
            Class31.aClass525_Sub36_305 = new Class525_Sub36(true);
        }
        if (Class303.aClass303_3392 == Class328.aClass303_3583) {
            int i_13_
                    = (Class451.method7339(Class462.idx_8, 113172043)
                    + Class7.aClass404_53.method6577(true, -2116632812));
            int i_14_ = (Class87.method1659(536681936)
                    + Class7.aClass404_53.method6595(-1591047126));
            if (i_13_ < i_14_)
                return i_13_ * 100 / i_14_;
        }
        if (Class303.aClass303_3400 == Class328.aClass303_3583)
            Class556.method9244(ItemDefinitions.idx_23, Class597.idx_41,
                    Class232.aClass40_Sub18_2368,
                    Class198_Sub17.aClass40_Sub14_9981,
                    client.aClass507_11137.method8362((byte) -1),
                    Class698.aClass40_Sub2_8770,
                    Class568.aClass40_Sub17_7627,
                    Class532.aClass111_7170,
                    Class532.aClass111_7170);
        if (Class303.aClass303_3394 == Class328.aClass303_3583) {
            Class309.aClass144_Sub1_3465
                    = new Class144_Sub1(Class198_Sub4.aClass106_Sub1_Sub2_9917);
            Class407.method6637((byte) 0);
            Class424.aClass52_4742 = Class238.method4416((byte) -30);
            Class322.idx_5.method7547(false, true, -1802097336);
            Class462.idx_8.method7547(true, true, 501434857);
            Class276.aClass458_2875.method7547(true, true, 380239990);
            Class110.idx_10.method7547(true, true, -2142687071);
            client.aBool11199 = true;
        }
        if (Class328.aClass303_3583 == Class303.aClass303_3395
                && -1 != 1089481059 * HashTable.aClass631_1641.anInt8176) {
            if (!Class165.method2667((HashTable.aClass631_1641.anInt8176
                            * 1089481059),
                    null, 995266580))
                return 0;
            boolean bool = true;
            for (int i_15_ = 0;
                 i_15_ < (Class162.aClass245Array1764
                         [HashTable.aClass631_1641.anInt8176 * 1089481059]
                         .aClass259Array2426).length;
                 i_15_++) {
                Class259 class259
                        = (Class162.aClass245Array1764
                        [1089481059 * HashTable.aClass631_1641.anInt8176]
                        .aClass259Array2426[i_15_]);
                if (5 == 2010235789 * class259.anInt2590
                        && class259.anInt2621 * 1940882535 != -1
                        && !Class462.idx_8.method7478((class259.anInt2621
                                * 1940882535),
                        0, (short) 15732))
                    bool = false;
            }
            if (!bool)
                return 0;
        }
        if (Class303.aClass303_3396 == Class328.aClass303_3583)
            Class335.method5858(true, (byte) -17);
        if (Class303.aClass303_3397 == Class328.aClass303_3583) {
            Class159.aClass295_1755.method5346((byte) 1);
            try {
                Class328.aThread3581.join();
            } catch (InterruptedException interruptedexception) {
                return 0;
            }
            Class159.aClass295_1755 = null;
            Class328.aThread3581 = null;
            Class328.aClass458_3577 = null;
            Class653.aClass458_8393 = null;
            Class328.aClass91_3579 = null;
            Class328.anInterface32Array3585 = null;
            EmitterConfig.aMap11727.remove(Class56.idx_33);
            EmitterConfig.aMap11727.remove(Class56.idx_32);
            EmitterConfig.aMap11727.remove(Class56.idx_34);
            Class519.method8661((byte) 0);
            client.aBool11063
                    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722
                    .method17240(1368129845) == 1;
            Class198_Sub13.aClass525_Sub30_9973.method16502
                    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722, 1,
                            (byte) -56);
            if (client.aBool11063)
                Class198_Sub13.aClass525_Sub30_9973.method16502
                        (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701,
                                0, (byte) -24);
            else if ((Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701
                    .aBool10927)
                    && (-1113722213 * Class31.aClass525_Sub36_305.anInt10806
                    < 512)
                    && (Class31.aClass525_Sub36_305.anInt10806 * -1113722213
                    != 0))
                Class198_Sub13.aClass525_Sub30_9973.method16502
                        (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701,
                                0, (byte) -62);
            Class650.method10715(-1758466106);
            if (client.aBool11063) {
                Class217.method4146(0, false, (byte) -16);
                if (!client.aBool11333)
                    Class217.method4141(Class68.aClass68_723, -2048708208);
            } else {
                Class217.method4146(Class198_Sub13.aClass525_Sub30_9973
                                .aClass696_Sub20_10701
                                .method17160(-1663112195),
                        false, (byte) -16);
                if (Class198_Sub13.aClass525_Sub30_9973
                        .aClass696_Sub20_10701.method17160(-248093237)
                        == 0)
                    Class217.method4141(Class68.aClass68_727, -1939266150);
            }
            Class332_Sub1.method15672(Class198_Sub13.aClass525_Sub30_9973
                            .aClass696_Sub41_10704
                            .method17337(86412923),
                    -1, -1, false, (byte) 8);
            Class7.aClass404_53.method6581(client.anInterface50_11252,
                    (byte) 114);
            Class495.method8130(Class501.aClass182_5564, 534531211);
            Class62.method1376(Class501.aClass182_5564,
                    Class462.idx_8, (short) 7307);
        }
        return Class241.method4438(1315849497);
    }

    static final void method5448(Class683 class683, byte i) {
        class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
                - 1)]
                = -1;
    }

    public static int method5449(Class429 class429, int i) {
        Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
        class446.method7239(class429);
        double d = Math.atan2(class446.aFloat4895,
				class446.aFloat4897);
        class446.method7260();
        if (d < 0.0)
            d = 3.141592653589793 + (d + 3.141592653589793);
        return (int) (16384.0 * (d / 6.283185307179586)) & 0x3fff;
    }

    static final void method5450(Class683 class683, short i) {
        String string
                = (String) (class683.anObjectArray8636
                [(class683.anInt8644 -= 1285561025) * 1373599041]);
        Class583.method9635(string, (short) 3405);
    }

    void method5435(int i) {
        synchronized (aClass200_3422) {
            aClass200_3422.method3809((byte) 46);
        }
        synchronized (aClass200_3423) {
            aClass200_3423.method3809((byte) 62);
        }
    }

    void method5436(boolean bool, int i) {
        if (bool != aBool3425) {
            aBool3425 = bool;
            method5444(1211722714);
        }
    }

    void method5437(int i, short i_0_) {
        anInt3424 = i * -650563835;
        synchronized (aClass200_3422) {
            aClass200_3422.method3791((byte) 3);
        }
        synchronized (aClass200_3423) {
            aClass200_3423.method3791((byte) -105);
        }
    }

    void method5439(int i, int i_1_) {
        synchronized (aClass200_3422) {
            aClass200_3422.method3805(i, 1890145491);
        }
        synchronized (aClass200_3423) {
            aClass200_3423.method3805(i, 2008881140);
        }
    }

    void method5444(int i) {
        synchronized (aClass200_3422) {
            aClass200_3422.method3791((byte) 14);
        }
        synchronized (aClass200_3423) {
            aClass200_3423.method3791((byte) 12);
        }
    }

}
