package kz.btsd.patterns.creations.factorymethod.solution

class SeaLogistic : Logistic() {
    override fun createTransport() = Ship()
}