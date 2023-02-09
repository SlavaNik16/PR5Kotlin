import com.sun.javafx.collections.MappingChange
import kotlin.random.Random

class Train {
    var CountWagons = 0
    var countPeople = 0
    var wagons: MutableMap<String, Int> = mutableMapOf()
    constructor(rndPeple: Int){
        countPeople = rndPeple
    }

    fun FormWagons(): MutableMap<String,Int>{
        while(countPeople > 0){
            var WagonsLimit = Random.nextInt(5,26)
            wagons.put("Вагон ${CountWagons+1}",WagonsLimit);
            var n = wagons["Вагон ${CountWagons+1}"]
            if (n != null) {
                if(countPeople-n < 0)
                    wagons["Вагон ${CountWagons+1}"] = countPeople
                countPeople -= n
            }
            CountWagons++
        }
        wagons.onEach { println("${it.key} - ${it.value} чел.") }
        return wagons
    }
}