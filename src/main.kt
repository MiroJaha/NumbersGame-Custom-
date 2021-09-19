import kotlin.random.Random

fun main(){

    val randomNumber= Random.nextInt(10)

    var num1:Int
    var num2:Int
    var X:Int

    while(true) {
        try {
            print("Enter The First Number: ")
            num1 = readLine()!!.toInt()
            break
        }
        catch(e:Exception){
            println("Please Enter Numbers Only\n")
        }
    }
    while(true) {
        try {
            print("Enter The Second Number: ")
            num2 = readLine()!!.toInt()
            break
        }
        catch(e:Exception){
            println("Please Enter Numbers Only\n")
        }
    }

    val answer=num1*randomNumber+num2


    while(true) {
        try {
            println("$num1*X+$num2 = $answer")
            print("What is X? >> ")
            X = readLine()!!.toInt()
            if(X==randomNumber)
                println("You Got It!!")
            else
                println("Wrong Answer.\nThe Correct Answer is: $randomNumber")
            break
        }
        catch(e:Exception){
            println("Please Enter Numbers Only\n")
        }
    }
}