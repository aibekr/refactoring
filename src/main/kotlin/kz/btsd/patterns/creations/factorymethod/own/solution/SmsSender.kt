package kz.btsd.patterns.creations.factorymethod.own.solution

class SmsSender : MsgSender{
    override fun send(msg: String) {
        println("Sms has been sent {$msg}")
    }
}