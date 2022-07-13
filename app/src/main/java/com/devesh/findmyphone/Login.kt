package com.devesh.findmyphone

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun buttonRegisterEvent(view: View){
        val userData=UserData(this)
        userData.savePhone(R.id.editTextPhone.toString())
        finish()
    }


}