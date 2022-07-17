package rakib.hasan.diwithdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerUserRegistrationComponent = DaggerUserRegistrationComponent.builder().build()
        daggerUserRegistrationComponent.inject(this)
        userRegistrationService.registerUser("rakibhasan1030@gamil.com", "pass1234")
    }
}