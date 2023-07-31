package com.sjadrian;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Config config = new Config();
        FileSorter fileSorter = new FileSorter(config.getDirectoryConfig());
        fileSorter.run();
    }
}
