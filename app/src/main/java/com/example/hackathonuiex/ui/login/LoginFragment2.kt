package com.example.hackathonuiex.ui.login

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.hackathonuiex.R

class LoginFragment2 :Fragment(R.layout.login_fragment2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setPointer()
    }

    private fun setPointer() {
        TODO("Not yet implemented")
    }

    private fun setPointer(view: View) {
        view.findViewById<Button>(R.id.login_facebook_btn).setOnClickListener {
            login(1)
        }
        view.findViewById<Button>(R.id.login_google_btn).setOnClickListener {
            login(2)
        }
        view.findViewById<Button>(R.id.login_local_btn).setOnClickListener {
            login(3)
        }
    }

    private fun login(choose:Int) {
        val loginOption = when (Loginfragment1.LoginOptions.create(choose)) {
            Loginfragment1.LoginOptions.FACEBOOK-> loginViaFace()
            Loginfragment1.LoginOptions.GOOGLE-> loginViaGoogle()
            Loginfragment1.LoginOptions.LOCAL-> loginViaLocal()
        }
    }

    private fun loginViaLocal() {
        //face ush
    }

    private fun loginViaGoogle() {
        TODO("firebase or whatever")
    }

    private fun loginViaFace() {
        //call me if youve som trouble, its can be complicated
    }
}