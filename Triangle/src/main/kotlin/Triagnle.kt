class Triagnle {
    var s1: Double = 0.0
    var s2: Double = 0.0
    var s3: Double = 0.0
    var A = Pair(0.0,0.0)
    var B = A.copy()
    var C = A.copy()

    constructor(x1:Double,y1:Double,
                x2:Double,y2:Double,
                x3:Double,y3:Double){
        A = Pair(x1,y1)
        B = Pair(x2,y2)
        C = Pair(x3,y3)
    }

    fun Result(PointX:Double,PointY: Double) {
        s1 = (A.first - PointX) * (B.second - A.second) - (B.first - A.first) * (A.second - PointY)
        s2 = (B.first - PointX) * (C.second - B.second) - (C.first - B.first) * (B.second - PointY)
        s3 = (C.first - PointX) * (A.second - C.second) - (A.first - C.first) * (C.second - PointY)
        if ((s1 >= 0.0 && s2 >= 0.0 && s3 >= 0.0) || (s1 <= 0.0 && s2 <= 0.0 && s3 <= 0.0)){
            println("Точка лежит ВНУТРИ треугольника")
        }else {
            println("Точка лежит ВНЕ треугольника")
        }
    }
}