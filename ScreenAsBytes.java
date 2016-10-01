public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {
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
            int i = Integer.parseInt(s, 2); //parses string s as signed integer in radix specified (2) – this returns the decimal of the byte
            screen[count2] = (byte) i;
            count2++;
        }
    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {
    	int byteWidth = width / 8;
        int height = screen.length / byteWidth; 
        int count = 0;
        String stringOfInts = "";
        for (int i1 = 0; i1 < height; i1++) {
        	for (int i2 = 0; i2 < width; i2++) {
        		if (i1 == y && i2 >=startX && i2 <= endX){
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
            int i = Integer.parseInt(s, 2);
            screen[count2] = (byte) i;
            count2++;
        }
    }
    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
    	int byteWidth = width / 8;
        int height = screen.length / byteWidth; 
        int count = 0;
        String stringOfInts = "";
        for (int i1 = 0; i1 < height; i1++) {
        	for (int i2 = 0; i2 < width; i2++) {
        		if (i2 == x && i1 >= startY && i1 <= endY) {
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
            int i = Integer.parseInt(s, 2);
            screen[count2] = (byte) i;
            count2++;
        }
    }
}
