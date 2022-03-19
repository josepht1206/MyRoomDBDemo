package come.example.myroomdbdemo.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "productTable" )
data class Product(
    @PrimaryKey (autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "Description")
    var name:String = "",
    @ColumnInfo(name = "price")
    var price:Double = 0.0
)

