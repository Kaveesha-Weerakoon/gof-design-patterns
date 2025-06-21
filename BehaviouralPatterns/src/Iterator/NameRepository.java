package Iterator;

class NameRepository implements Collection<String> {
    private String[] names = { "Alice", "Bob", "Charlie" };

    public Iterator<String> createIterator() {
        return new NameIterator();
    }

    // Concrete Iterator
    private class NameIterator implements Iterator<String> {
        int index = 0;

        public boolean hasNext() {
            return index < names.length;
        }

        public String next() {
            return hasNext() ? names[index++] : null;
        }
    }
}