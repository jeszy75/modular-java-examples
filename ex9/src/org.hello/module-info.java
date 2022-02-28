module org.hello {
    exports org.hello;
    opens org.hello to org.hello.client;
}
