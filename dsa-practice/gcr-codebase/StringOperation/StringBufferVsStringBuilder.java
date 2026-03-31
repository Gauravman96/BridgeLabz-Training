public class StringBufferVsStringBuilder {

    public static void main(String[] args) {

        int iterations = 1_000_000;

        // StringBuffer Test
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("hello");
        }

        long endTimeBuffer = System.nanoTime();
        long bufferTime = endTimeBuffer - startTimeBuffer;

        //StringBuilder Test 
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("hello");
        }

        long endTimeBuilder = System.nanoTime();
        long builderTime = endTimeBuilder - startTimeBuilder;

    
        System.out.println("StringBuffer Time (ns): " + bufferTime);
        System.out.println("StringBuilder Time (ns): " + builderTime);

        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster");
        } else {
            System.out.println("StringBuffer is faster");
        }
    }
}
