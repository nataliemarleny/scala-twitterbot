import org.scalatest.WordSpec
import org.scalabridge.Utils._

/** Tests to test our utility functions */
class UtilsSpec extends WordSpec {
  "addThenDoubleIt" should {
    "add the two inputs and double the result" in {
      assert(addThenDoubleIt(2, 4) == 12)
    }
  }

  "stringToInt" should {
    "Convert a valid string to int" in {
      assert(stringToInt("15") == Some(15))
    }

    "Return none if an invalid string is given" in {
      assert(stringToInt("15nope") == None)
    }
  }
}