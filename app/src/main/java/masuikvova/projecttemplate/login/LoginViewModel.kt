package masuikvova.projecttemplate.login

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.masuikvova.domain.entities.DataWrapper
import com.example.masuikvova.domain.repository.LoginRepository
import javax.inject.Inject

class LoginViewModel @Inject constructor(val loginRepository: LoginRepository) : ViewModel() {

    val loginLiveData = MutableLiveData<DataWrapper<String>>()

    var i = 0;

    fun login(email: String, password: String) {

        if(i == 0)
        loginLiveData.postValue(DataWrapper.Loading())

        if(i == 1)
        loginLiveData.postValue(DataWrapper.Error(Throwable()))

        if(i == 2)
        loginLiveData.postValue(DataWrapper.Success(loginRepository.login(email, password)))

        i++
    }

}