fun main(args:Array<String>)
{
    var number : Int=10;

    println("The Factorial of $number is ${fact(number)}")
}
fun fact(i : Int) : Int
{
    if(i==0||i==1)
        return 1
    else
        return i * fact(i-1)
}