Simple Sbt project with Scala. For ScalaBridge students that are experienced in programming in general.

# Requirements

- [SBT](https://www.scala-sbt.org/download.html)
  - If you are using OSX and has the [brew](https://brew.sh/) package manager installed, you can simply run `brew install sbt` to install SBT


# Running the project

- In your terminal, run `sbt` to enter the SBT shell
  - Note that when running the first time, SBT may take a while to load
  - When ready, You should see the prompt `sbt:scalabridge-starter>` in your terminal. You can now type SBT commands and hit Enter to run them
- `run` to compile and execute your program
- `test` to run tests

# Project structure

- `build.sbt`: SBT loads this file on startup. We declare our project structure, various build settings and dependencies here
- `project/build.properties`: Declares the SBT version to use.
  - Each project can declare the SBT version to use which avoids the need to switch SBT versions when running a different project
- `project/plugns.sbt`: Declares the SBT plugins to load. SBT has a rich plugin ecosystem and you can easily add additional functionality by using one of the plugins available
- `src/main/scala`: Location of the source files
- `src/test/scala`: Location of the test source files
- `.scalafmt.conf`: Configuration file for the [scalafmt](https://scalameta.org/scalafmt/) code formatting tool
