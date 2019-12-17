package com.lsm.userHub

import java.util.*
import io.ktor.swagger.experimental.*

/**
 * LSM Hub
 * 
 * Base user API for LMS
 */
interface LSMHub : SwaggerBaseApi {
    /**
     * null
     * 
     * @return OK
     */
    @Path("/users")
    @Method("PARAMETERS")
    suspend fun parametersUsers(
    ): String

    /**
     * return a list of all users
     * 
     * @return get all users
     */
    @Path("/users")
    @Method("GET")
    suspend fun getAllUsers(
    ): List<User>

    /**
     * Creates a user.
     * 
     * @return OK
     */
    @Path("/users")
    @Method("POST")
    suspend fun createUser(
    ): String

    /**
     * null
     * 
     * @return OK
     */
    @Path("/user/{userId}")
    @Method("PARAMETERS")
    suspend fun parametersUserUserId(
    ): String

    /**
     * Returns a user by ID.
     * 
     * @return OK
     */
    @Path("/user/{userId}")
    @Method("GET")
    suspend fun getUserUserId( userId: String ): User

    /**
     * Delete a user by ID.
     * 
     * @return Success
     */
    @Path("/user/{userId}")
    @Method("DELETE")
    suspend fun deleteUserUserId(
    ): User

    /**
     * Update user by ID.
     * 
     * @return User Updated
     */
    @Path("/user/{userId}")
    @Method("PUT")
    suspend fun updateUser(
    ): Unit

    /**
     * null
     * 
     * @return OK
     */
    @Path("/apps")
    @Method("PARAMETERS")
    suspend fun parametersApps(
    ): String

    /**
     * returns a list of all applications
     * 
     * @return get all applications
     */
    @Path("/apps")
    @Method("GET")
    suspend fun getAllApps(
    ): List<String>

    /**
     * add an application
     * 
     * @return OK
     */
    @Path("/apps")
    @Method("POST")
    suspend fun createApp(
    ): String

    /**
     * null
     * 
     * @return OK
     */
    @Path("/apps/{appId}")
    @Method("PARAMETERS")
    suspend fun parametersAppsAppId(
    ): String

    /**
     * Returns an app by ID.
     * 
     * @return OK
     */
    @Path("/apps/{appId}")
    @Method("GET")
    suspend fun getApp(
    ): Apps

    /**
     * Delete an app by ID.
     * 
     * @return OK
     */
    @Path("/apps/{appId}")
    @Method("DELETE")
    suspend fun deleteAppsAppId(
    ): Apps

    /**
     * Update application by ID.
     * 
     * @return App Updated
     */
    @Path("/apps/{appId}")
    @Method("PUT")
    suspend fun updateApp(
    ): Unit

    /**
     * null
     * 
     * @return OK
     */
    @Path("/user/{userId}/apps")
    @Method("PARAMETERS")
    suspend fun parametersUserUserIdApps(
    ): String

    /**
     * returns a list of users apps
     * 
     * @return get all users
     */
    @Path("/user/{userId}/apps")
    @Method("GET")
    suspend fun getAllUserApps(
    ): UserApps

    /**
     * add and app to the user.
     * 
     * @return OK
     */
    @Path("/user/{userId}/apps")
    @Method("POST")
    suspend fun addAppToUser(
    ): String

    /**
     * Delete a user app by ID.
     * 
     * @return Success
     */
    @Path("/user/{userId}/apps")
    @Method("DELETE")
    suspend fun deleteUserUserIdApps(
    ): UserApps

    /**
     * Update users application.
     * 
     * @return User app array updated
     */
    @Path("/user/{userId}/apps")
    @Method("PUT")
    suspend fun updateUserApps(
    ): Unit

    /**
     * null
     * 
     * @return OK
     */
    @Path("/user/{userId}/apps/{appId}")
    @Method("PARAMETERS")
    suspend fun parametersUserUserIdAppsAppId(
    ): String

    /**
     * returns a one of users apps
     * 
     * @return get all users
     */
    @Path("/user/{userId}/apps/{appId}")
    @Method("GET")
    suspend fun getOneUserApps(
    ): UserApps

    /**
     * add and app to the user.
     * 
     * @return OK
     */
    @Path("/user/{userId}/apps/{appId}")
    @Method("POST")
    suspend fun addOneAppToUser(
    ): String

    /**
     * Delete a user app by ID.
     * 
     * @return Success
     */
    @Path("/user/{userId}/apps/{appId}")
    @Method("DELETE")
    suspend fun deleteUserUserIdAppsAppId(
    ): UserApps

    /**
     * Update users application.
     * 
     * @return User app array updated
     */
    @Path("/user/{userId}/apps/{appId}")
    @Method("PUT")
    suspend fun updateOneUserApp(
    ): Unit

    /**
     * null
     * 
     * @return OK
     */
    @Path("/app/{appId}/users")
    @Method("PARAMETERS")
    suspend fun parametersAppAppIdUsers(
    ): String

    /**
     * returns a list of App users
     * 
     * @return get all app users
     */
    @Path("/app/{appId}/users")
    @Method("GET")
    suspend fun getAppUsers(
    ): AppUser

    /**
     * Delete a user from an app
     * 
     * @return Success
     */
    @Path("/app/{appId}/users")
    @Method("DELETE")
    suspend fun deleteAppAppIdUsers(
    ): UserApps

    /**
     * null
     * 
     * @return OK
     */
    @Path("/apps/{appId}/user/{userId}")
    @Method("PARAMETERS")
    suspend fun parametersAppsAppIdUserUserId(
    ): String

    /**
     * returns a single app user
     * 
     * @return get all users
     */
    @Path("/apps/{appId}/user/{userId}")
    @Method("GET")
    suspend fun getAnAppsUser(
    ): AppUser

    /**
     * add and app to the user.
     * 
     * @return OK
     */
    @Path("/apps/{appId}/user/{userId}")
    @Method("POST")
    suspend fun addUserToApp(
    ): String

    /**
     * Delete a user app by ID.
     * 
     * @return Success
     */
    @Path("/apps/{appId}/user/{userId}")
    @Method("DELETE")
    suspend fun deleteAppsAppIdUserUserId(
    ): AppUser
}

data class User(
    internal val userId: String,
    val userName: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val dob: String,
    val age: String,
    val apps: List<Apps>
) {
    companion object {
        fun from(m: Map<String, Any>): User {
            return User(
                userId = (getValue("userId", m) as? String).orEmpty(),
                userName = (getValue("userName", m) as? String).orEmpty(),
                firstName = (getValue("firstName", m) as? String).orEmpty(),
                lastName = (getValue("lastName", m) as? String).orEmpty(),
                email = (getValue("email", m) as? String).orEmpty(),
                dob = (getValue("dob", m) as? String).orEmpty(),
                age = (getValue("age", m) as? String).orEmpty(),
                apps = emptyList()

            )
        }

        private fun getValue(k: String, m: Map<String, Any>): Any? = m[k]
    }
}

data class Apps(
    val appId: Int,
    val appName: String,
    val appType: List<String>
)

data class UserApps(
    val userId: String,
    val userName: String,
    val apps: List<Apps>
)

data class AppUser(
    val userId: String,
    val appId: String,
    val userName: String
)

// Synthetic class name
data class ComponentsSchemasAppObjElements(
    val appId: Int,
    val appName: String
)
