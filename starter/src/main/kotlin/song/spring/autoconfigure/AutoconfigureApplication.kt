package song.spring.autoconfigure

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AutoconfigureApplication

fun main(args: Array<String>) {
	runApplication<AutoconfigureApplication>(*args)
}
