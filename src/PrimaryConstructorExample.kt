//Primary Constructor can be used to Initialize the class
class Human(name:String,age:Int)
{
    var h_name : String
    var h_age : Int
    //Initializer blocks are used to initialization of code
    init {
        h_name=name
        h_age=age
    }
    fun printData()
    {
        println("Name : $h_name and Age : $h_age")
    }
}
fun main(args:Array<String>)
{
    var human = Human("Nikhil",23)
    human.printData()
}