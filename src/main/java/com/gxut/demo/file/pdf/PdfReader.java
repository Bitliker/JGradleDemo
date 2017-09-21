package com.gxut.demo.file.pdf;

import com.gxut.demo.util.LogUtil;
import org.apache.pdfbox.io.RandomAccessBuffer;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class PdfReader {

    public String readerPdf(String filePath) {
        File pdfFile = new File(filePath);
        PDDocument document = null;
        try {
            // 方式一：
            LogUtil.ln(System.currentTimeMillis());
             InputStream input = null;
             input = new FileInputStream( pdfFile );
             //加载 pdf 文档
             PDFParser parser = new PDFParser(new RandomAccessBuffer(input));
             parser.parse();
             document = parser.getPDDocument();
            // 方式二：
//            document = PDDocument.load(pdfFile);
            // 获取页码
            int pages = document.getNumberOfPages();
            // 读文本内容
            PDFTextStripper stripper = new PDFTextStripper();
            // 设置按顺序输出
            stripper.setSortByPosition(true);
            stripper.setStartPage(1);
            stripper.setEndPage(pages);
            String content = stripper.getText(document);
            LogUtil.ln(System.currentTimeMillis());
            return content;
        } catch (Exception e) {
            System.out.println(e);
            return e.getMessage();
        }

    }

}