package OtherProject.src.hust.soict.globalict.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        int n = 100000; 

        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time with + operator: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time with StringBuffer: " + (endTime - startTime) + " ms");
    }
}
