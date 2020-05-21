var i = 9
var i = 9;
(variable names more important than variable types)
(but in java, types are more important than variable names
that because in java we type like int a = 12;) 

var j: Int = 20
var num = 8

(if we type..)
num+i
(it show us 17

var name:String = "Ece Akinci"
var name = "Ece Akinci"


object Demo{
println("Selaminaleykum dunya")
}


int, float, double char, boolean called as primitive datatypes
in scala this is var

var num1: Int = 8;
var num2: Int =7;
  
  /*mutation is ok 
  * but not recomended*/
  num1 = 23;

/*In java there is final keyword, when u use final you can not change
value of it*/
/*In scala there is "val" keyword like "var" but it has same purpose like "final"
keyword  */

val num1: Int =8
/*so reassign/mutate the num1 is not allow*/

/*In Scala everything is object or class, because of that let's look at 
below example*/

var result = 10 + 12; /*In here plus is not an operator it is function*/
var result = 10.+(12); /*Gives us correct result which is 22*/
/*10 is an object, . is an operator, + is a function, and 12 is a parameter which parsing the function*/


case class Student(var rollno:Int =1, var name: String = "Navin", var marks: Int=90){

    /*define function*/
    def show() = println("Hi")

    def show2() ={
      print("something")

    }

    def > (s6 : Student): Boolean = marks > s6.marks

  }

  /*Create student object*/
  var s1 = Student();
  var s2 = Student(4);
  var s3 = Student(name = "Rahul");
  var s4 = Student(4, "Ece");


  var s5 = Student();
  var s6 = Student(2,"John",88)

  s1.>(s2)


  var nums = List(5,7,3,2,8)

  for(n <- nums){
    println(n);
  }
  /*reverse list*/
  var reverseNums  = nums.reverse

  /*remove first two element*/
  nums.drop(2)
  nums drop 2 /*is ok too (syntactic sugar)*/
  nums drop 2 take 3


  7.+(8)
  /*as same as num example*/


  /*remove first two element and prints other first 2 element which is */
  nums.drop(2).take(2)

  /* lambda expression */
  nums.foreach{i: Int => println(i)}


  var something = List(4,5,true,"Ece")
  /*something : List[Any] = List(4,5,true)*/
  /*In java we should create list as object type, but in scala there is no need for that*/


  case class Stud(rollNo : Int, Name : String, Marks : Int)

  val stuList = List(Stud(1,"ece",40), Stud(2,"mehmet",50),Stud(3,"ali",60))

  /*val first gives us first element of stuList*/
  val first = stuList.head


  /*val rest gives us all the other elements except head element*/
  val rest = stuList.tail

  /*with tail.tail gives us last element for this list*/
  val last  = stuList.tail.tail

  /*which gives us middle element for this list*/
  val middle = stuList.tail.head

  /*function that show us mark is greater or equal than 60*/
  val toppers = stuList.filter(s => s.Marks >= 60)
