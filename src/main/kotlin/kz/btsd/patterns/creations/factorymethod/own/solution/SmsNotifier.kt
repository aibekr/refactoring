package kz.btsd.patterns.creations.factorymethod.own.solution

class SmsNotifier :Notifier(){
    override fun sender(): MsgSender {
       return SmsSender()
    }
}