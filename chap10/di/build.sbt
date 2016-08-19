name := "Dependency Inject Patterns"

version := "1.0"

organization := "Scala in action"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
	"org.specs2" %% "specs2-core" % "3.8.4" % "test"
	, "org.springframework" % "spring-core" % "4.3.2.RELEASE" % "test"
	, "org.springframework" % "spring-test" % "4.3.2.RELEASE"
	, "junit" % "junit" % "4.12" % "test"
	, "com.novocode" % "junit-interface" % "0.11" % "test"
	, "com.jayway.awaitility" % "awaitility-scala" % "1.6.3",
	"org.scala-lang" % "scala-actors" % "2.11.8"
)

// append options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature") 
