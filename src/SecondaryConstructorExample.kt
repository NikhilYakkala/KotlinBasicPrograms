//Secondary Constructor will be created by using constructor keyword
class Alien(password:Int)
{
    //By using this() we can call primary constructor
    constructor(username:String,password: Int):this(password)
    {
        println("Username is : $username and Password is $password")
    }
}
fun main(args : Array<String>)
{
    var alien = Alien("Nikki",1234)
}
//Calling Secondary Constructor within the Secondary Constructor
/*class Alien
{
    //By using this() we can call primary constructor
    constructor(username:String,password: Int)
    {
        println("this is called first")
        println("Username is : $username and Password is $password")
    }
    constructor(username: String,password: Int,mobilenumber:Int):this(username, password)
    {
        println("this is called next")
        println("Username is : $username " +
                "Password is $password " +
                "and Mobile Number is $mobilenumber")
    }
}
fun main(args : Array<String>)
{
    var alien = Alien("Nikki",1234,8688)
}*/

