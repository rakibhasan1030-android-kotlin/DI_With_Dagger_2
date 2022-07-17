package rakib.hasan.diwithdagger

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {


    /**
     * if Dagger can not make a object its self, then we will annotate it with Provides
     * */
    @MessageServiceQualifier
    @Provides
    fun getMassageService(): NotificationService{
        return MassageService()
    }

    @Named("email")
    @Provides
    fun getEmailService(): NotificationService{
        return EmailService()
    }
}