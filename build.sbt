name := "sbt-web-blank"

sbtVersion := "0.12.3"

scalaVersion := "2.10.1"

seq(webSettings :_*)

libraryDependencies ++= Seq(
	"org.eclipse.jetty"        %  "jetty-server"       % "8.1.10.v20130312"     % "container",
	"org.eclipse.jetty.orbit"  %  "javax.servlet"      % "3.0.0.v201112011016"  % "container;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar")),
	"org.slf4j"                %  "slf4j-api"          % "1.7.5",
	"ch.qos.logback"           %  "logback-core"       % "1.0.12",
	"ch.qos.logback"           %  "logback-classic"    % "1.0.12",
	"org.scalatest"            %% "scalatest"          % "1.9.1"                % "test",
	"org.specs2"               %% "specs2"             % "1.14"                 % "test"
)