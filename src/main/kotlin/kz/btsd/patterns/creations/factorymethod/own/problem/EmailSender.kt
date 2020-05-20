package kz.btsd.patterns.creations.factorymethod.own.problem

class EmailSender {
    fun send(msg: String) {
        println("Email has been sent {$msg}")
    }
}