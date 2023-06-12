package com.example.capstonetrial

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capstonetrial.databinding.ActivityCameraMenuBinding
import com.example.capstonetrial.ml.Model
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.io.File

class CameraMenuActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCameraMenuBinding
    private var getFile: File? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCameraMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extra = intent.extras
        if(extra!=null){
            val image = File(extra.getString("preview"))
            getFile = image
            binding.previewGambar.setImageBitmap(BitmapFactory.decodeFile(image.path))
        }
        binding.buttonScan.setOnClickListener{
        }
    }

    fun imageClassification(){
        if (getFile!=null){


        }
    }
}