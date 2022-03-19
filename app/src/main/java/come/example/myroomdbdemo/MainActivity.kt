package come.example.myroomdbdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import come.example.myroomdbdemo.database.ProductDB
import come.example.myroomdbdemo.databinding.ActivityMainBinding
import come.example.myroomdbdemo.entity.Product
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productDao = ProductDB.getInstance(applicationContext).productDatabaseDao

        binding.btnInsert.setOnClickListener(){
            val pro = Product(0,"Iphone", 3500.00)

            CoroutineScope(IO).launch {
                productDao.insertProduct(pro)
            }
        }
        binding.btnRead.setOnClickListener(){

            val proList = productDao.getAllProduct()

        }
    }
}