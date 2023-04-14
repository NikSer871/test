package Practicum;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;

class A{
    String a;
    String b;

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }

    String c;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A a1)) return false;
        return a.equals(a1.a) && b.equals(a1.b) && c.equals(a1.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
class Main {

    public static void main(String[] args) {

    }
}

