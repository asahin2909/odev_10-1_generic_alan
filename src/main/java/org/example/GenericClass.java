package org.example;

public class GenericClass<T> {
    private T genericField;

    public GenericClass(T genericField) {
        this.genericField = genericField;
    }

    public void printGenericField() {
        System.out.println("Generic Field: " + genericField);
    }

       public T getGenericField() {
        return genericField;
    }

    public void setGenericField(T genericField) {
        this.genericField = genericField;
    }

    public static void main(String[] args) {
        // GenericClass örneği oluşturulur ve String tipinde bir değer atanır
        GenericClass<String> stringGenericClass = new GenericClass<>("Merhaba");
        // Generic alanı yazdırmak için printGenericField() metodu çağrılır
        stringGenericClass.printGenericField();

        // integer tipinde GenericClass örneği
        GenericClass<Integer> integerGenericClass = new GenericClass<>(123456);
        integerGenericClass.printGenericField();
    }
}
