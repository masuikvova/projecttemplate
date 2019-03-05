package masuikvova.projecttemplate

import android.app.Application
import masuikvova.projecttemplate.di.AppComponent
import masuikvova.projecttemplate.di.AppModule
import masuikvova.projecttemplate.di.DaggerAppComponent

class TemplateApplication :Application() {

    companion object {
        lateinit var appComponent: AppComponent
        lateinit var context: TemplateApplication
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}