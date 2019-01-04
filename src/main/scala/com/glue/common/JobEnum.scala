package com.glue.common

object JobEnum extends Enumeration {
  type JobEnum = Value
  val resourcesBucket, resourcesKey, outputKeyPrefix = Value
}
