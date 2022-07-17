package rakib.hasan.diwithdagger

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {


    /**
     * if Dagger can make a object its self, then we will annotate it with Binds
     * */
    @Binds
    abstract fun getRoomRepository(roomRepository: RoomRepository): UserRepository
}