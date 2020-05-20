package kz.btsd.patterns.creations.factorymethod.own.problem

class Notifier {
    fun notifyUser() {
        println("User found")
        val emailSender = EmailSender()
        emailSender.send("-Some text-")
        println("End of notification")
    }
}