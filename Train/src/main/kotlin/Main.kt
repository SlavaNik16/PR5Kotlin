import kotlin.random.Random

fun main(args: Array<String>) {
    var i = 1
    var text = "y"
    while(text != "EXIT") {
        println("Поезд№$i")
        println("Шаг 1 - Создать направление")
        var Direction = RandomDirection()
        print("Направление: ${Direction}\n")
        println()
        println("Шаг 2 - Продать билеты")
        var BiletsPeople = Random.nextInt(5, 202)
        println("Продано билетов: $BiletsPeople")
        println()
        println("Шаг 3 - Собрать состав")
        var train = Train(BiletsPeople)
        var wagons = train.FormWagons()
        println()
        println("Шаг 4 - Отправить состав")
        println("Поезд№$i ${Direction}, состоящий из ${wagons.size} вагонов отправлен.")
        println()
        println("Хотите продолжить(EXIT - выход/Иначе - продолжить):")
        text = readln().toUpperCase()
        i++
    }

}

fun RandomDirection(): String{
    val city: List<String> = listOf(
        "Бийск","Барнаул","Санкт-Петербург","Москва","Киев","Токио",
        "Сингапур","Сидней","Мельбурн","Гонконг","Шанхай", "Дубай",
        "Париж","Лондон","Эдинбург","Венеция","Флоренция","Рим")
    var rnd: Int = Random.nextInt(city.size)
    var text = city.get(rnd)
    while(true){
        var rnd2: Int = Random.nextInt(city.size)
        if(rnd != rnd2){
            text += " - ${city.get(rnd2)}"
            break
        }
    }
    return text
}
