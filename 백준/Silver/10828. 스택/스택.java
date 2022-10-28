
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

 class Main {

    static Stack stack = new Stack<>();

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String task = st.nextToken();
            if ("push".equals(task)) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else {
                String printValue = "";
                switch (task) {
                    case "pop":
                        printValue = pop();
                        break;
                    case "size":
                        printValue = String.valueOf(stack.size());
                        break;
                    case "empty":
                        printValue = empty();
                        break;
                    case "top":
                        printValue = top();
                        break;
                }

                bw.write(printValue+"\n");
            }
        }
        bw.flush();
        bw.close();
    }

    static String pop () throws IOException {
        if (stack.isEmpty()) {
            return "-1";
        }else {
            return String.valueOf(stack.pop());
        }
    }
    static String empty () {
        if (stack.isEmpty()){
            return "1";
        } else {
            return "0";
        }
    }

    static String top () {
        if (stack.isEmpty()){
            return "-1";
        } else {
            return String.valueOf(stack.peek());
        }
    }
}
