import Bonus.salary

import scala.io.StdIn.readLine

object Bonus extends App {
  //TODO Calculate yearly Xmas Bonus
  //Ask for Employee Name
  val employee = readLine("What is your name?")
  println(s"Nice to talk to you $employee!")
  val years = readLine(s"$employee , how long have you been working here?") .toFloat
  val salary = readLine(s"How much do you earn per month?") .toFloat
val minyears = 2

  if (years < minyears) {
    println("I am sorry, but you wont get the bonus this year")
  }
  else {
    val bonus = salary * (years.ceil - minyears) * 0.15
    println(s"Great, you are getting $bonus bonus this year!")
  }


  //Ask for how long they have worked
  //ask for monthly wage
  //Calculate Xmas bonus if they have worked at least 2  years
  //Bonus is years worked over 2 years * 15% of monthly wage
  //so 5 years worked, 1000 Euros wage would give 450 Euro bonus{

}
