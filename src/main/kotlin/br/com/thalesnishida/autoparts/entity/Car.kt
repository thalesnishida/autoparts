package br.com.thalesnishida.autoparts.entity

import org.springframework.data.mongodb.core.mapping.Document

@Document(collation = "cars")
data class Car(
    val id: String,
    val referenceMonth: String,
    val classification: String,
    val brand: String,
    val model: String,
    val initialYear: String,
    val finalYear: String
)
