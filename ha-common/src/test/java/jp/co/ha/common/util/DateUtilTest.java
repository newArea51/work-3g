package jp.co.ha.common.util;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import jp.co.ha.common.BaseCommonTest;

/**
 * {@link DateUtil} のjUnit
 *
 * @version 1.0.0
 */
public class DateUtilTest extends BaseCommonTest {

    /**
     * {@link DateUtil#toDate}
     */
    @Test
    public void toDateTest() {
        {
            Date date = DateUtil.toDate("hoge");
            assertEquals(null, date);
        }
        {
            Date date1 = DateUtil.toDate("2000/01/01 12:34:56");
            Date date2 = DateUtil.toDate("2000/01/01 12:34:56");
            assertEquals(date1, date2);
        }
        {
            Date date1 = DateUtil.toDate("2000/01/01 12:34:56");
            Date date2 = DateUtil.toDate("2000/01/01 12:34:57");
            assertNotEquals(date1, date2);
        }
    }

    /**
     * {@link DateUtil#isBefore}
     */
    @Test
    public void isBeforeTest() {
        {
            Date before = DateUtil.toDate("2000/01/01 12:34:56");
            Date after = DateUtil.toDate("2000/01/01 12:34:57");
            assertEquals(DateUtil.isBefore(before, after, false), true);
        }
        {
            Date before = DateUtil.toDate("2000/01/01 12:34:56");
            Date after = DateUtil.toDate("2000/01/01 12:34:56");
            assertEquals(DateUtil.isBefore(before, after, true), true);
        }
        {
            Date before = DateUtil.toDate("2000/01/01 12:34:57");
            Date after = DateUtil.toDate("2000/01/01 12:34:56");
            assertEquals(DateUtil.isBefore(before, after, false), false);
        }
    }

    /**
     * {@link DateUtil#isAfter}
     */
    @Test
    public void isAfterTest() {
        {
            Date before = DateUtil.toDate("2000/01/01 12:34:56");
            Date after = DateUtil.toDate("2000/01/01 12:34:57");
            assertEquals(DateUtil.isAfter(before, after, false), false);
        }
        {
            Date before = DateUtil.toDate("2000/01/01 12:34:56");
            Date after = DateUtil.toDate("2000/01/01 12:34:56");
            assertEquals(DateUtil.isAfter(before, after, true), true);
        }
        {
            Date before = DateUtil.toDate("2000/01/01 12:34:57");
            Date after = DateUtil.toDate("2000/01/01 12:34:56");
            assertEquals(DateUtil.isAfter(before, after, false), true);
        }
    }

    /**
     * {@link DateUtil#isSameDate}
     */
    @Test
    public void isSameDateTest() {
        {
            Date before = DateUtil.toDate("2000/01/01 12:34:56");
            Date after = DateUtil.toDate("2000/01/01 12:34:56");
            assertEquals(DateUtil.isSameDate(before, after), true);
        }
        {
            Date before = DateUtil.toDate("2000/01/01 12:34:56");
            Date after = DateUtil.toDate("2000/01/01 12:34:57");
            assertEquals(DateUtil.isSameDate(before, after), false);
        }
    }

    /**
     * {@link DateUtil#isBetWeenDate}
     */
    @Test
    public void isBetWeenDateTest() {
        {
            Date startDate = DateUtil.toDate("2000/01/01 12:34:55");
            Date target = DateUtil.toDate("2000/01/01 12:34:56");
            Date endDate = DateUtil.toDate("2000/01/01 12:34:57");
            assertEquals(DateUtil.isBetWeenDate(startDate, target, endDate), true);
        }
        {
            Date startDate = DateUtil.toDate("2000/01/01 12:34:55");
            Date target = DateUtil.toDate("2000/01/01 12:34:56");
            Date endDate = DateUtil.toDate("2000/01/01 12:34:57");
            assertEquals(DateUtil.isBetWeenDate(endDate, target, startDate), false);
        }

    }

    /**
     * {@link DateUtil#toStartDate}
     */
    @Test
    public void toStartDateTest() {
        {
            Date date1 = DateUtil.toDate("2000/01/01 00:00:00");
            Date date2 = DateUtil.toStartDate(DateUtil.toDate("2000/01/01 12:34:56"));
            assertEquals(date1, date2);
        }
    }

    /**
     * {@link DateUtil#toEndDate}
     */
    @Test
    public void toEndDateTest() {
        {
            Date date1 = DateUtil.toDate("2000/01/01 23:59:59");
            Date date2 = DateUtil.toEndDate(DateUtil.toDate("2000/01/01 12:34:56"));
            assertEquals(date1, date2);
        }
    }
}
