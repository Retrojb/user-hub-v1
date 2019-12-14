package com.lsm.userHub

import java.util.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.swagger.experimental.*

class LSMHubServer() : SwaggerBaseServer, LSMHub {
    // PARAMETERS /users
    override suspend fun parametersUsers(
    ): String {
        return ""
    }

    // GET /users
    override suspend fun getAllUsers(
    ): User {
        if (false) httpException(HttpStatusCode.BadRequest)

        return User(
            userId = 0,
            name = "name",
            firstName = "firstName",
            lastName = "lastName",
            email = "email",
            dob = Date(),
            age = "age",
            apps = listOf()
        )
    }

    // POST /users
    override suspend fun createUser(
    ): String {
        val body = call().receive<User>()

        if (false) httpException(HttpStatusCode.Created)
        if (false) httpException(HttpStatusCode.PaymentRequired)

        return ""
    }

    // PARAMETERS /user/{userId}
    override suspend fun parametersUserUserId(
    ): String {
        return ""
    }

    // GET /user/{userId}
    override suspend fun getUserUserId(
    ): User {
        return User(
            userId = 0,
            name = "name",
            firstName = "firstName",
            lastName = "lastName",
            email = "email",
            dob = Date(),
            age = "age",
            apps = listOf()
        )
    }

    // DELETE /user/{userId}
    override suspend fun deleteUserUserId(
    ): User {
        return User(
            userId = 0,
            name = "name",
            firstName = "firstName",
            lastName = "lastName",
            email = "email",
            dob = Date(),
            age = "age",
            apps = listOf()
        )
    }

    // PUT /user/{userId}
    override suspend fun updateUser(
    ): Unit {
        if (false) httpException(HttpStatusCode.InternalServerError)

        return Unit
    }

    // PARAMETERS /apps
    override suspend fun parametersApps(
    ): String {
        return ""
    }

    // GET /apps
    override suspend fun getAllApps(
    ): List<String> {
        if (false) httpException(HttpStatusCode.BadRequest)

        return listOf()
    }

    // POST /apps
    override suspend fun createApp(
    ): String {
        val body = call().receive<Apps>()

        if (false) httpException(HttpStatusCode.Created)
        if (false) httpException(HttpStatusCode.NotImplemented)

        return ""
    }

    // PARAMETERS /apps/{appId}
    override suspend fun parametersAppsAppId(
    ): String {
        return ""
    }

    // GET /apps/{appId}
    override suspend fun getApp(
    ): Apps {
        if (false) httpException(HttpStatusCode.BadRequest)

        return Apps(
            appId = 0,
            appName = "appName",
            appType = listOf()
        )
    }

    // DELETE /apps/{appId}
    override suspend fun deleteAppsAppId(
    ): Apps {
        return Apps(
            appId = 0,
            appName = "appName",
            appType = listOf()
        )
    }

    // PUT /apps/{appId}
    override suspend fun updateApp(
    ): Unit {
        if (false) httpException(HttpStatusCode.InternalServerError)

        return Unit
    }

    // PARAMETERS /user/{userId}/apps
    override suspend fun parametersUserUserIdApps(
    ): String {
        return ""
    }

    // GET /user/{userId}/apps
    override suspend fun getAllUserApps(
    ): UserApps {
        if (false) httpException(HttpStatusCode.BadRequest)

        return UserApps(
            userId = "userId",
            userName = "userName",
            apps = listOf()
        )
    }

    // POST /user/{userId}/apps
    override suspend fun addAppToUser(
    ): String {
        val body = call().receive<User>()

        if (false) httpException(HttpStatusCode.Created)

        return ""
    }

    // DELETE /user/{userId}/apps
    override suspend fun deleteUserUserIdApps(
    ): UserApps {
        return UserApps(
            userId = "userId",
            userName = "userName",
            apps = listOf()
        )
    }

    // PUT /user/{userId}/apps
    override suspend fun updateUserApps(
    ): Unit {
        if (false) httpException(HttpStatusCode.InternalServerError)

        return Unit
    }

    // PARAMETERS /user/{userId}/apps/{appId}
    override suspend fun parametersUserUserIdAppsAppId(
    ): String {
        return ""
    }

    // GET /user/{userId}/apps/{appId}
    override suspend fun getOneUserApps(
    ): UserApps {
        if (false) httpException(HttpStatusCode.BadRequest)

        return UserApps(
            userId = "userId",
            userName = "userName",
            apps = listOf()
        )
    }

    // POST /user/{userId}/apps/{appId}
    override suspend fun addOneAppToUser(
    ): String {
        val body = call().receive<UserApps>()

        if (false) httpException(HttpStatusCode.Created)

        return ""
    }

    // DELETE /user/{userId}/apps/{appId}
    override suspend fun deleteUserUserIdAppsAppId(
    ): UserApps {
        return UserApps(
            userId = "userId",
            userName = "userName",
            apps = listOf()
        )
    }

    // PUT /user/{userId}/apps/{appId}
    override suspend fun updateOneUserApp(
    ): Unit {
        if (false) httpException(HttpStatusCode.InternalServerError)

        return Unit
    }

    // PARAMETERS /app/{appId}/users
    override suspend fun parametersAppAppIdUsers(
    ): String {
        return ""
    }

    // GET /app/{appId}/users
    override suspend fun getAppUsers(
    ): AppUser {
        if (false) httpException(HttpStatusCode.BadRequest)

        return AppUser(
            userId = "userId",
            appId = "appId",
            userName = "userName"
        )
    }

    // DELETE /app/{appId}/users
    override suspend fun deleteAppAppIdUsers(
    ): UserApps {
        return UserApps(
            userId = "userId",
            userName = "userName",
            apps = listOf()
        )
    }

    // PARAMETERS /apps/{appId}/user/{userId}
    override suspend fun parametersAppsAppIdUserUserId(
    ): String {
        return ""
    }

    // GET /apps/{appId}/user/{userId}
    override suspend fun getAnAppsUser(
    ): AppUser {
        if (false) httpException(HttpStatusCode.BadRequest)

        return AppUser(
            userId = "userId",
            appId = "appId",
            userName = "userName"
        )
    }

    // POST /apps/{appId}/user/{userId}
    override suspend fun addUserToApp(
    ): String {
        val body = call().receive<AppUser>()

        if (false) httpException(HttpStatusCode.Created)

        return ""
    }

    // DELETE /apps/{appId}/user/{userId}
    override suspend fun deleteAppsAppIdUserUserId(
    ): AppUser {
        return AppUser(
            userId = "userId",
            appId = "appId",
            userName = "userName"
        )
    }
}
