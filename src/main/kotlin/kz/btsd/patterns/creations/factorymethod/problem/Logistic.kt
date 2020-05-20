package kz.btsd.patterns.creations.factorymethod.problem

class Logistic {
    fun planDelivery() {
        println("Started planning Delivery")
        val truck = Truck()
        truck.deliver()
        println("Successfully delivered")
    }
}
