class Philosof {
    var Name: String  = "Не задано"
    var Age:Int = 40
    var Fork = 1
    var MasPhil: Array<Philosof> = arrayOf()

    constructor(name: String){
        Name = name

    }

    constructor(Count: Int) {
        for(n in 1..Count) {
            print("Введите имя $n философа: ");
            Name = readln().toString()
            var pholosof = Philosof(Name)
            MasPhil += pholosof
        }
    }
    constructor(name: String, age: Int){
        Name = name
        Age = age
    }

    fun ReturnMas(): Array<Philosof> {
        return MasPhil
    }

}