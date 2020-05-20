package kz.btsd.patterns.creations.factorymethod.solution

class RoadLogistic : Logistic() {
    override fun createTransport() = Truck()
}