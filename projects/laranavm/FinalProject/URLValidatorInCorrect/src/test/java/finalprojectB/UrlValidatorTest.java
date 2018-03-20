
package finalprojectB;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static finalprojectB.UrlValidator.NO_FRAGMENTS;

public class UrlValidatorTest {


   @Test
   public void test01()  throws Throwable  {

      String scheme = "https";
      UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

      assertEquals(true, urlValidator.isValidScheme(scheme) );
   }

   @Test
   public void test02()  throws Throwable  {

      String scheme = "https";
      UrlValidator urlValidator = new UrlValidator();

      assertEquals(false, urlValidator.isValidScheme(scheme) );
   }

   @Test
   public void test03()  throws Throwable  {

      String nll = null;
      assertNull(nll);

      UrlValidator urlValidator = new UrlValidator();
      assertEquals(false, urlValidator.isValid(nll) );

      nll = "ftp://foo.bar.com/";
      assertNotNull(nll);

      assertEquals(false, urlValidator.isValid(nll) );
   }

   @Test
   public void test04()  throws Throwable  {

      String nll = null;
      assertNull(nll);

      UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      assertEquals(false, urlValidator.isValid(nll) );

      nll = "http://foo.bar.com/";
      assertNotNull(nll);

      assertEquals(true, urlValidator.isValid(nll) );
   }

//   @Test
//   public void test05()  throws Throwable  {
//
//      String nll = null;
//      assertNull(nll);
//
//      UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
//      assertEquals(false, urlValidator.isValid(nll) );
//
//      nll = "https://www.google.com/";
//      assertNotNull(nll);
//
//      assertEquals(false, urlValidator.isValid(nll) );
//   }

   @Test
   public void test05()  throws Throwable  {

      String nll = null;
      assertNull(nll);

      UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      assertEquals(false, urlValidator.isValid(nll) );

      nll = "http:";
      assertNotNull(nll);

      String URL_REGEX = "^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?";
      Pattern URL_PATTERN = Pattern.compile(URL_REGEX);

      Matcher urlMatcher = URL_PATTERN.matcher("http://www.google.com/");
      String authority = urlMatcher.group(4);

      assertEquals(false, urlValidator.isValid(nll) );
   }

//   @Test
//   public void test05()  throws Throwable  {
//
//      UrlValidator urlValidator = new UrlValidator();
//
//
//      String URL_REGEX = "^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?";
//      Pattern URL_PATTERN = Pattern.compile(URL_REGEX);
//
//      Matcher urlMatcher = URL_PATTERN.matcher("ftp://foo.bar.com/");
//      assertTrue( urlMatcher.matches() );
//
////      String scheme = urlMatcher.group(2);
////      assertTrue(urlValidator.isValidScheme(scheme));
//
//      String authority = urlMatcher.group(4);
//
//      if ("http".equals(scheme)) {// Special case - file: allows an empty authority
//         if (authority != null) {
//            authority.contains(":");
//         }
//      }
//      else {
//         // Validate the authority
//         !isValidAuthority(authority);
//      }
//
//   }


//   public UrlValidatorTest(String testName) {
//      super(testName);
//   }


   //You can use this function to implement your manual testing
//   public void tS() {

//      String nll = null;
//      assertNull(nll);
//
//      UrlValidator urlValidator = new UrlValidator();
//      assertEquals(false, urlValidator.isValid(nll) );
//
//      nll = "ftp://foo.bar.com/";
//      assertNotNull(nll);
//
//      assertEquals(true, urlValidator.isValid(nll) );
//   }

   //You can use this function to implement your First Partition testing
//   public void testYourFirstPartition() {
//
//      UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
//
//      String URL_REGEX = "^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?";
//      Pattern URL_PATTERN = Pattern.compile(URL_REGEX);
//
//      String nll = "https://www.google.com/";
//
//      Matcher urlMatcher = URL_PATTERN.matcher(nll);
//      urlMatcher.matches();
//   }

   //You can use this function to implement your Second Partition testing
//   public void testYourSecondPartition() {

//      String[] schemes = {"https"};
//      UrlValidator urlValidator = new UrlValidator(schemes, UrlValidator.ALLOW_2_SLASHES + NO_FRAGMENTS);
//
//      String URL_REGEX = "^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?";
//      Pattern URL_PATTERN = Pattern.compile(URL_REGEX);
//
//      String nll = "https://www.google";
//      assertNotNull(nll);
//
//      Matcher urlMatcher = URL_PATTERN.matcher(nll);

//      String scheme = urlMatcher.group();


//      String scheme = "https";
//      UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
//
//      assertEquals(true, urlValidator.isValidScheme(scheme) );
//   }
   //You need to create more test cases for your Partitions if you need tos
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// public void testIsValid() {
//      public void testIsValid() {
//         testIsValid(testUrlParts, UrlValidator.ALLOW_ALL_SCHEMES);
//      }
//   }
