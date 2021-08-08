package code10;

public class stackQueuePseudo <t> {
    public Stack<t> firstS = new Stack<t>();
    public Stack<t> secS = new Stack<t>();

    public void enQueue(t input) throws Exception {
        if (firstS.isEmty()) {
            throw new Exception("isEmty1");
        } else {
            while ((firstS != null)) {
                secS.push(firstS.pop());
            }
            firstS.push(secS.pop());
        }
        if (secS.isEmty()) {
            throw new Exception("isEmty2");
        } else {
            while ((secS != null)) {
                firstS.push(secS.pop());
            }
            secS.push(firstS.pop());
        }
    }

    public t deQueue() throws Exception {
        t deQueueValue;
        if (firstS.isEmty()) {
            throw new Exception("isEmty1");
        } else {
            deQueueValue = firstS.peek();
            firstS.pop();
        }
        return deQueueValue;
    }
}

