name := "StmExample"

organization := "scalainaction"

version := "0.3"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += ("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/")

libraryDependencies ++= Seq(
	"org.scala-stm" %% "scala-stm" % "0.7",
  "org.specs2" %% "specs2-core" % "3.8.4" % "test"
)

