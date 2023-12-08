package _08;

public class Triple<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public T sum() {
        if (first instanceof Number) {
            return (T) Double.valueOf(((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue());
        } else {
            throw new UnsupportedOperationException("Operation 'sum' is not supported for non-numeric types");
        }
    }

    public T product() {
        if (first instanceof Number) {
            return (T) Double.valueOf(((Number) first).doubleValue() * ((Number) second).doubleValue() * ((Number) third).doubleValue());
        } else {
            throw new UnsupportedOperationException("Operation 'product' is not supported for non-numeric types");
        }
    }

    public T min() {
        return (first.compareTo(second) <= 0 && first.compareTo(third) <= 0) ? first : (second.compareTo(third) <= 0 ? second : third);
    }

    public T max() {
        return (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) ? first : (second.compareTo(third) >= 0 ? second : third);
    }

    public T mean() {
        if (first instanceof Number) {
            return (T) Double.valueOf((((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue()) / 3);
        } else {
            throw new UnsupportedOperationException("Operation 'mean' is not supported for non-numeric types");
        }
    }

    public static void main(String[] args) {
        Triple<Integer> triple = new Triple<>(5, 3, 7);
        System.out.println("First: " + triple.getFirst());//First: 5
        System.out.println("Second: " + triple.getSecond());//Second: 3
        System.out.println("Third: " + triple.getThird());//Third: 7
        System.out.println("Min: " + triple.min());//Min: 3
        System.out.println("Max: " + triple.max());//Max: 7
        System.out.println("Sum: " + triple.sum());//Sum: 15.0
        System.out.println("Product: " + triple.product());// Product: 105.0
        System.out.println("Mean: " + triple.mean());//Mean: 5.0
    }
}