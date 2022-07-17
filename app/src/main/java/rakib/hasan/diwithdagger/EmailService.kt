package rakib.hasan.diwithdagger

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to: String, from: String, body:String)
}

class EmailService @Inject constructor() : NotificationService{
    private val TAG = EmailService::class.java.simpleName

    override fun send(to: String, from: String, body:String){
        Log.v(Const.UNIVERSAL_TAG, "Email send successfully!")
    }
}

class MassageService @Inject constructor() : NotificationService{
    private val TAG = MassageService::class.java.simpleName

    override fun send(to: String, from: String, body: String) {
        Log.v(Const.UNIVERSAL_TAG, "Massage send successfully!")
    }
}