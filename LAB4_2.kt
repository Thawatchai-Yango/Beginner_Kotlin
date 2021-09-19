fun main() {
    while(true) {
        println("\n***** Roman *****")
        getNumber()
        print("\nContinue(y/n): ")
        val input: String? = readLine()
        if(input == "n")
            break
    }
    println("Thank you!!")
}
fun getNumber() {
    print("Input number: ") //54
    var decimal = readLine()!!.toInt()//54
    print("Result: ")//liv
    conVert(decimal)//(54)
}
fun conVert(decimal: Int) {//54
    var decimal = decimal //
    if (decimal > 100) { //54>100
        print("Not exceed 100")
    }
    while (decimal != 0 && decimal <= 100) { //0!=0  54<=100
        when {                      //if( decimal == 100){
            decimal == 100 -> {     //        print("c")
                print("c")          //       decimal -=100
                decimal -= 100      // }
            }
            decimal >= 90 -> {
                print("xc")
                decimal -= 90
            }
            decimal >= 50 -> {
                print("l")
                decimal -= 50//54-50=4
            }
            decimal >= 40 -> {
                print("xl")
                decimal -= 40
            }
            decimal >= 10 -> {
                print("x")
                decimal -= 10
            }
            decimal >= 9 -> {
                print("ix")
                decimal -= 9
            }
            decimal >= 5 -> {
                print("v")
                decimal -= 5
            }
            decimal >= 4 -> {
                print("iv")
                decimal -= 4 //4-4=0
            }
            decimal >= 1 -> {
                print("i")
                decimal -= 1
            }
        }
    }
}

/*OUTPUT
***** Roman *****
Input number: 24
Result: xxiv
Continue(y/n): y

***** Roman *****
Input number: 15
Result: xv
Continue(y/n): y

***** Roman *****
Input number: 24
Result: xxiv
Continue(y/n): y

***** Roman *****
Input number: 39
Result: xxxix
Continue(y/n): y

***** Roman *****
Input number: 44
Result: xliv
Continue(y/n): y

***** Roman *****
Input number: 49
Result: xlix
Continue(y/n): y

***** Roman *****
Input number: 94
Result: xciv
Continue(y/n): y

***** Roman *****
Input number: 102
Result: Not exceed 100
Continue(y/n): y

***** Roman *****
Input number: 250
Result: Not exceed 100
Continue(y/n): n
Thank you!!
 */


