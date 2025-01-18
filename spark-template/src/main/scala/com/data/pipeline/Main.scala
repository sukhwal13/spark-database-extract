package com.data.pipeline

import org.apache.spark.sql.SparkSession

object Main{
  def main(args: Array[String]): Unit={
    val spark = SparkSession.builder().appName("example").getOrCreate()

  }
}