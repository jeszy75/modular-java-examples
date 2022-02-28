javac -d mods --module-source-path src $(find src -name "*.java")
java --module-path mods -m org.hello.client/org.hello.client.Main
