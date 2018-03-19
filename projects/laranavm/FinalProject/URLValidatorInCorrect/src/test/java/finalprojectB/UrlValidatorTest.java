
package finalprojectB;

import junit.framework.TestCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!

public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }


   //You can use this function to implement your manual testing
   public void testManualTest() {

      String nll = null;
      assertNull(nll);

      UrlValidator urlValidator = new UrlValidator();
      assertEquals(false, urlValidator.isValid(nll) );

      nll = "https://www.google.com/";
      assertNotNull(nll);

      assertEquals(false, urlValidator.isValid(nll) );
   }

   //You can use this function to implement your First Partition testing
   public void testYourFirstPartition() {

      String[] schemes = {"https"};
      UrlValidator urlValidator = new UrlValidator(schemes);

      String URL_REGEX = "^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?";
      Pattern URL_PATTERN = Pattern.compile(URL_REGEX);

      String nll = "https://www.google";
      assertNotNull(nll);

      Matcher urlMatcher = URL_PATTERN.matcher(nll);
      assertFalse(!urlMatcher.matches());

      assertEquals(false, urlValidator.isValid(nll) );
   }

   //You can use this function to implement your Second Partition testing
   public void testYourSecondPartition() {

      String[] schemes = {"https"};
      UrlValidator urlValidator = new UrlValidator(schemes);

      String URL_REGEX = "^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?";
      Pattern URL_PATTERN = Pattern.compile(URL_REGEX);

      String nll = "https://www.google";
      assertNotNull(nll);

      Matcher urlMatcher = URL_PATTERN.matcher(nll);
      String scheme = urlMatcher.group(2);

      assertFalse(!urlMatcher.matches());
S
      assertEquals(false, urlValidator.isValidScheme(scheme) );


   }
   //You need to create more test cases for your Partitions if you need tos
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 public void testIsValid()
   {
	   //You can use this function for programming based testing

   }
 */