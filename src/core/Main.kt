package core


fun main() {
    val kamaz = Kamaz5320()
    val vehicle = kamaz as IVehicle
    val maxSpeed = vehicle.getMaxSpeed()
    //maxSpeed is 85

    println(maxSpeed)

}

interface IVehicle {
    fun getMaxSpeed(): Int
}

interface ITruck : IVehicle {
    fun getCapacity(): Int
}

class Kamaz5320 : ITruck {
    override fun getCapacity(): Int {
        return 8000
    }

    override fun getMaxSpeed(): Int {
        return 85
    }

}