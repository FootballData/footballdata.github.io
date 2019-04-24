fun main (args: Array<String>) {

    MySingleton.someFunction(...)

}

object MySingleton {
    fun someFunction(...) {...}
}


//In side de class
class App : Application() {
    companion object {
        lateinit var instance: App
            private set
    }
 
    override fun onCreate() {
        super.onCreate()
        instance = this
    }
 
}