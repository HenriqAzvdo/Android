package me.gen.sqlitecomroom.data

import me.gen.sqlitecomroom.Usuario

class UserRepository(private val userDao: UserDao) {

    val selectUsers = userDao.selectUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }

}