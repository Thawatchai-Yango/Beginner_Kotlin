fun main()
{
    println("*** Program calculate BMI ***")
    print("Weight (kg) : ")
    val weight = readLine()!!.toFloat() //get weight from the user ad convert to float
    print("Height (cm) : ")
    val height = readLine()!!.toFloat()  //get height from the user ad convert to float
    val heightM = height / 100 // convert height from cm to meter
    val bmiCal = weight / (heightM * heightM) // calculate BMI
    println("BMI = %.2f".format(bmiCal) ) // output bmi with 2 decimal point
    // if else for indicate the state of BMI
    if(bmiCal <= 18.5)
        println("Answer = Underweight")
    else if(bmiCal > 18.50 && bmiCal <= 23.40)
        println("Answer = Normal-weight")
    else if(bmiCal > 23.40 && bmiCal <= 28.40)
        println("Answer = Overweight")
    else if(bmiCal > 28.40 && bmiCal <= 34.90)
        println("Answer = Obesity 1")
    else if(bmiCal > 34.90 && bmiCal <= 39.90)
        println("Answer = Obesity 2")
    else if(bmiCal > 39.90)
        println("Answer = Obesity max")
    println("*** End program calculate BMI ***")
}


/* OUTPUT
*** Program calculate BMI ***
Weight (kg) : 57
Height (cm) : 162
BMI = 21.72
Answer = Normal-weight
*** End program calculate BMI ***
 */