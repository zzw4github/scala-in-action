name := "scala-mongo-driver"

scalaVersion := "2.11.8"

organization := "Scala in Action"

libraryDependencies += "org.mongodb" % "mongo-java-driver" % "3.2.2"

 
 // append options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked")