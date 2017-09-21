package com.gxut.demo.file;

import com.gxut.demo.file.pdf.PdfReader;
import com.gxut.demo.util.LogUtil;

/**
 * Created by Bitliker on 2017/9/21.
 */
public class FileDemo {
    public static void showDemo() {
        PdfReader reader = new PdfReader();
        String content = reader.readerPdf("D:/data/7.女_49歲_CIR2_20年_1500每年.pdf");
        LogUtil.ln(content);
    }
}
