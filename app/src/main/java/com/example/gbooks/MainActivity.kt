package com.example.gbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gbooks.databinding.ActivityMainBinding
import org.json.JSONObject

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeBookData: Array<JSONObject> = arrayOf(
            JSONObject("{\"titulo\": \"Dracula\", \"Autor\": \"Bram Stoker\"}"),
            JSONObject("{\"titulo\": \"La llamada de Cthulhu y otros cuentos de terror\", \"Autor\": \"H.P. Lovecraft\"}"),
            JSONObject("{\"titulo\": \"El ingenioso hidalgo don Quijote de la Mancha\", \"Autor\": \"Miguel de Cervantes Saavedra\"}"),
            JSONObject("{\"titulo\": \"El cuervo\", \"Autor\": \"Edgar Allan Poe\"}"),
            JSONObject("{\"titulo\": \"Viaje al centro de la tierra\", \"Autor\": \"Julio Verne\"}"),
            JSONObject("{\"titulo\": \"Dracula\", \"Autor\": \"Bram Stoker\"}"),
            JSONObject("{\"titulo\": \"La llamada de Cthulhu y otros cuentos de terror\", \"Autor\": \"H.P. Lovecraft\"}"),
            JSONObject("{\"titulo\": \"El ingenioso hidalgo don Quijote de la Mancha\", \"Autor\": \"Miguel de Cervantes Saavedra\"}"),
            JSONObject("{\"titulo\": \"El cuervo\", \"Autor\": \"Edgar Allan Poe\"}"),
            JSONObject("{\"titulo\": \"Viaje al centro de la tierra\", \"Autor\": \"Julio Verne\"}"),
        )
        binding.rvBooksItems.adapter = MainAdapter(fakeBookData)
    }
}