package com.lioncho.myanmar_study_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lioncho.myanmar_study_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding 객체 추출
        binding = ActivityMainBinding.inflate(layoutInflater)

        // 화면을 셋팅한다.
        setContentView(binding.root)
    }
}