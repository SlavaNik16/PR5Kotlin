fun main(args: Array<String>) {
    println("Треугольник и точка. Методом векторного произведения")

    var triangle = Triagnle(2.5,3.6,
                            2.7,1.7,
                            2.9,2.6);
    triangle.Result(3.0,2.6)

    var triangle1 = Triagnle(1.0,4.6,
                            5.7,5.6,
                            3.4,2.4);
    triangle1.Result(3.2,2.6)

    var triangle2 = Triagnle(2.0,5.0,
                            3.0,7.0,
                            1.0,8.0);
    triangle2.Result(3.0,5.0)

    println("Введите первую вершину: ")
    var point1 = Point()
    println("Введите вторую вершину: ")
    var point2 = Point()
    println("Введите третью вершину: ")
    var point3 = Point()
    println("Введите точку: ")
    var point4 = Point()

    var primer1 = Triagnle(point1.x,point1.y,
                           point2.x,point2.y,
                           point3.x,point3.y)
    primer1.Result(point4.x,point4.y)



}