package week08;

import week07.OldPhone;

public class Cat extends Animal {
    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this == obj) {
            return true;
        } else {
            return this.getClass() == obj.getClass();
        }
    }
}
