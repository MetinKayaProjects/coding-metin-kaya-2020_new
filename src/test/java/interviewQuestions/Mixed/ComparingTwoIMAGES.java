package interviewQuestions.Mixed;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//comparing two image files if they are identical
public class ComparingTwoIMAGES {
    public static void main(String[] args) {
        BufferedImage image1= null;
        BufferedImage image2= null;
        boolean flag=true;
        try {
            File A= new File("/Users/metinkaya/Desktop/archive2/816272AD-9ECE-46F8-95A3-36E1233B88DE copy.jpeg");
            File B= new File("/Users/metinkaya/Desktop/archive2/816272AD-9ECE-46F8-95A3-36E1233B88DE.jpeg");
            image1 = ImageIO.read(A);
            image2 = ImageIO.read(B);
        }
        catch (IOException e){
            System.out.println(e);
        }
        int width1= image1.getWidth();
        int height1= image1.getHeight();
        int width2= image2.getWidth();
        int heigth2= image2.getHeight();
        if (width1!=width2||height1!=heigth2){
            System.out.println("Dimensions of the two images are different!");
            System.exit(0);
        } else{
            long differenceRed = 0;
            long differenceGreen = 0;
            long differenceBlue = 0;
            for (int y=0; y<height1; y++) {
                for (int x=0; x<width1; x++){
                    int rgbA= image1.getRGB(x,y);
                    int rgbB= image2.getRGB(x,y);
                    int redA = (rgbA >> 16) & 0xff;
                    int greenA = (rgbA >> 8) & 0xff;
                    int blueA = (rgbA) & 0xff;
                    int redB = (rgbB >> 16) & 0xff;
                    int greenB = (rgbB >> 8) & 0xff;
                    int blueB = (rgbB) & 0xff;
                    differenceRed = Math.abs(redA - redB);
                    differenceGreen = Math.abs(greenA - greenB);
                    differenceBlue = Math.abs(blueA - blueB);
                }
                if (differenceRed!=0||differenceGreen!=0||differenceBlue!=0){
                    System.out.println("The two images are different!");
                    flag= false;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("The two images are the same!");
        }
    }
}