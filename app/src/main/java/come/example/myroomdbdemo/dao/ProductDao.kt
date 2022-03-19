package come.example.myroomdbdemo.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import come.example.myroomdbdemo.entity.Product

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(product:Product)

    @Query ("Select * from productTable")
    fun getAllProduct() : List<Product>
}