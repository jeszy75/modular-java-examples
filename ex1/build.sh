javac -d mods/org.hello src/org.hello/module-info.java src/org.hello/org/hello/Main.java

java --module-path mods --module org.hello/org.hello.Main

mkdir jmods
jmod create --class-path mods/org.hello jmods/org.hello.jmod

jlink --module-path $JAVA_HOME/jmods:mods --add-modules org.hello --output dist --strip-debug --compress 2 --no-header-files --no-man-pages --launcher hello=org.hello/org.hello.Main
cd dist
bin/hello
