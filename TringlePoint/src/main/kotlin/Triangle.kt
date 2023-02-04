class Triangle {
    var count = 0
    var s1:Double = 0.0
    var s2: Double =0.0

    var A: Pair<Double,Double> = Pair(0.0,0.0)
    var B = A.copy()
    var C = A.copy()
    var D = A.copy()

    constructor(x1:Double,y1:Double,
                x2:Double,y2:Double,
                x3:Double,y3:Double,
                xD: Double, yD:Double){
        A = Pair(x1,y1)
        B = Pair(x2,y2)
        C = Pair(x3,y3)
        D = Pair(xD,yD)
    }

    fun Result(): Boolean {
        count = 0
        s2 = (D.second - A.second) / (B.second - A.second)
        s1 = A.first - D.first + s2 * (B.first - A.first)
        if (s1 >= 0 && s2 >= 0 && s2 <= 1) count++

        s2 = (D.second - B.second) / (C.second - B.second)
        s1 = B.first - D.first + s2 * (C.first - B.first)
        if (s1 >= 0 && s2 >= 0 && s2 <= 1) count++

        if (count < 2) {
            s2 = (D.second - C.second) / (A.second - C.second)
            s1 = C.first - D.first + s2 * (A.first - C.first)
            if (s1 >= 0 && s2 >= 0 && s2 <= 1) count++
        }
        return count == 1
    }
    var Z: Double = 0.0
    var Ua: Double = 0.0
    var Ub: Double = 0.0
    fun Crossings(): Boolean{
        Z  = (D.second - C.second) * (B.first - A.first) - (D.first - C.first) * (B.second - A.second);
        Ua = ((D.first - C.first) * (A.second - C.second) - (D.second - C.second)*(A.first - C.first))/Z
        Ub = ((B.first - A.first) * (A.second - C.second) - (B.second - A.second)*(A.first - C.first))/Z
        return (Ua >= 0 && Ua <= 1 && Ub >= 0 && Ub <= 1)
    }
}