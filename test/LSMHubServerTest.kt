package com.lsm.userHub

import java.util.*
import io.ktor.config.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.server.testing.*
import io.ktor.swagger.experimental.*
import kotlin.test.*

class SwaggerRoutesTest {
    /**
     * @see LSMHubServer.parametersUsers
     */
//    @Test
//    fun testParametersUsers() {
//        withTestApplication {
//            // @TODO: Adjust path as required
//            handleRequest(HttpMethod.Parameters, "/users") {
//            }.apply {
//                // @TODO: Your test here
//                assertEquals(HttpStatusCode.OK, response.status())
//            }
//        }
//    }

    /**
     * @see LSMHubServer.getAllUsers
     */
    @Test
    fun testGetAllUsers() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Get, "/users") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.createUser
     */
    @Test
    fun testCreateUser() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Post, "/users") {
                // @TODO: Your body here
                setBodyJson(mapOf<String, Any?>())
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.parametersUserUserId
     */
//    @Test
//    fun testParametersUserUserId() {
//        withTestApplication {
//            // @TODO: Adjust path as required
//            handleRequest(HttpMethod.Parameters, "/user/{userId}") {
//            }.apply {
//                // @TODO: Your test here
//                assertEquals(HttpStatusCode.OK, response.status())
//            }
//        }
//    }

    /**
     * @see LSMHubServer.getUserUserId
     */
    @Test
    fun testGetUserUserId() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Get, "/user/{userId}") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.deleteUserUserId
     */
    @Test
    fun testDeleteUserUserId() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Delete, "/user/{userId}") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.updateUser
     */
    @Test
    fun testUpdateUser() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Put, "/user/{userId}") {
                // @TODO: Your body here
                setBodyJson(mapOf<String, Any?>())
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.parametersApps
     */
//    @Test
//    fun testParametersApps() {
//        withTestApplication {
//            // @TODO: Adjust path as required
//            handleRequest(HttpMethod.Parameters, "/apps") {
//            }.apply {
//                // @TODO: Your test here
//                assertEquals(HttpStatusCode.OK, response.status())
//            }
//        }
//    }

    /**
     * @see LSMHubServer.getAllApps
     */
    @Test
    fun testGetAllApps() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Get, "/apps") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.createApp
     */
    @Test
    fun testCreateApp() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Post, "/apps") {
                // @TODO: Your body here
                setBodyJson(mapOf<String, Any?>())
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.parametersAppsAppId
     */
//    @Test
//    fun testParametersAppsAppId() {
//        withTestApplication {
//            // @TODO: Adjust path as required
//            handleRequest(HttpMethod.Parameters, "/apps/{appId}") {
//            }.apply {
//                // @TODO: Your test here
//                assertEquals(HttpStatusCode.OK, response.status())
//            }
//        }
//    }

    /**
     * @see LSMHubServer.getApp
     */
    @Test
    fun testGetApp() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Get, "/apps/{appId}") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.deleteAppsAppId
     */
    @Test
    fun testDeleteAppsAppId() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Delete, "/apps/{appId}") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.updateApp
     */
    @Test
    fun testUpdateApp() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Put, "/apps/{appId}") {
                // @TODO: Your body here
                setBodyJson(mapOf<String, Any?>())
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.getPing
     */
    @Test
    fun testGetPing() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Get, "/ping") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.parametersUserUserIdApps
     */
//    @Test
//    fun testParametersUserUserIdApps() {
//        withTestApplication {
//            // @TODO: Adjust path as required
//            handleRequest(HttpMethod.Parameters, "/user/{userId}/apps") {
//            }.apply {
//                // @TODO: Your test here
//                assertEquals(HttpStatusCode.OK, response.status())
//            }
//        }
//    }

    /**
     * @see LSMHubServer.getAllUserApps
     */
    @Test
    fun testGetAllUserApps() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Get, "/user/{userId}/apps") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.addAppToUser
     */
    @Test
    fun testAddAppToUser() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Post, "/user/{userId}/apps") {
                // @TODO: Your body here
                setBodyJson(mapOf<String, Any?>())
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.deleteUserUserIdApps
     */
    @Test
    fun testDeleteUserUserIdApps() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Delete, "/user/{userId}/apps") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.updateUserApps
     */
    @Test
    fun testUpdateUserApps() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Put, "/user/{userId}/apps") {
                // @TODO: Your body here
                setBodyJson(mapOf<String, Any?>())
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.parametersUserUserIdAppsAppId
     */
//    @Test
//    fun testParametersUserUserIdAppsAppId() {
//        withTestApplication {
//            // @TODO: Adjust path as required
//            handleRequest(HttpMethod.Parameters, "/user/{userId}/apps/{appId}") {
//            }.apply {
//                // @TODO: Your test here
//                assertEquals(HttpStatusCode.OK, response.status())
//            }
//        }
//    }

    /**
     * @see LSMHubServer.getOneUserApps
     */
    @Test
    fun testGetOneUserApps() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Get, "/user/{userId}/apps/{appId}") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.addOneAppToUser
     */
    @Test
    fun testAddOneAppToUser() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Post, "/user/{userId}/apps/{appId}") {
                // @TODO: Your body here
                setBodyJson(mapOf<String, Any?>())
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.deleteUserUserIdAppsAppId
     */
    @Test
    fun testDeleteUserUserIdAppsAppId() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Delete, "/user/{userId}/apps/{appId}") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.updateOneUserApp
     */
    @Test
    fun testUpdateOneUserApp() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Put, "/user/{userId}/apps/{appId}") {
                // @TODO: Your body here
                setBodyJson(mapOf<String, Any?>())
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.parametersAppAppIdUsers
     */
//    @Test
//    fun testParametersAppAppIdUsers() {
//        withTestApplication {
//            // @TODO: Adjust path as required
//            handleRequest(HttpMethod.Parameters, "/app/{appId}/users") {
//            }.apply {
//                // @TODO: Your test here
//                assertEquals(HttpStatusCode.OK, response.status())
//            }
//        }
//    }

    /**
     * @see LSMHubServer.getAppUsers
     */
    @Test
    fun testGetAppUsers() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Get, "/app/{appId}/users") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.deleteAppAppIdUsers
     */
    @Test
    fun testDeleteAppAppIdUsers() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Delete, "/app/{appId}/users") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.parametersAppsAppIdUserUserId
     */
//    @Test
//    fun testParametersAppsAppIdUserUserId() {
//        withTestApplication {
//            // @TODO: Adjust path as required
//            handleRequest(HttpMethod.Parameters, "/apps/{appId}/user/{userId}") {
//            }.apply {
//                // @TODO: Your test here
//                assertEquals(HttpStatusCode.OK, response.status())
//            }
//        }
//    }

    /**
     * @see LSMHubServer.getAnAppsUser
     */
    @Test
    fun testGetAnAppsUser() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Get, "/apps/{appId}/user/{userId}") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.addUserToApp
     */
    @Test
    fun testAddUserToApp() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Post, "/apps/{appId}/user/{userId}") {
                // @TODO: Your body here
                setBodyJson(mapOf<String, Any?>())
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    /**
     * @see LSMHubServer.deleteAppsAppIdUserUserId
     */
    @Test
    fun testDeleteAppsAppIdUserUserId() {
        withTestApplication {
            // @TODO: Adjust path as required
            handleRequest(HttpMethod.Delete, "/apps/{appId}/user/{userId}") {
            }.apply {
                // @TODO: Your test here
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    fun <R> withTestApplication(test: TestApplicationEngine.() -> R): R {
        return withApplication(createTestEnvironment()) {
            (environment.config as MapApplicationConfig).apply {
                put("jwt.secret", "TODO-change-this-supersecret-or-use-SECRET-env")
            }
            application.module()
            test()
        }
    }

    fun TestApplicationRequest.setBodyJson(value: Any?) = setBody(Json.stringify(value))
}
