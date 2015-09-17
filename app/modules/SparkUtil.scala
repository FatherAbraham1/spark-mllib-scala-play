package modules

import org.apache.spark.{SparkConf, SparkContext}

object SparkUtil {

  val sparkContext = new SparkContext(new SparkConf().setMaster("local[*]").setAppName("Spark/MLlib/Scala/Play Twitter Sentiment corpus classification template"))

}
