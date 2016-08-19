name := "chapter9 examples"

scalaVersion := "2.11.8"

organization := "Scala in Action"

// append options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-language:_")

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.8"
