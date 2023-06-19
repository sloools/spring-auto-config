package song.spring.autoconfigure

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
//@ConditionalOnClass(value = [Greeter::class])
@EnableConfigurationProperties(value = [MyConfigureProperties::class])
class MyAutoConfiguration(
    private val myConfigureProperties: MyConfigureProperties
) {
    @Bean
    @ConditionalOnMissingBean
    fun myConfig(): AboutMeConfig {
        val myName = myConfigureProperties.name ?: "Song"
        val myAge = myConfigureProperties.age ?: "31"
        val myGender = myConfigureProperties.gender ?: "Male"
        val myCountry = myConfigureProperties.country ?: "Korea"

//        val myName = myConfigureProperties.name ?: System.getProperty("my.name")
//        val myAge = myConfigureProperties.age ?: System.getProperty("my.age")
//        val myGender = myConfigureProperties.gender ?: System.getProperty("my.gender")
//        val myCountry = myConfigureProperties.country ?: System.getProperty("my.country")

        val config = AboutMeConfig()
        config["name"] = myName
        config["age"] = myAge
        config["gender"] = myGender
        config["country"] = myCountry

        return config
    }
}