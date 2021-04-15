# Proyek Example

This repository holds a simple Sireum Proyek example,
with project definition specified in 
[bin/project.cmd](bin/project.cmd).

To try:

1. Install Sireum IVE by following the instructions at:
   https://github.com/sireum/kekinian.

2. Add `SIREUM_HOME`'s `bin` directory to the `PATH` environment
   variable:

   * **macOS/Linux:**
   
     ```bash
     export PATH=$PATH:$SIREUM_HOME/bin
     ```
   
   * **Windows**
   
     ```cmd
     set PATH=%PATH%;%SIREUM_HOME%\bin
     ```

3. Clone this repository and change the directory to the
   local repository:

   ```
   git clone https://github.com/sireum/proyek-example
   cd proyek-example
   ```

4. If you installed Sireum IVE using the git source distribution,
   you can optionally publish the Slang runtime library locally:
   
   ```
   build.cmd m2-lib
   ```
   
   Otherwise, the library will be retrieved from 
   [jitpack.io](https://jitpack.io/#org.sireum/kekinian), which
   may take some time the first time it is requested (and may
   take a couple of tries).
   
   You should re-publish the library locally when you upgrade 
   Sireum to avoid retrieving the library from
   [jitpack.io](https://jitpack.io/#org.sireum/kekinian).

## Using Sireum Command Line Interface (CLI)

### Running Scripts

First, try running the [bin/slash-example.cmd](bin/slash-example.cmd) 
Slash (Slang shell) script to test your Sireum installation:

* **macOS/Linux:**

  ```bash
  bin/slash-example.cmd
  ```

* **Windows**

  ```cmd
  bin\slash-example.cmd
  ```

Then try to run the [script-example.sc](script-example.sc) regular Slang script:

```
sireum slang run script-example.sc 
```

To see the `slang run` usage information, use the `-h` option (also
applies to other sireum tool command below):

```
sireum slang run -h 
```

### Compiling

To compile all source files:

```
sireum proyek compile .
```

Note that library dependency versions are resolved internally, which can be
retrieved by:

```
sireum --version
```

The versions can be over-ridden by supplying some properties file similar to:
https://github.com/sireum/kekinian/blob/master/versions.properties

### Running

To run the [example/src/main/scala/example/ExampleApp.scala](example/src/main/scala/example/ExampleApp.scala) 
program:

```
sireum proyek run . example.ExampleApp
```

### Testing

To run the test suites in [example](example):

```
sireum proyek test . example
```

### Verifying

To verify the [logika-example.sc](logika-example.sc) script:

```
sireum logika verifier logika-example.sc 
```

## Using Sireum Integrated Verification Environment (IVE)

### Generating Project

To use the Sireum IVE, first generate the IVE project files:

```
sireum proyek ive .
```

Then open the local repository directory in Sireum IVE.

### Running Scripts

To run the [script-example.sc](script-example.sc) regular Slang script,
first open the file by double-clicking it in the 'Project' view.

Then, right-click on the file editor and select `Evaluate Worksheet`.

### Compiling

To compile the source files, use the `Build Project` menu item under
the `Build` menu in Sireum IVE.

### Running/Debugging

To run the 
[example/src/main/scala/example/ExampleApp.scala](example/src/main/scala/example/ExampleApp.scala)
program, first open the file by double-clicking it in the `Project` view.

Then, right-click on the file editor and select `Run 'ExampleApp'`/`Debug 'ExampleApp'`.

### Testing/Debugging

To test/debug the test suites in [example](example), right-click on
[example](example) in the `Project` view and select
`Run 'ScalaTests in examp...'`/`Debug 'ScalaTests in examp...'`.

### Verifying

To verify the [logika-example.sc](logika-example.sc) script, open
the file by double-clicking it in the 'Project' view.

Logika will automatically verify the file the first
time the file is opened and after each (paused) modification.

To explicitly re-verify the file, right-click on the opened editor and
select `Logika Check`.

## More Examples

* Slang runtime library project definition:
  https://github.com/sireum/runtime/blob/master/bin/project.cmd
  
* Sireum project definition:
  https://github.com/sireum/kekinian/blob/master/bin/project.cmd