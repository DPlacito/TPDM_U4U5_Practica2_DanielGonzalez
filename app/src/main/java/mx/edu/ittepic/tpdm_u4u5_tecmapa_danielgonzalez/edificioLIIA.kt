package mx.edu.ittepic.tpdm_u4u5_tecmapa_danielgonzalez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_edificio_lii.*

class edificioLIIA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edificio_lii)
        setSupportActionBar(cabezera_liia)
        title = "Edificio LIIA"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    //Regresar
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return if (item?.itemId == android.R.id.home) {
            finish()
            true
        } else
            super.onOptionsItemSelected(item)
    }
}

