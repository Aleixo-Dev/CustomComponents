package br.com.nicolas.customcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import br.com.nicolas.customcomponents.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            progressButtonScreen.setOnClickListener {
                progressButtonScreen.setLoading()
                lifecycleScope.launch {
                    delay(3_000)
                    progressButtonScreen.setNormal()
                }
            }
        }
    }
}