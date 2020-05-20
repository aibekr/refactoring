package kz.btsd.patterns.creations.factorymethod.own.solution

class EmailSender : MsgSender{
    override fun send(msg: String) {
        println("Email has been sent {$msg}")
    }
}