package com.slokashri.jdk15.generics;

public interface Inspector <T extends AnyWheeler> {

    boolean inspect(T vehicle);
}
