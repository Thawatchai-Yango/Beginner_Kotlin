
fun main() {

    println("***** Service Charges *****")
    print("Arrival Time: ")
    val hoursArrival = readLine()!!.toInt()    // 1
    val minuteArrival = readLine()!!.toInt()   // 00
    print("Departure Time: ")
    val hoursDeparture = readLine()!!.toInt()  // 2
    val minuteDeparture = readLine()!!.toInt() // 10

    getServiceTime(hoursArrival, minuteArrival,hoursDeparture, minuteDeparture) //(1,00,2,10)
}
fun getServiceTime(hoursArrival: Int, minuteArrival: Int, hoursDeparture: Int, minuteDeparture: Int) {
    val timeHourDifferent =  hoursDeparture - hoursArrival        // 2-1 = 1
    val timeMinuteDifferent = minuteDeparture - minuteArrival     // 10 -0 =10
    // 1 10
    getServiceCharges(timeHourDifferent,timeMinuteDifferent) //(1,10)
    println("$timeHourDifferent $timeMinuteDifferent")
}
fun getServiceCharges(timeHourDifferent: Int, timeMinuteDifferent: Int) {  // (1,10)

    if(timeMinuteDifferent >5) { //true
        val timeMinuteDifferentDifferent= 1 //1
        val totalTimeDifferent = timeHourDifferent+timeMinuteDifferentDifferent //1+1 =2

        when {
            totalTimeDifferent <= 2 -> {
                calculate10(totalTimeDifferent)//(2)
            }
            totalTimeDifferent in 3..5 -> { //4
                calculate15(totalTimeDifferent)//(4)
            }
            totalTimeDifferent >= 6 -> {
                calculate20(totalTimeDifferent)
            }
        }
    }
    else if(timeMinuteDifferent<0) {
        print("test")
        val newTimeMinute = 60 + timeMinuteDifferent
        if (newTimeMinute > 5) {
            val newTimeMinute = 1
            val totalTimeDifferent = (timeHourDifferent-1) + newTimeMinute
            when {
                totalTimeDifferent <= 2 -> {
                    calculate10(totalTimeDifferent)
                }
                totalTimeDifferent in 3..5 -> {
                    calculate15(totalTimeDifferent)
                }
                totalTimeDifferent >= 6 -> {
                    calculate20(totalTimeDifferent)
                }
            }
        }
        else if (newTimeMinute < 5) {
            val newTimeMinute = 1
            val totalTimeDifferent = (timeHourDifferent-1)
            when {
                totalTimeDifferent <= 2 -> {
                    calculate10(totalTimeDifferent)
                }
                totalTimeDifferent in 3..5 -> {
                    calculate15(totalTimeDifferent)
                }
                totalTimeDifferent >= 6 -> {
                    calculate20(totalTimeDifferent)
                }
            }
        }
    }
    else if(timeMinuteDifferent in 0..5 )
    {
        when {
            timeHourDifferent <= 2 -> {
                calculate10(timeHourDifferent)
            }
            timeHourDifferent in 3..5 -> {
                calculate15(timeHourDifferent)
            }
            timeHourDifferent>= 6 -> {
                calculate20(timeHourDifferent)
            }
        }
    }
}
fun calculate20(totalTimeDifferent: Int) {
    val newTimeDifferent = totalTimeDifferent-5
    val totalCost = 20+45+( newTimeDifferent*20)
    println("Service Time (hrs.): $totalTimeDifferent")
    println("Service Charge (Baht): $totalCost")
}
fun calculate15(totalTimeDifferent: Int) { //4
    val newTimeDifferent = totalTimeDifferent-2   //4-2=2
    val totalCost = 20+( newTimeDifferent* 15) //20 (2*15) = 50
    println("Service Time (hrs.): $totalTimeDifferent")
    println("Service Charge (Baht): $totalCost")
}
fun calculate10(totalTimeDifferent: Int) { //2
    val totalCost = totalTimeDifferent * 10 //2*10
    println("Service Time (hrs.): $totalTimeDifferent") // 2
    println("Service Charge (Baht): $totalCost") //20
}

/*OUTPUT
case1
***** Service Charges *****
Arrival Time: 8 30
Departure Time: 9 40
Service Time (hrs.): 2
Service Charge (Baht): 20

case2
***** Service Charges *****
Arrival Time: 9 00
Departure Time: 11 40
Service Time (hrs.): 3
Service Charge (Baht): 35

case3
***** Service Charges *****
Arrival Time: 1 00
Departure Time: 7 05
Service Time (hrs.): 6
Service Charge (Baht): 85
 */
