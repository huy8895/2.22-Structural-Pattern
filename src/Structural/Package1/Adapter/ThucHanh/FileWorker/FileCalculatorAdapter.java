package Structural.Package1.Adapter.ThucHanh.FileWorker;

import com.codegym.FileUtil;

import java.io.File;

public class FileCalculatorAdapter implements FileCalculator {
    FileUtil fileUtil ;

    public FileCalculatorAdapter(FileUtil fileUtil) {
        this.fileUtil = fileUtil;
    }

    @Override
    public long calculateSize(String path) {

        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
