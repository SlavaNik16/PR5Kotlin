class Philosof {
    var Name: String  = "Не задано"
    var Fork = 1
    var MasPhil: Array<Philosof> = arrayOf()

    constructor(name: String){
        Name = name

    }

    constructor(Count: Int) {
        for(n in 1..Count) {
            print("Введите имя $n философа: ");
            Name = readln()
            var pholosof = Philosof(Name)
            MasPhil += pholosof
        }
    }

    fun ReturnMas(): Array<Philosof> {
        return MasPhil
    }

}