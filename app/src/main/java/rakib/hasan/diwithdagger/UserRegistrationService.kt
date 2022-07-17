package rakib.hasan.diwithdagger

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageServiceQualifier private val notificationService: NotificationService
    ) {
    private val TAG = UserRegistrationService::class.java.simpleName

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply.rakib@gmail.com", "User registered!")
    }
}