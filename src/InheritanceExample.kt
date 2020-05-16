open class Student
{
    open fun think()
    {
        println("Human is Thinking")
    }
}
class Teacher : Student()
{
    override fun think()
    {
        println("Teacher is Thinking")
    }
}
fun main(args:Array<String>)
{
    var nikhil = Teacher()
    nikhil.think()
}