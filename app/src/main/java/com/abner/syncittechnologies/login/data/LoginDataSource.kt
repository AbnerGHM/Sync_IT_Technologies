package com.abner.syncittechnologies.login.data

import com.abner.syncittechnologies.login.data.model.LoggedInUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        //try {
            // TODO: handle loggedInUser authentication
           // java.util.UUID.randomUUID().toString()

            val fakeUser  = LoggedInUser("1", "Lizeth Cuevas")
            if (username == "Lizbeth" && password == "123456") {


                return Result.Success(fakeUser) // LoggedInUser
            }else{


    //    } catch (e: Throwable) {
           // return Result.Error(IOException("Error logging in", e))
                return Result.Error(IOException("El usuario no existe"))

        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}