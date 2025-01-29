package br.com.thalesnishida.autoparts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AutopartsApplication

fun main(args: Array<String>) {
	runApplication<AutopartsApplication>(*args)
}
