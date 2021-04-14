package example

import org.sireum._

class ExampleTest extends test.TestSuite {

  val tests = Tests {

    * - assert(T)

    "Group 1" - {

      * - {
        val n = Z.random
        assert(n * n >= 0)
      }

      * - {
        var n = Z.random
        if (n < 0) {
          n = -n
        }
        assert(n >= 0)
      }

    }

    "Group 2" - {

      * - {
        val n = Z.random
        assert(checkNonNeg(n * n))
      }

    }
  }

  def checkNonNeg(n: Z): B = n >= 0

}