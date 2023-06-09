package sebastian.cu.conocimientoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnComenzar : Button = findViewById(R.id.btn_comenzar)
        val etNombre : EditText = findViewById(R.id.eT_nombre)
        btnComenzar.setOnClickListener {

            if(etNombre.text.isEmpty()){

                Toast.makeText(this, "Porfavor ingresa tu nombre", Toast.LENGTH_LONG).show()


            }else{

                val intent = Intent (this, PreguntasActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
    }
}