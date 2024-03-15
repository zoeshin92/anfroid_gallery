package fastcampus.part1.chapter8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fastcampus.part1.chapter8.databinding.ActivityFrameBinding

class FrameActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFrameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrameBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}