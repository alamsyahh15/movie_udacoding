package com.hafid.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    
    private lateinit var presenter : LoginPresenter   //Lalu untuk ini tadi kelebihan e nya mas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        presenter = LoginPresenter(this) //Di bagian ini kita tambahkan this untuk memanggil contextnya nanti tinggal di let aja untuk memanggil view nya
        
    }
}
