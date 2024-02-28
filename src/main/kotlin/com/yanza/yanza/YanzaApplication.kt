package com.yanza.yanza

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YanzaApplication

fun main(args: Array<String>) {
	runApplication<YanzaApplication>(*args)
}
