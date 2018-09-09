name := """play-java-starter-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice

// Test Database
libraryDependencies += "com.h2database" % "h2" % "1.4.197"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

libraryDependencies ++= Seq(
guice,
  javaJdbc,
  javaEbean,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.18",
  "org.hibernate" % "hibernate-core" % "4.3.0.CR1",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.0.CR1",
  "org.hibernate.javax.persistence" % "hibernate-jpa-2.1-api" % "1.0.0.Final"
  
)     

val appDependencies = Seq(
    "org.hibernate" %% "hibernate-core" % "4.2.6.Final",
    "org.hibernate" %% "hibernate-entitymanager" % "3.6.9.Final",
    "org.hibernate.javax.persistence" %% "hibernate-jpa-2.0-api" % "1.0.0.Final"
)
resolvers += "jgit-repository" at "http://download.eclipse.org/jgit/maven"


