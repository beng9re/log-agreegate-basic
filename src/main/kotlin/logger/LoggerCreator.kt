package logger

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class LoggerCreator {
    val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @Scheduled(fixedDelay = 100)
    fun create() {
        log.info("하이")
    }
}



