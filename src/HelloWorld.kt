@file:JvmName("Hello")

import java.util.*

fun main(args : Array<String>)
{
    /*println("Hello World")

    // creation of object

    var objectname = className()

    var e = Employee();

    e.ename="nikhil"

    println("Name of Employee : "+e.ename)

    println("Name of Employee with $ symbol ${e.ename}")*/

    /*var alien = Alien();

    alien.alienName = "nikhil"

    println("Name of Alien: ${alien.alienName}")
    */

    //String Template
    //$alien.alienName & $ename;

    //operators

    /*var num1 : Int = 5
    var num2 : Int = 6

    var result = num1+num2

    println("The addition of $num1 and $num2 is $result")
*/
    //If else expressions

   /* var num1 : Int = 1
    var num2 : Int = 2

    var result : Int = 0
    if (num1>num2)
        result=num1
    else
        result=num2

    println(result)*/


    /*var num3 = 6

    var result : String

     result = if(num3%2==0)
         "even"
    else
         "odd"
    println(result)*/
    //.equals and == (Structural Equality)
    //===(Referential Equality)
    /*var str1 = "nikhil"
    var str2 = "Nikhil"
    if(str1==str2)
        println("Same")
    else
        println("Not Same")
    */


    // Switch case in Kotlin using when

    /*var num : Int = 5
    when(num)
    {
        1-> println("One")
        2->println("Two")
        3-> println("Three")
        4->println("Four")
        5-> println("Five")
        else->println("Give Proper Input")
    }*/
    //When Expression
    /*var num : Int = 2
    var str = when(num)
    {
       1->"One"
        2->"Two"
        else->"Ntng"
    }
    println("str is $str")*/

    //Loops & Range
    /*var numbers= 1 .. 5
    for(i in numbers) {
        println(i)
    }
    var num =  1 .. 5
    var number = 5 downTo 1 //or var number = 5.downTo(1)
    var nums = 1 until 5
    for(j in num.reversed().step(2))
    {
        println(j)
    }
    for(k in number)
    {
        println(k)
    }
    for(l in nums)
    {
        println(l)
    }*/
    /*var num : Int = 5
    var i : Int = 1
    //while loop
    *//*while (i<=num)
    {
        println(i)
        i++;
    }*//*
    //do-while loop
    do {
       println(i);
        i++;
    }while (i<=num)*/

    //List Example

    //var nums = listOf(1,2,3)
    /*for(i in nums)
    {
        println(i)
    }*/
    /*for((index,value) in nums.withIndex())
    {
        println("Index$index : Value = $value")
    }*/
    //map example

    /*var aliens = TreeMap<String,Int>()

    aliens ["nikhil"]=23
    aliens ["nikki"]=22

    for((name,age) in aliens)
    {
        println("Name : $name & Age : $age")
    }
*/

    /*var result = add(4,4)

    var max = max(10,20)
*/
   // var maximum = max(10,20,30)

    /*println("Sum : $result")

    println("Max : $max")
*/
    //println("Max : $maximum")

    //String to Integer

    /*var str : String = "550"

    var number : Int = str.toInt()

    println(number)
    */
    /*var e1 = Employee()
    e1.skills = "JAVA"
    e1.show()
    var e2 = Employee()
    e2.skills = "SQL"
    e2.show()
    var e3 = e1.plus(e2)
    e3.show()*/

    //infix function Example
    var math = Math()

   var result = math square 3

    println("The Square of given number is : $result")
}
//Extension Function
/*
fun Employee.plus(e : Employee):Employee
{
    var newEmployee = Employee()
    newEmployee.skills = this.skills + " " + e.skills
    return newEmployee
}
*/

//functions

/*fun add(a : Int, b : Int) : Int = a+b*/

/*fun add(a : Int, b : Int) : Int
{
    return a+b
}*/
/*
fun max(a : Int, b : Int) : Int
{
    if(a>b)
        return a
    else
       return b
}*/

/*
fun max(a : Int, b : Int) : Int = if (a>b) a else b*/
//fun max(a : Int, b : Int,c : Int) : Int = if (a>b&&a>c) a else if(b>c) b else c




