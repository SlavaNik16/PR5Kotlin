fun main(args: Array<String>) {
    println("Треугольник и точка")

    /*
    println("Введите первую вершину: ")
    println("Координата X =  ")
    var x1: Double = readln().toDouble()
    println("Координата Y =  ")
    var y1: Double = readln().toDouble()

    println("Введите вторую вершину: ")
    println("Координата X =  ")
    var x2: Double = readln().toDouble()
    println("Координата Y =  ")
    var y2: Double = readln().toDouble()

    println("Введите третью вершину: ")
    println("Координата X =  ")
    var x3: Double = readln().toDouble()
    println("Координата Y =  ")
    var y3: Double = readln().toDouble()

    println("Введите точку: ")
    println("Координата X =  ")
    var xD: Double = readln().toDouble()
    println("Координата Y =  ")
    var yD: Double = readln().toDouble()
*/
    //var triangle = Triangle(x1,y1,x2,y2,x3,y3,xD,yD);
    //var triangle = Triangle(2.5,3.6,
                           // 2.7,1.7,
                           // 2.9,2.6,
                            //2.8,2.5);

    var triangle = Triangle(2.5,3.6,
            2.7,1.7,
            2.9,2.6,
            2.9,2.6);
    if(triangle.Result()){
        println("Точка лежит ВНУТРИ треульника")
    }else{
        println("Точка лежит ВНЕ треульника")
    }

    if(triangle.Crossings()){
        println("Точка лежит ВНУТРИ треульника")
    }else{
        println("Точка лежит ВНЕ треульника")
    }



}