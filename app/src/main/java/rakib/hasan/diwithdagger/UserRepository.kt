package rakib.hasan.diwithdagger

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}

class RoomRepository @Inject constructor(): UserRepository{
    private val TAG = RoomRepository::class.java.simpleName

    override fun saveUser(email: String, password: String) {
        Log.v(Const.UNIVERSAL_TAG, "User saved in Room!")
    }
}

class FirebaseRepository @Inject constructor(): UserRepository{
    private val TAG = FirebaseRepository::class.java.simpleName

    override fun saveUser(email: String, password: String) {
        Log.v(Const.UNIVERSAL_TAG, "User saved in Firebase!")
    }

}