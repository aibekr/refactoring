package kz.btsd.patterns.creations.factorymethod.own.solution

abstract class Notifier {

    fun notifyUser() {
        println("User found")
        val sender = sender()
        sender.send("-Some text-")
        println("End of notification")
    }

     abstract fun sender():MsgSender
}