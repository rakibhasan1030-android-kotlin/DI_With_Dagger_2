package rakib.hasan.diwithdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.stream.DoubleStream.builder
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerUserRegistrationComponent = (application as App).userRegistrationComponent
        daggerUserRegistrationComponent.inject(this)
        userRegistrationService.registerUser("rakibhasan1030@gamil.com", "pass1234")
    }
}