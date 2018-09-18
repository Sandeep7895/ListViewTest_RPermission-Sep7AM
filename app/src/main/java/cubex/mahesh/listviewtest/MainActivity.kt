package cubex.mahesh.listviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var path = "/storage/sdcard0/"
        var file = File(path)
        if(!file.exists())
        {
            path="/storage/emulated/0/"
            file=File(path)
        }
        var files = file.list()
        var adapter = ArrayAdapter<String>(
                this@MainActivity,
                R.layout.indiview,files)
        lview.adapter = adapter
    }
}
