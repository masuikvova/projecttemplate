package masuikvova.projecttemplate

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.masuikvova.domain.entities.DataWrapper
import masuikvova.projecttemplate.login.LoginViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var modelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TemplateApplication.appComponent.inject(this)

        viewModel = ViewModelProviders.of(this, modelFactory).get(LoginViewModel::class.java)

        findViewById<Button>(R.id.button).setOnClickListener {

            viewModel.login("fdf", "fdsfds")
        }

        viewModel.loginLiveData.observe(this, Observer { it ->
            when (it) {
                is DataWrapper.Loading -> {
                    Log.v("TAGG", "" + it)
                }
                is DataWrapper.Error -> {
                    Log.v("TAGG", "" + it)
                }
                is DataWrapper.Success -> {
                    Log.v("TAGG", "" + it)
                    findViewById<TextView>(R.id.test).text = it.data
                }
            }
        })

    }
}
