public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {
        int arraySize = screen.length;
        int byteWidth = width / 8;
        int height = screen.length / byteWidth; 
        int count = 0;
        String stringOfInts = "";
        for (int i1 = 0; i1 < height; i1++) {
        	for (int i2 = 0; i2 < width; i2++) {
        		if (i2 == x && i1 == y) {
        			stringOfInts += Integer.toString(1);
        		}
        		else {
        			stringOfInts += Integer.toString(0);
        		}
        		count++;
            }
        }
        String[] stringOfBytes = stringOfInts.split("(?<=\\G.{8})");
        int count2 = 0;
        for (String s : stringOfBytes) {
        	System.out.println (s); //just to check if its right up to here
            byte b = (byte) Integer.parseInt(s);
            screen[count2] = b;
            count2++;
            
        }
        for (byte b : screen) {
        	System.out.println(b);
        }
    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {
        // TODO complete this code
    }
    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
        // TODO complete this code
    }


}
