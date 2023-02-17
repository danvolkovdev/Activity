package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class ActivityB : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        findViewById<Button>(R.id.bt_open_activity_c).setOnClickListener{
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }
}