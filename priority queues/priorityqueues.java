class Maxheap {
    int[] heap;
    int size;

    Maxheap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return 2 * i + 1; }
    int right(int i) { return 2 * i + 2; }

    void insert(int val) {
        heap[size] = val;
        int i = size;
        size++;
        while (i > 0 && heap[i] > heap[parent(i)]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i);
        }
    }

    int extractMax() {
        if (size <= 0) return Integer.MIN_VALUE;
        if (size == 1) { size--; return heap[0]; }
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return root;
    }

    void heapify(int i) {
        int largest = i;
        int l = left(i), r = right(i);
        if (l < size && heap[l] > heap[largest]) largest = l;
        if (r < size && heap[r] > heap[largest]) largest = r;
        if (largest != i) {
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            heapify(largest);
        }
    }

    void printHeap() {
        for (int i = 0; i < size; i++) System.out.print(heap[i] + " ");
        System.out.println();
    }
}

class Minheap {
    int[] heap;
    int size;

    Minheap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return 2 * i + 1; }
    int right(int i) { return 2 * i + 2; }

    void insert(int val) {
        heap[size] = val;
        int i = size;
        size++;
        while (i > 0 && heap[i] < heap[parent(i)]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i);
        }
    }

    int extractMin() {
        if (size <= 0) return Integer.MAX_VALUE;
        if (size == 1) { size--; return heap[0]; }
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return root;
    }

    void heapify(int i) {
        int smallest = i;
        int l = left(i), r = right(i);
        if (l < size && heap[l] < heap[smallest]) smallest = l;
        if (r < size && heap[r] < heap[smallest]) smallest = r;
        if (smallest != i) {
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;
            heapify(smallest);
        }
    }

    void printHeap() {
        for (int i = 0; i < size; i++) System.out.print(heap[i] + " ");
        System.out.println();
    }
}

// Main class
public class priorityqueues {
    public static void main(String[] args) {
        int[] arr = {22, 14, 65, 5, 18, 54, 2, 34, 11};

        Maxheap max = new Maxheap(20);
        Minheap min = new Minheap(20);

        for (int val : arr) {
            max.insert(val);
            min.insert(val);
        }

        System.out.print("MaxHeap: ");
        max.printHeap();
        System.out.println("Extracted Max Value: " + max.extractMax());
        System.out.print("MaxHeap after extract: ");
        max.printHeap();

        System.out.print("MinHeap: ");
        min.printHeap();
        System.out.println("Extracted Min Value: " + min.extractMin());
        System.out.print("MinHeap after extract: ");
        min.printHeap();
    }
}