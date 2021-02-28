javac -p lib -d mods/org.hello src/org.hello/module-info.java src/org.hello/org/hello/Main.java

java --module-path mods:lib -m org.hello/org.hello.Main
