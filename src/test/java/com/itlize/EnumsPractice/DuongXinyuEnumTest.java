package com.itlize.EnumsPractice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yang on 02/4/20.
 */
public class DuongXinyuEnumTest {
    @Test
    public void testDuongName() {
        // Given
        DuongXingyuEnum Duong = DuongXingyuEnum.Duong;
        String expected = "Duong";

        // When
        String actual = Duong.name();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXingyuName() {
        // Given
        DuongXingyuEnum Xinyu = DuongXingyuEnum.Xingyu;
        String expected = "Xingyu";

        // When
        String actual = Xinyu.name();

        // Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testDuongCatchPhrase() {
        // Given
        DuongXingyuEnum Duong = DuongXingyuEnum.Duong;
        String expected = "Hey, my name is Duong!";

        // When
        String actual = Duong.getCatchPhrase();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testXingyuCatchPhrase() {
        // Given
        DuongXingyuEnum Xingyu = DuongXingyuEnum.Xingyu;
        String expected = "Hey, my name is Xingyu!";

        // When
        String actual = Xingyu.getCatchPhrase();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDuongIsDuong() {
        // Given
        DuongXingyuEnum Duong = DuongXingyuEnum.Duong;

        // When
        boolean outcome = Duong.isDuong();

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void testDuongIsXingyu() {
        // Given
        DuongXingyuEnum Duong = DuongXingyuEnum.Duong;

        // When
        boolean outcome = Duong.isXingyu();

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void testXingyuIsXinyu() {
        // Given
        DuongXingyuEnum Xingyu = DuongXingyuEnum.Xingyu;

        // When
        boolean outcome = Xingyu.isXingyu();

        // Then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testXingyuIsDuong() {
        // Given
        DuongXingyuEnum Xingyu = DuongXingyuEnum.Xingyu;

        // When
        boolean outcome = Xingyu.isDuong();

        // Then
        Assert.assertFalse(outcome);
    }


}
