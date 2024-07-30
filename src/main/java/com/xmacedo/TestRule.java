package com.xmacedo;

import java.util.function.Predicate;

public interface TestRule {
    <T> Predicate<T> getPredicate();
}