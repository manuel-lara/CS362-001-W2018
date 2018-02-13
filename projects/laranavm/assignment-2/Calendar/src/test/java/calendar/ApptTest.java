package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=100;
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

		 appt.toString();
	 }

	 @Test
	  public void test02()  throws Throwable  {

         int startHour=21;
         int startMinute=30;
         int startDay=-1;
         int startMonth=12;
         int startYear=10000;
         String title=null;
         String description=null;
         //Construct a new Appointment object with the initial data
         Appt appt2 = new Appt(startHour,
                 startMinute ,
                 startDay ,
                 startMonth ,
                 startYear ,
                 title,
                 description);
         // assertions
         assertTrue(appt2.getValid());
         assertEquals(21, appt2.getStartHour());
         assertEquals(30, appt2.getStartMinute());
         assertEquals(15, appt2.getStartDay());
         assertEquals(12, appt2.getStartMonth());
         assertEquals(2018, appt2.getStartYear());
         assertEquals("title2", appt2.getTitle());
         assertEquals("descr2", appt2.getDescription());
		 
	 }
//add more unit tests as you needed
    @Test
    public void test03()  throws Throwable  {

	     // Appt 1
	     int startHour=1;
        int startMinute=1;
        int startDay=100;
        int startMonth=100;
        int startYear=10000;
        String title="title3";
        String description="descr3";
        //Construct a new Appointment object with the initial data
        Appt appt3 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);
    }

    @Test
    public void test04() throws Throwable {
        int startHour=1;
        int startMinute=1;
        int startDay=-1;
        int startMonth=1;
        int startYear=0001;
        String title="Test 4";
        String description="Test 4 descr";
        //Construct a new Appointment object with the initial data
        Appt appt4 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        appt4.setStartHour(2);
        appt4.setStartMinute(2);
        appt4.setStartDay(2);
        appt4.setStartMonth(2);
        appt4.setStartYear(2);

    }

    @Test
    public void test05() throws Throwable {
	     // appt 1
        int startHour=100;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=0001;
        String title="Test 5";
        String description="Test 5 descr";
        //Construct a new Appointment object with the initial data
        Appt appt5 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);


        //appt 2
        startHour=1;
        startMinute=1;
        startDay=100;
        startMonth=1;
        startYear=0001;
        title="Test 5";
        description="Test 5 descr";
        //Construct a new Appointment object with the initial data
        Appt appt6 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        appt5.compareTo(appt6);
    }

    @Test
    public void test06() throws Throwable {
        // appt 1
        int startHour=-1;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=100;
        String title="Test 5";
        String description="Test 5 descr";
        //Construct a new Appointment object with the initial data
        Appt appt5 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);
    }

    @Test
    public void test07() throws Throwable {
        // appt 1
        int startHour=1;
        int startMinute=-1;
        int startDay=1;
        int startMonth=1;
        int startYear=100;
        String title="Test 5";
        String description="Test 5 descr";
        //Construct a new Appointment object with the initial data
        Appt appt5 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);
    }
}
