package kz.btsd.patterns.creations.factorymethod.own.solution

fun main() {
    App(SmsNotifier()).sendMsg()

    App(EmailNotifier()).sendMsg()
}