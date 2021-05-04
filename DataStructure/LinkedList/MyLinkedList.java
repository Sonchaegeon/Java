package LinkedList;

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode = new MyListNode(data);

        if(head == null) head = newNode;
        else {
            MyListNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }

        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data) {
        MyListNode tempNode = head;
        MyListNode preNode = null;

        MyListNode newNode = new MyListNode(data);

        if(position < 0 || position > count) return null;
        if(position == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }

            newNode.next = preNode.next;
            preNode.next = newNode;
        }

        count++;
        return newNode;
    }

    public MyListNode removeElement(int position) {
        MyListNode tempNode = head;
        MyListNode preNode = null;

        if(position == 0) head = tempNode.next;
        else {

            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }

            preNode.next = tempNode.next;
        }
        count--;
        return tempNode;
    }

    public String getElement(int position) {
        MyListNode tempNode = head;

        if(position >= count) {
            System.out.println("검색 위치 오류. 현재 리스트의 개수: " + count);
            return "error";
        }

        if(position == 0) return head.getData();

        for(int i = 0; i < position; i++) tempNode = tempNode.next;

        return tempNode.getData();
    }

    public MyListNode getNode(int position) {
        MyListNode tempNode = head;

        if(position >= count) {
            System.out.println("검색 위치 오류. 현재 리스트의 개수: " + count);
            return null;
        }

        if(position == 0) return head;
        for(int i = 0; i < position; i++) tempNode = tempNode.next;

        return tempNode;
    }

    public void removeAll() {
        head = null;
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void printAll() {
        if(count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode temp = head;
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
            if(temp != null) {
                System.out.println("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty() {
        if(head == null) return true;
        else return false;
    }
}
