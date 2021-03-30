package com.example.hackathonuiex.ui.login

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.hackathonuiex.R

class Loginfragment1: Fragment(R.layout.login_fragment) {
    enum class LoginOptions(val choose:Int) { FACEBOOK(1), GOOGLE(2), LOCAL(3);
        companion object {
            fun create(x: Int): LoginOptions {
                return when (x) {
                    1 -> FACEBOOK
                    2 -> GOOGLE
                    3 -> LOCAL
                    else -> throw IllegalStateException()
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setPointer(view)
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
        val loginOption = when (LoginOptions.create(choose)) {
            LoginOptions.FACEBOOK-> loginViaFace()
            LoginOptions.GOOGLE-> loginViaGoogle()
            LoginOptions.LOCAL-> loginViaLocal()
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