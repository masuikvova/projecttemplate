package masuikvova.projecttemplate.di

import android.app.Application
import dagger.Component
import masuikvova.projecttemplate.MainActivity
import javax.inject.Singleton


@Singleton
@Component(modules = [(AppModule::class), (ViewModelModule::class)])
interface AppComponent {

    fun application() : Application

    fun inject(activity:MainActivity)
}