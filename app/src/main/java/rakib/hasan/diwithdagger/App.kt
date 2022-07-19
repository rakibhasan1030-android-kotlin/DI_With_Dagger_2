package rakib.hasan.diwithdagger

import android.app.Application

class App : Application() {

    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }
}