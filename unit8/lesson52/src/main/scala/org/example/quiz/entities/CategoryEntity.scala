package org.example.quiz.entities

import org.example.quiz.dao.records.Category
import io.circe.generic.semiauto._
import io.circe._

case class CategoryEntity(id: Long, name: String)

object CategoryEntity {

  implicit val encoder: Encoder[CategoryEntity] =
    deriveEncoder[CategoryEntity]
  implicit val decoder: Decoder[CategoryEntity] =
    deriveDecoder[CategoryEntity]

  def fromRecord(record: Category): CategoryEntity =
    apply(id = record.id, name = record.name)
}
