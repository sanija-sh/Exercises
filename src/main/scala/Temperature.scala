import scala.io.StdIn.readLine

object Temperature extends App {
  //TODO write a program which asks for user's temperature
  //if Temperature is over 37C print a warming about high temperature
  //if temperature is under 35 print a warning about being cold
  //otherwise print that everything is great :0

  val personsTemp = readLine ("Sara, you are shaking. What is your temperature?") .toFloat
if (personsTemp > 37) {
println("Oh you must go home, you are sick!")
} else if (personsTemp < 35){
  println("You are too cold, please put something on!")
}else {
    println("That is good!")
  }
}
