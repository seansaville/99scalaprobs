lazy val commonSettings = Seq(
  organization := "uk.co.seansaville",
  scalaVersion := "2.12.0"
)

lazy val ninetyninescalaprobs = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "99scalaprobs"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"