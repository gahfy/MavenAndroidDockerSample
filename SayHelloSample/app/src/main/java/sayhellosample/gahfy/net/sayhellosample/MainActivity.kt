package sayhellosample.gahfy.net.sayhellosample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import sayhello.gahfy.net.sayhello.addHelloPrefix

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textview).setText("Gahfy".addHelloPrefix())
    }
}
