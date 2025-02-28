public class StackConcorrenteApp {

    private static class StackPusher implements Runnable {

        private Stack stack;

        public StackPusher(Stack stack) {
            this.stack = stack;
        }

        public void run() {

            String lettere = "fghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

            lettere.chars().forEach(ch -> {
                    System.out.println("PUT >>>> " + (char) ch);
                    stack.push((char) ch);

                    /*
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {}
                    */
            });

        }

    }

    public static class StackPopper implements Runnable {

        private Stack stack;

        public StackPopper(Stack stack) {
            this.stack = stack;
        }

        public void run() {
            int index = 0;

            while(true) {

                if (index == 52)
                    return;

                if(stack.isEmpty()) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {}
                    continue;
                }

                index ++;
                char cValue = stack.pop();
                System.out.println("GET <<<< " + index + ", value: " + cValue);

                /*
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {}
                */
            }

        }

    }

    public static void main(String[] args) {

        var stack = new Stack();
        // abcde
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');

        var threadPusher = new Thread(new StackPusher(stack));
        var threadPopper = new Thread(new StackPopper(stack));

        threadPusher.start();
        threadPopper.start();

        try {
            threadPusher.join();
            threadPopper.join();
        } catch (InterruptedException e) {

        }
        // ho letto i 52 caratteri immessi nello stack e dovrebbe essere vuoto
        System.out.println("FINITO is EMPTY: " + (stack.isEmpty()? "YES" : "NO"));
    }
}
