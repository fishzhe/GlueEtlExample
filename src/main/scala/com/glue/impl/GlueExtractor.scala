package com.glue.impl

import com.amazonaws.services.glue.GlueContext
import com.amazonaws.services.glue.util.JsonOptions
import com.glue.traits.Extractor
import org.apache.spark.sql.DataFrame

/**
  * GlueExtractor:
  *   Extract data using Glue API
  */
class GlueExtractor(glueContext: GlueContext) extends Extractor{

  override def extract(path:String, format:String, connectionType: String): DataFrame = {
    val options = JsonOptions(Map("path" -> path));
    glueContext.getSourceWithFormat(connectionType, options, format).getDynamicFrame().toDF();
  }
}
