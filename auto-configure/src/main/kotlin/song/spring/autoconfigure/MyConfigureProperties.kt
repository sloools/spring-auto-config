package song.spring.autoconfigure

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("my")
data class MyConfigureProperties(
    val name: String? = null,
    val age: String? = null,
    val gender: String? = null,
    val country: String? = null
)
