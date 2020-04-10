package mx.edu.ittepic.tpdm_u4u5_tecmapa_danielgonzalez

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var markerMap = HashMap<String, String>()
    lateinit var mapFragment : SupportMapFragment
    lateinit var mapaGoogle: GoogleMap

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(cabezera_Mapa)
        title = "Mapa Tecnologico"

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(OnMapReadyCallback {
            mapaGoogle = it
            mapaGoogle.isMyLocationEnabled = true //GPS
            mapaGoogle.uiSettings.isZoomControlsEnabled = true // Activar Zoom
            mapaGoogle.mapType = GoogleMap.MAP_TYPE_SATELLITE

            val localizacion1 = LatLng(21.478878,-104.865086)
            mapaGoogle.addMarker(MarkerOptions().position(localizacion1).title("TEC TEPIC").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
            mapaGoogle.animateCamera(CameraUpdateFactory.newLatLngZoom(localizacion1,16f))

            val localizacion2 = LatLng(21.477589,-104.866812)
            val baston :Marker =  mapaGoogle.addMarker(MarkerOptions().position(localizacion2).title("Edificio Baston").snippet("Presiona Para Ver Mas"))
            val idUno: String = baston.getId()
            markerMap.put(idUno, "lugar_uno")

            val localizacion3 = LatLng(21.478014,-104.867080)
            val laboratorioSistemas :Marker =   mapaGoogle.addMarker(MarkerOptions().position(localizacion3).title("Laboratorio De Computo").snippet("Presiona Para Ver Mas"))
            val idDos: String = laboratorioSistemas.getId()
            markerMap.put(idDos, "lugar_dos")

            val localizacion4 = LatLng(21.477764,-104.866023)
            val ud : Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion4).title("Edificio UD").snippet("Presiona Para Ver Mas"))
            val idTres: String = ud.getId()
            markerMap.put(idTres, "lugar_tres")

            val localizacion5 = LatLng(21.478169,-104.867920)
            val uvp : Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion5).title("Edificio UVP").snippet("Presiona Para Ver Mas"))
            val idCuatro: String = uvp.getId()
            markerMap.put(idCuatro, "lugar_cuatro")

            val localizacion6 = LatLng(21.478838,-104.867544)
            val maestriaAlimentos: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion6).title("Edificio LIIA").snippet("Presiona Para Ver Mas"))
            val idCinco: String = maestriaAlimentos.getId()
            markerMap.put(idCinco, "lugar_cinco")

            val localizacion7 = LatLng(21.478580,-104.865178)
            val biblioteca: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion7).title("Biblioteca").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)).snippet("Presiona Para Ver Mas"))
            val idSeis: String = biblioteca.getId()
            markerMap.put(idSeis, "lugar_seis")

            val localizacion8 = LatLng(21.478571,-104.865612)
            val administracion: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion8).title("Edificio Administracion").snippet("Presiona Para Ver Mas"))
            val idSiete: String = administracion.getId()
            markerMap.put(idSiete, "lugar_siete")

            val localizacion9 = LatLng(21.478781,-104.866083)
            val cafeteria : Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion9).title("Cafeteria").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet("Presiona Para Ver Mas"))
            val idOcho: String = cafeteria.getId()
            markerMap.put(idOcho, "lugar_ocho")

            val localizacion10 = LatLng(21.479351,-104.865802)
            val kiosko : Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion10).title("Kiosko").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet("Presiona Para Ver Mas"))
            val idNueve: String = kiosko.getId()
            markerMap.put(idNueve, "lugar_nueve")

            val localizacion11 = LatLng(21.479559,-104.866996)
            val licbi : Marker =mapaGoogle.addMarker(MarkerOptions().position(localizacion11).title("Edificio LICBI").snippet("Presiona Para Ver Mas"))
            val idDiez: String = licbi.getId()
            markerMap.put(idDiez, "lugar_diez")

            val localizacion12 = LatLng(21.479554,-104.865775)
            val audiovisual: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion12).title("Audiovisual").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet("Presiona Para Ver Mas"))
            val id11: String = audiovisual.getId()
            markerMap.put(id11, "lugar_11")

            val localizacion13 = LatLng(21.478364,-104.864655)
            val arquitectura: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion13).title("Edificio Arquitectura").snippet("Presiona Para Ver Mas"))
            val id12: String = arquitectura.getId()
            markerMap.put(id12, "lugar_12")

            val localizacion14 = LatLng(21.478762,-104.864794)
            val n: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion14).title("Edificio N").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id13: String = n.getId()
            markerMap.put(id13, "lugar_13")

            val localizacion15 = LatLng(21.478870,-104.865124)
            val x: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion15).title("Edificio X").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id14: String = x.getId()
            markerMap.put(id14, "lugar_14")

            val localizacion16 = LatLng(21.479067,-104.864956)
            val a: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion16).title("Edificio A").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id15: String = a.getId()
            markerMap.put(id15, "lugar_15")

            val localizacion17 = LatLng(21.479338,-104.865086)
            val g: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion17).title("Edificio G").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id16: String = g.getId()
            markerMap.put(id16, "lugar_16")

            val localizacion18 = LatLng(21.479559,-104.865029)
            val q: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion18).title("Edificio Q").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id17: String = q.getId()
            markerMap.put(id17, "lugar_17")

            val localizacion19 = LatLng(21.479559,-104.865029)
            val bg: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion19).title("Edificio BG").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id18: String = bg.getId()
            markerMap.put(id18, "lugar_18")

            val localizacion20 = LatLng(21.481026,-104.865283)
            val domo: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion20).title("Domo Deportivo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)).snippet("Presiona Para Ver Mas"))
            val id19: String = domo.getId()
            markerMap.put(id19, "lugar_19")

            val localizacion21 = LatLng(21.479721,-104.865727)
            val b: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion21).title("Edificio B").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id20: String = b.getId()
            markerMap.put(id20, "lugar_20")

            val localizacion22 = LatLng(21.479538,-104.865803)
            val p: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion22).title("Edificio P").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id21: String = p.getId()
            markerMap.put(id21, "lugar_21")

            val localizacion23 = LatLng(21.479314,-104.866111)
            val h: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion23).title("Edificio H").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id22: String = h.getId()
            markerMap.put(id22, "lugar_22")

            val localizacion24 = LatLng(21.479119,-104.866191)
            val j: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion24).title("Edificio J").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id23: String = j.getId()
            markerMap.put(id23, "lugar_23")

            val localizacion25 = LatLng(21.478964,-104.866708)
            val f: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion25).title("Edificio F").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id24: String = f.getId()
            markerMap.put(id24, "lugar_24")

            val localizacion26 = LatLng(21.478737,-104.866414)
            val s: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion26).title("Edificio S").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id25: String = s.getId()
            markerMap.put(id25, "lugar_25")

            val localizacion27 = LatLng(21.478921,-104.866356)
            val k: Marker = mapaGoogle.addMarker(MarkerOptions().position(localizacion27).title("Edificio K").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Presiona Para Ver Mas"))
            val id26: String = k.getId()
            markerMap.put(id26, "lugar_26")




            mapaGoogle.setOnInfoWindowClickListener(OnInfoWindowClickListener { marker ->
                val actionId = markerMap[marker.id]
                if (actionId == "lugar_uno") {
                    val i = Intent(this@MainActivity, Main2Activity::class.java)
                    startActivity(i)
                } else if (actionId == "lugar_dos") {
                    val i = Intent(this@MainActivity, laboratorioDeComputo::class.java)
                    startActivity(i)
                }else if (actionId == "lugar_tres") {
                    val i = Intent(this@MainActivity, edificioUD::class.java)
                    startActivity(i)
                }else if (actionId == "lugar_cuatro") {
                    val i = Intent(this@MainActivity, edificioUVP::class.java)
                    startActivity(i)
                } else if (actionId == "lugar_cinco") {
                    val i = Intent(this@MainActivity, edificioLIIA::class.java)
                    startActivity(i)
                } else if (actionId == "lugar_seis") {
                    val i = Intent(this@MainActivity, edificioBiblioteca::class.java)
                    startActivity(i)
                } else if (actionId == "lugar_siete") {
                    val i = Intent(this@MainActivity, edificioAdministracion::class.java)
                    startActivity(i)
                }else if (actionId == "lugar_ocho") {
                    val i = Intent(this@MainActivity, Main_Cafeteria::class.java)
                    startActivity(i)
                } else if (actionId == "lugar_nueve") {
                    val i = Intent(this@MainActivity, Main_Kiosko::class.java)
                    startActivity(i)
                }else if (actionId == "lugar_diez") {
                    val i = Intent(this@MainActivity, Main_LICBI::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_diez") {
                    val i = Intent(this@MainActivity, Main_LICBI::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_11") {
                    val i = Intent(this@MainActivity, Main_Audiovisual::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_12") {
                    val i = Intent(this@MainActivity, Main_Arquitectura::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_13") {
                    val i = Intent(this@MainActivity, Main_N::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_14") {
                    val i = Intent(this@MainActivity, Main_X::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_15") {
                    val i = Intent(this@MainActivity, Main_A::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_16") {
                    val i = Intent(this@MainActivity, Main_G::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_17") {
                    val i = Intent(this@MainActivity, Main_Q::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_18") {
                    val i = Intent(this@MainActivity, Main_BG::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_19") {
                    val i = Intent(this@MainActivity, Main_DomoDeportivo::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_20") {
                    val i = Intent(this@MainActivity, Main_B::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_21") {
                    val i = Intent(this@MainActivity, Main_P::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_22") {
                    val i = Intent(this@MainActivity, Main_H::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_23") {
                    val i = Intent(this@MainActivity, Main_J::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_24") {
                    val i = Intent(this@MainActivity, Main_F::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_25") {
                    val i = Intent(this@MainActivity, Main_S::class.java)
                    startActivity(i)
                }
                else if (actionId == "lugar_26") {
                    val i = Intent(this@MainActivity, Main_K::class.java)
                    startActivity(i)
                }
            })
        })
        permiso()
    }
    private fun permiso(){
        if(ActivityCompat.checkSelfPermission(this,
                android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST_CODE)
            return
        }
    }
}
