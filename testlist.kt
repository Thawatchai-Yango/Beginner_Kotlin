fun main(){


    var listOfnumber = arrayListOf<Int>()

    print("Enter how many you want")
    var n = readLine()!!.toInt()

    for( i in 1..n) {
        print("Enter number ")
        var number = readLine()!!.toInt()
        listOfnumber.add(number)
    }

    print("Number is list are $listOfnumber")
}