package rakib.hasan.diwithdagger

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    /**
     *  Component.Factory is used for creating objects
     */
    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int) : UserRegistrationComponent
    }
}