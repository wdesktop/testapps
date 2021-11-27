package wdesktop.testapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate - В песчаных степях аравийской земли")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart - Три гордые пальмы высоко росли")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume - Родник между ними из почвы бесплодной,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause - Журча, пробивался волною холодной,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop - Хранимый, под сенью зеленых листов,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy - От знойных лучей и летучих песков.")
    }
}