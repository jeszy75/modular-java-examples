javac src/org.hello/module-info.java src/org.hello/org/hello/Main.java
mkdir -p mods/org.hello
javac -d mods/org.hello src/org.hello/module-info.java src/org.hello/org/hello/Main.java
find src -name "*.java" > src.txt
javac -d mods/org.hello @src.txt
java --module-path mods -m org.hello/org.hello.Main
jlink --module-path $JAVA_HOME/jmods:mods --add-modules org.hello --output dist --strip-debug --compress 2 --no-header-files --no-man-pages