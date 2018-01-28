package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test00()  throws Throwable  {

         GregorianCalendar cal = new GregorianCalendar(2000,01,01);
         CalDay calday1 = new CalDay(cal);

         int startHour=21;
         int startMinute=30;
         int startDay=15;
         int startMonth=01;
         int startYear=2018;
         String title="Birthday Party";
         String description="This is my birthday party.";
         //Construct a new Appointment object with the initial data
         Appt appt = new Appt(startHour,
                 startMinute ,
                 startDay ,
                 startMonth ,
                 startYear ,
                 title,
                 description);

         calday1.addAppt(appt);
         calday1.iterator();
	 }

	 @Test
    public void test01()  throws Throwable  {

        CalDay calday1 = new CalDay();
        calday1.iterator();
        calday1.toString();
    }

	 @Test
	  public void test02()  throws Throwable  {

	 	GregorianCalendar cal = new GregorianCalendar(2000,01,01);
	     CalDay calday1 = new CalDay(cal);

		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

         startHour=25;
         startMinute=30;
         startDay=15;
         startMonth=01;
         startYear=2018;
         title="Birthday Party";
         description="This is my birthday party.";
         //Construct a new Appointment object with the initial data
         Appt appt2 = new Appt(startHour,
                 startMinute ,
                 startDay ,
                 startMonth ,
                 startYear ,
                 title,
                 description);


         calday1.addAppt(appt);
         calday1.addAppt(appt2);
		 calday1.toString();
	 }

    @Test
    public void test03()  throws Throwable  {

        GregorianCalendar cal = new GregorianCalendar(2000,01,01);
        CalDay calday1 = new CalDay(cal);

        int startHour=-21;
        int startMinute=30;
        int startDay=15;
        int startMonth=01;
        int startYear=2018;
        String title="Birthday Party";
        String description="This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        calday1.addAppt(appt);
        calday1.toString();

        assertEquals(0, calday1.isValid());
    }

    @Test
    public void test04()  throws Throwable  {

        GregorianCalendar cal = new GregorianCalendar(2000,01,01);
        CalDay calday1 = new CalDay(cal);

        int startHour=22;
        int startMinute=30;
        int startDay=1;
        int startMonth=01;
        int startYear=2000;
        String title="Birthday Party";
        String description="This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        startHour=20;
        startMinute=30;
        startDay=1;
        startMonth=01;
        startYear=2000;
        title="Birthday Party";
        description="This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt2 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        startHour=19;
        startMinute=30;
        startDay=1;
        startMonth=01;
        startYear=2000;
        title="Birthday Party";
        description="This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt3 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        calday1.addAppt(appt);
        calday1.addAppt(appt2);
        calday1.addAppt(appt3);

        calday1.getSizeAppts();
    }
//add more unit tests as you needed	
}
