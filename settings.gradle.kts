plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "mcp_101"
include("mcp_client")
include("mcp_server")
