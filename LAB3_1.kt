
fun main() {
    println("============Calculate Average score of students=================")
    print("Enter number of student you want to calculate : ")
    val number = readLine()!!.toInt()

    var listID = arrayListOf<Long>()
    var listScore = arrayListOf<Long>()

    println("====>Please enter ID andd Score of Students")
    for (i in 1..number) {
        print("Student Id no.$i : ")
        var id = readLine()!!.toLong()
        listID.add(id)

        print("Student Score no.$i : ")
        var score = readLine()!!.toLong()
        listScore.add(score)
    }
    println("\n==========Summary============")
    print("==>Average score of $number students is ${listScore.average()}\n\n")

    var count = 0 + 1 + 1
    for (i in 1..number) {
        if (listScore[i - 1] < listScore.average()) {  //1-1
            count++
        }
    }
    println("==>No.of students who has below average is $count and following IDs are Below")
    //listID[141,142,143,144,145]
    for (i in 1..number) {   //1,2                        //[12,11,10,15,16]  //ave=12
        if (listScore[i - 1] < listScore.average()) {   //2-1=1 11 < 12
            println("${listID[i - 1]} ") //2-1=1
        }

    }
}

/*OUTPUT
============Calculate Average score of students=================
Enter number of student you want to calculate : 5
====>Please enter ID andd Score of Students
Student Id no.1 : 123
Student Score no.1 : 7
Student Id no.2 : 124
Student Score no.2 : 8
Student Id no.3 : 125
Student Score no.3 : 5
Student Id no.4 : 126
Student Score no.4 : 6
Student Id no.5 : 127
Student Score no.5 : 9

==========Summary============
==>Average score of 5 students is 7.0

==>No.of students who has below average is 2 and following IDs are Below
125
126
 */


