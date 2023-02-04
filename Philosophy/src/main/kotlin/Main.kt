import java.util.Random

fun main(args: Array<String>) {
    println("Философия")


    var i = 0
    var person1 = Philosof("Виктор", 26)
    var person2 = Philosof("Алексей", 56)
    var person3 = Philosof("Валерий", 46)
    var person4 = Philosof("Меликов", 85)
    var person5 = Philosof()
    var MasPhil: Array<Philosof> = arrayOf(person1, person2, person3, person4, person5)
    var mas: MutableList<Any?> = InputMas(MasPhil)

    while(i < 5){
        var NumbPerson = 0
        do{
            NumbPerson = Random().nextInt(10)
        }while(NumbPerson % 2 == 1 || mas[NumbPerson] == "Взял");
        var fork = Random().nextInt(2)
        var text = ""
        when(fork){
            1 -> { text = "левую";
                if(NumbPerson == 0) {
                mas[NumbPerson - 1] = 0
            }
                ;
            }
            0 -> {text = "правую" ;mas[NumbPerson + 1] = 0;}
        }
        println("${mas[NumbPerson]} берет $text вилку")
        i++

        mas[NumbPerson] = "Взял"
    }

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
