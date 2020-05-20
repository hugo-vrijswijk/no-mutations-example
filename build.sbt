ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "no-mutations-example",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.7" % Test,
    testFrameworks += new TestFramework("munit.Framework")
  )
