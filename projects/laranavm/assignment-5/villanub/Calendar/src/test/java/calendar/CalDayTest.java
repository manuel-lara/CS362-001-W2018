package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

    @Test
    public void test00() throws Throwable {

        GregorianCalendar cal = new GregorianCalendar(2000, 01, 01);
        CalDay calday1 = new CalDay(cal);

        int startHour = 21;
        int startMinute = 30;
        int startDay = 15;
        int startMonth = 01;
        int startYear = 2018;
        String title = "Birthday Party";
        String description = "This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        assertEquals(true, appt.getValid());

        calday1.addAppt(appt);
        assertNotNull(calday1.iterator());
        assertEquals(15, appt.getStartDay());
        assertEquals(1, appt.getStartMonth());
        assertEquals(2018, appt.getStartYear());
    }

    @Test
    public void test01() throws Throwable {

        CalDay calday1 = new CalDay();
        calday1.toString();
        assertEquals("", calday1.toString());
        assertNull(calday1.iterator());
    }

    @Test
    public void test02() throws Throwable {

        GregorianCalendar cal = new GregorianCalendar(2000, 01, 01);

        CalDay calday1 = new CalDay(cal);

        assertEquals(1, calday1.getDay());
        assertEquals(1, calday1.getMonth());
        assertEquals(2000, calday1.getYear());

        int startHour = 21;
        int startMinute = 30;
        int startDay = 15;
        int startMonth = 01;
        int startYear = 2018;
        String title = "Birthday Party";
        String description = "This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        startHour = 25;
        startMinute = 30;
        startDay = 15;
        startMonth = 01;
        startYear = 2018;
        title = "Birthday Party";
        description = "This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt2 = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);


        calday1.addAppt(appt);
        calday1.addAppt(appt2);
    }

    @Test
    public void test03() throws Throwable {

        GregorianCalendar cal = new GregorianCalendar(2000, 01, 01);
        CalDay calday1 = new CalDay(cal);

        int startHour = -21;
        int startMinute = 30;
        int startDay = 15;
        int startMonth = 01;
        int startYear = 2018;
        String title = "Birthday Party";
        String description = "This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        calday1.addAppt(appt);
        calday1.toString();

    }

    @Test
    public void test04() throws Throwable {

        GregorianCalendar cal = new GregorianCalendar(2000, 01, 01);
        CalDay calday1 = new CalDay(cal);

        int startHour = 20;
        int startMinute = 30;
        int startDay = 1;
        int startMonth = 01;
        int startYear = 2000;
        String title = "Birthday Party";
        String description = "This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        startHour = 20;
        startMinute = 30;
        startDay = 1;
        startMonth = 01;
        startYear = 2000;
        title = "Birthday Party";
        description = "This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt2 = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        startHour = 19;
        startMinute = 30;
        startDay = 1;
        startMonth = 01;
        startYear = 2000;
        title = "Birthday Party";
        description = "This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt3 = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description);

        calday1.addAppt(appt);
        assertEquals(appt, calday1.getAppts().get(0));
        calday1.addAppt(appt2);
        assertEquals(appt, calday1.getAppts().get(0));
        calday1.addAppt(appt3);
        assertEquals(appt3, calday1.getAppts().get(0));

        assertEquals(3, calday1.getSizeAppts());
    }
//add more unit tests as you needed
}
