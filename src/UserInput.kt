import java.util.*

fun main(args : Array<String>)
{
    println("Enter your name:")
    var name = readLine()
    println("Enter your age:")
    val readAge = Scanner(System.`in`)
    val age = readAge.nextInt()
    println("Enter your Salary")
    var readSalary = readLine()
    var salary = readSalary?.toInt()
    println("Entered Name is : $name")
    println("Entered Age is : $age")
    println("Entered Salary is : $salary")

}