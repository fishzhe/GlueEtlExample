package com.glue.traits

import org.apache.spark.sql.DataFrame

/**
  * Extractor trait:
  *   Defines interface for extractors
  */
trait Extractor {
  def extract(path:String, format:String, connectionType: String): DataFrame
}
