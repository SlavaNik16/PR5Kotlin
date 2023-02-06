import java.util.Random

fun main(args: Array<String>) {
    println("Философия")
    try {
        print("Сколько философов сидит на столе: ")
        var n: Int = readln().toInt()
        var person = Philosof(n)
        var mas: MutableList<Any?> = InputMas(person.ReturnMas())
        Algoritm(mas,n)
    }catch (e:Exception){
        println("Неверный формат!!!")
    }
    println()

}
fun InputMas(person: Array<Philosof>): MutableList<Any?> {
    var mas: MutableList<Any?> = mutableListOf()
    var i = 0
    for(pers in person) {
        mas.add(i,"${pers.Name}")
        mas.add(i+1,pers.Fork);
        i+=2
    }
    return mas
}
fun ValidateLeft(mas: MutableList<Any?>, NumbPerson: Int, n: Int): Boolean{
    try {
        if (mas[NumbPerson - 1] != 0) {
            mas[NumbPerson - 1] = 0
        }else{
            return false
        }
    }catch (e: ArrayIndexOutOfBoundsException){
        if (mas[n * 2 - 1] != 0) {
            mas[n * 2 - 1] = 0
        }else {
            return false
        }
    }
    return true
}
fun ValidateRight(mas: MutableList<Any?>, NumbPerson: Int, n: Int):Boolean{
    if (mas[NumbPerson + 1] != 0) {
        mas[NumbPerson + 1] = 0
    }else{
        return false
    }
    return true
}
fun RandomNumber(mas: MutableList<Any?>,n:Int): Int{
    var NumbPerson = 0
    do{
        NumbPerson = Random().nextInt(n*2)
    }while(NumbPerson % 2 == 1 || mas[NumbPerson] == "Взял");
    return NumbPerson
}

fun Algoritm(mas: MutableList<Any?>, n:Int){
    var took = true
    var i = 1
    while(i <= n){

        var NumbPerson = RandomNumber(mas,n)
        var fork = Random().nextInt(2)
        var text = ""
        when(fork){
            1 -> { text = "левую";
                if(!ValidateLeft(mas,NumbPerson,n)){
                    text = "правую";
                    if(!ValidateRight(mas,NumbPerson,n)){
                        took = false
                    }
                }
            }
            0 -> {text = "правую" ;
                if(!ValidateRight(mas,NumbPerson,n)){
                    text = "левую";
                    if(!ValidateLeft(mas,NumbPerson,n)){
                        took = false
                    }
                }
            }

        }
        if (took){
            println("${mas[NumbPerson]} берет $text вилку")
        }else{
            println("${mas[NumbPerson]} размышляет")
            took = true
        }
        mas[NumbPerson] = "Взял"

        i++

    }
}