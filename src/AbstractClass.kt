abstract class RBI
{
     abstract fun simpleInterest(p:Int,r:Double,t:Int) : Double
}
open class AndhraBank : RBI()
{
    override fun simpleInterest(p:Int,r:Double,t: Int) : Double
    {
        return (p*t*r)/100
    }
}
open class FederalBank : RBI()
{
    override fun simpleInterest(p:Int,r:Double,t: Int) : Double
    {
        return (p*t*r)/100
    }
}
fun main(args:Array<String>)
{
    var fedbank : RBI = FederalBank()
    var interest_federal = fedbank.simpleInterest(100,500.23,5)
    println("Federal Bank Interest is : $interest_federal")
    var andhraBank : RBI = AndhraBank()
    var interest_andhra = andhraBank.simpleInterest(200,300.56,10)
    println("Andhra Bank Interest is : $interest_andhra")
}