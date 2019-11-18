val dottyVersion = "0.20.0-RC1"

lazy val doobieVersion = "0.8.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "todo-in-dotty",
    version := "0.1.0",
    scalaVersion := dottyVersion,
    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % "test",   
      "org.tpolecat" % "doobie-core_2.13"     % doobieVersion,
      "org.tpolecat" % "doobie-postgres_2.13" % doobieVersion,
      "org.tpolecat" % "doobie-specs2_2.13"   % doobieVersion,
      "org.tpolecat" % "doobie-postgres_2.13" % doobieVersion,
      "org.typelevel" % "cats-effect_2.13" % "2.0.0"))
