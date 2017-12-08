package jp.co.furusho.nxtcontroller

import android.bluetooth.BluetoothAdapter
import android.content.Context
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_control.*
import kotlinx.android.synthetic.main.fragment_control.*

class ControlActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        var mBluetoothAdapter:BluetoothAdapter = BluetoothAdapter.getDefaultAdapter()

        if (mBluetoothAdapter.isEnabled){

            applicationContext.toast("Bluetoothは有効です")
        }else{
            applicationContext.toast("Bluetoothは無効です")
        }


    }

    fun Context.toast(message: CharSequence) =
            Toast.makeText(this, message,Toast.LENGTH_SHORT).show()

}
