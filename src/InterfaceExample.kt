//By default all methods in interface are abstract
//From JAVA 8, Interface can have default methods also.
interface  A
{
    fun show()
    fun abc()
    {
        println("abc method from interface A...")
    }
}
interface B
{
    fun display()
    fun abc()
    {
        println("abc method from interface B...,")
    }
}
class C : A,B
{
    override fun show()
    {
        println("Show Method Implementation...")
    }
    override fun display()
    {
        println("Display Method Implementation...")
    }
    override fun abc()
    {
        super<A>.abc()
        super<B>.abc()
    }
}
fun main(args:Array<String>)
{
    var c = C()
    c.display()
    c.show()
    c.abc()
}