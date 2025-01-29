package br.com.thalesnishida.autoparts.repository

import br.com.thalesnishida.autoparts.entity.CarPart
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AutoPartsRepository: MongoRepository<CarPart, String > {
    fun findByPartName(id: String): CarPart
    fun addCarPart(carPart: CarPart): List<CarPart>

}