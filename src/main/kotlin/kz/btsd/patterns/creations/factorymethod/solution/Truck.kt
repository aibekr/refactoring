package kz.btsd.patterns.creations.factorymethod.solution

class Truck: Transport {
    override fun deliver() {
        println("Truck is delivering")
    }
}