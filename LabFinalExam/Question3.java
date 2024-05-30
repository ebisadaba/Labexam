public class Question3 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Question3(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = queue[front];
        if (front == rear) { // Only one element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return value;
    }

    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Question3 q = new Question3(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);


        System.out.println(q.dequeue());

        q.enqueue(4);

        System.out.println(q.front());
        System.out.println(q.rear());
    }
}











