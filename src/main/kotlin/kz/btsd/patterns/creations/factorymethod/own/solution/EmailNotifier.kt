package kz.btsd.patterns.creations.factorymethod.own.solution

class EmailNotifier :Notifier(){
    override fun sender(): MsgSender {
       return EmailSender()
    }
}