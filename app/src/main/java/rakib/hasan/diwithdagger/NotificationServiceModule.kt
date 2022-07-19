package rakib.hasan.diwithdagger

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {


    /**
     * if Dagger can not make a object its self, then we will annotate it with Provides
     * */
    @Singleton
    @MessageServiceQualifier
    @Provides
    fun getMassageService(retryCount: Int): NotificationService{
        return MassageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(): NotificationService{
        return EmailService()
    }
}