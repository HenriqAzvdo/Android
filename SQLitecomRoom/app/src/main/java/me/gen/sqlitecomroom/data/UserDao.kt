package me.gen.sqlitecomroom.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.gen.sqlitecomroom.Usuario

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser(usuario: Usuario)

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun selectUsers(): LiveData<List<Usuario>>

}