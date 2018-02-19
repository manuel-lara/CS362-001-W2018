package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {

	 	TimeTable tt = new TimeTable();
	 	LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	 }

	 @Test
	  public void test02()  throws Throwable  {

         int startHour=1;
         int startMinute=1;
         int startDay=1;
         int startMonth=1;
         int startYear=1;
         String title="title";
         String description="desc";
         //Construct a new Appointment object with the initial data
         Appt appt = new Appt(startHour,
                 startMinute ,
                 startDay ,
                 startMonth ,
                 startYear ,
                 title,
                 description);

         GregorianCalendar today = new GregorianCalendar(0001,1,1);
         GregorianCalendar tomorrow = new GregorianCalendar(0001,1,2);;

         TimeTable tt = new TimeTable();
         LinkedList<CalDay> calDays = new LinkedList<CalDay>();
         LinkedList<Appt> listAppts = new LinkedList<Appt>();

         listAppts.add(appt);

         calDays = tt.getApptRange(listAppts, today, tomorrow);

	 }

	 @Test
    public void test03() throws Throwable {

         int startHour=1;
         int startMinute=1;
         int startDay=1;
         int startMonth=1;
         int startYear=1;
         String title="title";
         String description="desc";
         //Construct a new Appointment object with the initial data
         Appt appt = new Appt(startHour,
                 startMinute ,
                 startDay ,
                 startMonth ,
                 startYear ,
                 title,
                 description);

         GregorianCalendar today = new GregorianCalendar(0001,1,2);
         GregorianCalendar tomorrow = new GregorianCalendar(0001,1,1);;

         TimeTable tt = new TimeTable();
         LinkedList<CalDay> calDays = new LinkedList<CalDay>();
         LinkedList<Appt> listAppts = new LinkedList<Appt>();

         listAppts.add(appt);

         calDays = tt.getApptRange(listAppts, today, tomorrow);
     }

    @Test
    public void test04() throws Throwable {

        int startHour=100;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=1;
        String title="title";
        String description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);


        startHour=100;
        startMinute=1;
        startDay=2;
        startMonth=1;
        startYear=1;
        title="title";
        description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt1 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        GregorianCalendar today = new GregorianCalendar(0001,1,1);
        GregorianCalendar tomorrow = new GregorianCalendar(0001,1,2);;

        TimeTable tt = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        LinkedList<Appt> listAppts = new LinkedList<Appt>();

        listAppts.add(appt);
        listAppts.add(appt1);

        calDays = tt.getApptRange(listAppts, today, tomorrow);
        LinkedList<Appt> listDelAppts = tt.deleteAppt(listAppts, appt);

    }

    @Test
    public void test05() throws Throwable {

        int startHour=100;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=1;
        String title="title";
        String description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);


        startHour=100;
        startMinute=1;
        startDay=2;
        startMonth=1;
        startYear=1;
        title="title";
        description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt1 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        GregorianCalendar today = new GregorianCalendar(0001,1,1);
        GregorianCalendar tomorrow = new GregorianCalendar(0001,1,2);;

        TimeTable tt = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        LinkedList<Appt> listAppts = new LinkedList<Appt>();

        listAppts.add(appt);
        listAppts.add(appt1);

        calDays = tt.getApptRange(listAppts, today, tomorrow);
        tt.deleteAppt(listAppts, listAppts.get(1));

        int[] nums = {1, 2, 4, 5};
        tt.permute(listAppts, nums);
    }

    @Test
    public void test06() throws Throwable {

        int startHour=100;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=1;
        String title="title";
        String description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);


        startHour=100;
        startMinute=1;
        startDay=2;
        startMonth=1;
        startYear=1;
        title="title";
        description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt1 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        GregorianCalendar today = new GregorianCalendar(0001,1,1);
        GregorianCalendar tomorrow = new GregorianCalendar(0001,1,2);;

        TimeTable tt = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        LinkedList<Appt> listAppts = new LinkedList<Appt>();

        listAppts.add(appt);
        listAppts.add(appt1);

        calDays = tt.getApptRange(listAppts, today, tomorrow);
        tt.deleteAppt(listAppts, listAppts.get(1));

        int[] nums = {1, 2};
        tt.permute(listAppts, nums);
    }

    @Test
    public void test07() throws Throwable {

        int startHour=100;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=1;
        String title="title";
        String description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);


        startHour=100;
        startMinute=1;
        startDay=2;
        startMonth=1;
        startYear=1;
        title="title";
        description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt1 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        GregorianCalendar today = new GregorianCalendar(0001,1,1);
        GregorianCalendar tomorrow = new GregorianCalendar(0001,1,2);;

        TimeTable tt = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        LinkedList<Appt> listAppts = new LinkedList<Appt>();

        listAppts.add(appt);
        listAppts.add(appt1);

        calDays = tt.getApptRange(listAppts, today, tomorrow);
        tt.deleteAppt(listAppts, listAppts.get(1));

        int[] nums = {1};
        tt.permute(listAppts, nums);
    }

    @Test
    public void test08() throws Throwable {

        int startHour=100;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=1;
        String title="title";
        String description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);


        startHour=1;
        startMinute=1;
        startDay=2;
        startMonth=1;
        startYear=1;
        title="title";
        description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt1 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        GregorianCalendar today = new GregorianCalendar(0001,1,1);
        GregorianCalendar tomorrow = new GregorianCalendar(0001,1,2);;

        TimeTable tt = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        LinkedList<Appt> delAppts = new LinkedList<Appt>();

        listAppts.add(appt);
        listAppts.add(appt1);

        calDays = tt.getApptRange(listAppts, today, tomorrow);
        delAppts = tt.deleteAppt(listAppts, listAppts.get(1));
        delAppts = tt.deleteAppt(null, null);
    }

    @Test
    public void test09() throws Throwable {

        int startHour=5;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=1;
        String title="title";
        String description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        startHour=6;
        startMinute=1;
        startDay=1;
        startMonth=1;
        startYear=1;
        title="title2";
        description="desc2";
        //Construct a new Appointment object with the initial data
        Appt appt1 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        startHour=7;
        startMinute=1;
        startDay=1;
        startMonth=1;
        startYear=1;
        title="title3";
        description="desc3";
        //Construct a new Appointment object with the initial data
        Appt appt2 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        GregorianCalendar today = new GregorianCalendar(0001,1,1);
        GregorianCalendar tomorrow = new GregorianCalendar(0001,1,2);;

        TimeTable tt = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        LinkedList<Appt> delAppts = new LinkedList<Appt>();

        listAppts.add(appt);
        listAppts.add(appt1);
        listAppts.add(appt2);

        calDays = tt.getApptRange(listAppts, today, tomorrow);
        delAppts = tt.deleteAppt(listAppts, appt1);

    }

    @Test
    public void test10() throws Throwable {

        int startHour=3;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=1;
        String title="title";
        String description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        int[] recurDaysArr={2,3,4};
        appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);

        GregorianCalendar today = new GregorianCalendar(0001,1,1);
        GregorianCalendar tomorrow = new GregorianCalendar(0001,1,5);;

        TimeTable tt = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        LinkedList<Appt> delAppts = new LinkedList<Appt>();

        listAppts.add(appt);

        calDays = tt.getApptRange(listAppts, today, tomorrow);

    }

    @Test
    public void test11() throws Throwable {

        int startHour=5;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=1;
        String title="title";
        String description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);


        startHour=7;
        startMinute=1;
        startDay=2;
        startMonth=1;
        startYear=1;
        title="title";
        description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt1 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        startHour=5;
        startMinute=1;
        startDay=2;
        startMonth=1;
        startYear=1;
        title="title";
        description="desc";
        //Construct a new Appointment object with the initial data
        Appt appt2 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        GregorianCalendar today = new GregorianCalendar(0001,1,1);
        GregorianCalendar tomorrow = new GregorianCalendar(0001,1,2);;

        TimeTable tt = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        LinkedList<Appt> delAppts = new LinkedList<Appt>();

        listAppts.add(appt);
        listAppts.add(appt1);

        calDays = tt.getApptRange(listAppts, today, tomorrow);
        delAppts = tt.deleteAppt(listAppts, null);
        delAppts = tt.deleteAppt(null, appt);
        delAppts = tt.deleteAppt(listAppts, appt2);
    }


//add more unit tests as you needed
}
