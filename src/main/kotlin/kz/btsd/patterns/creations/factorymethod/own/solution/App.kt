package kz.btsd.patterns.creations.factorymethod.own.solution

class App (
    val notifier: Notifier
){
    fun sendMsg(){
        notifier.notifyUser()
    }
}