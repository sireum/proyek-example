// #Sireum
package example

import org.sireum._

object ExampleApp extends App {
  def main(args: ISZ[String]): Z = {
    print("ExampleApp: ")
    ExampleLib.hello()
    return 0
  }
}