package logger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LogAgreegateBasicApplication

fun main(args: Array<String>) {
    runApplication<LogAgreegateBasicApplication>(*args)
}
