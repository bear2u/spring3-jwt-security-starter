package osahner.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.servers.Server
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.beans.factory.annotation.Value

@Configuration
class OpenApiConfiguration {

    @Value("\${server.port}")
    private val serverPort: String? = null

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .addServersItem(Server().url("http://localhost:$serverPort")) // Server information, match with your running server
            .info(
                Info().title("Cervico API") // API Information
                    .description("This is a cervico of the API documentation")
                    .contact(Contact().email("tommykim1981@gmail.com").name("Support Team"))
            ) // Contact Information
    }
}
