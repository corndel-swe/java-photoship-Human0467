package com.corndel.photoship.lib;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Converter {
    private String filename;
    private BufferedImage image;

    public Converter(String filename) throws IOException {
        this.filename = filename;
        this.image = loadImage();
    }

    private BufferedImage loadImage() throws IOException {
        return ImageIO.read(new File("src/main/resources/img/" + this.filename));
    }

    public void saveImage() throws IOException {
        ImageIO.write(this.image, "jpg", new File("src/main/resources/img/output_" + this.filename));
    }

    public void applyFilter(PixelFilter filter) {
        for (int y = 0; y < this.image.getHeight(); y++) {
            for (int x = 0; x < this.image.getWidth(); x++) {
                // Get the RGB value
                int rgb = this.image.getRGB(x, y);

                // Convert the RGB int into a List<Integer> [R, G, B]
                List<Integer> rgbList = rgbToList(rgb);

                // Apply the filter to the List
                List<Integer> newRgbList = filter.apply(rgbList);

                // Convert the List back to an int and set the new value
                int newRgb = listToRgb(newRgbList);
                this.image.setRGB(x, y, newRgb);
            }
        }
    }

    // Helper method to convert int RGB value to List<Integer>
    private static List<Integer> rgbToList(int rgb) {
        List<Integer> rgbList = new ArrayList<>();
        rgbList.add((rgb >> 16) & 0xff); // Red
        rgbList.add((rgb >> 8) & 0xff); // Green
        rgbList.add(rgb & 0xff); // Blue
        return rgbList;
    }

    // Helper method to convert List<Integer> [R, G, B] back to int
    private static int listToRgb(List<Integer> rgbList) {
        int r = rgbList.get(0);
        int g = rgbList.get(1);
        int b = rgbList.get(2);
        return (r << 16) | (g << 8) | b;
    }
}
