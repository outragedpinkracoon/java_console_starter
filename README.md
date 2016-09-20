# Java Console Starter

Maybe you want to play with Java and you don't want to use Eclipse? 
Maybe Java can actually not be such a pain when we just use Sublime?
Maybe you still want to write tests?

1. INSTALL junit and hacrest-core https://github.com/junit-team/junit4/wiki/Download-and-Install

  Download the two .jar files. Make a new directory in the user root folder (~ when you open terminal) called 'junit' and put these two files into it.

2. Update .zshrc file (in the ~ folder again, open in Sublime and copy these lines into it).

export JUNIT_HOME="$HOME/junit"
export PATH="$PATH:$JUNIT_HOME"
export CLASSPATH="$CLASSPATH:$JUNIT_HOME/junit-4.12.jar:$JUNIT_HOME/hamcrest-core-1.3.jar"
alias junit="java org.junit.runner.JUnitCore $1"

3. If it's working, you will be able to type 'junit' in the terminal

