package kz.btsd.patterns.creations.factorymethod.solution

abstract class Logistic {

    open fun planDelivery() {
        println("Started planning Delivery")
        createTransport().deliver()
        println("Successfully delivered")
    }

    abstract fun createTransport(): Transport
}