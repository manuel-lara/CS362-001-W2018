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
	  public void test01() throws Throwable  {
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

         assertEquals(15, appt.getStartDay());


         assertEquals(01, appt.getStartMonth());
         assertEquals(2018, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());
         assertEquals(21, appt.getStartHour());
         assertEquals(100, appt.getStartMinute());
         assertEquals(2, appt.getRecurBy());

         int[] test = new int[0];
         appt.setRecurrence( null, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
         assertEquals(test.length, appt.getRecurDays().length);

         assertEquals(true, appt.isRecurring());
//         assertEquals(2, appt.getRecurIncrement());
//
         int[] recurDaysArr={2,3,4};
         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
//
         assertEquals(true, appt.isRecurring());
         assertEquals(2, appt.getRecurIncrement());
	 }

	 @Test
	  public void test02()  throws Throwable  {

         int startHour=21;
         int startMinute=30;
         int startDay=-1;
         int startMonth=12;
         int startYear=2018;
         String title=null;
         String description=null;
         //Construct a new Appointment object with the initial data
         Appt appt = new Appt(startHour,
                 startMinute ,
                 startDay ,
                 startMonth ,
                 startYear ,
                 title,
                 description);

         assertEquals(false, appt.getValid());
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

        assertEquals(false, appt4.getValid());

        appt4.setStartDay(34);
        assertEquals(false, appt4.getValid());

        appt4.setStartDay(2);
        assertEquals(true, appt4.getValid());
    }

    @Test
    public void test041() throws Throwable {
        int startHour=-1;
        int startMinute=1;
        int startDay=1;
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

        assertEquals(false, appt4.getValid());
        appt4.setStartHour(2);
        assertEquals(true, appt4.getValid());
    }

    @Test
    public void test042() throws Throwable {
        int startHour=1;
        int startMinute=-5;
        int startDay=1;
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

        assertEquals(false, appt4.getValid());

        appt4.setStartMinute(60);
        assertEquals(false, appt4.getValid());
        appt4.setStartMinute(-1);
        assertEquals(false, appt4.getValid());

        appt4.setStartMinute(59);
        assertEquals(true, appt4.getValid());
    }

    @Test
    public void test043() throws Throwable {
        int startHour=1;
        int startMinute=1;
        int startDay=1;
        int startMonth=1;
        int startYear=0;
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

        assertEquals(true, appt4.getValid());
        appt4.setStartYear(100);
        assertEquals(true, appt4.getValid());
    }

    @Test
    public void test044() throws Throwable {
        int startHour=1;
        int startMinute=1;
        int startDay=1;
        int startMonth=5;
        int startYear=0;
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

        assertEquals(true, appt4.getValid());
        appt4.setStartMonth(6);
        assertEquals(true, appt4.getValid());


        try {
            appt4.setStartMonth(0);
            assertEquals(false, appt4.getValid());
        } catch (IndexOutOfBoundsException expected) {}
    }

    @Test
    public void test05() throws Throwable {
	     // appt 1
        int startMinute=1;
        int startHour=100;
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
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

//        assertTrue(appt.getStartHour() <= 23);
//        assertTrue(appt.getStartHour() < 1);
//        assertEquals(false, appt.getValid());

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


    @Test
    public void test08() throws Throwable {
        // appt 1
        int startMinute=1;
        int startHour=2;
        int startDay=5;
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
        startDay=1;
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

        startHour=1;
        startMinute=1;
        startDay=1;
        startMonth=4;
        startYear=0001;
        title="Test 5";
        description="Test 5 descr";
        //Construct a new Appointment object with the initial data
        Appt appt7 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        startHour=1;
        startMinute=1;
        startDay=1;
        startMonth=4;
        startYear=0005;
        title="Test 5";
        description="Test 5 descr";
        //Construct a new Appointment object with the initial data
        Appt appt8 = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);



        appt5.compareTo(appt6);
        assertEquals( 5, appt5.compareTo(appt6));

        appt6.compareTo(appt7);
        assertEquals(-3, appt6.compareTo(appt7));

        appt7.compareTo(appt8);
        assertEquals(-4, appt7.compareTo(appt8));

        assertNotNull(appt6.toString());

        assertEquals(appt6.toString(), appt6.toString());
    }


    @Test
    public void test09() throws Throwable {
        // appt 1
        int startHour=14;
        int startMinute=30;
        int startDay=7;
        int startMonth=2;
        int startYear=2018;
        String title="Class";
        String description="Rescheduled class.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        assertEquals("\t2/7/2018 at 2:30pm ,Class, Rescheduled class.\n", appt.toString());

    }

    @Test
    public void test10() throws Throwable {
        // appt 1
        int startHour=-1;
        int startMinute=-1;
        int startDay=20;
        int startMonth=4;
        int startYear=100;
        String title="Test 5";
        String description="Test 5 descr";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        assertEquals(false, appt.getValid());

    }


    @Test
    public void test11() throws Throwable {
        // appt 1
        int startHour=20;
        int startMinute=6;
        int startDay=10;
        int startMonth=4;
        int startYear=100;
        String title="Test 5";
        String description="Test 5 descr";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

    }

}
