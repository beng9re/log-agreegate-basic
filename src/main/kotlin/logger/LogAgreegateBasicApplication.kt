package logger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class LogAgreegateBasicApplication
fun main(args: Array<String>) {
    runApplication<LogAgreegateBasicApplication>(*args)
}
