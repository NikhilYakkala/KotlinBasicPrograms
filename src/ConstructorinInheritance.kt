//Kotlin inheritance primary constructor
/*open class Customer(name : String)
{
    init {
        println("$name is Here...")
    }
    open fun think()
    {
        println("Human is Thinking")
    }
}
class Manager(name: String,age:Int) : Customer(name)
{
    init {
        println("$name is Here and his age is $age...")
    }
    override fun think()
    {
        println("Teacher is Thinking")
    }
}
fun main(args:Array<String>)
{
    var nikhil : Customer = Manager("nikhil",23)
    //nikhil.think()
}

//Kotlin Inheritance Secondary Constructor
open class Customer
{
    constructor(name:String,age:Int)
    {
        println("Name is $name is Here.." +
                "Age is $age")
    }
    open fun think()
    {
        println("Human is Thinking")
    }
}
class Manager : Customer
{
    constructor(name: String,age:Int,salary:Double):super(name,age)
    {
        println("Salary is $salary")
    }
    override fun think()
    {
        println("Teacher is Thinking")
    }
}
fun main(args:Array<String>)
{
    var nikhil : Customer = Manager("nikhil",23,25000.00)
    //nikhil.think()
}
*/