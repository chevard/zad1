fun main(args: Array<String>) {
    val amount = 1000
    if(amount < 35){
        println ("Минимум 35 рублей")
    }
    else {
        var result = amount + (amount*0.0075)
        println("Вы заплатите " + result)
    }
}