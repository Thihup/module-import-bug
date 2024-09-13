package my.nice.project;

import module my.nice.project;

public class Main {
    public static void main(String[] args) {
        SomeInterface someInterface = new SomeInterface() {
            @Override
            public SomeRecord someMethod() {
                return new SomeRecord();
            }
        };
    }
}
