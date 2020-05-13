fun main(args : Array<String>)
{
        val student_Id = 2
        val student_Name = "nikki"
        val student_RollNo = 551
        //default parameters
       /* studentDetails()// passing no arguments while calling student
        studentDetails(student_Id,student_Name) // passing only two arguments id and name of student
        studentDetails(student_Id,student_Name,student_RollNo)*/
        //passing all the arguments of student id, name and rollno in same order as defined in function
        //named parameters
        studentDetails(studentName = student_Name,studentRollNo = student_RollNo) //passing the arguments with name as defined in function.
}
// default arguments in function definition id, name and roll_no
fun studentDetails(studentId : Int=1,studentName : String="Nikhil",studentRollNo : Int=550)
{
        println("Student Id : $studentId")
        println("Student name : $studentName")
        println("Student Roll No : $studentRollNo")
}