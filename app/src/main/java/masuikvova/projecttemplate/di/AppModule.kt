package masuikvova.projecttemplate.di

import android.app.Application
import com.example.masuikvova.data.repository.LoginRepositoryImp
import com.example.masuikvova.domain.repository.LoginRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(val application: Application) {



    @Singleton
    @Provides
    fun provideApplication():Application{
        return application
    }

    @Singleton
    @Provides
    fun provideLoginRepository():LoginRepository{
        return LoginRepositoryImp()
    }
}