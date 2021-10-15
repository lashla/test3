fun main() {
    var enteredNumber = readLine()!!.toString()
    println(comp(enteredNumber))
}
fun comp (enteredNumber: String): String{
   var temp: Int = 1;
    var tempNumber = enteredNumber
    do {
        for (element in tempNumber) {
            temp *= element.digitToInt()
        }
        tempNumber = sum.toString()
        temp = 1
    } while (tempNumber.length > 1)
    return tempNumber
}
