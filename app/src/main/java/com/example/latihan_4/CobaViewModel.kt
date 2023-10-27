package com.example.latihan_4

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.latihan_4.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel: ViewModel() {
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var emailUsr : String by mutableStateOf("")
        private set
    var AlmtUsr : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var Status : String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm:String,tlp:String,email:String,almt:String,jk:String,stts:String){
        namaUsr=nm;
        noTlp=tlp;
        emailUsr=email;
        AlmtUsr=almt;
        jenisKl=jk;
        Status=stts;
    }

    fun setJenisK(pilihJK:String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
    fun setStatus(pilihStts: String) {
        _uiState.update { currentState -> currentState.copy(status = pilihStts) }

    }
}