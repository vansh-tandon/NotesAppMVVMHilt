package io.project.notesappmvvm.api

import io.project.notesappmvvm.models.UserRequest
import io.project.notesappmvvm.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {

    // /users/signup is the end pt.
    @POST ("/users/signup")
    //as it is the post rq. we need to send body as well
    suspend fun signup(@Body userRequest: UserRequest) : Response<UserResponse>

    @POST ("/users/signin")
    suspend fun signin(@Body userRequest: UserRequest) : Response<UserResponse>
}

//Now we'll create object of retrofit
//and that is singleton i.e only one obj. throughout the application
//and here hilt will help us to define the singleton

//For hilt we need a application class that will be our entry pt.
