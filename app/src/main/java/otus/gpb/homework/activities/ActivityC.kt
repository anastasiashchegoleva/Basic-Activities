package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {

    private var button1: Button? = null
    private var button2: Button? = null
    private var button3: Button? = null
    private var button4: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        button1 = findViewById(R.id.openA)
        button1?.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            onNewIntent(intent)
            startActivity(intent)
        }
        button2 = findViewById(R.id.openD)
        button2?.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }
        button3 = findViewById(R.id.closeC)
        button3?.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)

        }
        button4 = findViewById(R.id.closeStack)
        button4?.setOnClickListener {
            finishAffinity()
        }
    }
}
