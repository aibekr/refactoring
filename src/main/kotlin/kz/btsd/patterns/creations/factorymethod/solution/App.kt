package kz.btsd.patterns.creations.factorymethod.solution

class App(
    private val logistic: Logistic
) {

    fun run() {
        printLogo()

        logistic.planDelivery()

        printEndOfProg()
    }

    private fun printLogo() {
        println()
        println("  x    xxx  xxxx  x  xxxxx  xxxxx  x  xxxxx  ")
        println("  x    x x  x     x  x        x    x  x   x  ")
        println("  x    x x  x xx  x  xxxxx    x    x  x      ")
        println("  x    x x  x  x  x      x    x    x  x   x  ")
        println("  xxx  xxx  xxxx  x  xxxxx    x    x  xxxxx  ")
        println()
    }

    private fun printEndOfProg() {
        println("-----------------------------------------------")
        println("-----                                    ------")
        println("-----                                    ------")
        println("-----------------------------------------------")
    }
}