interface Bus {
    val brand: String
    val yearOfRelease: Int
    val seats: Int
    val routeNumber: Int

    fun move() {
        println("Автобус $brand едет")
    }
    fun stop() {
        println("Автобус остановился")
    }
}
class CityBus(override val brand: String, override val yearOfRelease: Int,
              override val seats: Int, override val routeNumber: Int, _maxSpeed: Int, _conditioner: Boolean, _dateOfInspection: Int):Bus {
    val maxSpeed: Int = _maxSpeed
    val conditioner: Boolean = _conditioner
    var dateOfInspection = _dateOfInspection
    fun goToInspection() {
        dateOfInspection = 2023
    }

}
class IntercityBus(_cost: Int, _height: Double) {
    val cost: Int = _cost
    val height: Double = _height
}

fun main() {
    val bus1 = CityBus("MAN", 2015, 52, 1, 60, true, 2020)
    bus1.move()
    bus1.goToInspection()
    println(bus1.dateOfInspection)
    val bus2 = IntercityBus(250, 2.45)
    println(bus2.height)
}