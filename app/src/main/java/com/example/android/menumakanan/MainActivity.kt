package com.example.android.menumakanan

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

//    private lateinit var jmlNg

    private var jmlNg = 0
    private var jmlMg = 0
    private var jmlAbn = 0
    private var jmlAgn = 0
    private var jmlTm = 0
    private var jmlAm250 = 0
    private var jmlAm600 = 0
    private var jmlAj = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_byr.isEnabled=false
        btn_hitung.setOnClickListener{hitung()}
        btn_byr.setOnClickListener{byr()}
    }

    private fun hitung():Int{

        // Menghitung Makanan
        if (cb_Ng.isChecked){
            if (et_Ng.text.isNotEmpty()){
                jmlNg = et_Ng.text.toString().toInt() * 15000
            }
            else {
                val myToust = Toast.makeText(this, "Mohon Isi Jumlah Pesanan Nasi Goreng",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
        }else{
            if (et_Ng.text.isNotEmpty()){
                val myToust = Toast.makeText(this, "Mohon ceklis dulu",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
            else {
                jmlNg = 0
            }
        }

        if (cb_Mg.isChecked){
            if (et_Mg.text.isNotEmpty()){
                jmlMg = et_Mg.text.toString().toInt() * 12000
            }
            else {
                val myToust = Toast.makeText(this, "Mohon Isi Jumlah Pesanan Mie Goreng",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
        }else{
            if (et_Mg.text.isNotEmpty()){
                val myToust = Toast.makeText(this, "Mohon ceklis dulu",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
            else {
                jmlMg = 0
            }
        }

        if (cb_Abn.isChecked){
            if (et_Abn.text.isNotEmpty()){
                jmlAbn = et_Abn.text.toString().toInt() * 16000
            }
            else {
                val myToust = Toast.makeText(this, "Mohon Isi Jumlah Pesanan Ayam Bakar",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
        }else{
            if (et_Abn.text.isNotEmpty()){
                val myToust = Toast.makeText(this, "Mohon ceklis dulu",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
            else {
                jmlAbn = 0
            }
        }

        if (cb_Agn.isChecked){
            if (et_Agn.text.isNotEmpty()){
                jmlAgn = et_Agn.text.toString().toInt() * 15000
            }
            else {
                val myToust = Toast.makeText(this, "Mohon Isi Jumlah Pesanan Ayam Goreng",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
        }else{
            if (et_Agn.text.isNotEmpty()){
                val myToust = Toast.makeText(this, "Mohon ceklis dulu",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
            else {
                jmlAgn = 0
            }
        }




        // Menghitung Minuman
        if (cb_Tm.isChecked){
            if (et_Tm.text.isNotEmpty()){
                jmlTm = et_Tm.text.toString().toInt() * 5000
            }
            else {
                val myToust = Toast.makeText(this, "Mohon Isi Jumlah Pesanan Teh Manis",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
        }else{
            if (et_Tm.text.isNotEmpty()){
                val myToust = Toast.makeText(this, "Mohon ceklis dulu",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
            else {
                jmlTm = 0
            }
        }

        if (cb_Am250.isChecked){
            if (et_Am250.text.isNotEmpty()){
                jmlAm250 = et_Am250.text.toString().toInt() * 1000
            }
            else {
                val myToust = Toast.makeText(this, "Mohon Isi Jumlah Pesanan Air Mineral 250ml",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
        }else{
            if (et_Am250.text.isNotEmpty()){
                val myToust = Toast.makeText(this, "Mohon ceklis dulu",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
            else {
                jmlAm250 = 0
            }
        }

        if (cb_Am600.isChecked){
            if (et_Am600.text.isNotEmpty()){
                jmlAm600 = et_Am600.text.toString().toInt() * 4000
            }
            else {
                val myToust = Toast.makeText(this, "Mohon Isi Jumlah Pesanan Air Mineral 600ml",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
        }else{
            if (et_Am600.text.isNotEmpty()){
                val myToust = Toast.makeText(this, "Mohon ceklis dulu",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
            else {
                jmlAm600 = 0
            }
        }

        if (cb_Aj.isChecked){
            if (et_Aj.text.isNotEmpty()){
                jmlAj = et_Aj.text.toString().toInt() * 6000
            }
            else {
                val myToust = Toast.makeText(this, "Mohon Isi Jumlah Pesanan Air Jeruk",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
        }else{
            if (et_Aj.text.isNotEmpty()){
                val myToust = Toast.makeText(this, "Mohon ceklis dulu",
                    Toast.LENGTH_SHORT)
                myToust.setGravity(Gravity.CENTER, 0,0)
                myToust.show()
            }
            else {
                jmlAj = 0
            }
        }

        val totalMakanan = jmlNg+jmlMg+jmlAbn+jmlAgn
        val totalMinuman = jmlTm+jmlAm250+jmlAm600+jmlAj
        val total = totalMakanan+totalMinuman
        tv_totalMak.text = totalMakanan.toString()
        tv_totalMin.text = totalMinuman.toString()
        tv_totalSel.text = total.toString()

        btn_byr.isEnabled = total != 0

        return total
    }

    private fun byr(){
        if (et_ub.text.isNotEmpty()) {
            val total = hitung()
            val uangKembali = et_ub.text.toString().toInt() - total
            val uangKurang = total - et_ub.text.toString().toInt()

            val myToust1 = Toast.makeText(this, "Terimakasih Uang Kembalian Anda "+uangKembali,
                Toast.LENGTH_SHORT)
            myToust1.setGravity(Gravity.CENTER, 0,0)

            val myToust2 = Toast.makeText(this, "Mohon Maaf Uang Anda Kurang "+uangKurang,
                Toast.LENGTH_SHORT)
            myToust2.setGravity(Gravity.CENTER, 0,0)

            val myToust3 = Toast.makeText(this, "Terimakasih Atas Kunjungan Anda",
                Toast.LENGTH_SHORT)
            myToust3.setGravity(Gravity.CENTER, 0,0)

            when {
                et_ub.text.toString().toInt() > total -> myToust1.show()
                et_ub.text.toString().toInt() < total -> myToust2.show()
                else -> myToust3.show()
            }
        }else {
            val myToust = Toast.makeText(
                this, "Mohon Masukan Uang Bayar",
                Toast.LENGTH_SHORT
            )
            myToust.setGravity(Gravity.CENTER, 0, 0)
            myToust.show()
        }
    }
}
