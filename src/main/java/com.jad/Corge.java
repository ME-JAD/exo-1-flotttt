package com.jad;

public class Corge {
    private Foo foo;

    public Foo getFoo() {
        return this.foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
        if (this.foo.getCorge() != this) {
            this.foo.setCorge(this);
        }
    }

    public Corge(Foo foo) {
        this.setFoo(foo);
    }



}
